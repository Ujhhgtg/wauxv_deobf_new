package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲀᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3169 {
    public static final C3168 Companion = new C3168();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10095;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3250 f10096;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10097;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10098;

    public /* synthetic */ C3169(int i, C3015 c3015, C3250 c3250, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3167.f10094.mo1509());
            throw null;
        }
        this.f10095 = c3015;
        this.f10096 = c3250;
        this.f10097 = str;
        this.f10098 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3169)) {
            return false;
        }
        C3169 c3169 = (C3169) obj;
        return AbstractC1469.m3322(this.f10095, c3169.f10095) && AbstractC1469.m3322(this.f10096, c3169.f10096) && AbstractC1469.m3322(this.f10097, c3169.f10097) && AbstractC1469.m3322(this.f10098, c3169.f10098);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10095;
        int iHashCode = (c3015 == null ? 0 : c3015.hashCode()) * 31;
        C3250 c3250 = this.f10096;
        int iHashCode2 = (iHashCode + (c3250 == null ? 0 : c3250.hashCode())) * 31;
        String str = this.f10097;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10098;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("j72Proto(contact=");
        sb.append(this.f10095);
        sb.append(", video_template=");
        sb.append(this.f10096);
        sb.append(", template_creator_h5_url=");
        sb.append(this.f10097);
        sb.append(", template_music_id=");
        return AbstractC1095.m2801(sb, this.f10098, ')');
    }
}
