package p000;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛲᛳᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3700feyxiexzfUjhhgtg extends FilterInputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f11734Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f11735Ujhhgtgfeyxiexzf;

    public C3700feyxiexzfUjhhgtg(InputStream inputStream, long j) {
        super(inputStream);
        this.f11734Ujhhgtgfeyxiexzf = j;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f11734Ujhhgtgfeyxiexzf - ((long) this.f11735Ujhhgtgfeyxiexzf), ((FilterInputStream) this).in.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        m5380Ujhhgtgfeyxiexzf(i >= 0 ? 1 : -1);
        return i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m5380Ujhhgtgfeyxiexzf(int i) throws IOException {
        if (i >= 0) {
            this.f11735Ujhhgtgfeyxiexzf += i;
            return;
        }
        long j = this.f11735Ujhhgtgfeyxiexzf;
        long j2 = this.f11734Ujhhgtgfeyxiexzf;
        if (j2 - j <= 0) {
            return;
        }
        throw new IOException("Failed to read all expected data, expected: " + j2 + ", but read: " + this.f11735Ujhhgtgfeyxiexzf);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        m5380Ujhhgtgfeyxiexzf(i3);
        return i3;
    }
}
