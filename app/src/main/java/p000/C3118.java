package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᤞᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3118 {
    public static final C3117 Companion = new C3117();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9939;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9940;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9941;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9942;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9943;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Long f9944;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Long f9945;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Long f9946;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f9947;

    public /* synthetic */ C3118(int i, Integer num, String str, Integer num2, Integer num3, String str2, Long l, Long l2, Long l3, String str3) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3116.f9938.mo1363());
            throw null;
        }
        this.f9939 = num;
        this.f9940 = str;
        this.f9941 = num2;
        this.f9942 = num3;
        this.f9943 = str2;
        this.f9944 = l;
        this.f9945 = l2;
        this.f9946 = l3;
        this.f9947 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3118)) {
            return false;
        }
        C3118 c3118 = (C3118) obj;
        return AbstractC2207.m4087(this.f9939, c3118.f9939) && AbstractC2207.m4087(this.f9940, c3118.f9940) && AbstractC2207.m4087(this.f9941, c3118.f9941) && AbstractC2207.m4087(this.f9942, c3118.f9942) && AbstractC2207.m4087(this.f9943, c3118.f9943) && AbstractC2207.m4087(this.f9944, c3118.f9944) && AbstractC2207.m4087(this.f9945, c3118.f9945) && AbstractC2207.m4087(this.f9946, c3118.f9946) && AbstractC2207.m4087(this.f9947, c3118.f9947);
    }

    public final int hashCode() {
        Integer num = this.f9939;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9940;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f9941;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9942;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.f9943;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f9944;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9945;
        int iHashCode7 = (iHashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.f9946;
        int iHashCode8 = (iHashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str3 = this.f9947;
        return iHashCode8 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("kb3Proto(d=");
        sb.append(this.f9939);
        sb.append(", e=");
        sb.append(this.f9940);
        sb.append(", f=");
        sb.append(this.f9941);
        sb.append(", g=");
        sb.append(this.f9942);
        sb.append(", n=");
        sb.append(this.f9943);
        sb.append(", o=");
        sb.append(this.f9944);
        sb.append(", p=");
        sb.append(this.f9945);
        sb.append(", q=");
        sb.append(this.f9946);
        sb.append(", r=");
        return AbstractC1194.m2786(sb, this.f9947, ')');
    }
}
