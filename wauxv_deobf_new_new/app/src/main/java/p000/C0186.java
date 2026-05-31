package p000;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲇᲀᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0186 extends AbstractC2302 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C0182 f1293;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public ArrayList f1294;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f1295;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ArrayList f1296;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m1377(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int hashCode() {
        C0182 c0182 = this.f1293;
        if (c0182 == null) {
            return 0;
        }
        return c0182.hashCode();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2017 c2017 = c1026.f3744;
        C2010 c2010 = c1026.f3752;
        C0182 c0182 = this.f1293;
        if (c0182 != null) {
            this.f1293 = (C0182) c2017.m4049(c0182);
        }
        ArrayList<C1299> arrayList = this.f1294;
        if (arrayList != null) {
            for (C1299 c1299 : arrayList) {
                c1299.getClass();
                c1026.f3751.m3121(c1299.f4722);
                c1299.f4723 = (C0182) c2017.m4049(c1299.f4723);
            }
        }
        ArrayList<C2003> arrayList2 = this.f1295;
        if (arrayList2 != null) {
            for (C2003 c2003 : arrayList2) {
                c2003.getClass();
                c2010.m4009(c2003.f6646);
                c2003.f6647 = (C0182) c2017.m4049(c2003.f6647);
            }
        }
        ArrayList<C2364> arrayList3 = this.f1296;
        if (arrayList3 != null) {
            for (C2364 c2364 : arrayList3) {
                c2364.getClass();
                c2010.m4009(c2364.f7600);
                c2017.m4048(c2364.f7601);
            }
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5775;
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1369(AbstractC2302 abstractC2302) {
        C0182 c0182 = this.f1293;
        if (c0182 == null || this.f1294 != null || this.f1295 != null || this.f1296 != null) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C0182 c0183 = ((C0186) abstractC2302).f1293;
        if (c0182 == c0183) {
            c0182.getClass();
            return 0;
        }
        EnumC1701 enumC1701Mo1368 = c0182.mo1368();
        EnumC1701 enumC1701Mo1369 = c0183.mo1368();
        return enumC1701Mo1368 != enumC1701Mo1369 ? enumC1701Mo1368.compareTo(enumC1701Mo1369) : c0182.mo1369(c0183);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1370(C2017 c2017, int i) {
        m4282(((m1377(this.f1296) + m1377(this.f1295) + m1377(this.f1294)) * 8) + 16);
    }

    @Override // p000.AbstractC2302
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1371(C1026 c1026, C0496 c0496) {
        boolean zM1927 = c0496.m1927();
        C0182 c0182 = this.f1293;
        int iM4279 = c0182 == null ? 0 : c0182.m4279();
        int iM1377 = m1377(this.f1294);
        int iM1378 = m1377(this.f1295);
        int iM1379 = m1377(this.f1296);
        if (zM1927) {
            c0496.m1925(0, m4280() + " annotations directory");
            c0496.m1925(4, "  class_annotations_off: ".concat(AbstractC2902.m4907(iM4279)));
            c0496.m1925(4, "  fields_size:           ".concat(AbstractC2902.m4907(iM1377)));
            c0496.m1925(4, "  methods_size:          ".concat(AbstractC2902.m4907(iM1378)));
            c0496.m1925(4, "  parameters_size:       ".concat(AbstractC2902.m4907(iM1379)));
        }
        c0496.m1933(iM4279);
        c0496.m1933(iM1377);
        c0496.m1933(iM1378);
        c0496.m1933(iM1379);
        if (iM1377 != 0) {
            Collections.sort(this.f1294);
            if (zM1927) {
                c0496.m1925(0, "  fields:");
            }
            for (C1299 c1299 : this.f1294) {
                c1299.getClass();
                C1302 c1302 = c1026.f3751;
                C0898 c0898 = c1299.f4722;
                int iM3120 = c1302.m3120(c0898);
                int iM42710 = c1299.f4723.m4279();
                if (c0496.m1927()) {
                    c0496.m1925(0, "    " + c0898.mo1360());
                    c0496.m1925(4, "      field_idx:       ".concat(AbstractC2902.m4907(iM3120)));
                    c0496.m1925(4, "      annotations_off: ".concat(AbstractC2902.m4907(iM42710)));
                }
                c0496.m1933(iM3120);
                c0496.m1933(iM42710);
            }
        }
        if (iM1378 != 0) {
            Collections.sort(this.f1295);
            if (zM1927) {
                c0496.m1925(0, "  methods:");
            }
            for (C2003 c2003 : this.f1295) {
                c2003.getClass();
                C2010 c2010 = c1026.f3752;
                C0912 c0912 = c2003.f6646;
                int iM4008 = c2010.m4008(c0912);
                int iM42711 = c2003.f6647.m4279();
                if (c0496.m1927()) {
                    c0496.m1925(0, "    " + c0912.mo1360());
                    c0496.m1925(4, "      method_idx:      ".concat(AbstractC2902.m4907(iM4008)));
                    c0496.m1925(4, "      annotations_off: ".concat(AbstractC2902.m4907(iM42711)));
                }
                c0496.m1933(iM4008);
                c0496.m1933(iM42711);
            }
        }
        if (iM1379 != 0) {
            Collections.sort(this.f1296);
            if (zM1927) {
                c0496.m1925(0, "  parameters:");
            }
            for (C2364 c2364 : this.f1296) {
                c2364.getClass();
                C2010 c2011 = c1026.f3752;
                C0912 c0913 = c2364.f7600;
                int iM4009 = c2011.m4008(c0913);
                int iM42712 = c2364.f7601.m4279();
                if (c0496.m1927()) {
                    c0496.m1925(0, "    " + c0913.mo1360());
                    c0496.m1925(4, "      method_idx:      ".concat(AbstractC2902.m4907(iM4009)));
                    c0496.m1925(4, "      annotations_off: ".concat(AbstractC2902.m4907(iM42712)));
                }
                c0496.m1933(iM4009);
                c0496.m1933(iM42712);
            }
        }
    }
}
