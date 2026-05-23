package p000;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤝᛸᲇᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2595 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f8223 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final BitSet f8224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public int f8225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public int f8226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0403 f8227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList f8228;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C2596 f8229;

    public C2595(C2596 c2596, C0403 c0403, ArrayList arrayList) {
        this.f8229 = c2596;
        this.f8224 = new BitSet(c2596.f8233);
        this.f8227 = c0403;
        this.f8228 = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᛸᲈᲇᲀ] */
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
    public final void m4603(C0402 c0402) {
        int i;
        C0662 c0662;
        C1660 c1660;
        int i2;
        ?? r4;
        C1660 c1661 = c0402.f1899;
        int i3 = c0402.f1897;
        ?? r5 = 0;
        this.f8226 = c1661.m3384(0);
        int i4 = 1;
        int iM3384 = c0402.f1899.m3384(1);
        this.f8225 = iM3384;
        int iM4604 = m4604(iM3384);
        BitSet bitSet = this.f8224;
        int iNextSetBit = bitSet.nextSetBit(0);
        while (true) {
            ArrayList arrayList = this.f8228;
            C2596 c2596 = this.f8229;
            if (iNextSetBit < 0) {
                int i5 = iM4604;
                C0402 c0403 = new C0402(i3, c0402.f1898, C1660.m3381(i5), i5);
                C1660 c1662 = (C1660) arrayList.get(i3);
                ArrayList arrayList2 = c2596.f8238;
                ArrayList arrayList3 = c2596.f8237;
                int iM4615 = c2596.m4615(c0403.f1897);
                if (iM4615 >= 0) {
                    arrayList3.remove(iM4615);
                    arrayList2.remove(iM4615);
                }
                arrayList3.add(c0403);
                c1662.m3926();
                arrayList2.add(c1662);
                return;
            }
            bitSet.clear(iNextSetBit);
            int iIntValue = ((Integer) this.f8223.get(Integer.valueOf(iNextSetBit))).intValue();
            C0402 c0402M4614 = c2596.m4614(iNextSetBit);
            ?? r12 = c0402M4614.f1899;
            if (c2596.m4612(c0402M4614)) {
                int iM4605 = m4604(r12.m3384(r5));
                int iM3385 = r12.m3384(i4);
                i = i4;
                c1660 = new C1660(2);
                c1660.m3382(iM4605);
                c1660.m3382(iM3385);
                c1660.f6944 = r5;
                i2 = -1;
            } else {
                i = i4;
                C0662[] c0662Arr = c2596.f8241;
                int length = c0662Arr.length - 1;
                while (true) {
                    if (length >= 0) {
                        c0662 = c0662Arr[length];
                        if (c0662 != null && ((BitSet) c0662.f2531).get(iNextSetBit)) {
                            break;
                        } else {
                            length--;
                        }
                    } else {
                        c0662 = null;
                        break;
                    }
                }
                if (c0662 != null) {
                    int i6 = c0662.f2529;
                    if (i6 != this.f8225) {
                        throw new RuntimeException("ret instruction returns to label " + AbstractC1460.m3223(i6) + " expected: " + AbstractC1460.m3223(this.f8225));
                    }
                    c1660 = C1660.m3381(this.f8226);
                    i2 = this.f8226;
                } else {
                    int i7 = c0402M4614.f1900;
                    int i8 = r12.f5610;
                    c1660 = new C1660(i8);
                    i2 = -1;
                    while (r4 < i8) {
                        int i9 = i8;
                        int iM3386 = r12.m3384(r4);
                        ?? r18 = r4;
                        int iM4606 = m4604(iM3386);
                        c1660.m3382(iM4606);
                        if (i7 == iM3386) {
                            r4 = r5;
                            i2 = iM4606;
                        } else {
                            r4 = r5;
                        }
                        i8 = i9;
                        r4 = (r18 == true ? 1 : 0) + 1;
                    }
                    r4 = r5;
                    c1660.f6944 = false;
                }
            }
            C0442 c0442 = c0402M4614.f1898;
            int length2 = c0442.f4836.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length2) {
                int i12 = i10;
                int i13 = iM4604;
                if (((AbstractC1649) c0442.m3062(i10)).f5588 != AbstractC2598.f8267) {
                    i11++;
                }
                i10 = i12 + 1;
                iM4604 = i13;
            }
            int i14 = iM4604;
            if (i11 != length2) {
                C0442 c0443 = new C0442(i11);
                int i15 = 0;
                int i16 = 0;
                while (i15 < length2) {
                    C0442 c0444 = c0442;
                    AbstractC1649 abstractC1649 = (AbstractC1649) c0442.m3062(i15);
                    int i17 = length2;
                    int i18 = i15;
                    if (abstractC1649.f5588 != AbstractC2598.f8267) {
                        c0443.m3063(i16, abstractC1649);
                        i16++;
                    }
                    i15 = i18 + 1;
                    length2 = i17;
                    c0442 = c0444;
                }
                c0443.f6944 = false;
                c0442 = c0443;
            }
            c2596.m4606(new C0402(iIntValue, c0442, c1660, i2), (C1660) arrayList.get(iIntValue));
            if (c2596.m4612(c2596.m4614(iNextSetBit))) {
                new C2595(c2596, this.f8227, arrayList).m4603(c2596.m4614(iIntValue));
            }
            r5 = 0;
            iNextSetBit = bitSet.nextSetBit(0);
            i4 = i;
            iM4604 = i14;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final int m4604(int i) {
        int i2;
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = this.f8223;
        Integer num = (Integer) map.get(numValueOf);
        if (num != null) {
            return num.intValue();
        }
        int i3 = this.f8225;
        ArrayList arrayList = this.f8228;
        C1660 c1660 = (C1660) arrayList.get(i);
        if (c1660 == null || (i2 = c1660.f5610) <= 0 || c1660.m3384(i2 - 1) != i3) {
            return i;
        }
        int iMo1594 = this.f8227.mo1594();
        this.f8224.set(i);
        map.put(Integer.valueOf(i), Integer.valueOf(iMo1594));
        while (arrayList.size() <= iMo1594) {
            arrayList.add(null);
        }
        arrayList.set(iMo1594, (C1660) arrayList.get(i));
        return iMo1594;
    }
}
