package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1696 {
    public static final C1689 Companion = new C1689();

    public final C0383 f5757;

    public final C1692 f5758;

    public final String f5759;

    public final C1695 f5760;

    public final String f5761;

    public final String f5762;

    public final String f5763;

    public final String f5764;

    public final String f5765;

    public final Integer f5766;

    public final String f5767;

    public final String f5768;

    public /* synthetic */ C1696(int i, C0383 c0383, C1692 c1692, String str, C1695 c1695, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        if (4095 != (i & 4095)) {
            AbstractC1270.m2997(i, 4095, C1688.f5747.mo1363());
            throw null;
        }
        this.f5757 = c0383;
        this.f5758 = c1692;
        this.f5759 = str;
        this.f5760 = c1695;
        this.f5761 = str2;
        this.f5762 = str3;
        this.f5763 = str4;
        this.f5764 = str5;
        this.f5765 = str6;
        this.f5766 = num;
        this.f5767 = str7;
        this.f5768 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696)) {
            return false;
        }
        C1696 c1696 = (C1696) obj;
        return AbstractC2207.m4087(this.f5757, c1696.f5757) && AbstractC2207.m4087(this.f5758, c1696.f5758) && AbstractC2207.m4087(this.f5759, c1696.f5759) && AbstractC2207.m4087(this.f5760, c1696.f5760) && AbstractC2207.m4087(this.f5761, c1696.f5761) && AbstractC2207.m4087(this.f5762, c1696.f5762) && AbstractC2207.m4087(this.f5763, c1696.f5763) && AbstractC2207.m4087(this.f5764, c1696.f5764) && AbstractC2207.m4087(this.f5765, c1696.f5765) && AbstractC2207.m4087(this.f5766, c1696.f5766) && AbstractC2207.m4087(this.f5767, c1696.f5767) && AbstractC2207.m4087(this.f5768, c1696.f5768);
    }

    public final int hashCode() {
        C0383 c0383 = this.f5757;
        int iHashCode = (c0383 == null ? 0 : c0383.hashCode()) * 31;
        C1692 c1692 = this.f5758;
        int iHashCode2 = (iHashCode + (c1692 == null ? 0 : c1692.hashCode())) * 31;
        String str = this.f5759;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1695 c1695 = this.f5760;
        int iHashCode4 = (iHashCode3 + (c1695 == null ? 0 : c1695.hashCode())) * 31;
        String str2 = this.f5761;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5762;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5763;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5764;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5765;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f5766;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f5767;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5768;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("JSLoginResp(baseResponse=");
        sb.append(this.f5757);
        sb.append(", jsapiBaseResp=");
        sb.append(this.f5758);
        sb.append(", code=");
        sb.append(this.f5759);
        sb.append(", scopeList=");
        sb.append(this.f5760);
        sb.append(", appName=");
        sb.append(this.f5761);
        sb.append(", appIconUrl=");
        sb.append(this.f5762);
        sb.append(", openid=");
        sb.append(this.f5763);
        sb.append(", sessionKey=");
        sb.append(this.f5764);
        sb.append(", sessionTicket=");
        sb.append(this.f5765);
        sb.append(", lifespan=");
        sb.append(this.f5766);
        sb.append(", state=");
        sb.append(this.f5767);
        sb.append(", signature=");
        return AbstractC1194.m2786(sb, this.f5768, ')');
    }
}
