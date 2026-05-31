package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲈᛸᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3147 {
    public static final C3146 Companion = new C3146();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Boolean f10029;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10030;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Long f10031;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10032;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10033;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3072 f10034;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f10035;

    public /* synthetic */ C3147(int i, Boolean bool, Long l, Long l2, String str, String str2, C3072 c3072, String str3) {
        if (127 != (i & 127)) {
            AbstractC2234.m4187(i, 127, C3145.f10028.mo1509());
            throw null;
        }
        this.f10029 = bool;
        this.f10030 = l;
        this.f10031 = l2;
        this.f10032 = str;
        this.f10033 = str2;
        this.f10034 = c3072;
        this.f10035 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3147)) {
            return false;
        }
        C3147 c3147 = (C3147) obj;
        return AbstractC1469.m3322(this.f10029, c3147.f10029) && AbstractC1469.m3322(this.f10030, c3147.f10030) && AbstractC1469.m3322(this.f10031, c3147.f10031) && AbstractC1469.m3322(this.f10032, c3147.f10032) && AbstractC1469.m3322(this.f10033, c3147.f10033) && AbstractC1469.m3322(this.f10034, c3147.f10034) && AbstractC1469.m3322(this.f10035, c3147.f10035);
    }

    public final int hashCode() {
        Boolean bool = this.f10029;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.f10030;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f10031;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f10032;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10033;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C3072 c3072 = this.f10034;
        int iHashCode6 = (iHashCode5 + (c3072 == null ? 0 : c3072.hashCode())) * 31;
        String str3 = this.f10035;
        return iHashCode6 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("gl1Proto(enable_flag=");
        sb.append(this.f10029);
        sb.append(", total_target_count=");
        sb.append(this.f10030);
        sb.append(", total_cur_count=");
        sb.append(this.f10031);
        sb.append(", banner_words=");
        sb.append(this.f10032);
        sb.append(", banner_icon_url=");
        sb.append(this.f10033);
        sb.append(", wish_list=");
        sb.append(this.f10034);
        sb.append(", wish_list_id=");
        return AbstractC1095.m2801(sb, this.f10035, ')');
    }
}
