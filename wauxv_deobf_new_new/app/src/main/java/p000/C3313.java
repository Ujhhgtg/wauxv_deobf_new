package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᲇᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3313 {
    public static final C3312 Companion = new C3312();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Long f10507;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10508;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10509;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Boolean f10510;

    public /* synthetic */ C3313(int i, Long l, Long l2, Integer num, Boolean bool) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3311.f10506.mo1509());
            throw null;
        }
        this.f10507 = l;
        this.f10508 = l2;
        this.f10509 = num;
        this.f10510 = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3313)) {
            return false;
        }
        C3313 c3313 = (C3313) obj;
        return AbstractC1469.m3322(this.f10507, c3313.f10507) && AbstractC1469.m3322(this.f10508, c3313.f10508) && AbstractC1469.m3322(this.f10509, c3313.f10509) && AbstractC1469.m3322(this.f10510, c3313.f10510);
    }

    public final int hashCode() {
        Long l = this.f10507;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f10508;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f10509;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f10510;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("sf0Proto(diff_extra_count=");
        sb.append(this.f10507);
        sb.append(", total_extra_count=");
        sb.append(this.f10508);
        sb.append(", type=");
        sb.append(this.f10509);
        sb.append(", need_display_diff=");
        sb.append(this.f10510);
        sb.append(')');
        return sb.toString();
    }
}
