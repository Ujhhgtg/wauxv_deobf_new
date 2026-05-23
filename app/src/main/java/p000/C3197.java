package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᤝᛸᲈᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3197 {
    public static final C3196 Companion = new C3196();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10214;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10215;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10216;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10217;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10218;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10219;

    public /* synthetic */ C3197(int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        if (63 != (i & 63)) {
            AbstractC1270.m2997(i, 63, C3195.f10213.mo1363());
            throw null;
        }
        this.f10214 = num;
        this.f10215 = str;
        this.f10216 = num2;
        this.f10217 = str2;
        this.f10218 = str3;
        this.f10219 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3197)) {
            return false;
        }
        C3197 c3197 = (C3197) obj;
        return AbstractC2207.m4087(this.f10214, c3197.f10214) && AbstractC2207.m4087(this.f10215, c3197.f10215) && AbstractC2207.m4087(this.f10216, c3197.f10216) && AbstractC2207.m4087(this.f10217, c3197.f10217) && AbstractC2207.m4087(this.f10218, c3197.f10218) && AbstractC2207.m4087(this.f10219, c3197.f10219);
    }

    public final int hashCode() {
        Integer num = this.f10214;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10215;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f10216;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f10217;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10218;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f10219;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("o51Proto(badge_type=");
        sb.append(this.f10214);
        sb.append(", badge_img_url=");
        sb.append(this.f10215);
        sb.append(", badge_level=");
        sb.append(this.f10216);
        sb.append(", background_color=");
        sb.append(this.f10217);
        sb.append(", badge_name=");
        sb.append(this.f10218);
        sb.append(", transparency=");
        return AbstractC2668.m4677(sb, this.f10219, ')');
    }
}
