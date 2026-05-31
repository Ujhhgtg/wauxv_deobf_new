package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲈᤞᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3437 {
    public static final C3436 Companion = new C3436();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10802;

    public /* synthetic */ C3437(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3435.f10800.mo1509());
            throw null;
        }
        this.f10801 = l;
        this.f10802 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3437)) {
            return false;
        }
        C3437 c3437 = (C3437) obj;
        return AbstractC1469.m3322(this.f10801, c3437.f10801) && AbstractC1469.m3322(this.f10802, c3437.f10802);
    }

    public final int hashCode() {
        Long l = this.f10801;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10802;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("yq5Proto(start_time_ms=");
        sb.append(this.f10801);
        sb.append(", end_time_ms=");
        sb.append(this.f10802);
        sb.append(')');
        return sb.toString();
    }
}
