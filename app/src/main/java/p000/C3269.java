package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3269 {
    public static final C3268 Companion = new C3268();

    public final String f10379;

    public final Integer f10380;

    public final String f10381;

    public final String f10382;

    public final String f10383;

    public final String f10384;

    public final Integer f10385;

    public final String f10386;

    public final String f10387;

    public final Integer f10388;

    public final Integer f10389;

    public /* synthetic */ C3269(int i, String str, Integer num, String str2, String str3, String str4, String str5, Integer num2, String str6, String str7, Integer num3, Integer num4) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C3267.f10378.mo1363());
            throw null;
        }
        this.f10379 = str;
        this.f10380 = num;
        this.f10381 = str2;
        this.f10382 = str3;
        this.f10383 = str4;
        this.f10384 = str5;
        this.f10385 = num2;
        this.f10386 = str6;
        this.f10387 = str7;
        this.f10388 = num3;
        this.f10389 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3269)) {
            return false;
        }
        C3269 c3269 = (C3269) obj;
        return AbstractC2207.m4087(this.f10379, c3269.f10379) && AbstractC2207.m4087(this.f10380, c3269.f10380) && AbstractC2207.m4087(this.f10381, c3269.f10381) && AbstractC2207.m4087(this.f10382, c3269.f10382) && AbstractC2207.m4087(this.f10383, c3269.f10383) && AbstractC2207.m4087(this.f10384, c3269.f10384) && AbstractC2207.m4087(this.f10385, c3269.f10385) && AbstractC2207.m4087(this.f10386, c3269.f10386) && AbstractC2207.m4087(this.f10387, c3269.f10387) && AbstractC2207.m4087(this.f10388, c3269.f10388) && AbstractC2207.m4087(this.f10389, c3269.f10389);
    }

    public final int hashCode() {
        String str = this.f10379;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10380;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f10381;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10382;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10383;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10384;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.f10385;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.f10386;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10387;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num3 = this.f10388;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10389;
        return iHashCode10 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("t10Proto(d=");
        sb.append(this.f10379);
        sb.append(", e=");
        sb.append(this.f10380);
        sb.append(", f=");
        sb.append(this.f10381);
        sb.append(", g=");
        sb.append(this.f10382);
        sb.append(", h=");
        sb.append(this.f10383);
        sb.append(", i=");
        sb.append(this.f10384);
        sb.append(", j=");
        sb.append(this.f10385);
        sb.append(", n=");
        sb.append(this.f10386);
        sb.append(", o=");
        sb.append(this.f10387);
        sb.append(", p=");
        sb.append(this.f10388);
        sb.append(", q=");
        return AbstractC2668.m4677(sb, this.f10389, ')');
    }
}
