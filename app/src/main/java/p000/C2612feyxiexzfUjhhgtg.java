package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2612feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int[] f8424Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public byte[] f8425Ujhhgtgfeyxiexzf = new byte[32];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public int f8426Ujhhgtgfeyxiexzf;

    static {
        int[] iArr = new int[65];
        for (int i = 0; i < 65; i++) {
            iArr[i] = (63 - i) / 7;
        }
        f8424Ujhhgtgfeyxiexzf = iArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3915Ujhhgtgfeyxiexzf(int i, long j) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f8425Ujhhgtgfeyxiexzf[this.f8426Ujhhgtgfeyxiexzf + i2] = (byte) ((127 & j) | 128);
            j >>>= 7;
        }
        byte[] bArr = this.f8425Ujhhgtgfeyxiexzf;
        int i3 = this.f8426Ujhhgtgfeyxiexzf;
        bArr[i3 + i] = (byte) j;
        this.f8426Ujhhgtgfeyxiexzf = i + 1 + i3;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final void m3916Ujhhgtgfeyxiexzf(int i) {
        int i2 = this.f8426Ujhhgtgfeyxiexzf + i;
        if (i2 <= this.f8425Ujhhgtgfeyxiexzf.length) {
            return;
        }
        byte[] bArr = new byte[Integer.highestOneBit(i2) << 1];
        AbstractC2391Ujhhgtgfeyxiexzf.m3646feyxiexzfUjhhgtg(this.f8425Ujhhgtgfeyxiexzf, 0, 0, bArr, 14);
        this.f8425Ujhhgtgfeyxiexzf = bArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final void m3917Ujhhgtgfeyxiexzf(int i) {
        m3916Ujhhgtgfeyxiexzf(4);
        for (int i2 = 3; -1 < i2; i2--) {
            byte[] bArr = this.f8425Ujhhgtgfeyxiexzf;
            int i3 = this.f8426Ujhhgtgfeyxiexzf;
            this.f8426Ujhhgtgfeyxiexzf = i3 + 1;
            bArr[i3] = (byte) (i >> (i2 * 8));
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final void m3918Ujhhgtgfeyxiexzf(long j) {
        m3916Ujhhgtgfeyxiexzf(8);
        for (int i = 7; -1 < i; i--) {
            byte[] bArr = this.f8425Ujhhgtgfeyxiexzf;
            int i2 = this.f8426Ujhhgtgfeyxiexzf;
            this.f8426Ujhhgtgfeyxiexzf = i2 + 1;
            bArr[i2] = (byte) (j >> (i * 8));
        }
    }
}
