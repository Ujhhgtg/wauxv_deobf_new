package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3010 {
    public static final C3009 Companion = new C3009();

    public final String f9685;

    public final Integer f9686;

    public final Integer f9687;

    public final Integer f9688;

    public /* synthetic */ C3010(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3008.f9684.mo1363());
            throw null;
        }
        this.f9685 = str;
        this.f9686 = num;
        this.f9687 = num2;
        this.f9688 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3010)) {
            return false;
        }
        C3010 c3010 = (C3010) obj;
        return AbstractC2207.m4087(this.f9685, c3010.f9685) && AbstractC2207.m4087(this.f9686, c3010.f9686) && AbstractC2207.m4087(this.f9687, c3010.f9687) && AbstractC2207.m4087(this.f9688, c3010.f9688);
    }

    public final int hashCode() {
        String str = this.f9685;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9686;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9687;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9688;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("a23Proto(gift_id=");
        sb.append(this.f9685);
        sb.append(", max_size=");
        sb.append(this.f9686);
        sb.append(", curr_size=");
        sb.append(this.f9687);
        sb.append(", indicator_type=");
        return AbstractC2668.m4677(sb, this.f9688, ')');
    }
}
