package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᛸᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1206 extends AbstractC1205 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0912 f4341;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0731 f4342;

    public C1206(C0912 c0912, int i, C0225 c0225, InterfaceC3510 interfaceC3510) {
        super(i);
        this.f4341 = c0912;
        if (c0225 == null) {
            this.f4342 = null;
        } else {
            this.f4342 = new C0731(c0912, c0225, (i & 8) != 0, interfaceC3510);
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4341.compareTo(((C1206) obj).f4341);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1206) && this.f4341.compareTo(((C1206) obj).f4341) == 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1206.class.getName());
        sb.append('{');
        sb.append(AbstractC2902.m4906(this.f4340));
        sb.append(' ');
        sb.append(this.f4341);
        C0731 c0731 = this.f4342;
        if (c0731 != null) {
            sb.append(' ');
            sb.append(c0731);
        }
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f4341.mo1360();
    }

    @Override // p000.AbstractC1205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final int mo2917(C1026 c1026, C0496 c0496, int i, int i2) {
        C2010 c2010 = c1026.f3752;
        C0912 c0912 = this.f4341;
        int iM4008 = c2010.m4008(c0912);
        int i3 = iM4008 - i;
        C0731 c0731 = this.f4342;
        int iM4279 = c0731 == null ? 0 : c0731.m4279();
        boolean z = iM4279 != 0;
        int i4 = this.f4340;
        if (z != ((i4 & 1280) == 0)) {
            throw new UnsupportedOperationException("code vs. access_flags mismatch");
        }
        if (c0496.m1927()) {
            c0496.m1925(0, String.format("  [%x] %s", Integer.valueOf(i2), c0912.mo1360()));
            c0496.m1925(AbstractC2902.m4909(i3), "    method_idx:   ".concat(AbstractC2902.m4907(iM4008)));
            c0496.m1925(AbstractC2902.m4909(i4), "    access_flags: " + AbstractC1470.m3364(i4, 204287, 3));
            c0496.m1925(AbstractC2902.m4909(iM4279), "    code_off:     ".concat(AbstractC2902.m4907(iM4279)));
        }
        c0496.m1936(i3);
        c0496.m1936(i4);
        c0496.m1936(iM4279);
        return iM4008;
    }
}
