package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3224 {
    public static final C3223 Companion = new C3223();

    public final String f10256;

    public final String f10257;

    public final String f10258;

    public final String f10259;

    public final String f10260;

    public final String f10261;

    public final String f10262;

    public final String f10263;

    public final String f10264;

    public /* synthetic */ C3224(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3222.f10255.mo1363());
            throw null;
        }
        this.f10256 = str;
        this.f10257 = str2;
        this.f10258 = str3;
        this.f10259 = str4;
        this.f10260 = str5;
        this.f10261 = str6;
        this.f10262 = str7;
        this.f10263 = str8;
        this.f10264 = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3224)) {
            return false;
        }
        C3224 c3224 = (C3224) obj;
        return AbstractC2207.m4087(this.f10256, c3224.f10256) && AbstractC2207.m4087(this.f10257, c3224.f10257) && AbstractC2207.m4087(this.f10258, c3224.f10258) && AbstractC2207.m4087(this.f10259, c3224.f10259) && AbstractC2207.m4087(this.f10260, c3224.f10260) && AbstractC2207.m4087(this.f10261, c3224.f10261) && AbstractC2207.m4087(this.f10262, c3224.f10262) && AbstractC2207.m4087(this.f10263, c3224.f10263) && AbstractC2207.m4087(this.f10264, c3224.f10264);
    }

    public final int hashCode() {
        String str = this.f10256;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10257;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10258;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10259;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10260;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f10261;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10262;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10263;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10264;
        return iHashCode8 + (str9 != null ? str9.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("pk3Proto(adaptive_pattern_wording=");
        sb.append(this.f10256);
        sb.append(", seat_pattern_wording=");
        sb.append(this.f10257);
        sb.append(", leader_pattern_wording=");
        sb.append(this.f10258);
        sb.append(", solo_battle_mode_wording=");
        sb.append(this.f10259);
        sb.append(", teamup_battle_mode_wording=");
        sb.append(this.f10260);
        sb.append(", battle_indicator_reward_heat_wording=");
        sb.append(this.f10261);
        sb.append(", battle_indicator_specific_gift_num_wording=");
        sb.append(this.f10262);
        sb.append(", audience_solo_battle_pattern_wording=");
        sb.append(this.f10263);
        sb.append(", audience_teamup_battle_pattern_wording=");
        return AbstractC1194.m2786(sb, this.f10264, ')');
    }
}
