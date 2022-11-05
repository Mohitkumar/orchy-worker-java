package com.orchy.client;

import com.orchy.api.v1.GetServersRequest;
import com.orchy.api.v1.GetServersResponse;
import com.orchy.api.v1.Server;
import com.orchy.api.v1.TaskServiceGrpc;
import io.grpc.*;

import javax.annotation.Nullable;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

public class CustomNameResolverFactory extends NameResolver.Factory {

    List<EquivalentAddressGroup> addresses = new ArrayList<>();

    public CustomNameResolverFactory(String host, int port) {
        ManagedChannel managedChannel = ManagedChannelBuilder
                .forAddress(host, port)
                .usePlaintext().build();
        GetServersRequest request  = GetServersRequest.newBuilder().build();
        GetServersResponse servers = TaskServiceGrpc.newBlockingStub(managedChannel).getServers(request);
        List<Server> serversList = servers.getServersList();
        for (Server server : serversList) {
            String rpcAddr = server.getRpcAddr();
            String[] split = rpcAddr.split(":");
            String hostName = split[0];
            int portN = Integer.parseInt(split[1]);
            addresses.add(new EquivalentAddressGroup(new InetSocketAddress(hostName, portN)));
        }
    }

    @Nullable
    @Override
    public NameResolver newNameResolver(URI uri, Attributes attributes) {
        return new NameResolver() {
            @Override
            public String getServiceAuthority() {
                return "fakeAuthority";
            }

            @Override
            public void start(Listener listener) {
                listener.onAddresses(addresses, Attributes.EMPTY);
            }

            public void shutdown() {
            }
        };
    }

    @Override
    public String getDefaultScheme() {
        return "orchy";
    }
}
