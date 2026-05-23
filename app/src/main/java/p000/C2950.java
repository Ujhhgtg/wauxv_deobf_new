package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2950 {
    public static final C2949 Companion = new C2949();

    public static final InterfaceC1758[] f9431 = {null, null, null, null, AbstractC1458.m3163(new C2083(16)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null};

    public final String f9432;

    public final Integer f9433;

    public final String f9434;

    public final String f9435;

    public final List f9436;

    public final Integer f9437;

    public final String f9438;

    public final C2980 f9439;

    public final C2959 f9440;

    public final C3022 f9441;

    public final C3121 f9442;

    public final C3296 f9443;

    public final C2989 f9444;

    public final C3242 f9445;

    public final Integer f9446;

    public final C3022 f9447;

    public final C3362 f9448;

    public final C3007 f9449;

    public final C3179 f9450;

    public final C3022 f9451;

    public final C3164 f9452;

    public /* synthetic */ C2950(int i, String str, Integer num, String str2, String str3, List list, Integer num2, String str4, C2980 c2980, C2959 c2959, C3022 c3022, C3121 c3121, C3296 c3296, C2989 c2989, C3242 c3242, Integer num3, C3022 c3023, C3362 c3362, C3007 c3007, C3179 c3179, C3022 c3024, C3164 c3164) {
        if (2097151 != (i & 2097151)) {
            AbstractC1270.m2997(i, 2097151, C2948.f9430.mo1363());
            throw null;
        }
        this.f9432 = str;
        this.f9433 = num;
        this.f9434 = str2;
        this.f9435 = str3;
        this.f9436 = list;
        this.f9437 = num2;
        this.f9438 = str4;
        this.f9439 = c2980;
        this.f9440 = c2959;
        this.f9441 = c3022;
        this.f9442 = c3121;
        this.f9443 = c3296;
        this.f9444 = c2989;
        this.f9445 = c3242;
        this.f9446 = num3;
        this.f9447 = c3023;
        this.f9448 = c3362;
        this.f9449 = c3007;
        this.f9450 = c3179;
        this.f9451 = c3024;
        this.f9452 = c3164;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2950)) {
            return false;
        }
        C2950 c2950 = (C2950) obj;
        return AbstractC2207.m4087(this.f9432, c2950.f9432) && AbstractC2207.m4087(this.f9433, c2950.f9433) && AbstractC2207.m4087(this.f9434, c2950.f9434) && AbstractC2207.m4087(this.f9435, c2950.f9435) && AbstractC2207.m4087(this.f9436, c2950.f9436) && AbstractC2207.m4087(this.f9437, c2950.f9437) && AbstractC2207.m4087(this.f9438, c2950.f9438) && AbstractC2207.m4087(this.f9439, c2950.f9439) && AbstractC2207.m4087(this.f9440, c2950.f9440) && AbstractC2207.m4087(this.f9441, c2950.f9441) && AbstractC2207.m4087(this.f9442, c2950.f9442) && AbstractC2207.m4087(this.f9443, c2950.f9443) && AbstractC2207.m4087(this.f9444, c2950.f9444) && AbstractC2207.m4087(this.f9445, c2950.f9445) && AbstractC2207.m4087(this.f9446, c2950.f9446) && AbstractC2207.m4087(this.f9447, c2950.f9447) && AbstractC2207.m4087(this.f9448, c2950.f9448) && AbstractC2207.m4087(this.f9449, c2950.f9449) && AbstractC2207.m4087(this.f9450, c2950.f9450) && AbstractC2207.m4087(this.f9451, c2950.f9451) && AbstractC2207.m4087(this.f9452, c2950.f9452);
    }

    public final int hashCode() {
        String str = this.f9432;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9433;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9434;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9435;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f9436;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f9437;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str4 = this.f9438;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C2980 c2980 = this.f9439;
        int iHashCode8 = (iHashCode7 + (c2980 == null ? 0 : c2980.hashCode())) * 31;
        C2959 c2959 = this.f9440;
        int iHashCode9 = (iHashCode8 + (c2959 == null ? 0 : c2959.hashCode())) * 31;
        C3022 c3022 = this.f9441;
        int iHashCode10 = (iHashCode9 + (c3022 == null ? 0 : c3022.hashCode())) * 31;
        C3121 c3121 = this.f9442;
        int iHashCode11 = (iHashCode10 + (c3121 == null ? 0 : c3121.hashCode())) * 31;
        C3296 c3296 = this.f9443;
        int iHashCode12 = (iHashCode11 + (c3296 == null ? 0 : c3296.hashCode())) * 31;
        C2989 c2989 = this.f9444;
        int iHashCode13 = (iHashCode12 + (c2989 == null ? 0 : c2989.hashCode())) * 31;
        C3242 c3242 = this.f9445;
        int iHashCode14 = (iHashCode13 + (c3242 == null ? 0 : c3242.hashCode())) * 31;
        Integer num3 = this.f9446;
        int iHashCode15 = (iHashCode14 + (num3 == null ? 0 : num3.hashCode())) * 31;
        C3022 c3023 = this.f9447;
        int iHashCode16 = (iHashCode15 + (c3023 == null ? 0 : c3023.hashCode())) * 31;
        C3362 c3362 = this.f9448;
        int iHashCode17 = (iHashCode16 + (c3362 == null ? 0 : c3362.hashCode())) * 31;
        C3007 c3007 = this.f9449;
        int iHashCode18 = (iHashCode17 + (c3007 == null ? 0 : c3007.hashCode())) * 31;
        C3179 c3179 = this.f9450;
        int iHashCode19 = (iHashCode18 + (c3179 == null ? 0 : c3179.hashCode())) * 31;
        C3022 c3024 = this.f9451;
        int iHashCode20 = (iHashCode19 + (c3024 == null ? 0 : c3024.hashCode())) * 31;
        C3164 c3164 = this.f9452;
        return iHashCode20 + (c3164 != null ? c3164.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ContentObjProto(description=");
        sb.append(this.f9432);
        sb.append(", contentStyle=");
        sb.append(this.f9433);
        sb.append(", title=");
        sb.append(this.f9434);
        sb.append(", contentUrl=");
        sb.append(this.f9435);
        sb.append(", mediaList=");
        sb.append(this.f9436);
        sb.append(", contentSubStyle=");
        sb.append(this.f9437);
        sb.append(", noteLinkXml=");
        sb.append(this.f9438);
        sb.append(", readershare=");
        sb.append(this.f9439);
        sb.append(", finderFeed=");
        sb.append(this.f9440);
        sb.append(", shareFinderTopic=");
        sb.append(this.f9441);
        sb.append(", brandmpvideo=");
        sb.append(this.f9442);
        sb.append(", finderColumn=");
        sb.append(this.f9443);
        sb.append(", springFinderLive=");
        sb.append(this.f9444);
        sb.append(", finderMegaVideo=");
        sb.append(this.f9445);
        sb.append(", finderType=");
        sb.append(this.f9446);
        sb.append(", finderTopic=");
        sb.append(this.f9447);
        sb.append(", shareMusic=");
        sb.append(this.f9448);
        sb.append(", sharePoi=");
        sb.append(this.f9449);
        sb.append(", linkEnabled=");
        sb.append(this.f9450);
        sb.append(", shareMusicTopic=");
        sb.append(this.f9451);
        sb.append(", rabbit2023=");
        sb.append(this.f9452);
        sb.append(')');
        return sb.toString();
    }
}
