package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᛸᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3146 {
    public static final C3145 Companion = new C3145();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10005 = {null, null, AbstractC1458.m3163(new C3125(4)), null, null, null, null, null, null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10007;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final List f10008;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3094 f10009;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3173 f10012;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10013;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10015;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10016;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Long f10017;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f10018;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Integer f10019;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Integer f10020;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final String f10021;

    public /* synthetic */ C3146(int i, Long l, String str, List list, C3094 c3094, Integer num, Integer num2, C3173 c3173, String str2, Integer num3, Integer num4, String str3, Long l2, Integer num5, Integer num6, Integer num7, String str4) {
        if (65535 != (i & 65535)) {
            AbstractC1270.m2997(i, 65535, C3144.f10004.mo1363());
            throw null;
        }
        this.f10006 = l;
        this.f10007 = str;
        this.f10008 = list;
        this.f10009 = c3094;
        this.f10010 = num;
        this.f10011 = num2;
        this.f10012 = c3173;
        this.f10013 = str2;
        this.f10014 = num3;
        this.f10015 = num4;
        this.f10016 = str3;
        this.f10017 = l2;
        this.f10018 = num5;
        this.f10019 = num6;
        this.f10020 = num7;
        this.f10021 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3146)) {
            return false;
        }
        C3146 c3146 = (C3146) obj;
        return AbstractC2207.m4087(this.f10006, c3146.f10006) && AbstractC2207.m4087(this.f10007, c3146.f10007) && AbstractC2207.m4087(this.f10008, c3146.f10008) && AbstractC2207.m4087(this.f10009, c3146.f10009) && AbstractC2207.m4087(this.f10010, c3146.f10010) && AbstractC2207.m4087(this.f10011, c3146.f10011) && AbstractC2207.m4087(this.f10012, c3146.f10012) && AbstractC2207.m4087(this.f10013, c3146.f10013) && AbstractC2207.m4087(this.f10014, c3146.f10014) && AbstractC2207.m4087(this.f10015, c3146.f10015) && AbstractC2207.m4087(this.f10016, c3146.f10016) && AbstractC2207.m4087(this.f10017, c3146.f10017) && AbstractC2207.m4087(this.f10018, c3146.f10018) && AbstractC2207.m4087(this.f10019, c3146.f10019) && AbstractC2207.m4087(this.f10020, c3146.f10020) && AbstractC2207.m4087(this.f10021, c3146.f10021);
    }

    public final int hashCode() {
        Long l = this.f10006;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        String str = this.f10007;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List list = this.f10008;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C3094 c3094 = this.f10009;
        int iHashCode4 = (iHashCode3 + (c3094 == null ? 0 : c3094.hashCode())) * 31;
        Integer num = this.f10010;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10011;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C3173 c3173 = this.f10012;
        int iHashCode7 = (iHashCode6 + (c3173 == null ? 0 : c3173.hashCode())) * 31;
        String str2 = this.f10013;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f10014;
        int iHashCode9 = (iHashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10015;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str3 = this.f10016;
        int iHashCode11 = (iHashCode10 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l2 = this.f10017;
        int iHashCode12 = (iHashCode11 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num5 = this.f10018;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f10019;
        int iHashCode14 = (iHashCode13 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f10020;
        int iHashCode15 = (iHashCode14 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str4 = this.f10021;
        return iHashCode15 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("lt1Proto(music_topic_id=");
        sb.append(this.f10006);
        sb.append(", music_topic_name=");
        sb.append(this.f10007);
        sb.append(", singers=");
        sb.append(this.f10008);
        sb.append(", music_info=");
        sb.append(this.f10009);
        sb.append(", feed_count=");
        sb.append(this.f10010);
        sb.append(", read_count=");
        sb.append(this.f10011);
        sb.append(", tab_info=");
        sb.append(this.f10012);
        sb.append(", cover_img_url=");
        sb.append(this.f10013);
        sb.append(", fav_available_flag=");
        sb.append(this.f10014);
        sb.append(", fav_flag=");
        sb.append(this.f10015);
        sb.append(", miaojian_sdk_prefix=");
        sb.append(this.f10016);
        sb.append(", listen_song_id=");
        sb.append(this.f10017);
        sb.append(", listen_song_like_flag=");
        sb.append(this.f10018);
        sb.append(", copyright_mark=");
        sb.append(this.f10019);
        sb.append(", music_source_type=");
        sb.append(this.f10020);
        sb.append(", music_audio_id=");
        return AbstractC1194.m2786(sb, this.f10021, ')');
    }
}
