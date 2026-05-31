package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᲇᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3051 {
    public static final C3050 Companion = new C3050();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9796;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9797;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9798;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9799;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9800;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9801;

    public /* synthetic */ C3051(int i, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C3049.f9793.mo1509());
            throw null;
        }
        this.f9794 = str;
        this.f9795 = num;
        this.f9796 = str2;
        this.f9797 = str3;
        this.f9798 = str4;
        this.f9799 = str5;
        this.f9800 = str6;
        this.f9801 = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3051)) {
            return false;
        }
        C3051 c3051 = (C3051) obj;
        return AbstractC1469.m3322(this.f9794, c3051.f9794) && AbstractC1469.m3322(this.f9795, c3051.f9795) && AbstractC1469.m3322(this.f9796, c3051.f9796) && AbstractC1469.m3322(this.f9797, c3051.f9797) && AbstractC1469.m3322(this.f9798, c3051.f9798) && AbstractC1469.m3322(this.f9799, c3051.f9799) && AbstractC1469.m3322(this.f9800, c3051.f9800) && AbstractC1469.m3322(this.f9801, c3051.f9801);
    }

    public final int hashCode() {
        String str = this.f9794;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9795;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9796;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9797;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9798;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9799;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f9800;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9801;
        return iHashCode7 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("StreamvideoProto(streamvideourl=");
        sb.append(this.f9794);
        sb.append(", streamvideototaltime=");
        sb.append(this.f9795);
        sb.append(", streamvideowording=");
        sb.append(this.f9796);
        sb.append(", streamvideoweburl=");
        sb.append(this.f9797);
        sb.append(", streamvideotitle=");
        sb.append(this.f9798);
        sb.append(", streamvideothumburl=");
        sb.append(this.f9799);
        sb.append(", streamvideoaduxinfo=");
        sb.append(this.f9800);
        sb.append(", streamvideopublishid=");
        return AbstractC1095.m2801(sb, this.f9801, ')');
    }
}
