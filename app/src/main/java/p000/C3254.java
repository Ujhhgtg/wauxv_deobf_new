package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3254 {
    public static final C3253 Companion = new C3253();

    public final Long f10340;

    public final Long f10341;

    public final Integer f10342;

    public final Boolean f10343;

    public /* synthetic */ C3254(int i, Long l, Long l2, Integer num, Boolean bool) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3252.f10339.mo1363());
            throw null;
        }
        this.f10340 = l;
        this.f10341 = l2;
        this.f10342 = num;
        this.f10343 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3254)) {
            return false;
        }
        C3254 c3254 = (C3254) obj;
        return AbstractC2207.m4087(this.f10340, c3254.f10340) && AbstractC2207.m4087(this.f10341, c3254.f10341) && AbstractC2207.m4087(this.f10342, c3254.f10342) && AbstractC2207.m4087(this.f10343, c3254.f10343);
    }

    public final int hashCode() {
        Long l = this.f10340;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10341;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f10342;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f10343;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("sf0Proto(diff_extra_count=");
        sb.append(this.f10340);
        sb.append(", total_extra_count=");
        sb.append(this.f10341);
        sb.append(", type=");
        sb.append(this.f10342);
        sb.append(", need_display_diff=");
        sb.append(this.f10343);
        sb.append(')');
        return sb.toString();
    }
}
