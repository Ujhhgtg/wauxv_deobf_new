package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2974 {
    public static final C2973 Companion = new C2973();

    public final Float f9504;

    public final Float f9505;

    public final String f9506;

    public final String f9507;

    public final String f9508;

    public final String f9509;

    public final Integer f9510;

    public final String f9511;

    public final Integer f9512;

    public final Integer f9513;

    public final Integer f9514;

    public final Float f9515;

    public final Integer f9516;

    public final String f9517;

    public final String f9518;

    public /* synthetic */ C2974(int i, Float f, Float f2, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Integer num3, Integer num4, Float f3, Integer num5, String str6, String str7) {
        if (32767 != (i & 32767)) {
            AbstractC1270.m2997(i, 32767, C2972.f9503.mo1363());
            throw null;
        }
        this.f9504 = f;
        this.f9505 = f2;
        this.f9506 = str;
        this.f9507 = str2;
        this.f9508 = str3;
        this.f9509 = str4;
        this.f9510 = num;
        this.f9511 = str5;
        this.f9512 = num2;
        this.f9513 = num3;
        this.f9514 = num4;
        this.f9515 = f3;
        this.f9516 = num5;
        this.f9517 = str6;
        this.f9518 = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2974)) {
            return false;
        }
        C2974 c2974 = (C2974) obj;
        return AbstractC2207.m4087(this.f9504, c2974.f9504) && AbstractC2207.m4087(this.f9505, c2974.f9505) && AbstractC2207.m4087(this.f9506, c2974.f9506) && AbstractC2207.m4087(this.f9507, c2974.f9507) && AbstractC2207.m4087(this.f9508, c2974.f9508) && AbstractC2207.m4087(this.f9509, c2974.f9509) && AbstractC2207.m4087(this.f9510, c2974.f9510) && AbstractC2207.m4087(this.f9511, c2974.f9511) && AbstractC2207.m4087(this.f9512, c2974.f9512) && AbstractC2207.m4087(this.f9513, c2974.f9513) && AbstractC2207.m4087(this.f9514, c2974.f9514) && AbstractC2207.m4087(this.f9515, c2974.f9515) && AbstractC2207.m4087(this.f9516, c2974.f9516) && AbstractC2207.m4087(this.f9517, c2974.f9517) && AbstractC2207.m4087(this.f9518, c2974.f9518);
    }

    public final int hashCode() {
        Float f = this.f9504;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f9505;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.f9506;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9507;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9508;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9509;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f9510;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f9511;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.f9512;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9513;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9514;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f3 = this.f9515;
        int iHashCode12 = (iHashCode11 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num5 = this.f9516;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f9517;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9518;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("LocationProto(longitude=");
        sb.append(this.f9504);
        sb.append(", latitude=");
        sb.append(this.f9505);
        sb.append(", city=");
        sb.append(this.f9506);
        sb.append(", poiName=");
        sb.append(this.f9507);
        sb.append(", poiAddress=");
        sb.append(this.f9508);
        sb.append(", poiClassifyId=");
        sb.append(this.f9509);
        sb.append(", poiClassifyType=");
        sb.append(this.f9510);
        sb.append(", n=");
        sb.append(this.f9511);
        sb.append(", poiScale=");
        sb.append(this.f9512);
        sb.append(", poiClickableStatus=");
        sb.append(this.f9513);
        sb.append(", type=");
        sb.append(this.f9514);
        sb.append(", accuracy=");
        sb.append(this.f9515);
        sb.append(", t=");
        sb.append(this.f9516);
        sb.append(", poiAddressName=");
        sb.append(this.f9517);
        sb.append(", country=");
        return AbstractC1194.m2786(sb, this.f9518, ')');
    }
}
