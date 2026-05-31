package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲈᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3099 {
    public static final C3098 Companion = new C3098();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9908 = {null, null, null, null, null, null, null, null, null, AbstractC2240.m4259(new C2096(24))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9909;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9912;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Long f9914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f9915;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Boolean f9916;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f9917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final List f9918;

    public /* synthetic */ C3099(int i, String str, Long l, Long l2, String str2, String str3, Long l3, Boolean bool, Boolean bool2, Integer num, List list) {
        if (1023 != (i & 1023)) {
            AbstractC2234.m4187(i, 1023, C3097.f9907.mo1509());
            throw null;
        }
        this.f9909 = str;
        this.f9910 = l;
        this.f9911 = l2;
        this.f9912 = str2;
        this.f9913 = str3;
        this.f9914 = l3;
        this.f9915 = bool;
        this.f9916 = bool2;
        this.f9917 = num;
        this.f9918 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3099)) {
            return false;
        }
        C3099 c3099 = (C3099) obj;
        return AbstractC1469.m3322(this.f9909, c3099.f9909) && AbstractC1469.m3322(this.f9910, c3099.f9910) && AbstractC1469.m3322(this.f9911, c3099.f9911) && AbstractC1469.m3322(this.f9912, c3099.f9912) && AbstractC1469.m3322(this.f9913, c3099.f9913) && AbstractC1469.m3322(this.f9914, c3099.f9914) && AbstractC1469.m3322(this.f9915, c3099.f9915) && AbstractC1469.m3322(this.f9916, c3099.f9916) && AbstractC1469.m3322(this.f9917, c3099.f9917) && AbstractC1469.m3322(this.f9918, c3099.f9918);
    }

    public final int hashCode() {
        String str = this.f9909;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f9910;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9911;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str2 = this.f9912;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9913;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Long l3 = this.f9914;
        int iHashCode6 = (iHashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Boolean bool = this.f9915;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9916;
        int iHashCode8 = (iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f9917;
        int iHashCode9 = (iHashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        List list = this.f9918;
        return iHashCode9 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("cp1Proto(live_ad_id=");
        sb.append(this.f9909);
        sb.append(", start_time_ms=");
        sb.append(this.f9910);
        sb.append(", video_duration_ms=");
        sb.append(this.f9911);
        sb.append(", video_url=");
        sb.append(this.f9912);
        sb.append(", bg_img_url=");
        sb.append(this.f9913);
        sb.append(", end_time_ms=");
        sb.append(this.f9914);
        sb.append(", need_watch_multi_entrance_ad=");
        sb.append(this.f9915);
        sb.append(", need_preload=");
        sb.append(this.f9916);
        sb.append(", preload_percent=");
        sb.append(this.f9917);
        sb.append(", show_time_intervals=");
        sb.append(this.f9918);
        sb.append(')');
        return sb.toString();
    }
}
