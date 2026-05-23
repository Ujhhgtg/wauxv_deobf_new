package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3001 {
    public static final C3000 Companion = new C3000();

    public final String f9645;

    public final String f9646;

    public final Integer f9647;

    public final Integer f9648;

    public final String f9649;

    public final Integer f9650;

    public final String f9651;

    public final Integer f9652;

    public final String f9653;

    public /* synthetic */ C3001(int i, String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, Integer num4, String str5) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C2999.f9644.mo1363());
            throw null;
        }
        this.f9645 = str;
        this.f9646 = str2;
        this.f9647 = num;
        this.f9648 = num2;
        this.f9649 = str3;
        this.f9650 = num3;
        this.f9651 = str4;
        this.f9652 = num4;
        this.f9653 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3001)) {
            return false;
        }
        C3001 c3001 = (C3001) obj;
        return AbstractC2207.m4087(this.f9645, c3001.f9645) && AbstractC2207.m4087(this.f9646, c3001.f9646) && AbstractC2207.m4087(this.f9647, c3001.f9647) && AbstractC2207.m4087(this.f9648, c3001.f9648) && AbstractC2207.m4087(this.f9649, c3001.f9649) && AbstractC2207.m4087(this.f9650, c3001.f9650) && AbstractC2207.m4087(this.f9651, c3001.f9651) && AbstractC2207.m4087(this.f9652, c3001.f9652) && AbstractC2207.m4087(this.f9653, c3001.f9653);
    }

    public final int hashCode() {
        String str = this.f9645;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9646;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f9647;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9648;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f9649;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f9650;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f9651;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.f9652;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.f9653;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("WeappInfoProto(appUserName=");
        sb.append(this.f9645);
        sb.append(", pagePath=");
        sb.append(this.f9646);
        sb.append(", version=");
        sb.append(this.f9647);
        sb.append(", debugMode=");
        sb.append(this.f9648);
        sb.append(", shareActionId=");
        sb.append(this.f9649);
        sb.append(", isGame=");
        sb.append(this.f9650);
        sb.append(", messageExtraData=");
        sb.append(this.f9651);
        sb.append(", subType=");
        sb.append(this.f9652);
        sb.append(", preloadResources=");
        return AbstractC1194.m2786(sb, this.f9653, ')');
    }
}
