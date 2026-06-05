package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛳ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3346feyxiexzfUjhhgtg extends AbstractC3347Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3140Ujhhgtgfeyxiexzf f10457Ujhhgtgfeyxiexzf;

    public C3346feyxiexzfUjhhgtg(C3140Ujhhgtgfeyxiexzf c3140Ujhhgtgfeyxiexzf, int i) {
        super(i);
        this.f10457Ujhhgtgfeyxiexzf = c3140Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10457Ujhhgtgfeyxiexzf.compareTo(((C3346feyxiexzfUjhhgtg) obj).f10457Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C3346feyxiexzfUjhhgtg) && this.f10457Ujhhgtgfeyxiexzf.compareTo(((C3346feyxiexzfUjhhgtg) obj).f10457Ujhhgtgfeyxiexzf) == 0;
    }

    public final int hashCode() {
        return this.f10457Ujhhgtgfeyxiexzf.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C3346feyxiexzfUjhhgtg.class.getName());
        sb.append('{');
        sb.append(AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(this.f10458Ujhhgtgfeyxiexzf));
        sb.append(' ');
        sb.append(this.f10457Ujhhgtgfeyxiexzf);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f10457Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
    }

    @Override // p000.AbstractC3347Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int mo4850Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf, int i, int i2) {
        C3444feyxiexzfUjhhgtg c3444feyxiexzfUjhhgtg = c3268feyxiexzfUjhhgtg.f10267Ujhhgtgfeyxiexzf;
        C3140Ujhhgtgfeyxiexzf c3140Ujhhgtgfeyxiexzf = this.f10457Ujhhgtgfeyxiexzf;
        int iM4943Ujhhgtgfeyxiexzf = c3444feyxiexzfUjhhgtg.m4943Ujhhgtgfeyxiexzf(c3140Ujhhgtgfeyxiexzf);
        int i3 = iM4943Ujhhgtgfeyxiexzf - i;
        boolean zM3888Ujhhgtgfeyxiexzf = c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf();
        int i4 = this.f10458Ujhhgtgfeyxiexzf;
        if (zM3888Ujhhgtgfeyxiexzf) {
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, String.format("  [%x] %s", Integer.valueOf(i2), c3140Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf()));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(i3), "    field_idx:    ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM4943Ujhhgtgfeyxiexzf)));
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(AbstractC1264feyxiexzfUjhhgtg.m2812Ujhhgtgfeyxiexzf(i4), "    access_flags: " + AbstractC3612feyxiexzfUjhhgtg.m5238Ujhhgtgfeyxiexzf(i4, 20703, 2));
        }
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(i3);
        c2608Ujhhgtgfeyxiexzf.m3897Ujhhgtgfeyxiexzf(i4);
        return iM4943Ujhhgtgfeyxiexzf;
    }
}
