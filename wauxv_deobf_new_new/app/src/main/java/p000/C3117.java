package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲇᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3117 {
    public static final C3116 Companion = new C3116();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9958;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3102 f9959;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3102 f9960;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3102 f9961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3102 f9962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Float f9963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Boolean f9965;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Boolean f9966;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9967;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f9968;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f9969;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f9970;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final C3102 f9971;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final C3102 f9972;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C3102 f9973;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final C3102 f9974;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final C3102 f9975;

    public /* synthetic */ C3117(int i, String str, C3102 c3102, C3102 c3103, C3102 c3104, C3102 c3105, Float f, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, Integer num, C3102 c3106, C3102 c3107, C3102 c3108, C3102 c3109, C3102 c31010) {
        if (262143 != (i & 262143)) {
            AbstractC2234.m4187(i, 262143, C3115.f9957.mo1509());
            throw null;
        }
        this.f9958 = str;
        this.f9959 = c3102;
        this.f9960 = c3103;
        this.f9961 = c3104;
        this.f9962 = c3105;
        this.f9963 = f;
        this.f9964 = str2;
        this.f9965 = bool;
        this.f9966 = bool2;
        this.f9967 = str3;
        this.f9968 = str4;
        this.f9969 = str5;
        this.f9970 = num;
        this.f9971 = c3106;
        this.f9972 = c3107;
        this.f9973 = c3108;
        this.f9974 = c3109;
        this.f9975 = c31010;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3117)) {
            return false;
        }
        C3117 c3117 = (C3117) obj;
        return AbstractC1469.m3322(this.f9958, c3117.f9958) && AbstractC1469.m3322(this.f9959, c3117.f9959) && AbstractC1469.m3322(this.f9960, c3117.f9960) && AbstractC1469.m3322(this.f9961, c3117.f9961) && AbstractC1469.m3322(this.f9962, c3117.f9962) && AbstractC1469.m3322(this.f9963, c3117.f9963) && AbstractC1469.m3322(this.f9964, c3117.f9964) && AbstractC1469.m3322(this.f9965, c3117.f9965) && AbstractC1469.m3322(this.f9966, c3117.f9966) && AbstractC1469.m3322(this.f9967, c3117.f9967) && AbstractC1469.m3322(this.f9968, c3117.f9968) && AbstractC1469.m3322(this.f9969, c3117.f9969) && AbstractC1469.m3322(this.f9970, c3117.f9970) && AbstractC1469.m3322(this.f9971, c3117.f9971) && AbstractC1469.m3322(this.f9972, c3117.f9972) && AbstractC1469.m3322(this.f9973, c3117.f9973) && AbstractC1469.m3322(this.f9974, c3117.f9974) && AbstractC1469.m3322(this.f9975, c3117.f9975);
    }

    public final int hashCode() {
        String str = this.f9958;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3102 c3102 = this.f9959;
        int iHashCode2 = (iHashCode + (c3102 == null ? 0 : c3102.hashCode())) * 31;
        C3102 c3103 = this.f9960;
        int iHashCode3 = (iHashCode2 + (c3103 == null ? 0 : c3103.hashCode())) * 31;
        C3102 c3104 = this.f9961;
        int iHashCode4 = (iHashCode3 + (c3104 == null ? 0 : c3104.hashCode())) * 31;
        C3102 c3105 = this.f9962;
        int iHashCode5 = (iHashCode4 + (c3105 == null ? 0 : c3105.hashCode())) * 31;
        Float f = this.f9963;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.f9964;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f9965;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9966;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f9967;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9968;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9969;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f9970;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        C3102 c3106 = this.f9971;
        int iHashCode14 = (iHashCode13 + (c3106 == null ? 0 : c3106.hashCode())) * 31;
        C3102 c3107 = this.f9972;
        int iHashCode15 = (iHashCode14 + (c3107 == null ? 0 : c3107.hashCode())) * 31;
        C3102 c3108 = this.f9973;
        int iHashCode16 = (iHashCode15 + (c3108 == null ? 0 : c3108.hashCode())) * 31;
        C3102 c3109 = this.f9974;
        int iHashCode17 = (iHashCode16 + (c3109 == null ? 0 : c3109.hashCode())) * 31;
        C3102 c31010 = this.f9975;
        return iHashCode17 + (c31010 != null ? c31010.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ec5Proto(reward_product_id=");
        sb.append(this.f9958);
        sb.append(", business_type=");
        sb.append(this.f9959);
        sb.append(", thumbnail_file_url=");
        sb.append(this.f9960);
        sb.append(", preview_pag_url=");
        sb.append(this.f9961);
        sb.append(", animation_pag_url=");
        sb.append(this.f9962);
        sb.append(", thumbnail_file_md5=");
        sb.append(this.f9963);
        sb.append(", preview_pag_md5=");
        sb.append(this.f9964);
        sb.append(", animation_pag_md5=");
        sb.append(this.f9965);
        sb.append(", name=");
        sb.append(this.f9966);
        sb.append(", price=");
        sb.append(this.f9967);
        sb.append(", gift_type=");
        sb.append(this.f9968);
        sb.append(", unlock_intimacy_level=");
        sb.append(this.f9969);
        sb.append(", flag=");
        sb.append(this.f9970);
        sb.append(", landscape_animation_pag_url=");
        sb.append(this.f9971);
        sb.append(", landscape_animation_pag_md5=");
        sb.append(this.f9972);
        sb.append(", custom_info=");
        sb.append(this.f9973);
        sb.append(", unlock_global_reward_level=");
        sb.append(this.f9974);
        sb.append(", tag_color=");
        sb.append(this.f9975);
        sb.append(')');
        return sb.toString();
    }
}
