package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᤝᛸᲁᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2835 extends AbstractC1628 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0917 f9099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C2833 f9100;

    public C2835(C0917 c0917) {
        if (c0917 == null) {
            throw new NullPointerException("value == null");
        }
        this.f9099 = c0917;
        this.f9100 = null;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f9099.compareTo(((C2835) obj).f9099);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2835) {
            return this.f9099.equals(((C2835) obj).f9099);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9099.f3378.hashCode();
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final void mo1221(C1023 c1023) {
        if (this.f9100 == null) {
            C1986 c1986 = c1023.f3740;
            C2833 c2833 = new C2833(this.f9099);
            this.f9100 = c2833;
            c1986.m3854(c2833);
        }
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final EnumC1683 mo1222() {
        return EnumC1683.f5714;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final int mo1921() {
        return 4;
    }

    @Override // p000.AbstractC1675
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1922(C1023 c1023, C0519 c0519) {
        String str;
        int iM4150 = this.f9100.m4150();
        if (c0519.m1833()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m3346());
            sb.append(' ');
            String strMo1214 = this.f9099.mo1214();
            if (strMo1214.length() <= 98) {
                str = "";
            } else {
                strMo1214 = strMo1214.substring(0, 95);
                str = "...";
            }
            sb.append("\"" + strMo1214 + str + '\"');
            c0519.m1831(0, sb.toString());
            c0519.m1831(4, "  string_data_off: ".concat(AbstractC1460.m3224(iM4150)));
        }
        c0519.m1839(iM4150);
    }
}
