package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲀᲁᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0801 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f3161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f3162;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public boolean f3163;

    public C0801(String str, String str2, String str3, boolean z) {
        this.f3160 = str;
        this.f3161 = str2;
        this.f3162 = str3;
        this.f3163 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0801)) {
            return false;
        }
        C0801 c0801 = (C0801) obj;
        return AbstractC2207.m4087(this.f3160, c0801.f3160) && AbstractC2207.m4087(this.f3161, c0801.f3161) && AbstractC2207.m4087(this.f3162, c0801.f3162) && this.f3163 == c0801.f3163;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3163) + AbstractC1194.m2775(AbstractC1194.m2775(this.f3160.hashCode() * 31, 31, this.f3161), 31, this.f3162);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ContactInfo(id=");
        sb.append(this.f3160);
        sb.append(", name=");
        sb.append(this.f3161);
        sb.append(", desc=");
        sb.append(this.f3162);
        sb.append(", isSelected=");
        sb.append(this.f3163);
        sb.append(')');
        return sb.toString();
    }
}
