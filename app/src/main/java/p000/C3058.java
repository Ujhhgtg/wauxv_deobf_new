package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3058 {
    public static final C3057 Companion = new C3057();

    public final String f9791;

    public final C3043 f9792;

    public final C3043 f9793;

    public final C3043 f9794;

    public final C3043 f9795;

    public final Float f9796;

    public final String f9797;

    public final Boolean f9798;

    public final Boolean f9799;

    public final String f9800;

    public final String f9801;

    public final String f9802;

    public final Integer f9803;

    public final C3043 f9804;

    public final C3043 f9805;

    public final C3043 f9806;

    public final C3043 f9807;

    public final C3043 f9808;

    public /* synthetic */ C3058(int i, String str, C3043 c3043, C3043 c3044, C3043 c3045, C3043 c3046, Float f, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, Integer num, C3043 c3047, C3043 c3048, C3043 c3049, C3043 c30410, C3043 c30411) {
        if (262143 != (i & 262143)) {
            AbstractC1270.m2997(i, 262143, C3056.f9790.mo1363());
            throw null;
        }
        this.f9791 = str;
        this.f9792 = c3043;
        this.f9793 = c3044;
        this.f9794 = c3045;
        this.f9795 = c3046;
        this.f9796 = f;
        this.f9797 = str2;
        this.f9798 = bool;
        this.f9799 = bool2;
        this.f9800 = str3;
        this.f9801 = str4;
        this.f9802 = str5;
        this.f9803 = num;
        this.f9804 = c3047;
        this.f9805 = c3048;
        this.f9806 = c3049;
        this.f9807 = c30410;
        this.f9808 = c30411;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3058)) {
            return false;
        }
        C3058 c3058 = (C3058) obj;
        return AbstractC2207.m4087(this.f9791, c3058.f9791) && AbstractC2207.m4087(this.f9792, c3058.f9792) && AbstractC2207.m4087(this.f9793, c3058.f9793) && AbstractC2207.m4087(this.f9794, c3058.f9794) && AbstractC2207.m4087(this.f9795, c3058.f9795) && AbstractC2207.m4087(this.f9796, c3058.f9796) && AbstractC2207.m4087(this.f9797, c3058.f9797) && AbstractC2207.m4087(this.f9798, c3058.f9798) && AbstractC2207.m4087(this.f9799, c3058.f9799) && AbstractC2207.m4087(this.f9800, c3058.f9800) && AbstractC2207.m4087(this.f9801, c3058.f9801) && AbstractC2207.m4087(this.f9802, c3058.f9802) && AbstractC2207.m4087(this.f9803, c3058.f9803) && AbstractC2207.m4087(this.f9804, c3058.f9804) && AbstractC2207.m4087(this.f9805, c3058.f9805) && AbstractC2207.m4087(this.f9806, c3058.f9806) && AbstractC2207.m4087(this.f9807, c3058.f9807) && AbstractC2207.m4087(this.f9808, c3058.f9808);
    }

    public final int hashCode() {
        String str = this.f9791;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3043 c3043 = this.f9792;
        int iHashCode2 = (iHashCode + (c3043 == null ? 0 : c3043.hashCode())) * 31;
        C3043 c3044 = this.f9793;
        int iHashCode3 = (iHashCode2 + (c3044 == null ? 0 : c3044.hashCode())) * 31;
        C3043 c3045 = this.f9794;
        int iHashCode4 = (iHashCode3 + (c3045 == null ? 0 : c3045.hashCode())) * 31;
        C3043 c3046 = this.f9795;
        int iHashCode5 = (iHashCode4 + (c3046 == null ? 0 : c3046.hashCode())) * 31;
        Float f = this.f9796;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        String str2 = this.f9797;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.f9798;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9799;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str3 = this.f9800;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9801;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9802;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f9803;
        int iHashCode13 = (iHashCode12 + (num == null ? 0 : num.hashCode())) * 31;
        C3043 c3047 = this.f9804;
        int iHashCode14 = (iHashCode13 + (c3047 == null ? 0 : c3047.hashCode())) * 31;
        C3043 c3048 = this.f9805;
        int iHashCode15 = (iHashCode14 + (c3048 == null ? 0 : c3048.hashCode())) * 31;
        C3043 c3049 = this.f9806;
        int iHashCode16 = (iHashCode15 + (c3049 == null ? 0 : c3049.hashCode())) * 31;
        C3043 c30410 = this.f9807;
        int iHashCode17 = (iHashCode16 + (c30410 == null ? 0 : c30410.hashCode())) * 31;
        C3043 c30411 = this.f9808;
        return iHashCode17 + (c30411 != null ? c30411.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ec5Proto(reward_product_id=");
        sb.append(this.f9791);
        sb.append(", business_type=");
        sb.append(this.f9792);
        sb.append(", thumbnail_file_url=");
        sb.append(this.f9793);
        sb.append(", preview_pag_url=");
        sb.append(this.f9794);
        sb.append(", animation_pag_url=");
        sb.append(this.f9795);
        sb.append(", thumbnail_file_md5=");
        sb.append(this.f9796);
        sb.append(", preview_pag_md5=");
        sb.append(this.f9797);
        sb.append(", animation_pag_md5=");
        sb.append(this.f9798);
        sb.append(", name=");
        sb.append(this.f9799);
        sb.append(", price=");
        sb.append(this.f9800);
        sb.append(", gift_type=");
        sb.append(this.f9801);
        sb.append(", unlock_intimacy_level=");
        sb.append(this.f9802);
        sb.append(", flag=");
        sb.append(this.f9803);
        sb.append(", landscape_animation_pag_url=");
        sb.append(this.f9804);
        sb.append(", landscape_animation_pag_md5=");
        sb.append(this.f9805);
        sb.append(", custom_info=");
        sb.append(this.f9806);
        sb.append(", unlock_global_reward_level=");
        sb.append(this.f9807);
        sb.append(", tag_color=");
        sb.append(this.f9808);
        sb.append(')');
        return sb.toString();
    }
}
