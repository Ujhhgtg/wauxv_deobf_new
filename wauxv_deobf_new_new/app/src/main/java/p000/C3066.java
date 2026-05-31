package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᛸᲀᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3066 {
    public static final C3065 Companion = new C3065();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9845;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9847;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9848;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9849;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9850;

    public /* synthetic */ C3066(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C3064.f9842.mo1509());
            throw null;
        }
        this.f9843 = str;
        this.f9844 = str2;
        this.f9845 = str3;
        this.f9846 = str4;
        this.f9847 = str5;
        this.f9848 = str6;
        this.f9849 = str7;
        this.f9850 = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3066)) {
            return false;
        }
        C3066 c3066 = (C3066) obj;
        return AbstractC1469.m3322(this.f9843, c3066.f9843) && AbstractC1469.m3322(this.f9844, c3066.f9844) && AbstractC1469.m3322(this.f9845, c3066.f9845) && AbstractC1469.m3322(this.f9846, c3066.f9846) && AbstractC1469.m3322(this.f9847, c3066.f9847) && AbstractC1469.m3322(this.f9848, c3066.f9848) && AbstractC1469.m3322(this.f9849, c3066.f9849) && AbstractC1469.m3322(this.f9850, c3066.f9850);
    }

    public final int hashCode() {
        String str = this.f9843;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9844;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9845;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9846;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9847;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9848;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9849;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f9850;
        return iHashCode7 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("a22Proto(latitudeString=");
        sb.append(this.f9843);
        sb.append(", longitudeString=");
        sb.append(this.f9844);
        sb.append(", poiName=");
        sb.append(this.f9845);
        sb.append(", poiScaleString=");
        sb.append(this.f9846);
        sb.append(", address=");
        sb.append(this.f9847);
        sb.append(", infoUrl=");
        sb.append(this.f9848);
        sb.append(", poiClassifyId=");
        sb.append(this.f9849);
        sb.append(", poiCategories=");
        return AbstractC1095.m2801(sb, this.f9850, ')');
    }
}
