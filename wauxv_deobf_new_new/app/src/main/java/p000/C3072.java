package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲇᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3072 {
    public static final C3071 Companion = new C3071();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3310 f9857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9858;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9859;

    public /* synthetic */ C3072(int i, C3310 c3310, Long l, Long l2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3070.f9856.mo1509());
            throw null;
        }
        this.f9857 = c3310;
        this.f9858 = l;
        this.f9859 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3072)) {
            return false;
        }
        C3072 c3072 = (C3072) obj;
        return AbstractC1469.m3322(this.f9857, c3072.f9857) && AbstractC1469.m3322(this.f9858, c3072.f9858) && AbstractC1469.m3322(this.f9859, c3072.f9859);
    }

    public final int hashCode() {
        C3310 c3310 = this.f9857;
        int iHashCode = (c3310 == null ? 0 : c3310.hashCode()) * 31;
        Long l = this.f9858;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9859;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ab3Proto(gift=");
        sb.append(this.f9857);
        sb.append(", product_target_count=");
        sb.append(this.f9858);
        sb.append(", product_cur_count=");
        sb.append(this.f9859);
        sb.append(')');
        return sb.toString();
    }
}
