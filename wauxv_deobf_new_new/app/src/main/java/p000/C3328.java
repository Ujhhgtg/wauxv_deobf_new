package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᤞᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3328 {
    public static final C3327 Companion = new C3327();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10546;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10547;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10548;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10549;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10550;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10551;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10552;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10553;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10554;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10555;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10556;

    public /* synthetic */ C3328(int i, String str, Integer num, String str2, String str3, String str4, String str5, Integer num2, String str6, String str7, Integer num3, Integer num4) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3326.f10545.mo1509());
            throw null;
        }
        this.f10546 = str;
        this.f10547 = num;
        this.f10548 = str2;
        this.f10549 = str3;
        this.f10550 = str4;
        this.f10551 = str5;
        this.f10552 = num2;
        this.f10553 = str6;
        this.f10554 = str7;
        this.f10555 = num3;
        this.f10556 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3328)) {
            return false;
        }
        C3328 c3328 = (C3328) obj;
        return AbstractC1469.m3322(this.f10546, c3328.f10546) && AbstractC1469.m3322(this.f10547, c3328.f10547) && AbstractC1469.m3322(this.f10548, c3328.f10548) && AbstractC1469.m3322(this.f10549, c3328.f10549) && AbstractC1469.m3322(this.f10550, c3328.f10550) && AbstractC1469.m3322(this.f10551, c3328.f10551) && AbstractC1469.m3322(this.f10552, c3328.f10552) && AbstractC1469.m3322(this.f10553, c3328.f10553) && AbstractC1469.m3322(this.f10554, c3328.f10554) && AbstractC1469.m3322(this.f10555, c3328.f10555) && AbstractC1469.m3322(this.f10556, c3328.f10556);
    }

    public final int hashCode() {
        String str = this.f10546;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10547;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f10548;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10549;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10550;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10551;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.f10552;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f10553;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10554;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.f10555;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10556;
        return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("t10Proto(d=");
        sb.append(this.f10546);
        sb.append(", e=");
        sb.append(this.f10547);
        sb.append(", f=");
        sb.append(this.f10548);
        sb.append(", g=");
        sb.append(this.f10549);
        sb.append(", h=");
        sb.append(this.f10550);
        sb.append(", i=");
        sb.append(this.f10551);
        sb.append(", j=");
        sb.append(this.f10552);
        sb.append(", n=");
        sb.append(this.f10553);
        sb.append(", o=");
        sb.append(this.f10554);
        sb.append(", p=");
        sb.append(this.f10555);
        sb.append(", q=");
        return AbstractC2647.m4623(sb, this.f10556, ')');
    }
}
