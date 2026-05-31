package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᲀᲈᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3211 {
    public static final C3210 Companion = new C3210();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10204;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10205;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10206;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10207;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3132 f10208;

    public /* synthetic */ C3211(int i, Integer num, Integer num2, Integer num3, Integer num4, C3132 c3132) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3209.f10203.mo1509());
            throw null;
        }
        this.f10204 = num;
        this.f10205 = num2;
        this.f10206 = num3;
        this.f10207 = num4;
        this.f10208 = c3132;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3211)) {
            return false;
        }
        C3211 c3211 = (C3211) obj;
        return AbstractC1469.m3322(this.f10204, c3211.f10204) && AbstractC1469.m3322(this.f10205, c3211.f10205) && AbstractC1469.m3322(this.f10206, c3211.f10206) && AbstractC1469.m3322(this.f10207, c3211.f10207) && AbstractC1469.m3322(this.f10208, c3211.f10208);
    }

    public final int hashCode() {
        Integer num = this.f10204;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10205;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10206;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10207;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C3132 c3132 = this.f10208;
        return iHashCode4 + (c3132 != null ? c3132.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("m81Proto(event_id=");
        sb.append(this.f10204);
        sb.append(", participant_identity=");
        sb.append(this.f10205);
        sb.append(", event_status=");
        sb.append(this.f10206);
        sb.append(", stream_status=");
        sb.append(this.f10207);
        sb.append(", related_events=");
        sb.append(this.f10208);
        sb.append(')');
        return sb.toString();
    }
}
