package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᛸᲇᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3277 {
    public static final C3276 Companion = new C3276();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10409;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Float f10410;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10411;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10412;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Float f10413;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10414;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10415;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Long f10416;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10417;

    public /* synthetic */ C3277(int i, Integer num, Float f, Integer num2, Integer num3, Float f2, Integer num4, Integer num5, Long l, String str) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3275.f10408.mo1509());
            throw null;
        }
        this.f10409 = num;
        this.f10410 = f;
        this.f10411 = num2;
        this.f10412 = num3;
        this.f10413 = f2;
        this.f10414 = num4;
        this.f10415 = num5;
        this.f10416 = l;
        this.f10417 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3277)) {
            return false;
        }
        C3277 c3277 = (C3277) obj;
        return AbstractC1469.m3322(this.f10409, c3277.f10409) && AbstractC1469.m3322(this.f10410, c3277.f10410) && AbstractC1469.m3322(this.f10411, c3277.f10411) && AbstractC1469.m3322(this.f10412, c3277.f10412) && AbstractC1469.m3322(this.f10413, c3277.f10413) && AbstractC1469.m3322(this.f10414, c3277.f10414) && AbstractC1469.m3322(this.f10415, c3277.f10415) && AbstractC1469.m3322(this.f10416, c3277.f10416) && AbstractC1469.m3322(this.f10417, c3277.f10417);
    }

    public final int hashCode() {
        Integer num = this.f10409;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Float f = this.f10410;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f10411;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10412;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Float f2 = this.f10413;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num4 = this.f10414;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10415;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Long l = this.f10416;
        int iHashCode8 = (iHashCode7 + (l == null ? 0 : l.hashCode())) * 31;
        String str = this.f10417;
        return iHashCode8 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("p61Proto(video_quality_level=");
        sb.append(this.f10409);
        sb.append(", preload_file_size_percent=");
        sb.append(this.f10410);
        sb.append(", preload_file_bytes=");
        sb.append(this.f10411);
        sb.append(", file_total_bytes=");
        sb.append(this.f10412);
        sb.append(", preload_file_duration_percent=");
        sb.append(this.f10413);
        sb.append(", preload_file_duration=");
        sb.append(this.f10414);
        sb.append(", preload_file_total_duration=");
        sb.append(this.f10415);
        sb.append(", preload_start_time=");
        sb.append(this.f10416);
        sb.append(", tag_name=");
        return AbstractC1095.m2801(sb, this.f10417, ')');
    }
}
