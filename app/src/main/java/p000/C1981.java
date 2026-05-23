package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1981 extends AbstractC1460 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public C2837 f6557;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C0075 f6558;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0705 f6559;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0705 f6560;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C2328 f6561;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public List f6562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public ArrayList f6563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public C1984 f6564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public C1984 f6565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static void m3817(C1981 c1981, String str) {
        List arrayList = c1981.f6562;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        c1981.f6562 = arrayList;
        arrayList.add(new C2837(str, 1, false));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static void m3818(C1981 c1981, String str) {
        
        C0705 c0705 = new C0705(4);
        c0705.f2683 = new C2837(str, 5, false);
        c1981.f6559 = c0705;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static void m3819(C1981 c1981) {
        
        c1981.f6558 = new C0075(4);
    }

    @Override // p000.AbstractC1460
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final int mo961(C1353 c1353) {
        int iM3071;
        int iM3073;
        int iM3074;
        byte b;
        C2837 c2837 = this.f6557;
        int iMo961 = c2837 != null ? c2837.mo961(c1353) : 0;
        C0075 c0075 = this.f6558;
        int iMo962 = c0075 != null ? c0075.mo961(c1353) : 0;
        C0705 c0705 = this.f6559;
        int iMo963 = c0705 != null ? c0705.mo961(c1353) : 0;
        C0705 c0706 = this.f6560;
        int iMo964 = c0706 != null ? c0706.mo961(c1353) : 0;
        C2328 c2328 = this.f6561;
        int iMo965 = c2328 != null ? c2328.mo961(c1353) : 0;
        List list = this.f6562;
        if (list != null) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((C2837) it.next()).mo961(c1353)));
            }
            iM3071 = c1353.m3071(AbstractC0744.m2205(arrayList));
        } else {
            iM3071 = 0;
        }
        ArrayList arrayList2 = this.f6563;
        if (arrayList2 != null) {
            ArrayList arrayList3 = new ArrayList(AbstractC0746.m2214(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                switch (((C2242) it2.next()).f7262) {
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
                arrayList3.add(new C3472(b));
            }
            byte[] bArrM3317 = AbstractC1574.m3317(arrayList3);
            c1353.m3079(1, bArrM3317.length, 1);
            for (int length = bArrM3317.length - 1; -1 < length; length--) {
                c1353.m3065(bArrM3317[length]);
            }
            iM3073 = c1353.m3073();
        } else {
            iM3073 = 0;
        }
        ArrayList arrayList4 = this.f6563;
        if (arrayList4 != null) {
            ArrayList arrayList5 = new ArrayList(AbstractC0746.m2214(arrayList4, 10));
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                arrayList5.add(Integer.valueOf(((C2242) it3.next()).f7261.mo961(c1353)));
            }
            int[] iArrM2205 = AbstractC0744.m2205(arrayList5);
            c1353.m3079(4, iArrM2205.length, 4);
            for (int length2 = iArrM2205.length - 1; -1 < length2; length2--) {
                c1353.m3067(iArrM2205[length2]);
            }
            iM3074 = c1353.m3073();
        } else {
            iM3074 = 0;
        }
        C1984 c1984 = this.f6564;
        int iMo966 = c1984 != null ? c1984.mo961(c1353) : 0;
        C1984 c1985 = this.f6565;
        int iMo967 = c1985 != null ? c1985.mo961(c1353) : 0;
        c1353.m3078(17);
        c1353.m3068(16, 0);
        c1353.m3068(15, 0);
        c1353.m3068(14, 0);
        c1353.m3068(13, 0);
        c1353.m3068(12, iMo967);
        c1353.m3068(11, iMo966);
        c1353.m3068(10, iM3074);
        c1353.m3068(9, iM3073);
        c1353.m3068(8, 0);
        c1353.m3068(7, iM3071);
        c1353.m3068(6, 0);
        c1353.m3068(5, 0);
        c1353.m3068(4, iMo965);
        c1353.m3068(3, iMo964);
        c1353.m3068(2, iMo963);
        c1353.m3068(1, iMo962);
        c1353.m3068(0, iMo961);
        int iM3072 = c1353.m3072();
        c1353.m3074(iM3072);
        return iM3072;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final void m3820(Class cls) {
        C0705 c0705 = new C0705(4);
        C0705.m2124(c0705, AbstractC1028.m2601(cls));
        this.f6559 = c0705;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ, reason: contains not printable characters */
    public final void m3821(int i) {
        if (this.f6561 == null) {
            this.f6561 = new C2328(4);
        }
        C2328 c2328 = this.f6561;
        
        c2328.f7470 = new C1663(i);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public final void m3822(C1664 c1664) {
        if (this.f6561 == null) {
            this.f6561 = new C2328(4);
        }
        C2328 c2328 = this.f6561;
        
        C1663 c1663 = new C1663(4);
        c1663.f5619 = c1664.f5612;
        c1663.f5620 = c1664.f5613;
        c2328.f7470 = c1663;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void paramTypes(Class... clsArr) {
        C2325 c2325;
        C2328 c2328 = new C2328(4);
        c2328.f7469 = new ArrayList(C1189.f4329);
        for (Class cls : clsArr) {
            if (cls != null) {
                c2325 = new C2325(4);
                C0705 c0705 = new C0705(4);
                C0705.m2124(c0705, AbstractC1028.m2601(cls));
                c2325.f7464 = c0705;
            } else {
                c2325 = null;
            }
            List arrayList = c2328.f7469;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            c2328.f7469 = arrayList;
            arrayList.add(c2325);
        }
        this.f6561 = c2328;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3824(Class cls) {
        C0705 c0705 = new C0705(4);
        C0705.m2124(c0705, AbstractC1028.m2601(cls));
        this.f6560 = c0705;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final /* synthetic */ void m3825(String str) {
        m3818(this, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public final void m3826(String str) {
        this.f6557 = new C2837(str, 5, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final void m3827(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2837(str, 5, false));
        }
        this.f6562 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final void usingNumbers(Number... numberArr) {
        ArrayList arrayList = new ArrayList(numberArr.length);
        for (Number number : numberArr) {
            C2242 c2242 = new C2242();
            if (number instanceof Byte) {
                c2242.f7261 = new C1196(number.byteValue());
                c2242.f7262 = 1;
            } else if (number instanceof Short) {
                c2242.f7261 = new C1201(number.shortValue());
                c2242.f7262 = 2;
            } else if (number instanceof Integer) {
                c2242.f7261 = new C1199(number.intValue());
                c2242.f7262 = 3;
            } else if (number instanceof Long) {
                c2242.f7261 = new C1200(number.longValue());
                c2242.f7262 = 4;
            } else if (number instanceof Float) {
                c2242.f7261 = new C1198(number.floatValue());
                c2242.f7262 = 5;
            } else if (number instanceof Double) {
                c2242.f7261 = new C1197(number.doubleValue());
                c2242.f7262 = 6;
            }
            arrayList.add(c2242);
        }
        this.f6563 = new ArrayList(arrayList);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲈᤞᲁᲇ, reason: contains not printable characters */
    public final void m3829(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(new C2837(str, 1, false));
        }
        this.f6562 = new ArrayList(arrayList);
    }
}
