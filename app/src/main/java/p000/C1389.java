package p000;

import java.io.IOException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲁᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1389 implements CacheRequest {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final DiskLruCache.Editor f5003;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2713 f5004;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1388 f5005;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1391 f5007;

    public C1389(C1391 c1391, DiskLruCache.Editor editor) {
        this.f5007 = c1391;
        this.f5003 = editor;
        InterfaceC2713 interfaceC2713NewSink = editor.newSink(1);
        this.f5004 = interfaceC2713NewSink;
        this.f5005 = new C1388(c1391, this, interfaceC2713NewSink);
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        synchronized (this.f5007) {
            if (this.f5006) {
                return;
            }
            this.f5006 = true;
            Util.closeQuietly(this.f5004);
            try {
                this.f5003.abort();
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final InterfaceC2713 body() {
        return this.f5005;
    }
}
