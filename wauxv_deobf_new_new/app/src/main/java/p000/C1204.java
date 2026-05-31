package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲀᲈᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1204 extends AbstractC1205 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0898 f4339;

    public C1204(C0898 c0898, int i) {
        super(i);
        this.f4339 = c0898;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4339.compareTo(((C1204) obj).f4339);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1204) && this.f4339.compareTo(((C1204) obj).f4339) == 0;
    }

    public final int hashCode() {
        return this.f4339.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append(C1204.class.getName());
        sb.append('{');
        sb.append(AbstractC2902.m4906(this.f4340));
        sb.append(' ');
        sb.append(this.f4339);
        sb.append('}');
        return sb.toString();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f4339.mo1360();
    }

    @Override // p000.AbstractC1205
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int mo2917(C1026 c1026, C0496 c0496, int i, int i2) {
        C1302 c1302 = c1026.f3751;
        C0898 c0898 = this.f4339;
        int iM3120 = c1302.m3120(c0898);
        int i3 = iM3120 - i;
        boolean zM1927 = c0496.m1927();
        int i4 = this.f4340;
        if (zM1927) {
            c0496.m1925(0, String.format("  [%x] %s", Integer.valueOf(i2), c0898.mo1360()));
            c0496.m1925(AbstractC2902.m4909(i3), "    field_idx:    ".concat(AbstractC2902.m4907(iM3120)));
            c0496.m1925(AbstractC2902.m4909(i4), "    access_flags: " + AbstractC1470.m3364(i4, 20703, 2));
        }
        c0496.m1936(i3);
        c0496.m1936(i4);
        return iM3120;
    }
}
