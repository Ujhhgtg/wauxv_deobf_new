package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᤝᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3178 {
    public static final C3177 Companion = new C3177();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10107;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10109;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10110;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10111;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Long f10112;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Long f10113;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Long f10114;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10115;

    public /* synthetic */ C3178(int i, Integer num, String str, Integer num2, Integer num3, String str2, Long l, Long l2, Long l3, String str3) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3176.f10106.mo1509());
            throw null;
        }
        this.f10107 = num;
        this.f10108 = str;
        this.f10109 = num2;
        this.f10110 = num3;
        this.f10111 = str2;
        this.f10112 = l;
        this.f10113 = l2;
        this.f10114 = l3;
        this.f10115 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3178)) {
            return false;
        }
        C3178 c3178 = (C3178) obj;
        return AbstractC1469.m3322(this.f10107, c3178.f10107) && AbstractC1469.m3322(this.f10108, c3178.f10108) && AbstractC1469.m3322(this.f10109, c3178.f10109) && AbstractC1469.m3322(this.f10110, c3178.f10110) && AbstractC1469.m3322(this.f10111, c3178.f10111) && AbstractC1469.m3322(this.f10112, c3178.f10112) && AbstractC1469.m3322(this.f10113, c3178.f10113) && AbstractC1469.m3322(this.f10114, c3178.f10114) && AbstractC1469.m3322(this.f10115, c3178.f10115);
    }

    public final int hashCode() {
        Integer num = this.f10107;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10108;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10109;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10110;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f10111;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f10112;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10113;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f10114;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f10115;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("kb3Proto(d=");
        sb.append(this.f10107);
        sb.append(", e=");
        sb.append(this.f10108);
        sb.append(", f=");
        sb.append(this.f10109);
        sb.append(", g=");
        sb.append(this.f10110);
        sb.append(", n=");
        sb.append(this.f10111);
        sb.append(", o=");
        sb.append(this.f10112);
        sb.append(", p=");
        sb.append(this.f10113);
        sb.append(", q=");
        sb.append(this.f10114);
        sb.append(", r=");
        return AbstractC1095.m2801(sb, this.f10115, ')');
    }
}
