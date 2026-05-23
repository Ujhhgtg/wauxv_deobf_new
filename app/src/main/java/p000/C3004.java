package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3004 {
    public static final C3003 Companion = new C3003();

    public final String f9655;

    public final String f9656;

    public final String f9657;

    public final String f9658;

    public final Long f9659;

    public final String f9660;

    public final String f9661;

    public final String f9662;

    public final String f9663;

    public final String f9664;

    public final String f9665;

    public final String f9666;

    public final String f9667;

    public final String f9668;

    public final String f9669;

    public final String f9670;

    public final String f9671;

    public final Long f9672;

    public final String f9673;

    public final String f9674;

    public /* synthetic */ C3004(int i, String str, String str2, String str3, String str4, Long l, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, Long l2, String str17, String str18) {
        if (1048575 != (i & 1048575)) {
            AbstractC1270.m2997(i, 1048575, C3002.f9654.mo1363());
            throw null;
        }
        this.f9655 = str;
        this.f9656 = str2;
        this.f9657 = str3;
        this.f9658 = str4;
        this.f9659 = l;
        this.f9660 = str5;
        this.f9661 = str6;
        this.f9662 = str7;
        this.f9663 = str8;
        this.f9664 = str9;
        this.f9665 = str10;
        this.f9666 = str11;
        this.f9667 = str12;
        this.f9668 = str13;
        this.f9669 = str14;
        this.f9670 = str15;
        this.f9671 = str16;
        this.f9672 = l2;
        this.f9673 = str17;
        this.f9674 = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3004)) {
            return false;
        }
        C3004 c3004 = (C3004) obj;
        return AbstractC2207.m4087(this.f9655, c3004.f9655) && AbstractC2207.m4087(this.f9656, c3004.f9656) && AbstractC2207.m4087(this.f9657, c3004.f9657) && AbstractC2207.m4087(this.f9658, c3004.f9658) && AbstractC2207.m4087(this.f9659, c3004.f9659) && AbstractC2207.m4087(this.f9660, c3004.f9660) && AbstractC2207.m4087(this.f9661, c3004.f9661) && AbstractC2207.m4087(this.f9662, c3004.f9662) && AbstractC2207.m4087(this.f9663, c3004.f9663) && AbstractC2207.m4087(this.f9664, c3004.f9664) && AbstractC2207.m4087(this.f9665, c3004.f9665) && AbstractC2207.m4087(this.f9666, c3004.f9666) && AbstractC2207.m4087(this.f9667, c3004.f9667) && AbstractC2207.m4087(this.f9668, c3004.f9668) && AbstractC2207.m4087(this.f9669, c3004.f9669) && AbstractC2207.m4087(this.f9670, c3004.f9670) && AbstractC2207.m4087(this.f9671, c3004.f9671) && AbstractC2207.m4087(this.f9672, c3004.f9672) && AbstractC2207.m4087(this.f9673, c3004.f9673) && AbstractC2207.m4087(this.f9674, c3004.f9674);
    }

    public final int hashCode() {
        String str = this.f9655;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9656;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9657;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9658;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f9659;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f9660;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9661;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9662;
        int iHashCode8 = (iHashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9663;
        int iHashCode9 = (iHashCode8 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f9664;
        int iHashCode10 = (iHashCode9 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f9665;
        int iHashCode11 = (iHashCode10 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f9666;
        int iHashCode12 = (iHashCode11 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.f9667;
        int iHashCode13 = (iHashCode12 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.f9668;
        int iHashCode14 = (iHashCode13 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.f9669;
        int iHashCode15 = (iHashCode14 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.f9670;
        int iHashCode16 = (iHashCode15 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.f9671;
        int iHashCode17 = (iHashCode16 + (str16 == null ? 0 : str16.hashCode())) * 31;
        Long l2 = this.f9672;
        int iHashCode18 = (iHashCode17 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str17 = this.f9673;
        int iHashCode19 = (iHashCode18 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.f9674;
        return iHashCode19 + (str18 != null ? str18.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("WebSearchInfoProto(relevant_vid=");
        sb.append(this.f9655);
        sb.append(", relevant_expand=");
        sb.append(this.f9656);
        sb.append(", relevant_pre_searchid=");
        sb.append(this.f9657);
        sb.append(", relevant_shared_openid=");
        sb.append(this.f9658);
        sb.append(", rec_category=");
        sb.append(this.f9659);
        sb.append(", strPlayCount=");
        sb.append(this.f9660);
        sb.append(", shareUrl=");
        sb.append(this.f9661);
        sb.append(", shareTitle=");
        sb.append(this.f9662);
        sb.append(", shareDesc=");
        sb.append(this.f9663);
        sb.append(", shareImgUrl=");
        sb.append(this.f9664);
        sb.append(", shareString=");
        sb.append(this.f9665);
        sb.append(", shareStringUrl=");
        sb.append(this.f9666);
        sb.append(", source=");
        sb.append(this.f9667);
        sb.append(", sourceUrl=");
        sb.append(this.f9668);
        sb.append(", titleUrl=");
        sb.append(this.f9669);
        sb.append(", extReqParams=");
        sb.append(this.f9670);
        sb.append(", tagList=");
        sb.append(this.f9671);
        sb.append(", channelId=");
        sb.append(this.f9672);
        sb.append(", thumbUrl=");
        sb.append(this.f9673);
        sb.append(", shareTag=");
        return AbstractC1194.m2786(sb, this.f9674, ')');
    }
}
