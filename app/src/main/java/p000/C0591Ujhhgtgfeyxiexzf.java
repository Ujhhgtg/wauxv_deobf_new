package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能ᛳ要点脸ᛲᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0591Ujhhgtgfeyxiexzf extends AbstractC3473Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1047feyxiexzfUjhhgtg[] f2631Ujhhgtgfeyxiexzf;

    public C0591Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        super(c1234feyxiexzfUjhhgtg, c0960feyxiexzfUjhhgtg);
        if (c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length == 0) {
            throw new IllegalArgumentException("registers.size() == 0");
        }
        this.f2631Ujhhgtgfeyxiexzf = null;
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1802Ujhhgtgfeyxiexzf() {
        return null;
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final int mo1865Ujhhgtgfeyxiexzf() {
        m1868Ujhhgtgfeyxiexzf();
        int iMo1865Ujhhgtgfeyxiexzf = 0;
        for (C1047feyxiexzfUjhhgtg c1047feyxiexzfUjhhgtg : this.f2631Ujhhgtgfeyxiexzf) {
            iMo1865Ujhhgtgfeyxiexzf += c1047feyxiexzfUjhhgtg.mo1865Ujhhgtgfeyxiexzf();
        }
        return iMo1865Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String mo1866Ujhhgtgfeyxiexzf() {
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = this.f9500Ujhhgtgfeyxiexzf;
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        StringBuilder sb = new StringBuilder(100);
        int iM2455Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < length; i++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
            C1047feyxiexzfUjhhgtg c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf = AbstractC3068Ujhhgtgfeyxiexzf.m4543Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg.f4561Ujhhgtgfeyxiexzf, C0961feyxiexzfUjhhgtg.m2451Ujhhgtgfeyxiexzf(iM2455Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType(), null), c0961feyxiexzfUjhhgtg);
            if (i != 0) {
                sb.append('\n');
            }
            sb.append(c1047feyxiexzfUjhhgtgM4543Ujhhgtgfeyxiexzf.mo1866Ujhhgtgfeyxiexzf());
            iM2455Ujhhgtgfeyxiexzf += c0961feyxiexzfUjhhgtg.m2455Ujhhgtgfeyxiexzf();
        }
        return sb.toString();
    }

    @Override // p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public final AbstractC3068Ujhhgtgfeyxiexzf mo1806Ujhhgtgfeyxiexzf(C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg) {
        return new C0591Ujhhgtgfeyxiexzf(this.f9499Ujhhgtgfeyxiexzf, c0960feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC3473Ujhhgtgfeyxiexzf, p000.AbstractC3068Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void mo1867Ujhhgtgfeyxiexzf(C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        m1868Ujhhgtgfeyxiexzf();
        for (C1047feyxiexzfUjhhgtg c1047feyxiexzfUjhhgtg : this.f2631Ujhhgtgfeyxiexzf) {
            c1047feyxiexzfUjhhgtg.mo1867Ujhhgtgfeyxiexzf(c2608Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final void m1868Ujhhgtgfeyxiexzf() {
        if (this.f2631Ujhhgtgfeyxiexzf != null) {
            return;
        }
        C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg = this.f9500Ujhhgtgfeyxiexzf;
        int length = c0960feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        this.f2631Ujhhgtgfeyxiexzf = new C1047feyxiexzfUjhhgtg[length];
        int iM2455Ujhhgtgfeyxiexzf = 0;
        for (int i = 0; i < length; i++) {
            C0961feyxiexzfUjhhgtg c0961feyxiexzfUjhhgtg = (C0961feyxiexzfUjhhgtg) c0960feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i);
            this.f2631Ujhhgtgfeyxiexzf[i] = AbstractC3068Ujhhgtgfeyxiexzf.m4543Ujhhgtgfeyxiexzf(C1234feyxiexzfUjhhgtg.f4561Ujhhgtgfeyxiexzf, C0961feyxiexzfUjhhgtg.m2451Ujhhgtgfeyxiexzf(iM2455Ujhhgtgfeyxiexzf, c0961feyxiexzfUjhhgtg.f3831Ujhhgtgfeyxiexzf.getType(), null), c0961feyxiexzfUjhhgtg);
            iM2455Ujhhgtgfeyxiexzf += c0961feyxiexzfUjhhgtg.m2455Ujhhgtgfeyxiexzf();
        }
    }
}
