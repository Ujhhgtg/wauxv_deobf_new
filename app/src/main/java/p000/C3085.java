package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3085 {
    public static final C3084 Companion = new C3084();

    public final Integer f9853;

    public final Boolean f9854;

    public final Integer f9855;

    public final Long f9856;

    public final Integer f9857;

    public final Integer f9858;

    public final String f9859;

    public final Integer f9860;

    public /* synthetic */ C3085(int i, Integer num, Boolean bool, Integer num2, Long l, Integer num3, Integer num4, String str, Integer num5) {
        if (255 != (i & 255)) {
            AbstractC1270.m2997(i, 255, C3083.f9852.mo1363());
            throw null;
        }
        this.f9853 = num;
        this.f9854 = bool;
        this.f9855 = num2;
        this.f9856 = l;
        this.f9857 = num3;
        this.f9858 = num4;
        this.f9859 = str;
        this.f9860 = num5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3085)) {
            return false;
        }
        C3085 c3085 = (C3085) obj;
        return AbstractC2207.m4087(this.f9853, c3085.f9853) && AbstractC2207.m4087(this.f9854, c3085.f9854) && AbstractC2207.m4087(this.f9855, c3085.f9855) && AbstractC2207.m4087(this.f9856, c3085.f9856) && AbstractC2207.m4087(this.f9857, c3085.f9857) && AbstractC2207.m4087(this.f9858, c3085.f9858) && AbstractC2207.m4087(this.f9859, c3085.f9859) && AbstractC2207.m4087(this.f9860, c3085.f9860);
    }

    public final int hashCode() {
        Integer num = this.f9853;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Boolean bool = this.f9854;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f9855;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9856;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num3 = this.f9857;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9858;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str = this.f9859;
        int iHashCode7 = (iHashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.f9860;
        return iHashCode7 + (num5 != null ? num5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("gj1Proto(charge_flag=");
        sb.append(this.f9853);
        sb.append(", is_purchased=");
        sb.append(this.f9854);
        sb.append(", purchase_user_count=");
        sb.append(this.f9855);
        sb.append(", purchase_heat=");
        sb.append(this.f9856);
        sb.append(", unit_price_in_wecoin=");
        sb.append(this.f9857);
        sb.append(", need_get_payment_items=");
        sb.append(this.f9858);
        sb.append(", prompt_wording=");
        sb.append(this.f9859);
        sb.append(", charge_is_member_free=");
        return AbstractC2668.m4677(sb, this.f9860, ')');
    }
}
