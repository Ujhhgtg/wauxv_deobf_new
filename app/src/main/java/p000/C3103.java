package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᤞᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3103 {
    public static final C3102 Companion = new C3102();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9905;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9906;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9907;

    public /* synthetic */ C3103(int i, Integer num, Integer num2, Long l) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3101.f9904.mo1363());
            throw null;
        }
        this.f9905 = num;
        this.f9906 = num2;
        this.f9907 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3103)) {
            return false;
        }
        C3103 c3103 = (C3103) obj;
        return AbstractC2207.m4087(this.f9905, c3103.f9905) && AbstractC2207.m4087(this.f9906, c3103.f9906) && AbstractC2207.m4087(this.f9907, c3103.f9907);
    }

    public final int hashCode() {
        Integer num = this.f9905;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9906;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f9907;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("il1Proto(online_member_count=");
        sb.append(this.f9905);
        sb.append(", like_count=");
        sb.append(this.f9906);
        sb.append(", update_time=");
        sb.append(this.f9907);
        sb.append(')');
        return sb.toString();
    }
}
