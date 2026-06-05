package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ要点脸ᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1132feyxiexzfUjhhgtg extends AbstractC0417Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf[] f4283Ujhhgtgfeyxiexzf;

    public C1132feyxiexzfUjhhgtg(int i) {
        super(i > 1);
        if (i < 1) {
            throw new IllegalArgumentException("size < 1");
        }
        this.f4283Ujhhgtgfeyxiexzf = new AbstractC3638Ujhhgtgfeyxiexzf[i];
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf m2601Ujhhgtgfeyxiexzf(int i) {
        try {
            AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = this.f4283Ujhhgtgfeyxiexzf[i];
            if (abstractC3638Ujhhgtgfeyxiexzf != null) {
                return abstractC3638Ujhhgtgfeyxiexzf;
            }
            throw new C3355feyxiexzfUjhhgtg("invalid constant pool index ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)), null);
        } catch (IndexOutOfBoundsException unused) {
            throw new C3355feyxiexzfUjhhgtg("invalid constant pool index ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)), null);
        }
    }
}
