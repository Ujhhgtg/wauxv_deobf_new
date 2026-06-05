package p000;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳᛲ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0650Ujhhgtgfeyxiexzf implements InterfaceC1227feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C0789feyxiexzfUjhhgtg f2710Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Inflater f2711Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public int f2712Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public boolean f2713Ujhhgtgfeyxiexzf;

    public C0650Ujhhgtgfeyxiexzf(C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg, Inflater inflater) {
        this.f2710Ujhhgtgfeyxiexzf = c0789feyxiexzfUjhhgtg;
        this.f2711Ujhhgtgfeyxiexzf = inflater;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f2713Ujhhgtgfeyxiexzf) {
            return;
        }
        this.f2711Ujhhgtgfeyxiexzf.end();
        this.f2713Ujhhgtgfeyxiexzf = true;
        this.f2710Ujhhgtgfeyxiexzf.close();
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final long read(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        do {
            long jM1913Ujhhgtgfeyxiexzf = m1913Ujhhgtgfeyxiexzf(c2598feyxiexzfUjhhgtg, j);
            if (jM1913Ujhhgtgfeyxiexzf > 0) {
                return jM1913Ujhhgtgfeyxiexzf;
            }
            Inflater inflater = this.f2711Ujhhgtgfeyxiexzf;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.f2710Ujhhgtgfeyxiexzf.mo2109Ujhhgtgfeyxiexzf());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // p000.InterfaceC1227feyxiexzfUjhhgtg
    public final C1744Ujhhgtgfeyxiexzf timeout() {
        return this.f2710Ujhhgtgfeyxiexzf.f3096Ujhhgtgfeyxiexzf.timeout();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final long m1913Ujhhgtgfeyxiexzf(C2598feyxiexzfUjhhgtg c2598feyxiexzfUjhhgtg, long j) throws IOException {
        Inflater inflater = this.f2711Ujhhgtgfeyxiexzf;
        if (j < 0) {
            throw new IllegalArgumentException(AbstractC1225feyxiexzfUjhhgtg.m2701Ujhhgtgfeyxiexzf(j, "byteCount < 0: ").toString());
        }
        if (this.f2713Ujhhgtgfeyxiexzf) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg = c2598feyxiexzfUjhhgtg.m3867feyxiexzfUjhhgtg(1);
                int iMin = (int) Math.min(j, 8192 - c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf);
                boolean zNeedsInput = inflater.needsInput();
                C0789feyxiexzfUjhhgtg c0789feyxiexzfUjhhgtg = this.f2710Ujhhgtgfeyxiexzf;
                if (zNeedsInput && !c0789feyxiexzfUjhhgtg.mo2109Ujhhgtgfeyxiexzf()) {
                    C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = c0789feyxiexzfUjhhgtg.f3097Ujhhgtgfeyxiexzf.f8400Ujhhgtgfeyxiexzf;
                    int i = c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf;
                    int i2 = c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf;
                    int i3 = i - i2;
                    this.f2712Ujhhgtgfeyxiexzf = i3;
                    inflater.setInput(c1086feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, i2, i3);
                }
                int iInflate = inflater.inflate(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4159Ujhhgtgfeyxiexzf, c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf, iMin);
                int i4 = this.f2712Ujhhgtgfeyxiexzf;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.f2712Ujhhgtgfeyxiexzf -= remaining;
                    c0789feyxiexzfUjhhgtg.skip(remaining);
                }
                if (iInflate > 0) {
                    c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf += iInflate;
                    long j2 = iInflate;
                    c2598feyxiexzfUjhhgtg.f8401Ujhhgtgfeyxiexzf += j2;
                    return j2;
                }
                if (c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf == c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf) {
                    c2598feyxiexzfUjhhgtg.f8400Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg.m2555Ujhhgtgfeyxiexzf();
                    AbstractC1088feyxiexzfUjhhgtg.m2559Ujhhgtgfeyxiexzf(c1086feyxiexzfUjhhgtgM3867feyxiexzfUjhhgtg);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
