package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲀᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3016 {
    public static final C3015 Companion = new C3015();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9694;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9695;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9696;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f9697;

    public /* synthetic */ C3016(int i, Integer num, Integer num2, Long l, Long l2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3014.f9693.mo1363());
            throw null;
        }
        this.f9694 = num;
        this.f9695 = num2;
        this.f9696 = l;
        this.f9697 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3016)) {
            return false;
        }
        C3016 c3016 = (C3016) obj;
        return AbstractC2207.m4087(this.f9694, c3016.f9694) && AbstractC2207.m4087(this.f9695, c3016.f9695) && AbstractC2207.m4087(this.f9696, c3016.f9696) && AbstractC2207.m4087(this.f9697, c3016.f9697);
    }

    public final int hashCode() {
        Integer num = this.f9694;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9695;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9696;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9697;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ah4Proto(pk_extra_times_multi_100=");
        sb.append(this.f9694);
        sb.append(", buff_duration=");
        sb.append(this.f9695);
        sb.append(", start_time=");
        sb.append(this.f9696);
        sb.append(", end_time=");
        sb.append(this.f9697);
        sb.append(')');
        return sb.toString();
    }
}
