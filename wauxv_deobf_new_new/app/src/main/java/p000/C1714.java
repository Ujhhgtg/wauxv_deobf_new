package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1714 {
    public static final C1707 Companion = new C1707();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0358 f5800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C1710 f5801;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f5802;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1713 f5803;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f5804;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f5805;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f5806;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f5807;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f5808;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f5809;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f5810;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f5811;

    public /* synthetic */ C1714(int i, C0358 c0358, C1710 c1710, String str, C1713 c1713, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, String str8) {
        if (4095 != (i & 4095)) {
            AbstractC2234.m4187(i, 4095, C1706.f5790.mo1509());
            throw null;
        }
        this.f5800 = c0358;
        this.f5801 = c1710;
        this.f5802 = str;
        this.f5803 = c1713;
        this.f5804 = str2;
        this.f5805 = str3;
        this.f5806 = str4;
        this.f5807 = str5;
        this.f5808 = str6;
        this.f5809 = num;
        this.f5810 = str7;
        this.f5811 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1714)) {
            return false;
        }
        C1714 c1714 = (C1714) obj;
        return AbstractC1469.m3322(this.f5800, c1714.f5800) && AbstractC1469.m3322(this.f5801, c1714.f5801) && AbstractC1469.m3322(this.f5802, c1714.f5802) && AbstractC1469.m3322(this.f5803, c1714.f5803) && AbstractC1469.m3322(this.f5804, c1714.f5804) && AbstractC1469.m3322(this.f5805, c1714.f5805) && AbstractC1469.m3322(this.f5806, c1714.f5806) && AbstractC1469.m3322(this.f5807, c1714.f5807) && AbstractC1469.m3322(this.f5808, c1714.f5808) && AbstractC1469.m3322(this.f5809, c1714.f5809) && AbstractC1469.m3322(this.f5810, c1714.f5810) && AbstractC1469.m3322(this.f5811, c1714.f5811);
    }

    public final int hashCode() {
        C0358 c0358 = this.f5800;
        int iHashCode = (c0358 == null ? 0 : c0358.hashCode()) * 31;
        C1710 c1710 = this.f5801;
        int iHashCode2 = (iHashCode + (c1710 == null ? 0 : c1710.hashCode())) * 31;
        String str = this.f5802;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1713 c1713 = this.f5803;
        int iHashCode4 = (iHashCode3 + (c1713 == null ? 0 : c1713.hashCode())) * 31;
        String str2 = this.f5804;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5805;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5806;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f5807;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f5808;
        int iHashCode9 = (iHashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.f5809;
        int iHashCode10 = (iHashCode9 + (num == null ? 0 : num.hashCode())) * 31;
        String str7 = this.f5810;
        int iHashCode11 = (iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f5811;
        return iHashCode11 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("JSLoginResp(baseResponse=");
        sb.append(this.f5800);
        sb.append(", jsapiBaseResp=");
        sb.append(this.f5801);
        sb.append(", code=");
        sb.append(this.f5802);
        sb.append(", scopeList=");
        sb.append(this.f5803);
        sb.append(", appName=");
        sb.append(this.f5804);
        sb.append(", appIconUrl=");
        sb.append(this.f5805);
        sb.append(", openid=");
        sb.append(this.f5806);
        sb.append(", sessionKey=");
        sb.append(this.f5807);
        sb.append(", sessionTicket=");
        sb.append(this.f5808);
        sb.append(", lifespan=");
        sb.append(this.f5809);
        sb.append(", state=");
        sb.append(this.f5810);
        sb.append(", signature=");
        return AbstractC1095.m2801(sb, this.f5811, ')');
    }
}
