package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᛸᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3121 {
    public static final C3120 Companion = new C3120();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9949;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9950;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9951;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9952;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9953;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9954;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9955;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f9956;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f9957;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f9959;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f9960;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String f9961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String f9962;

    public /* synthetic */ C3121(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, Integer num3, String str6, String str7, String str8, String str9, String str10, String str11) {
        if (16383 != (i & 16383)) {
            AbstractC1270.m2997(i, 16383, C3119.f9948.mo1363());
            throw null;
        }
        this.f9949 = str;
        this.f9950 = str2;
        this.f9951 = str3;
        this.f9952 = str4;
        this.f9953 = str5;
        this.f9954 = num;
        this.f9955 = num2;
        this.f9956 = num3;
        this.f9957 = str6;
        this.f9958 = str7;
        this.f9959 = str8;
        this.f9960 = str9;
        this.f9961 = str10;
        this.f9962 = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3121)) {
            return false;
        }
        C3121 c3121 = (C3121) obj;
        return AbstractC2207.m4087(this.f9949, c3121.f9949) && AbstractC2207.m4087(this.f9950, c3121.f9950) && AbstractC2207.m4087(this.f9951, c3121.f9951) && AbstractC2207.m4087(this.f9952, c3121.f9952) && AbstractC2207.m4087(this.f9953, c3121.f9953) && AbstractC2207.m4087(this.f9954, c3121.f9954) && AbstractC2207.m4087(this.f9955, c3121.f9955) && AbstractC2207.m4087(this.f9956, c3121.f9956) && AbstractC2207.m4087(this.f9957, c3121.f9957) && AbstractC2207.m4087(this.f9958, c3121.f9958) && AbstractC2207.m4087(this.f9959, c3121.f9959) && AbstractC2207.m4087(this.f9960, c3121.f9960) && AbstractC2207.m4087(this.f9961, c3121.f9961) && AbstractC2207.m4087(this.f9962, c3121.f9962);
    }

    public final int hashCode() {
        String str = this.f9949;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9950;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9951;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9952;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9953;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f9954;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9955;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9956;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str6 = this.f9957;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9958;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9959;
        int iHashCode11 = (iHashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f9960;
        int iHashCode12 = (iHashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f9961;
        int iHashCode13 = (iHashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f9962;
        return iHashCode13 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("kbProto(d=");
        sb.append(this.f9949);
        sb.append(", e=");
        sb.append(this.f9950);
        sb.append(", f=");
        sb.append(this.f9951);
        sb.append(", g=");
        sb.append(this.f9952);
        sb.append(", h=");
        sb.append(this.f9953);
        sb.append(", i=");
        sb.append(this.f9954);
        sb.append(", j=");
        sb.append(this.f9955);
        sb.append(", n=");
        sb.append(this.f9956);
        sb.append(", o=");
        sb.append(this.f9957);
        sb.append(", p=");
        sb.append(this.f9958);
        sb.append(", q=");
        sb.append(this.f9959);
        sb.append(", r=");
        sb.append(this.f9960);
        sb.append(", s=");
        sb.append(this.f9961);
        sb.append(", t=");
        return AbstractC1194.m2786(sb, this.f9962, ')');
    }
}
