package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3079 {
    public static final C3078 Companion = new C3078();

    public final Integer f9843;

    public final C3019 f9844;

    public final C3396 f9845;

    public final C3260 f9846;

    public final Integer f9847;

    public final Integer f9848;

    public /* synthetic */ C3079(int i, Integer num, C3019 c3019, C3396 c3396, C3260 c3260, Integer num2, Integer num3) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3077.f9842.mo1363());
            throw null;
        }
        this.f9843 = num;
        this.f9844 = c3019;
        this.f9845 = c3396;
        this.f9846 = c3260;
        this.f9847 = num2;
        this.f9848 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3079)) {
            return false;
        }
        C3079 c3079 = (C3079) obj;
        return AbstractC2207.m4087(this.f9843, c3079.f9843) && AbstractC2207.m4087(this.f9844, c3079.f9844) && AbstractC2207.m4087(this.f9845, c3079.f9845) && AbstractC2207.m4087(this.f9846, c3079.f9846) && AbstractC2207.m4087(this.f9847, c3079.f9847) && AbstractC2207.m4087(this.f9848, c3079.f9848);
    }

    public final int hashCode() {
        Integer num = this.f9843;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3019 c3019 = this.f9844;
        int iHashCode2 = (iHashCode + (c3019 == null ? 0 : c3019.hashCode())) * 31;
        C3396 c3396 = this.f9845;
        int iHashCode3 = (iHashCode2 + (c3396 == null ? 0 : c3396.hashCode())) * 31;
        C3260 c3260 = this.f9846;
        int iHashCode4 = (iHashCode3 + (c3260 == null ? 0 : c3260.hashCode())) * 31;
        Integer num2 = this.f9847;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9848;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("fw3Proto(createTime=");
        sb.append(this.f9843);
        sb.append(", newlifeInfo=");
        sb.append(this.f9844);
        sb.append(", desc=");
        sb.append(this.f9845);
        sb.append(", location=");
        sb.append(this.f9846);
        sb.append(", commentEggCount=");
        sb.append(this.f9847);
        sb.append(", activityType=");
        return AbstractC2668.m4677(sb, this.f9848, ')');
    }
}
