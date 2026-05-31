package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᤞᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3425 {
    public static final C3424 Companion = new C3424();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10786;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10787;

    public /* synthetic */ C3425(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3423.f10785.mo1509());
            throw null;
        }
        this.f10786 = l;
        this.f10787 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3425)) {
            return false;
        }
        C3425 c3425 = (C3425) obj;
        return AbstractC1469.m3322(this.f10786, c3425.f10786) && AbstractC1469.m3322(this.f10787, c3425.f10787);
    }

    public final int hashCode() {
        Long l = this.f10786;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10787;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("xq5Proto(animation_start_time_offset_ms=");
        sb.append(this.f10786);
        sb.append(", duration_ms=");
        sb.append(this.f10787);
        sb.append(')');
        return sb.toString();
    }
}
