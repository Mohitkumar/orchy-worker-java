package io.github.mohitkumar.orchy.client;

import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nullable;
import java.net.InetSocketAddress;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CustomNameResolverFactory extends NameResolver.Factory {

    private Logger LOGGER = LoggerFactory.getLogger(CustomNameResolverFactory.class);

    List<EquivalentAddressGroup> addresses = new ArrayList<>();


    public CustomNameResolverFactory(Set<ServerAddress> servers) {
        this.addresses = servers.stream().map(s -> new InetSocketAddress(s.getHost(), s.getPort()))
                .map(EquivalentAddressGroup::new)
                .collect(Collectors.toList());
    }

    @Nullable
    @Override
    public NameResolver newNameResolver(URI uri, NameResolver.Args args) {

        return new NameResolver() {
            private NameResolver.Listener listener;

            @Override
            public String getServiceAuthority() {
                return "fakeAuthority";
            }

            @Override
            public void start(Listener listener) {
                this.listener = listener;
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
