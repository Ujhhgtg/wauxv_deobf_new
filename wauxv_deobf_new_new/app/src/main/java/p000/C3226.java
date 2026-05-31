package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᛸᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3226 {
    public static final C3225 Companion = new C3225();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10313;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10314;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3244 f10318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3265 f10319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C3397 f10320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C3397 f10321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10322;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10323;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10324;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Long f10325;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Long f10326;

    public /* synthetic */ C3226(int i, Integer num, Long l, Integer num2, Integer num3, String str, C3244 c3244, C3265 c3265, C3397 c3397, C3397 c3398, String str2, String str3, String str4, Long l2, Long l3) {
        if (16383 != (i & 16383)) {
            AbstractC2234.m4187(i, 16383, C3224.f10312.mo1509());
            throw null;
        }
        this.f10313 = num;
        this.f10314 = l;
        this.f10315 = num2;
        this.f10316 = num3;
        this.f10317 = str;
        this.f10318 = c3244;
        this.f10319 = c3265;
        this.f10320 = c3397;
        this.f10321 = c3398;
        this.f10322 = str2;
        this.f10323 = str3;
        this.f10324 = str4;
        this.f10325 = l2;
        this.f10326 = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3226)) {
            return false;
        }
        C3226 c3226 = (C3226) obj;
        return AbstractC1469.m3322(this.f10313, c3226.f10313) && AbstractC1469.m3322(this.f10314, c3226.f10314) && AbstractC1469.m3322(this.f10315, c3226.f10315) && AbstractC1469.m3322(this.f10316, c3226.f10316) && AbstractC1469.m3322(this.f10317, c3226.f10317) && AbstractC1469.m3322(this.f10318, c3226.f10318) && AbstractC1469.m3322(this.f10319, c3226.f10319) && AbstractC1469.m3322(this.f10320, c3226.f10320) && AbstractC1469.m3322(this.f10321, c3226.f10321) && AbstractC1469.m3322(this.f10322, c3226.f10322) && AbstractC1469.m3322(this.f10323, c3226.f10323) && AbstractC1469.m3322(this.f10324, c3226.f10324) && AbstractC1469.m3322(this.f10325, c3226.f10325) && AbstractC1469.m3322(this.f10326, c3226.f10326);
    }

    public final int hashCode() {
        Integer num = this.f10313;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f10314;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.f10315;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10316;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f10317;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C3244 c3244 = this.f10318;
        int iHashCode6 = (iHashCode5 + (c3244 == null ? 0 : c3244.hashCode())) * 31;
        C3265 c3265 = this.f10319;
        int iHashCode7 = (iHashCode6 + (c3265 == null ? 0 : c3265.hashCode())) * 31;
        C3397 c3397 = this.f10320;
        int iHashCode8 = (iHashCode7 + (c3397 == null ? 0 : c3397.hashCode())) * 31;
        C3397 c3398 = this.f10321;
        int iHashCode9 = (iHashCode8 + (c3398 == null ? 0 : c3398.hashCode())) * 31;
        String str2 = this.f10322;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10323;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10324;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f10325;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f10326;
        return iHashCode13 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("mk1Proto(support_screen_rotate=");
        sb.append(this.f10313);
        sb.append(", watch_uv=");
        sb.append(this.f10314);
        sb.append(", orig_duration=");
        sb.append(this.f10315);
        sb.append(", replay_switch_status=");
        sb.append(this.f10316);
        sb.append(", replay_transition_url=");
        sb.append(this.f10317);
        sb.append(", replay_transition_video_info=");
        sb.append(this.f10318);
        sb.append(", replay_transition_preload_info=");
        sb.append(this.f10319);
        sb.append(", anchor_specified=");
        sb.append(this.f10320);
        sb.append(", automatic_detection=");
        sb.append(this.f10321);
        sb.append(", replay_guide_page_url=");
        sb.append(this.f10322);
        sb.append(", hls_enc_url=");
        sb.append(this.f10323);
        sb.append(", hls_enc_token=");
        sb.append(this.f10324);
        sb.append(", ref_replay_object_id=");
        sb.append(this.f10325);
        sb.append(", replay_control_flag=");
        sb.append(this.f10326);
        sb.append(')');
        return sb.toString();
    }
}
