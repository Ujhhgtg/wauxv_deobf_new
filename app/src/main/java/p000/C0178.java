package p000;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᤝᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0178 extends AbstractC2270 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C0174 f1225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public ArrayList f1226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public ArrayList f1227;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public ArrayList f1228;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int m1231(ArrayList arrayList) {
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final int hashCode() {
        C0174 c0174 = this.f1225;
        if (c0174 == null) {
            return 0;
        }
        return c0174.hashCode();
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C1986 c1986 = c1023.f3737;
        C1979 c1979 = c1023.f3745;
        C0174 c0174 = this.f1225;
        if (c0174 != null) {
            this.f1225 = (C0174) c1986.m3855(c0174);
        }
        ArrayList<C1298> arrayList = this.f1226;
        if (arrayList != null) {
            for (C1298 c1298 : arrayList) {
                c1298.getClass();
                c1023.f3744.m3018(c1298.f4723);
                c1298.f4724 = (C0174) c1986.m3855(c1298.f4724);
            }
        }
        ArrayList<C1972> arrayList2 = this.f1227;
        if (arrayList2 != null) {
            for (C1972 c1972 : arrayList2) {
                c1972.getClass();
                c1979.m3815(c1972.f6541);
                c1972.f6542 = (C0174) c1986.m3855(c1972.f6542);
            }
        }
        ArrayList<C2324> arrayList3 = this.f1228;
        if (arrayList3 != null) {
            for (C2324 c2324 : arrayList3) {
                c2324.getClass();
                c1979.m3815(c2324.f7462);
                c1986.m3854(c2324.f7463);
            }
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5732;
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final int mo1223(AbstractC2270 abstractC2270) {
        C0174 c0174 = this.f1225;
        if (c0174 == null || this.f1226 != null || this.f1227 != null || this.f1228 != null) {
            throw new UnsupportedOperationException("uninternable instance");
        }
        C0174 c0175 = ((C0178) abstractC2270).f1225;
        if (c0174 == c0175) {
            c0174.getClass();
            return 0;
        }
        EnumC1683 enumC1683Mo1222 = c0174.mo1222();
        EnumC1683 enumC1683Mo1223 = c0175.mo1222();
        return enumC1683Mo1222 != enumC1683Mo1223 ? enumC1683Mo1222.compareTo(enumC1683Mo1223) : c0174.mo1223(c0175);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1224(C1986 c1986, int i) {
        m4153(((m1231(this.f1228) + m1231(this.f1227) + m1231(this.f1226)) * 8) + 16);
    }

    @Override // p000.AbstractC2270
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final void mo1225(C1023 c1023, C0519 c0519) {
        boolean zM1833 = c0519.m1833();
        C0174 c0174 = this.f1225;
        int iM4150 = c0174 == null ? 0 : c0174.m4150();
        int iM1231 = m1231(this.f1226);
        int iM1232 = m1231(this.f1227);
        int iM1233 = m1231(this.f1228);
        if (zM1833) {
            c0519.m1831(0, m4151() + " annotations directory");
            c0519.m1831(4, "  class_annotations_off: ".concat(AbstractC1460.m3224(iM4150)));
            c0519.m1831(4, "  fields_size:           ".concat(AbstractC1460.m3224(iM1231)));
            c0519.m1831(4, "  methods_size:          ".concat(AbstractC1460.m3224(iM1232)));
            c0519.m1831(4, "  parameters_size:       ".concat(AbstractC1460.m3224(iM1233)));
        }
        c0519.m1839(iM4150);
        c0519.m1839(iM1231);
        c0519.m1839(iM1232);
        c0519.m1839(iM1233);
        if (iM1231 != 0) {
            Collections.sort(this.f1226);
            if (zM1833) {
                c0519.m1831(0, "  fields:");
            }
            for (C1298 c1298 : this.f1226) {
                c1298.getClass();
                C1301 c1301 = c1023.f3744;
                C0899 c0899 = c1298.f4723;
                int iM3017 = c1301.m3017(c0899);
                int iM4151 = c1298.f4724.m4150();
                if (c0519.m1833()) {
                    c0519.m1831(0, "    " + c0899.mo1214());
                    c0519.m1831(4, "      field_idx:       ".concat(AbstractC1460.m3224(iM3017)));
                    c0519.m1831(4, "      annotations_off: ".concat(AbstractC1460.m3224(iM4151)));
                }
                c0519.m1839(iM3017);
                c0519.m1839(iM4151);
            }
        }
        if (iM1232 != 0) {
            Collections.sort(this.f1227);
            if (zM1833) {
                c0519.m1831(0, "  methods:");
            }
            for (C1972 c1972 : this.f1227) {
                c1972.getClass();
                C1979 c1979 = c1023.f3745;
                C0913 c0913 = c1972.f6541;
                int iM3814 = c1979.m3814(c0913);
                int iM4152 = c1972.f6542.m4150();
                if (c0519.m1833()) {
                    c0519.m1831(0, "    " + c0913.mo1214());
                    c0519.m1831(4, "      method_idx:      ".concat(AbstractC1460.m3224(iM3814)));
                    c0519.m1831(4, "      annotations_off: ".concat(AbstractC1460.m3224(iM4152)));
                }
                c0519.m1839(iM3814);
                c0519.m1839(iM4152);
            }
        }
        if (iM1233 != 0) {
            Collections.sort(this.f1228);
            if (zM1833) {
                c0519.m1831(0, "  parameters:");
            }
            for (C2324 c2324 : this.f1228) {
                c2324.getClass();
                C1979 c19710 = c1023.f3745;
                C0913 c0914 = c2324.f7462;
                int iM3815 = c19710.m3814(c0914);
                int iM4153 = c2324.f7463.m4150();
                if (c0519.m1833()) {
                    c0519.m1831(0, "    " + c0914.mo1214());
                    c0519.m1831(4, "      method_idx:      ".concat(AbstractC1460.m3224(iM3815)));
                    c0519.m1831(4, "      annotations_off: ".concat(AbstractC1460.m3224(iM4153)));
                }
                c0519.m1839(iM3815);
                c0519.m1839(iM4153);
            }
        }
    }
}
