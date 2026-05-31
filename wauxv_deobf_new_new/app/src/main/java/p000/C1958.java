package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᤝᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1958 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class f6469;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Object f6470;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public C0160 f6471 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f6472 = false;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public int f6473 = 1;

    public C1958(Class cls, Object obj) {
        this.f6469 = cls;
        this.f6470 = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1958)) {
            return false;
        }
        C1958 c1958 = (C1958) obj;
        return AbstractC1469.m3322(this.f6469, c1958.f6469) && AbstractC1469.m3322(this.f6470, c1958.f6470) && AbstractC1469.m3322(this.f6471, c1958.f6471) && this.f6472 == c1958.f6472 && this.f6473 == c1958.f6473;
    }

    public final int hashCode() {
        int iHashCode = this.f6469.hashCode() * 31;
        Object obj = this.f6470;
        int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
        C0160 c0160 = this.f6471;
        return AbstractC2844.m4792(this.f6473) + ((Boolean.hashCode(this.f6472) + ((iHashCode2 + (c0160 != null ? c0160.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        String str;
        C0160 c0160 = this.f6471;
        boolean z = this.f6472;
        int i = this.f6473;
        StringBuilder sb = new StringBuilder("Configuration(declaringClass=");
        sb.append(this.f6469);
        sb.append(", memberInstance=");
        sb.append(this.f6470);
        sb.append(", processorResolver=");
        sb.append(c0160);
        sb.append(", superclass=");
        sb.append(z);
        sb.append(", optional=");
        if (i == 1) {
            str = "NO";
        } else if (i != 2) {
            str = i != 3 ? "null" : "SILENT";
        } else {
            str = "NOTICE";
        }
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
