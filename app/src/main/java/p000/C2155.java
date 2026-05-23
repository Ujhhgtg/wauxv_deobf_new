package p000;

import android.os.SystemClock;
import java.util.concurrent.ConcurrentLinkedQueue;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᲇᤝᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2155 extends ResponseBody {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ResponseBody f7111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final ConcurrentLinkedQueue f7112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C2148 f7113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2873 f7114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2873 f7115;

    public C2155(ResponseBody responseBody, ConcurrentLinkedQueue concurrentLinkedQueue, C2148 c2148) {
        this.f7111 = responseBody;
        this.f7112 = concurrentLinkedQueue;
        this.f7113 = c2148;
        SystemClock.elapsedRealtime();
        this.f7114 = new C2873(new C2153(this, 0));
        this.f7115 = new C2873(new C2153(this, 1));
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return ((Number) this.f7115.getValue()).longValue();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f7111.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC0508 source() {
        return (InterfaceC0508) this.f7114.getValue();
    }
}
