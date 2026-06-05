package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴᛳ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2526feyxiexzfUjhhgtg extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2517feyxiexzfUjhhgtg f8223Ujhhgtgfeyxiexzf = new C2517feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static boolean m3794Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg, int i) {
        CharSequence charSequence = c3215feyxiexzfUjhhgtg.f10084Ujhhgtgfeyxiexzf;
        return c3215feyxiexzfUjhhgtg.f10090Ujhhgtgfeyxiexzf < 4 && i < charSequence.length() && charSequence.charAt(i) == '>';
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f8223Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        char cCharAt;
        int i = c3215feyxiexzfUjhhgtg.f10088Ujhhgtgfeyxiexzf;
        if (!m3794Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg, i)) {
            return null;
        }
        int i2 = c3215feyxiexzfUjhhgtg.f10086Ujhhgtgfeyxiexzf + c3215feyxiexzfUjhhgtg.f10090Ujhhgtgfeyxiexzf;
        int i3 = i2 + 1;
        CharSequence charSequence = c3215feyxiexzfUjhhgtg.f10084Ujhhgtgfeyxiexzf;
        int i4 = i + 1;
        if (i4 < charSequence.length() && ((cCharAt = charSequence.charAt(i4)) == '\t' || cCharAt == ' ')) {
            i3 = i2 + 2;
        }
        return new C2515feyxiexzfUjhhgtg(-1, i3, false);
    }
}
