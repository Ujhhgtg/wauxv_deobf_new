package p000;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲁᲇᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2189 extends ResponseBody {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ResponseBody f7235;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f7236;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2182 f7237;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2933 f7238;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2933 f7239;

    public C2189(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, C2182 c2182) {
        this.f7235 = responseBody;
        this.f7236 = concurrentLinkedQueue;
        this.f7237 = c2182;
        SystemClock.elapsedRealtime();
        this.f7238 = new C2933(new C2187(this, 0));
        this.f7239 = new C2933(new C2187(this, 1));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return ((Number) this.f7239.getValue()).longValue();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f7235.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0485 source() {
        return (InterfaceC0485) this.f7238.getValue();
    }
}
