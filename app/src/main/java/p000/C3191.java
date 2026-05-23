package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3191 {
    public static final C3190 Companion = new C3190();

    public final String f10194;

    public final Integer f10195;

    public final Integer f10196;

    public final C3269 f10197;

    public final C3227 f10198;

    public final C3368 f10199;

    public final C3275 f10200;

    public final Integer f10201;

    public final Integer f10202;

    public final Integer f10203;

    public final C3320 f10204;

    public final C3384 f10205;

    public final String f10206;

    public /* synthetic */ C3191(int i, String str, Integer num, Integer num2, C3269 c3269, C3227 c3227, C3368 c3368, C3275 c3275, Integer num3, Integer num4, Integer num5, C3320 c3320, C3384 c3384, String str2) {
        if (8191 != (i & 8191)) {
            AbstractC1270.m2997(i, 8191, C3189.f10193.mo1363());
            throw null;
        }
        this.f10194 = str;
        this.f10195 = num;
        this.f10196 = num2;
        this.f10197 = c3269;
        this.f10198 = c3227;
        this.f10199 = c3368;
        this.f10200 = c3275;
        this.f10201 = num3;
        this.f10202 = num4;
        this.f10203 = num5;
        this.f10204 = c3320;
        this.f10205 = c3384;
        this.f10206 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3191)) {
            return false;
        }
        C3191 c3191 = (C3191) obj;
        return AbstractC2207.m4087(this.f10194, c3191.f10194) && AbstractC2207.m4087(this.f10195, c3191.f10195) && AbstractC2207.m4087(this.f10196, c3191.f10196) && AbstractC2207.m4087(this.f10197, c3191.f10197) && AbstractC2207.m4087(this.f10198, c3191.f10198) && AbstractC2207.m4087(this.f10199, c3191.f10199) && AbstractC2207.m4087(this.f10200, c3191.f10200) && AbstractC2207.m4087(this.f10201, c3191.f10201) && AbstractC2207.m4087(this.f10202, c3191.f10202) && AbstractC2207.m4087(this.f10203, c3191.f10203) && AbstractC2207.m4087(this.f10204, c3191.f10204) && AbstractC2207.m4087(this.f10205, c3191.f10205) && AbstractC2207.m4087(this.f10206, c3191.f10206);
    }

    public final int hashCode() {
        String str = this.f10194;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10195;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10196;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C3269 c3269 = this.f10197;
        int iHashCode4 = (iHashCode3 + (c3269 == null ? 0 : c3269.hashCode())) * 31;
        C3227 c3227 = this.f10198;
        int iHashCode5 = (iHashCode4 + (c3227 == null ? 0 : c3227.hashCode())) * 31;
        C3368 c3368 = this.f10199;
        int iHashCode6 = (iHashCode5 + (c3368 == null ? 0 : c3368.hashCode())) * 31;
        C3275 c3275 = this.f10200;
        int iHashCode7 = (iHashCode6 + (c3275 == null ? 0 : c3275.hashCode())) * 31;
        Integer num3 = this.f10201;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10202;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10203;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        C3320 c3320 = this.f10204;
        int iHashCode11 = (iHashCode10 + (c3320 == null ? 0 : c3320.hashCode())) * 31;
        C3384 c3384 = this.f10205;
        int iHashCode12 = (iHashCode11 + (c3384 == null ? 0 : c3384.hashCode())) * 31;
        String str2 = this.f10206;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("nr5Proto(d=");
        sb.append(this.f10194);
        sb.append(", e=");
        sb.append(this.f10195);
        sb.append(", f=");
        sb.append(this.f10196);
        sb.append(", g=");
        sb.append(this.f10197);
        sb.append(", h=");
        sb.append(this.f10198);
        sb.append(", i=");
        sb.append(this.f10199);
        sb.append(", j=");
        sb.append(this.f10200);
        sb.append(", n=");
        sb.append(this.f10201);
        sb.append(", o=");
        sb.append(this.f10202);
        sb.append(", p=");
        sb.append(this.f10203);
        sb.append(", q=");
        sb.append(this.f10204);
        sb.append(", r=");
        sb.append(this.f10205);
        sb.append(", s=");
        return AbstractC1194.m2786(sb, this.f10206, ')');
    }
}
