package ru.annikonenkov.myconversation;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 * Сервис с разными типами методов
 * </pre>
 */
@javax.annotation.Generated(value = "by gRPC proto compiler (version 1.58.0)", comments = "Source: fullproto.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ExampleServiceGrpc {

  private ExampleServiceGrpc() {
  }

  public static final java.lang.String SERVICE_NAME = "com.example.grpc.ExampleService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnarySyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnarySync",
      requestType = ru.annikonenkov.myconversation.Request.class,
      responseType = ru.annikonenkov.myconversation.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY
  )
  public static io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnarySyncMethod() {
    io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnarySyncMethod;
    if ((getUnarySyncMethod = ExampleServiceGrpc.getUnarySyncMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getUnarySyncMethod = ExampleServiceGrpc.getUnarySyncMethod) == null) {
          ExampleServiceGrpc.getUnarySyncMethod = getUnarySyncMethod = io.grpc.MethodDescriptor.<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnarySync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("UnarySync")).build();
        }
      }
    }
    return getUnarySyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnaryAsyncMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UnaryAsync",
      requestType = ru.annikonenkov.myconversation.Request.class,
      responseType = ru.annikonenkov.myconversation.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY
  )
  public static io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnaryAsyncMethod() {
    io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response> getUnaryAsyncMethod;
    if ((getUnaryAsyncMethod = ExampleServiceGrpc.getUnaryAsyncMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getUnaryAsyncMethod = ExampleServiceGrpc.getUnaryAsyncMethod) == null) {
          ExampleServiceGrpc.getUnaryAsyncMethod = getUnaryAsyncMethod = io.grpc.MethodDescriptor.<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UnaryAsync"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("UnaryAsync"))
              .build();
        }
      }
    }
    return getUnaryAsyncMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.StreamResponse> getServerStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ServerStreaming",
      requestType = ru.annikonenkov.myconversation.Request.class,
      responseType = ru.annikonenkov.myconversation.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING
  )
  public static io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.StreamResponse> getServerStreamingMethod() {
    io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.StreamResponse> getServerStreamingMethod;
    if ((getServerStreamingMethod = ExampleServiceGrpc.getServerStreamingMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getServerStreamingMethod = ExampleServiceGrpc.getServerStreamingMethod) == null) {
          ExampleServiceGrpc.getServerStreamingMethod = getServerStreamingMethod = io.grpc.MethodDescriptor.<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ServerStreaming"))
              .setSampledToLocalTracing(true).setRequestMarshaller(
                  io.grpc.protobuf.ProtoUtils.marshaller(
                      ru.annikonenkov.myconversation.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  ru.annikonenkov.myconversation.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("ServerStreaming"))
              .build();
        }
      }
    }
    return getServerStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.Response> getClientStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ClientStreaming",
      requestType = ru.annikonenkov.myconversation.StreamRequest.class,
      responseType = ru.annikonenkov.myconversation.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING
  )
  public static io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.Response> getClientStreamingMethod() {
    io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.Response> getClientStreamingMethod;
    if ((getClientStreamingMethod = ExampleServiceGrpc.getClientStreamingMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getClientStreamingMethod = ExampleServiceGrpc.getClientStreamingMethod) == null) {
          ExampleServiceGrpc.getClientStreamingMethod = getClientStreamingMethod = io.grpc.MethodDescriptor.<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.CLIENT_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ClientStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("ClientStreaming"))
              .build();
        }
      }
    }
    return getClientStreamingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.StreamResponse> getBidirectionalStreamingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "BidirectionalStreaming",
      requestType = ru.annikonenkov.myconversation.StreamRequest.class,
      responseType = ru.annikonenkov.myconversation.StreamResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING
  )
  public static io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.StreamResponse> getBidirectionalStreamingMethod() {
    io.grpc.MethodDescriptor<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.StreamResponse> getBidirectionalStreamingMethod;
    if ((getBidirectionalStreamingMethod = ExampleServiceGrpc.getBidirectionalStreamingMethod) == null) {
      synchronized (ExampleServiceGrpc.class) {
        if ((getBidirectionalStreamingMethod = ExampleServiceGrpc.getBidirectionalStreamingMethod) == null) {
          ExampleServiceGrpc.getBidirectionalStreamingMethod = getBidirectionalStreamingMethod = io.grpc.MethodDescriptor.<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.StreamResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "BidirectionalStreaming"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.StreamRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(ru.annikonenkov.myconversation.StreamResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ExampleServiceMethodDescriptorSupplier("BidirectionalStreaming")).build();
        }
      }
    }
    return getBidirectionalStreamingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ExampleServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceStub>() {
      @java.lang.Override
      public ExampleServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new ExampleServiceStub(channel, callOptions);
      }
    };
    return ExampleServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the
   * service
   */
  public static ExampleServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceBlockingStub>() {
      @java.lang.Override
      public ExampleServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new ExampleServiceBlockingStub(channel, callOptions);
      }
    };
    return ExampleServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ExampleServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ExampleServiceFutureStub> factory = new io.grpc.stub.AbstractStub.StubFactory<ExampleServiceFutureStub>() {
      @java.lang.Override
      public ExampleServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
        return new ExampleServiceFutureStub(channel, callOptions);
      }
    };
    return ExampleServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * Сервис с разными типами методов
   * </pre>
   */
  public interface AsyncService {

    /**
     * <pre>
     * Унарный синхронный метод (один запрос - один ответ)
     * </pre>
     */
    default void unarySync(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnarySyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Унарный асинхронный метод
     * </pre>
     */
    default void unaryAsync(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUnaryAsyncMethod(), responseObserver);
    }

    /**
     * <pre>
     * Серверный стриминг (один запрос - много ответов)
     * </pre>
     */
    default void serverStreaming(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getServerStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Клиентский стриминг (много запросов - один ответ)
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamRequest> clientStreaming(
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getClientStreamingMethod(), responseObserver);
    }

    /**
     * <pre>
     * Двунаправленный стриминг (много запросов - много ответов)
     * </pre>
     */
    default io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamRequest> bidirectionalStreaming(
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getBidirectionalStreamingMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ExampleService.
   * <pre>
   * Сервис с разными типами методов
   * </pre>
   */
  public static abstract class ExampleServiceImplBase implements io.grpc.BindableService, AsyncService {

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return ExampleServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ExampleService.
   * <pre>
   * Сервис с разными типами методов
   * </pre>
   */
  public static final class ExampleServiceStub extends io.grpc.stub.AbstractAsyncStub<ExampleServiceStub> {

    private ExampleServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ExampleServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Унарный синхронный метод (один запрос - один ответ)
     * </pre>
     */
    public void unarySync(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnarySyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Унарный асинхронный метод
     * </pre>
     */
    public void unaryAsync(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUnaryAsyncMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Серверный стриминг (один запрос - много ответов)
     * </pre>
     */
    public void serverStreaming(ru.annikonenkov.myconversation.Request request,
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getServerStreamingMethod(), getCallOptions()), request,
          responseObserver);
    }

    /**
     * <pre>
     * Клиентский стриминг (много запросов - один ответ)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamRequest> clientStreaming(
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncClientStreamingCall(
          getChannel().newCall(getClientStreamingMethod(), getCallOptions()), responseObserver);
    }

    /**
     * <pre>
     * Двунаправленный стриминг (много запросов - много ответов)
     * </pre>
     */
    public io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamRequest> bidirectionalStreaming(
        io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getBidirectionalStreamingMethod(), getCallOptions()),
          responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ExampleService.
   * <pre>
   * Сервис с разными типами методов
   * </pre>
   */
  public static final class ExampleServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ExampleServiceBlockingStub> {

    private ExampleServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExampleServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Унарный синхронный метод (один запрос - один ответ)
     * </pre>
     */
    public ru.annikonenkov.myconversation.Response unarySync(
        ru.annikonenkov.myconversation.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUnarySyncMethod(),
          getCallOptions(), request);
    }

    /**
     * <pre>
     * Унарный асинхронный метод
     * </pre>
     */
    public ru.annikonenkov.myconversation.Response unaryAsync(
        ru.annikonenkov.myconversation.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(getChannel(), getUnaryAsyncMethod(),
          getCallOptions(), request);
    }

    /**
     * <pre>
     * Серверный стриминг (один запрос - много ответов)
     * </pre>
     */
    public java.util.Iterator<ru.annikonenkov.myconversation.StreamResponse> serverStreaming(
        ru.annikonenkov.myconversation.Request request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(getChannel(),
          getServerStreamingMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ExampleService.
   * <pre>
   * Сервис с разными типами методов
   * </pre>
   */
  public static final class ExampleServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ExampleServiceFutureStub> {

    private ExampleServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ExampleServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ExampleServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Унарный синхронный метод (один запрос - один ответ)
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.annikonenkov.myconversation.Response> unarySync(ru.annikonenkov.myconversation.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUnarySyncMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Унарный асинхронный метод
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<ru.annikonenkov.myconversation.Response> unaryAsync(ru.annikonenkov.myconversation.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(getChannel().newCall(getUnaryAsyncMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_UNARY_SYNC = 0;
  private static final int METHODID_UNARY_ASYNC = 1;
  private static final int METHODID_SERVER_STREAMING = 2;
  private static final int METHODID_CLIENT_STREAMING = 3;
  private static final int METHODID_BIDIRECTIONAL_STREAMING = 4;

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

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_UNARY_SYNC:
          serviceImpl.unarySync(
              (ru.annikonenkov.myconversation.Request) request,
              (io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response>) responseObserver
          );
          break;
        case METHODID_UNARY_ASYNC:
          serviceImpl.unaryAsync(
              (ru.annikonenkov.myconversation.Request) request,
              (io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response>) responseObserver
          );
          break;
        case METHODID_SERVER_STREAMING:
          serviceImpl.serverStreaming(
              (ru.annikonenkov.myconversation.Request) request,
              (io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse>) responseObserver
          );
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CLIENT_STREAMING:
          return (
              io.grpc.stub.StreamObserver<Req>) serviceImpl.clientStreaming((io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.Response>) responseObserver
          );
        case METHODID_BIDIRECTIONAL_STREAMING:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.bidirectionalStreaming((io.grpc.stub.StreamObserver<ru.annikonenkov.myconversation.StreamResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(getUnarySyncMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response>(service, METHODID_UNARY_SYNC)))
        .addMethod(getUnaryAsyncMethod(), io.grpc.stub.ServerCalls.asyncUnaryCall(new MethodHandlers<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.Response>(service, METHODID_UNARY_ASYNC)))
        .addMethod(getServerStreamingMethod(), io.grpc.stub.ServerCalls.asyncServerStreamingCall(new MethodHandlers<ru.annikonenkov.myconversation.Request, ru.annikonenkov.myconversation.StreamResponse>(service, METHODID_SERVER_STREAMING)))
        .addMethod(getClientStreamingMethod(), io.grpc.stub.ServerCalls.asyncClientStreamingCall(new MethodHandlers<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.Response>(service, METHODID_CLIENT_STREAMING)))
        .addMethod(getBidirectionalStreamingMethod(), io.grpc.stub.ServerCalls.asyncBidiStreamingCall(new MethodHandlers<ru.annikonenkov.myconversation.StreamRequest, ru.annikonenkov.myconversation.StreamResponse>(service, METHODID_BIDIRECTIONAL_STREAMING)))
        .build();
  }

  private static abstract class ExampleServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {

    ExampleServiceBaseDescriptorSupplier() {
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return ru.annikonenkov.myconversation.ExampleProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ExampleService");
    }
  }

  private static final class ExampleServiceFileDescriptorSupplier extends ExampleServiceBaseDescriptorSupplier {

    ExampleServiceFileDescriptorSupplier() {
    }
  }

  private static final class ExampleServiceMethodDescriptorSupplier extends ExampleServiceBaseDescriptorSupplier implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {

    private final java.lang.String methodName;

    ExampleServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ExampleServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ExampleServiceFileDescriptorSupplier())
              .addMethod(getUnarySyncMethod()).addMethod(getUnaryAsyncMethod())
              .addMethod(getServerStreamingMethod()).addMethod(getClientStreamingMethod())
              .addMethod(getBidirectionalStreamingMethod()).build();
        }
      }
    }
    return result;
  }
}
