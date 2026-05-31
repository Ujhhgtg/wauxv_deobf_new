package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲀᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0176 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public List f1265;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public int f1266;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m1364(C0176 c0176, String str) {
        c0176.getClass();
        C0177 c0177 = new C0177();
        c0177.f1267 = new C2897(str, 5, false);
        c0177.f1268 = 8;
        List arrayList = c0176.f1265;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0176.f1265 = arrayList;
        arrayList.add(c0177);
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3176;
        int iM3177;
        List list = this.f1265;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3529(AbstractC2844.m4769(((C0177) it.next()).f1268)));
            }
            byte[] bArrM4238 = AbstractC2236.m4238(arrayList);
            c1353.m3182(1, bArrM4238.length, 1);
            for (int length = bArrM4238.length - 1; -1 < length; length--) {
                c1353.m3168(bArrM4238[length]);
            }
            iM3176 = c1353.m3176();
        } else {
            iM3176 = 0;
        }
        List list2 = this.f1265;
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList(AbstractC0741.m2313(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Integer.valueOf(((C0177) it2.next()).f1267.mo1106(c1353)));
            }
            int[] iArrM2304 = AbstractC0739.m2304(arrayList2);
            c1353.m3182(4, iArrM2304.length, 4);
            for (int length2 = iArrM2304.length - 1; -1 < length2; length2--) {
                c1353.m3170(iArrM2304[length2]);
            }
            iM3177 = c1353.m3176();
        } else {
            iM3177 = 0;
        }
        byte bM2790 = AbstractC1095.m2790(this.f1266);
        c1353.m3181(4);
        c1353.m3171(3, 0);
        c1353.m3171(1, iM3177);
        c1353.m3171(0, iM3176);
        c1353.m3169(bM2790, 2);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }
}
