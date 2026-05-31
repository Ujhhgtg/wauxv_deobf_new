package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᤞᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1016 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public C0793 f3700;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public boolean f3701;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public boolean f3702;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0793 f3703;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ArrayList f3704;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C0783 f3705;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0382 f3706;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ArrayList f3707;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m2703(C1017 c1017, int i, ArrayList arrayList, C2669 c2669) {
        AbstractC3700 abstractC3700 = c1017.f3711;
        C2669 c26610 = abstractC3700.f11537;
        C1017 c1018 = abstractC3700.f11543;
        C1017 c1019 = abstractC3700.f11542;
        if (c26610 == null) {
            C0793 c0793 = this.f3700;
            if (abstractC3700 == c0793.f3083 || abstractC3700 == c0793.f3084) {
                return;
            }
            if (c2669 == null) {
                c2669 = new C2669();
                c2669.f8651 = null;
                c2669.f8652 = new ArrayList();
                c2669.f8651 = abstractC3700;
                arrayList.add(c2669);
            }
            abstractC3700.f11537 = c2669;
            c2669.f8652.add(abstractC3700);
            for (InterfaceC1015 interfaceC1015 : c1019.f3718) {
                if (interfaceC1015 instanceof C1017) {
                    m2703((C1017) interfaceC1015, i, arrayList, c2669);
                }
            }
            for (InterfaceC1015 interfaceC1016 : c1018.f3718) {
                if (interfaceC1016 instanceof C1017) {
                    m2703((C1017) interfaceC1016, i, arrayList, c2669);
                }
            }
            if (i == 1 && (abstractC3700 instanceof C3607)) {
                for (InterfaceC1015 interfaceC1017 : ((C3607) abstractC3700).f11297.f3718) {
                    if (interfaceC1017 instanceof C1017) {
                        m2703((C1017) interfaceC1017, i, arrayList, c2669);
                    }
                }
            }
            Iterator it = c1019.f3719.iterator();
            while (it.hasNext()) {
                m2703((C1017) it.next(), i, arrayList, c2669);
            }
            Iterator it2 = c1018.f3719.iterator();
            while (it2.hasNext()) {
                m2703((C1017) it2.next(), i, arrayList, c2669);
            }
            if (i == 1 && (abstractC3700 instanceof C3607)) {
                Iterator it3 = ((C3607) abstractC3700).f11297.f3719.iterator();
                while (it3.hasNext()) {
                    m2703((C1017) it3.next(), i, arrayList, c2669);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:102:0x01be  */
    /* JADX WARN: Code duplicated, block: B:105:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:114:0x021a  */
    /* JADX WARN: Code duplicated, block: B:123:0x025d  */
    /* JADX WARN: Code duplicated, block: B:148:0x0307  */
    /* JADX WARN: Code duplicated, block: B:151:0x0319  */
    /* JADX WARN: Code duplicated, block: B:152:0x032c  */
    /* JADX WARN: Code duplicated, block: B:158:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:162:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x01fc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x0226 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0268 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0293 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x028c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:186:0x0253 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x0216 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x019d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:194:0x016b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:199:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x00c2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x000a A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a4 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m2704(C0793 c0793) {
        int i;
        int iM2431;
        int iM2428;
        int iM2429;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f;
        int i15;
        int i16;
        ArrayList<C0792> arrayList = c0793.f3142;
        int[] iArr = c0793.f3141;
        for (C0792 c0792 : arrayList) {
            int[] iArr2 = c0792.f3141;
            C0778[] c0778Arr = c0792.f3116;
            C0778 c0778 = c0792.f3111;
            C0778 c0779 = c0792.f3109;
            C0778 c07710 = c0792.f3110;
            C0778 c07711 = c0792.f3108;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            if (c0792.f3132 == 8) {
                c0792.f3080 = true;
            } else {
                float f2 = c0792.f3096;
                if (f2 < 1.0f && i17 == 3) {
                    c0792.f3091 = 2;
                }
                float f3 = c0792.f3099;
                if (f3 < 1.0f && i18 == 3) {
                    c0792.f3092 = 2;
                }
                if (c0792.f3122 > 0.0f) {
                    if (i17 == 3 && (i18 == 2 || i18 == 1)) {
                        c0792.f3091 = 3;
                    } else if (i18 == 3 && (i17 == 2 || i17 == 1)) {
                        c0792.f3092 = 3;
                    } else if (i17 == 3 && i18 == 3) {
                        if (c0792.f3091 == 0) {
                            c0792.f3091 = 3;
                        }
                        if (c0792.f3092 == 0) {
                            c0792.f3092 = 3;
                        }
                    }
                }
                if (i17 == 3 && c0792.f3091 == 1 && (c07711.f2888 == null || c07710.f2888 == null)) {
                    i17 = 2;
                }
                if (i18 == 3 && c0792.f3092 == 1 && (c0779.f2888 == null || c0778.f2888 == null)) {
                    i18 = 2;
                }
                C1575 c1575 = c0792.f3083;
                c1575.f11538 = i17;
                int i19 = c0792.f3091;
                c1575.f11535 = i19;
                C3607 c3607 = c0792.f3084;
                c3607.f11538 = i18;
                int i20 = c0792.f3092;
                c3607.f11535 = i20;
                if (i17 == 4 || i17 == 1) {
                    if (i18 == 4) {
                        if (i18 != 1) {
                            i3 = 2;
                            if (i18 != 2) {
                                if (i17 != 3) {
                                    i4 = i18;
                                    i5 = 1;
                                } else if (i18 == i3 && i18 != 1) {
                                    i4 = i18;
                                    i6 = 3;
                                    i5 = 1;
                                    if (i4 != i6) {
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i17;
                                    } else if (i17 == i3 && i17 != i5) {
                                        i11 = i6;
                                        i7 = i4;
                                        i8 = i3;
                                        i9 = 1;
                                        i10 = i17;
                                        if (i10 != i11 && i7 == i11) {
                                            if (i19 == i9 || i20 == i9) {
                                                m2708(i8, 0, i8, 0, c0792);
                                                c0792.f3083.f11539.f3801 = c0792.m2431();
                                                c0792.f3084.f11539.f3801 = c0792.m2428();
                                            } else if (i20 == 2 && i19 == 2 && ((i12 = iArr[0]) == i5 || i12 == i5)) {
                                                int i21 = iArr[i9];
                                                if (i21 == i5 || i21 == i5) {
                                                    m2708(i5, (int) ((f2 * c0793.m2431()) + 0.5f), i5, (int) ((f3 * c0793.m2428()) + 0.5f), c0792);
                                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                                    c0792.f3080 = true;
                                                }
                                            }
                                        }
                                    } else if (i20 == i6) {
                                        if (i17 == i3) {
                                            m2708(i3, 0, i3, 0, c0792);
                                        }
                                        int iM2432 = c0792.m2431();
                                        f = c0792.f3122;
                                        if (c0792.f3123 == -1) {
                                            f = 1.0f / f;
                                        }
                                        m2708(i5, iM2432, i5, (int) ((iM2432 * f) + 0.5f), c0792);
                                        c0792.f3083.f11539.mo2712(c0792.m2431());
                                        c0792.f3084.f11539.mo2712(c0792.m2428());
                                        c0792.f3080 = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i13 = i3;
                                        if (i20 == 1) {
                                            m2708(i17, 0, i13, 0, c0792);
                                            c0792.f3084.f11539.f3801 = c0792.m2428();
                                        } else {
                                            i10 = i17;
                                            if (i20 == 2) {
                                                i14 = iArr[1];
                                                if (i14 != i5 || i14 == 4) {
                                                    m2708(i10, c0792.m2431(), i5, (int) ((f3 * c0793.m2428()) + 0.5f), c0792);
                                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                                    c0792.f3080 = true;
                                                } else {
                                                    i8 = i13;
                                                    i9 = 1;
                                                }
                                            } else if (c0778Arr[2].f2888 != null || c0778Arr[3].f2888 == null) {
                                                m2708(i13, 0, i7, 0, c0792);
                                                c0792.f3083.f11539.mo2712(c0792.m2431());
                                                c0792.f3084.f11539.mo2712(c0792.m2428());
                                                c0792.f3080 = true;
                                            } else {
                                                i8 = i13;
                                                i9 = 1;
                                            }
                                        }
                                    }
                                    i11 = 3;
                                    if (i10 != i11) {
                                    }
                                } else if (i19 == 3) {
                                    if (i18 == i3) {
                                        m2708(i3, 0, i3, 0, c0792);
                                    }
                                    int iM24210 = c0792.m2428();
                                    m2708(1, (int) ((iM24210 * c0792.f3122) + 0.5f), 1, iM24210, c0792);
                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                    c0792.f3080 = true;
                                } else {
                                    i15 = i3;
                                    if (i19 == 1) {
                                        m2708(i15, 0, i18, 0, c0792);
                                        c0792.f3083.f11539.f3801 = c0792.m2431();
                                    } else {
                                        i3 = i15;
                                        if (i19 == 2) {
                                            i16 = iArr[0];
                                            if (i16 != 1 || i16 == 4) {
                                                m2708(1, (int) ((f2 * c0793.m2431()) + 0.5f), i18, c0792.m2428(), c0792);
                                                c0792.f3083.f11539.mo2712(c0792.m2431());
                                                c0792.f3084.f11539.mo2712(c0792.m2428());
                                                c0792.f3080 = true;
                                            } else {
                                                i5 = 1;
                                                i4 = i18;
                                            }
                                        } else {
                                            i5 = 1;
                                            i4 = i18;
                                            if (c0778Arr[0].f2888 != null || c0778Arr[1].f2888 == null) {
                                                m2708(i3, 0, i4, 0, c0792);
                                                c0792.f3083.f11539.mo2712(c0792.m2431());
                                                c0792.f3084.f11539.mo2712(c0792.m2428());
                                                c0792.f3080 = true;
                                            }
                                        }
                                    }
                                }
                                i6 = 3;
                                if (i4 != i6) {
                                    if (i17 == i3) {
                                    }
                                    if (i20 == i6) {
                                        if (i17 == i3) {
                                            m2708(i3, 0, i3, 0, c0792);
                                        }
                                        int iM2433 = c0792.m2431();
                                        f = c0792.f3122;
                                        if (c0792.f3123 == -1) {
                                            f = 1.0f / f;
                                        }
                                        m2708(i5, iM2433, i5, (int) ((iM2433 * f) + 0.5f), c0792);
                                        c0792.f3083.f11539.mo2712(c0792.m2431());
                                        c0792.f3084.f11539.mo2712(c0792.m2428());
                                        c0792.f3080 = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i13 = i3;
                                        if (i20 == 1) {
                                            m2708(i17, 0, i13, 0, c0792);
                                            c0792.f3084.f11539.f3801 = c0792.m2428();
                                        } else {
                                            i10 = i17;
                                            if (i20 == 2) {
                                                i14 = iArr[1];
                                                if (i14 != i5) {
                                                }
                                                m2708(i10, c0792.m2431(), i5, (int) ((f3 * c0793.m2428()) + 0.5f), c0792);
                                                c0792.f3083.f11539.mo2712(c0792.m2431());
                                                c0792.f3084.f11539.mo2712(c0792.m2428());
                                                c0792.f3080 = true;
                                            } else {
                                                if (c0778Arr[2].f2888 != null) {
                                                }
                                                m2708(i13, 0, i7, 0, c0792);
                                                c0792.f3083.f11539.mo2712(c0792.m2431());
                                                c0792.f3084.f11539.mo2712(c0792.m2428());
                                                c0792.f3080 = true;
                                            }
                                        }
                                    }
                                } else {
                                    i7 = i4;
                                    i8 = i3;
                                    i9 = 1;
                                    i10 = i17;
                                }
                                i11 = 3;
                                if (i10 != i11) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iM2431 = c0792.m2431();
                        if (i17 == 4) {
                            iM2431 = (c0793.m2431() - c07711.f2889) - c07710.f2889;
                            i17 = i;
                        }
                        iM2428 = c0792.m2428();
                        if (i18 == 4) {
                            iM2429 = (c0793.m2428() - c0779.f2889) - c0778.f2889;
                            i2 = i;
                        } else {
                            iM2429 = iM2428;
                            i2 = i18;
                        }
                        m2708(i17, iM2431, i2, iM2429, c0792);
                        c0792.f3083.f11539.mo2712(c0792.m2431());
                        c0792.f3084.f11539.mo2712(c0792.m2428());
                        c0792.f3080 = true;
                    }
                    i = 1;
                    iM2431 = c0792.m2431();
                    if (i17 == 4) {
                        iM2431 = (c0793.m2431() - c07711.f2889) - c07710.f2889;
                        i17 = i;
                    }
                    iM2428 = c0792.m2428();
                    if (i18 == 4) {
                        iM2429 = (c0793.m2428() - c0779.f2889) - c0778.f2889;
                        i2 = i;
                    } else {
                        iM2429 = iM2428;
                        i2 = i18;
                    }
                    m2708(i17, iM2431, i2, iM2429, c0792);
                    c0792.f3083.f11539.mo2712(c0792.m2431());
                    c0792.f3084.f11539.mo2712(c0792.m2428());
                    c0792.f3080 = true;
                } else {
                    i3 = 2;
                    if (i17 == 2) {
                        if (i18 == 4) {
                            if (i18 != 1) {
                                i3 = 2;
                                if (i18 != 2) {
                                }
                            } else {
                                i = 1;
                            }
                            iM2431 = c0792.m2431();
                            if (i17 == 4) {
                                iM2431 = (c0793.m2431() - c07711.f2889) - c07710.f2889;
                                i17 = i;
                            }
                            iM2428 = c0792.m2428();
                            if (i18 == 4) {
                                iM2429 = (c0793.m2428() - c0779.f2889) - c0778.f2889;
                                i2 = i;
                            } else {
                                iM2429 = iM2428;
                                i2 = i18;
                            }
                            m2708(i17, iM2431, i2, iM2429, c0792);
                            c0792.f3083.f11539.mo2712(c0792.m2431());
                            c0792.f3084.f11539.mo2712(c0792.m2428());
                            c0792.f3080 = true;
                        }
                        i = 1;
                        iM2431 = c0792.m2431();
                        if (i17 == 4) {
                            iM2431 = (c0793.m2431() - c07711.f2889) - c07710.f2889;
                            i17 = i;
                        }
                        iM2428 = c0792.m2428();
                        if (i18 == 4) {
                            iM2429 = (c0793.m2428() - c0779.f2889) - c0778.f2889;
                            i2 = i;
                        } else {
                            iM2429 = iM2428;
                            i2 = i18;
                        }
                        m2708(i17, iM2431, i2, iM2429, c0792);
                        c0792.f3083.f11539.mo2712(c0792.m2431());
                        c0792.f3084.f11539.mo2712(c0792.m2428());
                        c0792.f3080 = true;
                    }
                    if (i17 != 3) {
                        if (i18 == i3) {
                        }
                        if (i19 == 3) {
                            if (i18 == i3) {
                                m2708(i3, 0, i3, 0, c0792);
                            }
                            int iM24211 = c0792.m2428();
                            m2708(1, (int) ((iM24211 * c0792.f3122) + 0.5f), 1, iM24211, c0792);
                            c0792.f3083.f11539.mo2712(c0792.m2431());
                            c0792.f3084.f11539.mo2712(c0792.m2428());
                            c0792.f3080 = true;
                        } else {
                            i15 = i3;
                            if (i19 == 1) {
                                m2708(i15, 0, i18, 0, c0792);
                                c0792.f3083.f11539.f3801 = c0792.m2431();
                            } else {
                                i3 = i15;
                                if (i19 == 2) {
                                    i16 = iArr[0];
                                    if (i16 != 1) {
                                    }
                                    m2708(1, (int) ((f2 * c0793.m2431()) + 0.5f), i18, c0792.m2428(), c0792);
                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                    c0792.f3080 = true;
                                } else {
                                    i5 = 1;
                                    i4 = i18;
                                    if (c0778Arr[0].f2888 != null) {
                                    }
                                    m2708(i3, 0, i4, 0, c0792);
                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                    c0792.f3080 = true;
                                }
                            }
                        }
                    } else {
                        i4 = i18;
                        i5 = 1;
                    }
                    i6 = 3;
                    if (i4 != i6) {
                        if (i17 == i3) {
                        }
                        if (i20 == i6) {
                            if (i17 == i3) {
                                m2708(i3, 0, i3, 0, c0792);
                            }
                            int iM2434 = c0792.m2431();
                            f = c0792.f3122;
                            if (c0792.f3123 == -1) {
                                f = 1.0f / f;
                            }
                            m2708(i5, iM2434, i5, (int) ((iM2434 * f) + 0.5f), c0792);
                            c0792.f3083.f11539.mo2712(c0792.m2431());
                            c0792.f3084.f11539.mo2712(c0792.m2428());
                            c0792.f3080 = true;
                        } else {
                            i7 = i4;
                            i5 = i5;
                            i13 = i3;
                            if (i20 == 1) {
                                m2708(i17, 0, i13, 0, c0792);
                                c0792.f3084.f11539.f3801 = c0792.m2428();
                            } else {
                                i10 = i17;
                                if (i20 == 2) {
                                    i14 = iArr[1];
                                    if (i14 != i5) {
                                    }
                                    m2708(i10, c0792.m2431(), i5, (int) ((f3 * c0793.m2428()) + 0.5f), c0792);
                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                    c0792.f3080 = true;
                                } else {
                                    if (c0778Arr[2].f2888 != null) {
                                    }
                                    m2708(i13, 0, i7, 0, c0792);
                                    c0792.f3083.f11539.mo2712(c0792.m2431());
                                    c0792.f3084.f11539.mo2712(c0792.m2428());
                                    c0792.f3080 = true;
                                }
                            }
                        }
                    } else {
                        i7 = i4;
                        i8 = i3;
                        i9 = 1;
                        i10 = i17;
                    }
                    i11 = 3;
                    if (i10 != i11) {
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m2705() {
        C0793 c0793 = this.f3700;
        ArrayList arrayList = this.f3707;
        ArrayList<AbstractC3700> arrayList2 = this.f3704;
        arrayList2.clear();
        C0793 c0794 = this.f3703;
        c0794.f3083.mo2103();
        c0794.f3084.mo2103();
        arrayList2.add(c0794.f3083);
        arrayList2.add(c0794.f3084);
        HashSet hashSet = null;
        for (C0792 c0792 : c0794.f3142) {
            if (c0792 instanceof C1518) {
                C1519 c1519 = new C1519(c0792);
                c0792.f3083.mo2103();
                c0792.f3084.mo2103();
                c1519.f11540 = ((C1518) c0792).f5352;
                arrayList2.add(c1519);
            } else {
                if (c0792.m2437()) {
                    if (c0792.f3081 == null) {
                        c0792.f3081 = new C0563(c0792, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0792.f3081);
                } else {
                    arrayList2.add(c0792.f3083);
                }
                if (c0792.m2438()) {
                    if (c0792.f3082 == null) {
                        c0792.f3082 = new C0563(c0792, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0792.f3082);
                } else {
                    arrayList2.add(c0792.f3084);
                }
                if (c0792 instanceof AbstractC1544) {
                    arrayList2.add(new C1543(c0792));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC3700) it.next()).mo2103();
        }
        for (AbstractC3700 abstractC3700 : arrayList2) {
            if (abstractC3700.f11536 != c0794) {
                abstractC3700.mo2101();
            }
        }
        arrayList.clear();
        m2707(c0793.f3083, 0, arrayList);
        m2707(c0793.f3084, 1, arrayList);
        this.f3701 = false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int m2706(C0793 c0793, int i) {
        ArrayList arrayList;
        int i2;
        long jMo2104;
        float f;
        long j;
        ArrayList arrayList2 = this.f3707;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            AbstractC3700 abstractC3700 = ((C2669) arrayList2.get(i3)).f8651;
            if (!(abstractC3700 instanceof C0563) ? !(i != 0 ? (abstractC3700 instanceof C3607) : (abstractC3700 instanceof C1575)) : ((C0563) abstractC3700).f11540 != i) {
                C1017 c1017 = (i == 0 ? c0793.f3083 : c0793.f3084).f11542;
                C1017 c1018 = (i == 0 ? c0793.f3083 : c0793.f3084).f11543;
                C1017 c1019 = abstractC3700.f11542;
                C1017 c10110 = abstractC3700.f11543;
                boolean zContains = c1019.f3719.contains(c1017);
                boolean zContains2 = c10110.f3719.contains(c1018);
                long jMo2105 = abstractC3700.mo2104();
                if (zContains && zContains2) {
                    long jM4664 = C2669.m4664(c1019, j2);
                    long jM4663 = C2669.m4663(c10110, j2);
                    long j3 = jM4664 - jMo2105;
                    int i4 = c10110.f3713;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = c1019.f3713;
                    long j5 = ((-jM4663) - jMo2105) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C0792 c0792 = abstractC3700.f11536;
                    if (i == 0) {
                        f = c0792.f3129;
                    } else if (i == 1) {
                        f = c0792.f3130;
                    } else {
                        c0792.getClass();
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jMo2104 = (((long) c1019.f3713) + ((((long) ((f2 * f) + 0.5f)) + jMo2105) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c10110.f3713);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        jMo2104 = Math.max(C2669.m4664(c1019, c1019.f3713), ((long) c1019.f3713) + jMo2105);
                    } else if (zContains2) {
                        jMo2104 = Math.max(-C2669.m4663(c10110, c10110.f3713), ((long) (-c10110.f3713)) + jMo2105);
                    } else {
                        jMo2104 = (abstractC3700.mo2104() + ((long) c1019.f3713)) - ((long) c10110.f3713);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMo2104 = j2;
            }
            jMax = Math.max(jMax, jMo2104);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j2 = 0;
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final void m2707(AbstractC3700 abstractC3700, int i, ArrayList arrayList) {
        C1017 c1017 = abstractC3700.f11542;
        C1017 c1018 = abstractC3700.f11543;
        for (InterfaceC1015 interfaceC1015 : c1017.f3718) {
            if (interfaceC1015 instanceof C1017) {
                m2703((C1017) interfaceC1015, i, arrayList, null);
            } else if (interfaceC1015 instanceof AbstractC3700) {
                m2703(((AbstractC3700) interfaceC1015).f11542, i, arrayList, null);
            }
        }
        for (InterfaceC1015 interfaceC1016 : c1018.f3718) {
            if (interfaceC1016 instanceof C1017) {
                m2703((C1017) interfaceC1016, i, arrayList, null);
            } else if (interfaceC1016 instanceof AbstractC3700) {
                m2703(((AbstractC3700) interfaceC1016).f11543, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1015 interfaceC1017 : ((C3607) abstractC3700).f11297.f3718) {
                if (interfaceC1017 instanceof C1017) {
                    m2703((C1017) interfaceC1017, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final void m2708(int i, int i2, int i3, int i4, C0792 c0792) {
        C0382 c0382 = this.f3706;
        c0382.f1882 = i;
        c0382.f1883 = i3;
        c0382.f1884 = i2;
        c0382.f1885 = i4;
        this.f3705.m2408(c0792, c0382);
        c0792.m2449(c0382.f1886);
        c0792.m2446(c0382.f1887);
        c0792.f3104 = c0382.f1889;
        c0792.m2443(c0382.f1888);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m2709() {
        C0375 c0375;
        for (C0792 c0792 : this.f3700.f3142) {
            if (!c0792.f3080) {
                int[] iArr = c0792.f3141;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0792.f3091;
                int i4 = c0792.f3092;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C1045 c1045 = c0792.f3083.f11539;
                boolean z3 = c1045.f3717;
                C1045 c1046 = c0792.f3084.f11539;
                boolean z4 = c1046.f3717;
                boolean z5 = z2;
                if (z3 && z4) {
                    m2708(1, c1045.f3714, 1, c1046.f3714, c0792);
                    c0792.f3080 = true;
                } else if (z3 && z) {
                    m2708(1, c1045.f3714, 2, c1046.f3714, c0792);
                    if (i2 == 3) {
                        c0792.f3084.f11539.f3801 = c0792.m2428();
                    } else {
                        c0792.f3084.f11539.mo2712(c0792.m2428());
                        c0792.f3080 = true;
                    }
                } else if (z4 && z5) {
                    m2708(2, c1045.f3714, 1, c1046.f3714, c0792);
                    if (i == 3) {
                        c0792.f3083.f11539.f3801 = c0792.m2431();
                    } else {
                        c0792.f3083.f11539.mo2712(c0792.m2431());
                        c0792.f3080 = true;
                    }
                }
                if (c0792.f3080 && (c0375 = c0792.f3084.f11298) != null) {
                    c0375.mo2712(c0792.f3126);
                }
            }
        }
    }
}
