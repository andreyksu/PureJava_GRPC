package ru.annikonenkov;

import io.grpc.stub.StreamObserver;
import ru.annikonenkov.myauth.MyLoginResponse;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class SomeLogic {
    public Timestamp getTimeStamp(StreamObserver<MyLoginResponse> responseObserver) {
        LocalDateTime currentTime = LocalDateTime.now();
        System.out.println("The server Call === " + currentTime);
        return Timestamp.valueOf(currentTime);
    }
}
