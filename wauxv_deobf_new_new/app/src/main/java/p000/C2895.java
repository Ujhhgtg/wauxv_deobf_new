package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲁᤝᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2895 extends AbstractC1641 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0916 f9261;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public C2893 f9262;

    public C2895(C0916 c0916) {
        if (c0916 == null) {
            throw new NullPointerException("value == null");
        }
        this.f9261 = c0916;
        this.f9262 = null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9261.compareTo(((C2895) obj).f9261);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2895) {
            return this.f9261.equals(((C2895) obj).f9261);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9261.f3385.hashCode();
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1367(C1026 c1026) {
        if (this.f9262 == null) {
            C2017 c2017 = c1026.f3747;
            C2893 c2893 = new C2893(this.f9261);
            this.f9262 = c2893;
            c2017.m4048(c2893);
        }
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1701 mo1368() {
        return EnumC1701.f5757;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo2016() {
        return 4;
    }

    @Override // p000.AbstractC1690
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2017(C1026 c1026, C0496 c0496) {
        String str;
        int iM4279 = this.f9262.m4279();
        if (c0496.m1927()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3510());
            sb.append(' ');
            String strMo1360 = this.f9261.mo1360();
            if (strMo1360.length() <= 98) {
                str = "";
            } else {
                strMo1360 = strMo1360.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo1360 + str + '\"');
            c0496.m1925(0, sb.toString());
            c0496.m1925(4, "  string_data_off: ".concat(AbstractC2902.m4907(iM4279)));
        }
        c0496.m1933(iM4279);
    }
}
