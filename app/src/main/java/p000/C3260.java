package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3260 {
    public static final C3259 Companion = new C3259();

    public static final InterfaceC1758[] f10349 = {null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC1458.m3163(new C3125(16)), null};

    public final Float f10350;

    public final Float f10351;

    public final String f10352;

    public final String f10353;

    public final String f10354;

    public final String f10355;

    public final Integer f10356;

    public final String f10357;

    public final String f10358;

    public final String f10359;

    public final Integer f10360;

    public final String f10361;

    public final String f10362;

    public final String f10363;

    public final Long f10364;

    public final List f10365;

    public final Integer f10366;

    public /* synthetic */ C3260(int i, Float f, Float f2, String str, String str2, String str3, String str4, Integer num, String str5, String str6, String str7, Integer num2, String str8, String str9, String str10, Long l, List list, Integer num3) {
        if (131071 != (i & 131071)) {
            AbstractC1270.m2997(i, 131071, C3258.f10348.mo1363());
            throw null;
        }
        this.f10350 = f;
        this.f10351 = f2;
        this.f10352 = str;
        this.f10353 = str2;
        this.f10354 = str3;
        this.f10355 = str4;
        this.f10356 = num;
        this.f10357 = str5;
        this.f10358 = str6;
        this.f10359 = str7;
        this.f10360 = num2;
        this.f10361 = str8;
        this.f10362 = str9;
        this.f10363 = str10;
        this.f10364 = l;
        this.f10365 = list;
        this.f10366 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3260)) {
            return false;
        }
        C3260 c3260 = (C3260) obj;
        return AbstractC2207.m4087(this.f10350, c3260.f10350) && AbstractC2207.m4087(this.f10351, c3260.f10351) && AbstractC2207.m4087(this.f10352, c3260.f10352) && AbstractC2207.m4087(this.f10353, c3260.f10353) && AbstractC2207.m4087(this.f10354, c3260.f10354) && AbstractC2207.m4087(this.f10355, c3260.f10355) && AbstractC2207.m4087(this.f10356, c3260.f10356) && AbstractC2207.m4087(this.f10357, c3260.f10357) && AbstractC2207.m4087(this.f10358, c3260.f10358) && AbstractC2207.m4087(this.f10359, c3260.f10359) && AbstractC2207.m4087(this.f10360, c3260.f10360) && AbstractC2207.m4087(this.f10361, c3260.f10361) && AbstractC2207.m4087(this.f10362, c3260.f10362) && AbstractC2207.m4087(this.f10363, c3260.f10363) && AbstractC2207.m4087(this.f10364, c3260.f10364) && AbstractC2207.m4087(this.f10365, c3260.f10365) && AbstractC2207.m4087(this.f10366, c3260.f10366);
    }

    public final int hashCode() {
        Float f = this.f10350;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f10351;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.f10352;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10353;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10354;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10355;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f10356;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f10357;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10358;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10359;
        int iHashCode10 = (iHashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num2 = this.f10360;
        int iHashCode11 = (iHashCode10 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str8 = this.f10361;
        int iHashCode12 = (iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10362;
        int iHashCode13 = (iHashCode12 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10363;
        int iHashCode14 = (iHashCode13 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Long l = this.f10364;
        int iHashCode15 = (iHashCode14 + (l == null ? 0 : l.hashCode())) * 31;
        List list = this.f10365;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num3 = this.f10366;
        return iHashCode16 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("sp1Proto(longitude=");
        sb.append(this.f10350);
        sb.append(", latitude=");
        sb.append(this.f10351);
        sb.append(", city=");
        sb.append(this.f10352);
        sb.append(", poiName=");
        sb.append(this.f10353);
        sb.append(", poiAddress=");
        sb.append(this.f10354);
        sb.append(", poiClassifyId=");
        sb.append(this.f10355);
        sb.append(", poiClassifyType=");
        sb.append(this.f10356);
        sb.append(", province=");
        sb.append(this.f10357);
        sb.append(", region=");
        sb.append(this.f10358);
        sb.append(", country=");
        sb.append(this.f10359);
        sb.append(", source=");
        sb.append(this.f10360);
        sb.append(", buildingId=");
        sb.append(this.f10361);
        sb.append(", floorName=");
        sb.append(this.f10362);
        sb.append(", poiFullName=");
        sb.append(this.f10363);
        sb.append(", flag=");
        sb.append(this.f10364);
        sb.append(", product_id=");
        sb.append(this.f10365);
        sb.append(", commercialization_flag=");
        return AbstractC2668.m4677(sb, this.f10366, ')');
    }
}
