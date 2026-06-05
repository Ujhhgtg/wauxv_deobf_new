package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2615feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8432Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8433Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final byte[] f8434Ujhhgtgfeyxiexzf;

    public C2615feyxiexzfUjhhgtg(int i, byte[] bArr) {
        this.f8434Ujhhgtgfeyxiexzf = bArr;
        this.f8432Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public void m3919Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8433Ujhhgtgfeyxiexzf;
        int i3 = this.f8432Ujhhgtgfeyxiexzf;
        if (i <= i3 - i2) {
            return;
        }
        throw new C0670Ujhhgtgfeyxiexzf("Unexpected EOF, available " + (i3 - this.f8433Ujhhgtgfeyxiexzf) + " bytes, requested: " + i);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int m3920Ujhhgtgfeyxiexzf() {
        int i = this.f8433Ujhhgtgfeyxiexzf;
        if (i >= this.f8432Ujhhgtgfeyxiexzf) {
            return -1;
        }
        this.f8433Ujhhgtgfeyxiexzf = i + 1;
        return this.f8434Ujhhgtgfeyxiexzf[i] & 255;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long m3921Ujhhgtgfeyxiexzf(boolean z) {
        int i = this.f8433Ujhhgtgfeyxiexzf;
        int i2 = this.f8432Ujhhgtgfeyxiexzf;
        if (i == i2) {
            if (z) {
                return -1L;
            }
            throw new C0670Ujhhgtgfeyxiexzf("Unexpected EOF");
        }
        int i3 = i + 1;
        byte[] bArr = this.f8434Ujhhgtgfeyxiexzf;
        long j = bArr[i];
        long j2 = 0;
        if (j >= 0) {
            this.f8433Ujhhgtgfeyxiexzf = i3;
            return j;
        }
        if (i2 - i > 1) {
            int i4 = i + 2;
            long j3 = (((long) bArr[i3]) << 7) ^ j;
            if (j3 < 0) {
                this.f8433Ujhhgtgfeyxiexzf = i4;
                return j3 ^ (-128);
            }
        }
        for (int i5 = 0; i5 < 64; i5 += 7) {
            int iM3920Ujhhgtgfeyxiexzf = m3920Ujhhgtgfeyxiexzf();
            j2 |= ((long) (iM3920Ujhhgtgfeyxiexzf & 127)) << i5;
            if ((iM3920Ujhhgtgfeyxiexzf & 128) == 0) {
                return j2;
            }
        }
        throw new C0670Ujhhgtgfeyxiexzf("Input stream is malformed: Varint too long (exceeded 64 bits)");
    }

    public C2615feyxiexzfUjhhgtg(byte[] bArr, int i, int i2) {
        this.f8434Ujhhgtgfeyxiexzf = bArr;
        this.f8432Ujhhgtgfeyxiexzf = i;
        this.f8433Ujhhgtgfeyxiexzf = i2;
    }
}
