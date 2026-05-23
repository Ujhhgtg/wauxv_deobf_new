package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3549 extends AbstractC3640 {

    public C1014 f11148;

    public C0400 f11149;

    public final String toString() {
        return "VerticalRun " + this.f11387.f3126;
    }

    @Override // p000.InterfaceC1012
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        float f;
        float f2;
        float f3;
        int i;
        if (AbstractC2784.m4759(this.f11395) == 3) {
            C0793 c0793 = this.f11387;
            m5232(c0793.f3102, c0793.f3104, 1);
            return;
        }
        C1042 c1042 = this.f11390;
        if (c1042.f3703 && !c1042.f3710 && this.f11389 == 3) {
            C0793 c0794 = this.f11387;
            int i2 = c0794.f3085;
            if (i2 == 2) {
                C0793 c0795 = c0794.f3112;
                if (c0795 != null) {
                    C1042 c1043 = c0795.f3077.f11390;
                    if (c1043.f3710) {
                        c1042.mo2588((int) ((c1043.f3707 * c0794.f3092) + 0.5f));
                    }
                }
            } else if (i2 == 3) {
                C1042 c1044 = c0794.f3076.f11390;
                if (c1044.f3710) {
                    int i3 = c0794.f3116;
                    if (i3 != -1) {
                        if (i3 == 0) {
                            f3 = c1044.f3707 * c0794.f3115;
                            i = (int) (f3 + 0.5f);
                        } else if (i3 != 1) {
                            i = 0;
                        } else {
                            f = c1044.f3707;
                            f2 = c0794.f3115;
                        }
                        c1042.mo2588(i);
                    } else {
                        f = c1044.f3707;
                        f2 = c0794.f3115;
                    }
                    f3 = f / f2;
                    i = (int) (f3 + 0.5f);
                    c1042.mo2588(i);
                }
            }
        }
        C1014 c1014 = this.f11393;
        boolean z = c1014.f3703;
        ArrayList arrayList = c1014.f3712;
        if (z) {
            C1014 c1015 = this.f11394;
            boolean z2 = c1015.f3703;
            ArrayList arrayList2 = c1015.f3712;
            if (z2) {
                if (c1014.f3710 && c1015.f3710 && c1042.f3710) {
                    return;
                }
                if (!c1042.f3710 && this.f11389 == 3) {
                    C0793 c0796 = this.f11387;
                    if (c0796.f3084 == 0 && !c0796.m2323()) {
                        C1014 c1016 = (C1014) arrayList.get(0);
                        C1014 c1017 = (C1014) arrayList2.get(0);
                        int i4 = c1016.f3707 + c1014.f3706;
                        int i5 = c1017.f3707 + c1015.f3706;
                        c1014.mo2588(i4);
                        c1015.mo2588(i5);
                        c1042.mo2588(i5 - i4);
                        return;
                    }
                }
                if (!c1042.f3710 && this.f11389 == 3 && this.f11386 == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1014 c1018 = (C1014) arrayList.get(0);
                    int i6 = (((C1014) arrayList2.get(0)).f3707 + c1015.f3706) - (c1018.f3707 + c1014.f3706);
                    int i7 = c1042.f3794;
                    if (i6 < i7) {
                        c1042.mo2588(i6);
                    } else {
                        c1042.mo2588(i7);
                    }
                }
                if (c1042.f3710 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    C1014 c1019 = (C1014) arrayList.get(0);
                    C1014 c10110 = (C1014) arrayList2.get(0);
                    int i8 = c1019.f3707;
                    int i9 = c1014.f3706 + i8;
                    int i10 = c10110.f3707;
                    int i11 = c1015.f3706 + i10;
                    float f4 = this.f11387.f3123;
                    if (c1019 == c10110) {
                        f4 = 0.5f;
                    } else {
                        i8 = i9;
                        i10 = i11;
                    }
                    c1014.mo2588((int) ((((i10 - i8) - c1042.f3707) * f4) + i8 + 0.5f));
                    c1015.mo2588(c1014.f3707 + c1042.f3707);
                }
            }
        }
    }

    @Override // p000.AbstractC3640
    public final void mo2004() {
        C0793 c0793;
        C0793 c0794;
        C0793 c0795;
        C0793 c0796;
        C1014 c1014 = this.f11148;
        C0793 c0797 = this.f11387;
        boolean z = c0797.f3073;
        C1042 c1042 = this.f11390;
        if (z) {
            c1042.mo2588(c0797.m2313());
        }
        boolean z2 = c1042.f3710;
        ArrayList arrayList = c1042.f3711;
        ArrayList arrayList2 = c1042.f3712;
        C1014 c1015 = this.f11394;
        C1014 c1016 = this.f11393;
        if (!z2) {
            C0793 c0798 = this.f11387;
            this.f11389 = c0798.f3134[1];
            if (c0798.f3097) {
                this.f11149 = new C0400(this);
            }
            int i = this.f11389;
            if (i != 3) {
                if (i == 4 && (c0796 = this.f11387.f3112) != null && c0796.f3134[1] == 1) {
                    int iM2313 = (c0796.m2313() - this.f11387.f3102.m2274()) - this.f11387.f3104.m2274();
                    AbstractC3640.m5227(c1016, c0796.f3077.f11393, this.f11387.f3102.m2274());
                    AbstractC3640.m5227(c1015, c0796.f3077.f11394, -this.f11387.f3104.m2274());
                    c1042.mo2588(iM2313);
                    return;
                }
                if (i == 1) {
                    c1042.mo2588(this.f11387.m2313());
                }
            }
        } else if (this.f11389 == 4 && (c0794 = (c0793 = this.f11387).f3112) != null && c0794.f3134[1] == 1) {
            AbstractC3640.m5227(c1016, c0794.f3077.f11393, c0793.f3102.m2274());
            AbstractC3640.m5227(c1015, c0794.f3077.f11394, -this.f11387.f3104.m2274());
            return;
        }
        boolean z3 = c1042.f3710;
        if (z3) {
            C0793 c0799 = this.f11387;
            if (c0799.f3073) {
                C0779[] c0779Arr = c0799.f3109;
                C0779 c0779 = c0779Arr[2];
                C0779 c07710 = c0779.f2881;
                if (c07710 != null && c0779Arr[3].f2881 != null) {
                    if (c0799.m2323()) {
                        c1016.f3706 = this.f11387.f3109[2].m2274();
                        c1015.f3706 = -this.f11387.f3109[3].m2274();
                    } else {
                        C1014 c1014M5228 = AbstractC3640.m5228(this.f11387.f3109[2]);
                        if (c1014M5228 != null) {
                            AbstractC3640.m5227(c1016, c1014M5228, this.f11387.f3109[2].m2274());
                        }
                        C1014 c1014M5229 = AbstractC3640.m5228(this.f11387.f3109[3]);
                        if (c1014M5229 != null) {
                            AbstractC3640.m5227(c1015, c1014M5229, -this.f11387.f3109[3].m2274());
                        }
                        c1016.f3702 = true;
                        c1015.f3702 = true;
                    }
                    C0793 c07910 = this.f11387;
                    if (c07910.f3097) {
                        AbstractC3640.m5227(c1014, c1016, c07910.f3119);
                        return;
                    }
                    return;
                }
                if (c07710 != null) {
                    C1014 c1014M52210 = AbstractC3640.m5228(c0779);
                    if (c1014M52210 != null) {
                        AbstractC3640.m5227(c1016, c1014M52210, this.f11387.f3109[2].m2274());
                        AbstractC3640.m5227(c1015, c1016, c1042.f3707);
                        C0793 c07911 = this.f11387;
                        if (c07911.f3097) {
                            AbstractC3640.m5227(c1014, c1016, c07911.f3119);
                            return;
                        }
                        return;
                    }
                    return;
                }
                C0779 c07711 = c0779Arr[3];
                if (c07711.f2881 != null) {
                    C1014 c1014M52211 = AbstractC3640.m5228(c07711);
                    if (c1014M52211 != null) {
                        AbstractC3640.m5227(c1015, c1014M52211, -this.f11387.f3109[3].m2274());
                        AbstractC3640.m5227(c1016, c1015, -c1042.f3707);
                    }
                    C0793 c07912 = this.f11387;
                    if (c07912.f3097) {
                        AbstractC3640.m5227(c1014, c1016, c07912.f3119);
                        return;
                    }
                    return;
                }
                C0779 c07712 = c0779Arr[4];
                if (c07712.f2881 != null) {
                    C1014 c1014M52212 = AbstractC3640.m5228(c07712);
                    if (c1014M52212 != null) {
                        AbstractC3640.m5227(c1014, c1014M52212, 0);
                        AbstractC3640.m5227(c1016, c1014, -this.f11387.f3119);
                        AbstractC3640.m5227(c1015, c1016, c1042.f3707);
                        return;
                    }
                    return;
                }
                if ((c0799 instanceof AbstractC1532) || c0799.f3112 == null || c0799.mo2311(7).f2881 != null) {
                    return;
                }
                C0793 c07913 = this.f11387;
                AbstractC3640.m5227(c1016, c07913.f3112.f3077.f11393, c07913.m2318());
                AbstractC3640.m5227(c1015, c1016, c1042.f3707);
                C0793 c07914 = this.f11387;
                if (c07914.f3097) {
                    AbstractC3640.m5227(c1014, c1016, c07914.f3119);
                    return;
                }
                return;
            }
        }
        if (z3 || this.f11389 != 3) {
            c1042.m2586(this);
        } else {
            C0793 c07915 = this.f11387;
            int i2 = c07915.f3085;
            if (i2 == 2) {
                C0793 c07916 = c07915.f3112;
                if (c07916 != null) {
                    C1042 c1043 = c07916.f3077.f11390;
                    arrayList2.add(c1043);
                    c1043.f3711.add(c1042);
                    c1042.f3702 = true;
                    arrayList.add(c1016);
                    arrayList.add(c1015);
                }
            } else if (i2 == 3 && !c07915.m2323()) {
                C0793 c07917 = this.f11387;
                if (c07917.f3084 != 3) {
                    C1042 c1044 = c07917.f3076.f11390;
                    arrayList2.add(c1044);
                    c1044.f3711.add(c1042);
                    c1042.f3702 = true;
                    arrayList.add(c1016);
                    arrayList.add(c1015);
                }
            }
        }
        C0793 c07918 = this.f11387;
        C0779[] c0779Arr2 = c07918.f3109;
        C0779 c07713 = c0779Arr2[2];
        C0779 c07714 = c07713.f2881;
        if (c07714 != null && c0779Arr2[3].f2881 != null) {
            if (c07918.m2323()) {
                c1016.f3706 = this.f11387.f3109[2].m2274();
                c1015.f3706 = -this.f11387.f3109[3].m2274();
            } else {
                C1014 c1014M52213 = AbstractC3640.m5228(this.f11387.f3109[2]);
                C1014 c1014M52214 = AbstractC3640.m5228(this.f11387.f3109[3]);
                c1014M52213.m2586(this);
                c1014M52214.m2586(this);
                this.f11395 = 4;
            }
            if (this.f11387.f3097) {
                m5230(c1014, c1016, 1, this.f11149);
            }
        } else if (c07714 != null) {
            C1014 c1014M52215 = AbstractC3640.m5228(c07713);
            if (c1014M52215 != null) {
                AbstractC3640.m5227(c1016, c1014M52215, this.f11387.f3109[2].m2274());
                m5230(c1015, c1016, 1, c1042);
                if (this.f11387.f3097) {
                    m5230(c1014, c1016, 1, this.f11149);
                }
                if (this.f11389 == 3) {
                    C0793 c07919 = this.f11387;
                    if (c07919.f3115 > 0.0f) {
                        C1564 c1564 = c07919.f3076;
                        if (c1564.f11389 == 3) {
                            c1564.f11390.f3711.add(c1042);
                            arrayList2.add(this.f11387.f3076.f11390);
                            c1042.f3701 = this;
                        }
                    }
                }
            }
        } else {
            C0779 c07715 = c0779Arr2[3];
            if (c07715.f2881 != null) {
                C1014 c1014M52216 = AbstractC3640.m5228(c07715);
                if (c1014M52216 != null) {
                    AbstractC3640.m5227(c1015, c1014M52216, -this.f11387.f3109[3].m2274());
                    m5230(c1016, c1015, -1, c1042);
                    if (this.f11387.f3097) {
                        m5230(c1014, c1016, 1, this.f11149);
                    }
                }
            } else {
                C0779 c07716 = c0779Arr2[4];
                if (c07716.f2881 != null) {
                    C1014 c1014M52217 = AbstractC3640.m5228(c07716);
                    if (c1014M52217 != null) {
                        AbstractC3640.m5227(c1014, c1014M52217, 0);
                        m5230(c1016, c1014, -1, this.f11149);
                        m5230(c1015, c1016, 1, c1042);
                    }
                } else if (!(c07918 instanceof AbstractC1532) && (c0795 = c07918.f3112) != null) {
                    AbstractC3640.m5227(c1016, c0795.f3077.f11393, c07918.m2318());
                    m5230(c1015, c1016, 1, c1042);
                    if (this.f11387.f3097) {
                        m5230(c1014, c1016, 1, this.f11149);
                    }
                    if (this.f11389 == 3) {
                        C0793 c07920 = this.f11387;
                        if (c07920.f3115 > 0.0f) {
                            C1564 c1565 = c07920.f3076;
                            if (c1565.f11389 == 3) {
                                c1565.f11390.f3711.add(c1042);
                                arrayList2.add(this.f11387.f3076.f11390);
                                c1042.f3701 = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            c1042.f3703 = true;
        }
    }

    @Override // p000.AbstractC3640
    public final void mo2005() {
        C1014 c1014 = this.f11393;
        if (c1014.f3710) {
            this.f11387.f3118 = c1014.f3707;
        }
    }

    @Override // p000.AbstractC3640
    public final void mo2006() {
        this.f11388 = null;
        this.f11393.m2587();
        this.f11394.m2587();
        this.f11148.m2587();
        this.f11390.m2587();
        this.f11392 = false;
    }

    @Override // p000.AbstractC3640
    public final boolean mo2008() {
        return this.f11389 != 3 || this.f11387.f3085 == 0;
    }

    public final void m5142() {
        this.f11392 = false;
        C1014 c1014 = this.f11393;
        c1014.m2587();
        c1014.f3710 = false;
        C1014 c1015 = this.f11394;
        c1015.m2587();
        c1015.f3710 = false;
        C1014 c1016 = this.f11148;
        c1016.m2587();
        c1016.f3710 = false;
        this.f11390.f3710 = false;
    }
}
