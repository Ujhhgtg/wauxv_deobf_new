package p000;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲇᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1009 implements InterfaceC2774 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2530 f3681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Deflater f3682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public boolean f3683;

    public C1009(C0481 c0481, Deflater deflater) {
        this.f3681 = new C2530(c0481);
        this.f3682 = deflater;
    }

    @Override // p000.InterfaceC2774, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f3682;
        if (this.f3683) {
            return;
        }
        deflater.finish();
        m2700(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f3681.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f3683 = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC2774, java.io.Flushable
    public final void flush() throws IOException {
        m2700(true);
        this.f3681.flush();
    }

    @Override // p000.InterfaceC2774
    public final C3459 timeout() {
        return this.f3681.f8061.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f3681 + ')';
    }

    @Override // p000.InterfaceC2774
    public final void write(C0481 c0481, long j) throws IOException {
        AbstractC0972.m2590(c0481.f2128, 0L, j);
        while (j > 0) {
            C2707 c2707 = c0481.f2127;
            int iMin = (int) Math.min(j, c2707.f8706 - c2707.f8705);
            this.f3682.setInput(c2707.f8704, c2707.f8705, iMin);
            m2700(false);
            long j2 = iMin;
            c0481.f2128 -= j2;
            int i = c2707.f8705 + iMin;
            c2707.f8705 = i;
            if (i == c2707.f8706) {
                c0481.f2127 = c2707.m4679();
                AbstractC2709.m4683(c2707);
            }
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2700(boolean z) throws IOException {
        C2707 c2707M1888;
        int iDeflate;
        C2530 c2530 = this.f3681;
        C0481 c0481 = c2530.f8062;
        while (true) {
            c2707M1888 = c0481.m1888(1);
            byte[] bArr = c2707M1888.f8704;
            Deflater deflater = this.f3682;
            if (z) {
                try {
                    int i = c2707M1888.f8706;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = c2707M1888.f8706;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c2707M1888.f8706 += iDeflate;
                c0481.f2128 += (long) iDeflate;
                c2530.mo1864();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c2707M1888.f8705 == c2707M1888.f8706) {
            c0481.f2127 = c2707M1888.m4679();
            AbstractC2709.m4683(c2707M1888);
        }
    }
}
