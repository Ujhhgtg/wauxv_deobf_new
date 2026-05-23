package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3251 {
    public static final C3250 Companion = new C3250();

    public final String f10309;

    public final Integer f10310;

    public final String f10311;

    public final String f10312;

    public final String f10313;

    public final String f10314;

    public final String f10315;

    public final String f10316;

    public final String f10317;

    public final Float f10318;

    public final Integer f10319;

    public final Integer f10320;

    public final Integer f10321;

    public final String f10322;

    public final String f10323;

    public final Integer f10324;

    public final String f10325;

    public final String f10326;

    public final Integer f10327;

    public final String f10328;

    public final String f10329;

    public final Long f10330;

    public final C3341 f10331;

    public final String f10332;

    public final C2962 f10333;

    public final Boolean f10334;

    public final Boolean f10335;

    public final C3359 f10336;

    public final C3052 f10337;

    public final C3272 f10338;

    public /* synthetic */ C3251(int i, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Float f, Integer num2, Integer num3, Integer num4, String str9, String str10, Integer num5, String str11, String str12, Integer num6, String str13, String str14, Long l, C3341 c3341, String str15, C2962 c2962, Boolean bool, Boolean bool2, C3359 c3359, C3052 c3052, C3272 c3272) {
        if (1073741823 != (i & 1073741823)) {
            AbstractC1270.m2997(i, 1073741823, C3249.f10308.mo1363());
            throw null;
        }
        this.f10309 = str;
        this.f10310 = num;
        this.f10311 = str2;
        this.f10312 = str3;
        this.f10313 = str4;
        this.f10314 = str5;
        this.f10315 = str6;
        this.f10316 = str7;
        this.f10317 = str8;
        this.f10318 = f;
        this.f10319 = num2;
        this.f10320 = num3;
        this.f10321 = num4;
        this.f10322 = str9;
        this.f10323 = str10;
        this.f10324 = num5;
        this.f10325 = str11;
        this.f10326 = str12;
        this.f10327 = num6;
        this.f10328 = str13;
        this.f10329 = str14;
        this.f10330 = l;
        this.f10331 = c3341;
        this.f10332 = str15;
        this.f10333 = c2962;
        this.f10334 = bool;
        this.f10335 = bool2;
        this.f10336 = c3359;
        this.f10337 = c3052;
        this.f10338 = c3272;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3251)) {
            return false;
        }
        C3251 c3251 = (C3251) obj;
        return AbstractC2207.m4087(this.f10309, c3251.f10309) && AbstractC2207.m4087(this.f10310, c3251.f10310) && AbstractC2207.m4087(this.f10311, c3251.f10311) && AbstractC2207.m4087(this.f10312, c3251.f10312) && AbstractC2207.m4087(this.f10313, c3251.f10313) && AbstractC2207.m4087(this.f10314, c3251.f10314) && AbstractC2207.m4087(this.f10315, c3251.f10315) && AbstractC2207.m4087(this.f10316, c3251.f10316) && AbstractC2207.m4087(this.f10317, c3251.f10317) && AbstractC2207.m4087(this.f10318, c3251.f10318) && AbstractC2207.m4087(this.f10319, c3251.f10319) && AbstractC2207.m4087(this.f10320, c3251.f10320) && AbstractC2207.m4087(this.f10321, c3251.f10321) && AbstractC2207.m4087(this.f10322, c3251.f10322) && AbstractC2207.m4087(this.f10323, c3251.f10323) && AbstractC2207.m4087(this.f10324, c3251.f10324) && AbstractC2207.m4087(this.f10325, c3251.f10325) && AbstractC2207.m4087(this.f10326, c3251.f10326) && AbstractC2207.m4087(this.f10327, c3251.f10327) && AbstractC2207.m4087(this.f10328, c3251.f10328) && AbstractC2207.m4087(this.f10329, c3251.f10329) && AbstractC2207.m4087(this.f10330, c3251.f10330) && AbstractC2207.m4087(this.f10331, c3251.f10331) && AbstractC2207.m4087(this.f10332, c3251.f10332) && AbstractC2207.m4087(this.f10333, c3251.f10333) && AbstractC2207.m4087(this.f10334, c3251.f10334) && AbstractC2207.m4087(this.f10335, c3251.f10335) && AbstractC2207.m4087(this.f10336, c3251.f10336) && AbstractC2207.m4087(this.f10337, c3251.f10337) && AbstractC2207.m4087(this.f10338, c3251.f10338);
    }

    public final int hashCode() {
        String str = this.f10309;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10310;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f10311;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10312;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10313;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10314;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10315;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10316;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10317;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Float f = this.f10318;
        int iHashCode10 = (iHashCode9 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f10319;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10320;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10321;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str9 = this.f10322;
        int iHashCode14 = (iHashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10323;
        int iHashCode15 = (iHashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num5 = this.f10324;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str11 = this.f10325;
        int iHashCode17 = (iHashCode16 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f10326;
        int iHashCode18 = (iHashCode17 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Integer num6 = this.f10327;
        int iHashCode19 = (iHashCode18 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str13 = this.f10328;
        int iHashCode20 = (iHashCode19 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f10329;
        int iHashCode21 = (iHashCode20 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Long l = this.f10330;
        int iHashCode22 = (iHashCode21 + (l == null ? 0 : l.hashCode())) * 31;
        C3341 c3341 = this.f10331;
        int iHashCode23 = (iHashCode22 + (c3341 == null ? 0 : c3341.hashCode())) * 31;
        String str15 = this.f10332;
        int iHashCode24 = (iHashCode23 + (str15 == null ? 0 : str15.hashCode())) * 31;
        C2962 c2962 = this.f10333;
        int iHashCode25 = (iHashCode24 + (c2962 == null ? 0 : c2962.hashCode())) * 31;
        Boolean bool = this.f10334;
        int iHashCode26 = (iHashCode25 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10335;
        int iHashCode27 = (iHashCode26 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        C3359 c3359 = this.f10336;
        int iHashCode28 = (iHashCode27 + (c3359 == null ? 0 : c3359.hashCode())) * 31;
        C3052 c3052 = this.f10337;
        int iHashCode29 = (iHashCode28 + (c3052 == null ? 0 : c3052.hashCode())) * 31;
        C3272 c3272 = this.f10338;
        return iHashCode29 + (c3272 != null ? c3272.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("sc1Proto(reward_product_id=");
        sb.append(this.f10309);
        sb.append(", business_type=");
        sb.append(this.f10310);
        sb.append(", thumbnail_file_url=");
        sb.append(this.f10311);
        sb.append(", preview_pag_url=");
        sb.append(this.f10312);
        sb.append(", animation_pag_url=");
        sb.append(this.f10313);
        sb.append(", thumbnail_file_md5=");
        sb.append(this.f10314);
        sb.append(", preview_pag_md5=");
        sb.append(this.f10315);
        sb.append(", animation_pag_md5=");
        sb.append(this.f10316);
        sb.append(", name=");
        sb.append(this.f10317);
        sb.append(", price=");
        sb.append(this.f10318);
        sb.append(", gift_type=");
        sb.append(this.f10319);
        sb.append(", unlock_intimacy_level=");
        sb.append(this.f10320);
        sb.append(", flag=");
        sb.append(this.f10321);
        sb.append(", landscape_animation_pag_url=");
        sb.append(this.f10322);
        sb.append(", landscape_animation_pag_md5=");
        sb.append(this.f10323);
        sb.append(", unlock_global_reward_level=");
        sb.append(this.f10324);
        sb.append(", tag_color=");
        sb.append(this.f10325);
        sb.append(", tag_text=");
        sb.append(this.f10326);
        sb.append(", unlock_member_level=");
        sb.append(this.f10327);
        sb.append(", interactive_gift_url=");
        sb.append(this.f10328);
        sb.append(", interactive_gift_md5=");
        sb.append(this.f10329);
        sb.append(", duration_time=");
        sb.append(this.f10330);
        sb.append(", batch_give_config_list=");
        sb.append(this.f10331);
        sb.append(", description=");
        sb.append(this.f10332);
        sb.append(", jump_info=");
        sb.append(this.f10333);
        sb.append(", need_unlock=");
        sb.append(this.f10334);
        sb.append(", disable_combo=");
        sb.append(this.f10335);
        sb.append(", multi_animation_list=");
        sb.append(this.f10336);
        sb.append(", switch_skin_info=");
        sb.append(this.f10337);
        sb.append(", custom_gift_info=");
        sb.append(this.f10338);
        sb.append(')');
        return sb.toString();
    }
}
