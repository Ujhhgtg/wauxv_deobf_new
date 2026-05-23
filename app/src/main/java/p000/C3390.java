package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3390 {
    public static final C3389 Companion = new C3389();

    public final Integer f10671;

    public final Long f10672;

    public final Long f10673;

    public final String f10674;

    public /* synthetic */ C3390(int i, Integer num, Long l, Long l2, String str) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3388.f10670.mo1363());
            throw null;
        }
        this.f10671 = num;
        this.f10672 = l;
        this.f10673 = l2;
        this.f10674 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3390)) {
            return false;
        }
        C3390 c3390 = (C3390) obj;
        return AbstractC2207.m4087(this.f10671, c3390.f10671) && AbstractC2207.m4087(this.f10672, c3390.f10672) && AbstractC2207.m4087(this.f10673, c3390.f10673) && AbstractC2207.m4087(this.f10674, c3390.f10674);
    }

    public final int hashCode() {
        Integer num = this.f10671;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f10672;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10673;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f10674;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("zg4Proto(target_type=");
        sb.append(this.f10671);
        sb.append(", target_num=");
        sb.append(this.f10672);
        sb.append(", current_num=");
        sb.append(this.f10673);
        sb.append(", gift_product_id=");
        return AbstractC1194.m2786(sb, this.f10674, ')');
    }
}
