package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᤞᲇᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0800 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3167;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f3168;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f3169;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f3170;

    public C0800(String str, String str2, String str3, boolean z) {
        this.f3167 = str;
        this.f3168 = str2;
        this.f3169 = str3;
        this.f3170 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0800)) {
            return false;
        }
        C0800 c0800 = (C0800) obj;
        return AbstractC1469.m3322(this.f3167, c0800.f3167) && AbstractC1469.m3322(this.f3168, c0800.f3168) && AbstractC1469.m3322(this.f3169, c0800.f3169) && this.f3170 == c0800.f3170;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3170) + AbstractC2647.m4621(AbstractC2647.m4621(this.f3167.hashCode() * 31, 31, this.f3168), 31, this.f3169);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ContactInfo(id=");
        sb.append(this.f3167);
        sb.append(", name=");
        sb.append(this.f3168);
        sb.append(", desc=");
        sb.append(this.f3169);
        sb.append(", isSelected=");
        sb.append(this.f3170);
        sb.append(')');
        return sb.toString();
    }
}
