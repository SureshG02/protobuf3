package com.digia.grpc.server;


import com.digia.grpc.HelloRequest;
import com.digia.grpc.HelloResponse;
import com.digia.grpc.HelloServiceGrpc.HelloServiceImplBase;

import io.grpc.stub.StreamObserver;

public class HelloServiceImpl extends HelloServiceImplBase {

    @Override
    public void hello(
      HelloRequest request, StreamObserver<HelloResponse> responseObserver) {
        System.out.println("Request received from client:\n" + request);

        String greeting = new StringBuilder().append("Hello, ")
            .append(request.getFirstName())
            .append(" ")
            .append(request.getLastName())
            .toString();

        HelloResponse response = HelloResponse.newBuilder()
            .setGreeting(greeting)
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
