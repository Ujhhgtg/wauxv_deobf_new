package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᛸᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3205 {
    public static final C3204 Companion = new C3204();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10172 = {null, null, AbstractC2240.m4259(new C3163(6)), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10173;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10174;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f10175;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3153 f10176;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3232 f10179;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10180;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10181;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10182;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Long f10184;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f10185;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Integer f10186;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Integer f10187;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final String f10188;

    public /* synthetic */ C3205(int i, Long l, String str, List list, C3153 c3153, Integer num, Integer num2, C3232 c3232, String str2, Integer num3, Integer num4, String str3, Long l2, Integer num5, Integer num6, Integer num7, String str4) {
        if (65535 != (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            AbstractC2234.m4187(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE, C3203.f10171.mo1509());
            throw null;
        }
        this.f10173 = l;
        this.f10174 = str;
        this.f10175 = list;
        this.f10176 = c3153;
        this.f10177 = num;
        this.f10178 = num2;
        this.f10179 = c3232;
        this.f10180 = str2;
        this.f10181 = num3;
        this.f10182 = num4;
        this.f10183 = str3;
        this.f10184 = l2;
        this.f10185 = num5;
        this.f10186 = num6;
        this.f10187 = num7;
        this.f10188 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3205)) {
            return false;
        }
        C3205 c3205 = (C3205) obj;
        return AbstractC1469.m3322(this.f10173, c3205.f10173) && AbstractC1469.m3322(this.f10174, c3205.f10174) && AbstractC1469.m3322(this.f10175, c3205.f10175) && AbstractC1469.m3322(this.f10176, c3205.f10176) && AbstractC1469.m3322(this.f10177, c3205.f10177) && AbstractC1469.m3322(this.f10178, c3205.f10178) && AbstractC1469.m3322(this.f10179, c3205.f10179) && AbstractC1469.m3322(this.f10180, c3205.f10180) && AbstractC1469.m3322(this.f10181, c3205.f10181) && AbstractC1469.m3322(this.f10182, c3205.f10182) && AbstractC1469.m3322(this.f10183, c3205.f10183) && AbstractC1469.m3322(this.f10184, c3205.f10184) && AbstractC1469.m3322(this.f10185, c3205.f10185) && AbstractC1469.m3322(this.f10186, c3205.f10186) && AbstractC1469.m3322(this.f10187, c3205.f10187) && AbstractC1469.m3322(this.f10188, c3205.f10188);
    }

    public final int hashCode() {
        Long l = this.f10173;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f10174;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f10175;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C3153 c3153 = this.f10176;
        int iHashCode4 = (iHashCode3 + (c3153 == null ? 0 : c3153.hashCode())) * 31;
        Integer num = this.f10177;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10178;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C3232 c3232 = this.f10179;
        int iHashCode7 = (iHashCode6 + (c3232 == null ? 0 : c3232.hashCode())) * 31;
        String str2 = this.f10180;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f10181;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10182;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f10183;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f10184;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.f10185;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f10186;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f10187;
        int iHashCode15 = (iHashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.f10188;
        return iHashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("lt1Proto(music_topic_id=");
        sb.append(this.f10173);
        sb.append(", music_topic_name=");
        sb.append(this.f10174);
        sb.append(", singers=");
        sb.append(this.f10175);
        sb.append(", music_info=");
        sb.append(this.f10176);
        sb.append(", feed_count=");
        sb.append(this.f10177);
        sb.append(", read_count=");
        sb.append(this.f10178);
        sb.append(", tab_info=");
        sb.append(this.f10179);
        sb.append(", cover_img_url=");
        sb.append(this.f10180);
        sb.append(", fav_available_flag=");
        sb.append(this.f10181);
        sb.append(", fav_flag=");
        sb.append(this.f10182);
        sb.append(", miaojian_sdk_prefix=");
        sb.append(this.f10183);
        sb.append(", listen_song_id=");
        sb.append(this.f10184);
        sb.append(", listen_song_like_flag=");
        sb.append(this.f10185);
        sb.append(", copyright_mark=");
        sb.append(this.f10186);
        sb.append(", music_source_type=");
        sb.append(this.f10187);
        sb.append(", music_audio_id=");
        return AbstractC1095.m2801(sb, this.f10188, ')');
    }
}
