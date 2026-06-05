package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛳᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2880feyxiexzfUjhhgtg extends C2667feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC0728Ujhhgtgfeyxiexzf f9147Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public int f9148Ujhhgtgfeyxiexzf;

    public C2880feyxiexzfUjhhgtg(C2501feyxiexzfUjhhgtg c2501feyxiexzfUjhhgtg, AbstractC0728Ujhhgtgfeyxiexzf abstractC0728Ujhhgtgfeyxiexzf) {
        super(c2501feyxiexzfUjhhgtg);
        this.f9147Ujhhgtgfeyxiexzf = abstractC0728Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo4010Ujhhgtgfeyxiexzf() {
        this.f8533Ujhhgtgfeyxiexzf = true;
        this.f9148Ujhhgtgfeyxiexzf++;
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final void mo4012Ujhhgtgfeyxiexzf() {
        this.f8533Ujhhgtgfeyxiexzf = false;
        m4018Ujhhgtgfeyxiexzf("\n");
        int i = this.f9148Ujhhgtgfeyxiexzf;
        for (int i2 = 0; i2 < i; i2++) {
            m4018Ujhhgtgfeyxiexzf(this.f9147Ujhhgtgfeyxiexzf.f2997Ujhhgtgfeyxiexzf.f1296Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final void mo4013Ujhhgtgfeyxiexzf() {
        if (this.f8533Ujhhgtgfeyxiexzf) {
            this.f8533Ujhhgtgfeyxiexzf = false;
        } else {
            mo4012Ujhhgtgfeyxiexzf();
        }
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final void mo4022Ujhhgtgfeyxiexzf() {
        m4015Ujhhgtgfeyxiexzf(' ');
    }

    @Override // p000.C2667feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public final void mo4023Ujhhgtgfeyxiexzf() {
        this.f9148Ujhhgtgfeyxiexzf--;
    }
}
