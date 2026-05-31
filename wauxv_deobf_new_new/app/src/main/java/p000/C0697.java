package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲇᤝᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0697 extends AbstractC1641 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0917 f2664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int f2665;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0917 f2666;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C3511 f2667;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C0916 f2668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0695 f2669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public C1203 f2670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0186 f2671;

    public C0697(C0917 c0917, int i, C0917 c0918, InterfaceC3510 interfaceC3510, C0916 c0916) {
        if (c0917 == null) {
            throw new NullPointerException("thisClass == null");
        }
        if (interfaceC3510 == null) {
            throw new NullPointerException("interfaces == null");
        }
        this.f2664 = c0917;
        this.f2665 = i;
        this.f2666 = c0918;
        this.f2667 = interfaceC3510.size() == 0 ? null : new C3511(interfaceC3510);
        this.f2668 = c0916;
        this.f2669 = new C0695(c0917);
        this.f2670 = null;
        C0186 c0186 = new C0186(4, -1);
        c0186.f1293 = null;
        c0186.f1294 = null;
        c0186.f1295 = null;
        c0186.f1296 = null;
        this.f2671 = c0186;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2008 c2008 = c1026.f3749;
        C2017 c2017 = c1026.f3757;
        C2017 c2018 = c1026.f3744;
        C2017 c2019 = c1026.f3745;
        C2008 c2009 = c1026.f3748;
        c2008.m4003(this.f2664);
        C0695 c0695 = this.f2669;
        if (!c0695.m2215()) {
            c1026.f3754.m4048(c0695);
            C0889 c0889M2214 = c0695.m2214();
            if (c0889M2214 != null) {
                this.f2670 = (C1203) c2017.m4049(new C1203(c0889M2214));
            }
        }
        C0917 c0917 = this.f2666;
        if (c0917 != null) {
            c2008.m4003(c0917);
        }
        C3511 c3511 = this.f2667;
        if (c3511 != null) {
            this.f2667 = (C3511) c2019.m4049(c3511);
        }
        C0916 c0916 = this.f2668;
        if (c0916 != null) {
            c2009.m4005(c0916);
        }
        C0186 c0186 = this.f2671;
        C0182 c0182 = c0186.f1293;
        if (c0182 == null && c0186.f1294 == null && c0186.f1295 == null && c0186.f1296 == null) {
            return;
        }
        if (c0182 != null && c0186.f1294 == null && c0186.f1295 == null && c0186.f1296 == null) {
            this.f2671 = (C0186) c2018.m4049(c0186);
        } else {
            c2018.m4048(c0186);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5762;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 32;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        boolean zM1927 = c0496.m1927();
        C2008 c2008 = c1026.f3749;
        C0917 c0917 = this.f2664;
        int iM4000 = c2008.m4000(c0917);
        C0917 c0918 = this.f2666;
        int iM4001 = c0918 == null ? -1 : c2008.m4000(c0918);
        C3511 c3511 = this.f2667;
        int iM4279 = c3511 == null ? 0 : c3511.m4279();
        C0186 c0186 = this.f2671;
        int iM42710 = (c0186.f1293 == null && c0186.f1294 == null && c0186.f1295 == null && c0186.f1296 == null) ? 0 : c0186.m4279();
        C0916 c0916 = this.f2668;
        int iM3999 = c0916 != null ? c1026.f3748.m3999(c0916) : -1;
        C0695 c0695 = this.f2669;
        int iM42711 = c0695.m2215() ? 0 : c0695.m4279();
        C1203 c1203 = this.f2670;
        int iM42712 = c1203 == null ? 0 : c1203.m4279();
        int i = this.f2665;
        if (zM1927) {
            c0496.m1925(0, m3510() + ' ' + c0917.f3408.mo1360());
            c0496.m1925(4, "  class_idx:           ".concat(AbstractC2902.m4907(iM4000)));
            StringBuilder sb = new StringBuilder("  access_flags:        ");
            sb.append(AbstractC1470.m3364(i, 30257, 1));
            c0496.m1925(4, sb.toString());
            StringBuilder sb2 = new StringBuilder("  superclass_idx:      ");
            sb2.append(AbstractC2902.m4907(iM4001));
            sb2.append(" // ");
            sb2.append(c0918 == null ? "<none>" : c0918.f3408.mo1360());
            c0496.m1925(4, sb2.toString());
            c0496.m1925(4, "  interfaces_off:      ".concat(AbstractC2902.m4907(iM4279)));
            if (iM4279 != 0) {
                InterfaceC3510 interfaceC3510 = this.f2667.f11084;
                int i2 = 0;
                for (int size = interfaceC3510.size(); i2 < size; size = size) {
                    c0496.m1925(0, "    " + interfaceC3510.getType(i2).mo1360());
                    i2++;
                }
            }
            StringBuilder sb3 = new StringBuilder("  source_file_idx:     ");
            sb3.append(AbstractC2902.m4907(iM3999));
            sb3.append(" // ");
            sb3.append(c0916 != null ? c0916.mo1360() : "<none>");
            c0496.m1925(4, sb3.toString());
            c0496.m1925(4, "  annotations_off:     ".concat(AbstractC2902.m4907(iM42710)));
            c0496.m1925(4, "  class_data_off:      ".concat(AbstractC2902.m4907(iM42711)));
            c0496.m1925(4, "  static_values_off:   ".concat(AbstractC2902.m4907(iM42712)));
        }
        c0496.m1933(iM4000);
        c0496.m1933(i);
        c0496.m1933(iM4001);
        c0496.m1933(iM4279);
        c0496.m1933(iM3999);
        c0496.m1933(iM42710);
        c0496.m1933(iM42711);
        c0496.m1933(iM42712);
    }
}
