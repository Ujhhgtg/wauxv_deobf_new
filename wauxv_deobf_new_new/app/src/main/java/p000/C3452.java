package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᲀᛸᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3452 {
    public static final C3451 Companion = new C3451();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10843;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10844;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10845;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10846;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10847;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Boolean f10848;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f10849;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10850;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10851;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10852;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10853;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10854;

    public /* synthetic */ C3452(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, String str10) {
        if (4095 != (i & 4095)) {
            AbstractC2234.m4187(i, 4095, C3450.f10842.mo1509());
            throw null;
        }
        this.f10843 = str;
        this.f10844 = str2;
        this.f10845 = str3;
        this.f10846 = str4;
        this.f10847 = str5;
        this.f10848 = bool;
        this.f10849 = bool2;
        this.f10850 = str6;
        this.f10851 = str7;
        this.f10852 = str8;
        this.f10853 = str9;
        this.f10854 = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3452)) {
            return false;
        }
        C3452 c3452 = (C3452) obj;
        return AbstractC1469.m3322(this.f10843, c3452.f10843) && AbstractC1469.m3322(this.f10844, c3452.f10844) && AbstractC1469.m3322(this.f10845, c3452.f10845) && AbstractC1469.m3322(this.f10846, c3452.f10846) && AbstractC1469.m3322(this.f10847, c3452.f10847) && AbstractC1469.m3322(this.f10848, c3452.f10848) && AbstractC1469.m3322(this.f10849, c3452.f10849) && AbstractC1469.m3322(this.f10850, c3452.f10850) && AbstractC1469.m3322(this.f10851, c3452.f10851) && AbstractC1469.m3322(this.f10852, c3452.f10852) && AbstractC1469.m3322(this.f10853, c3452.f10853) && AbstractC1469.m3322(this.f10854, c3452.f10854);
    }

    public final int hashCode() {
        String str = this.f10843;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10844;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10845;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10846;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10847;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f10848;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10849;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f10850;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10851;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10852;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10853;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10854;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("zq0Proto(feedPrefix=");
        sb.append(this.f10843);
        sb.append(", describePrefix=");
        sb.append(this.f10844);
        sb.append(", joininTimes=");
        sb.append(this.f10845);
        sb.append(", joininButton=");
        sb.append(this.f10846);
        sb.append(", pageDescribe=");
        sb.append(this.f10847);
        sb.append(", showPageDescribe=");
        sb.append(this.f10848);
        sb.append(", showPageNotice=");
        sb.append(this.f10849);
        sb.append(", endButton=");
        sb.append(this.f10850);
        sb.append(", shareFrom=");
        sb.append(this.f10851);
        sb.append(", exitButton=");
        sb.append(this.f10852);
        sb.append(", exitHint=");
        sb.append(this.f10853);
        sb.append(", custom_joinin_times_wording=");
        return AbstractC1095.m2801(sb, this.f10854, ')');
    }
}
