package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᲇᲈᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3353 {
    public static final C3352 Companion = new C3352();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Float f10570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Float f10571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10575;

    public /* synthetic */ C3353(int i, Integer num, String str, String str2, Float f, Float f2, Integer num2, String str3, String str4, String str5) {
        if (511 != (i & 511)) {
            AbstractC1270.m2997(i, 511, C3351.f10566.mo1363());
            throw null;
        }
        this.f10567 = num;
        this.f10568 = str;
        this.f10569 = str2;
        this.f10570 = f;
        this.f10571 = f2;
        this.f10572 = num2;
        this.f10573 = str3;
        this.f10574 = str4;
        this.f10575 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3353)) {
            return false;
        }
        C3353 c3353 = (C3353) obj;
        return AbstractC2207.m4087(this.f10567, c3353.f10567) && AbstractC2207.m4087(this.f10568, c3353.f10568) && AbstractC2207.m4087(this.f10569, c3353.f10569) && AbstractC2207.m4087(this.f10570, c3353.f10570) && AbstractC2207.m4087(this.f10571, c3353.f10571) && AbstractC2207.m4087(this.f10572, c3353.f10572) && AbstractC2207.m4087(this.f10573, c3353.f10573) && AbstractC2207.m4087(this.f10574, c3353.f10574) && AbstractC2207.m4087(this.f10575, c3353.f10575);
    }

    public final int hashCode() {
        Integer num = this.f10567;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10568;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10569;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10570;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10571;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num2 = this.f10572;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f10573;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10574;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10575;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("x12Proto(mediaType=");
        sb.append(this.f10567);
        sb.append(", url=");
        sb.append(this.f10568);
        sb.append(", thumbUrl=");
        sb.append(this.f10569);
        sb.append(", width=");
        sb.append(this.f10570);
        sb.append(", height=");
        sb.append(this.f10571);
        sb.append(", videoPlayDuration=");
        sb.append(this.f10572);
        sb.append(", fullCoverUrl=");
        sb.append(this.f10573);
        sb.append(", fullClipInset=");
        sb.append(this.f10574);
        sb.append(", coverUrl=");
        return AbstractC1194.m2786(sb, this.f10575, ')');
    }
}
