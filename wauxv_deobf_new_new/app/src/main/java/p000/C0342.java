package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᤞᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0342 extends AbstractC1544 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public int f1714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public boolean f1715;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f1716;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public boolean f1717;

    @Override // p000.C0792
    public final String toString() {
        String strM4786 = AbstractC2844.m4786(new StringBuilder("[Barrier] "), this.f3133, " {");
        for (int i = 0; i < this.f5399; i++) {
            C0792 c0792 = this.f5398[i];
            if (i > 0) {
                strM4786 = AbstractC2844.m4782(strM4786, ", ");
            }
            StringBuilder sbM4787 = AbstractC2844.m4787(strM4786);
            sbM4787.append(c0792.f3133);
            strM4786 = sbM4787.toString();
        }
        return AbstractC2844.m4782(strM4786, "}");
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1590(C1814 c1814, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0778[] c0778Arr = this.f3116;
        C0778 c0778 = this.f3108;
        c0778Arr[0] = c0778;
        int i3 = 2;
        C0778 c0779 = this.f3109;
        c0778Arr[2] = c0779;
        C0778 c07710 = this.f3110;
        c0778Arr[1] = c07710;
        C0778 c07711 = this.f3111;
        c0778Arr[3] = c07711;
        for (C0778 c07712 : c0778Arr) {
            c07712.f2891 = c1814.m3712(c07712);
        }
        int i4 = this.f1714;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0778 c07713 = c0778Arr[i4];
        if (!this.f1717) {
            m1594();
        }
        if (this.f1717) {
            this.f1717 = false;
            int i5 = this.f1714;
            if (i5 == 0 || i5 == 1) {
                c1814.m3705(c0778.f2891, this.f3124);
                c1814.m3705(c07710.f2891, this.f3124);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1814.m3705(c0779.f2891, this.f3125);
                    c1814.m3705(c07711.f2891, this.f3125);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f5399) {
                z2 = false;
                break;
            }
            C0792 c0792 = this.f5398[i6];
            if ((this.f1715 || c0792.mo1591()) && ((((i2 = this.f1714) == 0 || i2 == 1) && c0792.f3141[0] == 3 && c0792.f3108.f2888 != null && c0792.f3110.f2888 != null) || ((i2 == 2 || i2 == 3) && c0792.f3141[1] == 3 && c0792.f3109.f2888 != null && c0792.f3111.f2888 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0778.m2391() || c07710.m2391();
        boolean z4 = c0779.m2391() || c07711.m2391();
        int i7 = !(!z2 && (((i = this.f1714) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f5399) {
            C0792 c0793 = this.f5398[i8];
            if (this.f1715 || c0793.mo1591()) {
                C2845 c2845M3712 = c1814.m3712(c0793.f3116[this.f1714]);
                C0778[] c0778Arr2 = c0793.f3116;
                int i9 = this.f1714;
                C0778 c07714 = c0778Arr2[i9];
                c07714.f2891 = c2845M3712;
                C0778 c07715 = c07714.f2888;
                int i10 = (c07715 == null || c07715.f2886 != this) ? 0 : c07714.f2889;
                if (i9 == 0 || i9 == i3) {
                    C2845 c2845 = c07713.f2891;
                    int i11 = this.f1716 - i10;
                    C0276 c0276M3713 = c1814.m3713();
                    C2845 c2845M3714 = c1814.m3714();
                    c2845M3714.f9050 = 0;
                    c0276M3713.m1515(c2845, c2845M3712, c2845M3714, i11);
                    c1814.m3704(c0276M3713);
                } else {
                    C2845 c2846 = c07713.f2891;
                    int i12 = this.f1716 + i10;
                    C0276 c0276M3714 = c1814.m3713();
                    C2845 c2845M3715 = c1814.m3714();
                    c2845M3715.f9050 = 0;
                    c0276M3714.m1514(c2846, c2845M3712, c2845M3715, i12);
                    c1814.m3704(c0276M3714);
                }
                c1814.m3706(c07713.f2891, c2845M3712, this.f1716 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f1714;
        if (i13 == 0) {
            c1814.m3706(c07710.f2891, c0778.f2891, 0, 8);
            c1814.m3706(c0778.f2891, this.f3119.f3110.f2891, 0, 4);
            c1814.m3706(c0778.f2891, this.f3119.f3108.f2891, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1814.m3706(c0778.f2891, c07710.f2891, 0, 8);
            c1814.m3706(c0778.f2891, this.f3119.f3108.f2891, 0, 4);
            c1814.m3706(c0778.f2891, this.f3119.f3110.f2891, 0, 0);
        } else if (i13 == 2) {
            c1814.m3706(c07711.f2891, c0779.f2891, 0, 8);
            c1814.m3706(c0779.f2891, this.f3119.f3111.f2891, 0, 4);
            c1814.m3706(c0779.f2891, this.f3119.f3109.f2891, 0, 0);
        } else if (i13 == 3) {
            c1814.m3706(c0779.f2891, c07711.f2891, 0, 8);
            c1814.m3706(c0779.f2891, this.f3119.f3109.f2891, 0, 4);
            c1814.m3706(c0779.f2891, this.f3119.f3111.f2891, 0, 0);
        }
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo1591() {
        return true;
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean mo1592() {
        return this.f1717;
    }

    @Override // p000.C0792
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final boolean mo1593() {
        return this.f1717;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final boolean m1594() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f5399;
            if (i4 >= i) {
                break;
            }
            C0792 c0792 = this.f5398[i4];
            if ((this.f1715 || c0792.mo1591()) && ((((i2 = this.f1714) == 0 || i2 == 1) && !c0792.mo1592()) || (((i3 = this.f1714) == 2 || i3 == 3) && !c0792.mo1593()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f5399; i5++) {
            C0792 c0793 = this.f5398[i5];
            if (this.f1715 || c0793.mo1591()) {
                if (!z2) {
                    int i6 = this.f1714;
                    if (i6 == 0) {
                        iMax = c0793.mo2426(2).m2388();
                    } else if (i6 == 1) {
                        iMax = c0793.mo2426(4).m2388();
                    } else if (i6 == 2) {
                        iMax = c0793.mo2426(3).m2388();
                    } else if (i6 == 3) {
                        iMax = c0793.mo2426(5).m2388();
                    }
                    z2 = true;
                }
                int i7 = this.f1714;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c0793.mo2426(2).m2388());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c0793.mo2426(4).m2388());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c0793.mo2426(3).m2388());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c0793.mo2426(5).m2388());
                }
            }
        }
        int i8 = iMax + this.f1716;
        int i9 = this.f1714;
        if (i9 == 0 || i9 == 1) {
            m2444(i8, i8);
        } else {
            m2445(i8, i8);
        }
        this.f1717 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final int m1595() {
        int i = this.f1714;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }
}
