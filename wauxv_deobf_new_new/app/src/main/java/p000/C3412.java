package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲈᲇᤝᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3412 {
    public static final C3411 Companion = new C3411();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Float f10737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Float f10738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f10741;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final String f10742;

    public /* synthetic */ C3412(int i, Integer num, String str, String str2, Float f, Float f2, Integer num2, String str3, String str4, String str5) {
        if (511 != (i & 511)) {
            AbstractC2234.m4187(i, 511, C3410.f10733.mo1509());
            throw null;
        }
        this.f10734 = num;
        this.f10735 = str;
        this.f10736 = str2;
        this.f10737 = f;
        this.f10738 = f2;
        this.f10739 = num2;
        this.f10740 = str3;
        this.f10741 = str4;
        this.f10742 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3412)) {
            return false;
        }
        C3412 c3412 = (C3412) obj;
        return AbstractC1469.m3322(this.f10734, c3412.f10734) && AbstractC1469.m3322(this.f10735, c3412.f10735) && AbstractC1469.m3322(this.f10736, c3412.f10736) && AbstractC1469.m3322(this.f10737, c3412.f10737) && AbstractC1469.m3322(this.f10738, c3412.f10738) && AbstractC1469.m3322(this.f10739, c3412.f10739) && AbstractC1469.m3322(this.f10740, c3412.f10740) && AbstractC1469.m3322(this.f10741, c3412.f10741) && AbstractC1469.m3322(this.f10742, c3412.f10742);
    }

    public final int hashCode() {
        Integer num = this.f10734;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10735;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10736;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Float f = this.f10737;
        int iHashCode4 = (iHashCode3 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f10738;
        int iHashCode5 = (iHashCode4 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num2 = this.f10739;
        int iHashCode6 = (iHashCode5 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f10740;
        int iHashCode7 = (iHashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f10741;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f10742;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("x12Proto(mediaType=");
        sb.append(this.f10734);
        sb.append(", url=");
        sb.append(this.f10735);
        sb.append(", thumbUrl=");
        sb.append(this.f10736);
        sb.append(", width=");
        sb.append(this.f10737);
        sb.append(", height=");
        sb.append(this.f10738);
        sb.append(", videoPlayDuration=");
        sb.append(this.f10739);
        sb.append(", fullCoverUrl=");
        sb.append(this.f10740);
        sb.append(", fullClipInset=");
        sb.append(this.f10741);
        sb.append(", coverUrl=");
        return AbstractC1095.m2801(sb, this.f10742, ')');
    }
}
