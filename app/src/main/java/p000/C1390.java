package p000;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1390 implements InterfaceC2786 {

    public boolean f5008;

    public final /* synthetic */ InterfaceC0508 f5009;

    public final /* synthetic */ C1389 f5010;

    public final /* synthetic */ C2476 f5011;

    public C1390(InterfaceC0508 interfaceC0508, C1389 c1389, C2476 c2476) {
        this.f5009 = interfaceC0508;
        this.f5010 = c1389;
        this.f5011 = c2476;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (!this.f5008 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.f5008 = true;
            this.f5010.abort();
        }
        this.f5009.close();
    }

    @Override // p000.InterfaceC2786
    public final long read(C0504 c0504, long j) throws IOException {
        try {
            long j2 = this.f5009.read(c0504, j);
            C2476 c2476 = this.f5011;
            if (j2 == -1) {
                if (!this.f5008) {
                    this.f5008 = true;
                    c2476.close();
                }
                return -1L;
            }
            c0504.m1768(c0504.f2172 - j2, c2476.f7911, j2);
            c2476.mo1770();
            return j2;
        } catch (IOException e) {
            if (this.f5008) {
                throw e;
            }
            this.f5008 = true;
            this.f5010.abort();
            throw e;
        }
    }

    @Override // p000.InterfaceC2786
    public final C3400 timeout() {
        return this.f5009.timeout();
    }
}
