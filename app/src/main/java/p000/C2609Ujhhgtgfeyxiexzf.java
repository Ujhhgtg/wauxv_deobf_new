package p000;

import java.io.InputStream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2609Ujhhgtgfeyxiexzf extends InputStream {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8418Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public int f8419Ujhhgtgfeyxiexzf = 0;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final /* synthetic */ C2610Ujhhgtgfeyxiexzf f8420Ujhhgtgfeyxiexzf;

    public C2609Ujhhgtgfeyxiexzf(C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf) {
        this.f8420Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f8420Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf - this.f8418Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f8419Ujhhgtgfeyxiexzf = this.f8418Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.f8418Ujhhgtgfeyxiexzf;
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = this.f8420Ujhhgtgfeyxiexzf;
        if (i >= c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf) {
            return -1;
        }
        int iM3905Ujhhgtgfeyxiexzf = c2610Ujhhgtgfeyxiexzf.m3905Ujhhgtgfeyxiexzf(i);
        this.f8418Ujhhgtgfeyxiexzf++;
        return iM3905Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.f8418Ujhhgtgfeyxiexzf = this.f8419Ujhhgtgfeyxiexzf;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i + i2 > bArr.length) {
            i2 = bArr.length - i;
        }
        C2610Ujhhgtgfeyxiexzf c2610Ujhhgtgfeyxiexzf = this.f8420Ujhhgtgfeyxiexzf;
        int i3 = c2610Ujhhgtgfeyxiexzf.f8422Ujhhgtgfeyxiexzf;
        int i4 = this.f8418Ujhhgtgfeyxiexzf;
        int i5 = i3 - i4;
        if (i2 > i5) {
            i2 = i5;
        }
        System.arraycopy(c2610Ujhhgtgfeyxiexzf.f8421Ujhhgtgfeyxiexzf, i4, bArr, i, i2);
        this.f8418Ujhhgtgfeyxiexzf += i2;
        return i2;
    }
}
