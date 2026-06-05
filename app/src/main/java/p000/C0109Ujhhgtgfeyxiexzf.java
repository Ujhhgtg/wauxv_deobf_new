package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸ᛲᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0109Ujhhgtgfeyxiexzf extends AbstractC2924Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractC0114Ujhhgtgfeyxiexzf f1231Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public boolean f1232Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f1233Ujhhgtgfeyxiexzf;

    public C0109Ujhhgtgfeyxiexzf(AbstractC0114Ujhhgtgfeyxiexzf abstractC0114Ujhhgtgfeyxiexzf) {
        this.f1231Ujhhgtgfeyxiexzf = abstractC0114Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo1151Ujhhgtgfeyxiexzf(AbstractC2516feyxiexzfUjhhgtg abstractC2516feyxiexzfUjhhgtg) {
        if (!(abstractC2516feyxiexzfUjhhgtg instanceof C0096Ujhhgtgfeyxiexzf)) {
            return false;
        }
        if (this.f1232Ujhhgtgfeyxiexzf && this.f1233Ujhhgtgfeyxiexzf == 1) {
            this.f1231Ujhhgtgfeyxiexzf.f1262Ujhhgtgfeyxiexzf = false;
            this.f1232Ujhhgtgfeyxiexzf = false;
        }
        return true;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final AbstractC2516feyxiexzfUjhhgtg mo1152Ujhhgtgfeyxiexzf() {
        return this.f1231Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final boolean mo1153Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.AbstractC2924Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final C2515feyxiexzfUjhhgtg mo1154Ujhhgtgfeyxiexzf(C3215feyxiexzfUjhhgtg c3215feyxiexzfUjhhgtg) {
        if (c3215feyxiexzfUjhhgtg.f10091Ujhhgtgfeyxiexzf) {
            this.f1232Ujhhgtgfeyxiexzf = true;
            this.f1233Ujhhgtgfeyxiexzf = 0;
        } else if (this.f1232Ujhhgtgfeyxiexzf) {
            this.f1233Ujhhgtgfeyxiexzf++;
        }
        return C2515feyxiexzfUjhhgtg.m3791Ujhhgtgfeyxiexzf(c3215feyxiexzfUjhhgtg.f10085Ujhhgtgfeyxiexzf);
    }
}
