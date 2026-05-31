package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤞᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2990 {
    public static final C2989 Companion = new C2989();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9562;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9563;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3005 f9568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2993 f9570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2999 f9571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C3002 f9572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C3002 f9573;

    public /* synthetic */ C2990(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, C3005 c3005, String str5, C2993 c2993, C2999 c2999, C3002 c3002, C3002 c3003) {
        if (4095 != (i & 4095)) {
            AbstractC2234.m4187(i, 4095, C2988.f9561.mo1509());
            throw null;
        }
        this.f9562 = num;
        this.f9563 = str;
        this.f9564 = num2;
        this.f9565 = str2;
        this.f9566 = str3;
        this.f9567 = str4;
        this.f9568 = c3005;
        this.f9569 = str5;
        this.f9570 = c2993;
        this.f9571 = c2999;
        this.f9572 = c3002;
        this.f9573 = c3003;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2990)) {
            return false;
        }
        C2990 c2990 = (C2990) obj;
        return AbstractC1469.m3322(this.f9562, c2990.f9562) && AbstractC1469.m3322(this.f9563, c2990.f9563) && AbstractC1469.m3322(this.f9564, c2990.f9564) && AbstractC1469.m3322(this.f9565, c2990.f9565) && AbstractC1469.m3322(this.f9566, c2990.f9566) && AbstractC1469.m3322(this.f9567, c2990.f9567) && AbstractC1469.m3322(this.f9568, c2990.f9568) && AbstractC1469.m3322(this.f9569, c2990.f9569) && AbstractC1469.m3322(this.f9570, c2990.f9570) && AbstractC1469.m3322(this.f9571, c2990.f9571) && AbstractC1469.m3322(this.f9572, c2990.f9572) && AbstractC1469.m3322(this.f9573, c2990.f9573);
    }

    public final int hashCode() {
        Integer num = this.f9562;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9563;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f9564;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f9565;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9566;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9567;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C3005 c3005 = this.f9568;
        int iHashCode7 = (iHashCode6 + (c3005 == null ? 0 : c3005.hashCode())) * 31;
        String str5 = this.f9569;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C2993 c2993 = this.f9570;
        int iHashCode9 = (iHashCode8 + (c2993 == null ? 0 : c2993.hashCode())) * 31;
        C2999 c2999 = this.f9571;
        int iHashCode10 = (iHashCode9 + (c2999 == null ? 0 : c2999.hashCode())) * 31;
        C3002 c3002 = this.f9572;
        int iHashCode11 = (iHashCode10 + (c3002 == null ? 0 : c3002.hashCode())) * 31;
        C3002 c3003 = this.f9573;
        return iHashCode11 + (c3003 != null ? c3003.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ActionInfoProto(type=");
        sb.append(this.f9562);
        sb.append(", url=");
        sb.append(this.f9563);
        sb.append(", scene=");
        sb.append(this.f9564);
        sb.append(", appid=");
        sb.append(this.f9565);
        sb.append(", mediaTagName=");
        sb.append(this.f9566);
        sb.append(", wordingKey=");
        sb.append(this.f9567);
        sb.append(", appMsg=");
        sb.append(this.f9568);
        sb.append(", newWordingKey=");
        sb.append(this.f9569);
        sb.append(", appActionScene=");
        sb.append(this.f9570);
        sb.append(", appJumpWordingKey=");
        sb.append(this.f9571);
        sb.append(", installedWording=");
        sb.append(this.f9572);
        sb.append(", uninstalledWording=");
        sb.append(this.f9573);
        sb.append(')');
        return sb.toString();
    }
}
