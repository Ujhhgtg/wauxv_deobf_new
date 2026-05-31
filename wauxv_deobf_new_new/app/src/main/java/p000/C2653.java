package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲇᛸᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2653 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f8375 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final BitSet f8376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0378 f8379;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f8380;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2654 f8381;

    public C2653(C2654 c2654, C0378 c0378, ArrayList arrayList) {
        this.f8381 = c2654;
        this.f8376 = new BitSet(c2654.f8385);
        this.f8379 = c0378;
        this.f8380 = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᲀᛸᲈ] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v4, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9 */
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
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m4633(C0377 c0377) {
        int i;
        C0776 c0776;
        C1676 c1676;
        int i2;
        ?? r4;
        C1676 c1677 = c0377.f1871;
        int i3 = c0377.f1869;
        ?? r5 = 0;
        this.f8378 = c1677.m3548(0);
        int i4 = 1;
        int iM3548 = c0377.f1871.m3548(1);
        this.f8377 = iM3548;
        int iM4634 = m4634(iM3548);
        BitSet bitSet = this.f8376;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f8380;
            C2654 c2654 = this.f8381;
            if (iNextSetBit < 0) {
                int i5 = iM4634;
                C0377 c0378 = new C0377(i3, c0377.f1870, C1676.m3545(i5), i5);
                C1676 c1678 = (C1676) arrayList.get(i3);
                ArrayList arrayList2 = c2654.f8390;
                ArrayList arrayList3 = c2654.f8389;
                int iM4645 = c2654.m4645(c0378.f1869);
                if (iM4645 >= 0) {
                    arrayList3.remove(iM4645);
                    arrayList2.remove(iM4645);
                }
                arrayList3.add(c0378);
                c1678.m4110();
                arrayList2.add(c1678);
                return;
            }
            bitSet.clear(iNextSetBit);
            int iIntValue = ((Integer) this.f8375.get(Integer.valueOf(iNextSetBit))).intValue();
            C0377 c0377M4644 = c2654.m4644(iNextSetBit);
            ?? r12 = c0377M4644.f1871;
            if (c2654.m4642(c0377M4644)) {
                int iM4635 = m4634(r12.m3548(r5));
                int iM3549 = r12.m3548(i4);
                i = i4;
                c1676 = new C1676(2);
                c1676.m3546(iM4635);
                c1676.m3546(iM3549);
                c1676.f7068 = r5;
                i2 = -1;
            } else {
                i = i4;
                C0776[] c0776Arr = c2654.f8393;
                int length = c0776Arr.length - 1;
                while (true) {
                    if (length >= 0) {
                        c0776 = c0776Arr[length];
                        if (c0776 != null && ((BitSet) c0776.f2880).get(iNextSetBit)) {
                            break;
                        } else {
                            length--;
                        }
                    } else {
                        c0776 = null;
                        break;
                    }
                }
                if (c0776 != null) {
                    int i6 = c0776.f2878;
                    if (i6 != this.f8377) {
                        throw new RuntimeException("ret instruction returns to label " + AbstractC2902.m4906(i6) + " expected: " + AbstractC2902.m4906(this.f8377));
                    }
                    c1676 = C1676.m3545(this.f8378);
                    i2 = this.f8378;
                } else {
                    int i7 = c0377M4644.f1872;
                    int i8 = r12.f5648;
                    c1676 = new C1676(i8);
                    i2 = -1;
                    while (r4 < i8) {
                        int i9 = i8;
                        int iM35410 = r12.m3548(r4);
                        ?? r18 = r4;
                        int iM4636 = m4634(iM35410);
                        c1676.m3546(iM4636);
                        if (i7 == iM35410) {
                            r4 = r5;
                            i2 = iM4636;
                        } else {
                            r4 = r5;
                        }
                        i8 = i9;
                        r4 = (r18 == true ? 1 : 0) + 1;
                    }
                    r4 = r5;
                    c1676.f7068 = false;
                }
            }
            C0417 c0417 = c0377M4644.f1870;
            int length2 = c0417.f4833.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length2) {
                int i12 = i10;
                int i13 = iM4634;
                if (((AbstractC1663) c0417.m3165(i10)).f5623 != AbstractC2656.f8419) {
                    i11++;
                }
                i10 = i12 + 1;
                iM4634 = i13;
            }
            int i14 = iM4634;
            if (i11 != length2) {
                C0417 c0418 = new C0417(i11);
                int i15 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    C0417 c0419 = c0417;
                    AbstractC1663 abstractC1663 = (AbstractC1663) c0417.m3165(i15);
                    int i17 = length2;
                    int i18 = i15;
                    if (abstractC1663.f5623 != AbstractC2656.f8419) {
                        c0418.m3166(i16, abstractC1663);
                        i16++;
                    }
                    i15 = i18 + 1;
                    length2 = i17;
                    c0417 = c0419;
                }
                c0418.f7068 = false;
                c0417 = c0418;
            }
            c2654.m4636(new C0377(iIntValue, c0417, c1676, i2), (C1676) arrayList.get(iIntValue));
            if (c2654.m4642(c2654.m4644(iNextSetBit))) {
                new C2653(c2654, this.f8379, arrayList).m4633(c2654.m4644(iIntValue));
            }
            r5 = 0;
            iNextSetBit = bitSet.nextSetBit(0);
            i4 = i;
            iM4634 = i14;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4634(int i) {
        int i2;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f8375;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i3 = this.f8377;
        ArrayList arrayList = this.f8380;
        C1676 c1676 = (C1676) arrayList.get(i);
        if (c1676 == null || (i2 = c1676.f5648) <= 0 || c1676.m3548(i2 - 1) != i3) {
            return i;
        }
        int iMo1700 = this.f8379.mo1700();
        this.f8376.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo1700));
        while (arrayList.size() <= iMo1700) {
            arrayList.add(null);
        }
        arrayList.set(iMo1700, (C1676) arrayList.get(i));
        return iMo1700;
    }
}
