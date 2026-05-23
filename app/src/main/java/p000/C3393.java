package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᤝᤞᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3393 {
    public static final C3392 Companion = new C3392();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Boolean f10681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Boolean f10682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f10685;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final String f10686;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final String f10687;

    public /* synthetic */ C3393(int i, String str, String str2, String str3, String str4, String str5, Boolean bool, Boolean bool2, String str6, String str7, String str8, String str9, String str10) {
        if (4095 != (i & 4095)) {
            AbstractC1270.m2997(i, 4095, C3391.f10675.mo1363());
            throw null;
        }
        this.f10676 = str;
        this.f10677 = str2;
        this.f10678 = str3;
        this.f10679 = str4;
        this.f10680 = str5;
        this.f10681 = bool;
        this.f10682 = bool2;
        this.f10683 = str6;
        this.f10684 = str7;
        this.f10685 = str8;
        this.f10686 = str9;
        this.f10687 = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3393)) {
            return false;
        }
        C3393 c3393 = (C3393) obj;
        return AbstractC2207.m4087(this.f10676, c3393.f10676) && AbstractC2207.m4087(this.f10677, c3393.f10677) && AbstractC2207.m4087(this.f10678, c3393.f10678) && AbstractC2207.m4087(this.f10679, c3393.f10679) && AbstractC2207.m4087(this.f10680, c3393.f10680) && AbstractC2207.m4087(this.f10681, c3393.f10681) && AbstractC2207.m4087(this.f10682, c3393.f10682) && AbstractC2207.m4087(this.f10683, c3393.f10683) && AbstractC2207.m4087(this.f10684, c3393.f10684) && AbstractC2207.m4087(this.f10685, c3393.f10685) && AbstractC2207.m4087(this.f10686, c3393.f10686) && AbstractC2207.m4087(this.f10687, c3393.f10687);
    }

    public final int hashCode() {
        String str = this.f10676;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10677;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10678;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10679;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10680;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Boolean bool = this.f10681;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f10682;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str6 = this.f10683;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f10684;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f10685;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f10686;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f10687;
        return iHashCode11 + (str10 != null ? str10.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("zq0Proto(feedPrefix=");
        sb.append(this.f10676);
        sb.append(", describePrefix=");
        sb.append(this.f10677);
        sb.append(", joininTimes=");
        sb.append(this.f10678);
        sb.append(", joininButton=");
        sb.append(this.f10679);
        sb.append(", pageDescribe=");
        sb.append(this.f10680);
        sb.append(", showPageDescribe=");
        sb.append(this.f10681);
        sb.append(", showPageNotice=");
        sb.append(this.f10682);
        sb.append(", endButton=");
        sb.append(this.f10683);
        sb.append(", shareFrom=");
        sb.append(this.f10684);
        sb.append(", exitButton=");
        sb.append(this.f10685);
        sb.append(", exitHint=");
        sb.append(this.f10686);
        sb.append(", custom_joinin_times_wording=");
        return AbstractC1194.m2786(sb, this.f10687, ')');
    }
}
