package p000;

import java.io.IOException;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.DiskLruCache;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᛸᲇᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1397 implements CacheRequest {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final DiskLruCache.Editor f5032;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final InterfaceC2774 f5033;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1396 f5034;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f5035;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1399 f5036;

    public C1397(C1399 c1399, DiskLruCache.Editor editor) {
        this.f5036 = c1399;
        this.f5032 = editor;
        InterfaceC2774 interfaceC2774NewSink = editor.newSink(1);
        this.f5033 = interfaceC2774NewSink;
        this.f5034 = new C1396(c1399, this, interfaceC2774NewSink);
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final void abort() {
        synchronized (this.f5036) {
            if (this.f5035) {
                return;
            }
            this.f5035 = true;
            Util.closeQuietly(this.f5033);
            try {
                this.f5032.abort();
            } catch (IOException unused) {
            }
        }
    }

    @Override // okhttp3.internal.cache.CacheRequest
    public final InterfaceC2774 body() {
        return this.f5034;
    }
}
