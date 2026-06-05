package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2492feyxiexzfUjhhgtg extends AbstractC0060Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f8141Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final int m3774Ujhhgtgfeyxiexzf() {
        if (this.f8141Ujhhgtgfeyxiexzf == -1) {
            C2496feyxiexzfUjhhgtg c2496feyxiexzfUjhhgtg = new C2496feyxiexzfUjhhgtg();
            c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf = 0;
            int length = this.f10801Ujhhgtgfeyxiexzf.length;
            for (int i = 0; i < length; i++) {
                C2657Ujhhgtgfeyxiexzf c2657Ujhhgtgfeyxiexzf = ((C2495feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i)).f8153Ujhhgtgfeyxiexzf;
                int length2 = c2657Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
                for (int i2 = 0; i2 < length2; i2++) {
                    ((AbstractC0671Ujhhgtgfeyxiexzf) c2657Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i2)).mo1936Ujhhgtgfeyxiexzf(c2496feyxiexzfUjhhgtg);
                }
            }
            this.f8141Ujhhgtgfeyxiexzf = c2496feyxiexzfUjhhgtg.f8156Ujhhgtgfeyxiexzf;
        }
        return this.f8141Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final C2495feyxiexzfUjhhgtg m3775Ujhhgtgfeyxiexzf(int i) {
        int iM1057Ujhhgtgfeyxiexzf = m1057Ujhhgtgfeyxiexzf(i);
        if (iM1057Ujhhgtgfeyxiexzf >= 0) {
            return (C2495feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(iM1057Ujhhgtgfeyxiexzf);
        }
        throw new IllegalArgumentException("no such label: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i)));
    }
}
