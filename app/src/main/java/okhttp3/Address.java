package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.HttpUrl;
import okhttp3.internal.Util;
import p000.AbstractC1194;
import p000.AbstractC2207;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class Address {
    private final CertificatePinner certificatePinner;
    private final List<ConnectionSpec> connectionSpecs;
    private final Dns dns;
    private final HostnameVerifier hostnameVerifier;
    private final List<Protocol> protocols;
    private final Proxy proxy;
    private final Authenticator proxyAuthenticator;
    private final ProxySelector proxySelector;
    private final SocketFactory socketFactory;
    private final SSLSocketFactory sslSocketFactory;
    private final HttpUrl url;

    public Address(String str, int i, Dns dns, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, CertificatePinner certificatePinner, Authenticator authenticator, Proxy proxy, List<? extends Protocol> list, List<ConnectionSpec> list2, ProxySelector proxySelector) {
        this.dns = dns;
        this.socketFactory = socketFactory;
        this.sslSocketFactory = sSLSocketFactory;
        this.hostnameVerifier = hostnameVerifier;
        this.certificatePinner = certificatePinner;
        this.proxyAuthenticator = authenticator;
        this.proxy = proxy;
        this.proxySelector = proxySelector;
        this.url = new HttpUrl.Builder().scheme(sSLSocketFactory != null ? "https" : "http").host(str).port(i).build();
        this.protocols = Util.toImmutableList(list);
        this.connectionSpecs = Util.toImmutableList(list2);
    }

    public final CertificatePinner m766deprecated_certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> m767deprecated_connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns m768deprecated_dns() {
        return this.dns;
    }

    public final HostnameVerifier m769deprecated_hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> m770deprecated_protocols() {
        return this.protocols;
    }

    public final Proxy m771deprecated_proxy() {
        return this.proxy;
    }

    public final Authenticator m772deprecated_proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector m773deprecated_proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory m774deprecated_socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory m775deprecated_sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public final HttpUrl m776deprecated_url() {
        return this.url;
    }

    public final CertificatePinner certificatePinner() {
        return this.certificatePinner;
    }

    public final List<ConnectionSpec> connectionSpecs() {
        return this.connectionSpecs;
    }

    public final Dns dns() {
        return this.dns;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return AbstractC2207.m4087(this.url, address.url) && equalsNonHost$okhttp(address);
    }

    public final boolean equalsNonHost$okhttp(Address address) {
        return AbstractC2207.m4087(this.dns, address.dns) && AbstractC2207.m4087(this.proxyAuthenticator, address.proxyAuthenticator) && AbstractC2207.m4087(this.protocols, address.protocols) && AbstractC2207.m4087(this.connectionSpecs, address.connectionSpecs) && AbstractC2207.m4087(this.proxySelector, address.proxySelector) && AbstractC2207.m4087(this.proxy, address.proxy) && AbstractC2207.m4087(this.sslSocketFactory, address.sslSocketFactory) && AbstractC2207.m4087(this.hostnameVerifier, address.hostnameVerifier) && AbstractC2207.m4087(this.certificatePinner, address.certificatePinner) && this.url.port() == address.url.port();
    }

    public int hashCode() {
        return Objects.hashCode(this.certificatePinner) + ((Objects.hashCode(this.hostnameVerifier) + ((Objects.hashCode(this.sslSocketFactory) + ((Objects.hashCode(this.proxy) + ((this.proxySelector.hashCode() + ((this.connectionSpecs.hashCode() + ((this.protocols.hashCode() + ((this.proxyAuthenticator.hashCode() + ((this.dns.hashCode() + ((this.url.hashCode() + 527) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final HostnameVerifier hostnameVerifier() {
        return this.hostnameVerifier;
    }

    public final List<Protocol> protocols() {
        return this.protocols;
    }

    public final Proxy proxy() {
        return this.proxy;
    }

    public final Authenticator proxyAuthenticator() {
        return this.proxyAuthenticator;
    }

    public final ProxySelector proxySelector() {
        return this.proxySelector;
    }

    public final SocketFactory socketFactory() {
        return this.socketFactory;
    }

    public final SSLSocketFactory sslSocketFactory() {
        return this.sslSocketFactory;
    }

    public String toString() {
        StringBuilder sb;
        Object obj;
        StringBuilder sb2 = new StringBuilder("Address{");
        sb2.append(this.url.host());
        sb2.append(':');
        sb2.append(this.url.port());
        sb2.append(", ");
        if (this.proxy != null) {
            sb = new StringBuilder("proxy=");
            obj = this.proxy;
        } else {
            sb = new StringBuilder("proxySelector=");
            obj = this.proxySelector;
        }
        sb.append(obj);
        return AbstractC1194.m2786(sb2, sb.toString(), '}');
    }

    public final HttpUrl url() {
        return this.url;
    }
}
