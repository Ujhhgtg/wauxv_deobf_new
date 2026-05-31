package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2012 extends AbstractC0972 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C2897 f6662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C0083 f6663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0700 f6664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0700 f6665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C2368 f6666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public List f6667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public ArrayList f6668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public C2015 f6669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C2015 f6670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static void m4011(C2012 c2012, String str) {
        List arrayList = c2012.f6667;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c2012.f6667 = arrayList;
        arrayList.add(new C2897(str, 1, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static void m4012(C2012 c2012, String str) {
        c2012.getClass();
        C0700 c0700 = new C0700();
        c0700.f2677 = new C2897(str, 5, false);
        c2012.f6664 = c0700;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m4013(C2012 c2012) {
        c2012.getClass();
        C0083 c0083 = new C0083((byte) 0, 0);
        c0083.f1085 = 8;
        c0083.f1086 = 1;
        c2012.f6663 = c0083;
    }

    @Override // p000.AbstractC0972
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo1106(C1353 c1353) {
        int iM3174;
        int iM3176;
        int iM3177;
        byte b;
        C2897 c2897 = this.f6662;
        int iMo1106 = c2897 != null ? c2897.mo1106(c1353) : 0;
        C0083 c0083 = this.f6663;
        int iMo1107 = c0083 != null ? c0083.mo1106(c1353) : 0;
        C0700 c0700 = this.f6664;
        int iMo1108 = c0700 != null ? c0700.mo1106(c1353) : 0;
        C0700 c0701 = this.f6665;
        int iMo1109 = c0701 != null ? c0701.mo1106(c1353) : 0;
        C2368 c2368 = this.f6666;
        int iMo11010 = c2368 != null ? c2368.mo1106(c1353) : 0;
        List list = this.f6667;
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
        ArrayList arrayList2 = this.f6668;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0741.m2313(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                switch (((C2273) it2.next()).f7382) {
                    case 1:
                        b = 1;
                        break;
                    case 2:
                        b = 2;
                        break;
                    case 3:
                        b = 3;
                        break;
                    case 4:
                        b = 4;
                        break;
                    case 5:
                        b = 5;
                        break;
                    case 6:
                        b = 6;
                        break;
                    default:
                        throw null;
                }
                arrayList3.add(new C3529(b));
            }
            byte[] bArrM4238 = AbstractC2236.m4238(arrayList3);
            c1353.m3182(1, bArrM4238.length, 1);
            for (int length = bArrM4238.length - 1; -1 < length; length--) {
                c1353.m3168(bArrM4238[length]);
            }
            iM3176 = c1353.m3176();
        } else {
            iM3176 = 0;
        }
        ArrayList arrayList4 = this.f6668;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0741.m2313(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Integer.valueOf(((C2273) it3.next()).f7381.mo1106(c1353)));
            }
            int[] iArrM2304 = AbstractC0739.m2304(arrayList5);
            c1353.m3182(4, iArrM2304.length, 4);
            for (int length2 = iArrM2304.length - 1; -1 < length2; length2--) {
                c1353.m3170(iArrM2304[length2]);
            }
            iM3177 = c1353.m3176();
        } else {
            iM3177 = 0;
        }
        C2015 c2015 = this.f6669;
        int iMo11011 = c2015 != null ? c2015.mo1106(c1353) : 0;
        C2015 c2016 = this.f6670;
        int iMo11012 = c2016 != null ? c2016.mo1106(c1353) : 0;
        c1353.m3181(17);
        c1353.m3171(16, 0);
        c1353.m3171(15, 0);
        c1353.m3171(14, 0);
        c1353.m3171(13, 0);
        c1353.m3171(12, iMo11012);
        c1353.m3171(11, iMo11011);
        c1353.m3171(10, iM3177);
        c1353.m3171(9, iM3176);
        c1353.m3171(8, 0);
        c1353.m3171(7, iM3174);
        c1353.m3171(6, 0);
        c1353.m3171(5, 0);
        c1353.m3171(4, iMo11010);
        c1353.m3171(3, iMo1109);
        c1353.m3171(2, iMo1108);
        c1353.m3171(1, iMo1107);
        c1353.m3171(0, iMo1106);
        int iM3175 = c1353.m3175();
        c1353.m3177(iM3175);
        return iM3175;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public final void m4014(Class cls) {
        C0700 c0700 = new C0700();
        C0700.m2217(c0700, AbstractC1031.m2725(cls));
        this.f6664 = c0700;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m4015(int i) {
        if (this.f6666 == null) {
            this.f6666 = new C2368();
        }
        C2368 c2368 = this.f6666;
        c2368.getClass();
        c2368.f7608 = new C0083(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m4016(C1679 c1679) {
        if (this.f6666 == null) {
            this.f6666 = new C2368();
        }
        C2368 c2368 = this.f6666;
        c2368.getClass();
        C0083 c0083 = new C0083((byte) 0, 1);
        c0083.f1085 = c1679.f5650;
        c0083.f1086 = c1679.f5651;
        c2368.f7608 = c0083;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m4017(Class... clsArr) {
        C2365 c2365;
        C2368 c2368 = new C2368();
        c2368.f7607 = new ArrayList(C1191.f4326);
        for (Class cls : clsArr) {
            if (cls != null) {
                c2365 = new C2365();
                C0700 c0700 = new C0700();
                C0700.m2217(c0700, AbstractC1031.m2725(cls));
                c2365.f7602 = c0700;
            } else {
                c2365 = null;
            }
            List arrayList = c2368.f7607;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c2368.f7607 = arrayList;
            arrayList.add(c2365);
        }
        this.f6666 = c2368;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m4018(Class cls) {
        C0700 c0700 = new C0700();
        C0700.m2217(c0700, AbstractC1031.m2725(cls));
        this.f6665 = c0700;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ void m4019(String str) {
        m4012(this, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final void m4020(String str) {
        this.f6662 = new C2897(str, 5, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m4021(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2897(str, 5, false));
        }
        this.f6667 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m4022(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            C2273 c2273 = new C2273();
            if (number instanceof Byte) {
                c2273.f7381 = new C1197(number.byteValue());
                c2273.f7382 = 1;
            } else if (number instanceof Short) {
                c2273.f7381 = new C1202(number.shortValue());
                c2273.f7382 = 2;
            } else if (number instanceof Integer) {
                c2273.f7381 = new C1200(number.intValue());
                c2273.f7382 = 3;
            } else if (number instanceof Long) {
                c2273.f7381 = new C1201(number.longValue());
                c2273.f7382 = 4;
            } else if (number instanceof Float) {
                c2273.f7381 = new C1199(number.floatValue());
                c2273.f7382 = 5;
            } else if (number instanceof Double) {
                c2273.f7381 = new C1198(number.doubleValue());
                c2273.f7382 = 6;
            }
            arrayList.add(c2273);
        }
        this.f6668 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void m4023(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2897(str, 1, false));
        }
        this.f6667 = new ArrayList(arrayList);
    }
}
