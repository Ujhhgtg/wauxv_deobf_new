package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲ能不能ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3384feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final long[] f10574Ujhhgtgfeyxiexzf = new long[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final InterfaceC1121feyxiexzfUjhhgtg f10575Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractC3569Ujhhgtgfeyxiexzf f10576Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public long f10577Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final long[] f10578Ujhhgtgfeyxiexzf;

    /* JADX WARN: Multi-variable type inference failed */
    public C3384feyxiexzfUjhhgtg(InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        this.f10575Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg;
        this.f10576Ujhhgtgfeyxiexzf = (AbstractC3569Ujhhgtgfeyxiexzf) interfaceC3553feyxiexzfUjhhgtg;
        int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
        if (iMo1120Ujhhgtgfeyxiexzf <= 64) {
            this.f10577Ujhhgtgfeyxiexzf = iMo1120Ujhhgtgfeyxiexzf != 64 ? (-1) << iMo1120Ujhhgtgfeyxiexzf : 0L;
            this.f10578Ujhhgtgfeyxiexzf = f10574Ujhhgtgfeyxiexzf;
            return;
        }
        this.f10577Ujhhgtgfeyxiexzf = 0L;
        int i = (iMo1120Ujhhgtgfeyxiexzf - 1) >>> 6;
        long[] jArr = new long[i];
        if ((iMo1120Ujhhgtgfeyxiexzf & 63) != 0) {
            jArr[i - 1] = (-1) << iMo1120Ujhhgtgfeyxiexzf;
        }
        this.f10578Ujhhgtgfeyxiexzf = jArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m4904Ujhhgtgfeyxiexzf(int i) {
        if (i < 64) {
            this.f10577Ujhhgtgfeyxiexzf = (1 << i) | this.f10577Ujhhgtgfeyxiexzf;
        } else {
            int i2 = (i >>> 6) - 1;
            long[] jArr = this.f10578Ujhhgtgfeyxiexzf;
            jArr[i2] = (1 << (i & 63)) | jArr[i2];
        }
    }

    /* JADX WARN: Type inference failed for: r8v0, types: [上海高中ᛱ谢子非ᛱ要点脸ᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲ能不能, 上海高中ᛱ谢子非ᛱ要点脸ᛴᛲᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳ] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int m4905Ujhhgtgfeyxiexzf() {
        ?? r8;
        int iNumberOfTrailingZeros;
        InterfaceC1121feyxiexzfUjhhgtg interfaceC1121feyxiexzfUjhhgtg = this.f10575Ujhhgtgfeyxiexzf;
        int iMo1120Ujhhgtgfeyxiexzf = interfaceC1121feyxiexzfUjhhgtg.mo1120Ujhhgtgfeyxiexzf();
        do {
            long j = this.f10577Ujhhgtgfeyxiexzf;
            r8 = this.f10576Ujhhgtgfeyxiexzf;
            if (j == -1) {
                if (iMo1120Ujhhgtgfeyxiexzf <= 64) {
                    return -1;
                }
                long[] jArr = this.f10578Ujhhgtgfeyxiexzf;
                int length = jArr.length;
                int i = 0;
                while (i < length) {
                    int i2 = i + 1;
                    int i3 = i2 * 64;
                    long j2 = jArr[i];
                    while (j2 != -1) {
                        int iNumberOfTrailingZeros2 = Long.numberOfTrailingZeros(~j2);
                        j2 |= 1 << iNumberOfTrailingZeros2;
                        int i4 = iNumberOfTrailingZeros2 + i3;
                        if (((Boolean) r8.mo1179Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, Integer.valueOf(i4))).booleanValue()) {
                            jArr[i] = j2;
                            return i4;
                        }
                    }
                    jArr[i] = j2;
                    i = i2;
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j);
            this.f10577Ujhhgtgfeyxiexzf |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) r8.mo1179Ujhhgtgfeyxiexzf(interfaceC1121feyxiexzfUjhhgtg, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }
}
