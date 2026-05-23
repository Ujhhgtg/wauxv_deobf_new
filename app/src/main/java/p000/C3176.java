package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3176 {
    public static final C3175 Companion = new C3175();

    public final String f10169;

    public final Long f10170;

    public final Integer f10171;

    public final Boolean f10172;

    public final C3149 f10173;

    public final Long f10174;

    public final Boolean f10175;

    public final Long f10176;

    public final Long f10177;

    public /* synthetic */ C3176(int i, String str, Long l, Integer num, Boolean bool, C3149 c3149, Long l2, Boolean bool2, Long l3, Long l4) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3174.f10168.mo1363());
            throw null;
        }
        this.f10169 = str;
        this.f10170 = l;
        this.f10171 = num;
        this.f10172 = bool;
        this.f10173 = c3149;
        this.f10174 = l2;
        this.f10175 = bool2;
        this.f10176 = l3;
        this.f10177 = l4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3176)) {
            return false;
        }
        C3176 c3176 = (C3176) obj;
        return AbstractC2207.m4087(this.f10169, c3176.f10169) && AbstractC2207.m4087(this.f10170, c3176.f10170) && AbstractC2207.m4087(this.f10171, c3176.f10171) && AbstractC2207.m4087(this.f10172, c3176.f10172) && AbstractC2207.m4087(this.f10173, c3176.f10173) && AbstractC2207.m4087(this.f10174, c3176.f10174) && AbstractC2207.m4087(this.f10175, c3176.f10175) && AbstractC2207.m4087(this.f10176, c3176.f10176) && AbstractC2207.m4087(this.f10177, c3176.f10177);
    }

    public final int hashCode() {
        String str = this.f10169;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f10170;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f10171;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f10172;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        C3149 c3149 = this.f10173;
        int iHashCode5 = (iHashCode4 + (c3149 == null ? 0 : c3149.hashCode())) * 31;
        Long l2 = this.f10174;
        int iHashCode6 = (iHashCode5 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.f10175;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Long l3 = this.f10176;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.f10177;
        return iHashCode8 + (l4 != null ? l4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("n84Proto(finder_username=");
        sb.append(this.f10169);
        sb.append(", reward_wecoin=");
        sb.append(this.f10170);
        sb.append(", winning_streak_count=");
        sb.append(this.f10171);
        sb.append(", is_accepted=");
        sb.append(this.f10172);
        sb.append(", crit_quest_info=");
        sb.append(this.f10173);
        sb.append(", extra_reward_wecoin=");
        sb.append(this.f10174);
        sb.append(", is_applicant=");
        sb.append(this.f10175);
        sb.append(", count=");
        sb.append(this.f10176);
        sb.append(", sdk_user_id=");
        sb.append(this.f10177);
        sb.append(')');
        return sb.toString();
    }
}
