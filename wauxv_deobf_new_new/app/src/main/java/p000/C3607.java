package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᲇᲀᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3607 extends AbstractC3700 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1017 f11297;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0375 f11298;

    public final String toString() {
        return "VerticalRun " + this.f11536.f3133;
    }

    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2844.m4792(this.f11544) == 3) {
            C0792 c0792 = this.f11536;
            m5238(c0792.f3109, c0792.f3111, 1);
            return;
        }
        C1045 c1045 = this.f11539;
        if (c1045.f3710 && !c1045.f3717 && this.f11538 == 3) {
            C0792 c0793 = this.f11536;
            int i2 = c0793.f3092;
            if (i2 == 2) {
                C0792 c0794 = c0793.f3119;
                if (c0794 != null) {
                    C1045 c1046 = c0794.f3084.f11539;
                    if (c1046.f3717) {
                        c1045.mo2712((int) ((c1046.f3714 * c0793.f3099) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C1045 c1047 = c0793.f3083.f11539;
                if (c1047.f3717) {
                    int i3 = c0793.f3123;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c1047.f3714 * c0793.f3122;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c1047.f3714;
                            f2 = c0793.f3122;
                        }
                        c1045.mo2712(i);
                    } else {
                        f = c1047.f3714;
                        f2 = c0793.f3122;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c1045.mo2712(i);
                }
            }
        }
        C1017 c1017 = this.f11542;
        boolean z = c1017.f3710;
        ArrayList arrayList = c1017.f3719;
        if (z) {
            C1017 c1018 = this.f11543;
            boolean z2 = c1018.f3710;
            ArrayList arrayList2 = c1018.f3719;
            if (z2) {
                if (c1017.f3717 && c1018.f3717 && c1045.f3717) {
                    return;
                }
                if (!c1045.f3717 && this.f11538 == 3) {
                    C0792 c0795 = this.f11536;
                    if (c0795.f3091 == 0 && !c0795.m2438()) {
                        C1017 c1019 = (C1017) arrayList.get(0);
                        C1017 c10110 = (C1017) arrayList2.get(0);
                        int i4 = c1019.f3714 + c1017.f3713;
                        int i5 = c10110.f3714 + c1018.f3713;
                        c1017.mo2712(i4);
                        c1018.mo2712(i5);
                        c1045.mo2712(i5 - i4);
                        return;
                    }
                }
                if (!c1045.f3717 && this.f11538 == 3 && this.f11535 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1017 c10111 = (C1017) arrayList.get(0);
                    int i6 = (((C1017) arrayList2.get(0)).f3714 + c1018.f3713) - (c10111.f3714 + c1017.f3713);
                    int i7 = c1045.f3801;
                    if (i6 < i7) {
                        c1045.mo2712(i6);
                    } else {
                        c1045.mo2712(i7);
                    }
                }
                if (c1045.f3717 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1017 c10112 = (C1017) arrayList.get(0);
                    C1017 c10113 = (C1017) arrayList2.get(0);
                    int i8 = c10112.f3714;
                    int i9 = c1017.f3713 + i8;
                    int i10 = c10113.f3714;
                    int i11 = c1018.f3713 + i10;
                    float f4 = this.f11536.f3130;
                    if (c10112 == c10113) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1017.mo2712((int) ((((i10 - i8) - c1045.f3714) * f4) + i8 + 0.5f));
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
        C1017 c1017 = this.f11297;
        C0792 c0796 = this.f11536;
        boolean z = c0796.f3080;
        C1045 c1045 = this.f11539;
        if (z) {
            c1045.mo2712(c0796.m2428());
        }
        boolean z2 = c1045.f3717;
        ArrayList arrayList = c1045.f3718;
        ArrayList arrayList2 = c1045.f3719;
        C1017 c1018 = this.f11543;
        C1017 c1019 = this.f11542;
        if (!z2) {
            C0792 c0797 = this.f11536;
            this.f11538 = c0797.f3141[1];
            if (c0797.f3104) {
                this.f11298 = new C0375(this);
            }
            int i = this.f11538;
            if (i != 3) {
                if (i == 4 && (c0795 = this.f11536.f3119) != null && c0795.f3141[1] == 1) {
                    int iM2428 = (c0795.m2428() - this.f11536.f3109.m2389()) - this.f11536.f3111.m2389();
                    AbstractC3700.m5233(c1019, c0795.f3084.f11542, this.f11536.f3109.m2389());
                    AbstractC3700.m5233(c1018, c0795.f3084.f11543, -this.f11536.f3111.m2389());
                    c1045.mo2712(iM2428);
                    return;
                }
                if (i == 1) {
                    c1045.mo2712(this.f11536.m2428());
                }
            }
        } else if (this.f11538 == 4 && (c0793 = (c0792 = this.f11536).f3119) != null && c0793.f3141[1] == 1) {
            AbstractC3700.m5233(c1019, c0793.f3084.f11542, c0792.f3109.m2389());
            AbstractC3700.m5233(c1018, c0793.f3084.f11543, -this.f11536.f3111.m2389());
            return;
        }
        boolean z3 = c1045.f3717;
        if (z3) {
            C0792 c0798 = this.f11536;
            if (c0798.f3080) {
                C0778[] c0778Arr = c0798.f3116;
                C0778 c0778 = c0778Arr[2];
                C0778 c0779 = c0778.f2888;
                if (c0779 != null && c0778Arr[3].f2888 != null) {
                    if (c0798.m2438()) {
                        c1019.f3713 = this.f11536.f3116[2].m2389();
                        c1018.f3713 = -this.f11536.f3116[3].m2389();
                    } else {
                        C1017 c1017M5234 = AbstractC3700.m5234(this.f11536.f3116[2]);
                        if (c1017M5234 != null) {
                            AbstractC3700.m5233(c1019, c1017M5234, this.f11536.f3116[2].m2389());
                        }
                        C1017 c1017M5235 = AbstractC3700.m5234(this.f11536.f3116[3]);
                        if (c1017M5235 != null) {
                            AbstractC3700.m5233(c1018, c1017M5235, -this.f11536.f3116[3].m2389());
                        }
                        c1019.f3709 = true;
                        c1018.f3709 = true;
                    }
                    C0792 c0799 = this.f11536;
                    if (c0799.f3104) {
                        AbstractC3700.m5233(c1017, c1019, c0799.f3126);
                        return;
                    }
                    return;
                }
                if (c0779 != null) {
                    C1017 c1017M5236 = AbstractC3700.m5234(c0778);
                    if (c1017M5236 != null) {
                        AbstractC3700.m5233(c1019, c1017M5236, this.f11536.f3116[2].m2389());
                        AbstractC3700.m5233(c1018, c1019, c1045.f3714);
                        C0792 c07910 = this.f11536;
                        if (c07910.f3104) {
                            AbstractC3700.m5233(c1017, c1019, c07910.f3126);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0778 c07710 = c0778Arr[3];
                if (c07710.f2888 != null) {
                    C1017 c1017M5237 = AbstractC3700.m5234(c07710);
                    if (c1017M5237 != null) {
                        AbstractC3700.m5233(c1018, c1017M5237, -this.f11536.f3116[3].m2389());
                        AbstractC3700.m5233(c1019, c1018, -c1045.f3714);
                    }
                    C0792 c07911 = this.f11536;
                    if (c07911.f3104) {
                        AbstractC3700.m5233(c1017, c1019, c07911.f3126);
                        return;
                    }
                    return;
                }
                C0778 c07711 = c0778Arr[4];
                if (c07711.f2888 != null) {
                    C1017 c1017M5238 = AbstractC3700.m5234(c07711);
                    if (c1017M5238 != null) {
                        AbstractC3700.m5233(c1017, c1017M5238, 0);
                        AbstractC3700.m5233(c1019, c1017, -this.f11536.f3126);
                        AbstractC3700.m5233(c1018, c1019, c1045.f3714);
                        return;
                    }
                    return;
                }
                if ((c0798 instanceof AbstractC1544) || c0798.f3119 == null || c0798.mo2426(7).f2888 != null) {
                    return;
                }
                C0792 c07912 = this.f11536;
                AbstractC3700.m5233(c1019, c07912.f3119.f3084.f11542, c07912.m2433());
                AbstractC3700.m5233(c1018, c1019, c1045.f3714);
                C0792 c07913 = this.f11536;
                if (c07913.f3104) {
                    AbstractC3700.m5233(c1017, c1019, c07913.f3126);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f11538 != 3) {
            c1045.m2710(this);
        } else {
            C0792 c07914 = this.f11536;
            int i2 = c07914.f3092;
            if (i2 == 2) {
                C0792 c07915 = c07914.f3119;
                if (c07915 != null) {
                    C1045 c1046 = c07915.f3084.f11539;
                    arrayList2.add(c1046);
                    c1046.f3718.add(c1045);
                    c1045.f3709 = true;
                    arrayList.add(c1019);
                    arrayList.add(c1018);
                }
            } else if (i2 == 3 && !c07914.m2438()) {
                C0792 c07916 = this.f11536;
                if (c07916.f3091 != 3) {
                    C1045 c1047 = c07916.f3083.f11539;
                    arrayList2.add(c1047);
                    c1047.f3718.add(c1045);
                    c1045.f3709 = true;
                    arrayList.add(c1019);
                    arrayList.add(c1018);
                }
            }
        }
        C0792 c07917 = this.f11536;
        C0778[] c0778Arr2 = c07917.f3116;
        C0778 c07712 = c0778Arr2[2];
        C0778 c07713 = c07712.f2888;
        if (c07713 != null && c0778Arr2[3].f2888 != null) {
            if (c07917.m2438()) {
                c1019.f3713 = this.f11536.f3116[2].m2389();
                c1018.f3713 = -this.f11536.f3116[3].m2389();
            } else {
                C1017 c1017M5239 = AbstractC3700.m5234(this.f11536.f3116[2]);
                C1017 c1017M52310 = AbstractC3700.m5234(this.f11536.f3116[3]);
                c1017M5239.m2710(this);
                c1017M52310.m2710(this);
                this.f11544 = 4;
            }
            if (this.f11536.f3104) {
                m5236(c1017, c1019, 1, this.f11298);
            }
        } else if (c07713 != null) {
            C1017 c1017M52311 = AbstractC3700.m5234(c07712);
            if (c1017M52311 != null) {
                AbstractC3700.m5233(c1019, c1017M52311, this.f11536.f3116[2].m2389());
                m5236(c1018, c1019, 1, c1045);
                if (this.f11536.f3104) {
                    m5236(c1017, c1019, 1, this.f11298);
                }
                if (this.f11538 == 3) {
                    C0792 c07918 = this.f11536;
                    if (c07918.f3122 > 0.0f) {
                        C1575 c1575 = c07918.f3083;
                        if (c1575.f11538 == 3) {
                            c1575.f11539.f3718.add(c1045);
                            arrayList2.add(this.f11536.f3083.f11539);
                            c1045.f3708 = this;
                        }
                    }
                }
            }
        } else {
            C0778 c07714 = c0778Arr2[3];
            if (c07714.f2888 != null) {
                C1017 c1017M52312 = AbstractC3700.m5234(c07714);
                if (c1017M52312 != null) {
                    AbstractC3700.m5233(c1018, c1017M52312, -this.f11536.f3116[3].m2389());
                    m5236(c1019, c1018, -1, c1045);
                    if (this.f11536.f3104) {
                        m5236(c1017, c1019, 1, this.f11298);
                    }
                }
            } else {
                C0778 c07715 = c0778Arr2[4];
                if (c07715.f2888 != null) {
                    C1017 c1017M52313 = AbstractC3700.m5234(c07715);
                    if (c1017M52313 != null) {
                        AbstractC3700.m5233(c1017, c1017M52313, 0);
                        m5236(c1019, c1017, -1, this.f11298);
                        m5236(c1018, c1019, 1, c1045);
                    }
                } else if (!(c07917 instanceof AbstractC1544) && (c0794 = c07917.f3119) != null) {
                    AbstractC3700.m5233(c1019, c0794.f3084.f11542, c07917.m2433());
                    m5236(c1018, c1019, 1, c1045);
                    if (this.f11536.f3104) {
                        m5236(c1017, c1019, 1, this.f11298);
                    }
                    if (this.f11538 == 3) {
                        C0792 c07919 = this.f11536;
                        if (c07919.f3122 > 0.0f) {
                            C1575 c1576 = c07919.f3083;
                            if (c1576.f11538 == 3) {
                                c1576.f11539.f3718.add(c1045);
                                arrayList2.add(this.f11536.f3083.f11539);
                                c1045.f3708 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c1045.f3710 = true;
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final void mo2102() {
        C1017 c1017 = this.f11542;
        if (c1017.f3717) {
            this.f11536.f3125 = c1017.f3714;
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final void mo2103() {
        this.f11537 = null;
        this.f11542.m2711();
        this.f11543.m2711();
        this.f11297.m2711();
        this.f11539.m2711();
        this.f11541 = false;
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo2105() {
        return this.f11538 != 3 || this.f11536.f3092 == 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m5148() {
        this.f11541 = false;
        C1017 c1017 = this.f11542;
        c1017.m2711();
        c1017.f3717 = false;
        C1017 c1018 = this.f11543;
        c1018.m2711();
        c1018.f3717 = false;
        C1017 c1019 = this.f11297;
        c1019.m2711();
        c1019.f3717 = false;
        this.f11539.f3717 = false;
    }
}
