package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᤝᲀᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3256 {
    public static final C3255 Companion = new C3255();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10382;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10383;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10384;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10385;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10386;

    public /* synthetic */ C3256(int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3254.f10380.mo1509());
            throw null;
        }
        this.f10381 = num;
        this.f10382 = str;
        this.f10383 = num2;
        this.f10384 = str2;
        this.f10385 = str3;
        this.f10386 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3256)) {
            return false;
        }
        C3256 c3256 = (C3256) obj;
        return AbstractC1469.m3322(this.f10381, c3256.f10381) && AbstractC1469.m3322(this.f10382, c3256.f10382) && AbstractC1469.m3322(this.f10383, c3256.f10383) && AbstractC1469.m3322(this.f10384, c3256.f10384) && AbstractC1469.m3322(this.f10385, c3256.f10385) && AbstractC1469.m3322(this.f10386, c3256.f10386);
    }

    public final int hashCode() {
        Integer num = this.f10381;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10382;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10383;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f10384;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10385;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f10386;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("o51Proto(badge_type=");
        sb.append(this.f10381);
        sb.append(", badge_img_url=");
        sb.append(this.f10382);
        sb.append(", badge_level=");
        sb.append(this.f10383);
        sb.append(", background_color=");
        sb.append(this.f10384);
        sb.append(", badge_name=");
        sb.append(this.f10385);
        sb.append(", transparency=");
        return AbstractC2647.m4623(sb, this.f10386, ')');
    }
}
