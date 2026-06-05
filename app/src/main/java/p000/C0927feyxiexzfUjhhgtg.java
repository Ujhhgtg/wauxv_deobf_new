package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛲᛳ要点脸ᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0927feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f3750Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1784feyxiexzfUjhhgtg f3751Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f3752Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC1790feyxiexzfUjhhgtg f3753Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f3754Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final boolean f3755Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f3756Ujhhgtgfeyxiexzf;

    public C0927feyxiexzfUjhhgtg(int i, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg2, int i2, boolean z, String str) {
        if (c1784feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("result == null");
        }
        if (interfaceC1790feyxiexzfUjhhgtg == null) {
            throw new NullPointerException("sources == null");
        }
        if (interfaceC1790feyxiexzfUjhhgtg2 == null) {
            throw new NullPointerException("exceptions == null");
        }
        if (i2 < 1 || i2 > 6) {
            throw new IllegalArgumentException(AbstractC3317feyxiexzfUjhhgtg.m4795Ujhhgtgfeyxiexzf(i2, "invalid branchingness: "));
        }
        if (interfaceC1790feyxiexzfUjhhgtg2.size() != 0 && i2 != 6) {
            throw new IllegalArgumentException("exceptions / branchingness mismatch");
        }
        this.f3750Ujhhgtgfeyxiexzf = i;
        this.f3751Ujhhgtgfeyxiexzf = c1784feyxiexzfUjhhgtg;
        this.f3752Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg;
        this.f3753Ujhhgtgfeyxiexzf = interfaceC1790feyxiexzfUjhhgtg2;
        this.f3754Ujhhgtgfeyxiexzf = i2;
        this.f3755Ujhhgtgfeyxiexzf = z;
        this.f3756Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0927feyxiexzfUjhhgtg)) {
            return false;
        }
        C0927feyxiexzfUjhhgtg c0927feyxiexzfUjhhgtg = (C0927feyxiexzfUjhhgtg) obj;
        return this.f3750Ujhhgtgfeyxiexzf == c0927feyxiexzfUjhhgtg.f3750Ujhhgtgfeyxiexzf && this.f3754Ujhhgtgfeyxiexzf == c0927feyxiexzfUjhhgtg.f3754Ujhhgtgfeyxiexzf && this.f3751Ujhhgtgfeyxiexzf == c0927feyxiexzfUjhhgtg.f3751Ujhhgtgfeyxiexzf && this.f3752Ujhhgtgfeyxiexzf.equals(c0927feyxiexzfUjhhgtg.f3752Ujhhgtgfeyxiexzf) && this.f3753Ujhhgtgfeyxiexzf.equals(c0927feyxiexzfUjhhgtg.f3753Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f3753Ujhhgtgfeyxiexzf.hashCode() + ((this.f3752Ujhhgtgfeyxiexzf.hashCode() + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(((this.f3750Ujhhgtgfeyxiexzf * 31) + this.f3754Ujhhgtgfeyxiexzf) * 31, 31, this.f3751Ujhhgtgfeyxiexzf.f6017Ujhhgtgfeyxiexzf)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(40);
        sb.append("Rop{");
        sb.append(AbstractC1246feyxiexzfUjhhgtg.m2768Ujhhgtgfeyxiexzf(this.f3750Ujhhgtgfeyxiexzf));
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg = C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf;
        C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg2 = this.f3751Ujhhgtgfeyxiexzf;
        if (c1784feyxiexzfUjhhgtg2 != c1784feyxiexzfUjhhgtg) {
            sb.append(" ");
            sb.append(c1784feyxiexzfUjhhgtg2);
        } else {
            sb.append(" .");
        }
        sb.append(" <-");
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg = this.f3752Ujhhgtgfeyxiexzf;
        int size = interfaceC1790feyxiexzfUjhhgtg.size();
        if (size == 0) {
            sb.append(" .");
        } else {
            for (int i = 0; i < size; i++) {
                sb.append(' ');
                sb.append(interfaceC1790feyxiexzfUjhhgtg.getType(i));
            }
        }
        if (this.f3755Ujhhgtgfeyxiexzf) {
            sb.append(" call");
        }
        InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg2 = this.f3753Ujhhgtgfeyxiexzf;
        int size2 = interfaceC1790feyxiexzfUjhhgtg2.size();
        if (size2 != 0) {
            sb.append(" throws");
            for (int i2 = 0; i2 < size2; i2++) {
                sb.append(' ');
                if (interfaceC1790feyxiexzfUjhhgtg2.getType(i2) == C1784feyxiexzfUjhhgtg.f5998feyxiexzfUjhhgtg) {
                    sb.append("<any>");
                } else {
                    sb.append(interfaceC1790feyxiexzfUjhhgtg2.getType(i2));
                }
            }
        } else {
            int i3 = this.f3754Ujhhgtgfeyxiexzf;
            if (i3 == 1) {
                sb.append(" flows");
            } else if (i3 == 2) {
                sb.append(" returns");
            } else if (i3 == 3) {
                sb.append(" gotos");
            } else if (i3 == 4) {
                sb.append(" ifs");
            } else if (i3 != 5) {
                sb.append(" ".concat(AbstractC1264feyxiexzfUjhhgtg.m2808Ujhhgtgfeyxiexzf(i3)));
            } else {
                sb.append(" switches");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final boolean m2428Ujhhgtgfeyxiexzf() {
        return this.f3753Ujhhgtgfeyxiexzf.size() != 0;
    }

    public C0927feyxiexzfUjhhgtg(int i, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, int i2, String str) {
        this(i, c1784feyxiexzfUjhhgtg, interfaceC1790feyxiexzfUjhhgtg, C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf, i2, false, str);
    }

    public C0927feyxiexzfUjhhgtg(int i, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, String str) {
        this(i, c1784feyxiexzfUjhhgtg, interfaceC1790feyxiexzfUjhhgtg, C1163feyxiexzfUjhhgtg.f4359Ujhhgtgfeyxiexzf, 1, false, str);
    }

    public C0927feyxiexzfUjhhgtg(int i, C1784feyxiexzfUjhhgtg c1784feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg2, String str) {
        this(i, c1784feyxiexzfUjhhgtg, interfaceC1790feyxiexzfUjhhgtg, interfaceC1790feyxiexzfUjhhgtg2, 6, false, str);
    }

    public C0927feyxiexzfUjhhgtg(int i, C1163feyxiexzfUjhhgtg c1163feyxiexzfUjhhgtg, InterfaceC1790feyxiexzfUjhhgtg interfaceC1790feyxiexzfUjhhgtg) {
        this(i, C1784feyxiexzfUjhhgtg.f5987Ujhhgtgfeyxiexzf, c1163feyxiexzfUjhhgtg, interfaceC1790feyxiexzfUjhhgtg, 6, true, null);
    }
}
