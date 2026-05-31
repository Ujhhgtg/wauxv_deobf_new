package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᲀᲁᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1575 extends AbstractC3700 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final int[] f5469 = new int[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static void m3453(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
        int i6 = i2 - i;
        int i7 = i4 - i3;
        if (i5 != -1) {
            if (i5 == 0) {
                iArr[0] = (int) ((i7 * f) + 0.5f);
                iArr[1] = i7;
                return;
            } else {
                if (i5 != 1) {
                    return;
                }
                iArr[0] = i6;
                iArr[1] = (int) ((i6 * f) + 0.5f);
                return;
            }
        }
        int i8 = (int) ((i7 * f) + 0.5f);
        int i9 = (int) ((i6 / f) + 0.5f);
        if (i8 <= i6) {
            iArr[0] = i8;
            iArr[1] = i7;
        } else if (i9 <= i7) {
            iArr[0] = i6;
            iArr[1] = i9;
        }
    }

    public final String toString() {
        return "HorizontalRun " + this.f11536.f3133;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
        float f;
        int iM5237;
        int i;
        int iM5238;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC2844.m4792(this.f11544) == 3) {
            C0792 c0792 = this.f11536;
            m5238(c0792.f3108, c0792.f3110, 0);
            return;
        }
        C1045 c1045 = this.f11539;
        boolean z = c1045.f3717;
        C1017 c1017 = this.f11542;
        C1017 c1018 = this.f11543;
        if (z || this.f11538 != 3) {
            f = 0.5f;
        } else {
            C0792 c0793 = this.f11536;
            int i3 = c0793.f3091;
            if (i3 == 2) {
                f = 0.5f;
                C0792 c0794 = c0793.f3119;
                if (c0794 != null) {
                    C1045 c1046 = c0794.f3083.f11539;
                    if (c1046.f3717) {
                        c1045.mo2712((int) ((c1046.f3714 * c0793.f3096) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0793.f3092;
                if (i4 == 0 || i4 == 3) {
                    C3607 c3607 = c0793.f3084;
                    C1017 c1019 = c3607.f11542;
                    C1017 c10110 = c3607.f11543;
                    boolean z2 = c0793.f3108.f2888 != null;
                    boolean z3 = c0793.f3109.f2888 != null;
                    boolean z4 = c0793.f3110.f2888 != null;
                    boolean z5 = c0793.f3111.f2888 != null;
                    f = 0.5f;
                    int i5 = c0793.f3123;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c0793.f3122;
                        boolean z6 = c1019.f3717;
                        ArrayList arrayList = c1019.f3719;
                        int[] iArr = f5469;
                        if (z6 && c10110.f3717) {
                            if (c1017.f3710 && c1018.f3710) {
                                m3453(iArr, ((C1017) c1017.f3719.get(0)).f3714 + c1017.f3713, ((C1017) c1018.f3719.get(0)).f3714 - c1018.f3713, c1019.f3714 + c1019.f3713, c10110.f3714 - c10110.f3713, f5, i5);
                                c1045.mo2712(iArr[0]);
                                this.f11536.f3084.f11539.mo2712(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c1017.f3717 && c1018.f3717) {
                            if (!c1019.f3710 || !c10110.f3710) {
                                return;
                            }
                            m3453(iArr, c1017.f3714 + c1017.f3713, c1018.f3714 - c1018.f3713, ((C1017) arrayList.get(0)).f3714 + c1019.f3713, ((C1017) c10110.f3719.get(0)).f3714 - c10110.f3713, f5, i5);
                            c1045.mo2712(iArr[0]);
                            this.f11536.f3084.f11539.mo2712(iArr[1]);
                        }
                        if (!c1017.f3710 || !c1018.f3710 || !c1019.f3710 || !c10110.f3710) {
                            return;
                        }
                        m3453(iArr, ((C1017) c1017.f3719.get(0)).f3714 + c1017.f3713, ((C1017) c1018.f3719.get(0)).f3714 - c1018.f3713, ((C1017) arrayList.get(0)).f3714 + c1019.f3713, ((C1017) c10110.f3719.get(0)).f3714 - c10110.f3713, f5, i5);
                        c1045.mo2712(iArr[0]);
                        this.f11536.f3084.f11539.mo2712(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c1017.f3710 || !c1018.f3710) {
                            return;
                        }
                        float f6 = c0793.f3122;
                        int i6 = ((C1017) c1017.f3719.get(0)).f3714 + c1017.f3713;
                        int i7 = ((C1017) c1018.f3719.get(0)).f3714 - c1018.f3713;
                        if (i5 == -1 || i5 == 0) {
                            int iM5239 = m5237(i7 - i6, 0);
                            int i8 = (int) ((iM5239 * f6) + 0.5f);
                            int iM52310 = m5237(i8, 1);
                            if (i8 != iM52310) {
                                iM5239 = (int) ((iM52310 / f6) + 0.5f);
                            }
                            c1045.mo2712(iM5239);
                            this.f11536.f3084.f11539.mo2712(iM52310);
                        } else if (i5 == 1) {
                            int iM52311 = m5237(i7 - i6, 0);
                            int i9 = (int) ((iM52311 / f6) + 0.5f);
                            int iM52312 = m5237(i9, 1);
                            if (i9 != iM52312) {
                                iM52311 = (int) ((iM52312 * f6) + 0.5f);
                            }
                            c1045.mo2712(iM52311);
                            this.f11536.f3084.f11539.mo2712(iM52312);
                        }
                    } else if (z3 && z5) {
                        if (!c1019.f3710 || !c10110.f3710) {
                            return;
                        }
                        float f7 = c0793.f3122;
                        int i10 = ((C1017) c1019.f3719.get(0)).f3714 + c1019.f3713;
                        int i11 = ((C1017) c10110.f3719.get(0)).f3714 - c10110.f3713;
                        if (i5 == -1) {
                            iM5237 = m5237(i11 - i10, 1);
                            i = (int) ((iM5237 / f7) + 0.5f);
                            iM5238 = m5237(i, 0);
                            if (i != iM5238) {
                                iM5237 = (int) ((iM5238 * f7) + 0.5f);
                            }
                            c1045.mo2712(iM5238);
                            this.f11536.f3084.f11539.mo2712(iM5237);
                        } else if (i5 == 0) {
                            int iM52313 = m5237(i11 - i10, 1);
                            int i12 = (int) ((iM52313 * f7) + 0.5f);
                            int iM52314 = m5237(i12, 0);
                            if (i12 != iM52314) {
                                iM52313 = (int) ((iM52314 / f7) + 0.5f);
                            }
                            c1045.mo2712(iM52314);
                            this.f11536.f3084.f11539.mo2712(iM52313);
                        } else if (i5 == 1) {
                            iM5237 = m5237(i11 - i10, 1);
                            i = (int) ((iM5237 / f7) + 0.5f);
                            iM5238 = m5237(i, 0);
                            if (i != iM5238) {
                                iM5237 = (int) ((iM5238 * f7) + 0.5f);
                            }
                            c1045.mo2712(iM5238);
                            this.f11536.f3084.f11539.mo2712(iM5237);
                        }
                    }
                } else {
                    int i13 = c0793.f3123;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c0793.f3084.f11539.f3714 / c0793.f3122;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c0793.f3084.f11539.f3714;
                            f3 = c0793.f3122;
                        }
                        c1045.mo2712(i2);
                        f = 0.5f;
                    } else {
                        f2 = c0793.f3084.f11539.f3714;
                        f3 = c0793.f3122;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c1045.mo2712(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = c1017.f3710;
        ArrayList arrayList2 = c1017.f3719;
        if (z7) {
            boolean z8 = c1018.f3710;
            ArrayList arrayList3 = c1018.f3719;
            if (z8) {
                if (c1017.f3717 && c1018.f3717 && c1045.f3717) {
                    return;
                }
                if (!c1045.f3717 && this.f11538 == 3) {
                    C0792 c0795 = this.f11536;
                    if (c0795.f3091 == 0 && !c0795.m2437()) {
                        C1017 c10111 = (C1017) arrayList2.get(0);
                        C1017 c10112 = (C1017) arrayList3.get(0);
                        int i14 = c10111.f3714 + c1017.f3713;
                        int i15 = c10112.f3714 + c1018.f3713;
                        c1017.mo2712(i14);
                        c1018.mo2712(i15);
                        c1045.mo2712(i15 - i14);
                        return;
                    }
                }
                if (!c1045.f3717 && this.f11538 == 3 && this.f11535 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C1017) arrayList3.get(0)).f3714 + c1018.f3713) - (((C1017) arrayList2.get(0)).f3714 + c1017.f3713), c1045.f3801);
                    C0792 c0796 = this.f11536;
                    int i16 = c0796.f3095;
                    int iMax = Math.max(c0796.f3094, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c1045.mo2712(iMax);
                }
                if (c1045.f3717) {
                    C1017 c10113 = (C1017) arrayList2.get(0);
                    C1017 c10114 = (C1017) arrayList3.get(0);
                    int i17 = c10113.f3714;
                    int i18 = c1017.f3713 + i17;
                    int i19 = c10114.f3714;
                    int i20 = c1018.f3713 + i19;
                    float f8 = this.f11536.f3129;
                    if (c10113 == c10114) {
                        f8 = f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c1017.mo2712((int) ((((i19 - i17) - c1045.f3714) * f8) + i17 + f));
                    c1018.mo2712(c1017.f3714 + c1045.f3714);
                }
            }
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2101() {
        C0792 c0792;
        C0792 c0793;
        C0792 c0794;
        C0792 c0795;
        C0792 c0796 = this.f11536;
        boolean z = c0796.f3080;
        C1045 c1045 = this.f11539;
        if (z) {
            c1045.mo2712(c0796.m2431());
        }
        boolean z2 = c1045.f3717;
        ArrayList arrayList = c1045.f3718;
        ArrayList arrayList2 = c1045.f3719;
        C1017 c1017 = this.f11543;
        C1017 c1018 = this.f11542;
        if (!z2) {
            C0792 c0797 = this.f11536;
            int i = c0797.f3141[0];
            this.f11538 = i;
            if (i != 3) {
                if (i == 4 && (((c0795 = c0797.f3119) != null && c0795.f3141[0] == 1) || c0795.f3141[0] == 4)) {
                    int iM2431 = (c0795.m2431() - this.f11536.f3108.m2389()) - this.f11536.f3110.m2389();
                    AbstractC3700.m5233(c1018, c0795.f3083.f11542, this.f11536.f3108.m2389());
                    AbstractC3700.m5233(c1017, c0795.f3083.f11543, -this.f11536.f3110.m2389());
                    c1045.mo2712(iM2431);
                    return;
                }
                if (i == 1) {
                    c1045.mo2712(c0797.m2431());
                }
            }
        } else if (this.f11538 == 4 && (((c0793 = (c0792 = this.f11536).f3119) != null && c0793.f3141[0] == 1) || c0793.f3141[0] == 4)) {
            AbstractC3700.m5233(c1018, c0793.f3083.f11542, c0792.f3108.m2389());
            AbstractC3700.m5233(c1017, c0793.f3083.f11543, -this.f11536.f3110.m2389());
            return;
        }
        if (c1045.f3717) {
            C0792 c0798 = this.f11536;
            if (c0798.f3080) {
                C0778[] c0778Arr = c0798.f3116;
                C0778 c0778 = c0778Arr[0];
                C0778 c0779 = c0778.f2888;
                if (c0779 != null && c0778Arr[1].f2888 != null) {
                    if (c0798.m2437()) {
                        c1018.f3713 = this.f11536.f3116[0].m2389();
                        c1017.f3713 = -this.f11536.f3116[1].m2389();
                        return;
                    }
                    C1017 c1017M5234 = AbstractC3700.m5234(this.f11536.f3116[0]);
                    if (c1017M5234 != null) {
                        AbstractC3700.m5233(c1018, c1017M5234, this.f11536.f3116[0].m2389());
                    }
                    C1017 c1017M5235 = AbstractC3700.m5234(this.f11536.f3116[1]);
                    if (c1017M5235 != null) {
                        AbstractC3700.m5233(c1017, c1017M5235, -this.f11536.f3116[1].m2389());
                    }
                    c1018.f3709 = true;
                    c1017.f3709 = true;
                    return;
                }
                if (c0779 != null) {
                    C1017 c1017M5236 = AbstractC3700.m5234(c0778);
                    if (c1017M5236 != null) {
                        AbstractC3700.m5233(c1018, c1017M5236, this.f11536.f3116[0].m2389());
                        AbstractC3700.m5233(c1017, c1018, c1045.f3714);
                        return;
                    }
                    return;
                }
                C0778 c07710 = c0778Arr[1];
                if (c07710.f2888 != null) {
                    C1017 c1017M5237 = AbstractC3700.m5234(c07710);
                    if (c1017M5237 != null) {
                        AbstractC3700.m5233(c1017, c1017M5237, -this.f11536.f3116[1].m2389());
                        AbstractC3700.m5233(c1018, c1017, -c1045.f3714);
                        return;
                    }
                    return;
                }
                if ((c0798 instanceof AbstractC1544) || c0798.f3119 == null || c0798.mo2426(7).f2888 != null) {
                    return;
                }
                C0792 c0799 = this.f11536;
                AbstractC3700.m5233(c1018, c0799.f3119.f3083.f11542, c0799.m2432());
                AbstractC3700.m5233(c1017, c1018, c1045.f3714);
                return;
            }
        }
        if (this.f11538 == 3) {
            C0792 c07910 = this.f11536;
            int i2 = c07910.f3091;
            if (i2 == 2) {
                C0792 c07911 = c07910.f3119;
                if (c07911 != null) {
                    C1045 c1046 = c07911.f3084.f11539;
                    arrayList2.add(c1046);
                    c1046.f3718.add(c1045);
                    c1045.f3709 = true;
                    arrayList.add(c1018);
                    arrayList.add(c1017);
                }
            } else if (i2 == 3) {
                if (c07910.f3092 == 3) {
                    c1018.f3708 = this;
                    c1017.f3708 = this;
                    C3607 c3607 = c07910.f3084;
                    c3607.f11542.f3708 = this;
                    c3607.f11543.f3708 = this;
                    c1045.f3708 = this;
                    if (c07910.m2438()) {
                        arrayList2.add(this.f11536.f3084.f11539);
                        this.f11536.f3084.f11539.f3718.add(c1045);
                        C3607 c3608 = this.f11536.f3084;
                        c3608.f11539.f3708 = this;
                        arrayList2.add(c3608.f11542);
                        arrayList2.add(this.f11536.f3084.f11543);
                        this.f11536.f3084.f11542.f3718.add(c1045);
                        this.f11536.f3084.f11543.f3718.add(c1045);
                    } else if (this.f11536.m2437()) {
                        this.f11536.f3084.f11539.f3719.add(c1045);
                        arrayList.add(this.f11536.f3084.f11539);
                    } else {
                        this.f11536.f3084.f11539.f3719.add(c1045);
                    }
                } else {
                    C1045 c1047 = c07910.f3084.f11539;
                    arrayList2.add(c1047);
                    c1047.f3718.add(c1045);
                    this.f11536.f3084.f11542.f3718.add(c1045);
                    this.f11536.f3084.f11543.f3718.add(c1045);
                    c1045.f3709 = true;
                    arrayList.add(c1018);
                    arrayList.add(c1017);
                    c1018.f3719.add(c1045);
                    c1017.f3719.add(c1045);
                }
            }
        }
        C0792 c07912 = this.f11536;
        C0778[] c0778Arr2 = c07912.f3116;
        C0778 c07711 = c0778Arr2[0];
        C0778 c07712 = c07711.f2888;
        if (c07712 != null && c0778Arr2[1].f2888 != null) {
            if (c07912.m2437()) {
                c1018.f3713 = this.f11536.f3116[0].m2389();
                c1017.f3713 = -this.f11536.f3116[1].m2389();
                return;
            }
            C1017 c1017M5238 = AbstractC3700.m5234(this.f11536.f3116[0]);
            C1017 c1017M5239 = AbstractC3700.m5234(this.f11536.f3116[1]);
            c1017M5238.m2710(this);
            c1017M5239.m2710(this);
            this.f11544 = 4;
            return;
        }
        if (c07712 != null) {
            C1017 c1017M52310 = AbstractC3700.m5234(c07711);
            if (c1017M52310 != null) {
                AbstractC3700.m5233(c1018, c1017M52310, this.f11536.f3116[0].m2389());
                m5236(c1017, c1018, 1, c1045);
                return;
            }
            return;
        }
        C0778 c07713 = c0778Arr2[1];
        if (c07713.f2888 != null) {
            C1017 c1017M52311 = AbstractC3700.m5234(c07713);
            if (c1017M52311 != null) {
                AbstractC3700.m5233(c1017, c1017M52311, -this.f11536.f3116[1].m2389());
                m5236(c1018, c1017, -1, c1045);
                return;
            }
            return;
        }
        if ((c07912 instanceof AbstractC1544) || (c0794 = c07912.f3119) == null) {
            return;
        }
        AbstractC3700.m5233(c1018, c0794.f3083.f11542, c07912.m2432());
        m5236(c1017, c1018, 1, c1045);
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2102() {
        C1017 c1017 = this.f11542;
        if (c1017.f3717) {
            this.f11536.f3124 = c1017.f3714;
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2103() {
        this.f11537 = null;
        this.f11542.m2711();
        this.f11543.m2711();
        this.f11539.m2711();
        this.f11541 = false;
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2105() {
        return this.f11538 != 3 || this.f11536.f3091 == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3454() {
        this.f11541 = false;
        C1017 c1017 = this.f11542;
        c1017.m2711();
        c1017.f3717 = false;
        C1017 c1018 = this.f11543;
        c1018.m2711();
        c1018.f3717 = false;
        this.f11539.f3717 = false;
    }
}
