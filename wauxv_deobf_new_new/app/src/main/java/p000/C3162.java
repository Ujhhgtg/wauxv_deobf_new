package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᤞᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3162 {
    public static final C3161 Companion = new C3161();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10072;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10073;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10074;

    public /* synthetic */ C3162(int i, Integer num, Integer num2, Long l) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3160.f10071.mo1509());
            throw null;
        }
        this.f10072 = num;
        this.f10073 = num2;
        this.f10074 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3162)) {
            return false;
        }
        C3162 c3162 = (C3162) obj;
        return AbstractC1469.m3322(this.f10072, c3162.f10072) && AbstractC1469.m3322(this.f10073, c3162.f10073) && AbstractC1469.m3322(this.f10074, c3162.f10074);
    }

    public final int hashCode() {
        Integer num = this.f10072;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10073;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f10074;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("il1Proto(online_member_count=");
        sb.append(this.f10072);
        sb.append(", like_count=");
        sb.append(this.f10073);
        sb.append(", update_time=");
        sb.append(this.f10074);
        sb.append(')');
        return sb.toString();
    }
}
