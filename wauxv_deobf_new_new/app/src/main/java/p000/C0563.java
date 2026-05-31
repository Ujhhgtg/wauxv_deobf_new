package p000;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᤝᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0563 extends AbstractC3700 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f2337;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f2338;

    public C0563(C0792 c0792, int i) {
        C0792 c0793;
        super(c0792);
        ArrayList<AbstractC3700> arrayList = new ArrayList();
        this.f2337 = arrayList;
        this.f11540 = i;
        C0792 c0794 = this.f11536;
        C0792 c0792M2430 = c0794.m2430(i);
        while (true) {
            c0793 = c0794;
            c0794 = c0792M2430;
            if (c0794 == null) {
                break;
            } else {
                c0792M2430 = c0794.m2430(this.f11540);
            }
        }
        this.f11536 = c0793;
        int i2 = this.f11540;
        arrayList.add(i2 == 0 ? c0793.f3083 : i2 == 1 ? c0793.f3084 : null);
        C0792 c0792M2429 = c0793.m2429(this.f11540);
        while (c0792M2429 != null) {
            int i3 = this.f11540;
            arrayList.add(i3 == 0 ? c0792M2429.f3083 : i3 == 1 ? c0792M2429.f3084 : null);
            c0792M2429 = c0792M2429.m2429(this.f11540);
        }
        for (AbstractC3700 abstractC3700 : arrayList) {
            int i4 = this.f11540;
            if (i4 == 0) {
                abstractC3700.f11536.f3081 = this;
            } else if (i4 == 1) {
                abstractC3700.f11536.f3082 = this;
            }
        }
        if (this.f11540 == 0 && ((C0793) this.f11536.f3119).f3146 && arrayList.size() > 1) {
            this.f11536 = ((AbstractC3700) arrayList.get(arrayList.size() - 1)).f11536;
        }
        this.f2338 = this.f11540 == 0 ? this.f11536.f3134 : this.f11536.f3135;
    }

    public final String toString() {
        String strConcat = "ChainRun ".concat(this.f11540 == 0 ? "horizontal : " : "vertical : ");
        for (AbstractC3700 abstractC3700 : this.f2337) {
            strConcat = AbstractC2844.m4782(AbstractC2844.m4782(strConcat, "<") + abstractC3700, "> ");
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
    @Override // p000.InterfaceC1015
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo2100(InterfaceC1015 interfaceC1015) {
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
        C1017 c1017 = this.f11542;
        if (c1017.f3717) {
            C1017 c1018 = this.f11543;
            if (c1018.f3717) {
                C0792 c0792 = this.f11536.f3119;
                boolean z2 = (c0792 == null || !(c0792 instanceof C0793)) ? false : ((C0793) c0792).f3146;
                int i12 = c1018.f3714 - c1017.f3714;
                ArrayList arrayList = this.f2337;
                int size = arrayList.size();
                int i13 = 0;
                while (true) {
                    i = -1;
                    i2 = 8;
                    if (i13 >= size) {
                        i13 = -1;
                        break;
                    } else if (((AbstractC3700) arrayList.get(i13)).f11536.f3132 != 8) {
                        break;
                    } else {
                        i13++;
                    }
                }
                int i14 = size - 1;
                for (int i15 = i14; i15 >= 0; i15--) {
                    if (((AbstractC3700) arrayList.get(i15)).f11536.f3132 != 8) {
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
                        AbstractC3700 abstractC3700 = (AbstractC3700) arrayList.get(i17);
                        C0792 c0793 = abstractC3700.f11536;
                        boolean z3 = z2;
                        if (c0793.f3132 == i2) {
                            i10 = i16;
                        } else {
                            i19++;
                            if (i17 > 0 && i17 >= i13) {
                                i5 += abstractC3700.f11542.f3713;
                            }
                            C1045 c1045 = abstractC3700.f11539;
                            int i20 = c1045.f3714;
                            i10 = i16;
                            boolean z4 = abstractC3700.f11538 != 3;
                            if (z4) {
                                int i21 = this.f11540;
                                if (i21 == 0 && !c0793.f3083.f11539.f3717) {
                                    return;
                                }
                                if (i21 == 1 && !c0793.f3084.f11539.f3717) {
                                    return;
                                }
                            } else {
                                if (abstractC3700.f11535 == 1 && i10 == 0) {
                                    i11 = c1045.f3801;
                                    i18++;
                                } else {
                                    if (c1045.f3717) {
                                        i11 = i20;
                                    }
                                    if (z4) {
                                        i5 += i11;
                                    } else {
                                        i18++;
                                        f3 = c0793.f3136[this.f11540];
                                        if (f3 >= 0.0f) {
                                            f += f3;
                                        }
                                    }
                                    if (i17 >= i14 && i17 < i) {
                                        i5 += -abstractC3700.f11543.f3713;
                                    }
                                }
                                z4 = true;
                                if (z4) {
                                    i18++;
                                    f3 = c0793.f3136[this.f11540];
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
                            if (z4) {
                                i18++;
                                f3 = c0793.f3136[this.f11540];
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
                int i23 = c1017.f3714;
                if (z) {
                    i23 = c1018.f3714;
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
                        float f6 = f4;
                        AbstractC3700 abstractC3701 = (AbstractC3700) arrayList.get(i25);
                        int i27 = i23;
                        C0792 c0794 = abstractC3701.f11536;
                        int i28 = i3;
                        C1045 c1046 = abstractC3701.f11539;
                        float f7 = f5;
                        int i29 = i24;
                        if (c0794.f3132 == 8 || abstractC3701.f11538 != 3 || c1046.f3717) {
                            i9 = i25;
                        } else {
                            int i30 = f > 0.0f ? (int) (((c0794.f3136[this.f11540] * f7) / f) + f6) : i29;
                            if (this.f11540 == 0) {
                                int i31 = c0794.f3095;
                                i9 = i25;
                                iMax = Math.max(c0794.f3094, abstractC3701.f11535 == 1 ? Math.min(i30, c1046.f3801) : i30);
                                if (i31 > 0) {
                                    iMax = Math.min(i31, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            } else {
                                i9 = i25;
                                int i32 = c0794.f3098;
                                iMax = Math.max(c0794.f3097, abstractC3701.f11535 == 1 ? Math.min(i30, c1046.f3801) : i30);
                                if (i32 > 0) {
                                    iMax = Math.min(i32, iMax);
                                }
                                if (iMax != i30) {
                                    i26++;
                                    i30 = iMax;
                                }
                            }
                            c1046.mo2712(i30);
                        }
                        i25 = i9 + 1;
                        i23 = i27;
                        f4 = f6;
                        i3 = i28;
                        f5 = f7;
                        i24 = i29;
                    }
                    i6 = i23;
                    f2 = f4;
                    int i33 = i3;
                    if (i26 > 0) {
                        i3 = i33 - i26;
                        i5 = 0;
                        for (int i34 = 0; i34 < size; i34++) {
                            AbstractC3700 abstractC3702 = (AbstractC3700) arrayList.get(i34);
                            if (abstractC3702.f11536.f3132 != 8) {
                                if (i34 > 0 && i34 >= i13) {
                                    i5 += abstractC3702.f11542.f3713;
                                }
                                i5 += abstractC3702.f11539.f3714;
                                if (i34 < i14 && i34 < i) {
                                    i5 += -abstractC3702.f11543.f3713;
                                }
                            }
                        }
                    } else {
                        i3 = i33;
                    }
                    i8 = 2;
                    if (this.f2338 == 2 && i26 == 0) {
                        i7 = 0;
                        this.f2338 = 0;
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
                    this.f2338 = i8;
                }
                if (i4 > 0 && i3 == 0 && i13 == i) {
                    this.f2338 = i8;
                }
                int i35 = this.f2338;
                if (i35 == 1) {
                    int i36 = i4 > 1 ? (i12 - i5) / (i4 - 1) : i4 == 1 ? (i12 - i5) / 2 : i7;
                    if (i3 > 0) {
                        i36 = i7;
                    }
                    int i37 = i6;
                    for (int i38 = i7; i38 < size; i38++) {
                        AbstractC3700 abstractC3703 = (AbstractC3700) arrayList.get(z ? size - (i38 + 1) : i38);
                        C0792 c0795 = abstractC3703.f11536;
                        C1017 c1019 = abstractC3703.f11543;
                        C1017 c10110 = abstractC3703.f11542;
                        if (c0795.f3132 == 8) {
                            c10110.mo2712(i37);
                            c1019.mo2712(i37);
                        } else {
                            if (i38 > 0) {
                                i37 = z ? i37 - i36 : i37 + i36;
                            }
                            if (i38 > 0 && i38 >= i13) {
                                i37 = z ? i37 - c10110.f3713 : i37 + c10110.f3713;
                            }
                            if (z) {
                                c1019.mo2712(i37);
                            } else {
                                c10110.mo2712(i37);
                            }
                            C1045 c1047 = abstractC3703.f11539;
                            int i39 = c1047.f3714;
                            if (abstractC3703.f11538 == 3 && abstractC3703.f11535 == 1) {
                                i39 = c1047.f3801;
                            }
                            i37 = z ? i37 - i39 : i37 + i39;
                            if (z) {
                                c10110.mo2712(i37);
                            } else {
                                c1019.mo2712(i37);
                            }
                            abstractC3703.f11541 = true;
                            if (i38 < i14 && i38 < i) {
                                i37 = z ? i37 - (-c1019.f3713) : i37 + (-c1019.f3713);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 0) {
                    int i40 = (i12 - i5) / (i4 + 1);
                    if (i3 > 0) {
                        i40 = i7;
                    }
                    int i41 = i6;
                    for (int i42 = i7; i42 < size; i42++) {
                        AbstractC3700 abstractC3704 = (AbstractC3700) arrayList.get(z ? size - (i42 + 1) : i42);
                        C0792 c0796 = abstractC3704.f11536;
                        C1017 c10111 = abstractC3704.f11543;
                        C1017 c10112 = abstractC3704.f11542;
                        if (c0796.f3132 == 8) {
                            c10112.mo2712(i41);
                            c10111.mo2712(i41);
                        } else {
                            int i43 = z ? i41 - i40 : i41 + i40;
                            if (i42 > 0 && i42 >= i13) {
                                i43 = z ? i43 - c10112.f3713 : i43 + c10112.f3713;
                            }
                            if (z) {
                                c10111.mo2712(i43);
                            } else {
                                c10112.mo2712(i43);
                            }
                            C1045 c1048 = abstractC3704.f11539;
                            int iMin = c1048.f3714;
                            if (abstractC3704.f11538 == 3 && abstractC3704.f11535 == 1) {
                                iMin = Math.min(iMin, c1048.f3801);
                            }
                            i41 = z ? i43 - iMin : i43 + iMin;
                            if (z) {
                                c10112.mo2712(i41);
                            } else {
                                c10111.mo2712(i41);
                            }
                            if (i42 < i14 && i42 < i) {
                                i41 = z ? i41 - (-c10111.f3713) : i41 + (-c10111.f3713);
                            }
                        }
                    }
                    return;
                }
                if (i35 == 2) {
                    float f8 = this.f11540 == 0 ? this.f11536.f3129 : this.f11536.f3130;
                    if (z) {
                        f8 = 1.0f - f8;
                    }
                    int i44 = (int) (((i12 - i5) * f8) + f2);
                    if (i44 < 0 || i3 > 0) {
                        i44 = i7;
                    }
                    int i45 = z ? i6 - i44 : i6 + i44;
                    for (int i46 = i7; i46 < size; i46++) {
                        AbstractC3700 abstractC3705 = (AbstractC3700) arrayList.get(z ? size - (i46 + 1) : i46);
                        C0792 c0797 = abstractC3705.f11536;
                        C1017 c10113 = abstractC3705.f11543;
                        C1017 c10114 = abstractC3705.f11542;
                        if (c0797.f3132 == 8) {
                            c10114.mo2712(i45);
                            c10113.mo2712(i45);
                        } else {
                            if (i46 > 0 && i46 >= i13) {
                                i45 = z ? i45 - c10114.f3713 : i45 + c10114.f3713;
                            }
                            if (z) {
                                c10113.mo2712(i45);
                            } else {
                                c10114.mo2712(i45);
                            }
                            C1045 c1049 = abstractC3705.f11539;
                            int i47 = c1049.f3714;
                            if (abstractC3705.f11538 == 3 && abstractC3705.f11535 == 1) {
                                i47 = c1049.f3801;
                            }
                            i45 = z ? i45 - i47 : i45 + i47;
                            if (z) {
                                c10114.mo2712(i45);
                            } else {
                                c10113.mo2712(i45);
                            }
                            if (i46 < i14 && i46 < i) {
                                i45 = z ? i45 - (-c10113.f3713) : i45 + (-c10113.f3713);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo2101() {
        ArrayList arrayList = this.f2337;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((AbstractC3700) it.next()).mo2101();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        C0792 c0792 = ((AbstractC3700) arrayList.get(0)).f11536;
        C0792 c0793 = ((AbstractC3700) arrayList.get(size - 1)).f11536;
        int i = this.f11540;
        C1017 c1017 = this.f11543;
        C1017 c1018 = this.f11542;
        if (i == 0) {
            C0778 c0778 = c0792.f3108;
            C0778 c0779 = c0793.f3110;
            C1017 c1017M5235 = AbstractC3700.m5235(c0778, 0);
            int iM2389 = c0778.m2389();
            C0792 c0792M2106 = m2106();
            if (c0792M2106 != null) {
                iM2389 = c0792M2106.f3108.m2389();
            }
            if (c1017M5235 != null) {
                AbstractC3700.m5233(c1018, c1017M5235, iM2389);
            }
            C1017 c1017M5236 = AbstractC3700.m5235(c0779, 0);
            int iM23810 = c0779.m2389();
            C0792 c0792M2107 = m2107();
            if (c0792M2107 != null) {
                iM23810 = c0792M2107.f3110.m2389();
            }
            if (c1017M5236 != null) {
                AbstractC3700.m5233(c1017, c1017M5236, -iM23810);
            }
        } else {
            C0778 c07710 = c0792.f3109;
            C0778 c07711 = c0793.f3111;
            C1017 c1017M5237 = AbstractC3700.m5235(c07710, 1);
            int iM23811 = c07710.m2389();
            C0792 c0792M2108 = m2106();
            if (c0792M2108 != null) {
                iM23811 = c0792M2108.f3109.m2389();
            }
            if (c1017M5237 != null) {
                AbstractC3700.m5233(c1018, c1017M5237, iM23811);
            }
            C1017 c1017M5238 = AbstractC3700.m5235(c07711, 1);
            int iM23812 = c07711.m2389();
            C0792 c0792M2109 = m2107();
            if (c0792M2109 != null) {
                iM23812 = c0792M2109.f3111.m2389();
            }
            if (c1017M5238 != null) {
                AbstractC3700.m5233(c1017, c1017M5238, -iM23812);
            }
        }
        c1018.f3708 = this;
        c1017.f3708 = this;
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void mo2102() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2337;
            if (i >= arrayList.size()) {
                return;
            }
            ((AbstractC3700) arrayList.get(i)).mo2102();
            i++;
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void mo2103() {
        this.f11537 = null;
        Iterator it = this.f2337.iterator();
        while (it.hasNext()) {
            ((AbstractC3700) it.next()).mo2103();
        }
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final long mo2104() {
        ArrayList arrayList = this.f2337;
        int size = arrayList.size();
        long jMo2104 = 0;
        for (int i = 0; i < size; i++) {
            AbstractC3700 abstractC3700 = (AbstractC3700) arrayList.get(i);
            jMo2104 = ((long) abstractC3700.f11543.f3713) + abstractC3700.mo2104() + jMo2104 + ((long) abstractC3700.f11542.f3713);
        }
        return jMo2104;
    }

    @Override // p000.AbstractC3700
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final boolean mo2105() {
        ArrayList arrayList = this.f2337;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((AbstractC3700) arrayList.get(i)).mo2105()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final C0792 m2106() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f2337;
            if (i >= arrayList.size()) {
                return null;
            }
            C0792 c0792 = ((AbstractC3700) arrayList.get(i)).f11536;
            if (c0792.f3132 != 8) {
                return c0792;
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C0792 m2107() {
        ArrayList arrayList = this.f2337;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0792 c0792 = ((AbstractC3700) arrayList.get(size)).f11536;
            if (c0792.f3132 != 8) {
                return c0792;
            }
        }
        return null;
    }
}
