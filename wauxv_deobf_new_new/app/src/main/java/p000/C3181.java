package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᤝᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3181 {
    public static final C3180 Companion = new C3180();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10117;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10118;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10119;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10120;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10121;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10122;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10127;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10128;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String f10129;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String f10130;

    public /* synthetic */ C3181(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (16383 != (i & 16383)) {
            AbstractC2234.m4187(i, 16383, C3179.f10116.mo1509());
            throw null;
        }
        this.f10117 = str;
        this.f10118 = str2;
        this.f10119 = str3;
        this.f10120 = str4;
        this.f10121 = str5;
        this.f10122 = num;
        this.f10123 = num2;
        this.f10124 = num3;
        this.f10125 = str6;
        this.f10126 = str7;
        this.f10127 = str8;
        this.f10128 = str9;
        this.f10129 = str10;
        this.f10130 = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3181)) {
            return false;
        }
        C3181 c3181 = (C3181) obj;
        return AbstractC1469.m3322(this.f10117, c3181.f10117) && AbstractC1469.m3322(this.f10118, c3181.f10118) && AbstractC1469.m3322(this.f10119, c3181.f10119) && AbstractC1469.m3322(this.f10120, c3181.f10120) && AbstractC1469.m3322(this.f10121, c3181.f10121) && AbstractC1469.m3322(this.f10122, c3181.f10122) && AbstractC1469.m3322(this.f10123, c3181.f10123) && AbstractC1469.m3322(this.f10124, c3181.f10124) && AbstractC1469.m3322(this.f10125, c3181.f10125) && AbstractC1469.m3322(this.f10126, c3181.f10126) && AbstractC1469.m3322(this.f10127, c3181.f10127) && AbstractC1469.m3322(this.f10128, c3181.f10128) && AbstractC1469.m3322(this.f10129, c3181.f10129) && AbstractC1469.m3322(this.f10130, c3181.f10130);
    }

    public final int hashCode() {
        String str = this.f10117;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10118;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10119;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10120;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10121;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f10122;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10123;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10124;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.f10125;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10126;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10127;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10128;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10129;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f10130;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("kbProto(d=");
        sb.append(this.f10117);
        sb.append(", e=");
        sb.append(this.f10118);
        sb.append(", f=");
        sb.append(this.f10119);
        sb.append(", g=");
        sb.append(this.f10120);
        sb.append(", h=");
        sb.append(this.f10121);
        sb.append(", i=");
        sb.append(this.f10122);
        sb.append(", j=");
        sb.append(this.f10123);
        sb.append(", n=");
        sb.append(this.f10124);
        sb.append(", o=");
        sb.append(this.f10125);
        sb.append(", p=");
        sb.append(this.f10126);
        sb.append(", q=");
        sb.append(this.f10127);
        sb.append(", r=");
        sb.append(this.f10128);
        sb.append(", s=");
        sb.append(this.f10129);
        sb.append(", t=");
        return AbstractC1095.m2801(sb, this.f10130, ')');
    }
}
