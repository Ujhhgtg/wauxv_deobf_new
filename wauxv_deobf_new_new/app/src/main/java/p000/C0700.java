package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲇᲁᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0700 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2897 f2677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0175 f2678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0188 f2679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1318 f2680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2015 f2681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public List f2682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m2216(C0700 c0700, String str) {
        C0175 c0175 = c0700.f2678;
        if (c0175 == null) {
            c0175 = new C0175(1);
        }
        c0700.f2678 = c0175;
        C0700 c0701 = new C0700();
        c0701.f2677 = new C2897(str, 5, false);
        List arrayList = c0175.f1264;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c0175.f1264 = arrayList;
        arrayList.add(c0701);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m2217(C0700 c0700, String str) {
        c0700.f2677 = new C2897(str, 5, false);
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        C2897 c2897 = this.f2677;
        int iMo1106 = c2897 != null ? c2897.mo1106(c1353) : 0;
        C0175 c0175 = this.f2678;
        int iMo1107 = c0175 != null ? c0175.mo1106(c1353) : 0;
        C0188 c0188 = this.f2679;
        int iMo1108 = c0188 != null ? c0188.mo1106(c1353) : 0;
        C1318 c1318 = this.f2680;
        int iMo1109 = c1318 != null ? c1318.mo1106(c1353) : 0;
        C2015 c2015 = this.f2681;
        int iMo11010 = c2015 != null ? c2015.mo1106(c1353) : 0;
        List list = this.f2682;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2897) it.next()).mo1106(c1353)));
            }
            iM3174 = c1353.m3174(AbstractC0739.m2304(arrayList));
        } else {
            iM3174 = 0;
        }
        c1353.m3181(12);
        c1353.m3171(11, 0);
        c1353.m3171(10, 0);
        c1353.m3171(9, 0);
        c1353.m3171(8, iM3174);
        c1353.m3171(7, iMo11010);
        c1353.m3171(6, iMo1109);
        c1353.m3171(5, iMo1108);
        c1353.m3171(4, iMo1107);
        c1353.m3171(3, 0);
        c1353.m3171(2, 0);
        c1353.m3171(1, iMo1106);
        c1353.m3171(0, 0);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m2218(InterfaceC1433 interfaceC1433) {
        C1318 c1318 = new C1318();
        interfaceC1433.invoke(c1318);
        this.f2680 = c1318;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public final void m2219(InterfaceC1433 interfaceC1433) {
        C2015 c2015 = new C2015();
        interfaceC1433.invoke(c2015);
        this.f2681 = c2015;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m2220(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2897(str, 5, false));
        }
        this.f2682 = new ArrayList(arrayList);
    }
}
