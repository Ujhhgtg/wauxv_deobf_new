package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᲁᛸᲈᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2387 {
    public static final C2386 Companion = new C2386();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f7649;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f7650;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Double f7651;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f7652;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f7653;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f7654;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f7655;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f7656;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f7657;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f7658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f7659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f7660;

    public /* synthetic */ C2387(int i, String str, String str2, Double d, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4, String str6, String str7) {
        if (4095 != (i & 4095)) {
            AbstractC2234.m4187(i, 4095, C2385.f7648.mo1509());
            throw null;
        }
        this.f7649 = str;
        this.f7650 = str2;
        this.f7651 = d;
        this.f7652 = str3;
        this.f7653 = num;
        this.f7654 = num2;
        this.f7655 = num3;
        this.f7656 = str4;
        this.f7657 = str5;
        this.f7658 = num4;
        this.f7659 = str6;
        this.f7660 = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2387)) {
            return false;
        }
        C2387 c2387 = (C2387) obj;
        return AbstractC1469.m3322(this.f7649, c2387.f7649) && AbstractC1469.m3322(this.f7650, c2387.f7650) && AbstractC1469.m3322(this.f7651, c2387.f7651) && AbstractC1469.m3322(this.f7652, c2387.f7652) && AbstractC1469.m3322(this.f7653, c2387.f7653) && AbstractC1469.m3322(this.f7654, c2387.f7654) && AbstractC1469.m3322(this.f7655, c2387.f7655) && AbstractC1469.m3322(this.f7656, c2387.f7656) && AbstractC1469.m3322(this.f7657, c2387.f7657) && AbstractC1469.m3322(this.f7658, c2387.f7658) && AbstractC1469.m3322(this.f7659, c2387.f7659) && AbstractC1469.m3322(this.f7660, c2387.f7660);
    }

    public final int hashCode() {
        String str = this.f7649;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7650;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.f7651;
        int iHashCode3 = (iHashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        String str3 = this.f7652;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f7653;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7654;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7655;
        int iHashCode7 = (iHashCode6 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f7656;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f7657;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num4 = this.f7658;
        int iHashCode10 = (iHashCode9 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str6 = this.f7659;
        int iHashCode11 = (iHashCode10 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f7660;
        return iHashCode11 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("PayMsgPb(username=");
        sb.append(this.f7649);
        sb.append(", transId=");
        sb.append(this.f7650);
        sb.append(", fee=");
        sb.append(this.f7651);
        sb.append(", feeType=");
        sb.append(this.f7652);
        sb.append(", timestamp=");
        sb.append(this.f7653);
        sb.append(", scene=");
        sb.append(this.f7654);
        sb.append(", status=");
        sb.append(this.f7655);
        sb.append(", displayName=");
        sb.append(this.f7656);
        sb.append(", outTradeNo=");
        sb.append(this.f7657);
        sb.append(", msgType=");
        sb.append(this.f7658);
        sb.append(", type=");
        sb.append(this.f7659);
        sb.append(", headImgUrl=");
        return AbstractC1095.m2801(sb, this.f7660, ')');
    }
}
