package p000;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1005 implements InterfaceC2713 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2476 f3665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Deflater f3666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public boolean f3667;

    public C1005(C0504 c0504, Deflater deflater) {
        this.f3665 = new C2476(c0504);
        this.f3666 = deflater;
    }

    @Override // p000.InterfaceC2713, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f3666;
        if (this.f3667) {
            return;
        }
        deflater.finish();
        m2576(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (false) {
                th = th;
            }
        }
        try {
            this.f3665.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3667 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC2713, java.io.Flushable
    public final void flush() throws IOException {
        m2576(true);
        this.f3665.flush();
    }

    @Override // p000.InterfaceC2713
    public final C3400 timeout() {
        return this.f3665.f7910.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f3665 + ')';
    }

    @Override // p000.InterfaceC2713
    public final void write(C0504 c0504, long j) throws IOException {
        AbstractC0968.m2469(c0504.f2172, 0L, j);
        while (j > 0) {
            C2646 c2646 = c0504.f2171;
            int iMin = (int) Math.min(j, c2646.f8541 - c2646.f8540);
            this.f3666.setInput(c2646.f8539, c2646.f8540, iMin);
            m2576(false);
            long j2 = iMin;
            c0504.f2172 -= j2;
            int i = c2646.f8540 + iMin;
            c2646.f8540 = i;
            if (i == c2646.f8541) {
                c0504.f2171 = c2646.m4645();
                AbstractC2648.m4649(c2646);
            }
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2576(boolean z) throws IOException {
        C2646 c2646M1794;
        int iDeflate;
        C2476 c2476 = this.f3665;
        C0504 c0504 = c2476.f7911;
        while (true) {
            c2646M1794 = c0504.m1794(1);
            byte[] bArr = c2646M1794.f8539;
            Deflater deflater = this.f3666;
            if (z) {
                try {
                    int i = c2646M1794.f8541;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = c2646M1794.f8541;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c2646M1794.f8541 += iDeflate;
                c0504.f2172 += (long) iDeflate;
                c2476.mo1770();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c2646M1794.f8540 == c2646M1794.f8541) {
            c0504.f2171 = c2646M1794.m4645();
            AbstractC2648.m4649(c2646M1794);
        }
    }
}
