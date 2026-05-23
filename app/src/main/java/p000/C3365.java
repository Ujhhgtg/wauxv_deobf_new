package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3365 {
    public static final C3364 Companion = new C3364();

    public final Long f10618;

    public final Long f10619;

    public /* synthetic */ C3365(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3363.f10617.mo1363());
            throw null;
        }
        this.f10618 = l;
        this.f10619 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3365)) {
            return false;
        }
        C3365 c3365 = (C3365) obj;
        return AbstractC2207.m4087(this.f10618, c3365.f10618) && AbstractC2207.m4087(this.f10619, c3365.f10619);
    }

    public final int hashCode() {
        Long l = this.f10618;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10619;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("xq5Proto(animation_start_time_offset_ms=");
        sb.append(this.f10618);
        sb.append(", duration_ms=");
        sb.append(this.f10619);
        sb.append(')');
        return sb.toString();
    }
}
