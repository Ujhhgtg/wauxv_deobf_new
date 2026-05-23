package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0701 extends AbstractC1628 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0918 f2663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f2664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0918 f2665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public C3455 f2666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0917 f2667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C0699 f2668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C1202 f2669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public C0178 f2670;

    public C0701(C0918 c0918, int i, C0918 c0919, InterfaceC3454 interfaceC3454, C0917 c0917) {
        if (c0918 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC3454 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f2663 = c0918;
        this.f2664 = i;
        this.f2665 = c0919;
        this.f2666 = interfaceC3454.size() == 0 ? null : new C3455(interfaceC3454);
        this.f2667 = c0917;
        this.f2668 = new C0699(c0918);
        this.f2669 = null;
        C0178 c0178 = new C0178(4, -1);
        c0178.f1225 = null;
        c0178.f1226 = null;
        c0178.f1227 = null;
        c0178.f1228 = null;
        this.f2670 = c0178;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C1977 c1977 = c1023.f3742;
        C1986 c1986 = c1023.f3750;
        C1986 c1987 = c1023.f3737;
        C1986 c1988 = c1023.f3738;
        C1977 c1978 = c1023.f3741;
        c1977.m3809(this.f2663);
        C0699 c0699 = this.f2668;
        if (!c0699.m2120()) {
            c1023.f3747.m3854(c0699);
            C0890 c0890M2119 = c0699.m2119();
            if (c0890M2119 != null) {
                this.f2669 = (C1202) c1986.m3855(new C1202(c0890M2119));
            }
        }
        C0918 c0918 = this.f2665;
        if (c0918 != null) {
            c1977.m3809(c0918);
        }
        C3455 c3455 = this.f2666;
        if (c3455 != null) {
            this.f2666 = (C3455) c1988.m3855(c3455);
        }
        C0917 c0917 = this.f2667;
        if (c0917 != null) {
            c1978.m3811(c0917);
        }
        C0178 c0178 = this.f2670;
        C0174 c0174 = c0178.f1225;
        if (c0174 == null && c0178.f1226 == null && c0178.f1227 == null && c0178.f1228 == null) {
            return;
        }
        if (c0174 != null && c0178.f1226 == null && c0178.f1227 == null && c0178.f1228 == null) {
            this.f2670 = (C0178) c1987.m3855(c0178);
        } else {
            c1987.m3854(c0178);
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5719;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        return 32;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        boolean zM1833 = c0519.m1833();
        C1977 c1977 = c1023.f3742;
        C0918 c0918 = this.f2663;
        int iM3806 = c1977.m3806(c0918);
        C0918 c0919 = this.f2665;
        int iM3807 = c0919 == null ? -1 : c1977.m3806(c0919);
        C3455 c3455 = this.f2666;
        int iM4150 = c3455 == null ? 0 : c3455.m4150();
        C0178 c0178 = this.f2670;
        int iM4151 = (c0178.f1225 == null && c0178.f1226 == null && c0178.f1227 == null && c0178.f1228 == null) ? 0 : c0178.m4150();
        C0917 c0917 = this.f2667;
        int iM3805 = c0917 != null ? c1023.f3741.m3805(c0917) : -1;
        C0699 c0699 = this.f2668;
        int iM4152 = c0699.m2120() ? 0 : c0699.m4150();
        C1202 c1202 = this.f2669;
        int iM4153 = c1202 == null ? 0 : c1202.m4150();
        int i = this.f2664;
        if (zM1833) {
            c0519.m1831(0, m3346() + ' ' + c0918.f3401.mo1214());
            c0519.m1831(4, "  class_idx:           ".concat(AbstractC1460.m3224(iM3806)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(AbstractC2201.m3975(i, 30257, 1));
            c0519.m1831(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(AbstractC1460.m3224(iM3807));
            sb2.append(" // ");
            sb2.append(c0919 == null ? "<none>" : c0919.f3401.mo1214());
            c0519.m1831(4, sb2.toString());
            c0519.m1831(4, "  interfaces_off:      ".concat(AbstractC1460.m3224(iM4150)));
            if (iM4150 != 0) {
                InterfaceC3454 interfaceC3454 = this.f2666.f10928;
                int i2 = 0;
                for (int size = interfaceC3454.size(); i2 < size; size = size) {
                    c0519.m1831(0, "    " + interfaceC3454.getType(i2).mo1214());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(AbstractC1460.m3224(iM3805));
            sb3.append(" // ");
            sb3.append(c0917 != null ? c0917.mo1214() : "<none>");
            c0519.m1831(4, sb3.toString());
            c0519.m1831(4, "  annotations_off:     ".concat(AbstractC1460.m3224(iM4151)));
            c0519.m1831(4, "  class_data_off:      ".concat(AbstractC1460.m3224(iM4152)));
            c0519.m1831(4, "  static_values_off:   ".concat(AbstractC1460.m3224(iM4153)));
        }
        c0519.m1839(iM3806);
        c0519.m1839(i);
        c0519.m1839(iM3807);
        c0519.m1839(iM4150);
        c0519.m1839(iM3805);
        c0519.m1839(iM4151);
        c0519.m1839(iM4152);
        c0519.m1839(iM4153);
    }
}
