package io.github.mohitkumar.orchy.client;

import io.github.mohitkumar.orchy.api.v1.ActionServiceGrpc;
import io.grpc.*;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Client {

    private ActionServiceGrpc.ActionServiceBlockingStub stub;

    private ActionServiceGrpc.ActionServiceFutureStub asyncStub;

    private  ManagedChannel managedChannel;

    public Client(Set<ServerAddress> addresses) {
        NameResolver.Factory factory = new CustomNameResolverFactory(addresses);

        managedChannel = ManagedChannelBuilder
                .forTarget("orchy").defaultLoadBalancingPolicy("round_robin")
                .nameResolverFactory(factory)
                .usePlaintext().build();
        stub = ActionServiceGrpc.newBlockingStub(managedChannel).withWaitForReady();
        asyncStub = ActionServiceGrpc.newFutureStub(managedChannel).withWaitForReady();
    }

    public synchronized void refresh(Set<ServerAddress> addresses){
        managedChannel.shutdown();
        try {
            if (!managedChannel.awaitTermination(5, TimeUnit.SECONDS)){
                managedChannel.shutdownNow();
            };
        } catch (InterruptedException e) {
            managedChannel.shutdownNow();
        }
        NameResolver.Factory factory = new CustomNameResolverFactory(addresses);
        managedChannel = ManagedChannelBuilder
                .forTarget("orchy").defaultLoadBalancingPolicy("round_robin")
                .nameResolverFactory(factory)
                .usePlaintext().build();
        stub = ActionServiceGrpc.newBlockingStub(managedChannel).withWaitForReady();
        asyncStub = ActionServiceGrpc.newFutureStub(managedChannel).withWaitForReady();
    }

    public synchronized ActionServiceGrpc.ActionServiceBlockingStub getClient(){
        return stub;
    }

    public synchronized ActionServiceGrpc.ActionServiceFutureStub getAsyncClient(){
        return asyncStub;
    }
}
