package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3397 {
    public static final C2947 Companion = new C2947();

    public final String f10697;

    public final String f10698;

    public final Integer f10699;

    public final Integer f10700;

    public final String f10701;

    public final C2974 f10702;

    public final C2937 f10703;

    public final C2950 f10704;

    public final String f10705;

    public final String f10706;

    public final String f10707;

    public final Integer f10708;

    public final Integer f10709;

    public final String f10710;

    public final C2931 f10711;

    public final Integer f10712;

    public final C2992 f10713;

    public final String f10714;

    public final String f10715;

    public final C3001 f10716;

    public final Integer f10717;

    public final C3004 f10718;

    public final Integer f10719;

    public final C2971 f10720;

    public final C2998 f10721;

    public final String f10722;

    public final Boolean f10723;

    public final C2968 f10724;

    public /* synthetic */ C3397(int i, String str, String str2, Integer num, Integer num2, String str3, C2974 c2974, C2937 c2937, C2950 c2950, String str4, String str5, String str6, Integer num3, Integer num4, String str7, C2931 c2931, Integer num5, C2992 c2992, String str8, String str9, C3001 c3001, Integer num6, C3004 c3004, Integer num7, C2971 c2971, C2998 c2998, String str10, Boolean bool, C2968 c2968) {
        if (268435455 != (i & 268435455)) {
            AbstractC1270.m2997(i, 268435455, C2928.f9393.mo1363());
            throw null;
        }
        this.f10697 = str;
        this.f10698 = str2;
        this.f10699 = num;
        this.f10700 = num2;
        this.f10701 = str3;
        this.f10702 = c2974;
        this.f10703 = c2937;
        this.f10704 = c2950;
        this.f10705 = str4;
        this.f10706 = str5;
        this.f10707 = str6;
        this.f10708 = num3;
        this.f10709 = num4;
        this.f10710 = str7;
        this.f10711 = c2931;
        this.f10712 = num5;
        this.f10713 = c2992;
        this.f10714 = str8;
        this.f10715 = str9;
        this.f10716 = c3001;
        this.f10717 = num6;
        this.f10718 = c3004;
        this.f10719 = num7;
        this.f10720 = c2971;
        this.f10721 = c2998;
        this.f10722 = str10;
        this.f10723 = bool;
        this.f10724 = c2968;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3397)) {
            return false;
        }
        C3397 c3397 = (C3397) obj;
        return AbstractC2207.m4087(this.f10697, c3397.f10697) && AbstractC2207.m4087(this.f10698, c3397.f10698) && AbstractC2207.m4087(this.f10699, c3397.f10699) && AbstractC2207.m4087(this.f10700, c3397.f10700) && AbstractC2207.m4087(this.f10701, c3397.f10701) && AbstractC2207.m4087(this.f10702, c3397.f10702) && AbstractC2207.m4087(this.f10703, c3397.f10703) && AbstractC2207.m4087(this.f10704, c3397.f10704) && AbstractC2207.m4087(this.f10705, c3397.f10705) && AbstractC2207.m4087(this.f10706, c3397.f10706) && AbstractC2207.m4087(this.f10707, c3397.f10707) && AbstractC2207.m4087(this.f10708, c3397.f10708) && AbstractC2207.m4087(this.f10709, c3397.f10709) && AbstractC2207.m4087(this.f10710, c3397.f10710) && AbstractC2207.m4087(this.f10711, c3397.f10711) && AbstractC2207.m4087(this.f10712, c3397.f10712) && AbstractC2207.m4087(this.f10713, c3397.f10713) && AbstractC2207.m4087(this.f10714, c3397.f10714) && AbstractC2207.m4087(this.f10715, c3397.f10715) && AbstractC2207.m4087(this.f10716, c3397.f10716) && AbstractC2207.m4087(this.f10717, c3397.f10717) && AbstractC2207.m4087(this.f10718, c3397.f10718) && AbstractC2207.m4087(this.f10719, c3397.f10719) && AbstractC2207.m4087(this.f10720, c3397.f10720) && AbstractC2207.m4087(this.f10721, c3397.f10721) && AbstractC2207.m4087(this.f10722, c3397.f10722) && AbstractC2207.m4087(this.f10723, c3397.f10723) && AbstractC2207.m4087(this.f10724, c3397.f10724);
    }

    public final int hashCode() {
        String str = this.f10697;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10698;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f10699;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10700;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f10701;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C2974 c2974 = this.f10702;
        int iHashCode6 = (iHashCode5 + (c2974 == null ? 0 : c2974.hashCode())) * 31;
        C2937 c2937 = this.f10703;
        int iHashCode7 = (iHashCode6 + (c2937 == null ? 0 : c2937.hashCode())) * 31;
        C2950 c2950 = this.f10704;
        int iHashCode8 = (iHashCode7 + (c2950 == null ? 0 : c2950.hashCode())) * 31;
        String str4 = this.f10705;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10706;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10707;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num3 = this.f10708;
        int iHashCode12 = (iHashCode11 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10709;
        int iHashCode13 = (iHashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.f10710;
        int iHashCode14 = (iHashCode13 + (str7 == null ? 0 : str7.hashCode())) * 31;
        C2931 c2931 = this.f10711;
        int iHashCode15 = (iHashCode14 + (c2931 == null ? 0 : c2931.hashCode())) * 31;
        Integer num5 = this.f10712;
        int iHashCode16 = (iHashCode15 + (num5 == null ? 0 : num5.hashCode())) * 31;
        C2992 c2992 = this.f10713;
        int iHashCode17 = (iHashCode16 + (c2992 == null ? 0 : c2992.hashCode())) * 31;
        String str8 = this.f10714;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10715;
        int iHashCode19 = (iHashCode18 + (str9 == null ? 0 : str9.hashCode())) * 31;
        C3001 c3001 = this.f10716;
        int iHashCode20 = (iHashCode19 + (c3001 == null ? 0 : c3001.hashCode())) * 31;
        Integer num6 = this.f10717;
        int iHashCode21 = (iHashCode20 + (num6 == null ? 0 : num6.hashCode())) * 31;
        C3004 c3004 = this.f10718;
        int iHashCode22 = (iHashCode21 + (c3004 == null ? 0 : c3004.hashCode())) * 31;
        Integer num7 = this.f10719;
        int iHashCode23 = (iHashCode22 + (num7 == null ? 0 : num7.hashCode())) * 31;
        C2971 c2971 = this.f10720;
        int iHashCode24 = (iHashCode23 + (c2971 == null ? 0 : c2971.hashCode())) * 31;
        C2998 c2998 = this.f10721;
        int iHashCode25 = (iHashCode24 + (c2998 == null ? 0 : c2998.hashCode())) * 31;
        String str10 = this.f10722;
        int iHashCode26 = (iHashCode25 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Boolean bool = this.f10723;
        int iHashCode27 = (iHashCode26 + (bool == null ? 0 : bool.hashCode())) * 31;
        C2968 c2968 = this.f10724;
        return iHashCode27 + (c2968 != null ? c2968.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("TimeLineObjectProto(id=");
        sb.append(this.f10697);
        sb.append(", username=");
        sb.append(this.f10698);
        sb.append(", privated=");
        sb.append(this.f10699);
        sb.append(", createTime=");
        sb.append(this.f10700);
        sb.append(", contentDesc=");
        sb.append(this.f10701);
        sb.append(", location=");
        sb.append(this.f10702);
        sb.append(", appInfo=");
        sb.append(this.f10703);
        sb.append(", contentObj=");
        sb.append(this.f10704);
        sb.append(", sourceUserName=");
        sb.append(this.f10705);
        sb.append(", sourceNickName=");
        sb.append(this.f10706);
        sb.append(", publicUserName=");
        sb.append(this.f10707);
        sb.append(", contentDescShowType=");
        sb.append(this.f10708);
        sb.append(", contentDescScene=");
        sb.append(this.f10709);
        sb.append(", statisticsData=");
        sb.append(this.f10710);
        sb.append(", actionInfo=");
        sb.append(this.f10711);
        sb.append(", contentattr=");
        sb.append(this.f10712);
        sb.append(", streamvideo=");
        sb.append(this.f10713);
        sb.append(", statExtStr=");
        sb.append(this.f10714);
        sb.append(", canvasInfo=");
        sb.append(this.f10715);
        sb.append(", weappInfo=");
        sb.append(this.f10716);
        sb.append(", sightFolded=");
        sb.append(this.f10717);
        sb.append(", webSearchInfo=");
        sb.append(this.f10718);
        sb.append(", showFlag=");
        sb.append(this.f10719);
        sb.append(", liteappInfo=");
        sb.append(this.f10720);
        sb.append(", videoTemplate=");
        sb.append(this.f10721);
        sb.append(", snsExcerptUrl=");
        sb.append(this.f10722);
        sb.append(", isExcerpt=");
        sb.append(this.f10723);
        sb.append(", gameShareCardObject=");
        sb.append(this.f10724);
        sb.append(')');
        return sb.toString();
    }
}
