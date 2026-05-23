package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᛸᲇᤝᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1564 extends AbstractC3640 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final int[] f5439 = new int[2];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static void m3273(int[] iArr, int i, int i2, int i3, int i4, float f, int i5) {
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
        return "HorizontalRun " + this.f11387.f3126;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // p000.InterfaceC1012
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        float f;
        int iM5231;
        int i;
        int iM5232;
        float f2;
        float f3;
        float f4;
        int i2;
        if (AbstractC2784.m4759(this.f11395) == 3) {
            C0793 c0793 = this.f11387;
            m5232(c0793.f3101, c0793.f3103, 0);
            return;
        }
        C1042 c1042 = this.f11390;
        boolean z = c1042.f3710;
        C1014 c1014 = this.f11393;
        C1014 c1015 = this.f11394;
        if (z || this.f11389 != 3) {
            f = 0.5f;
        } else {
            C0793 c0794 = this.f11387;
            int i3 = c0794.f3084;
            if (i3 == 2) {
                f = 0.5f;
                C0793 c0795 = c0794.f3112;
                if (c0795 != null) {
                    C1042 c1043 = c0795.f3076.f11390;
                    if (c1043.f3710) {
                        c1042.mo2588((int) ((c1043.f3707 * c0794.f3089) + 0.5f));
                    }
                }
            } else if (i3 == 3) {
                int i4 = c0794.f3085;
                if (i4 == 0 || i4 == 3) {
                    C3549 c3549 = c0794.f3077;
                    C1014 c1016 = c3549.f11393;
                    C1014 c1017 = c3549.f11394;
                    boolean z2 = c0794.f3101.f2881 != null;
                    boolean z3 = c0794.f3102.f2881 != null;
                    boolean z4 = c0794.f3103.f2881 != null;
                    boolean z5 = c0794.f3104.f2881 != null;
                    f = 0.5f;
                    int i5 = c0794.f3116;
                    if (z2 && z3 && z4 && z5) {
                        float f5 = c0794.f3115;
                        boolean z6 = c1016.f3710;
                        ArrayList arrayList = c1016.f3712;
                        int[] iArr = f5439;
                        if (z6 && c1017.f3710) {
                            if (c1014.f3703 && c1015.f3703) {
                                m3273(iArr, ((C1014) c1014.f3712.get(0)).f3707 + c1014.f3706, ((C1014) c1015.f3712.get(0)).f3707 - c1015.f3706, c1016.f3707 + c1016.f3706, c1017.f3707 - c1017.f3706, f5, i5);
                                c1042.mo2588(iArr[0]);
                                this.f11387.f3077.f11390.mo2588(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (c1014.f3710 && c1015.f3710) {
                            if (!c1016.f3703 || !c1017.f3703) {
                                return;
                            }
                            m3273(iArr, c1014.f3707 + c1014.f3706, c1015.f3707 - c1015.f3706, ((C1014) arrayList.get(0)).f3707 + c1016.f3706, ((C1014) c1017.f3712.get(0)).f3707 - c1017.f3706, f5, i5);
                            c1042.mo2588(iArr[0]);
                            this.f11387.f3077.f11390.mo2588(iArr[1]);
                        }
                        if (!c1014.f3703 || !c1015.f3703 || !c1016.f3703 || !c1017.f3703) {
                            return;
                        }
                        m3273(iArr, ((C1014) c1014.f3712.get(0)).f3707 + c1014.f3706, ((C1014) c1015.f3712.get(0)).f3707 - c1015.f3706, ((C1014) arrayList.get(0)).f3707 + c1016.f3706, ((C1014) c1017.f3712.get(0)).f3707 - c1017.f3706, f5, i5);
                        c1042.mo2588(iArr[0]);
                        this.f11387.f3077.f11390.mo2588(iArr[1]);
                    } else if (z2 && z4) {
                        if (!c1014.f3703 || !c1015.f3703) {
                            return;
                        }
                        float f6 = c0794.f3115;
                        int i6 = ((C1014) c1014.f3712.get(0)).f3707 + c1014.f3706;
                        int i7 = ((C1014) c1015.f3712.get(0)).f3707 - c1015.f3706;
                        if (i5 == -1 || i5 == 0) {
                            int iM5233 = m5231(i7 - i6, 0);
                            int i8 = (int) ((iM5233 * f6) + 0.5f);
                            int iM5234 = m5231(i8, 1);
                            if (i8 != iM5234) {
                                iM5233 = (int) ((iM5234 / f6) + 0.5f);
                            }
                            c1042.mo2588(iM5233);
                            this.f11387.f3077.f11390.mo2588(iM5234);
                        } else if (i5 == 1) {
                            int iM5235 = m5231(i7 - i6, 0);
                            int i9 = (int) ((iM5235 / f6) + 0.5f);
                            int iM5236 = m5231(i9, 1);
                            if (i9 != iM5236) {
                                iM5235 = (int) ((iM5236 * f6) + 0.5f);
                            }
                            c1042.mo2588(iM5235);
                            this.f11387.f3077.f11390.mo2588(iM5236);
                        }
                    } else if (z3 && z5) {
                        if (!c1016.f3703 || !c1017.f3703) {
                            return;
                        }
                        float f7 = c0794.f3115;
                        int i10 = ((C1014) c1016.f3712.get(0)).f3707 + c1016.f3706;
                        int i11 = ((C1014) c1017.f3712.get(0)).f3707 - c1017.f3706;
                        if (i5 == -1) {
                            iM5231 = m5231(i11 - i10, 1);
                            i = (int) ((iM5231 / f7) + 0.5f);
                            iM5232 = m5231(i, 0);
                            if (i != iM5232) {
                                iM5231 = (int) ((iM5232 * f7) + 0.5f);
                            }
                            c1042.mo2588(iM5232);
                            this.f11387.f3077.f11390.mo2588(iM5231);
                        } else if (i5 == 0) {
                            int iM5237 = m5231(i11 - i10, 1);
                            int i12 = (int) ((iM5237 * f7) + 0.5f);
                            int iM5238 = m5231(i12, 0);
                            if (i12 != iM5238) {
                                iM5237 = (int) ((iM5238 / f7) + 0.5f);
                            }
                            c1042.mo2588(iM5238);
                            this.f11387.f3077.f11390.mo2588(iM5237);
                        } else if (i5 == 1) {
                            iM5231 = m5231(i11 - i10, 1);
                            i = (int) ((iM5231 / f7) + 0.5f);
                            iM5232 = m5231(i, 0);
                            if (i != iM5232) {
                                iM5231 = (int) ((iM5232 * f7) + 0.5f);
                            }
                            c1042.mo2588(iM5232);
                            this.f11387.f3077.f11390.mo2588(iM5231);
                        }
                    }
                } else {
                    int i13 = c0794.f3116;
                    if (i13 != -1) {
                        if (i13 == 0) {
                            f4 = c0794.f3077.f11390.f3707 / c0794.f3115;
                            i2 = (int) (f4 + 0.5f);
                        } else if (i13 != 1) {
                            i2 = 0;
                        } else {
                            f2 = c0794.f3077.f11390.f3707;
                            f3 = c0794.f3115;
                        }
                        c1042.mo2588(i2);
                        f = 0.5f;
                    } else {
                        f2 = c0794.f3077.f11390.f3707;
                        f3 = c0794.f3115;
                    }
                    f4 = f2 * f3;
                    i2 = (int) (f4 + 0.5f);
                    c1042.mo2588(i2);
                    f = 0.5f;
                }
            } else {
                f = 0.5f;
            }
        }
        boolean z7 = c1014.f3703;
        ArrayList arrayList2 = c1014.f3712;
        if (z7) {
            boolean z8 = c1015.f3703;
            ArrayList arrayList3 = c1015.f3712;
            if (z8) {
                if (c1014.f3710 && c1015.f3710 && c1042.f3710) {
                    return;
                }
                if (!c1042.f3710 && this.f11389 == 3) {
                    C0793 c0796 = this.f11387;
                    if (c0796.f3084 == 0 && !c0796.m2322()) {
                        C1014 c1018 = (C1014) arrayList2.get(0);
                        C1014 c1019 = (C1014) arrayList3.get(0);
                        int i14 = c1018.f3707 + c1014.f3706;
                        int i15 = c1019.f3707 + c1015.f3706;
                        c1014.mo2588(i14);
                        c1015.mo2588(i15);
                        c1042.mo2588(i15 - i14);
                        return;
                    }
                }
                if (!c1042.f3710 && this.f11389 == 3 && this.f11386 == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((C1014) arrayList3.get(0)).f3707 + c1015.f3706) - (((C1014) arrayList2.get(0)).f3707 + c1014.f3706), c1042.f3794);
                    C0793 c0797 = this.f11387;
                    int i16 = c0797.f3088;
                    int iMax = Math.max(c0797.f3087, iMin);
                    if (i16 > 0) {
                        iMax = Math.min(i16, iMax);
                    }
                    c1042.mo2588(iMax);
                }
                if (c1042.f3710) {
                    C1014 c10110 = (C1014) arrayList2.get(0);
                    C1014 c10111 = (C1014) arrayList3.get(0);
                    int i17 = c10110.f3707;
                    int i18 = c1014.f3706 + i17;
                    int i19 = c10111.f3707;
                    int i20 = c1015.f3706 + i19;
                    float f8 = this.f11387.f3122;
                    if (c10110 == c10111) {
                        f8 = 0.5f;
                    } else {
                        i17 = i18;
                        i19 = i20;
                    }
                    c1014.mo2588((int) ((((i19 - i17) - c1042.f3707) * f8) + i17 + 0.5f));
                    c1015.mo2588(c1014.f3707 + c1042.f3707);
                }
            }
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2004() {
        C0793 c0793;
        C0793 c0794;
        C0793 c0795;
        C0793 c0796;
        C0793 c0797 = this.f11387;
        boolean z = c0797.f3073;
        C1042 c1042 = this.f11390;
        if (z) {
            c1042.mo2588(c0797.m2316());
        }
        boolean z2 = c1042.f3710;
        ArrayList arrayList = c1042.f3711;
        ArrayList arrayList2 = c1042.f3712;
        C1014 c1014 = this.f11394;
        C1014 c1015 = this.f11393;
        if (!z2) {
            C0793 c0798 = this.f11387;
            int i = c0798.f3134[0];
            this.f11389 = i;
            if (i != 3) {
                if (i == 4 && (((c0796 = c0798.f3112) != null && c0796.f3134[0] == 1) || c0796.f3134[0] == 4)) {
                    int iM2316 = (c0796.m2316() - this.f11387.f3101.m2274()) - this.f11387.f3103.m2274();
                    AbstractC3640.m5227(c1015, c0796.f3076.f11393, this.f11387.f3101.m2274());
                    AbstractC3640.m5227(c1014, c0796.f3076.f11394, -this.f11387.f3103.m2274());
                    c1042.mo2588(iM2316);
                    return;
                }
                if (i == 1) {
                    c1042.mo2588(c0798.m2316());
                }
            }
        } else if (this.f11389 == 4 && (((c0794 = (c0793 = this.f11387).f3112) != null && c0794.f3134[0] == 1) || c0794.f3134[0] == 4)) {
            AbstractC3640.m5227(c1015, c0794.f3076.f11393, c0793.f3101.m2274());
            AbstractC3640.m5227(c1014, c0794.f3076.f11394, -this.f11387.f3103.m2274());
            return;
        }
        if (c1042.f3710) {
            C0793 c0799 = this.f11387;
            if (c0799.f3073) {
                C0779[] c0779Arr = c0799.f3109;
                C0779 c0779 = c0779Arr[0];
                C0779 c07710 = c0779.f2881;
                if (c07710 != null && c0779Arr[1].f2881 != null) {
                    if (c0799.m2322()) {
                        c1015.f3706 = this.f11387.f3109[0].m2274();
                        c1014.f3706 = -this.f11387.f3109[1].m2274();
                        return;
                    }
                    C1014 c1014M5228 = AbstractC3640.m5228(this.f11387.f3109[0]);
                    if (c1014M5228 != null) {
                        AbstractC3640.m5227(c1015, c1014M5228, this.f11387.f3109[0].m2274());
                    }
                    C1014 c1014M5229 = AbstractC3640.m5228(this.f11387.f3109[1]);
                    if (c1014M5229 != null) {
                        AbstractC3640.m5227(c1014, c1014M5229, -this.f11387.f3109[1].m2274());
                    }
                    c1015.f3702 = true;
                    c1014.f3702 = true;
                    return;
                }
                if (c07710 != null) {
                    C1014 c1014M52210 = AbstractC3640.m5228(c0779);
                    if (c1014M52210 != null) {
                        AbstractC3640.m5227(c1015, c1014M52210, this.f11387.f3109[0].m2274());
                        AbstractC3640.m5227(c1014, c1015, c1042.f3707);
                        return;
                    }
                    return;
                }
                C0779 c07711 = c0779Arr[1];
                if (c07711.f2881 != null) {
                    C1014 c1014M52211 = AbstractC3640.m5228(c07711);
                    if (c1014M52211 != null) {
                        AbstractC3640.m5227(c1014, c1014M52211, -this.f11387.f3109[1].m2274());
                        AbstractC3640.m5227(c1015, c1014, -c1042.f3707);
                        return;
                    }
                    return;
                }
                if ((c0799 instanceof AbstractC1532) || c0799.f3112 == null || c0799.mo2311(7).f2881 != null) {
                    return;
                }
                C0793 c07910 = this.f11387;
                AbstractC3640.m5227(c1015, c07910.f3112.f3076.f11393, c07910.m2317());
                AbstractC3640.m5227(c1014, c1015, c1042.f3707);
                return;
            }
        }
        if (this.f11389 == 3) {
            C0793 c07911 = this.f11387;
            int i2 = c07911.f3084;
            if (i2 == 2) {
                C0793 c07912 = c07911.f3112;
                if (c07912 != null) {
                    C1042 c1043 = c07912.f3077.f11390;
                    arrayList2.add(c1043);
                    c1043.f3711.add(c1042);
                    c1042.f3702 = true;
                    arrayList.add(c1015);
                    arrayList.add(c1014);
                }
            } else if (i2 == 3) {
                if (c07911.f3085 == 3) {
                    c1015.f3701 = this;
                    c1014.f3701 = this;
                    C3549 c3549 = c07911.f3077;
                    c3549.f11393.f3701 = this;
                    c3549.f11394.f3701 = this;
                    c1042.f3701 = this;
                    if (c07911.m2323()) {
                        arrayList2.add(this.f11387.f3077.f11390);
                        this.f11387.f3077.f11390.f3711.add(c1042);
                        C3549 c35410 = this.f11387.f3077;
                        c35410.f11390.f3701 = this;
                        arrayList2.add(c35410.f11393);
                        arrayList2.add(this.f11387.f3077.f11394);
                        this.f11387.f3077.f11393.f3711.add(c1042);
                        this.f11387.f3077.f11394.f3711.add(c1042);
                    } else if (this.f11387.m2322()) {
                        this.f11387.f3077.f11390.f3712.add(c1042);
                        arrayList.add(this.f11387.f3077.f11390);
                    } else {
                        this.f11387.f3077.f11390.f3712.add(c1042);
                    }
                } else {
                    C1042 c1044 = c07911.f3077.f11390;
                    arrayList2.add(c1044);
                    c1044.f3711.add(c1042);
                    this.f11387.f3077.f11393.f3711.add(c1042);
                    this.f11387.f3077.f11394.f3711.add(c1042);
                    c1042.f3702 = true;
                    arrayList.add(c1015);
                    arrayList.add(c1014);
                    c1015.f3712.add(c1042);
                    c1014.f3712.add(c1042);
                }
            }
        }
        C0793 c07913 = this.f11387;
        C0779[] c0779Arr2 = c07913.f3109;
        C0779 c07712 = c0779Arr2[0];
        C0779 c07713 = c07712.f2881;
        if (c07713 != null && c0779Arr2[1].f2881 != null) {
            if (c07913.m2322()) {
                c1015.f3706 = this.f11387.f3109[0].m2274();
                c1014.f3706 = -this.f11387.f3109[1].m2274();
                return;
            }
            C1014 c1014M52212 = AbstractC3640.m5228(this.f11387.f3109[0]);
            C1014 c1014M52213 = AbstractC3640.m5228(this.f11387.f3109[1]);
            c1014M52212.m2586(this);
            c1014M52213.m2586(this);
            this.f11395 = 4;
            return;
        }
        if (c07713 != null) {
            C1014 c1014M52214 = AbstractC3640.m5228(c07712);
            if (c1014M52214 != null) {
                AbstractC3640.m5227(c1015, c1014M52214, this.f11387.f3109[0].m2274());
                m5230(c1014, c1015, 1, c1042);
                return;
            }
            return;
        }
        C0779 c07714 = c0779Arr2[1];
        if (c07714.f2881 != null) {
            C1014 c1014M52215 = AbstractC3640.m5228(c07714);
            if (c1014M52215 != null) {
                AbstractC3640.m5227(c1014, c1014M52215, -this.f11387.f3109[1].m2274());
                m5230(c1015, c1014, -1, c1042);
                return;
            }
            return;
        }
        if ((c07913 instanceof AbstractC1532) || (c0795 = c07913.f3112) == null) {
            return;
        }
        AbstractC3640.m5227(c1015, c0795.f3076.f11393, c07913.m2317());
        m5230(c1014, c1015, 1, c1042);
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2005() {
        C1014 c1014 = this.f11393;
        if (c1014.f3710) {
            this.f11387.f3117 = c1014.f3707;
        }
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2006() {
        this.f11388 = null;
        this.f11393.m2587();
        this.f11394.m2587();
        this.f11390.m2587();
        this.f11392 = false;
    }

    @Override // p000.AbstractC3640
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2008() {
        return this.f11389 != 3 || this.f11387.f3084 == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3274() {
        this.f11392 = false;
        C1014 c1014 = this.f11393;
        c1014.m2587();
        c1014.f3710 = false;
        C1014 c1015 = this.f11394;
        c1015.m2587();
        c1015.f3710 = false;
        this.f11390.f3710 = false;
    }
}
