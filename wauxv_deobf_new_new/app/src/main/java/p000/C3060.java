package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᤞᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3060 {
    public static final C3059 Companion = new C3059();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9812;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9813;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9814;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9815;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9816;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9817;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9818;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Integer f9819;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f9820;

    public /* synthetic */ C3060(int i, String str, String str2, Integer num, Integer num2, String str3, Integer num3, String str4, Integer num4, String str5) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3058.f9811.mo1509());
            throw null;
        }
        this.f9812 = str;
        this.f9813 = str2;
        this.f9814 = num;
        this.f9815 = num2;
        this.f9816 = str3;
        this.f9817 = num3;
        this.f9818 = str4;
        this.f9819 = num4;
        this.f9820 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3060)) {
            return false;
        }
        C3060 c3060 = (C3060) obj;
        return AbstractC1469.m3322(this.f9812, c3060.f9812) && AbstractC1469.m3322(this.f9813, c3060.f9813) && AbstractC1469.m3322(this.f9814, c3060.f9814) && AbstractC1469.m3322(this.f9815, c3060.f9815) && AbstractC1469.m3322(this.f9816, c3060.f9816) && AbstractC1469.m3322(this.f9817, c3060.f9817) && AbstractC1469.m3322(this.f9818, c3060.f9818) && AbstractC1469.m3322(this.f9819, c3060.f9819) && AbstractC1469.m3322(this.f9820, c3060.f9820);
    }

    public final int hashCode() {
        String str = this.f9812;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9813;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f9814;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9815;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f9816;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f9817;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.f9818;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num4 = this.f9819;
        int iHashCode8 = (iHashCode7 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str5 = this.f9820;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("WeappInfoProto(appUserName=");
        sb.append(this.f9812);
        sb.append(", pagePath=");
        sb.append(this.f9813);
        sb.append(", version=");
        sb.append(this.f9814);
        sb.append(", debugMode=");
        sb.append(this.f9815);
        sb.append(", shareActionId=");
        sb.append(this.f9816);
        sb.append(", isGame=");
        sb.append(this.f9817);
        sb.append(", messageExtraData=");
        sb.append(this.f9818);
        sb.append(", subType=");
        sb.append(this.f9819);
        sb.append(", preloadResources=");
        return AbstractC1095.m2801(sb, this.f9820, ')');
    }
}
