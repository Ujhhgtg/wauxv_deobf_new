package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛴᛲᛱUjhhgtgᛱᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1146feyxiexzfUjhhgtg extends AbstractC0644Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f4335Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public C1151feyxiexzfUjhhgtg f4336Ujhhgtgfeyxiexzf;

    public C1146feyxiexzfUjhhgtg(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf) {
        if (c3056Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("value == null");
        }
        this.f4335Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf;
        this.f4336Ujhhgtgfeyxiexzf = null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4335Ujhhgtgfeyxiexzf.compareTo(((C1146feyxiexzfUjhhgtg) obj).f4335Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1146feyxiexzfUjhhgtg) {
            return this.f4335Ujhhgtgfeyxiexzf.equals(((C1146feyxiexzfUjhhgtg) obj).f4335Ujhhgtgfeyxiexzf);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4335Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final void mo1274Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg) {
        if (this.f4336Ujhhgtgfeyxiexzf == null) {
            C0295Ujhhgtgfeyxiexzf c0295Ujhhgtgfeyxiexzf = c3268feyxiexzfUjhhgtg.f10263Ujhhgtgfeyxiexzf;
            C1151feyxiexzfUjhhgtg c1151feyxiexzfUjhhgtg = new C1151feyxiexzfUjhhgtg(this.f4335Ujhhgtgfeyxiexzf);
            this.f4336Ujhhgtgfeyxiexzf = c1151feyxiexzfUjhhgtg;
            c0295Ujhhgtgfeyxiexzf.m1509Ujhhgtgfeyxiexzf(c1151feyxiexzfUjhhgtg);
        }
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final EnumC0704Ujhhgtgfeyxiexzf mo1275Ujhhgtgfeyxiexzf() {
        return EnumC0704Ujhhgtgfeyxiexzf.f2887Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final int mo1294Ujhhgtgfeyxiexzf() {
        return 4;
    }

    @Override // p000.AbstractC0691Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ */
    public final void mo1295Ujhhgtgfeyxiexzf(C3268feyxiexzfUjhhgtg c3268feyxiexzfUjhhgtg, C2608Ujhhgtgfeyxiexzf c2608Ujhhgtgfeyxiexzf) {
        String str;
        int iM2857Ujhhgtgfeyxiexzf = this.f4336Ujhhgtgfeyxiexzf.m2857Ujhhgtgfeyxiexzf();
        if (c2608Ujhhgtgfeyxiexzf.m3888Ujhhgtgfeyxiexzf()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m1910Ujhhgtgfeyxiexzf());
            sb.append(' ');
            String strMo1392Ujhhgtgfeyxiexzf = this.f4335Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf();
            if (strMo1392Ujhhgtgfeyxiexzf.length() <= 98) {
                str = "";
            } else {
                strMo1392Ujhhgtgfeyxiexzf = strMo1392Ujhhgtgfeyxiexzf.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo1392Ujhhgtgfeyxiexzf + str + '\"');
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(0, sb.toString());
            c2608Ujhhgtgfeyxiexzf.m3886Ujhhgtgfeyxiexzf(4, "  string_data_off: ".concat(AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf)));
        }
        c2608Ujhhgtgfeyxiexzf.m3894Ujhhgtgfeyxiexzf(iM2857Ujhhgtgfeyxiexzf);
    }
}
