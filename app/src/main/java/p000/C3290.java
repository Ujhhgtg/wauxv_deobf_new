package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤝᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3290 {
    public static final C3289 Companion = new C3289();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10425;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10426;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10427;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f10428;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f10429;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10430;

    public /* synthetic */ C3290(int i, Boolean bool, String str, Long l, Long l2, Boolean bool2, Integer num) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3288.f10424.mo1363());
            throw null;
        }
        this.f10425 = bool;
        this.f10426 = str;
        this.f10427 = l;
        this.f10428 = l2;
        this.f10429 = bool2;
        this.f10430 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3290)) {
            return false;
        }
        C3290 c3290 = (C3290) obj;
        return AbstractC2207.m4087(this.f10425, c3290.f10425) && AbstractC2207.m4087(this.f10426, c3290.f10426) && AbstractC2207.m4087(this.f10427, c3290.f10427) && AbstractC2207.m4087(this.f10428, c3290.f10428) && AbstractC2207.m4087(this.f10429, c3290.f10429) && AbstractC2207.m4087(this.f10430, c3290.f10430);
    }

    public final int hashCode() {
        Boolean bool = this.f10425;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f10426;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f10427;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10428;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.f10429;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f10430;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("u93Proto(is_concert_live=");
        sb.append(this.f10425);
        sb.append(", activity_id=");
        sb.append(this.f10426);
        sb.append(", topic_id=");
        sb.append(this.f10427);
        sb.append(", topic_type=");
        sb.append(this.f10428);
        sb.append(", enable_topic=");
        sb.append(this.f10429);
        sb.append(", has_ticket=");
        return AbstractC2668.m4677(sb, this.f10430, ')');
    }
}
