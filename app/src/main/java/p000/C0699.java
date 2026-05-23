package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0699 extends AbstractC2270 {

    public final C0918 f2655;

    public final ArrayList f2656;

    public final HashMap f2657;

    public final ArrayList f2658;

    public final ArrayList f2659;

    public final ArrayList f2660;

    public C0890 f2661;

    public byte[] f2662;

    public C0699(C0918 c0918) {
        super(1, -1);
        if (c0918 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f2655 = c0918;
        this.f2656 = new ArrayList(20);
        this.f2657 = new HashMap(40);
        this.f2658 = new ArrayList(20);
        this.f2659 = new ArrayList(20);
        this.f2660 = new ArrayList(20);
        this.f2661 = null;
    }

    public static void m2116(C1023 c1023, C0519 c0519, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c0519.m1833()) {
            c0519.m1831(0, "  " + str + ":");
        }
        int iMo2795 = 0;
        for (int i = 0; i < size; i++) {
            iMo2795 = ((AbstractC1204) arrayList.get(i)).mo2795(c1023, c0519, iMo2795, i);
        }
    }

    public static void m2117(C0519 c0519, String str, int i) {
        if (c0519.m1833()) {
            c0519.m1832(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c0519.m1842(i);
    }

    @Override // p000.AbstractC1675
    public final void mo1221(C1023 c1023) {
        ArrayList<C1203> arrayList = this.f2656;
        if (!arrayList.isEmpty()) {
            m2119();
            for (C1203 c1203 : arrayList) {
                
                c1023.f3744.m3018(c1203.f4342);
            }
        }
        ArrayList<C1203> arrayList2 = this.f2658;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (C1203 c1204 : arrayList2) {
                
                c1023.f3744.m3018(c1204.f4342);
            }
        }
        ArrayList<C1205> arrayList3 = this.f2659;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (C1205 c1205 : arrayList3) {
                
                C1979 c1979 = c1023.f3745;
                C1986 c1986 = c1023.f3737;
                c1979.m3815(c1205.f4344);
                C0736 c0736 = c1205.f4345;
                if (c0736 != null) {
                    c1986.m3854(c0736);
                }
            }
        }
        ArrayList<C1205> arrayList4 = this.f2660;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (C1205 c1206 : arrayList4) {
            
            C1979 c19710 = c1023.f3745;
            C1986 c1987 = c1023.f3737;
            c19710.m3815(c1206.f4344);
            C0736 c0737 = c1206.f4345;
            if (c0737 != null) {
                c1987.m3854(c0737);
            }
        }
    }

    @Override // p000.AbstractC1675
    public final EnumC1683 mo1222() {
        return EnumC1683.f5726;
    }

    @Override // p000.AbstractC2270
    public final void mo1224(C1986 c1986, int i) {
        C0519 c0519 = new C0519();
        m2118(c1986.f8534, c0519);
        byte[] bArrM1836 = c0519.m1836();
        this.f2662 = bArrM1836;
        m4153(bArrM1836.length);
    }

    @Override // p000.AbstractC2270
    public final void mo1225(C1023 c1023, C0519 c0519) {
        if (c0519.m1833()) {
            m2118(c1023, c0519);
        } else {
            c0519.m1837(this.f2662);
        }
    }

    public final void m2118(C1023 c1023, C0519 c0519) {
        boolean zM1833 = c0519.m1833();
        if (zM1833) {
            c0519.m1831(0, m4151() + " class data for " + this.f2655.f3401.mo1214());
        }
        ArrayList arrayList = this.f2656;
        m2117(c0519, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f2658;
        m2117(c0519, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f2659;
        m2117(c0519, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f2660;
        m2117(c0519, "virtual_methods", arrayList4.size());
        m2116(c1023, c0519, "static_fields", arrayList);
        m2116(c1023, c0519, "instance_fields", arrayList2);
        m2116(c1023, c0519, "direct_methods", arrayList3);
        m2116(c1023, c0519, "virtual_methods", arrayList4);
        if (zM1833) {
            c0519.m1834();
        }
    }

    public final C0890 m2119() {
        HashMap map;
        C0890 c0890;
        if (this.f2661 == null) {
            ArrayList arrayList = this.f2656;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f2657;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC0777 abstractC0777 = (AbstractC0777) map.get((C1203) arrayList.get(size - 1));
                    if (abstractC0777 instanceof AbstractC0909) {
                        if (((AbstractC0909) abstractC0777).mo2425() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC0777 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c0890 = null;
                } else {
                    C0889 c0889 = new C0889(size);
                    for (int i = 0; i < size; i++) {
                        C1203 c1203 = (C1203) arrayList.get(i);
                        Object objM5091 = (AbstractC0777) map.get(c1203);
                        if (objM5091 == null) {
                            objM5091 = AbstractC3471.m5091(c1203.f4342.f3369.m2428());
                        }
                        c0889.m3063(i, objM5091);
                    }
                    c0889.f6944 = false;
                    c0890 = new C0890(c0889);
                }
                this.f2661 = c0890;
            }
        }
        return this.f2661;
    }

    public final boolean m2120() {
        return this.f2656.isEmpty() && this.f2658.isEmpty() && this.f2659.isEmpty() && this.f2660.isEmpty();
    }
}
