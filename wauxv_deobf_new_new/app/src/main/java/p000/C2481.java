package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᛸᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2481 extends AbstractC1641 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2492 f7863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0916 f7864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C3511 f7865;

    public C2481(C2492 c2492) {
        if (c2492 == null) {
            throw new NullPointerException("prototype == null");
        }
        C2879 c2879 = c2492.f7900;
        this.f7863 = c2492;
        int length = c2879.f4833.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = c2492.f7899.f11064.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((C3505) c2879.m3165(i)).f11064.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f7864 = new C0916(sb.toString());
        this.f7865 = c2879.f4833.length == 0 ? null : new C3511(c2879);
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        C2008 c2008 = c1026.f3748;
        C2008 c2009 = c1026.f3749;
        C2017 c2017 = c1026.f3745;
        c2009.m4007(this.f7863.f7899);
        c2008.m4005(this.f7864);
        C3511 c3511 = this.f7865;
        if (c3511 != null) {
            this.f7865 = (C3511) c2017.m4049(c3511);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5759;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 12;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        C2008 c2008 = c1026.f3748;
        C0916 c0916 = this.f7864;
        int iM3999 = c2008.m3999(c0916);
        C2008 c2009 = c1026.f3749;
        C2492 c2492 = this.f7863;
        C3505 c3505 = c2492.f7899;
        C3505 c3506 = c2492.f7899;
        int iM4002 = c2009.m4002(c3505);
        C3511 c3511 = this.f7865;
        int iM4279 = c3511 == null ? 0 : c3511.m4279();
        if (c0496.m1927()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c3506.mo1360());
            sb.append(" proto(");
            C2879 c2879 = c2492.f7900;
            int length = c2879.f4833.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(((C3505) c2879.m3165(i)).mo1360());
            }
            sb.append(")");
            c0496.m1925(0, m3510() + ' ' + sb.toString());
            c0496.m1925(4, "  shorty_idx:      " + AbstractC2902.m4907(iM3999) + " // " + c0916.m2547());
            c0496.m1925(4, "  return_type_idx: " + AbstractC2902.m4907(iM4002) + " // " + c3506.mo1360());
            c0496.m1925(4, "  parameters_off:  ".concat(AbstractC2902.m4907(iM4279)));
        }
        c0496.m1933(iM3999);
        c0496.m1933(iM4002);
        c0496.m1933(iM4279);
    }
}
