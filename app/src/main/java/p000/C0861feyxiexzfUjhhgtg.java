package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛲᛴ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0861feyxiexzfUjhhgtg extends AbstractC0644Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C0870feyxiexzfUjhhgtg f3357Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f3358Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public C1773Ujhhgtgfeyxiexzf f3359Ujhhgtgfeyxiexzf;

    public C0861feyxiexzfUjhhgtg(C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg) {
        if (c0870feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("prototype == null");
        }
        C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = c0870feyxiexzfUjhhgtg.f3382Ujhhgtgfeyxiexzf;
        this.f3357Ujhhgtgfeyxiexzf = c0870feyxiexzfUjhhgtg;
        int length = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = c0870feyxiexzfUjhhgtg.f3381Ujhhgtgfeyxiexzf.f6017Ujhhgtgfeyxiexzf.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((C1784feyxiexzfUjhhgtg) c1163feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).f6017Ujhhgtgfeyxiexzf.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f3358Ujhhgtgfeyxiexzf = new C3056Ujhhgtgfeyxiexzf(sb.toString());
        this.f3359Ujhhgtgfeyxiexzf = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length == 0 ? null : new C1773Ujhhgtgfeyxiexzf(c1163feyxiexzfUjhhgtg);
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10261Ujhhgtgfeyxiexzf;
        c0395Ujhhgtgfeyxiexzf2.m1673Ujhhgtgfeyxiexzf(this.f3357Ujhhgtgfeyxiexzf.f3381Ujhhgtgfeyxiexzf);
        c0395Ujhhgtgfeyxiexzf.m1671Ujhhgtgfeyxiexzf(this.f3358Ujhhgtgfeyxiexzf);
        C1773Ujhhgtgfeyxiexzf c1773Ujhhgtgfeyxiexzf = this.f3359Ujhhgtgfeyxiexzf;
        if (c1773Ujhhgtgfeyxiexzf != null) {
            this.f3359Ujhhgtgfeyxiexzf = (C1773Ujhhgtgfeyxiexzf) c0295Ujhhgtgfeyxiexzf.m1510Ujhhgtgfeyxiexzf(c1773Ujhhgtgfeyxiexzf);
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2889Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1294Ujhhgtgfeyxiexzf() {
        return 12;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1295Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10264Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f3358Ujhhgtgfeyxiexzf;
        int iM1665Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf.m1665Ujhhgtgfeyxiexzf(c3056Ujhhgtgfeyxiexzf);
        C0395Ujhhgtgfeyxiexzf c0395Ujhhgtgfeyxiexzf2 = c3268feyxiexzfUjhhgtg.f10265Ujhhgtgfeyxiexzf;
        C0870feyxiexzfUjhhgtg c0870feyxiexzfUjhhgtg = this.f3357Ujhhgtgfeyxiexzf;
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = c0870feyxiexzfUjhhgtg.f3381Ujhhgtgfeyxiexzf;
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg2 = c0870feyxiexzfUjhhgtg.f3381Ujhhgtgfeyxiexzf;
        int iM1668Ujhhgtgfeyxiexzf = c0395Ujhhgtgfeyxiexzf2.m1668Ujhhgtgfeyxiexzf(c1784feyxiexzfUjhhgtg);
        C1773Ujhhgtgfeyxiexzf c1773Ujhhgtgfeyxiexzf = this.f3359Ujhhgtgfeyxiexzf;
        int iM2857Ujhhgtgfeyxiexzf = c1773Ujhhgtgfeyxiexzf == null ? 0 : c1773Ujhhgtgfeyxiexzf.m2857Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c1784feyxiexzfUjhhgtg2.mo1392Ujhhgtgfeyxiexzf());
            sb.append(" proto(");
            C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg = c0870feyxiexzfUjhhgtg.f3382Ujhhgtgfeyxiexzf;
            int length = c1163feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(((C1784feyxiexzfUjhhgtg) c1163feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i)).mo1392Ujhhgtgfeyxiexzf());
            }
            sb.append(")");
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, m1910Ujhhgtgfeyxiexzf() + ' ' + sb.toString());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  shorty_idx:      " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1665Ujhhgtgfeyxiexzf) + " // " + c3056Ujhhgtgfeyxiexzf.m4537Ujhhgtgfeyxiexzf());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  return_type_idx: " + AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM1668Ujhhgtgfeyxiexzf) + " // " + c1784feyxiexzfUjhhgtg2.mo1392Ujhhgtgfeyxiexzf());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  parameters_off:  ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM1665Ujhhgtgfeyxiexzf);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM1668Ujhhgtgfeyxiexzf);
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
    }
}
