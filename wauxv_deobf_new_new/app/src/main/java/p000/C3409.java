package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤞᲇᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3409 {
    public static final C3408 Companion = new C3408();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10723;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10724;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10725;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10726;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10727;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f10728;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10729;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f10730;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f10732;

    public /* synthetic */ C3409(int i, Integer num, String str, Integer num2, String str2, Integer num3, Integer num4, Integer num5, String str3, Integer num6, String str4, Integer num7) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3407.f10721.mo1509());
            throw null;
        }
        this.f10722 = num;
        this.f10723 = str;
        this.f10724 = num2;
        this.f10725 = str2;
        this.f10726 = num3;
        this.f10727 = num4;
        this.f10728 = num5;
        this.f10729 = str3;
        this.f10730 = num6;
        this.f10731 = str4;
        this.f10732 = num7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3409)) {
            return false;
        }
        C3409 c3409 = (C3409) obj;
        return AbstractC1469.m3322(this.f10722, c3409.f10722) && AbstractC1469.m3322(this.f10723, c3409.f10723) && AbstractC1469.m3322(this.f10724, c3409.f10724) && AbstractC1469.m3322(this.f10725, c3409.f10725) && AbstractC1469.m3322(this.f10726, c3409.f10726) && AbstractC1469.m3322(this.f10727, c3409.f10727) && AbstractC1469.m3322(this.f10728, c3409.f10728) && AbstractC1469.m3322(this.f10729, c3409.f10729) && AbstractC1469.m3322(this.f10730, c3409.f10730) && AbstractC1469.m3322(this.f10731, c3409.f10731) && AbstractC1469.m3322(this.f10732, c3409.f10732);
    }

    public final int hashCode() {
        Integer num = this.f10722;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10723;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10724;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f10725;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num3 = this.f10726;
        int iHashCode5 = (iHashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10727;
        int iHashCode6 = (iHashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f10728;
        int iHashCode7 = (iHashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.f10729;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num6 = this.f10730;
        int iHashCode9 = (iHashCode8 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str4 = this.f10731;
        int iHashCode10 = (iHashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num7 = this.f10732;
        return iHashCode10 + (num7 != null ? num7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("wqProto(d=");
        sb.append(this.f10722);
        sb.append(", e=");
        sb.append(this.f10723);
        sb.append(", f=");
        sb.append(this.f10724);
        sb.append(", g=");
        sb.append(this.f10725);
        sb.append(", h=");
        sb.append(this.f10726);
        sb.append(", i=");
        sb.append(this.f10727);
        sb.append(", j=");
        sb.append(this.f10728);
        sb.append(", n=");
        sb.append(this.f10729);
        sb.append(", p=");
        sb.append(this.f10730);
        sb.append(", q=");
        sb.append(this.f10731);
        sb.append(", r=");
        return AbstractC2647.m4623(sb, this.f10732, ')');
    }
}
