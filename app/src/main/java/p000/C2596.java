package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2596 {

    public final C0768 f8230;

    public final C0526 f8231;

    public final int f8232;

    public final int f8233;

    public final C2597 f8234;

    public final C1676 f8235;

    public final C0243[] f8236;

    public final ArrayList f8237;

    public final ArrayList f8238;

    public final C0542[] f8239;

    public boolean f8240;

    public final C0662[] f8241;

    public boolean f8242;

    public final C2594 f8243;

    public C2596(C0768 c0768, C0442 c0442, C0580 c0580) {
        int[] iArr;
        C0536 c0536;
        C0283 c0283 = c0768.f2867;
        this.f8230 = c0768;
        C0405 c0405 = new C0405(c0768);
        C0542 c0542 = c0283.f1495;
        C0536 c0537 = c0283.f1496;
        int length = c0537.f4836.length;
        int[] iArr2 = c0405.f1904;
        AbstractC1574.m3310(iArr2, 0);
        int[] iArr3 = c0405.f1906;
        AbstractC1574.m3310(iArr3, 0);
        loop0: while (true) {
            int length2 = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c0405.f1905;
                if (i >= length2) {
                    break loop0;
                } else if (iArr2[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            try {
                c0542.getClass();
                while (true) {
                    int iM3296 = AbstractC1574.m3296(iArr2, 0);
                    if (iM3296 < 0) {
                        break;
                    }
                    AbstractC1574.m3290(iArr2, iM3296);
                    c0542.m1905(iM3296, c0405);
                    c0405.f1909 = iM3296;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    C0535 c0535 = (C0535) c0537.m3062(i2);
                    int i3 = c0535.f2235;
                    int i4 = c0535.f2236;
                    int iM3297 = AbstractC1574.m3296(iArr, i3);
                    if (iM3297 >= 0 && iM3297 < i4) {
                        AbstractC1574.m3310(iArr3, i3);
                        AbstractC1574.m3310(iArr3, i4);
                        c0405.m1598(c0535.f2237, true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C2704("flow of control falls off end of method", e);
            }
        }
        C0525[] c0525Arr = new C0525[((C0516) c0405.f1903.f2867.f1495.f2252).f2191];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iM3298 = AbstractC1574.m3296(iArr3, i6 + 1);
            if (iM3298 < 0) {
                break;
            }
            if (AbstractC1574.m3297(iArr, i6)) {
                int i7 = iM3298 - 1;
                C1660 c1660M3381 = null;
                while (true) {
                    if (i7 < i6) {
                        i7 = -1;
                        break;
                    }
                    c1660M3381 = c0405.f1907[i7];
                    if (c1660M3381 != null) {
                        break;
                    } else {
                        i7--;
                    }
                }
                if (c1660M3381 == null) {
                    c1660M3381 = C1660.m3381(iM3298);
                    c0536 = C0536.f2239;
                } else {
                    c0536 = c0405.f1908[i7];
                    if (c0536 == null) {
                        c0536 = C0536.f2239;
                    }
                }
                c0525Arr[i5] = new C0525(i6, i6, iM3298, c1660M3381, c0536);
                i5++;
            }
            i6 = iM3298;
        }
        C0526 c0526 = new C0526(i5);
        for (int i8 = 0; i8 < i5; i8++) {
            c0526.m3508(i8, c0525Arr[i8]);
        }
        this.f8231 = c0526;
        int iM3506 = c0526.m3506();
        this.f8233 = iM3506;
        int i9 = c0283.f1494;
        this.f8232 = i9;
        C2597 c2597 = new C2597(this, c0768, c0442);
        this.f8234 = c2597;
        this.f8235 = new C1676(c2597, c0768, c0580);
        C0243[] c0243Arr = new C0243[iM3506];
        this.f8236 = c0243Arr;
        this.f8241 = new C0662[iM3506];
        this.f8237 = new ArrayList((c0526.f4836.length * 2) + 10);
        this.f8238 = new ArrayList((c0526.f4836.length * 2) + 10);
        this.f8239 = new C0542[iM3506];
        this.f8240 = false;
        c0243Arr[0] = new C0243(new C2287(i9), new C1242(c0283.f1493, 0), C1660.f5608);
        C2594 c2594 = new C2594(iM3506);
        c2594.f8222 = iM3506 + this.f8230.f2867.f1496.f4836.length;
        this.f8243 = c2594;
    }

    public static C0662 m4605(C0768 c0768, C0442 c0442, C0580 c0580) {
        try {
            C2596 c2596 = new C2596(c0768, c0442, c0580);
            c2596.m4607();
            ArrayList arrayList = c2596.f8237;
            int size = arrayList.size();
            C0404 c0404 = new C0404(size);
            c0404.f1902 = -1;
            for (int i = 0; i < size; i++) {
                c0404.m3508(i, (C0402) arrayList.get(i));
                c0404.f1902 = -1;
            }
            c0404.f6944 = false;
            return new C0662(c0404, c2596.m4610(-1));
        } catch (C2704 e) {
            e.m2885("...while working on method " + c0768.f2865.mo2260().mo1214());
            throw e;
        }
    }

    public final void m4606(C0402 c0402, C1660 c1660) {
        this.f8237.add(c0402);
        c1660.m3926();
        this.f8238.add(c1660);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.String, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲁᲇᤝ, ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲈᲁᤝ] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲀᲁᲈᲇ] */
    /* JADX WARN: Type inference failed for: r8v24, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲀᲈᲇᤝ, ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᤞᲀᲁᛸ, ᛱᛲᛳᛴᛵᛶᛷᤞᲈᛸᲇᤝᲁᲀ] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void m4607() {
        int i;
        ?? r10;
        int i2;
        ?? r12;
        boolean z;
        C2526 c2526M4546;
        ?? r13;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        C2525 c2525;
        C2526 c2526;
        boolean z3;
        C0442 c0442;
        boolean z4;
        C2525 c2525M4532;
        int i3 = this.f8233;
        int[] iArrM3302 = AbstractC1574.m3302(i3);
        int i4 = 0;
        AbstractC1574.m3310(iArrM3302, 0);
        ?? r4 = this.f8230;
        C1833 c1833 = r4.f2869;
        C2788 c2788M2261 = r4.m2261(0);
        InterfaceC1971 interfaceC1971 = r4.f2865;
        C2819 c2819 = interfaceC1971.mo2257().f7756;
        int length = c2819.f4836.length;
        C0442 c0443 = new C0442(length + 1);
        int i5 = 0;
        int iM4966 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            C3448 c3448 = (C3448) c2819.m3062(i5);
            C1832 c1832M3586 = c1833.m3586(0, iM4966);
            if (c1832M3586 == null) {
                c2525M4532 = C2525.m4532(iM4966, c3448, null);
            } else {
                C0917 c0917 = c1832M3586.f6121;
                C0917 c0918 = c1832M3586.f6123;
                c2525M4532 = C2525.m4532(iM4966, c3448, (c0917 == null && c0918 == null) ? null : new C1826(c0917, c0918));
            }
            int i6 = i5;
            int i7 = iM4966;
            c0443.m3063(i6, new C2350(AbstractC2598.m4621(c3448), c2788M2261, c2525M4532, C2526.f8058, C0903.m2420(i7)));
            iM4966 = c3448.m4966() + i7;
            i5 = i6 + 1;
            i4 = 0;
        }
        C2590 c2590 = AbstractC2598.f8279;
        C2526 c2527 = C2526.f8058;
        c0443.m3063(length, new C2351(c2590, c2788M2261, (C2525) null, c2527));
        c0443.f6944 = false;
        boolean zM4613 = m4613();
        int iM4610 = zM4613 ? m4610(-4) : 0;
        C0402 c0402 = new C0402(m4610(-1), c0443, C1660.m3381(iM4610), iM4610);
        C1660 c1660 = C1660.f5608;
        m4606(c0402, c1660);
        int i8 = this.f8232;
        if (zM4613) {
            int i9 = r4.f2867.f1493 + i8;
            if (i9 < 1) {
                i9 = 1;
            }
            C2525 c2525M4533 = C2525.m4532(i9, C3448.f10882, null);
            if (m4611()) {
                c2526 = c2527;
                i = i8;
                C2923 c2923 = new C2923(AbstractC2598.f8277, c2788M2261, c2526, C2819.f9030, interfaceC1971.mo2258());
                c0442 = new C0442(1);
                c0442.m3063(0, c2923);
                c2525 = c2525M4533;
                i2 = 1;
                z2 = false;
                z3 = false;
            } else {
                i = i8;
                C0442 c0444 = new C0442(2);
                i2 = 1;
                z2 = false;
                c2525 = c2525M4533;
                c2526 = c2527;
                c0444.m3063(0, new C2350(AbstractC2598.f8272, c2788M2261, c2525M4533, c2527, C0903.f3350));
                z3 = false;
                c0444.m3063(1, new C2351(c2590, c2788M2261, (C2525) null, c2526));
                c0442 = c0444;
            }
            int iM4611 = m4610(-5);
            c0442.f6944 = false;
            m4606(new C0402(iM4610, c0442, C1660.m3381(iM4611), iM4611), c1660);
            C0442 c0445 = new C0442(m4611() ? 2 : 1);
            if (m4611()) {
                z4 = false;
                c0445.m3063(0, new C2351(AbstractC2598.m4622(c2525), c2788M2261, c2525, c2526));
            } else {
                z4 = false;
            }
            c0445.m3063(m4611() ? 1 : 0, new C2868(AbstractC2598.f8395, c2788M2261, C2526.m4546(c2525), C2819.f9030));
            c0445.f6944 = false;
            m4606(new C0402(iM4611, c0445, C1660.m3381(0), 0), c1660);
            r10 = false;
            r12 = false;
        } else {
            i3 = i3;
            i = i8;
            r10 = 0;
            i2 = 1;
            interfaceC1971 = interfaceC1971;
            r12 = 0;
        }
        C2440 c2440Mo2257 = interfaceC1971.mo2257();
        C0243[] c0243Arr = this.f8236;
        C0243 c0243 = c0243Arr[r12];
        C2819 c28110 = c2440Mo2257.f7756;
        c0243.getClass();
        int length2 = c28110.f4836.length;
        int iM4967 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            C3448 c3449 = (C3448) c28110.m3062(i10);
            ((AbstractC1834) c0243.f1404).mo3594(iM4967, c3449);
            iM4967 += c3449.m4966();
        }
        int i11 = 0;
        C0243 c0244 = c0243Arr[0];
        ((AbstractC1834) c0244.f1404).mo2894();
        ((C1242) c0244.f1405).f6944 = false;
        while (true) {
            int iM3296 = AbstractC1574.m3296(iArrM3302, 0);
            if (iM3296 < 0) {
                C2597 c2597 = this.f8234;
                C2590 c2591 = c2597.f8259;
                if (c2591 == null) {
                    r13 = 0;
                } else {
                    C2788 c2788 = c2597.f8260;
                    int iM4612 = m4610(-2);
                    if (m4613()) {
                        C0442 c0446 = new C0442(1);
                        C2590 c2592 = AbstractC2598.f8396;
                        int i12 = r4.f2867.f1493 + i;
                        if (i12 < 1) {
                            i12 = 1;
                        }
                        c0446.m3063(0, new C2868(c2592, c2788, C2526.m4546(C2525.m4532(i12, C3448.f10882, r10)), C2819.f9030));
                        c0446.f6944 = false;
                        int iM4613 = m4610(-3);
                        m4606(new C0402(iM4612, c0446, C1660.m3381(iM4613), iM4613), C1660.f5608);
                        iM4612 = iM4613;
                    }
                    C0442 c0447 = new C0442(1);
                    InterfaceC3454 interfaceC3454 = c2591.f8206;
                    if (interfaceC3454.size() == 0) {
                        c2526M4546 = C2526.f8058;
                        z = false;
                    } else {
                        z = false;
                        c2526M4546 = C2526.m4546(C2525.m4532(0, interfaceC3454.getType(0), r10));
                    }
                    c0447.m3063(0, new C2351(c2591, c2788, (C2525) r10, c2526M4546));
                    c0447.f6944 = false;
                    C1660 c1661 = C1660.f5608;
                    m4606(new C0402(iM4612, c0447, c1661, -1), c1661);
                    r13 = false;
                }
                if (this.f8240) {
                    C2788 c2788M2262 = r4.m2261(r13);
                    C3448 c34410 = C3448.f10885;
                    C2525 c2525M4534 = C2525.m4532(r13, c34410, r10);
                    ?? c0448 = new C0442(2);
                    c34410.getClass();
                    C2819 c28111 = C2819.f9030;
                    c0448.m3063(r13, new C2351(new C2590(4, c34410, c28111, r10), c2788M2262, c2525M4534, C2526.f8058));
                    C2590 c2593 = AbstractC2598.f8396;
                    int i13 = i + r4.f2867.f1493;
                    if (i13 < 1) {
                        i13 = 1;
                    }
                    c0448.m3063(1, new C2868(c2593, c2788M2262, C2526.m4546(C2525.m4532(i13, C3448.f10882, r10)), c28111));
                    c0448.f6944 = false;
                    int iM4614 = m4610(-7);
                    C0402 c0403 = new C0402(m4610(-6), c0448, C1660.m3381(iM4614), iM4614);
                    C1660 c1662 = C1660.f5608;
                    m4606(c0403, c1662);
                    C0442 c0449 = new C0442(1);
                    c0449.m3063(0, new C2868(AbstractC2598.f8394, c2788M2262, C2526.m4546(c2525M4534), c28111));
                    c0449.f6944 = false;
                    m4606(new C0402(iM4614, c0449, c1662, -1), c1662);
                }
                C0542[] c0542Arr = this.f8239;
                int length3 = c0542Arr.length;
                for (int i14 = 0; i14 < length3; i14++) {
                    C0542 c0542 = c0542Arr[i14];
                    if (c0542 != null) {
                        for (C2593 c2594 : ((HashMap) c0542.f2252).values()) {
                            C2788 c2789 = ((AbstractC1649) m4614(i14).f1898.m3062(0)).f5589;
                            C0442 c04410 = new C0442(2);
                            C3448 c34411 = c2594.f8220;
                            c34411.getClass();
                            C2590 c2595 = new C2590(4, c34411, C2819.f9030, r10);
                            C2525 c2525M4535 = C2525.m4532(i, c2594.f8220, r10);
                            C2526 c2528 = C2526.f8058;
                            c04410.m3063(0, new C2351(c2595, c2789, c2525M4535, c2528));
                            c04410.m3063(1, new C2351(AbstractC2598.f8279, c2789, (C2525) r10, c2528));
                            c04410.f6944 = false;
                            m4606(new C0402(c2594.f8221, c04410, C1660.m3381(i14), i14), (C1660) c0243Arr[i14].f1406);
                        }
                    }
                }
                if (this.f8242) {
                    C1660 c1663 = new C1660(4);
                    int i15 = i3;
                    m4608(m4614(0), new C0542(this, c1663, 25, false), new BitSet(i15));
                    int iM4609 = m4609();
                    ArrayList arrayList3 = new ArrayList(iM4609);
                    for (int i16 = 0; i16 < iM4609; i16++) {
                        arrayList3.add(r10);
                    }
                    int i17 = 0;
                    while (true) {
                        arrayList = this.f8237;
                        int size = arrayList.size();
                        arrayList2 = this.f8238;
                        if (i17 >= size) {
                            break;
                        }
                        C0402 c0404 = (C0402) arrayList.get(i17);
                        if (c0404 != null) {
                            arrayList3.set(c0404.f1897, (C1660) arrayList2.get(i17));
                        }
                        i17++;
                    }
                    int i18 = c1663.f5610;
                    for (int i19 = 0; i19 < i18; i19++) {
                        new C2595(this, new C0403(m4609()), arrayList3).m4603(m4614(c1663.m3384(i19)));
                    }
                    C1660 c1664 = new C1660(arrayList.size());
                    arrayList2.clear();
                    m4608(m4614(m4610(-1)), new C1744(c1664), new BitSet(i15));
                    c1664.m3388();
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        int iM3383 = c1664.m3383(((C0402) arrayList.get(size2)).f1897);
                        if (iM3383 < 0) {
                            iM3383 = -1;
                        }
                        if (iM3383 < 0) {
                            arrayList.remove(size2);
                        }
                    }
                    return;
                }
                return;
            }
            int i20 = i3;
            i11 = 0;
            int i21 = 1;
            AbstractC1574.m3290(iArrM3302, iM3296);
            C0526 c0526 = this.f8231;
            int iM3507 = c0526.m3507(iM3296);
            if (iM3507 < 0) {
                throw new IllegalArgumentException("no such label: ".concat(AbstractC1460.m3223(iM3296)));
            }
            try {
                m4617((C0525) c0526.m3062(iM3507), c0243Arr[iM3296], iArrM3302);
                i2 = 1;
                i3 = i20;
            } catch (C2704 e) {
                e.m2885("...while working on block ".concat(AbstractC1460.m3223(iM3296)));
                throw e;
            }
        }
    }

    public final void m4608(C0402 c0402, InterfaceC0401 interfaceC0401, BitSet bitSet) {
        int iM4615;
        interfaceC0401.mo1575(c0402);
        bitSet.set(c0402.f1897);
        C1660 c1660 = c0402.f1899;
        int i = c1660.f5610;
        for (int i2 = 0; i2 < i; i2++) {
            int iM3384 = c1660.m3384(i2);
            if (!bitSet.get(iM3384) && ((!m4612(c0402) || i2 <= 0) && (iM4615 = m4615(iM3384)) >= 0)) {
                m4608((C0402) this.f8237.get(iM4615), interfaceC0401, bitSet);
            }
        }
    }

    public final int m4609() {
        int length = this.f8233 + this.f8230.f2867.f1496.f4836.length + 7;
        Iterator it = this.f8237.iterator();
        while (it.hasNext()) {
            int i = ((C0402) it.next()).f1897;
            if (i >= length) {
                length = i + 1;
            }
        }
        return length;
    }

    public final int m4610(int i) {
        return this.f8233 + this.f8230.f2867.f1496.f4836.length + (~i);
    }

    public final boolean m4611() {
        return (this.f8230.f2865.mo2259() & 8) != 0;
    }

    public final boolean m4612(C0402 c0402) {
        C1660 c1660 = c0402.f1899;
        if (c1660.f5610 < 2) {
            return false;
        }
        int iM3384 = c1660.m3384(1);
        C0662[] c0662Arr = this.f8241;
        return iM3384 < c0662Arr.length && c0662Arr[iM3384] != null;
    }

    public final boolean m4613() {
        return (this.f8230.f2865.mo2259() & 32) != 0;
    }

    public final C0402 m4614(int i) {
        int iM4615 = m4615(i);
        if (iM4615 >= 0) {
            return (C0402) this.f8237.get(iM4615);
        }
        throw new IllegalArgumentException("no such label ".concat(AbstractC1460.m3223(i)));
    }

    public final int m4615(int i) {
        ArrayList arrayList = this.f8237;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0402) arrayList.get(i2)).f1897 == i) {
                return i2;
            }
        }
        return -1;
    }

    public final void m4616(int i, int i2, C0662 c0662, C0243 c0243, int[] iArr) {
        C1660 c1660;
        C0243 c0244;
        C1660 c1661 = (C1660) c0243.f1406;
        C1242 c1242 = (C1242) c0243.f1405;
        AbstractC1834 abstractC1834 = (AbstractC1834) c0243.f1404;
        C0243[] c0243Arr = this.f8236;
        C0243 c0245 = c0243Arr[i];
        if (c0245 == null) {
            if (c0662 != null) {
                c1661.m3385().m3382(i);
                c0243Arr[i] = new C0243(abstractC1834.mo3590(), c1242, C1660.m3381(i)).m1327(c0243, i, i2);
            } else {
                c0243Arr[i] = c0243;
            }
            AbstractC1574.m3310(iArr, i);
            return;
        }
        if (c0662 != null) {
            c0244 = c0245.m1327(c0243, c0662.f2529, i2);
        } else {
            AbstractC1834 abstractC1835 = (AbstractC1834) c0245.f1404;
            AbstractC1834 abstractC1834Mo3592 = abstractC1835.mo3592(abstractC1834);
            C1242 c1243 = (C1242) c0245.f1405;
            c1243.getClass();
            try {
                C1242 c1242M2987 = AbstractC1270.m2987(c1243, c1242);
                C1660 c1662 = (C1660) c0245.f1406;
                if (c1662.equals(c1661)) {
                    c1660 = c1662;
                } else {
                    c1660 = new C1660(4);
                    int i3 = c1662.f5610;
                    int i4 = c1661.f5610;
                    for (int i5 = 0; i5 < i3 && i5 < i4 && c1662.m3384(i5) == c1661.m3384(i5); i5++) {
                        c1660.m3382(i5);
                    }
                    c1660.f6944 = false;
                }
                boolean z = abstractC1834Mo3592 instanceof C1835;
                AbstractC1834 abstractC1836 = abstractC1834Mo3592;
                if (z) {
                    C1835 c1835 = (C1835) abstractC1834Mo3592;
                    if (c1660.f5610 == 0) {
                        abstractC1836 = c1835;
                        abstractC1836 = c1835.f6126;
                    }
                }
                c0244 = (abstractC1836 == abstractC1835 && c1242M2987 == c1243 && c1662 == c1660) ? c0245 : new C0243(abstractC1836, c1242M2987, c1660);
            } catch (C2704 e) {
                e.m2885("underlay stack:");
                c1243.m2895(e);
                e.m2885("overlay stack:");
                c1242.m2895(e);
                throw e;
            }
        }
        if (c0244 != c0245) {
            c0243Arr[i] = c0244;
            AbstractC1574.m3310(iArr, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:211:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[Catch: NullPointerException -> 0x01db, IndexOutOfBoundsException -> 0x01e3, TRY_LEAVE, TryCatch #7 {IndexOutOfBoundsException -> 0x01e3, NullPointerException -> 0x01db, blocks: (B:46:0x0186, B:48:0x01a1, B:56:0x01d5, B:57:0x01da), top: B:194:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᤞᲇᛸᲈᲁᤝ] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᤝᲇᲁᛸ] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᲇᲈᤞ] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᤝᲈᲀᲁ] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲀᲈᤞᛸ[]] */
    /* JADX WARN: Type inference failed for: r4v12, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᲇᲈᤞ] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v39 */
    public final void m4617(C0525 c0525, C0243 c0243, int[] iArr) {
        C2819 c2819;
        int[] iArr2;
        int i;
        int i2;
        C0243 c0244;
        int i3;
        int i4;
        C1660 c1660;
        C0662 c0662;
        int i5;
        ?? r22;
        ?? r1;
        ?? r23;
        C1660 c1660M3385;
        int i6;
        int iM3384;
        int i7;
        ?? c0245;
        ?? r24;
        C1660 c1660M3381;
        int i8;
        int iM3385;
        int i9;
        int i10;
        C1660 c1660M3382;
        C0525 c0526 = c0525;
        C0536 c0536 = c0526.f2216;
        int i11 = c0526.f2212;
        int length = c0536.f4836.length;
        if (length == 0) {
            c2819 = C2819.f9030;
        } else {
            C2819 c28110 = new C2819(length);
            for (int i12 = 0; i12 < length; i12++) {
                C0918 c0918 = ((C0535) c0536.m3062(i12)).f2238;
                if (c0918 == null) {
                    c0918 = C0918.f3381;
                }
                c28110.m3063(i12, c0918.f3401);
            }
            c28110.f6944 = false;
            c2819 = c28110;
        }
        C2597 c2597 = this.f8234;
        c2597.f8251 = c2819;
        ArrayList arrayList = c2597.f8250;
        arrayList.clear();
        c2597.f8252 = false;
        c2597.f8253 = false;
        c2597.f8254 = 0;
        c2597.f8255 = 0;
        c2597.f8257 = false;
        c2597.f8256 = false;
        C0662 c0663 = null;
        c2597.f8258 = null;
        C0243 c0246 = new C0243(((AbstractC1834) c0243.f1404).mo3588(), ((C1242) c0243.f1405).m2897(), (C1660) c0243.f1406);
        AbstractC1834 abstractC1834 = (AbstractC1834) c0246.f1404;
        C1242 c1242 = (C1242) c0246.f1405;
        C1660 c1661 = (C1660) c0246.f1406;
        C1676 c1676 = this.f8235;
        c1676.getClass();
        int i13 = c0526.f2214;
        C0662 c0664 = (C0662) c1676.f5660;
        c0664.f2531 = c0246;
        try {
            int i14 = c0526.f2213;
            while (i14 < i13) {
                C0662 c0665 = c0663;
                int iM1905 = ((C0542) c1676.f5661).m1905(i14, c0664);
                c0664.f2529 = i14;
                i14 += iM1905;
                c0663 = c0665;
            }
            C0662 c0666 = c0663;
            abstractC1834.mo2894();
            c1242.f6944 = false;
            int i15 = c2597.f8255;
            int size = arrayList.size();
            int length2 = c0536.f4836.length;
            C1660 c1662 = c0526.f2215;
            boolean z = c2597.f8256;
            C0662[] c0662Arr = this.f8241;
            int i16 = 1;
            if (z) {
                int iM3386 = c1662.m3384(1);
                if (c0662Arr[iM3386] == null) {
                    c0662Arr[iM3386] = new C0662(this, iM3386);
                }
                ((BitSet) c0662Arr[iM3386].f2530).set(i11);
                C0662 c0667 = c0662Arr[iM3386];
                iArr2 = iArr;
                i = size;
                i2 = length2;
                c1660 = c1662;
                c0244 = c0246;
                c0662 = c0667;
                i3 = i11;
                i4 = i15;
                i5 = 1;
            } else {
                i16 = 1;
                C2587 c2587 = c2597.f8258;
                if (c2587 != null) {
                    int i17 = c2587.f8193;
                    C0662 c0668 = c0662Arr[i17];
                    if (c0668 == null) {
                        C0662 c0669 = new C0662(this, i17);
                        ((BitSet) c0669.f2531).set(i11);
                        c0662Arr[i17] = c0669;
                    } else {
                        ((BitSet) c0668.f2531).set(i11);
                    }
                    C0662 c06610 = c0662Arr[i17];
                    c06610.getClass();
                    BitSet bitSet = (BitSet) c06610.f2530;
                    i = size;
                    c1660 = new C1660(bitSet.size());
                    int iNextSetBit = bitSet.nextSetBit(0);
                    while (iNextSetBit >= 0) {
                        c1660.m3382(((C2596) c06610.f2532).m4614(iNextSetBit).f1899.m3384(0));
                        iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                        length2 = length2;
                    }
                    i2 = length2;
                    int i18 = 0;
                    c1660.f6944 = false;
                    C0662 c06611 = c0662Arr[i17];
                    BitSet bitSet2 = (BitSet) c06611.f2530;
                    C2596 c2596 = (C2596) c06611.f2532;
                    int iNextSetBit2 = bitSet2.nextSetBit(0);
                    ?? r4 = c2596;
                    while (iNextSetBit2 >= 0) {
                        C0243 c0247 = c0246;
                        int iM3387 = r4.m4614(iNextSetBit2).f1899.m3384(0);
                        int i19 = c06611.f2529;
                        C0662 c06612 = c06611;
                        try {
                            if (abstractC1834 instanceof C1835) {
                                ArrayList arrayList2 = ((C1835) abstractC1834).f6127;
                                r24 = r4;
                                if (iNextSetBit2 < arrayList2.size()) {
                                    r22 = r24;
                                    r1 = (AbstractC1834) arrayList2.get(iNextSetBit2);
                                    r23 = r24;
                                }
                                c1660M3385 = c1661.m3385();
                                c1660M3385.m3925();
                                i6 = i15;
                                iM3384 = c1660M3385.m3384(c1660M3385.f5610 - 1);
                                i7 = i11;
                                c1660M3385.f5610--;
                                if (iM3384 == i19) {
                                    throw new RuntimeException("returning from invalid subroutine");
                                }
                                c1660M3385.f6944 = false;
                                if (r1 == 0) {
                                    c0245 = c0666;
                                } else {
                                    c0245 = new C0243((AbstractC1834) r1, c1242, c1660M3385);
                                }
                                if (c0245 != 0) {
                                    r23.m4616(iM3387, -1, null, c0245, iArr);
                                } else {
                                    AbstractC1574.m3310(iArr, iNextSetBit2);
                                }
                                iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1);
                                c06611 = c06612;
                                c0246 = c0247;
                                r4 = r23;
                                i15 = i6;
                                i11 = i7;
                                i18 = 0;
                            } else {
                                r22 = r4;
                            }
                            c1660M3385 = c1661.m3385();
                            c1660M3385.m3925();
                            i6 = i15;
                            iM3384 = c1660M3385.m3384(c1660M3385.f5610 - 1);
                            i7 = i11;
                            c1660M3385.f5610--;
                            if (iM3384 == i19) {
                                throw new RuntimeException("returning from invalid subroutine");
                            }
                            c1660M3385.f6944 = false;
                            if (r1 == 0) {
                                c0245 = c0666;
                            } else {
                                c0245 = new C0243((AbstractC1834) r1, c1242, c1660M3385);
                            }
                            if (c0245 != 0) {
                                r23.m4616(iM3387, -1, null, c0245, iArr);
                            } else {
                                AbstractC1574.m3310(iArr, iNextSetBit2);
                            }
                            iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1);
                            c06611 = c06612;
                            c0246 = c0247;
                            r4 = r23;
                            i15 = i6;
                            i11 = i7;
                            i18 = 0;
                        } catch (IndexOutOfBoundsException unused) {
                            throw new RuntimeException("returning from invalid subroutine");
                        } catch (NullPointerException unused2) {
                            throw new NullPointerException("can't return from non-subroutine");
                        }
                        r22 = r24;
                        r1 = c0666;
                        r23 = r22;
                    }
                    iArr2 = iArr;
                    c0244 = c0246;
                    i3 = i11;
                    i4 = i15;
                    i5 = c1660.f5610;
                    c0662 = c0666;
                } else {
                    iArr2 = iArr;
                    i = size;
                    i2 = length2;
                    c0244 = c0246;
                    i3 = i11;
                    i4 = i15;
                    if (c2597.f8252) {
                        c1660 = c1662;
                        c0662 = c0666;
                        i5 = i2;
                    } else {
                        c1660 = c1662;
                        c0662 = c0666;
                        i5 = 0;
                    }
                }
            }
            int i20 = c1660.f5610;
            int i21 = i5;
            while (i21 < i20) {
                int iM3388 = c1660.m3384(i21);
                try {
                    int i22 = i20;
                    int i23 = i;
                    C0243 c0248 = c0244;
                    C1660 c1663 = c1660;
                    int i24 = i2;
                    try {
                        m4616(iM3388, c0526.f2212, c0662, c0248, iArr2);
                        c0244 = c0248;
                        i21++;
                        iArr2 = iArr;
                        i2 = i24;
                        c1660 = c1663;
                        i = i23;
                        i20 = i22;
                    } catch (C2704 e) {
                        e = e;
                        e.m2885("...while merging to block ".concat(AbstractC1460.m3223(iM3388)));
                        throw e;
                    }
                } catch (C2704 e2) {
                    e = e2;
                }
            }
            C2596 c2598 = this;
            int i25 = i20;
            int i26 = i;
            C1660 c1664 = c1660;
            int i27 = i2;
            if (i25 == 0 && c2597.f8253) {
                c1660M3381 = C1660.m3381(c2598.m4610(-2));
                i8 = 1;
            } else {
                c1660M3381 = c1664;
                i8 = i25;
            }
            if (i8 == 0) {
                iM3385 = -1;
            } else {
                iM3385 = c2597.f8254;
                if (iM3385 >= 0) {
                    iM3385 = c1660M3381.m3384(iM3385);
                }
            }
            int i28 = (c2598.m4613() && c2597.f8257) ? 1 : 0;
            if (i28 == 0 && i27 == 0) {
                i9 = iM3385;
            } else {
                C1660 c1665 = new C1660(i8);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i27) {
                    C0535 c0535 = (C0535) c0536.m3062(i29);
                    C0918 c0919 = c0535.f2238;
                    if (c0919 == null) {
                        c0919 = C0918.f3381;
                    }
                    int i31 = c0535.f2237;
                    int i32 = i30 | (c0919 == C0918.f3381 ? 1 : 0);
                    C1242 c1242M2897 = c1242.m2897();
                    c1242M2897.m3925();
                    C1660 c1666 = c1665;
                    for (int i33 = 0; i33 < c1242M2897.f4507; i33++) {
                        ((InterfaceC3450[]) c1242M2897.f4508)[i33] = c0666;
                        ((boolean[]) c1242M2897.f4509)[i33] = false;
                    }
                    c1242M2897.f4507 = 0;
                    c1242M2897.m2900(c0919);
                    C0243 c0249 = new C0243(abstractC1834, c1242M2897, c1661);
                    int i34 = i29;
                    try {
                        int i35 = iM3385;
                        C0536 c0537 = c0536;
                        i10 = i31;
                        c2598 = this;
                        try {
                            c2598.m4616(i10, c0526.f2212, null, c0249, iArr);
                            C0542[] c0542Arr = c2598.f8239;
                            C0542 c0542 = c0542Arr[i10];
                            if (c0542 == null) {
                                c0542 = new C0542(c2598);
                                c0542Arr[i10] = c0542;
                            }
                            C3448 c3448 = c0919.f3401;
                            HashMap map = (HashMap) c0542.f2252;
                            C2593 c2593 = (C2593) map.get(c3448);
                            if (c2593 == null) {
                                int iMo1594 = ((C2596) c0542.f2253).f8243.mo1594();
                                c2593 = new C2593();
                                c2593.f8220 = c3448;
                                c2593.f8221 = iMo1594;
                                map.put(c3448, c2593);
                            }
                            c1666.m3382(c2593.f8221);
                            i29 = i34 + 1;
                            iM3385 = i35;
                            c1665 = c1666;
                            i30 = i32;
                            c0536 = c0537;
                            c0526 = c0525;
                        } catch (C2704 e3) {
                            e = e3;
                            e.m2885("...while merging exception to block ".concat(AbstractC1460.m3223(i10)));
                            throw e;
                        }
                    } catch (C2704 e4) {
                        e = e4;
                        i10 = i31;
                    }
                }
                C1660 c1667 = c1665;
                i9 = iM3385;
                if (i28 != 0 && i30 == 0) {
                    c1667.m3382(c2598.m4610(-6));
                    ?? r2 = 1;
                    c2598.f8240 = r2;
                    for (int i36 = (i26 - i4) - (r2 == true ? 1 : 0); i36 < i26; i36++) {
                        AbstractC1649 abstractC1649 = (AbstractC1649) arrayList.get(i36);
                        if (abstractC1649.f5588.m4599()) {
                            arrayList.set(i36, abstractC1649.mo3048(C3448.f10882));
                        }
                    }
                }
                if (i9 >= 0) {
                    c1667.m3382(i9);
                }
                c1667.f6944 = false;
                c1660M3381 = c1667;
            }
            int iM3383 = c1660M3381.m3383(i9);
            int i37 = iM3383 >= 0 ? iM3383 : -1;
            int i38 = i9;
            C1660 c1660M3386 = c1660M3381;
            int i39 = i26;
            while (i4 > 0) {
                i39--;
                AbstractC1649 abstractC16410 = (AbstractC1649) arrayList.get(i39);
                boolean z2 = abstractC16410.f5588.f8208 == 1;
                C0442 c0442 = new C0442(z2 ? 2 : 1);
                c0442.m3063(0, abstractC16410);
                if (z2) {
                    c0442.m3063(1, new C2351(AbstractC2598.f8279, abstractC16410.f5589, (C2525) c0666, C2526.f8058));
                    c1660M3382 = C1660.m3381(i38);
                } else {
                    c1660M3382 = c1660M3386;
                }
                c0442.f6944 = false;
                int iM4609 = c2598.m4609();
                c2598.m4606(new C0402(iM4609, c0442, c1660M3382, i38), c1661);
                c1660M3386 = c1660M3386.m3385();
                c1660M3386.m3386(i37, iM4609);
                c1660M3386.f6944 = false;
                i4--;
                i38 = iM4609;
                c0666 = null;
            }
            AbstractC1649 abstractC16411 = i39 == 0 ? null : (AbstractC1649) arrayList.get(i39 - 1);
            if (abstractC16411 == null || abstractC16411.f5588.f8208 == 1) {
                arrayList.add(new C2351(AbstractC2598.f8279, abstractC16411 == null ? C2788.f8904 : abstractC16411.f5589, (C2525) null, C2526.f8058));
                i39++;
            }
            C0442 c0443 = new C0442(i39);
            for (int i40 = 0; i40 < i39; i40++) {
                c0443.m3063(i40, (AbstractC1649) arrayList.get(i40));
            }
            c0443.f6944 = false;
            C0402 c0402 = new C0402(i3, c0443, c1660M3386, i38);
            int iM4615 = c2598.m4615(c0402.f1897);
            if (iM4615 >= 0) {
                c2598.m4618(iM4615);
            }
            c2598.f8237.add(c0402);
            c1661.m3926();
            c2598.f8238.add(c1661);
        } catch (C2704 e5) {
            abstractC1834.mo3587(e5);
            c1242.m2895(e5);
            throw e5;
        }
    }

    public final void m4618(int i) {
        int length = this.f8233 + this.f8230.f2867.f1496.f4836.length + 7;
        ArrayList arrayList = this.f8237;
        C1660 c1660 = ((C0402) arrayList.get(i)).f1899;
        int i2 = c1660.f5610;
        arrayList.remove(i);
        this.f8238.remove(i);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3384 = c1660.m3384(i3);
            if (iM3384 >= length) {
                int iM4615 = m4615(iM3384);
                if (iM4615 < 0) {
                    throw new RuntimeException("Invalid label ".concat(AbstractC1460.m3223(iM3384)));
                }
                m4618(iM4615);
            }
        }
    }
}
