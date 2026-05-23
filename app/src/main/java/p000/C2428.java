package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲈᛸᲇᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2428 extends AbstractC1628 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2440 f7719;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C0917 f7720;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C3455 f7721;

    public C2428(C2440 c2440) {
        if (c2440 == null) {
            throw new NullPointerException("prototype == null");
        }
        C2819 c2819 = c2440.f7756;
        this.f7719 = c2440;
        int length = c2819.f4836.length;
        StringBuilder sb = new StringBuilder(length + 1);
        char cCharAt = c2440.f7755.f10904.charAt(0);
        sb.append(cCharAt == '[' ? 'L' : cCharAt);
        for (int i = 0; i < length; i++) {
            char cCharAt2 = ((C3448) c2819.m3062(i)).f10904.charAt(0);
            if (cCharAt2 == '[') {
                cCharAt2 = 'L';
            }
            sb.append(cCharAt2);
        }
        this.f7720 = new C0917(sb.toString());
        this.f7721 = c2819.f4836.length == 0 ? null : new C3455(c2819);
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        C1977 c1977 = c1023.f3741;
        C1977 c1978 = c1023.f3742;
        C1986 c1986 = c1023.f3738;
        c1978.m3813(this.f7719.f7755);
        c1977.m3811(this.f7720);
        C3455 c3455 = this.f7721;
        if (c3455 != null) {
            this.f7721 = (C3455) c1986.m3855(c3455);
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5716;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        return 12;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        C1977 c1977 = c1023.f3741;
        C0917 c0917 = this.f7720;
        int iM3805 = c1977.m3805(c0917);
        C1977 c1978 = c1023.f3742;
        C2440 c2440 = this.f7719;
        C3448 c3448 = c2440.f7755;
        C3448 c3449 = c2440.f7755;
        int iM3808 = c1978.m3808(c3448);
        C3455 c3455 = this.f7721;
        int iM4150 = c3455 == null ? 0 : c3455.m4150();
        if (c0519.m1833()) {
            StringBuilder sb = new StringBuilder();
            sb.append(c3449.mo1214());
            sb.append(" proto(");
            C2819 c2819 = c2440.f7756;
            int length = c2819.f4836.length;
            for (int i = 0; i < length; i++) {
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(((C3448) c2819.m3062(i)).mo1214());
            }
            sb.append(")");
            c0519.m1831(0, m3346() + ' ' + sb.toString());
            c0519.m1831(4, "  shorty_idx:      " + AbstractC1460.m3224(iM3805) + " // " + c0917.m2430());
            c0519.m1831(4, "  return_type_idx: " + AbstractC1460.m3224(iM3808) + " // " + c3449.mo1214());
            c0519.m1831(4, "  parameters_off:  ".concat(AbstractC1460.m3224(iM4150)));
        }
        c0519.m1839(iM3805);
        c0519.m1839(iM3808);
        c0519.m1839(iM4150);
    }
}
