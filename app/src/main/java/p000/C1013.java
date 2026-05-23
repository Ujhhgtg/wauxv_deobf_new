package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1013 {

    public C0794 f3693;

    public boolean f3694;

    public boolean f3695;

    public C0794 f3696;

    public ArrayList f3697;

    public C0784 f3698;

    public C0407 f3699;

    public ArrayList f3700;

    public final void m2579(C1014 c1014, int i, ArrayList arrayList, C2608 c2608) {
        AbstractC3640 abstractC3640 = c1014.f3704;
        C2608 c2609 = abstractC3640.f11388;
        C1014 c1015 = abstractC3640.f11394;
        C1014 c1016 = abstractC3640.f11393;
        if (c2609 == null) {
            C0794 c0794 = this.f3693;
            if (abstractC3640 == c0794.f3076 || abstractC3640 == c0794.f3077) {
                return;
            }
            if (c2608 == null) {
                c2608 = new C2608();
                c2608.f8486 = null;
                c2608.f8487 = new ArrayList();
                c2608.f8486 = abstractC3640;
                arrayList.add(c2608);
            }
            abstractC3640.f11388 = c2608;
            c2608.f8487.add(abstractC3640);
            for (InterfaceC1012 interfaceC1012 : c1016.f3711) {
                if (interfaceC1012 instanceof C1014) {
                    m2579((C1014) interfaceC1012, i, arrayList, c2608);
                }
            }
            for (InterfaceC1012 interfaceC1013 : c1015.f3711) {
                if (interfaceC1013 instanceof C1014) {
                    m2579((C1014) interfaceC1013, i, arrayList, c2608);
                }
            }
            if (i == 1 && (abstractC3640 instanceof C3549)) {
                for (InterfaceC1012 interfaceC1014 : ((C3549) abstractC3640).f11148.f3711) {
                    if (interfaceC1014 instanceof C1014) {
                        m2579((C1014) interfaceC1014, 1, arrayList, c2608);
                    }
                }
            }
            Iterator it = c1016.f3712.iterator();
            while (it.hasNext()) {
                m2579((C1014) it.next(), i, arrayList, c2608);
            }
            Iterator it2 = c1015.f3712.iterator();
            while (it2.hasNext()) {
                m2579((C1014) it2.next(), i, arrayList, c2608);
            }
            if (i == 1 && (abstractC3640 instanceof C3549)) {
                Iterator it3 = ((C3549) abstractC3640).f11148.f3712.iterator();
                while (it3.hasNext()) {
                    m2579((C1014) it3.next(), 1, arrayList, c2608);
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
    public final void m2580(C0794 c0794) {
        int i;
        int iM2316;
        int iM2313;
        int iM2314;
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
        ArrayList<C0793> arrayList = c0794.f3135;
        int[] iArr = c0794.f3134;
        for (C0793 c0793 : arrayList) {
            int[] iArr2 = c0793.f3134;
            C0779[] c0779Arr = c0793.f3109;
            C0779 c0779 = c0793.f3104;
            C0779 c07710 = c0793.f3102;
            C0779 c07711 = c0793.f3103;
            C0779 c07712 = c0793.f3101;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            if (c0793.f3125 == 8) {
                c0793.f3073 = true;
            } else {
                float f2 = c0793.f3089;
                if (f2 < 1.0f && i17 == 3) {
                    c0793.f3084 = 2;
                }
                float f3 = c0793.f3092;
                if (f3 < 1.0f && i18 == 3) {
                    c0793.f3085 = 2;
                }
                if (c0793.f3115 > 0.0f) {
                    if (i17 == 3 && (i18 == 2 || i18 == 1)) {
                        c0793.f3084 = 3;
                    } else if (i18 == 3 && (i17 == 2 || i17 == 1)) {
                        c0793.f3085 = 3;
                    } else if (i17 == 3 && i18 == 3) {
                        if (c0793.f3084 == 0) {
                            c0793.f3084 = 3;
                        }
                        if (c0793.f3085 == 0) {
                            c0793.f3085 = 3;
                        }
                    }
                }
                if (i17 == 3 && c0793.f3084 == 1 && (c07712.f2881 == null || c07711.f2881 == null)) {
                    i17 = 2;
                }
                if (i18 == 3 && c0793.f3085 == 1 && (c07710.f2881 == null || c0779.f2881 == null)) {
                    i18 = 2;
                }
                C1564 c1564 = c0793.f3076;
                c1564.f11389 = i17;
                int i19 = c0793.f3084;
                c1564.f11386 = i19;
                C3549 c3549 = c0793.f3077;
                c3549.f11389 = i18;
                int i20 = c0793.f3085;
                c3549.f11386 = i20;
                if (i17 == 4 || i17 == 1) {
                    if (i18 == 4) {
                        if (true) {
                            i3 = 2;
                            if (true) {
                                if (true) {
                                    i4 = 4;
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
                                                m2584(i8, 0, i8, 0, c0793);
                                                c0793.f3076.f11390.f3794 = c0793.m2316();
                                                c0793.f3077.f11390.f3794 = c0793.m2313();
                                            } else if (i20 == 2 && i19 == 2 && ((i12 = iArr[0]) == i5 || i12 == i5)) {
                                                int i21 = iArr[i9];
                                                if (i21 == i5 || i21 == i5) {
                                                    m2584(i5, (int) ((f2 * c0794.m2316()) + 0.5f), i5, (int) ((f3 * c0794.m2313()) + 0.5f), c0793);
                                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                                    c0793.f3073 = true;
                                                }
                                            }
                                        }
                                    } else if (i20 == i6) {
                                        if (i17 == i3) {
                                            m2584(i3, 0, i3, 0, c0793);
                                        }
                                        int iM2317 = c0793.m2316();
                                        f = c0793.f3115;
                                        if (c0793.f3116 == -1) {
                                            f = 1.0f / f;
                                        }
                                        m2584(i5, iM2317, i5, (int) ((iM2317 * f) + 0.5f), c0793);
                                        c0793.f3076.f11390.mo2588(c0793.m2316());
                                        c0793.f3077.f11390.mo2588(c0793.m2313());
                                        c0793.f3073 = true;
                                    } else {
                                        i7 = i4;
                                        i5 = i5;
                                        i13 = i3;
                                        if (i20 == 1) {
                                            m2584(i17, 0, i13, 0, c0793);
                                            c0793.f3077.f11390.f3794 = c0793.m2313();
                                        } else {
                                            i10 = i17;
                                            if (i20 == 2) {
                                                i14 = iArr[1];
                                                if (i14 != i5 || i14 == 4) {
                                                    m2584(i10, c0793.m2316(), i5, (int) ((f3 * c0794.m2313()) + 0.5f), c0793);
                                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                                    c0793.f3073 = true;
                                                } else {
                                                    i8 = i13;
                                                    i9 = 1;
                                                }
                                            } else if (c0779Arr[2].f2881 != null || c0779Arr[3].f2881 == null) {
                                                m2584(i13, 0, i7, 0, c0793);
                                                c0793.f3076.f11390.mo2588(c0793.m2316());
                                                c0793.f3077.f11390.mo2588(c0793.m2313());
                                                c0793.f3073 = true;
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
                                        m2584(i3, 0, i3, 0, c0793);
                                    }
                                    int iM2315 = c0793.m2313();
                                    m2584(1, (int) ((iM2315 * c0793.f3115) + 0.5f), 1, iM2315, c0793);
                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                    c0793.f3073 = true;
                                } else {
                                    i15 = i3;
                                    if (i19 == 1) {
                                        m2584(i15, 0, i18, 0, c0793);
                                        c0793.f3076.f11390.f3794 = c0793.m2316();
                                    } else {
                                        i3 = i15;
                                        if (i19 == 2) {
                                            i16 = iArr[0];
                                            if (i16 != 1 || i16 == 4) {
                                                m2584(1, (int) ((f2 * c0794.m2316()) + 0.5f), i18, c0793.m2313(), c0793);
                                                c0793.f3076.f11390.mo2588(c0793.m2316());
                                                c0793.f3077.f11390.mo2588(c0793.m2313());
                                                c0793.f3073 = true;
                                            } else {
                                                i5 = 1;
                                                i4 = i18;
                                            }
                                        } else {
                                            i5 = 1;
                                            i4 = i18;
                                            if (c0779Arr[0].f2881 != null || c0779Arr[1].f2881 == null) {
                                                m2584(i3, 0, i4, 0, c0793);
                                                c0793.f3076.f11390.mo2588(c0793.m2316());
                                                c0793.f3077.f11390.mo2588(c0793.m2313());
                                                c0793.f3073 = true;
                                            }
                                        }
                                    }
                                }
                                i6 = 3;
                                if (true) {
                                    if (false) {
                                    }
                                    if (i20 == 3) {
                                        if (false) {
                                            m2584(i3, 0, i3, 0, c0793);
                                        }
                                        int iM2318 = c0793.m2316();
                                        f = c0793.f3115;
                                        if (c0793.f3116 == -1) {
                                            f = 1.0f / f;
                                        }
                                        m2584(1, iM2318, 1, (int) ((iM2318 * f) + 0.5f), c0793);
                                        c0793.f3076.f11390.mo2588(c0793.m2316());
                                        c0793.f3077.f11390.mo2588(c0793.m2313());
                                        c0793.f3073 = true;
                                    } else {
                                        i7 = 4;
                                        i5 = 1;
                                        i13 = 2;
                                        if (i20 == 1) {
                                            m2584(i17, 0, 2, 0, c0793);
                                            c0793.f3077.f11390.f3794 = c0793.m2313();
                                        } else {
                                            i10 = i17;
                                            if (i20 == 2) {
                                                i14 = iArr[1];
                                                if (i14 != 1) {
                                                }
                                                m2584(i10, c0793.m2316(), 1, (int) ((f3 * c0794.m2313()) + 0.5f), c0793);
                                                c0793.f3076.f11390.mo2588(c0793.m2316());
                                                c0793.f3077.f11390.mo2588(c0793.m2313());
                                                c0793.f3073 = true;
                                            } else {
                                                if (c0779Arr[2].f2881 != null) {
                                                }
                                                m2584(2, 0, 4, 0, c0793);
                                                c0793.f3076.f11390.mo2588(c0793.m2316());
                                                c0793.f3077.f11390.mo2588(c0793.m2313());
                                                c0793.f3073 = true;
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
                                if (i10 != 3) {
                                }
                            }
                        } else {
                            i = 1;
                        }
                        iM2316 = c0793.m2316();
                        if (i17 == 4) {
                            iM2316 = (c0794.m2316() - c07712.f2882) - c07711.f2882;
                            i17 = i;
                        }
                        iM2313 = c0793.m2313();
                        if (true) {
                            iM2314 = (c0794.m2313() - c07710.f2882) - c0779.f2882;
                            i2 = i;
                        } else {
                            iM2314 = iM2313;
                            i2 = i18;
                        }
                        m2584(i17, iM2316, i2, iM2314, c0793);
                        c0793.f3076.f11390.mo2588(c0793.m2316());
                        c0793.f3077.f11390.mo2588(c0793.m2313());
                        c0793.f3073 = true;
                    }
                    i = 1;
                    iM2316 = c0793.m2316();
                    if (i17 == 4) {
                        iM2316 = (c0794.m2316() - c07712.f2882) - c07711.f2882;
                        i17 = 1;
                    }
                    iM2313 = c0793.m2313();
                    if (i18 == 4) {
                        iM2314 = (c0794.m2313() - c07710.f2882) - c0779.f2882;
                        i2 = 1;
                    } else {
                        iM2314 = iM2313;
                        i2 = i18;
                    }
                    m2584(i17, iM2316, i2, iM2314, c0793);
                    c0793.f3076.f11390.mo2588(c0793.m2316());
                    c0793.f3077.f11390.mo2588(c0793.m2313());
                    c0793.f3073 = true;
                } else {
                    i3 = 2;
                    if (i17 == 2) {
                        if (i18 == 4) {
                            if (true) {
                                i3 = 2;
                                if (true) {
                                }
                            } else {
                                i = 1;
                            }
                            iM2316 = c0793.m2316();
                            if (false) {
                                iM2316 = (c0794.m2316() - c07712.f2882) - c07711.f2882;
                                i17 = i;
                            }
                            iM2313 = c0793.m2313();
                            if (true) {
                                iM2314 = (c0794.m2313() - c07710.f2882) - c0779.f2882;
                                i2 = i;
                            } else {
                                iM2314 = iM2313;
                                i2 = i18;
                            }
                            m2584(2, iM2316, i2, iM2314, c0793);
                            c0793.f3076.f11390.mo2588(c0793.m2316());
                            c0793.f3077.f11390.mo2588(c0793.m2313());
                            c0793.f3073 = true;
                        }
                        i = 1;
                        iM2316 = c0793.m2316();
                        if (false) {
                            iM2316 = (c0794.m2316() - c07712.f2882) - c07711.f2882;
                            i17 = i;
                        }
                        iM2313 = c0793.m2313();
                        if (i18 == 4) {
                            iM2314 = (c0794.m2313() - c07710.f2882) - c0779.f2882;
                            i2 = 1;
                        } else {
                            iM2314 = iM2313;
                            i2 = i18;
                        }
                        m2584(2, iM2316, i2, iM2314, c0793);
                        c0793.f3076.f11390.mo2588(c0793.m2316());
                        c0793.f3077.f11390.mo2588(c0793.m2313());
                        c0793.f3073 = true;
                    }
                    if (i17 != 3) {
                        if (i18 == 2) {
                        }
                        if (i19 == 3) {
                            if (i18 == 2) {
                                m2584(2, 0, 2, 0, c0793);
                            }
                            int iM2319 = c0793.m2313();
                            m2584(1, (int) ((iM2319 * c0793.f3115) + 0.5f), 1, iM2319, c0793);
                            c0793.f3076.f11390.mo2588(c0793.m2316());
                            c0793.f3077.f11390.mo2588(c0793.m2313());
                            c0793.f3073 = true;
                        } else {
                            i15 = 2;
                            if (i19 == 1) {
                                m2584(2, 0, i18, 0, c0793);
                                c0793.f3076.f11390.f3794 = c0793.m2316();
                            } else {
                                i3 = 2;
                                if (i19 == 2) {
                                    i16 = iArr[0];
                                    if (i16 != 1) {
                                    }
                                    m2584(1, (int) ((f2 * c0794.m2316()) + 0.5f), i18, c0793.m2313(), c0793);
                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                    c0793.f3073 = true;
                                } else {
                                    i5 = 1;
                                    i4 = i18;
                                    if (c0779Arr[0].f2881 != null) {
                                    }
                                    m2584(2, 0, i4, 0, c0793);
                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                    c0793.f3073 = true;
                                }
                            }
                        }
                    } else {
                        i4 = i18;
                        i5 = 1;
                    }
                    i6 = 3;
                    if (i4 != 3) {
                        if (i17 == 2) {
                        }
                        if (i20 == 3) {
                            if (i17 == 2) {
                                m2584(2, 0, 2, 0, c0793);
                            }
                            int iM23110 = c0793.m2316();
                            f = c0793.f3115;
                            if (c0793.f3116 == -1) {
                                f = 1.0f / f;
                            }
                            m2584(i5, iM23110, i5, (int) ((iM23110 * f) + 0.5f), c0793);
                            c0793.f3076.f11390.mo2588(c0793.m2316());
                            c0793.f3077.f11390.mo2588(c0793.m2313());
                            c0793.f3073 = true;
                        } else {
                            i7 = i4;
                            i5 = i5;
                            i13 = 2;
                            if (i20 == 1) {
                                m2584(i17, 0, 2, 0, c0793);
                                c0793.f3077.f11390.f3794 = c0793.m2313();
                            } else {
                                i10 = i17;
                                if (i20 == 2) {
                                    i14 = iArr[1];
                                    if (i14 != i5) {
                                    }
                                    m2584(i10, c0793.m2316(), i5, (int) ((f3 * c0794.m2313()) + 0.5f), c0793);
                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                    c0793.f3073 = true;
                                } else {
                                    if (c0779Arr[2].f2881 != null) {
                                    }
                                    m2584(2, 0, i7, 0, c0793);
                                    c0793.f3076.f11390.mo2588(c0793.m2316());
                                    c0793.f3077.f11390.mo2588(c0793.m2313());
                                    c0793.f3073 = true;
                                }
                            }
                        }
                    } else {
                        i7 = 3;
                        i8 = 2;
                        i9 = 1;
                        i10 = i17;
                    }
                    i11 = 3;
                    if (i10 != 3) {
                    }
                }
            }
        }
    }

    public final void m2581() {
        C0794 c0794 = this.f3693;
        ArrayList arrayList = this.f3700;
        ArrayList<AbstractC3640> arrayList2 = this.f3697;
        arrayList2.clear();
        C0794 c0795 = this.f3696;
        c0795.f3076.mo2006();
        c0795.f3077.mo2006();
        arrayList2.add(c0795.f3076);
        arrayList2.add(c0795.f3077);
        HashSet hashSet = null;
        for (C0793 c0793 : c0795.f3135) {
            if (c0793 instanceof C1506) {
                C1507 c1507 = new C1507(c0793);
                c0793.f3076.mo2006();
                c0793.f3077.mo2006();
                c1507.f11391 = ((C1506) c0793).f5321;
                arrayList2.add(c1507);
            } else {
                if (c0793.m2322()) {
                    if (c0793.f3074 == null) {
                        c0793.f3074 = new C0582(c0793, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0793.f3074);
                } else {
                    arrayList2.add(c0793.f3076);
                }
                if (c0793.m2323()) {
                    if (c0793.f3075 == null) {
                        c0793.f3075 = new C0582(c0793, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(c0793.f3075);
                } else {
                    arrayList2.add(c0793.f3077);
                }
                if (c0793 instanceof AbstractC1532) {
                    arrayList2.add(new C1531(c0793));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC3640) it.next()).mo2006();
        }
        for (AbstractC3640 abstractC3640 : arrayList2) {
            if (abstractC3640.f11387 != c0795) {
                abstractC3640.mo2004();
            }
        }
        arrayList.clear();
        m2583(c0794.f3076, 0, arrayList);
        m2583(c0794.f3077, 1, arrayList);
        this.f3694 = false;
    }

    public final int m2582(C0794 c0794, int i) {
        ArrayList arrayList;
        int i2;
        long jMo2007;
        float f;
        long j;
        ArrayList arrayList2 = this.f3700;
        int size = arrayList2.size();
        long j2 = 0;
        int i3 = 0;
        long jMax = 0;
        while (i3 < size) {
            AbstractC3640 abstractC3640 = ((C2608) arrayList2.get(i3)).f8486;
            if (!(abstractC3640 instanceof C0582) ? !(i != 0 ? (abstractC3640 instanceof C3549) : (abstractC3640 instanceof C1564)) : ((C0582) abstractC3640).f11391 != i) {
                C1014 c1014 = (i == 0 ? c0794.f3076 : c0794.f3077).f11393;
                C1014 c1015 = (i == 0 ? c0794.f3076 : c0794.f3077).f11394;
                C1014 c1016 = abstractC3640.f11393;
                C1014 c1017 = abstractC3640.f11394;
                boolean zContains = c1016.f3712.contains(c1014);
                boolean zContains2 = c1017.f3712.contains(c1015);
                long jMo2008 = abstractC3640.mo2007();
                if (zContains && zContains2) {
                    long jM4630 = C2608.m4630(c1016, 0L);
                    long jM4629 = C2608.m4629(c1017, 0L);
                    long j3 = jM4630 - jMo2008;
                    int i4 = c1017.f3706;
                    arrayList = arrayList2;
                    i2 = size;
                    if (j3 >= (-i4)) {
                        j3 += (long) i4;
                    }
                    long j4 = c1016.f3706;
                    long j5 = ((-jM4629) - jMo2008) - j4;
                    if (j5 >= j4) {
                        j5 -= j4;
                    }
                    C0793 c0793 = abstractC3640.f11387;
                    if (i == 0) {
                        f = c0793.f3122;
                    } else if (i == 1) {
                        f = c0793.f3123;
                    } else {
                        
                        f = -1.0f;
                    }
                    if (f > 0.0f) {
                        j = (long) ((j3 / (1.0f - f)) + (j5 / f));
                    } else {
                        j = 0;
                    }
                    float f2 = j;
                    jMo2007 = (((long) c1016.f3706) + ((((long) ((f2 * f) + 0.5f)) + jMo2008) + ((long) (((1.0f - f) * f2) + 0.5f)))) - ((long) c1017.f3706);
                } else {
                    arrayList = arrayList2;
                    i2 = size;
                    if (zContains) {
                        jMo2007 = Math.max(C2608.m4630(c1016, c1016.f3706), ((long) c1016.f3706) + jMo2008);
                    } else if (zContains2) {
                        jMo2007 = Math.max(-C2608.m4629(c1017, c1017.f3706), ((long) (-c1017.f3706)) + jMo2008);
                    } else {
                        jMo2007 = (abstractC3640.mo2007() + ((long) c1016.f3706)) - ((long) c1017.f3706);
                    }
                }
            } else {
                arrayList = arrayList2;
                i2 = size;
                jMo2007 = 0L;
            }
            jMax = Math.max(jMax, jMo2007);
            i3++;
            arrayList2 = arrayList;
            size = i2;
            j2 = 0;
        }
        return (int) jMax;
    }

    public final void m2583(AbstractC3640 abstractC3640, int i, ArrayList arrayList) {
        C1014 c1014 = abstractC3640.f11393;
        C1014 c1015 = abstractC3640.f11394;
        for (InterfaceC1012 interfaceC1012 : c1014.f3711) {
            if (interfaceC1012 instanceof C1014) {
                m2579((C1014) interfaceC1012, i, arrayList, null);
            } else if (interfaceC1012 instanceof AbstractC3640) {
                m2579(((AbstractC3640) interfaceC1012).f11393, i, arrayList, null);
            }
        }
        for (InterfaceC1012 interfaceC1013 : c1015.f3711) {
            if (interfaceC1013 instanceof C1014) {
                m2579((C1014) interfaceC1013, i, arrayList, null);
            } else if (interfaceC1013 instanceof AbstractC3640) {
                m2579(((AbstractC3640) interfaceC1013).f11394, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (InterfaceC1012 interfaceC1014 : ((C3549) abstractC3640).f11148.f3711) {
                if (interfaceC1014 instanceof C1014) {
                    m2579((C1014) interfaceC1014, 1, arrayList, null);
                }
            }
        }
    }

    public final void m2584(int i, int i2, int i3, int i4, C0793 c0793) {
        C0407 c0407 = this.f3699;
        c0407.f1910 = i;
        c0407.f1911 = i3;
        c0407.f1912 = i2;
        c0407.f1913 = i4;
        this.f3698.m2293(c0793, c0407);
        c0793.m2334(c0407.f1914);
        c0793.m2331(c0407.f1915);
        c0793.f3097 = c0407.f1917;
        c0793.m2328(c0407.f1916);
    }

    public final void m2585() {
        C0400 c0400;
        for (C0793 c0793 : this.f3693.f3135) {
            if (!c0793.f3073) {
                int[] iArr = c0793.f3134;
                boolean z = false;
                int i = iArr[0];
                int i2 = iArr[1];
                int i3 = c0793.f3084;
                int i4 = c0793.f3085;
                boolean z2 = i == 2 || (i == 3 && i3 == 1);
                if (i2 == 2 || (i2 == 3 && i4 == 1)) {
                    z = true;
                }
                C1042 c1042 = c0793.f3076.f11390;
                boolean z3 = c1042.f3710;
                C1042 c1043 = c0793.f3077.f11390;
                boolean z4 = c1043.f3710;
                boolean z5 = z2;
                if (z3 && z4) {
                    m2584(1, c1042.f3707, 1, c1043.f3707, c0793);
                    c0793.f3073 = true;
                } else if (z3 && z) {
                    m2584(1, c1042.f3707, 2, c1043.f3707, c0793);
                    if (i2 == 3) {
                        c0793.f3077.f11390.f3794 = c0793.m2313();
                    } else {
                        c0793.f3077.f11390.mo2588(c0793.m2313());
                        c0793.f3073 = true;
                    }
                } else if (z4 && z5) {
                    m2584(2, c1042.f3707, 1, c1043.f3707, c0793);
                    if (i == 3) {
                        c0793.f3076.f11390.f3794 = c0793.m2316();
                    } else {
                        c0793.f3076.f11390.mo2588(c0793.m2316());
                        c0793.f3073 = true;
                    }
                }
                if (c0793.f3073 && (c0400 = c0793.f3077.f11149) != null) {
                    c0400.mo2588(c0793.f3119);
                }
            }
        }
    }
}
