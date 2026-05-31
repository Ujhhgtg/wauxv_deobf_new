package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᛸᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3349 {
    public static final C3348 Companion = new C3348();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10592;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10593;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10594;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f10595;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Boolean f10596;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10597;

    public /* synthetic */ C3349(int i, Boolean bool, String str, Long l, Long l2, Boolean bool2, Integer num) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3347.f10591.mo1509());
            throw null;
        }
        this.f10592 = bool;
        this.f10593 = str;
        this.f10594 = l;
        this.f10595 = l2;
        this.f10596 = bool2;
        this.f10597 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3349)) {
            return false;
        }
        C3349 c3349 = (C3349) obj;
        return AbstractC1469.m3322(this.f10592, c3349.f10592) && AbstractC1469.m3322(this.f10593, c3349.f10593) && AbstractC1469.m3322(this.f10594, c3349.f10594) && AbstractC1469.m3322(this.f10595, c3349.f10595) && AbstractC1469.m3322(this.f10596, c3349.f10596) && AbstractC1469.m3322(this.f10597, c3349.f10597);
    }

    public final int hashCode() {
        Boolean bool = this.f10592;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f10593;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.f10594;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10595;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Boolean bool2 = this.f10596;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num = this.f10597;
        return iHashCode5 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("u93Proto(is_concert_live=");
        sb.append(this.f10592);
        sb.append(", activity_id=");
        sb.append(this.f10593);
        sb.append(", topic_id=");
        sb.append(this.f10594);
        sb.append(", topic_type=");
        sb.append(this.f10595);
        sb.append(", enable_topic=");
        sb.append(this.f10596);
        sb.append(", has_ticket=");
        return AbstractC2647.m4623(sb, this.f10597, ')');
    }
}
