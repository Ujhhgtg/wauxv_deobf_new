package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲇᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3088 {
    public static final C3087 Companion = new C3087();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f9862;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9863;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f9864;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9865;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9866;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3013 f9867;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f9868;

    public /* synthetic */ C3088(int i, Boolean bool, Long l, Long l2, String str, String str2, C3013 c3013, String str3) {
        if (127 != (i & 127)) {
            AbstractC1270.m2997(i, 127, C3086.f9861.mo1363());
            throw null;
        }
        this.f9862 = bool;
        this.f9863 = l;
        this.f9864 = l2;
        this.f9865 = str;
        this.f9866 = str2;
        this.f9867 = c3013;
        this.f9868 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3088)) {
            return false;
        }
        C3088 c3088 = (C3088) obj;
        return AbstractC2207.m4087(this.f9862, c3088.f9862) && AbstractC2207.m4087(this.f9863, c3088.f9863) && AbstractC2207.m4087(this.f9864, c3088.f9864) && AbstractC2207.m4087(this.f9865, c3088.f9865) && AbstractC2207.m4087(this.f9866, c3088.f9866) && AbstractC2207.m4087(this.f9867, c3088.f9867) && AbstractC2207.m4087(this.f9868, c3088.f9868);
    }

    public final int hashCode() {
        Boolean bool = this.f9862;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.f9863;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f9864;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f9865;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9866;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3013 c3013 = this.f9867;
        int iHashCode6 = (iHashCode5 + (c3013 == null ? 0 : c3013.hashCode())) * 31;
        String str3 = this.f9868;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("gl1Proto(enable_flag=");
        sb.append(this.f9862);
        sb.append(", total_target_count=");
        sb.append(this.f9863);
        sb.append(", total_cur_count=");
        sb.append(this.f9864);
        sb.append(", banner_words=");
        sb.append(this.f9865);
        sb.append(", banner_icon_url=");
        sb.append(this.f9866);
        sb.append(", wish_list=");
        sb.append(this.f9867);
        sb.append(", wish_list_id=");
        return AbstractC1194.m2786(sb, this.f9868, ')');
    }
}
