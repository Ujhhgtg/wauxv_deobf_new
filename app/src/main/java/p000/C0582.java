package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0582 extends AbstractC3640 {

    public final ArrayList f2371;

    public int f2372;

    public C0582(C0793 c0793, int i) {
        C0793 c0794;
        super(c0793);
        ArrayList<AbstractC3640> arrayList = new ArrayList();
        this.f2371 = arrayList;
        this.f11391 = i;
        C0793 c0795 = this.f11387;
        C0793 c0793M2315 = c0795.m2315(i);
        while (true) {
            c0794 = c0795;
            c0795 = c0793M2315;
            if (c0795 == null) {
                break;
            } else {
                c0793M2315 = c0795.m2315(this.f11391);
            }
        }
        this.f11387 = c0794;
        int i2 = this.f11391;
        arrayList.add(i2 == 0 ? c0794.f3076 : i2 == 1 ? c0794.f3077 : null);
        C0793 c0793M2314 = c0794.m2314(this.f11391);
        while (c0793M2314 != null) {
            int i3 = this.f11391;
            arrayList.add(i3 == 0 ? c0793M2314.f3076 : i3 == 1 ? c0793M2314.f3077 : null);
            c0793M2314 = c0793M2314.m2314(this.f11391);
        }
        for (AbstractC3640 abstractC3640 : arrayList) {
            int i4 = this.f11391;
            if (i4 == 0) {
                abstractC3640.f11387.f3074 = this;
            } else if (i4 == 1) {
                abstractC3640.f11387.f3075 = this;
            }
        }
        if (this.f11391 == 0 && ((C0794) this.f11387.f3112).f3139 && arrayList.size() > 1) {
            this.f11387 = ((AbstractC3640) arrayList.get(arrayList.size() - 1)).f11387;
        }
        this.f2372 = this.f11391 == 0 ? this.f11387.f3127 : this.f11387.f3128;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f11391 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC3640 abstractC3640 : this.f2371) {
            strConcat = AbstractC2784.m4748(AbstractC2784.m4748(strConcat, "<") + abstractC3640, "> ");
        }
        return strConcat;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x01bc A[PHI: r1 r26
      0x01bc: PHI (r1v57 int) = (r1v55 int), (r1v60 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x01bc: PHI (r26v1 int) = (r26v0 int), (r26v3 int) binds: [B:120:0x01ba, B:111:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:302:0x00ea A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00df  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e2 A[ADDED_TO_REGION] */
    @Override // p000.InterfaceC1012
    public final void mo2003(InterfaceC1012 interfaceC1012) {
        int i;
        int i2;
        boolean z;
        float f;
        int i3;
        int i4;
        int i5;
        int i6;
        float f2;
        int i7;
        int i8;
        int i9;
        int iMax;
        int i10;
        int i11;
        float f3;
        C1014 c1014 = this.f11393;
        if (c1014.f3710) {
            C1014 c1015 = this.f11394;
            if (c1015.f3710) {
                C0793 c0793 = this.f11387.f3112;
                boolean z2 = (c0793 == null || !(c0793 instanceof C0794)) ? false : ((C0794) c0793).f3139;
                int i12 = c1015.f3707 - c1014.f3707;
                ArrayList arrayList = this.f2371;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((AbstractC3640) arrayList.get(i13)).f11387.f3125 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (((AbstractC3640) arrayList.get(i15)).f11387.f3125 != 8) {
                        i = i15;
                        break;
                    }
                }
                int i16 = 0;
                while (true) {
                    if (i16 >= 2) {
                        z = z2;
                        f = 0.0f;
                        i3 = 0;
                        i4 = 0;
                        i5 = 0;
                        break;
                    }
                    f = 0.0f;
                    int i17 = 0;
                    i5 = 0;
                    int i18 = 0;
                    int i19 = 0;
                    while (i17 < size) {
                        AbstractC3640 abstractC3640 = (AbstractC3640) arrayList.get(i17);
                        C0793 c0794 = abstractC3640.f11387;
                        boolean z3 = z2;
                        if (c0794.f3125 == 8) {
                            i10 = i16;
                        } else {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i5 += abstractC3640.f11393.f3706;
                            }
                            C1042 c1042 = abstractC3640.f11390;
                            int i20 = c1042.f3707;
                            i10 = i16;
                            boolean z4 = abstractC3640.f11389 != 3;
                            if (z4) {
                                int i21 = this.f11391;
                                if (i21 == 0 && !c0794.f3076.f11390.f3710) {
                                    return;
                                }
                                if (i21 == 1 && !c0794.f3077.f11390.f3710) {
                                    return;
                                }
                            } else {
                                if (abstractC3640.f11386 == 1 && i10 == 0) {
                                    i11 = c1042.f3794;
                                    i18++;
                                } else {
                                    if (c1042.f3710) {
                                        i11 = i20;
                                    }
                                    if (false) {
                                        i5 += i11;
                                    } else {
                                        i18++;
                                        f3 = c0794.f3129[this.f11391];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i17 >= i14 && i17 < i) {
                                        i5 += -abstractC3640.f11394.f3706;
                                    }
                                }
                                z4 = true;
                                if (true) {
                                    i18++;
                                    f3 = c0794.f3129[this.f11391];
                                    if (f3 >= 0.0f) {
                                        f += f3;
                                    }
                                } else {
                                    i5 += i11;
                                }
                                if (i17 >= i14) {
                                }
                            }
                            i11 = i20;
                            if (true) {
                                i18++;
                                f3 = c0794.f3129[this.f11391];
                                if (f3 >= 0.0f) {
                                    f += f3;
                                }
                            } else {
                                i5 += i11;
                            }
                            if (i17 >= i14) {
                            }
                        }
                        i17++;
                        z2 = z3;
                        i16 = i10;
                        i2 = 8;
                    }
                    z = z2;
                    int i22 = i16;
                    if (i5 < i12 || i18 == 0) {
                        i3 = i18;
                        i4 = i19;
                        break;
                    } else {
                        i16 = i22 + 1;
                        z2 = z;
                        i2 = 8;
                    }
                }
                int i23 = c1014.f3707;
                if (z) {
                    i23 = c1015.f3707;
                }
                float f4 = 0.5f;
                if (i5 > i12) {
                    i23 = z ? i23 + ((int) (((i5 - i12) / 2.0f) + 0.5f)) : i23 - ((int) (((i5 - i12) / 2.0f) + 0.5f));
                }
                if (i3 > 0) {
                    float f5 = i12 - i5;
                    int i24 = (int) ((f5 / i3) + 0.5f);
                    int i25 = 0;
                    int i26 = 0;
                    while (i25 < size) {
                        float f6 = 0.5f;
                        AbstractC3640 abstractC3641 = (AbstractC3640) arrayList.get(i25);
                        int i27 = i23;
                        C0793 c0795 = abstractC3641.f11387;
                        int i28 = i3;
                        C1042 c1043 = abstractC3641.f11390;
                        float f7 = f5;
                        int i29 = i24;
                        if (c0795.f3125 == 8 || abstractC3641.f11389 != 3 || c1043.f3710) {
                            i9 = i25;
                        } else {
                            int i30 = f > 0.0f ? (int) (((c0795.f3129[this.f11391] * f7) / f) + 0.5f) : i29;
                            if (this.f11391 == 0) {
                                int i31 = c0795.f3088;
                                i9 = i25;
                                iMax = Math.max(c0795.f3087, abstractC3641.f11386 == 1 ? Math.min(i30, c1043.f3794) : i30);
                                if (i31 > 0) {
                                    iMax = Math.min(i31, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            } else {
                                i9 = i25;
                                int i32 = c0795.f3091;
                                iMax = Math.max(c0795.f3090, abstractC3641.f11386 == 1 ? Math.min(i30, c1043.f3794) : i30);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            }
                            c1043.mo2588(i30);
                        }
                        i25 = i9 + 1;
                        i23 = i27;
                        f4 = 0.5f;
                        i3 = i28;
                        f5 = f7;
                        i24 = i29;
                    }
                    i6 = i23;
                    f2 = 0.5f;
                    int i33 = i3;
                    if (i26 > 0) {
                        i3 = i33 - i26;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC3640 abstractC3642 = (AbstractC3640) arrayList.get(i34);
                            if (abstractC3642.f11387.f3125 != 8) {
                                if (i34 > 0 && i34 >= i13) {
                                    i5 += abstractC3642.f11393.f3706;
                                }
                                i5 += abstractC3642.f11390.f3707;
                                if (i34 < i14 && i34 < i) {
                                    i5 += -abstractC3642.f11394.f3706;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.f2372 == 2 && i26 == 0) {
                        i7 = 0;
                        this.f2372 = 0;
                    } else {
                        i7 = 0;
                    }
                } else {
                    i6 = i23;
                    f2 = 0.5f;
                    i7 = 0;
                    i8 = 2;
                }
                if (i5 > i12) {
                    this.f2372 = 2;
                }
                if (i4 > 0 && i3 == 0 && i13 == i) {
                    this.f2372 = 2;
                }
                int i35 = this.f2372;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i12 - i5) / (i4 - 1) : i4 == 1 ? (i12 - i5) / 2 : 0;
                    if (i3 > 0) {
                        i36 = 0;
                    }
                    int i37 = i6;
                    for (int i38 = 0; i38 < size; i38++) {
                        AbstractC3640 abstractC3643 = (AbstractC3640) arrayList.get(z ? size - (i38 + 1) : i38);
                        C0793 c0796 = abstractC3643.f11387;
                        C1014 c1016 = abstractC3643.f11394;
                        C1014 c1017 = abstractC3643.f11393;
                        if (c0796.f3125 == 8) {
                            c1017.mo2588(i37);
                            c1016.mo2588(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i13) {
                                i37 = z ? i37 - c1017.f3706 : i37 + c1017.f3706;
                            }
                            if (z) {
                                c1016.mo2588(i37);
                            } else {
                                c1017.mo2588(i37);
                            }
                            C1042 c1044 = abstractC3643.f11390;
                            int i39 = c1044.f3707;
                            if (abstractC3643.f11389 == 3 && abstractC3643.f11386 == 1) {
                                i39 = c1044.f3794;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c1017.mo2588(i37);
                            } else {
                                c1016.mo2588(i37);
                            }
                            abstractC3643.f11392 = true;
                            if (i38 < i14 && i38 < i) {
                                i37 = z ? i37 - (-c1016.f3706) : i37 + (-c1016.f3706);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i12 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = 0;
                    }
                    int i41 = i6;
                    for (int i42 = 0; i42 < size; i42++) {
                        AbstractC3640 abstractC3644 = (AbstractC3640) arrayList.get(z ? size - (i42 + 1) : i42);
                        C0793 c0797 = abstractC3644.f11387;
                        C1014 c1018 = abstractC3644.f11394;
                        C1014 c1019 = abstractC3644.f11393;
                        if (c0797.f3125 == 8) {
                            c1019.mo2588(i41);
                            c1018.mo2588(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i13) {
                                i43 = z ? i43 - c1019.f3706 : i43 + c1019.f3706;
                            }
                            if (z) {
                                c1018.mo2588(i43);
                            } else {
                                c1019.mo2588(i43);
                            }
                            C1042 c1045 = abstractC3644.f11390;
                            int iMin = c1045.f3707;
                            if (abstractC3644.f11389 == 3 && abstractC3644.f11386 == 1) {
                                iMin = Math.min(iMin, c1045.f3794);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c1019.mo2588(i41);
                            } else {
                                c1018.mo2588(i41);
                            }
                            if (i42 < i14 && i42 < i) {
                                i41 = z ? i41 - (-c1018.f3706) : i41 + (-c1018.f3706);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f8 = this.f11391 == 0 ? this.f11387.f3122 : this.f11387.f3123;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i12 - i5) * f8) + 0.5f);
                    if (i44 < 0 || i3 > 0) {
                        i44 = 0;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = 0; i46 < size; i46++) {
                        AbstractC3640 abstractC3645 = (AbstractC3640) arrayList.get(z ? size - (i46 + 1) : i46);
                        C0793 c0798 = abstractC3645.f11387;
                        C1014 c10110 = abstractC3645.f11394;
                        C1014 c10111 = abstractC3645.f11393;
                        if (c0798.f3125 == 8) {
                            c10111.mo2588(i45);
                            c10110.mo2588(i45);
                        } else {
                            if (i46 > 0 && i46 >= i13) {
                                i45 = z ? i45 - c10111.f3706 : i45 + c10111.f3706;
                            }
                            if (z) {
                                c10110.mo2588(i45);
                            } else {
                                c10111.mo2588(i45);
                            }
                            C1042 c1046 = abstractC3645.f11390;
                            int i47 = c1046.f3707;
                            if (abstractC3645.f11389 == 3 && abstractC3645.f11386 == 1) {
                                i47 = c1046.f3794;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c10111.mo2588(i45);
                            } else {
                                c10110.mo2588(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-c10110.f3706) : i45 + (-c10110.f3706);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC3640
    public final void mo2004() {
        ArrayList arrayList = this.f2371;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3640) it.next()).mo2004();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0793 c0793 = ((AbstractC3640) arrayList.get(0)).f11387;
        C0793 c0794 = ((AbstractC3640) arrayList.get(size - 1)).f11387;
        int i = this.f11391;
        C1014 c1014 = this.f11394;
        C1014 c1015 = this.f11393;
        if (i == 0) {
            C0779 c0779 = c0793.f3101;
            C0779 c07710 = c0794.f3103;
            C1014 c1014M5229 = AbstractC3640.m5229(c0779, 0);
            int iM2274 = c0779.m2274();
            C0793 c0793M2009 = m2009();
            if (c0793M2009 != null) {
                iM2274 = c0793M2009.f3101.m2274();
            }
            if (c1014M5229 != null) {
                AbstractC3640.m5227(c1015, c1014M5229, iM2274);
            }
            C1014 c1014M52210 = AbstractC3640.m5229(c07710, 0);
            int iM2275 = c07710.m2274();
            C0793 c0793M2010 = m2010();
            if (c0793M2010 != null) {
                iM2275 = c0793M2010.f3103.m2274();
            }
            if (c1014M52210 != null) {
                AbstractC3640.m5227(c1014, c1014M52210, -iM2275);
            }
        } else {
            C0779 c07711 = c0793.f3102;
            C0779 c07712 = c0794.f3104;
            C1014 c1014M52211 = AbstractC3640.m5229(c07711, 1);
            int iM2276 = c07711.m2274();
            C0793 c0793M20010 = m2009();
            if (c0793M20010 != null) {
                iM2276 = c0793M20010.f3102.m2274();
            }
            if (c1014M52211 != null) {
                AbstractC3640.m5227(c1015, c1014M52211, iM2276);
            }
            C1014 c1014M52212 = AbstractC3640.m5229(c07712, 1);
            int iM2277 = c07712.m2274();
            C0793 c0793M2011 = m2010();
            if (c0793M2011 != null) {
                iM2277 = c0793M2011.f3104.m2274();
            }
            if (c1014M52212 != null) {
                AbstractC3640.m5227(c1014, c1014M52212, -iM2277);
            }
        }
        c1015.f3701 = this;
        c1014.f3701 = this;
    }

    @Override // p000.AbstractC3640
    public final void mo2005() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2371;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC3640) arrayList.get(i)).mo2005();
            i++;
        }
    }

    @Override // p000.AbstractC3640
    public final void mo2006() {
        this.f11388 = null;
        Iterator it = this.f2371.iterator();
        while (it.hasNext()) {
            ((AbstractC3640) it.next()).mo2006();
        }
    }

    @Override // p000.AbstractC3640
    public final long mo2007() {
        ArrayList arrayList = this.f2371;
        int size = arrayList.size();
        long jMo2007 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC3640 abstractC3640 = (AbstractC3640) arrayList.get(i);
            jMo2007 = ((long) abstractC3640.f11394.f3706) + abstractC3640.mo2007() + jMo2007 + ((long) abstractC3640.f11393.f3706);
        }
        return jMo2007;
    }

    @Override // p000.AbstractC3640
    public final boolean mo2008() {
        ArrayList arrayList = this.f2371;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC3640) arrayList.get(i)).mo2008()) {
                return false;
            }
        }
        return true;
    }

    public final C0793 m2009() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2371;
            if (i >= arrayList.size()) {
                return null;
            }
            C0793 c0793 = ((AbstractC3640) arrayList.get(i)).f11387;
            if (c0793.f3125 != 8) {
                return c0793;
            }
            i++;
        }
    }

    public final C0793 m2010() {
        ArrayList arrayList = this.f2371;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0793 c0793 = ((AbstractC3640) arrayList.get(size)).f11387;
            if (c0793.f3125 != 8) {
                return c0793;
            }
        }
        return null;
    }
}
