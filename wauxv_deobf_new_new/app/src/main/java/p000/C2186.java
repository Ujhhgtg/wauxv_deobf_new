package p000;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᤝᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2186 extends RequestBody {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final RequestBody f7228;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f7229;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2332 f7230 = new C2332(1);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2933 f7231 = new C2933(new C2184(this, 0));

    public C2186(RequestBody requestBody, ConcurrentLinkedQueue concurrentLinkedQueue) {
        this.f7228 = requestBody;
        this.f7229 = concurrentLinkedQueue;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return ((Number) this.f7231.getValue()).longValue();
    }

    @Override // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.f7228.contentType();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC0484 interfaceC0484) {
        ConcurrentLinkedQueue concurrentLinkedQueue;
        boolean z = interfaceC0484 instanceof C0481;
        RequestBody requestBody = this.f7228;
        if (z || AbstractC2901.m4861(interfaceC0484.toString(), "com.android.tools.profiler.support.network.HttpTracker$OutputStreamTracker", false)) {
            requestBody.writeTo(interfaceC0484);
            return;
        }
        C2530 c2530 = new C2530(new C2185(interfaceC0484, this));
        requestBody.writeTo(c2530);
        Util.closeQuietly(c2530);
        if (((Number) this.f7231.getValue()).longValue() != -1 || (concurrentLinkedQueue = this.f7229) == null) {
            return;
        }
        Iterator it = concurrentLinkedQueue.iterator();
        if (it.hasNext()) {
            if (it.next() != null) {
                throw new ClassCastException();
            }
            this.f7230.f7533 = true;
            throw null;
        }
    }
}
