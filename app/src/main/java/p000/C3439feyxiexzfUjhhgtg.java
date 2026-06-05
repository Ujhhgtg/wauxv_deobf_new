package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3439feyxiexzfUjhhgtg extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3411Ujhhgtgfeyxiexzf f10715Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public String f10716Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final StringBuilder f10717Ujhhgtgfeyxiexzf;

    public C3439feyxiexzfUjhhgtg(char c, int i, int i2) {
        C3411Ujhhgtgfeyxiexzf c3411Ujhhgtgfeyxiexzf = new C3411Ujhhgtgfeyxiexzf();
        this.f10715Ujhhgtgfeyxiexzf = c3411Ujhhgtgfeyxiexzf;
        this.f10717Ujhhgtgfeyxiexzf = new StringBuilder();
        c3411Ujhhgtgfeyxiexzf.f10628Ujhhgtgfeyxiexzf = c;
        c3411Ujhhgtgfeyxiexzf.f10629Ujhhgtgfeyxiexzf = i;
        c3411Ujhhgtgfeyxiexzf.f10630Ujhhgtgfeyxiexzf = i2;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1839Ujhhgtgfeyxiexzf(CharSequence charSequence) {
        if (this.f10716Ujhhgtgfeyxiexzf == null) {
            this.f10716Ujhhgtgfeyxiexzf = charSequence.toString();
            return;
        }
        StringBuilder sb = this.f10717Ujhhgtgfeyxiexzf;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo1840Ujhhgtgfeyxiexzf() {
        String strM4879Ujhhgtgfeyxiexzf = AbstractC3372feyxiexzfUjhhgtg.m4879Ujhhgtgfeyxiexzf(this.f10716Ujhhgtgfeyxiexzf.trim());
        C3411Ujhhgtgfeyxiexzf c3411Ujhhgtgfeyxiexzf = this.f10715Ujhhgtgfeyxiexzf;
        c3411Ujhhgtgfeyxiexzf.f10631Ujhhgtgfeyxiexzf = strM4879Ujhhgtgfeyxiexzf;
        c3411Ujhhgtgfeyxiexzf.f10632Ujhhgtgfeyxiexzf = this.f10717Ujhhgtgfeyxiexzf.toString();
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f10715Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        int i = c3215feyxiexzfUjhhgtg.f10088Ujhhgtgfeyxiexzf;
        int i2 = c3215feyxiexzfUjhhgtg.f10085Ujhhgtgfeyxiexzf;
        CharSequence charSequence = c3215feyxiexzfUjhhgtg.f10084Ujhhgtgfeyxiexzf;
        int i3 = c3215feyxiexzfUjhhgtg.f10090Ujhhgtgfeyxiexzf;
        C3411Ujhhgtgfeyxiexzf c3411Ujhhgtgfeyxiexzf = this.f10715Ujhhgtgfeyxiexzf;
        if (i3 < 4) {
            char c = c3411Ujhhgtgfeyxiexzf.f10628Ujhhgtgfeyxiexzf;
            int i4 = c3411Ujhhgtgfeyxiexzf.f10629Ujhhgtgfeyxiexzf;
            int iM4531Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4531Ujhhgtgfeyxiexzf(c, i, charSequence.length(), charSequence) - i;
            if (iM4531Ujhhgtgfeyxiexzf >= i4 && C3052Ujhhgtgfeyxiexzf.m4532Ujhhgtgfeyxiexzf(charSequence, i + iM4531Ujhhgtgfeyxiexzf, charSequence.length()) == charSequence.length()) {
                return new C2515feyxiexzfUjhhgtg(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i5 = c3411Ujhhgtgfeyxiexzf.f10630Ujhhgtgfeyxiexzf; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(i2);
    }
}
