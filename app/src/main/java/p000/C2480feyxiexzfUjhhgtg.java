package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2480feyxiexzfUjhhgtg extends AbstractC0548Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public int f8107Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: contains not printable characters */
    public boolean f8108feyxiexzfUjhhgtg;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f8109Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛲᛴᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean f8110Ujhhgtgfeyxiexzf;

    @Override // p000.C3655Ujhhgtgfeyxiexzf
    public final String toString() {
        String strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2706Ujhhgtgfeyxiexzf(new StringBuilder("[Barrier] "), this.f11623Ujhhgtgfeyxiexzf, " {");
        for (int i = 0; i < this.f2540feyxiexzfUjhhgtg; i++) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f2539feyxiexzfUjhhgtg[i];
            if (i > 0) {
                strM2706Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2706Ujhhgtgfeyxiexzf, ", ");
            }
            StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(strM2706Ujhhgtgfeyxiexzf);
            sbM2707Ujhhgtgfeyxiexzf.append(c3655Ujhhgtgfeyxiexzf.f11623Ujhhgtgfeyxiexzf);
            strM2706Ujhhgtgfeyxiexzf = sbM2707Ujhhgtgfeyxiexzf.toString();
        }
        return AbstractC1225feyxiexzfUjhhgtg.m2703Ujhhgtgfeyxiexzf(strM2706Ujhhgtgfeyxiexzf, "}");
    }

    @Override // p000.C3655Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final void mo1812Ujhhgtgfeyxiexzf(C0072Ujhhgtgfeyxiexzf c0072Ujhhgtgfeyxiexzf, boolean z) {
        boolean z2;
        int i;
        int i2;
        C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr = this.f11606feyxiexzfUjhhgtg;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf = this.f11598feyxiexzfUjhhgtg;
        c3641UjhhgtgfeyxiexzfArr[0] = c3641Ujhhgtgfeyxiexzf;
        int i3 = 2;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf2 = this.f11599feyxiexzfUjhhgtg;
        c3641UjhhgtgfeyxiexzfArr[2] = c3641Ujhhgtgfeyxiexzf2;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf3 = this.f11600feyxiexzfUjhhgtg;
        c3641UjhhgtgfeyxiexzfArr[1] = c3641Ujhhgtgfeyxiexzf3;
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf4 = this.f11601feyxiexzfUjhhgtg;
        c3641UjhhgtgfeyxiexzfArr[3] = c3641Ujhhgtgfeyxiexzf4;
        for (C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf5 : c3641UjhhgtgfeyxiexzfArr) {
            c3641Ujhhgtgfeyxiexzf5.f11381Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf5);
        }
        int i4 = this.f8107Ujhhgtgfeyxiexzf;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf6 = c3641UjhhgtgfeyxiexzfArr[i4];
        if (!this.f8110Ujhhgtgfeyxiexzf) {
            m3760feyxiexzfUjhhgtg();
        }
        if (this.f8110Ujhhgtgfeyxiexzf) {
            this.f8110Ujhhgtgfeyxiexzf = false;
            int i5 = this.f8107Ujhhgtgfeyxiexzf;
            if (i5 == 0 || i5 == 1) {
                c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, this.f11614feyxiexzfUjhhgtg);
                c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf, this.f11614feyxiexzfUjhhgtg);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, this.f11615feyxiexzfUjhhgtg);
                    c0072Ujhhgtgfeyxiexzf.m1090Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf, this.f11615feyxiexzfUjhhgtg);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f2540feyxiexzfUjhhgtg) {
                z2 = false;
                break;
            }
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f2539feyxiexzfUjhhgtg[i6];
            if ((this.f8108feyxiexzfUjhhgtg || c3655Ujhhgtgfeyxiexzf.mo1813Ujhhgtgfeyxiexzf()) && ((((i2 = this.f8107Ujhhgtgfeyxiexzf) == 0 || i2 == 1) && c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf[0] == 3 && c3655Ujhhgtgfeyxiexzf.f11598feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null && c3655Ujhhgtgfeyxiexzf.f11600feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null) || ((i2 == 2 || i2 == 3) && c3655Ujhhgtgfeyxiexzf.f11631Ujhhgtgfeyxiexzf[1] == 3 && c3655Ujhhgtgfeyxiexzf.f11599feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null && c3655Ujhhgtgfeyxiexzf.f11601feyxiexzfUjhhgtg.f11378Ujhhgtgfeyxiexzf != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c3641Ujhhgtgfeyxiexzf.m5291Ujhhgtgfeyxiexzf() || c3641Ujhhgtgfeyxiexzf3.m5291Ujhhgtgfeyxiexzf();
        boolean z4 = c3641Ujhhgtgfeyxiexzf2.m5291Ujhhgtgfeyxiexzf() || c3641Ujhhgtgfeyxiexzf4.m5291Ujhhgtgfeyxiexzf();
        int i7 = !(!z2 && (((i = this.f8107Ujhhgtgfeyxiexzf) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f2540feyxiexzfUjhhgtg) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = this.f2539feyxiexzfUjhhgtg[i8];
            if (this.f8108feyxiexzfUjhhgtg || c3655Ujhhgtgfeyxiexzf2.mo1813Ujhhgtgfeyxiexzf()) {
                C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1097Ujhhgtgfeyxiexzf(c3655Ujhhgtgfeyxiexzf2.f11606feyxiexzfUjhhgtg[this.f8107Ujhhgtgfeyxiexzf]);
                C3641Ujhhgtgfeyxiexzf[] c3641UjhhgtgfeyxiexzfArr2 = c3655Ujhhgtgfeyxiexzf2.f11606feyxiexzfUjhhgtg;
                int i9 = this.f8107Ujhhgtgfeyxiexzf;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf7 = c3641UjhhgtgfeyxiexzfArr2[i9];
                c3641Ujhhgtgfeyxiexzf7.f11381Ujhhgtgfeyxiexzf = c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf;
                C3641Ujhhgtgfeyxiexzf c3641Ujhhgtgfeyxiexzf8 = c3641Ujhhgtgfeyxiexzf7.f11378Ujhhgtgfeyxiexzf;
                int i10 = (c3641Ujhhgtgfeyxiexzf8 == null || c3641Ujhhgtgfeyxiexzf8.f11376Ujhhgtgfeyxiexzf != this) ? 0 : c3641Ujhhgtgfeyxiexzf7.f11379Ujhhgtgfeyxiexzf;
                if (i9 == 0 || i9 == i3) {
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg = c3641Ujhhgtgfeyxiexzf6.f11381Ujhhgtgfeyxiexzf;
                    int i11 = this.f8109Ujhhgtgfeyxiexzf - i10;
                    C2394Ujhhgtgfeyxiexzf c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1098Ujhhgtgfeyxiexzf();
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf = c0072Ujhhgtgfeyxiexzf.m1099Ujhhgtgfeyxiexzf();
                    c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf.f4537Ujhhgtgfeyxiexzf = 0;
                    c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf.m3658Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg, c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf, i11);
                    c0072Ujhhgtgfeyxiexzf.m1089Ujhhgtgfeyxiexzf(c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf);
                } else {
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtg2 = c3641Ujhhgtgfeyxiexzf6.f11381Ujhhgtgfeyxiexzf;
                    int i12 = this.f8109Ujhhgtgfeyxiexzf + i10;
                    C2394Ujhhgtgfeyxiexzf c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf2 = c0072Ujhhgtgfeyxiexzf.m1098Ujhhgtgfeyxiexzf();
                    C1224feyxiexzfUjhhgtg c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf2 = c0072Ujhhgtgfeyxiexzf.m1099Ujhhgtgfeyxiexzf();
                    c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf2.f4537Ujhhgtgfeyxiexzf = 0;
                    c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf2.m3657Ujhhgtgfeyxiexzf(c1224feyxiexzfUjhhgtg2, c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtgM1099Ujhhgtgfeyxiexzf2, i12);
                    c0072Ujhhgtgfeyxiexzf.m1089Ujhhgtgfeyxiexzf(c2394UjhhgtgfeyxiexzfM1098Ujhhgtgfeyxiexzf2);
                }
                c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf6.f11381Ujhhgtgfeyxiexzf, c1224feyxiexzfUjhhgtgM1097Ujhhgtgfeyxiexzf, this.f8109Ujhhgtgfeyxiexzf + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f8107Ujhhgtgfeyxiexzf;
        if (i13 == 0) {
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, 0, 8);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11600feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 4);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11598feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 0);
            return;
        }
        if (i13 == 1) {
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf3.f11381Ujhhgtgfeyxiexzf, 0, 8);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11598feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 4);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11600feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 0);
        } else if (i13 == 2) {
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, 0, 8);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11601feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 4);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11599feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 0);
        } else if (i13 == 3) {
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, c3641Ujhhgtgfeyxiexzf4.f11381Ujhhgtgfeyxiexzf, 0, 8);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11599feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 4);
            c0072Ujhhgtgfeyxiexzf.m1091Ujhhgtgfeyxiexzf(c3641Ujhhgtgfeyxiexzf2.f11381Ujhhgtgfeyxiexzf, this.f11609feyxiexzfUjhhgtg.f11601feyxiexzfUjhhgtg.f11381Ujhhgtgfeyxiexzf, 0, 0);
        }
    }

    @Override // p000.C3655Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final boolean mo1813Ujhhgtgfeyxiexzf() {
        return true;
    }

    @Override // p000.C3655Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ */
    public final boolean mo1815Ujhhgtgfeyxiexzf() {
        return this.f8110Ujhhgtgfeyxiexzf;
    }

    @Override // p000.C3655Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ */
    public final boolean mo1816Ujhhgtgfeyxiexzf() {
        return this.f8110Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final boolean m3760feyxiexzfUjhhgtg() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f2540feyxiexzfUjhhgtg;
            if (i4 >= i) {
                break;
            }
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf = this.f2539feyxiexzfUjhhgtg[i4];
            if ((this.f8108feyxiexzfUjhhgtg || c3655Ujhhgtgfeyxiexzf.mo1813Ujhhgtgfeyxiexzf()) && ((((i2 = this.f8107Ujhhgtgfeyxiexzf) == 0 || i2 == 1) && !c3655Ujhhgtgfeyxiexzf.mo1815Ujhhgtgfeyxiexzf()) || (((i3 = this.f8107Ujhhgtgfeyxiexzf) == 2 || i3 == 3) && !c3655Ujhhgtgfeyxiexzf.mo1816Ujhhgtgfeyxiexzf()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f2540feyxiexzfUjhhgtg; i5++) {
            C3655Ujhhgtgfeyxiexzf c3655Ujhhgtgfeyxiexzf2 = this.f2539feyxiexzfUjhhgtg[i5];
            if (this.f8108feyxiexzfUjhhgtg || c3655Ujhhgtgfeyxiexzf2.mo1813Ujhhgtgfeyxiexzf()) {
                if (!z2) {
                    int i6 = this.f8107Ujhhgtgfeyxiexzf;
                    if (i6 == 0) {
                        iMax = c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(2).m5288Ujhhgtgfeyxiexzf();
                    } else if (i6 == 1) {
                        iMax = c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(4).m5288Ujhhgtgfeyxiexzf();
                    } else if (i6 == 2) {
                        iMax = c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(3).m5288Ujhhgtgfeyxiexzf();
                    } else if (i6 == 3) {
                        iMax = c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(5).m5288Ujhhgtgfeyxiexzf();
                    }
                    z2 = true;
                }
                int i7 = this.f8107Ujhhgtgfeyxiexzf;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(2).m5288Ujhhgtgfeyxiexzf());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(4).m5288Ujhhgtgfeyxiexzf());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(3).m5288Ujhhgtgfeyxiexzf());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c3655Ujhhgtgfeyxiexzf2.mo1814Ujhhgtgfeyxiexzf(5).m5288Ujhhgtgfeyxiexzf());
                }
            }
        }
        int i8 = iMax + this.f8109Ujhhgtgfeyxiexzf;
        int i9 = this.f8107Ujhhgtgfeyxiexzf;
        if (i9 == 0 || i9 == 1) {
            m5342feyxiexzfUjhhgtg(i8, i8);
        } else {
            m5343feyxiexzfUjhhgtg(i8, i8);
        }
        this.f8110Ujhhgtgfeyxiexzf = true;
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final int m3761feyxiexzfUjhhgtg() {
        int i = this.f8107Ujhhgtgfeyxiexzf;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }
}
