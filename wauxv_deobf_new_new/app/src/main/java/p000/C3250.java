package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᲀᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3250 {
    public static final C3249 Companion = new C3249();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10361;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10362;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10363;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3328 f10364;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3286 f10365;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3428 f10366;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3334 f10367;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f10368;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10369;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f10370;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C3379 f10371;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C3443 f10372;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final String f10373;

    public /* synthetic */ C3250(int i, String str, Integer num, Integer num2, C3328 c3328, C3286 c3286, C3428 c3428, C3334 c3334, Integer num3, Integer num4, Integer num5, C3379 c3379, C3443 c3443, String str2) {
        if (8191 != (i & 8191)) {
            AbstractC2234.m4187(i, 8191, C3248.f10360.mo1509());
            throw null;
        }
        this.f10361 = str;
        this.f10362 = num;
        this.f10363 = num2;
        this.f10364 = c3328;
        this.f10365 = c3286;
        this.f10366 = c3428;
        this.f10367 = c3334;
        this.f10368 = num3;
        this.f10369 = num4;
        this.f10370 = num5;
        this.f10371 = c3379;
        this.f10372 = c3443;
        this.f10373 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3250)) {
            return false;
        }
        C3250 c3250 = (C3250) obj;
        return AbstractC1469.m3322(this.f10361, c3250.f10361) && AbstractC1469.m3322(this.f10362, c3250.f10362) && AbstractC1469.m3322(this.f10363, c3250.f10363) && AbstractC1469.m3322(this.f10364, c3250.f10364) && AbstractC1469.m3322(this.f10365, c3250.f10365) && AbstractC1469.m3322(this.f10366, c3250.f10366) && AbstractC1469.m3322(this.f10367, c3250.f10367) && AbstractC1469.m3322(this.f10368, c3250.f10368) && AbstractC1469.m3322(this.f10369, c3250.f10369) && AbstractC1469.m3322(this.f10370, c3250.f10370) && AbstractC1469.m3322(this.f10371, c3250.f10371) && AbstractC1469.m3322(this.f10372, c3250.f10372) && AbstractC1469.m3322(this.f10373, c3250.f10373);
    }

    public final int hashCode() {
        String str = this.f10361;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10362;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10363;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C3328 c3328 = this.f10364;
        int iHashCode4 = (iHashCode3 + (c3328 == null ? 0 : c3328.hashCode())) * 31;
        C3286 c3286 = this.f10365;
        int iHashCode5 = (iHashCode4 + (c3286 == null ? 0 : c3286.hashCode())) * 31;
        C3428 c3428 = this.f10366;
        int iHashCode6 = (iHashCode5 + (c3428 == null ? 0 : c3428.hashCode())) * 31;
        C3334 c3334 = this.f10367;
        int iHashCode7 = (iHashCode6 + (c3334 == null ? 0 : c3334.hashCode())) * 31;
        Integer num3 = this.f10368;
        int iHashCode8 = (iHashCode7 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10369;
        int iHashCode9 = (iHashCode8 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10370;
        int iHashCode10 = (iHashCode9 + (num5 == null ? 0 : num5.hashCode())) * 31;
        C3379 c3379 = this.f10371;
        int iHashCode11 = (iHashCode10 + (c3379 == null ? 0 : c3379.hashCode())) * 31;
        C3443 c3443 = this.f10372;
        int iHashCode12 = (iHashCode11 + (c3443 == null ? 0 : c3443.hashCode())) * 31;
        String str2 = this.f10373;
        return iHashCode12 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("nr5Proto(d=");
        sb.append(this.f10361);
        sb.append(", e=");
        sb.append(this.f10362);
        sb.append(", f=");
        sb.append(this.f10363);
        sb.append(", g=");
        sb.append(this.f10364);
        sb.append(", h=");
        sb.append(this.f10365);
        sb.append(", i=");
        sb.append(this.f10366);
        sb.append(", j=");
        sb.append(this.f10367);
        sb.append(", n=");
        sb.append(this.f10368);
        sb.append(", o=");
        sb.append(this.f10369);
        sb.append(", p=");
        sb.append(this.f10370);
        sb.append(", q=");
        sb.append(this.f10371);
        sb.append(", r=");
        sb.append(this.f10372);
        sb.append(", s=");
        return AbstractC1095.m2801(sb, this.f10373, ')');
    }
}
