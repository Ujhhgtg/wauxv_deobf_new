package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0168 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public List f1197;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public int f1198;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m1218(C0168 c0168, String str) {
        
        C0169 c0169 = new C0169();
        c0169.f1199 = new C2837(str, 5, false);
        c0169.f1200 = 8;
        List arrayList = c0168.f1197;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0168.f1197 = arrayList;
        arrayList.add(c0169);
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int iM3073;
        int iM3074;
        List list = this.f1197;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3472(AbstractC2784.m4735(((C0169) it.next()).f1200)));
            }
            byte[] bArrM3317 = AbstractC1574.m3317(arrayList);
            c1353.m3079(1, bArrM3317.length, 1);
            for (int length = bArrM3317.length - 1; -1 < length; length--) {
                c1353.m3065(bArrM3317[length]);
            }
            iM3073 = c1353.m3073();
        } else {
            iM3073 = 0;
        }
        List list2 = this.f1197;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0746.m2214(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C0169) it2.next()).f1199.mo961(c1353)));
            }
            int[] iArrM2205 = AbstractC0744.m2205(arrayList2);
            c1353.m3079(4, iArrM2205.length, 4);
            for (int length2 = iArrM2205.length - 1; -1 < length2; length2--) {
                c1353.m3067(iArrM2205[length2]);
            }
            iM3074 = c1353.m3073();
        } else {
            iM3074 = 0;
        }
        int i = this.f1198;
        byte b = 1;
        if (i == 1) {
            b = 0;
        } else if (i != 2) {
            throw null;
        }
        c1353.m3078(4);
        c1353.m3068(3, 0);
        c1353.m3068(1, iM3074);
        c1353.m3068(0, iM3073);
        c1353.m3066(b, 2);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }
}
