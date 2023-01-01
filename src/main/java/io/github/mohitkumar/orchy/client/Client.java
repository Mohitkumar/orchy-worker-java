package io.github.mohitkumar.orchy.client;

import io.github.mohitkumar.orchy.api.v1.ActionServiceGrpc;
import io.grpc.*;

public class Client {

    private ActionServiceGrpc.ActionServiceBlockingStub stub;

    private ActionServiceGrpc.ActionServiceFutureStub asyncStub;

    public Client(String host, int port) {
        NameResolver.Factory factory = new CustomNameResolverFactory(host,port);
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forTarget("orchy").defaultLoadBalancingPolicy("round_robin")
                .nameResolverFactory(factory)
                .usePlaintext().build();
        stub = ActionServiceGrpc.newBlockingStub(managedChannel).withWaitForReady();
        asyncStub = ActionServiceGrpc.newFutureStub(managedChannel).withWaitForReady();
    }

    public ActionServiceGrpc.ActionServiceBlockingStub getClient(){
        return stub;
    }

    public ActionServiceGrpc.ActionServiceFutureStub getAsyncClient(){
        return asyncStub;
    }
}
