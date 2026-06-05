package p000;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲᛳ能不能ᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0201Ujhhgtgfeyxiexzf extends FilterInputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f1453Ujhhgtgfeyxiexzf;

    public C0201Ujhhgtgfeyxiexzf(C3356feyxiexzfUjhhgtg c3356feyxiexzfUjhhgtg) {
        super(c3356feyxiexzfUjhhgtg);
        this.f1453Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f1453Ujhhgtgfeyxiexzf;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f1453Ujhhgtgfeyxiexzf = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (m1277Ujhhgtgfeyxiexzf(1L) == -1) {
            return -1;
        }
        int i = super.read();
        m1278Ujhhgtgfeyxiexzf(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f1453Ujhhgtgfeyxiexzf = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jM1277Ujhhgtgfeyxiexzf = m1277Ujhhgtgfeyxiexzf(j);
        if (jM1277Ujhhgtgfeyxiexzf == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM1277Ujhhgtgfeyxiexzf);
        m1278Ujhhgtgfeyxiexzf(jSkip);
        return jSkip;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final long m1277Ujhhgtgfeyxiexzf(long j) {
        int i = this.f1453Ujhhgtgfeyxiexzf;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j <= ((long) i)) ? j : i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final void m1278Ujhhgtgfeyxiexzf(long j) {
        int i = this.f1453Ujhhgtgfeyxiexzf;
        if (i == Integer.MIN_VALUE || j == -1) {
            return;
        }
        this.f1453Ujhhgtgfeyxiexzf = (int) (((long) i) - j);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int iM1277Ujhhgtgfeyxiexzf = (int) m1277Ujhhgtgfeyxiexzf(i2);
        if (iM1277Ujhhgtgfeyxiexzf == -1) {
            return -1;
        }
        int i3 = super.read(bArr, i, iM1277Ujhhgtgfeyxiexzf);
        m1278Ujhhgtgfeyxiexzf(i3);
        return i3;
    }
}
