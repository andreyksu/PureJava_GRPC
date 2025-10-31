package ru.annikonenkov;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import ru.annikonenkov.myauth.MyAuthServGrpc;
import ru.annikonenkov.myauth.MyLoginRequest;
import ru.annikonenkov.myauth.MyLoginResponse;
import ru.annikonenkov.myconversation.MyGreeterServGrpc;
import ru.annikonenkov.myconversation.MyHelloRequest;
import ru.annikonenkov.myconversation.MyHelloResponse;


public class Client {
    public static void main(String[] args) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();

        // Создаём заглушки-stub для клиентской стороны.
        MyAuthServGrpc.MyAuthServBlockingStub myAuthStub = MyAuthServGrpc.newBlockingStub(channel);
        MyGreeterServGrpc.MyGreeterServBlockingStub greeterStub = MyGreeterServGrpc.newBlockingStub(channel);

        // Со стороны клиента методы выглядят как обычные методы. Не как на стороне сервера через MethodDescriptor
        // 1. First authenticate
        MyLoginResponse authResponse = myAuthStub.myLogin(MyLoginRequest.newBuilder().setMyusername("user").setMypassword("pass").build());

        // 2. Then call Greeter with auth token
        MyHelloResponse helloResponse = greeterStub.mySayHello(MyHelloRequest.newBuilder().setMyname("Alice").setMyauth(authResponse).build());

        System.out.println(helloResponse.getMymessage());
        channel.shutdown();
    }
}