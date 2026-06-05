package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3348feyxiexzfUjhhgtg extends AbstractC3347Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f10459Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2868feyxiexzfUjhhgtg f10460Ujhhgtgfeyxiexzf;

    public C3348feyxiexzfUjhhgtg(C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf, int i, C2363Ujhhgtgfeyxiexzf c2363Ujhhgtgfeyxiexzf, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg) {
        super(i);
        this.f10459Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
        if (c2363Ujhhgtgfeyxiexzf == null) {
            this.f10460Ujhhgtgfeyxiexzf = null;
        } else {
            this.f10460Ujhhgtgfeyxiexzf = new C2868feyxiexzfUjhhgtg(c3154Ujhhgtgfeyxiexzf, c2363Ujhhgtgfeyxiexzf, (i & 8) != 0, interfaceC1790feyxiexzfUjhhgtg);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10459Ujhhgtgfeyxiexzf.compareTo(((C3348feyxiexzfUjhhgtg) obj).f10459Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3348feyxiexzfUjhhgtg) && this.f10459Ujhhgtgfeyxiexzf.compareTo(((C3348feyxiexzfUjhhgtg) obj).f10459Ujhhgtgfeyxiexzf) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C3348feyxiexzfUjhhgtg.class.getName());
        sb.append('{');
        sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f10458Ujhhgtgfeyxiexzf));
        sb.append(' ');
        sb.append(this.f10459Ujhhgtgfeyxiexzf);
        C2868feyxiexzfUjhhgtg c2868feyxiexzfUjhhgtg = this.f10460Ujhhgtgfeyxiexzf;
        if (c2868feyxiexzfUjhhgtg != null) {
            sb.append(' ');
            sb.append(c2868feyxiexzfUjhhgtg);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f10459Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3347Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final int mo4850Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, int i, int i2) {
        C0392Ujhhgtgfeyxiexzf c0392Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10268Ujhhgtgfeyxiexzf;
        C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf = this.f10459Ujhhgtgfeyxiexzf;
        int iM1645Ujhhgtgfeyxiexzf = c0392Ujhhgtgfeyxiexzf.m1645Ujhhgtgfeyxiexzf(c3154Ujhhgtgfeyxiexzf);
        int i3 = iM1645Ujhhgtgfeyxiexzf - i;
        C2868feyxiexzfUjhhgtg c2868feyxiexzfUjhhgtg = this.f10460Ujhhgtgfeyxiexzf;
        int iM2857Ujhhgtgfeyxiexzf = c2868feyxiexzfUjhhgtg == null ? 0 : c2868feyxiexzfUjhhgtg.m2857Ujhhgtgfeyxiexzf();
        boolean z = iM2857Ujhhgtgfeyxiexzf != 0;
        int i4 = this.f10458Ujhhgtgfeyxiexzf;
        if (z != ((i4 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, String.format("  [%x] %s", Integer.valueOf(i2), c3154Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf()));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(i3), "    method_idx:   ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1645Ujhhgtgfeyxiexzf)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(i4), "    access_flags: " + AbstractC3612feyxiexzfUjhhgtg.m5238Ujhhgtgfeyxiexzf(i4, 204287, 3));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf), "    code_off:     ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf)));
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(i3);
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(i4);
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
        return iM1645Ujhhgtgfeyxiexzf;
    }
}
