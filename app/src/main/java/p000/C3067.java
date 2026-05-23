package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3067 {
    public static final C3066 Companion = new C3066();

    public final String f9816;

    public final String f9817;

    public final String f9818;

    public final String f9819;

    public final Integer f9820;

    public final Float f9821;

    public final Integer f9822;

    public final Boolean f9823;

    public final Boolean f9824;

    public final String f9825;

    public final Integer f9826;

    public /* synthetic */ C3067(int i, String str, String str2, String str3, String str4, Integer num, Float f, Integer num2, Boolean bool, Boolean bool2, String str5, Integer num3) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C3065.f9815.mo1363());
            throw null;
        }
        this.f9816 = str;
        this.f9817 = str2;
        this.f9818 = str3;
        this.f9819 = str4;
        this.f9820 = num;
        this.f9821 = f;
        this.f9822 = num2;
        this.f9823 = bool;
        this.f9824 = bool2;
        this.f9825 = str5;
        this.f9826 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3067)) {
            return false;
        }
        C3067 c3067 = (C3067) obj;
        return AbstractC2207.m4087(this.f9816, c3067.f9816) && AbstractC2207.m4087(this.f9817, c3067.f9817) && AbstractC2207.m4087(this.f9818, c3067.f9818) && AbstractC2207.m4087(this.f9819, c3067.f9819) && AbstractC2207.m4087(this.f9820, c3067.f9820) && AbstractC2207.m4087(this.f9821, c3067.f9821) && AbstractC2207.m4087(this.f9822, c3067.f9822) && AbstractC2207.m4087(this.f9823, c3067.f9823) && AbstractC2207.m4087(this.f9824, c3067.f9824) && AbstractC2207.m4087(this.f9825, c3067.f9825) && AbstractC2207.m4087(this.f9826, c3067.f9826);
    }

    public final int hashCode() {
        String str = this.f9816;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9817;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9818;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9819;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f9820;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f9821;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f9822;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f9823;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9824;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.f9825;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f9826;
        return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("f93Proto(app_id=");
        sb.append(this.f9816);
        sb.append(", path=");
        sb.append(this.f9817);
        sb.append(", query=");
        sb.append(this.f9818);
        sb.append(", default_url=");
        sb.append(this.f9819);
        sb.append(", height_percent=");
        sb.append(this.f9820);
        sb.append(", half_height=");
        sb.append(this.f9821);
        sb.append(", open_type=");
        sb.append(this.f9822);
        sb.append(", is_transparent=");
        sb.append(this.f9823);
        sb.append(", is_forbid_rightgesture=");
        sb.append(this.f9824);
        sb.append(", mini_version=");
        sb.append(this.f9825);
        sb.append(", position=");
        return AbstractC2668.m4677(sb, this.f9826, ')');
    }
}
