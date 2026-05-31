package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲁᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0695 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0917 f2656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final ArrayList f2657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final HashMap f2658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f2659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f2660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ArrayList f2661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public C0889 f2662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public byte[] f2663;

    public C0695(C0917 c0917) {
        super(1, -1);
        if (c0917 == null) {
            throw new NullPointerException("thisClass == null");
        }
        this.f2656 = c0917;
        this.f2657 = new ArrayList(20);
        this.f2658 = new HashMap(40);
        this.f2659 = new ArrayList(20);
        this.f2660 = new ArrayList(20);
        this.f2661 = new ArrayList(20);
        this.f2662 = null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static void m2211(C1026 c1026, C0496 c0496, String str, ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        if (c0496.m1927()) {
            c0496.m1925(0, "  " + str + ":");
        }
        int iMo2917 = 0;
        for (int i = 0; i < size; i++) {
            iMo2917 = ((AbstractC1205) arrayList.get(i)).mo2917(c1026, c0496, iMo2917, i);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static void m2212(C0496 c0496, String str, int i) {
        if (c0496.m1927()) {
            c0496.m1926(String.format("  %-21s %08x", str.concat("_size:"), Integer.valueOf(i)));
        }
        c0496.m1936(i);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        ArrayList<C1204> arrayList = this.f2657;
        if (!arrayList.isEmpty()) {
            m2214();
            for (C1204 c1204 : arrayList) {
                c1204.getClass();
                c1026.f3751.m3121(c1204.f4339);
            }
        }
        ArrayList<C1204> arrayList2 = this.f2659;
        if (!arrayList2.isEmpty()) {
            Collections.sort(arrayList2);
            for (C1204 c1205 : arrayList2) {
                c1205.getClass();
                c1026.f3751.m3121(c1205.f4339);
            }
        }
        ArrayList<C1206> arrayList3 = this.f2660;
        if (!arrayList3.isEmpty()) {
            Collections.sort(arrayList3);
            for (C1206 c1206 : arrayList3) {
                c1206.getClass();
                C2010 c2010 = c1026.f3752;
                C2017 c2017 = c1026.f3744;
                c2010.m4009(c1206.f4341);
                C0731 c0731 = c1206.f4342;
                if (c0731 != null) {
                    c2017.m4048(c0731);
                }
            }
        }
        ArrayList<C1206> arrayList4 = this.f2661;
        if (arrayList4.isEmpty()) {
            return;
        }
        Collections.sort(arrayList4);
        for (C1206 c1207 : arrayList4) {
            c1207.getClass();
            C2010 c2011 = c1026.f3752;
            C2017 c2018 = c1026.f3744;
            c2011.m4009(c1207.f4341);
            C0731 c0732 = c1207.f4342;
            if (c0732 != null) {
                c2018.m4048(c0732);
            }
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5769;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        C0496 c0496 = new C0496();
        m2213(c2017.f8699, c0496);
        byte[] bArrM1930 = c0496.m1930();
        this.f2663 = bArrM1930;
        m4282(bArrM1930.length);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        if (c0496.m1927()) {
            m2213(c1026, c0496);
        } else {
            c0496.m1931(this.f2663);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final void m2213(C1026 c1026, C0496 c0496) {
        boolean zM1927 = c0496.m1927();
        if (zM1927) {
            c0496.m1925(0, m4280() + " class data for " + this.f2656.f3408.mo1360());
        }
        ArrayList arrayList = this.f2657;
        m2212(c0496, "static_fields", arrayList.size());
        ArrayList arrayList2 = this.f2659;
        m2212(c0496, "instance_fields", arrayList2.size());
        ArrayList arrayList3 = this.f2660;
        m2212(c0496, "direct_methods", arrayList3.size());
        ArrayList arrayList4 = this.f2661;
        m2212(c0496, "virtual_methods", arrayList4.size());
        m2211(c1026, c0496, "static_fields", arrayList);
        m2211(c1026, c0496, "instance_fields", arrayList2);
        m2211(c1026, c0496, "direct_methods", arrayList3);
        m2211(c1026, c0496, "virtual_methods", arrayList4);
        if (zM1927) {
            c0496.m1928();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C0889 m2214() {
        HashMap map;
        C0889 c0889;
        if (this.f2662 == null) {
            ArrayList arrayList = this.f2657;
            if (arrayList.size() != 0) {
                Collections.sort(arrayList);
                int size = arrayList.size();
                while (true) {
                    map = this.f2658;
                    if (size <= 0) {
                        break;
                    }
                    AbstractC0775 abstractC0775 = (AbstractC0775) map.get((C1204) arrayList.get(size - 1));
                    if (abstractC0775 instanceof AbstractC0908) {
                        if (((AbstractC0908) abstractC0775).mo2542() != 0) {
                            break;
                        }
                        size--;
                    } else {
                        if (abstractC0775 != null) {
                            break;
                        }
                        size--;
                    }
                }
                if (size == 0) {
                    c0889 = null;
                } else {
                    C0888 c0888 = new C0888(size);
                    for (int i = 0; i < size; i++) {
                        C1204 c1204 = (C1204) arrayList.get(i);
                        Object objM2286 = (AbstractC0775) map.get(c1204);
                        if (objM2286 == null) {
                            objM2286 = AbstractC0738.m2286(c1204.f4339.f3376.m2545());
                        }
                        c0888.m3166(i, objM2286);
                    }
                    c0888.f7068 = false;
                    c0889 = new C0889(c0888);
                }
                this.f2662 = c0889;
            }
        }
        return this.f2662;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m2215() {
        return this.f2657.isEmpty() && this.f2659.isEmpty() && this.f2660.isEmpty() && this.f2661.isEmpty();
    }
}
