package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᲁᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0367 extends AbstractC1532 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᤞᲀ, reason: contains not printable characters */
    public int f1743;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲇᲈᲀᤞ, reason: contains not printable characters */
    public boolean f1744;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲀᲇ, reason: contains not printable characters */
    public int f1745;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲁᲈᤞᲇᲀ, reason: contains not printable characters */
    public boolean f1746;

    @Override // p000.C0793
    public final String toString() {
        String strM4752 = AbstractC2784.m4752(new StringBuilder("[Barrier] "), this.f3126, " {");
        for (int i = 0; i < this.f5368; i++) {
            C0793 c0793 = this.f5367[i];
            if (i > 0) {
                strM4752 = AbstractC2784.m4748(strM4752, ", ");
            }
            StringBuilder sbM4753 = AbstractC2784.m4753(strM4752);
            sbM4753.append(c0793.f3126);
            strM4752 = sbM4753.toString();
        }
        return AbstractC2784.m4748(strM4752, "}");
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1485(C1791 c1791, boolean z) {
        boolean z2;
        int i;
        int i2;
        C0779[] c0779Arr = this.f3109;
        C0779 c0779 = this.f3101;
        c0779Arr[0] = c0779;
        int i3 = 2;
        C0779 c07710 = this.f3102;
        c0779Arr[2] = c07710;
        C0779 c07711 = this.f3103;
        c0779Arr[1] = c07711;
        C0779 c07712 = this.f3104;
        c0779Arr[3] = c07712;
        for (C0779 c07713 : c0779Arr) {
            c07713.f2884 = c1791.m3540(c07713);
        }
        int i4 = this.f1743;
        if (i4 < 0 || i4 >= 4) {
            return;
        }
        C0779 c07714 = c0779Arr[i4];
        if (!this.f1746) {
            m1489();
        }
        if (this.f1746) {
            this.f1746 = false;
            int i5 = this.f1743;
            if (i5 == 0 || i5 == 1) {
                c1791.m3533(c0779.f2884, this.f3117);
                c1791.m3533(c07711.f2884, this.f3117);
                return;
            } else {
                if (i5 == 2 || i5 == 3) {
                    c1791.m3533(c07710.f2884, this.f3118);
                    c1791.m3533(c07712.f2884, this.f3118);
                    return;
                }
                return;
            }
        }
        int i6 = 0;
        while (true) {
            if (i6 >= this.f5368) {
                z2 = false;
                break;
            }
            C0793 c0793 = this.f5367[i6];
            if ((this.f1744 || c0793.mo1486()) && ((((i2 = this.f1743) == 0 || i2 == 1) && c0793.f3134[0] == 3 && c0793.f3101.f2881 != null && c0793.f3103.f2881 != null) || ((i2 == 2 || i2 == 3) && c0793.f3134[1] == 3 && c0793.f3102.f2881 != null && c0793.f3104.f2881 != null))) {
                z2 = true;
                break;
            }
            i6++;
        }
        boolean z3 = c0779.m2276() || c07711.m2276();
        boolean z4 = c07710.m2276() || c07712.m2276();
        int i7 = !(!z2 && (((i = this.f1743) == 0 && z3) || ((i == 2 && z4) || ((i == 1 && z3) || (i == 3 && z4))))) ? 4 : 5;
        int i8 = 0;
        while (i8 < this.f5368) {
            C0793 c0794 = this.f5367[i8];
            if (this.f1744 || c0794.mo1486()) {
                C2785 c2785M3540 = c1791.m3540(c0794.f3109[this.f1743]);
                C0779[] c0779Arr2 = c0794.f3109;
                int i9 = this.f1743;
                C0779 c07715 = c0779Arr2[i9];
                c07715.f2884 = c2785M3540;
                C0779 c07716 = c07715.f2881;
                int i10 = (c07716 == null || c07716.f2879 != this) ? 0 : c07715.f2882;
                if (i9 == 0 || i9 == 2) {
                    C2785 c2785 = c07714.f2884;
                    int i11 = this.f1745 - i10;
                    C0266 c0266M3541 = c1791.m3541();
                    C2785 c2785M3542 = c1791.m3542();
                    c2785M3542.f8888 = 0;
                    c0266M3541.m1369(c2785, c2785M3540, c2785M3542, i11);
                    c1791.m3532(c0266M3541);
                } else {
                    C2785 c2786 = c07714.f2884;
                    int i12 = this.f1745 + i10;
                    C0266 c0266M3542 = c1791.m3541();
                    C2785 c2785M3543 = c1791.m3542();
                    c2785M3543.f8888 = 0;
                    c0266M3542.m1368(c2786, c2785M3540, c2785M3543, i12);
                    c1791.m3532(c0266M3542);
                }
                c1791.m3534(c07714.f2884, c2785M3540, this.f1745 + i10, i7);
            }
            i8++;
            i3 = 2;
        }
        int i13 = this.f1743;
        if (i13 == 0) {
            c1791.m3534(c07711.f2884, c0779.f2884, 0, 8);
            c1791.m3534(c0779.f2884, this.f3112.f3103.f2884, 0, 4);
            c1791.m3534(c0779.f2884, this.f3112.f3101.f2884, 0, 0);
            return;
        }
        if (i13 == 1) {
            c1791.m3534(c0779.f2884, c07711.f2884, 0, 8);
            c1791.m3534(c0779.f2884, this.f3112.f3101.f2884, 0, 4);
            c1791.m3534(c0779.f2884, this.f3112.f3103.f2884, 0, 0);
        } else if (i13 == 2) {
            c1791.m3534(c07712.f2884, c07710.f2884, 0, 8);
            c1791.m3534(c07710.f2884, this.f3112.f3104.f2884, 0, 4);
            c1791.m3534(c07710.f2884, this.f3112.f3102.f2884, 0, 0);
        } else if (i13 == 3) {
            c1791.m3534(c07710.f2884, c07712.f2884, 0, 8);
            c1791.m3534(c07710.f2884, this.f3112.f3102.f2884, 0, 4);
            c1791.m3534(c07710.f2884, this.f3112.f3104.f2884, 0, 0);
        }
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean mo1486() {
        return true;
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public final boolean mo1487() {
        return this.f1746;
    }

    @Override // p000.C0793
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final boolean mo1488() {
        return this.f1746;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final boolean m1489() {
        int i;
        int i2;
        int i3;
        boolean z = true;
        int i4 = 0;
        while (true) {
            i = this.f5368;
            if (i4 >= i) {
                break;
            }
            C0793 c0793 = this.f5367[i4];
            if ((this.f1744 || c0793.mo1486()) && ((((i2 = this.f1743) == 0 || i2 == 1) && !c0793.mo1487()) || (((i3 = this.f1743) == 2 || i3 == 3) && !c0793.mo1488()))) {
                z = false;
            }
            i4++;
        }
        if (!z || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z2 = false;
        for (int i5 = 0; i5 < this.f5368; i5++) {
            C0793 c0794 = this.f5367[i5];
            if (this.f1744 || c0794.mo1486()) {
                if (!z2) {
                    int i6 = this.f1743;
                    if (i6 == 0) {
                        iMax = c0794.mo2311(2).m2273();
                    } else if (i6 == 1) {
                        iMax = c0794.mo2311(4).m2273();
                    } else if (i6 == 2) {
                        iMax = c0794.mo2311(3).m2273();
                    } else if (i6 == 3) {
                        iMax = c0794.mo2311(5).m2273();
                    }
                    z2 = true;
                }
                int i7 = this.f1743;
                if (i7 == 0) {
                    iMax = Math.min(iMax, c0794.mo2311(2).m2273());
                } else if (i7 == 1) {
                    iMax = Math.max(iMax, c0794.mo2311(4).m2273());
                } else if (i7 == 2) {
                    iMax = Math.min(iMax, c0794.mo2311(3).m2273());
                } else if (i7 == 3) {
                    iMax = Math.max(iMax, c0794.mo2311(5).m2273());
                }
            }
        }
        int i8 = iMax + this.f1745;
        int i9 = this.f1743;
        if (i9 == 0 || i9 == 1) {
            m2329(i8, i8);
        } else {
            m2330(i8, i8);
        }
        this.f1746 = true;
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final int m1490() {
        int i = this.f1743;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }
}
