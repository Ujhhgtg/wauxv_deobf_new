package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3185 {
    public static final C3184 Companion = new C3184();

    public final C3350 f10185;

    public final Integer f10186;

    public final Integer f10187;

    public final Long f10188;

    public final String f10189;

    public final Integer f10190;

    public /* synthetic */ C3185(int i, C3350 c3350, Integer num, Integer num2, Long l, String str, Integer num3) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3183.f10184.mo1363());
            throw null;
        }
        this.f10185 = c3350;
        this.f10186 = num;
        this.f10187 = num2;
        this.f10188 = l;
        this.f10189 = str;
        this.f10190 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3185)) {
            return false;
        }
        C3185 c3185 = (C3185) obj;
        return AbstractC2207.m4087(this.f10185, c3185.f10185) && AbstractC2207.m4087(this.f10186, c3185.f10186) && AbstractC2207.m4087(this.f10187, c3185.f10187) && AbstractC2207.m4087(this.f10188, c3185.f10188) && AbstractC2207.m4087(this.f10189, c3185.f10189) && AbstractC2207.m4087(this.f10190, c3185.f10190);
    }

    public final int hashCode() {
        C3350 c3350 = this.f10185;
        int iHashCode = (c3350 == null ? 0 : c3350.hashCode()) * 31;
        Integer num = this.f10186;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10187;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f10188;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f10189;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f10190;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("nk1Proto(cdn_trans_info=");
        sb.append(this.f10185);
        sb.append(", recommend_video_quality_level=");
        sb.append(this.f10186);
        sb.append(", force_recommend=");
        sb.append(this.f10187);
        sb.append(", replay_transition_video_id=");
        sb.append(this.f10188);
        sb.append(", replay_transition_url=");
        sb.append(this.f10189);
        sb.append(", disable_replay_transition=");
        return AbstractC2668.m4677(sb, this.f10190, ')');
    }
}
