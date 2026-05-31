package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲀᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3166 {
    public static final C3165 Companion = new C3165();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10077 = {null, null, null, null, null, null, null, null, null, null, AbstractC2240.m4259(new C3163(0)), null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10078;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10079;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10080;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10081;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10082;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3256 f10083;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10084;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10085;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10086;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Boolean f10087;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final List f10088;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Integer f10089;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Long f10090;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Boolean f10091;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Long f10092;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C3084 f10093;

    public /* synthetic */ C3166(int i, C3015 c3015, Integer num, Integer num2, Integer num3, Integer num4, C3256 c3256, String str, Integer num5, String str2, Boolean bool, List list, Integer num6, Long l, Boolean bool2, Long l2, C3084 c3084) {
        if (65535 != (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            AbstractC2234.m4187(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE, C3164.f10076.mo1509());
            throw null;
        }
        this.f10078 = c3015;
        this.f10079 = num;
        this.f10080 = num2;
        this.f10081 = num3;
        this.f10082 = num4;
        this.f10083 = c3256;
        this.f10084 = str;
        this.f10085 = num5;
        this.f10086 = str2;
        this.f10087 = bool;
        this.f10088 = list;
        this.f10089 = num6;
        this.f10090 = l;
        this.f10091 = bool2;
        this.f10092 = l2;
        this.f10093 = c3084;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3166)) {
            return false;
        }
        C3166 c3166 = (C3166) obj;
        return AbstractC1469.m3322(this.f10078, c3166.f10078) && AbstractC1469.m3322(this.f10079, c3166.f10079) && AbstractC1469.m3322(this.f10080, c3166.f10080) && AbstractC1469.m3322(this.f10081, c3166.f10081) && AbstractC1469.m3322(this.f10082, c3166.f10082) && AbstractC1469.m3322(this.f10083, c3166.f10083) && AbstractC1469.m3322(this.f10084, c3166.f10084) && AbstractC1469.m3322(this.f10085, c3166.f10085) && AbstractC1469.m3322(this.f10086, c3166.f10086) && AbstractC1469.m3322(this.f10087, c3166.f10087) && AbstractC1469.m3322(this.f10088, c3166.f10088) && AbstractC1469.m3322(this.f10089, c3166.f10089) && AbstractC1469.m3322(this.f10090, c3166.f10090) && AbstractC1469.m3322(this.f10091, c3166.f10091) && AbstractC1469.m3322(this.f10092, c3166.f10092) && AbstractC1469.m3322(this.f10093, c3166.f10093);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10078;
        int iHashCode = (c3015 == null ? 0 : c3015.hashCode()) * 31;
        Integer num = this.f10079;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10080;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10081;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10082;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C3256 c3256 = this.f10083;
        int iHashCode6 = (iHashCode5 + (c3256 == null ? 0 : c3256.hashCode())) * 31;
        String str = this.f10084;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f10085;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.f10086;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f10087;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f10088;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.f10089;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.f10090;
        int iHashCode13 = (iHashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.f10091;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.f10092;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        C3084 c3084 = this.f10093;
        return iHashCode15 + (c3084 != null ? c3084.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("j71Proto(contact=");
        sb.append(this.f10078);
        sb.append(", enableComment=");
        sb.append(this.f10079);
        sb.append(", disableComment=");
        sb.append(this.f10080);
        sb.append(", reward_amount_in_heat=");
        sb.append(this.f10081);
        sb.append(", live_contact_flag=");
        sb.append(this.f10082);
        sb.append(", badge_info=");
        sb.append(this.f10083);
        sb.append(", display_nickname=");
        sb.append(this.f10084);
        sb.append(", live_identity=");
        sb.append(this.f10085);
        sb.append(", live_bg_img_url=");
        sb.append(this.f10086);
        sb.append(", disable_personal_msg=");
        sb.append(this.f10087);
        sb.append(", badge_infos=");
        sb.append(this.f10088);
        sb.append(", consume_coin_amount=");
        sb.append(this.f10089);
        sb.append(", intimacy=");
        sb.append(this.f10090);
        sb.append(", is_self_for_web=");
        sb.append(this.f10091);
        sb.append(", live_heat_value=");
        sb.append(this.f10092);
        sb.append(", voice_live_img=");
        sb.append(this.f10093);
        sb.append(')');
        return sb.toString();
    }
}
