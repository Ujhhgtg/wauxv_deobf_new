package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ要点脸ᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0095Ujhhgtgfeyxiexzf extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C0096Ujhhgtgfeyxiexzf f1204Ujhhgtgfeyxiexzf = new C0096Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int f1205Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public boolean f1206Ujhhgtgfeyxiexzf;

    public C0095Ujhhgtgfeyxiexzf(int i) {
        this.f1205Ujhhgtgfeyxiexzf = i;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean mo1151Ujhhgtgfeyxiexzf(AbstractC2516feyxiexzfUjhhgtg abstractC2516feyxiexzfUjhhgtg) {
        if (!this.f1206Ujhhgtgfeyxiexzf) {
            return true;
        }
        AbstractC2516feyxiexzfUjhhgtg abstractC2516feyxiexzfUjhhgtg2 = (AbstractC2516feyxiexzfUjhhgtg) this.f1204Ujhhgtgfeyxiexzf.f4685Ujhhgtgfeyxiexzf;
        if (!(abstractC2516feyxiexzfUjhhgtg2 instanceof AbstractC0114Ujhhgtgfeyxiexzf)) {
            return true;
        }
        ((AbstractC0114Ujhhgtgfeyxiexzf) abstractC2516feyxiexzfUjhhgtg2).f1262Ujhhgtgfeyxiexzf = false;
        return true;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f1204Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean mo1153Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        if (c3215feyxiexzfUjhhgtg.f10091Ujhhgtgfeyxiexzf) {
            if (this.f1204Ujhhgtgfeyxiexzf.f4686Ujhhgtgfeyxiexzf == null) {
                return null;
            }
            AbstractC2516feyxiexzfUjhhgtg abstractC2516feyxiexzfUjhhgtgMo1152Ujhhgtgfeyxiexzf = c3215feyxiexzfUjhhgtg.m4708Ujhhgtgfeyxiexzf().mo1152Ujhhgtgfeyxiexzf();
            this.f1206Ujhhgtgfeyxiexzf = (abstractC2516feyxiexzfUjhhgtgMo1152Ujhhgtgfeyxiexzf instanceof C1368feyxiexzfUjhhgtg) || (abstractC2516feyxiexzfUjhhgtgMo1152Ujhhgtgfeyxiexzf instanceof C0096Ujhhgtgfeyxiexzf);
            return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10088Ujhhgtgfeyxiexzf);
        }
        int i = c3215feyxiexzfUjhhgtg.f10090Ujhhgtgfeyxiexzf;
        int i2 = this.f1205Ujhhgtgfeyxiexzf;
        if (i >= i2) {
            return new C2515feyxiexzfUjhhgtg(-1, c3215feyxiexzfUjhhgtg.f10086Ujhhgtgfeyxiexzf + i2, false);
        }
        return null;
    }
}
