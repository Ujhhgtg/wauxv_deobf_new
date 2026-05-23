package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p000.AbstractC0981;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventListener {
    public static final Companion Companion = new Companion(null);
    public static final EventListener NONE = new EventListener() { // from class: okhttp3.EventListener$Companion$NONE$1
    };

    /* JADX INFO: compiled from: obf */
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC0981 abstractC0981) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: obf */
    public interface Factory {
        EventListener create(Call call);
    }

    public void cacheMiss(Call call) {
    }

    public void callEnd(Call call) {
    }

    public void callStart(Call call) {
    }

    public void canceled(Call call) {
    }

    public void requestBodyStart(Call call) {
    }

    public void requestHeadersStart(Call call) {
    }

    public void responseBodyStart(Call call) {
    }

    public void responseHeadersStart(Call call) {
    }

    public void secureConnectStart(Call call) {
    }

    public void cacheConditionalHit(Call call, Response response) {
    }

    public void cacheHit(Call call, Response response) {
    }

    public void callFailed(Call call, IOException iOException) {
    }

    public void connectionAcquired(Call call, Connection connection) {
    }

    public void connectionReleased(Call call, Connection connection) {
    }

    public void dnsStart(Call call, String str) {
    }

    public void proxySelectStart(Call call, HttpUrl httpUrl) {
    }

    public void requestBodyEnd(Call call, long j) {
    }

    public void requestFailed(Call call, IOException iOException) {
    }

    public void requestHeadersEnd(Call call, Request request) {
    }

    public void responseBodyEnd(Call call, long j) {
    }

    public void responseFailed(Call call, IOException iOException) {
    }

    public void responseHeadersEnd(Call call, Response response) {
    }

    public void satisfactionFailure(Call call, Response response) {
    }

    public void secureConnectEnd(Call call, Handshake handshake) {
    }

    public void connectStart(Call call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void dnsEnd(Call call, String str, List<InetAddress> list) {
    }

    public void proxySelectEnd(Call call, HttpUrl httpUrl, List<Proxy> list) {
    }

    public void connectEnd(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol) {
    }

    public void connectFailed(Call call, InetSocketAddress inetSocketAddress, Proxy proxy, Protocol protocol, IOException iOException) {
    }
}
