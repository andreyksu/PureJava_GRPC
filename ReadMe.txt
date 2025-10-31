Информация по запуску проекта:
	1. Достаточно собрать mvn clean package (на этом этапе будут созданы .java классы на базе .proto);
	2. Если IDEA - но после сборки, нужно выполнить 'Reload All Maven Projects':
		2.1. После этого уже подтянуться сгенерированные классы;

При ручной генерации. Можно сделать генерацию в целевой каталог (т.е. не target), что позволит работать как с обычным кодом.
//-----------------------------------------------------------

syntax = "proto3";

package com.example.grpc;
option java_package = "com.example.grpc";
option java_multiple_files = true;

service HelloService {
  rpc SayHello (HelloRequest) returns (HelloReply) {}
}

message HelloRequest {
  string name = 1;
}

message HelloReply {
  string message = 1;
}

//-----------------------------------------------------------

При наличии 2х проектов (к примеру: клиент и сервер или два сервера общающиеся между собой) для .proto создаётся отдельный проект в котором происходит генерация .java классов (разумеется генерация уже не в target)
Два этих проекта цепляют к себе проект с .proto со сгенерированными классами и используют этот .proto проект как зависимость.
	Для proto-файла с определением сервиса (например, HelloService) генерируются:
	1. Классы для сообщений (message types):
		HelloRequest.java, HelloReply.java — содержат код для сериализации и работы с данными .protobuf
	2. Класс с gRPC-сервисом (stub classes):
		HelloServiceGrpc.java — главный файл для сервера, содержащий:
			Базовый класс для сервера: HelloServiceGrpc.HelloServiceImplBase — абстрактный класс, который нужно наследовать на сервере
		Stub-классы для клиента:
			HelloServiceBlockingStub — синхронный/блокирующий stub для клиента
			HelloServiceStub — асинхронный stub для клиента
			HelloServiceFutureStub — future-based stub
				Stub — это клиентский proxy-объект, который содержит все методы из вашего proto-сервиса и использует channel для отправки RPC-запросов на сервер.

//-----------------------------------------------------------

HelloServiceGrpc.HelloServiceImplBase — это абстрактный базовый класс, который генерируется из .proto-файла при помощи плагина protoc-gen-grpc-java.
	Каждый сервис из .proto получает такой base-класс, и задача разработчика — унаследовать его и реализовать методы (rpc) с бизнес-логикой приложения.
Класс HelloServiceImplBase — класс принимает сетевые вызовы, делегирует их в методы с реализованной бизнес-логикой в нашем коде.

HelloServiceImplBase реализует BindableService
    BindableService — это интерфейс из пакета io.grpc, который определяет контракт для привязки (binding) реализации сервиса к gRPC-серверу. Это ключевой компонент архитектуры gRPC на Java.
    Этот метод создаёт объект ServerServiceDefinition, который содержит всю информацию о сервисе и его методах, необходимую серверу для обработки входящих RPC-запросов.


ServerServiceDefinition bindService(AsyncService service) - вызывается при привязке сервиса к серверу (см. addService(BindableService bindableService)). Вся магия здесь - bindService.
	1. На первом этапе формируется методом getServiceDescriptor() метаинформация ServiceDescriptor(Метаданные сервиса. Отвечает на вопрос "что может сервис?").
	2. И к метаинформации привязываются логика/реализация и тоже через метод addMethod но уже ServerServiceDefinition (Реализация сервиса. Серверная обработка, интерцепторы. Отвечает на вопрос "как он это делает?".)
			Это разделение позволяет иметь единый контракт (ServiceDescriptor) с разными реализациями (ServerServiceDefinition).
	
	
Итого
	HelloServiceGrpc
		AsyncService - содержит дефолтную реализацию методов, что описаны в сервисе .proto. Эти методы мы собственно и переопределяем при реализации логики.
		HelloServiceImplBase реализует AsyncService и BindableService
			BindableService - отвечает за привязку сервиса к серверу (netty). Имеет один метод bindService() который вызывается при привязке к серверу.
			BindableService — это интерфейс, который позволяет серверу узнать о структуре RPC-методов вашего сервиса через метод bindService(), возвращающий ServerServiceDefinition. Это ключевой механизм регистрации сервисов в gRPC-сервере.
			
		Вся магия происходит как раз при вызове метода XXXServiceGrpc.bindService(this):
		    1. Получаем и формируем описание сервиса getServiceDescriptor()
		    2. Привязываем реализацию этих методов, что описаны в getServiceDescriptor() - реализация через MethodHandlers


MethodDescriptor<ReqT, RespT>
    Назначение: описывает отдельный RPC-метод сервиса — наименьшая единица в иерархии.
        Что он содержит:
            Полное имя метода (fullMethodName):
                например, com.example.grpc.HelloService/SayHello
            Тип вызова (MethodType):
                UNARY, SERVER_STREAMING, CLIENT_STREAMING, BIDI_STREAMING
            Маршаллеры (Marshaller):
                объекты для сериализации/десериализации запросов и ответов
            Метаинформация:
                идемпотентность, безопасность (safe), трассировка (sampled to local tracing)
            Schema descriptor:
                содержит информацию о protobuf-файле для server reflection

ServiceDescriptor
    Назначение: описывает весь сервис целиком — содержит коллекцию MethodDescriptor'ов.
        Что он содержит:
            Имя сервиса (name):
                например, com.example.grpc.HelloService
            Коллекция MethodDescriptor'ов:
                все методы, которые предоставляет этот сервис
            Schema descriptor:
                информация о protobuf-файле для reflection

ServerServiceDefinition
    Назначение: исполняемое определение сервиса для сервера — содержит не только метаинформацию (ServiceDescriptor), но и обработчики методов (ServerCallHandler'ы).
        Что он содержит:
            ServiceDescriptor:
                метаинформация о сервисе
            ServerMethodDefinition'ы:
                связь между MethodDescriptor и обработчиком (handler)
            Фактические функции обработки:
                как обрабатывать входящие RPC-вызовы ServerCallHandler'ы (функции обработки запросов)  