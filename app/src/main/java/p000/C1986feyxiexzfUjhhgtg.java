package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1986feyxiexzfUjhhgtg extends AbstractC3142Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f6552Ujhhgtgfeyxiexzf;

    public C1986feyxiexzfUjhhgtg(C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg, C1234feyxiexzfUjhhgtg c1234feyxiexzfUjhhgtg, C0960feyxiexzfUjhhgtg c0960feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        super(c0927feyxiexzfUjhhgtg, c1234feyxiexzfUjhhgtg, null, c0960feyxiexzfUjhhgtg, abstractC3638Ujhhgtgfeyxiexzf);
        int i = c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf;
        if (i != 6) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i, "opcode with invalid branchingness: "));
        }
        if (interfaceC1790feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("catches == null");
        }
        this.f6552Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1936Ujhhgtgfeyxiexzf(InterfaceC0690Ujhhgtgfeyxiexzf interfaceC0690Ujhhgtgfeyxiexzf) {
        interfaceC0690Ujhhgtgfeyxiexzf.mo1706Ujhhgtgfeyxiexzf(this);
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final InterfaceC1790feyxiexzfUjhhgtg mo1937Ujhhgtgfeyxiexzf() {
        return this.f6552Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC3142Ujhhgtgfeyxiexzf, p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final String mo1938Ujhhgtgfeyxiexzf() {
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = this.f9736Ujhhgtgfeyxiexzf;
        String strMo1392Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
        if (abstractC3638Ujhhgtgfeyxiexzf instanceof C3056Ujhhgtgfeyxiexzf) {
            strMo1392Ujhhgtgfeyxiexzf = ((C3056Ujhhgtgfeyxiexzf) abstractC3638Ujhhgtgfeyxiexzf).m4537Ujhhgtgfeyxiexzf();
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(strMo1392Ujhhgtgfeyxiexzf, " ");
        sbM4805Ujhhgtgfeyxiexzf.append(C2060Ujhhgtgfeyxiexzf.m3354Ujhhgtgfeyxiexzf(this.f6552Ujhhgtgfeyxiexzf));
        return sbM4805Ujhhgtgfeyxiexzf.toString();
    }

    @Override // p000.AbstractC0671Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final AbstractC0671Ujhhgtgfeyxiexzf mo1939Ujhhgtgfeyxiexzf(C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg) {
        return new C1986feyxiexzfUjhhgtg(this.f2786Ujhhgtgfeyxiexzf, this.f2787Ujhhgtgfeyxiexzf, this.f2789Ujhhgtgfeyxiexzf, this.f6552Ujhhgtgfeyxiexzf.mo2447Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg), this.f9736Ujhhgtgfeyxiexzf);
    }
}
