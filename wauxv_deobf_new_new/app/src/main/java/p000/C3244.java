package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᲈᤝᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3244 {
    public static final C3243 Companion = new C3243();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3409 f10352;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10353;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10354;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f10355;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10356;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10357;

    public /* synthetic */ C3244(int i, C3409 c3409, Integer num, Integer num2, Long l, String str, Integer num3) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3242.f10351.mo1509());
            throw null;
        }
        this.f10352 = c3409;
        this.f10353 = num;
        this.f10354 = num2;
        this.f10355 = l;
        this.f10356 = str;
        this.f10357 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3244)) {
            return false;
        }
        C3244 c3244 = (C3244) obj;
        return AbstractC1469.m3322(this.f10352, c3244.f10352) && AbstractC1469.m3322(this.f10353, c3244.f10353) && AbstractC1469.m3322(this.f10354, c3244.f10354) && AbstractC1469.m3322(this.f10355, c3244.f10355) && AbstractC1469.m3322(this.f10356, c3244.f10356) && AbstractC1469.m3322(this.f10357, c3244.f10357);
    }

    public final int hashCode() {
        C3409 c3409 = this.f10352;
        int iHashCode = (c3409 == null ? 0 : c3409.hashCode()) * 31;
        Integer num = this.f10353;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10354;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f10355;
        int iHashCode4 = (iHashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f10356;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f10357;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("nk1Proto(cdn_trans_info=");
        sb.append(this.f10352);
        sb.append(", recommend_video_quality_level=");
        sb.append(this.f10353);
        sb.append(", force_recommend=");
        sb.append(this.f10354);
        sb.append(", replay_transition_video_id=");
        sb.append(this.f10355);
        sb.append(", replay_transition_url=");
        sb.append(this.f10356);
        sb.append(", disable_replay_transition=");
        return AbstractC2647.m4623(sb, this.f10357, ')');
    }
}
