package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᤞᛸᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1398 implements InterfaceC2846 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f5037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC0485 f5038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final /* synthetic */ C1397 f5039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final /* synthetic */ C2530 f5040;

    public C1398(InterfaceC0485 interfaceC0485, C1397 c1397, C2530 c2530) {
        this.f5038 = interfaceC0485;
        this.f5039 = c1397;
        this.f5040 = c2530;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f5037 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f5037 = true;
            this.f5039.abort();
        }
        this.f5038.close();
    }

    @Override // p000.InterfaceC2846
    public final long read(C0481 c0481, long j) throws IOException {
        try {
            long j2 = this.f5038.read(c0481, j);
            C2530 c2530 = this.f5040;
            if (j2 == -1) {
                if (!this.f5037) {
                    this.f5037 = true;
                    c2530.close();
                }
                return -1L;
            }
            c0481.m1862(c0481.f2128 - j2, c2530.f8062, j2);
            c2530.mo1864();
            return j2;
        } catch (IOException e) {
            if (this.f5037) {
                throw e;
            }
            this.f5037 = true;
            this.f5039.abort();
            throw e;
        }
    }

    @Override // p000.InterfaceC2846
    public final C3459 timeout() {
        return this.f5038.timeout();
    }
}
