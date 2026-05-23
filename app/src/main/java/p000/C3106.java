package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;
import okhttp3.internal.http2.Settings;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᤞᲇᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3106 {
    public static final C3105 Companion = new C3105();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9909 = {null, null, null, null, null, null, null, null, null, null, AbstractC1458.m3163(new C2083(28)), null, null, null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C2956 f9910;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9912;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f9914;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3197 f9915;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9916;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f9917;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f9918;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Boolean f9919;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final List f9920;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Integer f9921;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Long f9922;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Boolean f9923;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final Long f9924;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final C3025 f9925;

    public /* synthetic */ C3106(int i, C2956 c2956, Integer num, Integer num2, Integer num3, Integer num4, C3197 c3197, String str, Integer num5, String str2, Boolean bool, List list, Integer num6, Long l, Boolean bool2, Long l2, C3025 c3025) {
        if (65535 != (i & Settings.DEFAULT_INITIAL_WINDOW_SIZE)) {
            AbstractC1270.m2997(i, Settings.DEFAULT_INITIAL_WINDOW_SIZE, C3104.f9908.mo1363());
            throw null;
        }
        this.f9910 = c2956;
        this.f9911 = num;
        this.f9912 = num2;
        this.f9913 = num3;
        this.f9914 = num4;
        this.f9915 = c3197;
        this.f9916 = str;
        this.f9917 = num5;
        this.f9918 = str2;
        this.f9919 = bool;
        this.f9920 = list;
        this.f9921 = num6;
        this.f9922 = l;
        this.f9923 = bool2;
        this.f9924 = l2;
        this.f9925 = c3025;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3106)) {
            return false;
        }
        C3106 c3106 = (C3106) obj;
        return AbstractC2207.m4087(this.f9910, c3106.f9910) && AbstractC2207.m4087(this.f9911, c3106.f9911) && AbstractC2207.m4087(this.f9912, c3106.f9912) && AbstractC2207.m4087(this.f9913, c3106.f9913) && AbstractC2207.m4087(this.f9914, c3106.f9914) && AbstractC2207.m4087(this.f9915, c3106.f9915) && AbstractC2207.m4087(this.f9916, c3106.f9916) && AbstractC2207.m4087(this.f9917, c3106.f9917) && AbstractC2207.m4087(this.f9918, c3106.f9918) && AbstractC2207.m4087(this.f9919, c3106.f9919) && AbstractC2207.m4087(this.f9920, c3106.f9920) && AbstractC2207.m4087(this.f9921, c3106.f9921) && AbstractC2207.m4087(this.f9922, c3106.f9922) && AbstractC2207.m4087(this.f9923, c3106.f9923) && AbstractC2207.m4087(this.f9924, c3106.f9924) && AbstractC2207.m4087(this.f9925, c3106.f9925);
    }

    public final int hashCode() {
        C2956 c2956 = this.f9910;
        int iHashCode = (c2956 == null ? 0 : c2956.hashCode()) * 31;
        Integer num = this.f9911;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9912;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9913;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9914;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C3197 c3197 = this.f9915;
        int iHashCode6 = (iHashCode5 + (c3197 == null ? 0 : c3197.hashCode())) * 31;
        String str = this.f9916;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f9917;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.f9918;
        int iHashCode9 = (iHashCode8 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f9919;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.f9920;
        int iHashCode11 = (iHashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num6 = this.f9921;
        int iHashCode12 = (iHashCode11 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.f9922;
        int iHashCode13 = (iHashCode12 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.f9923;
        int iHashCode14 = (iHashCode13 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l2 = this.f9924;
        int iHashCode15 = (iHashCode14 + (l2 == null ? 0 : l2.hashCode())) * 31;
        C3025 c3025 = this.f9925;
        return iHashCode15 + (c3025 != null ? c3025.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("j71Proto(contact=");
        sb.append(this.f9910);
        sb.append(", enableComment=");
        sb.append(this.f9911);
        sb.append(", disableComment=");
        sb.append(this.f9912);
        sb.append(", reward_amount_in_heat=");
        sb.append(this.f9913);
        sb.append(", live_contact_flag=");
        sb.append(this.f9914);
        sb.append(", badge_info=");
        sb.append(this.f9915);
        sb.append(", display_nickname=");
        sb.append(this.f9916);
        sb.append(", live_identity=");
        sb.append(this.f9917);
        sb.append(", live_bg_img_url=");
        sb.append(this.f9918);
        sb.append(", disable_personal_msg=");
        sb.append(this.f9919);
        sb.append(", badge_infos=");
        sb.append(this.f9920);
        sb.append(", consume_coin_amount=");
        sb.append(this.f9921);
        sb.append(", intimacy=");
        sb.append(this.f9922);
        sb.append(", is_self_for_web=");
        sb.append(this.f9923);
        sb.append(", live_heat_value=");
        sb.append(this.f9924);
        sb.append(", voice_live_img=");
        sb.append(this.f9925);
        sb.append(')');
        return sb.toString();
    }
}
