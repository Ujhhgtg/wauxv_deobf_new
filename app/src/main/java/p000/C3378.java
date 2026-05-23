package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᤞᲈᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3378 {
    public static final C3377 Companion = new C3377();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10634;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10635;

    public /* synthetic */ C3378(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3376.f10633.mo1363());
            throw null;
        }
        this.f10634 = l;
        this.f10635 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3378)) {
            return false;
        }
        C3378 c3378 = (C3378) obj;
        return AbstractC2207.m4087(this.f10634, c3378.f10634) && AbstractC2207.m4087(this.f10635, c3378.f10635);
    }

    public final int hashCode() {
        Long l = this.f10634;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10635;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("yq5Proto(start_time_ms=");
        sb.append(this.f10634);
        sb.append(", end_time_ms=");
        sb.append(this.f10635);
        sb.append(')');
        return sb.toString();
    }
}
