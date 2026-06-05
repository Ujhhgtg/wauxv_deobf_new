package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛲᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2530feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final byte[] f8239Ujhhgtgfeyxiexzf = new byte[1792];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final CharSequence f8240Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f8241Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f8242Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public char f8243Ujhhgtgfeyxiexzf;

    static {
        for (int i = 0; i < 1792; i++) {
            f8239Ujhhgtgfeyxiexzf[i] = Character.getDirectionality(i);
        }
    }

    public C2530feyxiexzfUjhhgtg(CharSequence charSequence) {
        this.f8240Ujhhgtgfeyxiexzf = charSequence;
        this.f8241Ujhhgtgfeyxiexzf = charSequence.length();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final byte m3795Ujhhgtgfeyxiexzf() {
        int i = this.f8242Ujhhgtgfeyxiexzf - 1;
        CharSequence charSequence = this.f8240Ujhhgtgfeyxiexzf;
        char cCharAt = charSequence.charAt(i);
        this.f8243Ujhhgtgfeyxiexzf = cCharAt;
        if (Character.isLowSurrogate(cCharAt)) {
            int iCodePointBefore = Character.codePointBefore(charSequence, this.f8242Ujhhgtgfeyxiexzf);
            this.f8242Ujhhgtgfeyxiexzf -= Character.charCount(iCodePointBefore);
            return Character.getDirectionality(iCodePointBefore);
        }
        this.f8242Ujhhgtgfeyxiexzf--;
        char c = this.f8243Ujhhgtgfeyxiexzf;
        return c < 1792 ? f8239Ujhhgtgfeyxiexzf[c] : Character.getDirectionality(c);
    }
}
