package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲈᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3075 {
    public static final C3074 Companion = new C3074();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9861;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f9864;

    public /* synthetic */ C3075(int i, Integer num, Integer num2, Long l, Long l2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3073.f9860.mo1509());
            throw null;
        }
        this.f9861 = num;
        this.f9862 = num2;
        this.f9863 = l;
        this.f9864 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3075)) {
            return false;
        }
        C3075 c3075 = (C3075) obj;
        return AbstractC1469.m3322(this.f9861, c3075.f9861) && AbstractC1469.m3322(this.f9862, c3075.f9862) && AbstractC1469.m3322(this.f9863, c3075.f9863) && AbstractC1469.m3322(this.f9864, c3075.f9864);
    }

    public final int hashCode() {
        Integer num = this.f9861;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9862;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9863;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9864;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ah4Proto(pk_extra_times_multi_100=");
        sb.append(this.f9861);
        sb.append(", buff_duration=");
        sb.append(this.f9862);
        sb.append(", start_time=");
        sb.append(this.f9863);
        sb.append(", end_time=");
        sb.append(this.f9864);
        sb.append(')');
        return sb.toString();
    }
}
