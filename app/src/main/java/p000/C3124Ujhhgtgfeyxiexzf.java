package p000;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱᛴᛳᛲ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3124Ujhhgtgfeyxiexzf implements InterfaceC1026feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0806feyxiexzfUjhhgtg f9708Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Deflater f9709Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public boolean f9710Ujhhgtgfeyxiexzf;

    public C3124Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, Deflater deflater) {
        this.f9708Ujhhgtgfeyxiexzf = new C0806feyxiexzfUjhhgtg(c2598feyxiexzfUjhhgtg);
        this.f9709Ujhhgtgfeyxiexzf = deflater;
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        Deflater deflater = this.f9709Ujhhgtgfeyxiexzf;
        if (this.f9710Ujhhgtgfeyxiexzf) {
            return;
        }
        deflater.finish();
        m4651Ujhhgtgfeyxiexzf(false);
        th = null;
        try {
            deflater.end();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        try {
            this.f9708Ujhhgtgfeyxiexzf.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.f9710Ujhhgtgfeyxiexzf = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg, java.io.Flushable
    public final void flush() throws IOException {
        m4651Ujhhgtgfeyxiexzf(true);
        this.f9708Ujhhgtgfeyxiexzf.flush();
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f9708Ujhhgtgfeyxiexzf.f3194Ujhhgtgfeyxiexzf.timeout();
    }

    public final String toString() {
        return "DeflaterSink(" + this.f9708Ujhhgtgfeyxiexzf + ')';
    }

    @Override // p000.InterfaceC1026feyxiexzfUjhhgtg
    public final void write(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        AbstractC3085Ujhhgtgfeyxiexzf.m4552Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf, 0L, j);
        while (j > 0) {
            C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf;
            int iMin = (int) Math.min(j, c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf - c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf);
            this.f9709Ujhhgtgfeyxiexzf.setInput(c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf, iMin);
            m4651Ujhhgtgfeyxiexzf(false);
            long j2 = iMin;
            c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf -= j2;
            int i = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf + iMin;
            c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = i;
            if (i == c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
                c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtg);
            }
            j -= j2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m4651Ujhhgtgfeyxiexzf(boolean z) throws IOException {
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg;
        int iDeflate;
        C0806feyxiexzfUjhhgtg c0806feyxiexzfUjhhgtg = this.f9708Ujhhgtgfeyxiexzf;
        C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg = c0806feyxiexzfUjhhgtg.f3195Ujhhgtgfeyxiexzf;
        while (true) {
            c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.m3867feyxiexzfUjhhgtg(1);
            byte[] bArr = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf;
            Deflater deflater = this.f9709Ujhhgtgfeyxiexzf;
            if (z) {
                try {
                    int i = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                    iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
                } catch (NullPointerException e) {
                    throw new IOException("Deflater already closed", e);
                }
            } else {
                int i2 = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                iDeflate = deflater.deflate(bArr, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += iDeflate;
                c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf += (long) iDeflate;
                c0806feyxiexzfUjhhgtg.mo2148Ujhhgtgfeyxiexzf();
            } else if (deflater.needsInput()) {
                break;
            }
        }
        if (c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf == c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
            c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
            AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg);
        }
    }
}
