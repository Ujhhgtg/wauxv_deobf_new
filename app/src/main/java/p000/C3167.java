package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3167 {
    public static final C3166 Companion = new C3166();

    public final Integer f10146;

    public final Long f10147;

    public final Integer f10148;

    public final Integer f10149;

    public final String f10150;

    public final C3185 f10151;

    public final C3206 f10152;

    public final C3338 f10153;

    public final C3338 f10154;

    public final String f10155;

    public final String f10156;

    public final String f10157;

    public final Long f10158;

    public final Long f10159;

    public /* synthetic */ C3167(int i, Integer num, Long l, Integer num2, Integer num3, String str, C3185 c3185, C3206 c3206, C3338 c3338, C3338 c3339, String str2, String str3, String str4, Long l2, Long l3) {
        if (16383 != (i & 16383)) {
            AbstractC1270.m2997(i, 16383, C3165.f10145.mo1363());
            throw null;
        }
        this.f10146 = num;
        this.f10147 = l;
        this.f10148 = num2;
        this.f10149 = num3;
        this.f10150 = str;
        this.f10151 = c3185;
        this.f10152 = c3206;
        this.f10153 = c3338;
        this.f10154 = c3339;
        this.f10155 = str2;
        this.f10156 = str3;
        this.f10157 = str4;
        this.f10158 = l2;
        this.f10159 = l3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3167)) {
            return false;
        }
        C3167 c3167 = (C3167) obj;
        return AbstractC2207.m4087(this.f10146, c3167.f10146) && AbstractC2207.m4087(this.f10147, c3167.f10147) && AbstractC2207.m4087(this.f10148, c3167.f10148) && AbstractC2207.m4087(this.f10149, c3167.f10149) && AbstractC2207.m4087(this.f10150, c3167.f10150) && AbstractC2207.m4087(this.f10151, c3167.f10151) && AbstractC2207.m4087(this.f10152, c3167.f10152) && AbstractC2207.m4087(this.f10153, c3167.f10153) && AbstractC2207.m4087(this.f10154, c3167.f10154) && AbstractC2207.m4087(this.f10155, c3167.f10155) && AbstractC2207.m4087(this.f10156, c3167.f10156) && AbstractC2207.m4087(this.f10157, c3167.f10157) && AbstractC2207.m4087(this.f10158, c3167.f10158) && AbstractC2207.m4087(this.f10159, c3167.f10159);
    }

    public final int hashCode() {
        Integer num = this.f10146;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f10147;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.f10148;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10149;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.f10150;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C3185 c3185 = this.f10151;
        int iHashCode6 = (iHashCode5 + (c3185 == null ? 0 : c3185.hashCode())) * 31;
        C3206 c3206 = this.f10152;
        int iHashCode7 = (iHashCode6 + (c3206 == null ? 0 : c3206.hashCode())) * 31;
        C3338 c3338 = this.f10153;
        int iHashCode8 = (iHashCode7 + (c3338 == null ? 0 : c3338.hashCode())) * 31;
        C3338 c3339 = this.f10154;
        int iHashCode9 = (iHashCode8 + (c3339 == null ? 0 : c3339.hashCode())) * 31;
        String str2 = this.f10155;
        int iHashCode10 = (iHashCode9 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10156;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10157;
        int iHashCode12 = (iHashCode11 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l2 = this.f10158;
        int iHashCode13 = (iHashCode12 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f10159;
        return iHashCode13 + (l3 != null ? l3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("mk1Proto(support_screen_rotate=");
        sb.append(this.f10146);
        sb.append(", watch_uv=");
        sb.append(this.f10147);
        sb.append(", orig_duration=");
        sb.append(this.f10148);
        sb.append(", replay_switch_status=");
        sb.append(this.f10149);
        sb.append(", replay_transition_url=");
        sb.append(this.f10150);
        sb.append(", replay_transition_video_info=");
        sb.append(this.f10151);
        sb.append(", replay_transition_preload_info=");
        sb.append(this.f10152);
        sb.append(", anchor_specified=");
        sb.append(this.f10153);
        sb.append(", automatic_detection=");
        sb.append(this.f10154);
        sb.append(", replay_guide_page_url=");
        sb.append(this.f10155);
        sb.append(", hls_enc_url=");
        sb.append(this.f10156);
        sb.append(", hls_enc_token=");
        sb.append(this.f10157);
        sb.append(", ref_replay_object_id=");
        sb.append(this.f10158);
        sb.append(", replay_control_flag=");
        sb.append(this.f10159);
        sb.append(')');
        return sb.toString();
    }
}
