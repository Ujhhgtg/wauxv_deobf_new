package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3325 {
    public static final C3324 Companion = new C3324();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10539;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10540;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10541;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10542;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10543;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10544;

    public /* synthetic */ C3325(int i, String str, String str2, String str3, String str4, String str5, Integer num) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3323.f10538.mo1509());
            throw null;
        }
        this.f10539 = str;
        this.f10540 = str2;
        this.f10541 = str3;
        this.f10542 = str4;
        this.f10543 = str5;
        this.f10544 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3325)) {
            return false;
        }
        C3325 c3325 = (C3325) obj;
        return AbstractC1469.m3322(this.f10539, c3325.f10539) && AbstractC1469.m3322(this.f10540, c3325.f10540) && AbstractC1469.m3322(this.f10541, c3325.f10541) && AbstractC1469.m3322(this.f10542, c3325.f10542) && AbstractC1469.m3322(this.f10543, c3325.f10543) && AbstractC1469.m3322(this.f10544, c3325.f10544);
    }

    public final int hashCode() {
        String str = this.f10539;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10540;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10541;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10542;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10543;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f10544;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("sz0Proto(appid=");
        sb.append(this.f10539);
        sb.append(", path=");
        sb.append(this.f10540);
        sb.append(", query=");
        sb.append(this.f10541);
        sb.append(", default_url=");
        sb.append(this.f10542);
        sb.append(", min_version=");
        sb.append(this.f10543);
        sb.append(", is_transparent=");
        return AbstractC2647.m4623(sb, this.f10544, ')');
    }
}
