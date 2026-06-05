package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛲᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2533feyxiexzfUjhhgtg extends AbstractC2482feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f8252Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8253Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C2629Ujhhgtgfeyxiexzf f8254Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2650feyxiexzfUjhhgtg f8255Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final C2657Ujhhgtgfeyxiexzf f8256Ujhhgtgfeyxiexzf;

    public C2533feyxiexzfUjhhgtg(int i, int i2, C2629Ujhhgtgfeyxiexzf c2629Ujhhgtgfeyxiexzf, C2650feyxiexzfUjhhgtg c2650feyxiexzfUjhhgtg, C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf) {
        super("Code");
        if (i < 0) {
            throw new IllegalArgumentException("maxStack < 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("maxLocals < 0");
        }
        try {
            if (c2650feyxiexzfUjhhgtg.f2247Ujhhgtgfeyxiexzf) {
                throw new C3267feyxiexzfUjhhgtg("catches.isMutable()", null);
            }
            try {
                if (c2657Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf) {
                    throw new C3267feyxiexzfUjhhgtg("attributes.isMutable()", null);
                }
                this.f8252Ujhhgtgfeyxiexzf = i;
                this.f8253Ujhhgtgfeyxiexzf = i2;
                this.f8254Ujhhgtgfeyxiexzf = c2629Ujhhgtgfeyxiexzf;
                this.f8255Ujhhgtgfeyxiexzf = c2650feyxiexzfUjhhgtg;
                this.f8256Ujhhgtgfeyxiexzf = c2657Ujhhgtgfeyxiexzf;
            } catch (NullPointerException unused) {
                throw new NullPointerException("attributes == null");
            }
        } catch (NullPointerException unused2) {
            throw new NullPointerException("catches == null");
        }
    }

    @Override // p000.AbstractC2482feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2154Ujhhgtgfeyxiexzf() {
        int iMo2154Ujhhgtgfeyxiexzf = 2;
        int iM2691Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2691Ujhhgtgfeyxiexzf(this.f8255Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length, 8, 2, ((C2610Ujhhgtgfeyxiexzf) this.f8254Ujhhgtgfeyxiexzf.f8461Ujhhgtgfeyxiexzf).f8422Ujhhgtgfeyxiexzf + 14);
        C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = this.f8256Ujhhgtgfeyxiexzf;
        int length = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        for (int i = 0; i < length; i++) {
            iMo2154Ujhhgtgfeyxiexzf += ((AbstractC2482feyxiexzfUjhhgtg) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i)).mo2154Ujhhgtgfeyxiexzf();
        }
        return iM2691Ujhhgtgfeyxiexzf + iMo2154Ujhhgtgfeyxiexzf;
    }
}
