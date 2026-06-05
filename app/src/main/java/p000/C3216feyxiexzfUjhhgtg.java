package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛲ能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3216feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f10099Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f10100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f10101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC1791feyxiexzfUjhhgtg f10102Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f10103Ujhhgtgfeyxiexzf;

    public C3216feyxiexzfUjhhgtg(int i, int i2, int i3, AbstractC1791feyxiexzfUjhhgtg abstractC1791feyxiexzfUjhhgtg, boolean z) {
        if (!AbstractC1791feyxiexzfUjhhgtg.m3142Ujhhgtgfeyxiexzf(i)) {
            throw new IllegalArgumentException("bogus opcode");
        }
        if (!AbstractC1791feyxiexzfUjhhgtg.m3142Ujhhgtgfeyxiexzf(i2)) {
            throw new IllegalArgumentException("bogus family");
        }
        if (!AbstractC1791feyxiexzfUjhhgtg.m3142Ujhhgtgfeyxiexzf(i3)) {
            throw new IllegalArgumentException("bogus nextOpcode");
        }
        if (abstractC1791feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("format == null");
        }
        this.f10099Ujhhgtgfeyxiexzf = i;
        this.f10100Ujhhgtgfeyxiexzf = i2;
        this.f10101Ujhhgtgfeyxiexzf = i3;
        this.f10102Ujhhgtgfeyxiexzf = abstractC1791feyxiexzfUjhhgtg;
        this.f10103Ujhhgtgfeyxiexzf = z;
    }

    public final String toString() {
        return m4712Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String m4712Ujhhgtgfeyxiexzf() {
        int i = this.f10099Ujhhgtgfeyxiexzf;
        try {
            C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg = AbstractC1463feyxiexzfUjhhgtg.f5082Ujhhgtgfeyxiexzf[i + 1];
            if (c2501feyxiexzfUjhhgtg != null) {
                return (String) c2501feyxiexzfUjhhgtg.f8171Ujhhgtgfeyxiexzf;
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        throw new IllegalArgumentException("bogus opcode: ".concat(i == ((char) i) ? AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i)));
    }
}
