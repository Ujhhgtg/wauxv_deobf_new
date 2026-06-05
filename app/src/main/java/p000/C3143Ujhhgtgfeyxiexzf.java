package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱUjhhgtgᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3143Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf f9737Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public int f9738Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public int f9739Ujhhgtgfeyxiexzf;

    public C3143Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        super(c3216feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
        if (abstractC3638Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("constant == null");
        }
        this.f9737Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf;
        this.f9738Ujhhgtgfeyxiexzf = -1;
        this.f9739Ujhhgtgfeyxiexzf = -1;
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        return this.f9737Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final String mo1803Ujhhgtgfeyxiexzf() {
        if (this.f9738Ujhhgtgfeyxiexzf < 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(20);
        sb.append(this.f9737Ujhhgtgfeyxiexzf.mo4533Ujhhgtgfeyxiexzf());
        sb.append('@');
        int i = this.f9738Ujhhgtgfeyxiexzf;
        if (i < 65536) {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i));
        } else {
            sb.append(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i));
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final String mo1804Ujhhgtgfeyxiexzf() {
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = this.f9737Ujhhgtgfeyxiexzf;
        return abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf ? ((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4537Ujhhgtgfeyxiexzf() : abstractC3638Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1805Ujhhgtgfeyxiexzf(C3216feyxiexzfUjhhgtg c3216feyxiexzfUjhhgtg) {
        C3143Ujhhgtgfeyxiexzf c3143Ujhhgtgfeyxiexzf = new C3143Ujhhgtgfeyxiexzf(c3216feyxiexzfUjhhgtg, this.f9499Ujhhgtgfeyxiexzf, this.f9500Ujhhgtgfeyxiexzf, this.f9737Ujhhgtgfeyxiexzf);
        int i = this.f9738Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            c3143Ujhhgtgfeyxiexzf.m4659Ujhhgtgfeyxiexzf(i);
        }
        int i2 = this.f9739Ujhhgtgfeyxiexzf;
        if (i2 >= 0) {
            c3143Ujhhgtgfeyxiexzf.m4658Ujhhgtgfeyxiexzf(i2);
        }
        return c3143Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        C3143Ujhhgtgfeyxiexzf c3143Ujhhgtgfeyxiexzf = new C3143Ujhhgtgfeyxiexzf(this.f9498Ujhhgtgfeyxiexzf, this.f9499Ujhhgtgfeyxiexzf, c0960feyxiexzfUjhhgtg, this.f9737Ujhhgtgfeyxiexzf);
        int i = this.f9738Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            c3143Ujhhgtgfeyxiexzf.m4659Ujhhgtgfeyxiexzf(i);
        }
        int i2 = this.f9739Ujhhgtgfeyxiexzf;
        if (i2 >= 0) {
            c3143Ujhhgtgfeyxiexzf.m4658Ujhhgtgfeyxiexzf(i2);
        }
        return c3143Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final int m4657Ujhhgtgfeyxiexzf() {
        int i = this.f9738Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException("index not yet set for " + this.f9737Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m4658Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f9739Ujhhgtgfeyxiexzf >= 0) {
            throw new IllegalStateException("class index already set");
        }
        this.f9739Ujhhgtgfeyxiexzf = i;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final void m4659Ujhhgtgfeyxiexzf(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("index < 0");
        }
        if (this.f9738Ujhhgtgfeyxiexzf >= 0) {
            throw new IllegalStateException("index already set");
        }
        this.f9738Ujhhgtgfeyxiexzf = i;
    }
}
