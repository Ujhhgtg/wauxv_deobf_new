package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2218 {
    public static final C2217 Companion = new C2217();

    public final Integer f7195;

    public final C2615 f7196;

    public final Integer f7197;

    public final Integer f7198;

    public final Integer f7199;

    public final Integer f7200;

    public final Integer f7201;

    public final Long f7202;

    public /* synthetic */ C2218(int i, Integer num, C2615 c2615, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C2216.f7194.mo1363());
            throw null;
        }
        this.f7195 = num;
        this.f7196 = c2615;
        this.f7197 = num2;
        this.f7198 = num3;
        this.f7199 = num4;
        this.f7200 = num5;
        this.f7201 = num6;
        this.f7202 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2218)) {
            return false;
        }
        C2218 c2218 = (C2218) obj;
        return AbstractC2207.m4087(this.f7195, c2218.f7195) && AbstractC2207.m4087(this.f7196, c2218.f7196) && AbstractC2207.m4087(this.f7197, c2218.f7197) && AbstractC2207.m4087(this.f7198, c2218.f7198) && AbstractC2207.m4087(this.f7199, c2218.f7199) && AbstractC2207.m4087(this.f7200, c2218.f7200) && AbstractC2207.m4087(this.f7201, c2218.f7201) && AbstractC2207.m4087(this.f7202, c2218.f7202);
    }

    public final int hashCode() {
        Integer num = this.f7195;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2615 c2615 = this.f7196;
        int iHashCode2 = (iHashCode + (c2615 == null ? 0 : c2615.hashCode())) * 31;
        Integer num2 = this.f7197;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7198;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f7199;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f7200;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f7201;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.f7202;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("MicroMsgRespNew(ret=");
        sb.append(this.f7195);
        sb.append(", toUserName=");
        sb.append(this.f7196);
        sb.append(", msgId=");
        sb.append(this.f7197);
        sb.append(", clientMsgId=");
        sb.append(this.f7198);
        sb.append(", createTime=");
        sb.append(this.f7199);
        sb.append(", serverTime=");
        sb.append(this.f7200);
        sb.append(", type=");
        sb.append(this.f7201);
        sb.append(", newMsgId=");
        sb.append(this.f7202);
        sb.append(')');
        return sb.toString();
    }
}
