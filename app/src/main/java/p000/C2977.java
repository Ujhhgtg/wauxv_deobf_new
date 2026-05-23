package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2977 {
    public static final C2976 Companion = new C2976();

    public static final InterfaceC1758[] f9520 = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC1458.m3163(new C2083(18)), null, AbstractC1458.m3163(new C2083(19)), null};

    public final String f9521;

    public final Integer f9522;

    public final String f9523;

    public final String f9524;

    public final Integer f9525;

    public final String f9526;

    public final Integer f9527;

    public final Integer f9528;

    public final String f9529;

    public final C2986 f9530;

    public final String f9531;

    public final Integer f9532;

    public final Integer f9533;

    public final Integer f9534;

    public final String f9535;

    public final Integer f9536;

    public final String f9537;

    public final String f9538;

    public final String f9539;

    public final String f9540;

    public final Integer f9541;

    public final String f9542;

    public final String f9543;

    public final Integer f9544;

    public final Long f9545;

    public final String f9546;

    public final String f9547;

    public final Integer f9548;

    public final String f9549;

    public final String f9550;

    public final Integer f9551;

    public final String f9552;

    public final String f9553;

    public final Boolean f9554;

    public final String f9555;

    public final String f9556;

    public final Float f9557;

    public final Integer f9558;

    public final List f9559;

    public final String f9560;

    public final List f9561;

    public final C2983 f9562;

    public /* synthetic */ C2977(int i, int i2, String str, Integer num, String str2, String str3, Integer num2, String str4, Integer num3, Integer num4, String str5, C2986 c2986, String str6, Integer num5, Integer num6, Integer num7, String str7, Integer num8, String str8, String str9, String str10, String str11, Integer num9, String str12, String str13, Integer num10, Long l, String str14, String str15, Integer num11, String str16, String str17, Integer num12, String str18, String str19, Boolean bool, String str20, String str21, Float f, Integer num13, List list, String str22, List list2, C2983 c2983) {
        if ((1023 != (i2 & 1023)) || (-1 != i)) {
            AbstractC1270.m2996(new int[]{i, i2}, new int[]{-1, 1023}, C2975.f9519.mo1363());
            throw null;
        }
        this.f9521 = str;
        this.f9522 = num;
        this.f9523 = str2;
        this.f9524 = str3;
        this.f9525 = num2;
        this.f9526 = str4;
        this.f9527 = num3;
        this.f9528 = num4;
        this.f9529 = str5;
        this.f9530 = c2986;
        this.f9531 = str6;
        this.f9532 = num5;
        this.f9533 = num6;
        this.f9534 = num7;
        this.f9535 = str7;
        this.f9536 = num8;
        this.f9537 = str8;
        this.f9538 = str9;
        this.f9539 = str10;
        this.f9540 = str11;
        this.f9541 = num9;
        this.f9542 = str12;
        this.f9543 = str13;
        this.f9544 = num10;
        this.f9545 = l;
        this.f9546 = str14;
        this.f9547 = str15;
        this.f9548 = num11;
        this.f9549 = str16;
        this.f9550 = str17;
        this.f9551 = num12;
        this.f9552 = str18;
        this.f9553 = str19;
        this.f9554 = bool;
        this.f9555 = str20;
        this.f9556 = str21;
        this.f9557 = f;
        this.f9558 = num13;
        this.f9559 = list;
        this.f9560 = str22;
        this.f9561 = list2;
        this.f9562 = c2983;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2977)) {
            return false;
        }
        C2977 c2977 = (C2977) obj;
        return AbstractC2207.m4087(this.f9521, c2977.f9521) && AbstractC2207.m4087(this.f9522, c2977.f9522) && AbstractC2207.m4087(this.f9523, c2977.f9523) && AbstractC2207.m4087(this.f9524, c2977.f9524) && AbstractC2207.m4087(this.f9525, c2977.f9525) && AbstractC2207.m4087(this.f9526, c2977.f9526) && AbstractC2207.m4087(this.f9527, c2977.f9527) && AbstractC2207.m4087(this.f9528, c2977.f9528) && AbstractC2207.m4087(this.f9529, c2977.f9529) && AbstractC2207.m4087(this.f9530, c2977.f9530) && AbstractC2207.m4087(this.f9531, c2977.f9531) && AbstractC2207.m4087(this.f9532, c2977.f9532) && AbstractC2207.m4087(this.f9533, c2977.f9533) && AbstractC2207.m4087(this.f9534, c2977.f9534) && AbstractC2207.m4087(this.f9535, c2977.f9535) && AbstractC2207.m4087(this.f9536, c2977.f9536) && AbstractC2207.m4087(this.f9537, c2977.f9537) && AbstractC2207.m4087(this.f9538, c2977.f9538) && AbstractC2207.m4087(this.f9539, c2977.f9539) && AbstractC2207.m4087(this.f9540, c2977.f9540) && AbstractC2207.m4087(this.f9541, c2977.f9541) && AbstractC2207.m4087(this.f9542, c2977.f9542) && AbstractC2207.m4087(this.f9543, c2977.f9543) && AbstractC2207.m4087(this.f9544, c2977.f9544) && AbstractC2207.m4087(this.f9545, c2977.f9545) && AbstractC2207.m4087(this.f9546, c2977.f9546) && AbstractC2207.m4087(this.f9547, c2977.f9547) && AbstractC2207.m4087(this.f9548, c2977.f9548) && AbstractC2207.m4087(this.f9549, c2977.f9549) && AbstractC2207.m4087(this.f9550, c2977.f9550) && AbstractC2207.m4087(this.f9551, c2977.f9551) && AbstractC2207.m4087(this.f9552, c2977.f9552) && AbstractC2207.m4087(this.f9553, c2977.f9553) && AbstractC2207.m4087(this.f9554, c2977.f9554) && AbstractC2207.m4087(this.f9555, c2977.f9555) && AbstractC2207.m4087(this.f9556, c2977.f9556) && AbstractC2207.m4087(this.f9557, c2977.f9557) && AbstractC2207.m4087(this.f9558, c2977.f9558) && AbstractC2207.m4087(this.f9559, c2977.f9559) && AbstractC2207.m4087(this.f9560, c2977.f9560) && AbstractC2207.m4087(this.f9561, c2977.f9561) && AbstractC2207.m4087(this.f9562, c2977.f9562);
    }

    public final int hashCode() {
        String str = this.f9521;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9522;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9523;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9524;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.f9525;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f9526;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num3 = this.f9527;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9528;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.f9529;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C2986 c2986 = this.f9530;
        int iHashCode10 = (iHashCode9 + (c2986 == null ? 0 : c2986.hashCode())) * 31;
        String str6 = this.f9531;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num5 = this.f9532;
        int iHashCode12 = (iHashCode11 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f9533;
        int iHashCode13 = (iHashCode12 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.f9534;
        int iHashCode14 = (iHashCode13 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str7 = this.f9535;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num8 = this.f9536;
        int iHashCode16 = (iHashCode15 + (num8 == null ? 0 : num8.hashCode())) * 31;
        String str8 = this.f9537;
        int iHashCode17 = (iHashCode16 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f9538;
        int iHashCode18 = (iHashCode17 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f9539;
        int iHashCode19 = (iHashCode18 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f9540;
        int iHashCode20 = (iHashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        Integer num9 = this.f9541;
        int iHashCode21 = (iHashCode20 + (num9 == null ? 0 : num9.hashCode())) * 31;
        String str12 = this.f9542;
        int iHashCode22 = (iHashCode21 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f9543;
        int iHashCode23 = (iHashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Integer num10 = this.f9544;
        int iHashCode24 = (iHashCode23 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Long l = this.f9545;
        int iHashCode25 = (iHashCode24 + (l == null ? 0 : l.hashCode())) * 31;
        String str14 = this.f9546;
        int iHashCode26 = (iHashCode25 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f9547;
        int iHashCode27 = (iHashCode26 + (str15 == null ? 0 : str15.hashCode())) * 31;
        Integer num11 = this.f9548;
        int iHashCode28 = (iHashCode27 + (num11 == null ? 0 : num11.hashCode())) * 31;
        String str16 = this.f9549;
        int iHashCode29 = (iHashCode28 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f9550;
        int iHashCode30 = (iHashCode29 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Integer num12 = this.f9551;
        int iHashCode31 = (iHashCode30 + (num12 == null ? 0 : num12.hashCode())) * 31;
        String str18 = this.f9552;
        int iHashCode32 = (iHashCode31 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.f9553;
        int iHashCode33 = (iHashCode32 + (str19 == null ? 0 : str19.hashCode())) * 31;
        Boolean bool = this.f9554;
        int iHashCode34 = (iHashCode33 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str20 = this.f9555;
        int iHashCode35 = (iHashCode34 + (str20 == null ? 0 : str20.hashCode())) * 31;
        String str21 = this.f9556;
        int iHashCode36 = (iHashCode35 + (str21 == null ? 0 : str21.hashCode())) * 31;
        Float f = this.f9557;
        int iHashCode37 = (iHashCode36 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num13 = this.f9558;
        int iHashCode38 = (iHashCode37 + (num13 == null ? 0 : num13.hashCode())) * 31;
        List list = this.f9559;
        int iHashCode39 = (iHashCode38 + (list == null ? 0 : list.hashCode())) * 31;
        String str22 = this.f9560;
        int iHashCode40 = (iHashCode39 + (str22 == null ? 0 : str22.hashCode())) * 31;
        List list2 = this.f9561;
        int iHashCode41 = (iHashCode40 + (list2 == null ? 0 : list2.hashCode())) * 31;
        C2983 c2983 = this.f9562;
        return iHashCode41 + (c2983 != null ? c2983.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("MediaProto(id=");
        sb.append(this.f9521);
        sb.append(", type=");
        sb.append(this.f9522);
        sb.append(", description=");
        sb.append(this.f9523);
        sb.append(", url=");
        sb.append(this.f9524);
        sb.append(", url_type=");
        sb.append(this.f9525);
        sb.append(", thumb=");
        sb.append(this.f9526);
        sb.append(", thumb_type=");
        sb.append(this.f9527);
        sb.append(", privated=");
        sb.append(this.f9528);
        sb.append(", title=");
        sb.append(this.f9529);
        sb.append(", size=");
        sb.append(this.f9530);
        sb.append(", lowBandUrl=");
        sb.append(this.f9531);
        sb.append(", lowBandUrl_type=");
        sb.append(this.f9532);
        sb.append(", s=");
        sb.append(this.f9533);
        sb.append(", t=");
        sb.append(this.f9534);
        sb.append(", userData=");
        sb.append(this.f9535);
        sb.append(", subType=");
        sb.append(this.f9536);
        sb.append(", sightMd5=");
        sb.append(this.f9537);
        sb.append(", attachUrl=");
        sb.append(this.f9538);
        sb.append(", url_md5=");
        sb.append(this.f9539);
        sb.append(", attachUrl_md5=");
        sb.append(this.f9540);
        sb.append(", attachTotalTime=");
        sb.append(this.f9541);
        sb.append(", attachThumbUrl=");
        sb.append(this.f9542);
        sb.append(", attachShareTitle=");
        sb.append(this.f9543);
        sb.append(", enc=");
        sb.append(this.f9544);
        sb.append(", enc_key=");
        sb.append(this.f9545);
        sb.append(", md5_url=");
        sb.append(this.f9546);
        sb.append(", url_token=");
        sb.append(this.f9547);
        sb.append(", url_enc_idx=");
        sb.append(this.f9548);
        sb.append(", url_key=");
        sb.append(this.f9549);
        sb.append(", thumb_token=");
        sb.append(this.f9550);
        sb.append(", thumb_enc_idx=");
        sb.append(this.f9551);
        sb.append(", thumb_key=");
        sb.append(this.f9552);
        sb.append(", url_videomd5=");
        sb.append(this.f9553);
        sb.append(", isAd=");
        sb.append(this.f9554);
        sb.append(", songalbumurl=");
        sb.append(this.f9555);
        sb.append(", songlyric=");
        sb.append(this.f9556);
        sb.append(", videoDuration=");
        sb.append(this.f9557);
        sb.append(", mediaType=");
        sb.append(this.f9558);
        sb.append(", videoColdDLRuleList=");
        sb.append(this.f9559);
        sb.append(", videoFlag=");
        sb.append(this.f9560);
        sb.append(", emotionList=");
        sb.append(this.f9561);
        sb.append(", scanCodeInfo=");
        sb.append(this.f9562);
        sb.append(')');
        return sb.toString();
    }
}
