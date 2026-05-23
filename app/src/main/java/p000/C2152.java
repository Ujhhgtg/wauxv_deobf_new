package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 extends RequestBody {

    public final RequestBody f7104;

    public final ConcurrentLinkedQueue f7105;

    public final C2299 f7106 = new C2299(1);

    public final C2873 f7107 = new C2873(new C2150(0, this));

    public C2152(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f7104 = requestBody;
        this.f7105 = concurrentLinkedQueue;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return ((Number) this.f7107.getValue()).longValue();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f7104.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC0507 interfaceC0507) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        boolean z = interfaceC0507 instanceof C0504;
        RequestBody requestBody = this.f7104;
        if (z || AbstractC2841.m4828(interfaceC0507.toString(), "com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker", false)) {
            requestBody.writeTo(interfaceC0507);
            return;
        }
        C2476 c2476 = new C2476(new C2151(interfaceC0507, this));
        requestBody.writeTo(c2476);
        Util.closeQuietly(c2476);
        if (((Number) this.f7107.getValue()).longValue() != -1 || (concurrentLinkedQueue = this.f7105) == null) {
            return;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f7106.f7411 = true;
            throw null;
        }
    }
}
