package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2403Ujhhgtgfeyxiexzf extends AbstractC2482feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2659feyxiexzfUjhhgtg f7797Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f7798Ujhhgtgfeyxiexzf;

    public C2403Ujhhgtgfeyxiexzf(C2659feyxiexzfUjhhgtg c2659feyxiexzfUjhhgtg) {
        super("BootstrapMethods");
        this.f7797Ujhhgtgfeyxiexzf = c2659feyxiexzfUjhhgtg;
        int length = (c2659feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length * 4) + 8;
        for (int i = 0; i < c2659feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length; i++) {
            length += ((C2658Ujhhgtgfeyxiexzf) c2659feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).f8522Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length * 2;
        }
        this.f7798Ujhhgtgfeyxiexzf = length;
    }

    @Override // p000.AbstractC2482feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final int mo2154Ujhhgtgfeyxiexzf() {
        return this.f7798Ujhhgtgfeyxiexzf;
    }
}
