package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import p000.AbstractC2207;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Route {
    private final Address address;
    private final Proxy proxy;
    private final InetSocketAddress socketAddress;

    public Route(Address address, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = inetSocketAddress;
    }

    public final Address m896deprecated_address() {
        return this.address;
    }

    public final Proxy m897deprecated_proxy() {
        return this.proxy;
    }

    public final InetSocketAddress m898deprecated_socketAddress() {
        return this.socketAddress;
    }

    public final Address address() {
        return this.address;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Route)) {
            return false;
        }
        Route route = (Route) obj;
        return AbstractC2207.m4087(route.address, this.address) && AbstractC2207.m4087(route.proxy, this.proxy) && AbstractC2207.m4087(route.socketAddress, this.socketAddress);
    }

    public int hashCode() {
        return this.socketAddress.hashCode() + ((this.proxy.hashCode() + ((this.address.hashCode() + 527) * 31)) * 31);
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final boolean requiresTunnel() {
        return this.address.sslSocketFactory() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress socketAddress() {
        return this.socketAddress;
    }

    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
