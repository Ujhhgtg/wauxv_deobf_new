package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1083 {
    public static final C1082 Companion = new C1082();

    public Integer f3900;

    public C1086 f3901;

    public String f3902;

    public C1086 f3903;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1083)) {
            return false;
        }
        C1083 c1083 = (C1083) obj;
        return AbstractC2207.m4087(this.f3900, c1083.f3900) && AbstractC2207.m4087(this.f3901, c1083.f3901) && AbstractC2207.m4087(this.f3902, c1083.f3902) && AbstractC2207.m4087(this.f3903, c1083.f3903);
    }

    public final int hashCode() {
        Integer num = this.f3900;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C1086 c1086 = this.f3901;
        int iHashCode2 = (iHashCode + (c1086 == null ? 0 : c1086.hashCode())) * 31;
        String str = this.f3902;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1086 c1087 = this.f3903;
        return iHashCode3 + (c1087 != null ? c1087.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("DisturbSetting(nightSetting=");
        sb.append(this.f3900);
        sb.append(", nightTime=");
        sb.append(this.f3901);
        sb.append(", allDaySetting=");
        sb.append(this.f3902);
        sb.append(", allDayTime=");
        sb.append(this.f3903);
        sb.append(')');
        return sb.toString();
    }
}
