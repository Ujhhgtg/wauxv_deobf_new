package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᤞᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3152 {
    public static final C3151 Companion = new C3151();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10039;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10040;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3073 f10041;

    public /* synthetic */ C3152(int i, Integer num, Integer num2, Integer num3, Integer num4, C3073 c3073) {
        if (31 != (i & 31)) {
            AbstractC1270.m2997(i, 31, C3150.f10036.mo1363());
            throw null;
        }
        this.f10037 = num;
        this.f10038 = num2;
        this.f10039 = num3;
        this.f10040 = num4;
        this.f10041 = c3073;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3152)) {
            return false;
        }
        C3152 c3152 = (C3152) obj;
        return AbstractC2207.m4087(this.f10037, c3152.f10037) && AbstractC2207.m4087(this.f10038, c3152.f10038) && AbstractC2207.m4087(this.f10039, c3152.f10039) && AbstractC2207.m4087(this.f10040, c3152.f10040) && AbstractC2207.m4087(this.f10041, c3152.f10041);
    }

    public final int hashCode() {
        Integer num = this.f10037;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f10038;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10039;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10040;
        int iHashCode4 = (iHashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        C3073 c3073 = this.f10041;
        return iHashCode4 + (c3073 != null ? c3073.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("m81Proto(event_id=");
        sb.append(this.f10037);
        sb.append(", participant_identity=");
        sb.append(this.f10038);
        sb.append(", event_status=");
        sb.append(this.f10039);
        sb.append(", stream_status=");
        sb.append(this.f10040);
        sb.append(", related_events=");
        sb.append(this.f10041);
        sb.append(')');
        return sb.toString();
    }
}
