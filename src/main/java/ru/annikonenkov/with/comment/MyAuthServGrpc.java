package ru.annikonenkov.with.comment;

import static io.grpc.MethodDescriptor.generateFullMethodName;

import ru.annikonenkov.myauth.MyAuthProto;
import ru.annikonenkov.myauth.MyLoginRequest;
import ru.annikonenkov.myauth.MyLoginResponse;

/**
 * С частичными комментариями и форматингом кода для удобства чтения.
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.58.0)",
    comments = "Source: myauth.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MyAuthServGrpc {

  private MyAuthServGrpc() {
  }

  public static final String SERVICE_NAME = "myauth.MyAuthServ";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<MyLoginRequest, MyLoginResponse> getMyLoginMethod;

  /**
   * Возвращает MethodDescriptor
   */
  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MyLogin",
      requestType = MyLoginRequest.class,
      responseType = MyLoginResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<MyLoginRequest, MyLoginResponse> getMyLoginMethod() { //---4--- //Еще раз сюда ---6---
    io.grpc.MethodDescriptor<MyLoginRequest, MyLoginResponse> getMyLoginMethod;
    if ((getMyLoginMethod = MyAuthServGrpc.getMyLoginMethod) == null) { // Интересно сделан двойной if. До sync и после sync
      synchronized (MyAuthServGrpc.class) {
        if ((getMyLoginMethod = MyAuthServGrpc.getMyLoginMethod) == null) {
          MyAuthServGrpc.getMyLoginMethod = getMyLoginMethod = io.grpc.MethodDescriptor.<MyLoginRequest, MyLoginResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MyLogin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(MyLoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(MyLoginResponse.getDefaultInstance()))
              .setSchemaDescriptor(new MyAuthServMethodDescriptorSupplier("MyLogin")) // Здесь внутри получение getServiceDescriptor().findMethodByName(methodName);
              .build();
        }
      }
    }
    return getMyLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getMySomeMethMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "MySomeMeth",
      requestType = com.google.protobuf.Empty.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getMySomeMethMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, com.google.protobuf.Empty> getMySomeMethMethod;
    if ((getMySomeMethMethod = MyAuthServGrpc.getMySomeMethMethod) == null) {
      synchronized (MyAuthServGrpc.class) {
        if ((getMySomeMethMethod = MyAuthServGrpc.getMySomeMethMethod) == null) {
          MyAuthServGrpc.getMySomeMethMethod = getMySomeMethMethod = io.grpc.MethodDescriptor.<com.google.protobuf.Empty, com.google.protobuf.Empty>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "MySomeMeth"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(com.google.protobuf.Empty.getDefaultInstance()))
              .setSchemaDescriptor(new MyAuthServMethodDescriptorSupplier("MySomeMeth"))
              .build();
        }
      }
    }
    return getMySomeMethMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MyAuthServStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyAuthServStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyAuthServStub>() {
      @Override
      public MyAuthServStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new MyAuthServStub(channel, callOptions);
      }
    };
    return MyAuthServStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the
   * service
   */
  public static MyAuthServBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyAuthServBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyAuthServBlockingStub>() {
      @Override
      public MyAuthServBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new MyAuthServBlockingStub(channel, callOptions);
      }
    };
    return MyAuthServBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MyAuthServFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MyAuthServFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<MyAuthServFutureStub>() {
      @Override
      public MyAuthServFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new MyAuthServFutureStub(channel, callOptions);
      }
    };
    return MyAuthServFutureStub.newStub(factory, channel);
  }

  /**
   * Здесь дефолтная реализация методов сервиса. Этим методы мы переопределяем у себя при наследовании. Эти методы вызываются через invoke()
   */
  public interface AsyncService {

    /**
     *
     */
    default void myLogin(MyLoginRequest request, io.grpc.stub.StreamObserver<MyLoginResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMyLoginMethod(), responseObserver);
    }

    /**
     *
     */
    default void mySomeMeth(com.google.protobuf.Empty request, io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMySomeMethMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service MyAuthServ.
   * !!!!!!!!!!Вот он основной класс, который мы и наследуем.
   */
  public static abstract class MyAuthServImplBase implements io.grpc.BindableService, AsyncService {

    /**
     * !!!!!!!!!!  Этот метод вызывается при .addService(...). С него всё и начинается.
     */
    @Override
    public final io.grpc.ServerServiceDefinition bindService() { //===1=== Вызывается при привязке сервиса к Серверу.
      return MyAuthServGrpc.bindService(this); // this - это наша реализация ...ImplBase
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service MyAuthServ.
   * Первая реализация, Stub
   */
  public static final class MyAuthServStub extends io.grpc.stub.AbstractAsyncStub<MyAuthServStub> {

    private MyAuthServStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyAuthServStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyAuthServStub(channel, callOptions);
    }

    /**
     *
     */
    public void myLogin(MyLoginRequest request, io.grpc.stub.StreamObserver<MyLoginResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMyLoginMethod(), getCallOptions()), request, responseObserver
      );
    }

    /**
     *
     */
    public void mySomeMeth(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMySomeMethMethod(), getCallOptions()), request, responseObserver
      );
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service MyAuthServ.
   * Вторая реализация, Stub - собственно её мы и используем...
   */
  public static final class MyAuthServBlockingStub extends io.grpc.stub.AbstractBlockingStub<MyAuthServBlockingStub> {

    private MyAuthServBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyAuthServBlockingStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyAuthServBlockingStub(channel, callOptions);
    }

    /**
     *
     */
    public MyLoginResponse myLogin(MyLoginRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMyLoginMethod(), getCallOptions(), request
      );
    }

    /**
     *
     */
    public com.google.protobuf.Empty mySomeMeth(com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMySomeMethMethod(), getCallOptions(), request
      );
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service MyAuthServ.
   * Третья реализация, Stub
   */
  public static final class MyAuthServFutureStub extends io.grpc.stub.AbstractFutureStub<MyAuthServFutureStub> {

    private MyAuthServFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @Override
    protected MyAuthServFutureStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MyAuthServFutureStub(channel, callOptions);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<MyLoginResponse> myLogin(
        MyLoginRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMyLoginMethod(), getCallOptions()), request
      );
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty> mySomeMeth(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMySomeMethMethod(), getCallOptions()), request
      );
    }
  }

  private static final int METHODID_MY_LOGIN = 0;
  private static final int METHODID_MY_SOME_METH = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {

    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    /**
     * Этот метод вызывается при вызове серверного метода, который собственно определяет номер метода и вызывает целевую реализацию, т.е. наши методы.
     */
    @Override
    @SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_MY_LOGIN:
          serviceImpl.myLogin((MyLoginRequest) request, (io.grpc.stub.StreamObserver<MyLoginResponse>) responseObserver);
          break;
        case METHODID_MY_SOME_METH:
          serviceImpl.mySomeMeth((com.google.protobuf.Empty) request, (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @Override
    @SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  /**
   * Это метод вызывается при привязке сервиса к серверу. Здесь и формируется связка Описания метода MethodDescriptor и MethodHandlers
   */
  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) { //===2===
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())//===2.1===
        .addMethod(
            getMyLoginMethod(), //===6===
            io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<MyLoginRequest, MyLoginResponse>(service, METHODID_MY_LOGIN))) // Здесь к методу привязываем обработчик. А метод указывается номером в переменной METHODID_MY_LOGIN
        .addMethod(
            getMySomeMethMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<com.google.protobuf.Empty, com.google.protobuf.Empty>(service, METHODID_MY_SOME_METH)))
        .build();
  }

  // -----------------------------------------------------------------------------------------------
  /**
   * Описывает и FileDescriptor и ServiceDescriptor
   */
  private static abstract class MyAuthServBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

    MyAuthServBaseDescriptorSupplier() {}

    @Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {                     //<<<<<<<<<<<<<<<<<<<<<<<
      return MyAuthProto.getDescriptor();
    }

    @Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {               //<<<<<<<<<<<<<<<<<<<<<<<
      return getFileDescriptor().findServiceByName("MyAuthServ");   // com.google.protobuf.Descriptors.ServiceDescriptor — это метаданные схемы из .proto-файла (для интроспекции и генерации кода).
    }
  }

  /**
   * Зачем этот калсс так и не понял.
   */
  private static final class MyAuthServFileDescriptorSupplier extends MyAuthServBaseDescriptorSupplier {

    MyAuthServFileDescriptorSupplier() {
    }
  }

  /**
   * Описывает и ProtoFileDescriptor и ProtoServiceDescriptor и ProtoMethodDescriptor
   */
  private static final class MyAuthServMethodDescriptorSupplier extends MyAuthServBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

    private final String methodName;

    MyAuthServMethodDescriptorSupplier(String methodName) { //---2.0--- Здесь мы возвращаем объект и всё. Т.е. обращения к методу getMethodDescriptor() еще не выполняется.
      this.methodName = methodName;
    }

    @Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {                 //<<<<<<<<<<<<<<<<<<<<<<<
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }
  // -----------------------------------------------------------------------------------------------


  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() { //===3=== // io.grpc.ServiceDescriptor — это выполняемая абстракция gRPC‑сервиса (для диспетчеризации вызовов на сервере).
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (MyAuthServGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new MyAuthServFileDescriptorSupplier())
              .addMethod(getMyLoginMethod()) //===4=== Для этого метода будет создан MyAuthServMethodDescriptorSupplier
              .addMethod(getMySomeMethMethod()) //===5=== И для этого метода будет создан MyAuthServMethodDescriptorSupplier
              .build();
        }
      }
    }
    return result;
  }
}
