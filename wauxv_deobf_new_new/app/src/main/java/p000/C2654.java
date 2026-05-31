package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2654 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0766 f8382;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C0503 f8383;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final int f8384;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f8385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2655 f8386;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1927 f8387;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0253[] f8388;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f8389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final ArrayList f8390;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0519[] f8391;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean f8392;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C0776[] f8393;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean f8394;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C2652 f8395;

    public C2654(C0766 c0766, C0417 c0417, C0561 c0561) {
        int[] iArr;
        C0513 c0513;
        C0293 c0293 = c0766.f2869;
        this.f8382 = c0766;
        C0380 c0380 = new C0380(c0766);
        C0519 c0519 = c0293.f1569;
        C0513 c0514 = c0293.f1570;
        int length = c0514.f4833.length;
        int[] iArr2 = c0380.f1876;
        AbstractC1467.m3287(iArr2, 0);
        int[] iArr3 = c0380.f1878;
        AbstractC1467.m3287(iArr3, 0);
        loop0: while (true) {
            int length2 = iArr2.length;
            int i = 0;
            while (true) {
                iArr = c0380.f1877;
                if (i >= length2) {
                    break loop0;
                } else if (iArr2[i] != 0) {
                    break;
                } else {
                    i++;
                }
            }
            try {
                c0519.getClass();
                while (true) {
                    int iM3270 = AbstractC1467.m3270(iArr2, 0);
                    if (iM3270 < 0) {
                        break;
                    }
                    AbstractC1467.m3265(iArr2, iM3270);
                    c0519.m1999(iM3270, c0380);
                    c0380.f1881 = iM3270;
                }
                for (int i2 = 0; i2 < length; i2++) {
                    C0512 c0512 = (C0512) c0514.m3165(i2);
                    int i3 = c0512.f2191;
                    int i4 = c0512.f2192;
                    int iM3271 = AbstractC1467.m3270(iArr, i3);
                    if (iM3271 >= 0 && iM3271 < i4) {
                        AbstractC1467.m3287(iArr3, i3);
                        AbstractC1467.m3287(iArr3, i4);
                        c0380.m1704(c0512.f2193, true);
                    }
                }
            } catch (IllegalArgumentException e) {
                throw new C2766("flow of control falls off end of method", e);
            }
        }
        C0502[] c0502Arr = new C0502[((C0493) c0380.f1875.f2869.f1569.f2208).f2147];
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int iM3272 = AbstractC1467.m3270(iArr3, i6 + 1);
            if (iM3272 < 0) {
                break;
            }
            if (AbstractC1467.m3271(iArr, i6)) {
                int i7 = iM3272 - 1;
                C1676 c1676M3545 = null;
                while (true) {
                    if (i7 < i6) {
                        i7 = -1;
                        break;
                    }
                    c1676M3545 = c0380.f1879[i7];
                    if (c1676M3545 != null) {
                        break;
                    } else {
                        i7--;
                    }
                }
                if (c1676M3545 == null) {
                    c1676M3545 = C1676.m3545(iM3272);
                    c0513 = C0513.f2195;
                } else {
                    c0513 = c0380.f1880[i7];
                    if (c0513 == null) {
                        c0513 = C0513.f2195;
                    }
                }
                c0502Arr[i5] = new C0502(i6, i6, iM3272, c1676M3545, c0513);
                i5++;
            }
            i6 = iM3272;
        }
        C0503 c0503 = new C0503(i5);
        for (int i8 = 0; i8 < i5; i8++) {
            c0503.m3660(i8, c0502Arr[i8]);
        }
        this.f8383 = c0503;
        int iM3658 = c0503.m3658();
        this.f8385 = iM3658;
        int i9 = c0293.f1568;
        this.f8384 = i9;
        C2655 c2655 = new C2655(this, c0766, c0417);
        this.f8386 = c2655;
        this.f8387 = new C1927(c2655, c0766, c0561);
        C0253[] c0253Arr = new C0253[iM3658];
        this.f8388 = c0253Arr;
        this.f8393 = new C0776[iM3658];
        this.f8389 = new ArrayList((c0503.f4833.length * 2) + 10);
        this.f8390 = new ArrayList((c0503.f4833.length * 2) + 10);
        this.f8391 = new C0519[iM3658];
        this.f8392 = false;
        c0253Arr[0] = new C0253(new C2320(i9), new C1244(c0293.f1567, 0), C1676.f5646);
        C2652 c2652 = new C2652(iM3658);
        c2652.f8374 = iM3658 + this.f8382.f2869.f1570.f4833.length;
        this.f8395 = c2652;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static C0776 m4635(C0766 c0766, C0417 c0417, C0561 c0561) {
        try {
            C2654 c2654 = new C2654(c0766, c0417, c0561);
            c2654.m4637();
            ArrayList arrayList = c2654.f8389;
            int size = arrayList.size();
            C0379 c0379 = new C0379(size);
            c0379.f1874 = -1;
            for (int i = 0; i < size; i++) {
                c0379.m3660(i, (C0377) arrayList.get(i));
                c0379.f1874 = -1;
            }
            c0379.f7068 = false;
            return new C0776(c0379, c2654.m4640(-1));
        } catch (C2766 e) {
            e.m3004("...while working on method " + c0766.f2867.mo2361().mo1360());
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4636(C0377 c0377, C1676 c1676) {
        this.f8389.add(c0377);
        c1676.m4110();
        this.f8390.add(c1676);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.String, ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᲁᤝᛸ, ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᤝᲇᲈ] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11, types: [int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r4v0, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲇᲀᲁᤝᤞ] */
    /* JADX WARN: Type inference failed for: r8v24, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤝᤞᲇᲈᲀ, ᛱᛲᛳᛴᛵᛶᛷᤝᲇᲈᛸᲀᤞᲁ, ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲇᲀᲁᛸ] */
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final void m4637() {
        int i;
        ?? r10;
        int i2;
        ?? r12;
        boolean z;
        C2582 c2582M4568;
        ?? r13;
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z2;
        C2581 c2581;
        C2582 c2582;
        boolean z3;
        C0417 c0417;
        boolean z4;
        C2581 c2581M4554;
        int i3 = this.f8385;
        int[] iArrM3279 = AbstractC1467.m3279(i3);
        int i4 = 0;
        AbstractC1467.m3287(iArrM3279, 0);
        ?? r4 = this.f8382;
        C1860 c1860 = r4.f2871;
        C2848 c2848M2362 = r4.m2362(0);
        InterfaceC2002 interfaceC2002 = r4.f2867;
        C2879 c2879 = interfaceC2002.mo2358().f7900;
        int length = c2879.f4833.length;
        C0417 c0418 = new C0417(length + 1);
        int i5 = 0;
        int iM5028 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            C3505 c3505 = (C3505) c2879.m3165(i5);
            C1859 c1859M3764 = c1860.m3764(i4, iM5028);
            if (c1859M3764 == null) {
                c2581M4554 = C2581.m4554(iM5028, c3505, null);
            } else {
                C0916 c0916 = c1859M3764.f6196;
                C0916 c0917 = c1859M3764.f6198;
                c2581M4554 = C2581.m4554(iM5028, c3505, (c0916 == null && c0917 == null) ? null : new C1853(c0916, c0917));
            }
            int i6 = i5;
            int i7 = iM5028;
            c0418.m3166(i6, new C2395(AbstractC2656.m4651(c3505), c2848M2362, c2581M4554, C2582.f8208, C0902.m2537(i7)));
            iM5028 = c3505.m5028() + i7;
            i5 = i6 + 1;
            i4 = 0;
        }
        C2648 c2648 = AbstractC2656.f8431;
        C2582 c2583 = C2582.f8208;
        c0418.m3166(length, new C2396(c2648, c2848M2362, (C2581) null, c2583));
        c0418.f7068 = false;
        boolean zM4643 = m4643();
        int iM4640 = zM4643 ? m4640(-4) : 0;
        C0377 c0377 = new C0377(m4640(-1), c0418, C1676.m3545(iM4640), iM4640);
        C1676 c1676 = C1676.f5646;
        m4636(c0377, c1676);
        int i8 = this.f8384;
        if (zM4643) {
            int i9 = r4.f2869.f1567 + i8;
            if (i9 < 1) {
                i9 = 1;
            }
            C2581 c2581M4555 = C2581.m4554(i9, C3505.f11042, null);
            if (m4641()) {
                c2582 = c2583;
                i = i8;
                C2982 c2982 = new C2982(AbstractC2656.f8429, c2848M2362, c2582, C2879.f9192, interfaceC2002.mo2359());
                c0417 = new C0417(1);
                c0417.m3166(0, c2982);
                c2581 = c2581M4555;
                i2 = 1;
                z2 = false;
                z3 = false;
            } else {
                i = i8;
                C0417 c0419 = new C0417(2);
                i2 = 1;
                z2 = false;
                c2581 = c2581M4555;
                c2582 = c2583;
                c0419.m3166(0, new C2395(AbstractC2656.f8424, c2848M2362, c2581M4555, c2583, C0902.f3357));
                z3 = false;
                c0419.m3166(1, new C2396(c2648, c2848M2362, (C2581) null, c2582));
                c0417 = c0419;
            }
            int iM4641 = m4640(-5);
            c0417.f7068 = z2;
            m4636(new C0377(iM4640, c0417, C1676.m3545(iM4641), iM4641), c1676);
            C0417 c04110 = new C0417(m4641() ? 2 : i2);
            if (m4641()) {
                z4 = false;
                c04110.m3166(0, new C2396(AbstractC2656.m4652(c2581), c2848M2362, c2581, c2582));
            } else {
                z4 = false;
            }
            c04110.m3166(m4641() ? 1 : 0, new C2928(AbstractC2656.f8547, c2848M2362, C2582.m4568(c2581), C2879.f9192));
            c04110.f7068 = z4;
            m4636(new C0377(iM4641, c04110, C1676.m3545(z4 ? 1 : 0), z4 ? 1 : 0), c1676);
            r10 = z3;
            r12 = z4;
        } else {
            i3 = i3;
            i = i8;
            r10 = 0;
            i2 = 1;
            interfaceC2002 = interfaceC2002;
            r12 = 0;
        }
        C2492 c2492Mo2358 = interfaceC2002.mo2358();
        C0253[] c0253Arr = this.f8388;
        C0253 c0253 = c0253Arr[r12];
        C2879 c28710 = c2492Mo2358.f7900;
        c0253.getClass();
        int length2 = c28710.f4833.length;
        int iM5029 = 0;
        for (int i10 = 0; i10 < length2; i10++) {
            C3505 c3506 = (C3505) c28710.m3165(i10);
            ((AbstractC1861) c0253.f1478).mo3772(iM5029, c3506);
            iM5029 += c3506.m5028();
        }
        int i11 = 0;
        C0253 c0254 = c0253Arr[0];
        ((AbstractC1861) c0254.f1478).mo3013();
        ((C1244) c0254.f1479).f7068 = false;
        while (true) {
            int iM3270 = AbstractC1467.m3270(iArrM3279, i11);
            if (iM3270 < 0) {
                C2655 c2655 = this.f8386;
                C2648 c2649 = c2655.f8411;
                if (c2649 == null) {
                    r13 = 0;
                } else {
                    C2848 c2848 = c2655.f8412;
                    int iM4642 = m4640(-2);
                    if (m4643()) {
                        C0417 c04111 = new C0417(i2);
                        C2648 c26410 = AbstractC2656.f8548;
                        int i12 = r4.f2869.f1567 + i;
                        if (i12 < i2) {
                            i12 = i2;
                        }
                        c04111.m3166(0, new C2928(c26410, c2848, C2582.m4568(C2581.m4554(i12, C3505.f11042, r10)), C2879.f9192));
                        c04111.f7068 = false;
                        int iM4643 = m4640(-3);
                        m4636(new C0377(iM4642, c04111, C1676.m3545(iM4643), iM4643), C1676.f5646);
                        iM4642 = iM4643;
                    }
                    C0417 c04112 = new C0417(i2);
                    InterfaceC3510 interfaceC3510 = c2649.f8358;
                    if (interfaceC3510.size() == 0) {
                        c2582M4568 = C2582.f8208;
                        z = false;
                    } else {
                        z = false;
                        c2582M4568 = C2582.m4568(C2581.m4554(0, interfaceC3510.getType(0), r10));
                    }
                    c04112.m3166(z ? 1 : 0, new C2396(c2649, c2848, (C2581) r10, c2582M4568));
                    c04112.f7068 = z;
                    C1676 c1677 = C1676.f5646;
                    m4636(new C0377(iM4642, c04112, c1677, -1), c1677);
                    r13 = z;
                }
                if (this.f8392) {
                    C2848 c2848M2363 = r4.m2362(r13);
                    C3505 c3507 = C3505.f11045;
                    C2581 c2581M4556 = C2581.m4554(r13, c3507, r10);
                    ?? c04113 = new C0417(2);
                    c3507.getClass();
                    C2879 c28711 = C2879.f9192;
                    c04113.m3166(r13, new C2396(new C2648(4, c3507, c28711, r10), c2848M2363, c2581M4556, C2582.f8208));
                    C2648 c26411 = AbstractC2656.f8548;
                    int i13 = i + r4.f2869.f1567;
                    if (i13 < i2) {
                        i13 = i2;
                    }
                    c04113.m3166(i2, new C2928(c26411, c2848M2363, C2582.m4568(C2581.m4554(i13, C3505.f11042, r10)), c28711));
                    c04113.f7068 = false;
                    int iM4644 = m4640(-7);
                    C0377 c0378 = new C0377(m4640(-6), c04113, C1676.m3545(iM4644), iM4644);
                    C1676 c1678 = C1676.f5646;
                    m4636(c0378, c1678);
                    C0417 c04114 = new C0417(i2);
                    c04114.m3166(0, new C2928(AbstractC2656.f8546, c2848M2363, C2582.m4568(c2581M4556), c28711));
                    c04114.f7068 = false;
                    m4636(new C0377(iM4644, c04114, c1678, -1), c1678);
                }
                C0519[] c0519Arr = this.f8391;
                int length3 = c0519Arr.length;
                for (int i14 = 0; i14 < length3; i14++) {
                    C0519 c0519 = c0519Arr[i14];
                    if (c0519 != null) {
                        for (C2651 c2651 : ((HashMap) c0519.f2208).values()) {
                            C2848 c2849 = ((AbstractC1663) m4644(i14).f1870.m3165(0)).f5624;
                            C0417 c04115 = new C0417(2);
                            C3505 c3508 = c2651.f8372;
                            c3508.getClass();
                            C2648 c26412 = new C2648(4, c3508, C2879.f9192, r10);
                            C2581 c2581M4557 = C2581.m4554(i, c2651.f8372, r10);
                            C2582 c2584 = C2582.f8208;
                            c04115.m3166(0, new C2396(c26412, c2849, c2581M4557, c2584));
                            c04115.m3166(1, new C2396(AbstractC2656.f8431, c2849, (C2581) r10, c2584));
                            c04115.f7068 = false;
                            m4636(new C0377(c2651.f8373, c04115, C1676.m3545(i14), i14), (C1676) c0253Arr[i14].f1480);
                        }
                    }
                }
                if (this.f8394) {
                    C1676 c1679 = new C1676(4);
                    int i15 = i3;
                    m4638(m4644(0), new C0519(this, c1679, 25, false), new BitSet(i15));
                    int iM4639 = m4639();
                    ArrayList arrayList3 = new ArrayList(iM4639);
                    for (int i16 = 0; i16 < iM4639; i16++) {
                        arrayList3.add(r10);
                    }
                    int i17 = 0;
                    while (true) {
                        arrayList = this.f8389;
                        int size = arrayList.size();
                        arrayList2 = this.f8390;
                        if (i17 >= size) {
                            break;
                        }
                        C0377 c0379 = (C0377) arrayList.get(i17);
                        if (c0379 != null) {
                            arrayList3.set(c0379.f1869, (C1676) arrayList2.get(i17));
                        }
                        i17++;
                    }
                    int i18 = c1679.f5648;
                    for (int i19 = 0; i19 < i18; i19++) {
                        new C2653(this, new C0378(m4639()), arrayList3).m4633(m4644(c1679.m3548(i19)));
                    }
                    C1676 c16710 = new C1676(arrayList.size());
                    arrayList2.clear();
                    m4638(m4644(m4640(-1)), new C1681(c16710), new BitSet(i15));
                    c16710.m3552();
                    for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                        int iM3547 = c16710.m3547(((C0377) arrayList.get(size2)).f1869);
                        if (iM3547 < 0) {
                            iM3547 = -1;
                        }
                        if (iM3547 < 0) {
                            arrayList.remove(size2);
                        }
                    }
                    return;
                }
                return;
            }
            int i20 = i3;
            i11 = 0;
            int i21 = i2;
            AbstractC1467.m3265(iArrM3279, iM3270);
            C0503 c0503 = this.f8383;
            int iM3659 = c0503.m3659(iM3270);
            if (iM3659 < 0) {
                throw new IllegalArgumentException("no such label: ".concat(AbstractC2902.m4906(iM3270)));
            }
            try {
                m4647((C0502) c0503.m3165(iM3659), c0253Arr[iM3270], iArrM3279);
                i2 = i21;
                i3 = i20;
            } catch (C2766 e) {
                e.m3004("...while working on block ".concat(AbstractC2902.m4906(iM3270)));
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void m4638(C0377 c0377, InterfaceC0376 interfaceC0376, BitSet bitSet) {
        int iM4645;
        interfaceC0376.mo1681(c0377);
        bitSet.set(c0377.f1869);
        C1676 c1676 = c0377.f1871;
        int i = c1676.f5648;
        for (int i2 = 0; i2 < i; i2++) {
            int iM3548 = c1676.m3548(i2);
            if (!bitSet.get(iM3548) && ((!m4642(c0377) || i2 <= 0) && (iM4645 = m4645(iM3548)) >= 0)) {
                m4638((C0377) this.f8389.get(iM4645), interfaceC0376, bitSet);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int m4639() {
        int length = this.f8385 + this.f8382.f2869.f1570.f4833.length + 7;
        Iterator it = this.f8389.iterator();
        while (it.hasNext()) {
            int i = ((C0377) it.next()).f1869;
            if (i >= length) {
                length = i + 1;
            }
        }
        return length;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int m4640(int i) {
        return this.f8385 + this.f8382.f2869.f1570.f4833.length + (~i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final boolean m4641() {
        return (this.f8382.f2867.mo2360() & 8) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m4642(C0377 c0377) {
        C1676 c1676 = c0377.f1871;
        if (c1676.f5648 < 2) {
            return false;
        }
        int iM3548 = c1676.m3548(1);
        C0776[] c0776Arr = this.f8393;
        return iM3548 < c0776Arr.length && c0776Arr[iM3548] != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final boolean m4643() {
        return (this.f8382.f2867.mo2360() & 32) != 0;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0377 m4644(int i) {
        int iM4645 = m4645(i);
        if (iM4645 >= 0) {
            return (C0377) this.f8389.get(iM4645);
        }
        throw new IllegalArgumentException("no such label ".concat(AbstractC2902.m4906(i)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final int m4645(int i) {
        ArrayList arrayList = this.f8389;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (((C0377) arrayList.get(i2)).f1869 == i) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m4646(int i, int i2, C0776 c0776, C0253 c0253, int[] iArr) {
        C1676 c1676;
        C0253 c0254;
        C1676 c1677 = (C1676) c0253.f1480;
        C1244 c1244 = (C1244) c0253.f1479;
        AbstractC1861 abstractC1861 = (AbstractC1861) c0253.f1478;
        C0253[] c0253Arr = this.f8388;
        C0253 c0255 = c0253Arr[i];
        if (c0255 == null) {
            if (c0776 != null) {
                c1677.m3549().m3546(i);
                c0253Arr[i] = new C0253(abstractC1861.mo3768(), c1244, C1676.m3545(i)).m1473(c0253, i, i2);
            } else {
                c0253Arr[i] = c0253;
            }
            AbstractC1467.m3287(iArr, i);
            return;
        }
        if (c0776 != null) {
            c0254 = c0255.m1473(c0253, c0776.f2878, i2);
        } else {
            AbstractC1861 abstractC1862 = (AbstractC1861) c0255.f1478;
            AbstractC1861 abstractC1861Mo3770 = abstractC1862.mo3770(abstractC1861);
            C1244 c1245 = (C1244) c0255.f1479;
            c1245.getClass();
            try {
                C1244 c1244M4706 = AbstractC2727.m4706(c1245, c1244);
                C1676 c1678 = (C1676) c0255.f1480;
                if (c1678.equals(c1677)) {
                    c1676 = c1678;
                } else {
                    c1676 = new C1676(4);
                    int i3 = c1678.f5648;
                    int i4 = c1677.f5648;
                    for (int i5 = 0; i5 < i3 && i5 < i4 && c1678.m3548(i5) == c1677.m3548(i5); i5++) {
                        c1676.m3546(i5);
                    }
                    c1676.f7068 = false;
                }
                boolean z = abstractC1861Mo3770 instanceof C1862;
                AbstractC1861 abstractC1863 = abstractC1861Mo3770;
                if (z) {
                    C1862 c1862 = (C1862) abstractC1861Mo3770;
                    if (c1676.f5648 == 0) {
                        abstractC1863 = c1862;
                        abstractC1863 = c1862.f6201;
                    }
                }
                c0254 = (abstractC1863 == abstractC1862 && c1244M4706 == c1245 && c1678 == c1676) ? c0255 : new C0253(abstractC1863, c1244M4706, c1676);
            } catch (C2766 e) {
                e.m3004("underlay stack:");
                c1245.m3014(e);
                e.m3004("overlay stack:");
                c1244.m3014(e);
                throw e;
            }
        }
        if (c0254 != c0255) {
            c0253Arr[i] = c0254;
            AbstractC1467.m3287(iArr, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:211:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[Catch: NullPointerException -> 0x01db, IndexOutOfBoundsException -> 0x01e3, TRY_LEAVE, TryCatch #7 {IndexOutOfBoundsException -> 0x01e3, NullPointerException -> 0x01db, blocks: (B:46:0x0186, B:48:0x01a1, B:56:0x01d5, B:57:0x01da), top: B:194:0x0186 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:51:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:54:0x01be  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v8, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᛸᤞᤝᲇᲈ] */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲀᤝᲈᲇ] */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᛸᤞᲈ] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r22v6 */
    /* JADX WARN: Type inference failed for: r22v7 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲀᤝᲈᲁ] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r2v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v49, types: [ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲀᲈᛸᤞᤝ[]] */
    /* JADX WARN: Type inference failed for: r4v12, types: [ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᤝᛸᤞᲈ] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m4647(C0502 c0502, C0253 c0253, int[] iArr) {
        C2879 c2879;
        int[] iArr2;
        int i;
        int i2;
        C0253 c0254;
        int i3;
        int i4;
        C1676 c1676;
        C0776 c0776;
        int i5;
        ?? r22;
        ?? r1;
        ?? r23;
        C1676 c1676M3549;
        int i6;
        int iM3548;
        int i7;
        ?? c0255;
        ?? r24;
        C1676 c1676M3545;
        int i8;
        int iM3549;
        int i9;
        int i10;
        C1676 c1676M3546;
        C0502 c0503 = c0502;
        C0513 c0513 = c0503.f2172;
        int i11 = c0503.f2168;
        int length = c0513.f4833.length;
        if (length == 0) {
            c2879 = C2879.f9192;
        } else {
            C2879 c28710 = new C2879(length);
            for (int i12 = 0; i12 < length; i12++) {
                C0917 c0917 = ((C0512) c0513.m3165(i12)).f2194;
                if (c0917 == null) {
                    c0917 = C0917.f3388;
                }
                c28710.m3166(i12, c0917.f3408);
            }
            c28710.f7068 = false;
            c2879 = c28710;
        }
        C2655 c2655 = this.f8386;
        c2655.f8403 = c2879;
        ArrayList arrayList = c2655.f8402;
        arrayList.clear();
        c2655.f8404 = false;
        c2655.f8405 = false;
        c2655.f8406 = 0;
        c2655.f8407 = 0;
        c2655.f8409 = false;
        c2655.f8408 = false;
        C0776 c0777 = null;
        c2655.f8410 = null;
        C0253 c0256 = new C0253(((AbstractC1861) c0253.f1478).mo3766(), ((C1244) c0253.f1479).m3016(), (C1676) c0253.f1480);
        AbstractC1861 abstractC1861 = (AbstractC1861) c0256.f1478;
        C1244 c1244 = (C1244) c0256.f1479;
        C1676 c1677 = (C1676) c0256.f1480;
        C1927 c1927 = this.f8387;
        c1927.getClass();
        int i13 = c0503.f2170;
        C0776 c0778 = (C0776) c1927.f6348;
        c0778.f2880 = c0256;
        try {
            int i14 = c0503.f2169;
            while (i14 < i13) {
                C0776 c0779 = c0777;
                int iM1999 = ((C0519) c1927.f6345).m1999(i14, c0778);
                c0778.f2878 = i14;
                i14 += iM1999;
                c0777 = c0779;
            }
            C0776 c07710 = c0777;
            abstractC1861.mo3013();
            c1244.f7068 = false;
            int i15 = c2655.f8407;
            int size = arrayList.size();
            int length2 = c0513.f4833.length;
            C1676 c1678 = c0503.f2171;
            boolean z = c2655.f8408;
            C0776[] c0776Arr = this.f8393;
            int i16 = 1;
            if (z) {
                int iM35410 = c1678.m3548(1);
                if (c0776Arr[iM35410] == null) {
                    c0776Arr[iM35410] = new C0776(this, iM35410);
                }
                ((BitSet) c0776Arr[iM35410].f2879).set(i11);
                C0776 c07711 = c0776Arr[iM35410];
                iArr2 = iArr;
                i = size;
                i2 = length2;
                c1676 = c1678;
                c0254 = c0256;
                c0776 = c07711;
                i3 = i11;
                i4 = i15;
                i5 = i16;
            } else {
                i16 = 1;
                C2643 c2643 = c2655.f8410;
                if (c2643 != null) {
                    int i17 = c2643.f8346;
                    C0776 c07712 = c0776Arr[i17];
                    if (c07712 == null) {
                        C0776 c07713 = new C0776(this, i17);
                        ((BitSet) c07713.f2880).set(i11);
                        c0776Arr[i17] = c07713;
                    } else {
                        ((BitSet) c07712.f2880).set(i11);
                    }
                    C0776 c07714 = c0776Arr[i17];
                    c07714.getClass();
                    BitSet bitSet = (BitSet) c07714.f2879;
                    i = size;
                    c1676 = new C1676(bitSet.size());
                    int iNextSetBit = bitSet.nextSetBit(0);
                    while (iNextSetBit >= 0) {
                        c1676.m3546(((C2654) c07714.f2881).m4644(iNextSetBit).f1871.m3548(0));
                        iNextSetBit = bitSet.nextSetBit(iNextSetBit + 1);
                        length2 = length2;
                    }
                    i2 = length2;
                    int i18 = 0;
                    c1676.f7068 = false;
                    C0776 c07715 = c0776Arr[i17];
                    BitSet bitSet2 = (BitSet) c07715.f2879;
                    C2654 c2654 = (C2654) c07715.f2881;
                    int iNextSetBit2 = bitSet2.nextSetBit(0);
                    ?? r4 = c2654;
                    while (iNextSetBit2 >= 0) {
                        C0253 c0257 = c0256;
                        int iM35411 = r4.m4644(iNextSetBit2).f1871.m3548(i18);
                        int i19 = c07715.f2878;
                        C0776 c07716 = c07715;
                        try {
                            if (abstractC1861 instanceof C1862) {
                                ArrayList arrayList2 = ((C1862) abstractC1861).f6202;
                                r24 = r4;
                                if (iNextSetBit2 < arrayList2.size()) {
                                    r22 = r24;
                                    r1 = (AbstractC1861) arrayList2.get(iNextSetBit2);
                                    r23 = r24;
                                }
                                c1676M3549 = c1677.m3549();
                                c1676M3549.m4109();
                                i6 = i15;
                                iM3548 = c1676M3549.m3548(c1676M3549.f5648 - 1);
                                i7 = i11;
                                c1676M3549.f5648--;
                                if (iM3548 == i19) {
                                    throw new RuntimeException("returning from invalid subroutine");
                                }
                                c1676M3549.f7068 = false;
                                if (r1 == 0) {
                                    c0255 = c07710;
                                } else {
                                    c0255 = new C0253((AbstractC1861) r1, c1244, c1676M3549);
                                }
                                if (c0255 != 0) {
                                    r23.m4646(iM35411, -1, null, c0255, iArr);
                                } else {
                                    AbstractC1467.m3287(iArr, iNextSetBit2);
                                }
                                iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1);
                                c07715 = c07716;
                                c0256 = c0257;
                                r4 = r23;
                                i15 = i6;
                                i11 = i7;
                                i18 = 0;
                            } else {
                                r22 = r4;
                            }
                            c1676M3549 = c1677.m3549();
                            c1676M3549.m4109();
                            i6 = i15;
                            iM3548 = c1676M3549.m3548(c1676M3549.f5648 - 1);
                            i7 = i11;
                            c1676M3549.f5648--;
                            if (iM3548 == i19) {
                                throw new RuntimeException("returning from invalid subroutine");
                            }
                            c1676M3549.f7068 = false;
                            if (r1 == 0) {
                                c0255 = c07710;
                            } else {
                                c0255 = new C0253((AbstractC1861) r1, c1244, c1676M3549);
                            }
                            if (c0255 != 0) {
                                r23.m4646(iM35411, -1, null, c0255, iArr);
                            } else {
                                AbstractC1467.m3287(iArr, iNextSetBit2);
                            }
                            iNextSetBit2 = bitSet2.nextSetBit(iNextSetBit2 + 1);
                            c07715 = c07716;
                            c0256 = c0257;
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
                        r1 = c07710;
                        r23 = r22;
                    }
                    iArr2 = iArr;
                    c0254 = c0256;
                    i3 = i11;
                    i4 = i15;
                    i5 = c1676.f5648;
                    c0776 = c07710;
                } else {
                    iArr2 = iArr;
                    i = size;
                    i2 = length2;
                    c0254 = c0256;
                    i3 = i11;
                    i4 = i15;
                    if (c2655.f8404) {
                        c1676 = c1678;
                        c0776 = c07710;
                        i5 = i2;
                    } else {
                        c1676 = c1678;
                        c0776 = c07710;
                        i5 = 0;
                    }
                }
            }
            int i20 = c1676.f5648;
            int i21 = i5;
            while (i21 < i20) {
                int iM35412 = c1676.m3548(i21);
                try {
                    int i22 = i20;
                    int i23 = i;
                    C0253 c0258 = c0254;
                    C1676 c1679 = c1676;
                    int i24 = i2;
                    try {
                        m4646(iM35412, c0503.f2168, c0776, c0258, iArr2);
                        c0254 = c0258;
                        i21++;
                        iArr2 = iArr;
                        i2 = i24;
                        c1676 = c1679;
                        i = i23;
                        i20 = i22;
                    } catch (C2766 e) {
                        e = e;
                        e.m3004("...while merging to block ".concat(AbstractC2902.m4906(iM35412)));
                        throw e;
                    }
                } catch (C2766 e2) {
                    e = e2;
                }
            }
            C2654 c2656 = this;
            int i25 = i20;
            int i26 = i;
            C1676 c16710 = c1676;
            int i27 = i2;
            if (i25 == 0 && c2655.f8405) {
                c1676M3545 = C1676.m3545(c2656.m4640(-2));
                i8 = i16;
            } else {
                c1676M3545 = c16710;
                i8 = i25;
            }
            if (i8 == 0) {
                iM3549 = -1;
            } else {
                iM3549 = c2655.f8406;
                if (iM3549 >= 0) {
                    iM3549 = c1676M3545.m3548(iM3549);
                }
            }
            int i28 = (c2656.m4643() && c2655.f8409) ? i16 : 0;
            if (i28 == 0 && i27 == 0) {
                i9 = iM3549;
            } else {
                C1676 c16711 = new C1676(i8);
                int i29 = 0;
                int i30 = 0;
                while (i29 < i27) {
                    C0512 c0512 = (C0512) c0513.m3165(i29);
                    C0917 c0918 = c0512.f2194;
                    if (c0918 == null) {
                        c0918 = C0917.f3388;
                    }
                    int i31 = c0512.f2193;
                    int i32 = i30 | (c0918 == C0917.f3388 ? i16 : 0);
                    C1244 c1244M3016 = c1244.m3016();
                    c1244M3016.m4109();
                    C1676 c16712 = c16711;
                    for (int i33 = 0; i33 < c1244M3016.f4506; i33++) {
                        ((InterfaceC3507[]) c1244M3016.f4507)[i33] = c07710;
                        ((boolean[]) c1244M3016.f4508)[i33] = false;
                    }
                    c1244M3016.f4506 = 0;
                    c1244M3016.m3019(c0918);
                    C0253 c0259 = new C0253(abstractC1861, c1244M3016, c1677);
                    int i34 = i29;
                    try {
                        int i35 = iM3549;
                        C0513 c0514 = c0513;
                        i10 = i31;
                        c2656 = this;
                        try {
                            c2656.m4646(i10, c0503.f2168, null, c0259, iArr);
                            C0519[] c0519Arr = c2656.f8391;
                            C0519 c0519 = c0519Arr[i10];
                            if (c0519 == null) {
                                c0519 = new C0519(c2656);
                                c0519Arr[i10] = c0519;
                            }
                            C3505 c3505 = c0918.f3408;
                            HashMap map = (HashMap) c0519.f2208;
                            C2651 c2651 = (C2651) map.get(c3505);
                            if (c2651 == null) {
                                int iMo1700 = ((C2654) c0519.f2209).f8395.mo1700();
                                c2651 = new C2651();
                                c2651.f8372 = c3505;
                                c2651.f8373 = iMo1700;
                                map.put(c3505, c2651);
                            }
                            c16712.m3546(c2651.f8373);
                            i29 = i34 + 1;
                            iM3549 = i35;
                            c16711 = c16712;
                            i30 = i32;
                            c0513 = c0514;
                            c0503 = c0502;
                        } catch (C2766 e3) {
                            e = e3;
                            e.m3004("...while merging exception to block ".concat(AbstractC2902.m4906(i10)));
                            throw e;
                        }
                    } catch (C2766 e4) {
                        e = e4;
                        i10 = i31;
                    }
                }
                C1676 c16713 = c16711;
                i9 = iM3549;
                if (i28 != 0 && i30 == 0) {
                    c16713.m3546(c2656.m4640(-6));
                    ?? r2 = i16;
                    c2656.f8392 = r2;
                    for (int i36 = (i26 - i4) - (r2 == true ? 1 : 0); i36 < i26; i36++) {
                        AbstractC1663 abstractC1663 = (AbstractC1663) arrayList.get(i36);
                        if (abstractC1663.f5623.m4629()) {
                            arrayList.set(i36, abstractC1663.mo3151(C3505.f11042));
                        }
                    }
                }
                if (i9 >= 0) {
                    c16713.m3546(i9);
                }
                c16713.f7068 = false;
                c1676M3545 = c16713;
            }
            int iM3547 = c1676M3545.m3547(i9);
            int i37 = iM3547 >= 0 ? iM3547 : -1;
            int i38 = i9;
            C1676 c1676M35410 = c1676M3545;
            int i39 = i26;
            while (i4 > 0) {
                i39--;
                AbstractC1663 abstractC1664 = (AbstractC1663) arrayList.get(i39);
                boolean z2 = abstractC1664.f5623.f8360 == 1;
                C0417 c0417 = new C0417(z2 ? 2 : 1);
                c0417.m3166(0, abstractC1664);
                if (z2) {
                    c0417.m3166(1, new C2396(AbstractC2656.f8431, abstractC1664.f5624, (C2581) c07710, C2582.f8208));
                    c1676M3546 = C1676.m3545(i38);
                } else {
                    c1676M3546 = c1676M35410;
                }
                c0417.f7068 = false;
                int iM4639 = c2656.m4639();
                c2656.m4636(new C0377(iM4639, c0417, c1676M3546, i38), c1677);
                c1676M35410 = c1676M35410.m3549();
                c1676M35410.m3550(i37, iM4639);
                c1676M35410.f7068 = false;
                i4--;
                i38 = iM4639;
                c07710 = null;
            }
            AbstractC1663 abstractC1665 = i39 == 0 ? null : (AbstractC1663) arrayList.get(i39 - 1);
            if (abstractC1665 == null || abstractC1665.f5623.f8360 == 1) {
                arrayList.add(new C2396(AbstractC2656.f8431, abstractC1665 == null ? C2848.f9066 : abstractC1665.f5624, (C2581) null, C2582.f8208));
                i39++;
            }
            C0417 c0418 = new C0417(i39);
            for (int i40 = 0; i40 < i39; i40++) {
                c0418.m3166(i40, (AbstractC1663) arrayList.get(i40));
            }
            c0418.f7068 = false;
            C0377 c0377 = new C0377(i3, c0418, c1676M35410, i38);
            int iM4645 = c2656.m4645(c0377.f1869);
            if (iM4645 >= 0) {
                c2656.m4648(iM4645);
            }
            c2656.f8389.add(c0377);
            c1677.m4110();
            c2656.f8390.add(c1677);
        } catch (C2766 e5) {
            abstractC1861.mo3765(e5);
            c1244.m3014(e5);
            throw e5;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m4648(int i) {
        int length = this.f8385 + this.f8382.f2869.f1570.f4833.length + 7;
        ArrayList arrayList = this.f8389;
        C1676 c1676 = ((C0377) arrayList.get(i)).f1871;
        int i2 = c1676.f5648;
        arrayList.remove(i);
        this.f8390.remove(i);
        for (int i3 = 0; i3 < i2; i3++) {
            int iM3548 = c1676.m3548(i3);
            if (iM3548 >= length) {
                int iM4645 = m4645(iM3548);
                if (iM4645 < 0) {
                    throw new RuntimeException("Invalid label ".concat(AbstractC2902.m4906(iM3548)));
                }
                m4648(iM4645);
            }
        }
    }
}
