package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲀᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3013 {
    public static final C3012 Companion = new C3012();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3251 f9690;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9691;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9692;

    public /* synthetic */ C3013(int i, C3251 c3251, Long l, Long l2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3011.f9689.mo1363());
            throw null;
        }
        this.f9690 = c3251;
        this.f9691 = l;
        this.f9692 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3013)) {
            return false;
        }
        C3013 c3013 = (C3013) obj;
        return AbstractC2207.m4087(this.f9690, c3013.f9690) && AbstractC2207.m4087(this.f9691, c3013.f9691) && AbstractC2207.m4087(this.f9692, c3013.f9692);
    }

    public final int hashCode() {
        C3251 c3251 = this.f9690;
        int iHashCode = (c3251 == null ? 0 : c3251.hashCode()) * 31;
        Long l = this.f9691;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9692;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ab3Proto(gift=");
        sb.append(this.f9690);
        sb.append(", product_target_count=");
        sb.append(this.f9691);
        sb.append(", product_cur_count=");
        sb.append(this.f9692);
        sb.append(')');
        return sb.toString();
    }
}
