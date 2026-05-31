package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲁᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1744 extends AbstractC1754 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final boolean f5877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f5878;

    public C1744(String str, boolean z) {
        this.f5877 = z;
        this.f5878 = str.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1744.class != obj.getClass()) {
            return false;
        }
        C1744 c1744 = (C1744) obj;
        return this.f5877 == c1744.f5877 && AbstractC1469.m3322(this.f5878, c1744.f5878);
    }

    public final int hashCode() {
        return this.f5878.hashCode() + (Boolean.hashCode(this.f5877) * 31);
    }

    @Override // p000.AbstractC1754
    public final String toString() {
        boolean z = this.f5877;
        String str = this.f5878;
        if (!z) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        AbstractC2898.m4857(sb, str);
        return sb.toString();
    }

    @Override // p000.AbstractC1754
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String mo3647() {
        return this.f5878;
    }
}
