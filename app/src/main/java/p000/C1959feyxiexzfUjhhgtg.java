package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ要点脸能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1959feyxiexzfUjhhgtg extends C1076feyxiexzfUjhhgtg {
    private volatile boolean threadLocalIsSet;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final ThreadLocal f6435Ujhhgtgfeyxiexzf;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1959feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, AbstractC1181feyxiexzfUjhhgtg abstractC1181feyxiexzfUjhhgtg) {
        C1960Ujhhgtgfeyxiexzf c1960Ujhhgtgfeyxiexzf = C1960Ujhhgtgfeyxiexzf.f6436Ujhhgtgfeyxiexzf;
        super(interfaceC3739feyxiexzfUjhhgtg.mo1765feyxiexzfUjhhgtg(c1960Ujhhgtgfeyxiexzf) == null ? interfaceC3739feyxiexzfUjhhgtg.mo1764feyxiexzfUjhhgtg(c1960Ujhhgtgfeyxiexzf) : interfaceC3739feyxiexzfUjhhgtg, abstractC1181feyxiexzfUjhhgtg);
        this.f6435Ujhhgtgfeyxiexzf = new ThreadLocal();
        if (abstractC1181feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf.mo1765feyxiexzfUjhhgtg(C3382feyxiexzfUjhhgtg.f10556Ujhhgtgfeyxiexzf) instanceof AbstractC3740feyxiexzfUjhhgtg) {
            return;
        }
        Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, null);
        AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
        m3297feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
    }

    @Override // p000.C1076feyxiexzfUjhhgtg, p000.C0731Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public final void mo2049Ujhhgtgfeyxiexzf(Object obj) {
        m3296feyxiexzfUjhhgtg();
        Object objM4523Ujhhgtgfeyxiexzf = C3052Ujhhgtgfeyxiexzf.m4523Ujhhgtgfeyxiexzf(obj);
        AbstractC1181feyxiexzfUjhhgtg abstractC1181feyxiexzfUjhhgtg = this.f4148Ujhhgtgfeyxiexzf;
        InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg = abstractC1181feyxiexzfUjhhgtg.f11746Ujhhgtgfeyxiexzf;
        Object objM2759Ujhhgtgfeyxiexzf = AbstractC1245feyxiexzfUjhhgtg.m2759Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, null);
        C1959feyxiexzfUjhhgtg c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg = objM2759Ujhhgtgfeyxiexzf != AbstractC1245feyxiexzfUjhhgtg.f4587Ujhhgtgfeyxiexzf ? AbstractC3594Ujhhgtgfeyxiexzf.m5198feyxiexzfUjhhgtg(abstractC1181feyxiexzfUjhhgtg, interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf) : null;
        try {
            abstractC1181feyxiexzfUjhhgtg.mo2588Ujhhgtgfeyxiexzf(objM4523Ujhhgtgfeyxiexzf);
        } finally {
            if (c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg == null || c1959feyxiexzfUjhhgtgM5198feyxiexzfUjhhgtg.m3295feyxiexzfUjhhgtg()) {
                AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf(interfaceC3739feyxiexzfUjhhgtg, objM2759Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // p000.C1076feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳᛲ */
    public final void mo2554feyxiexzfUjhhgtg() {
        m3296feyxiexzfUjhhgtg();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final boolean m3295feyxiexzfUjhhgtg() {
        boolean z = this.threadLocalIsSet && this.f6435Ujhhgtgfeyxiexzf.get() == null;
        this.f6435Ujhhgtgfeyxiexzf.remove();
        return !z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛲᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m3296feyxiexzfUjhhgtg() {
        if (this.threadLocalIsSet) {
            C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) this.f6435Ujhhgtgfeyxiexzf.get();
            if (c1381feyxiexzfUjhhgtg != null) {
                AbstractC1245feyxiexzfUjhhgtg.m2757Ujhhgtgfeyxiexzf((InterfaceC3739feyxiexzfUjhhgtg) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
            }
            this.f6435Ujhhgtgfeyxiexzf.remove();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final void m3297feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Object obj) {
        this.threadLocalIsSet = true;
        this.f6435Ujhhgtgfeyxiexzf.set(new C1381feyxiexzfUjhhgtg(interfaceC3739feyxiexzfUjhhgtg, obj));
    }
}
