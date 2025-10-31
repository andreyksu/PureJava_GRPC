package ru.annikonenkov;

import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;
import ru.annikonenkov.myauth.MyAuthServGrpc;
import ru.annikonenkov.myauth.MyLoginRequest;
import ru.annikonenkov.myauth.MyLoginResponse;
import ru.annikonenkov.myconversation.MyGreeterServGrpc;
import ru.annikonenkov.myconversation.MyHelloRequest;
import ru.annikonenkov.myconversation.MyHelloResponse;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Серверная сторона GRPc. Методы этого сервера вызываются на клиенте. Здесь реализовываются вызываемые методы.
 * GRPC - без Spring
 */
public class Server {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Создаём сервер и добавляем два сервиса.
        io.grpc.Server server = ServerBuilder.forPort(50051).addService(new AuthServiceImpl()).addService(new GreeterServiceImpl()).build().start();

        System.out.println("First"); // Выполнилось мгновенно.
        Runtime.getRuntime().addShutdownHook(new Thread(()->{ // 1 - регистрируем процесс остановки сервера. При остановке текущего потока вызовется этот код.
            System.out.println("Shutting down gRPC server - BEFORE"); // После остановки запуск в IDEA - вывелось это.
            try {
                server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
            }catch (InterruptedException ie){
                System.out.println("The problem for shutting down");
                ie.printStackTrace(System.err);
            }
            System.out.println("Shutting down gRPC server - AFTER"); // Это тоже вывелось.
        }));

        System.out.println("Second"); // Выполнилось мгновенно.
        server.awaitTermination(); // 2 - Здесь блокируемся на ожидании остановки. // 3 - как приходит запрос на остановку текущего потока. Вызывается (1) и как (1) отработает. (2) уже не держит текущий поток и всё заканчивается.
        System.out.println("Third"); // А это вообще не вывелось. Но почему это не выполнится?

    }
    // MyAuthServImplBase - это есть реализация нашего сервиса. Для каждого сервиса генерируется XXXGrpc и внутренний XXXImplBase
    // ImplBase наследует AsyncService - где присутствует дефолтная реализация методов сервиса, которые мы должны переопределить/реализовать.
    // ImplBase наследует BindableService - который позволяет привязать(регистрировать) сервисы к серверу см. addService. Т.е. есть сервер (netty) и к нему мы привязываем сервисы.
    static class AuthServiceImpl extends MyAuthServGrpc.MyAuthServImplBase {// Сервис называется - MyAuthServ. А Grpc и ImplBase - добавляются компилятором Proto.
        @Override // Переопределяем на стороне сервера целевые методы, которые будут вызваны клиентом. У клиента создаются стабы на эти методы.
        public void myLogin(MyLoginRequest req, StreamObserver<MyLoginResponse> responseObserver) {// Это метод объявлен в .proto. Но получение и отправка оба как аргументы.
            new SomeLogic().getTimeStamp(responseObserver);//Выполняем целевую серверную логику.
            responseObserver.onNext(MyLoginResponse.newBuilder().setMytoken("sample-token").setMysuccess(true).build());//Это название полей сообщения LoginResponse но с добавлением set.// Для вызова нескольких onNext поле должно быть в proto c пометкой stream.
            responseObserver.onCompleted(); //Finally, we’ll need to call onCompleted() to specify that we’ve finished dealing with the RPC; otherwise, the connection will be hung, and the client will just wait for more information to come in.
        }
    }

    // Второй сервис.
    // Greeter Service Implementation
    static class GreeterServiceImpl extends MyGreeterServGrpc.MyGreeterServImplBase {
        @Override
        public void mySayHello(MyHelloRequest req, StreamObserver<MyHelloResponse> responseObserver) {
            String authStatus = req.getMyauth().getMysuccess() ? "Authenticated" : "Unauthenticated";
            responseObserver.onNext(MyHelloResponse.newBuilder().setMymessage("Hello " + req.getMyname() + " (" + authStatus + ")").build());
            responseObserver.onCompleted();
        }
    }
}