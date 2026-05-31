package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᲇᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3126 {
    public static final C3125 Companion = new C3125();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9983;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9984;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9986;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f9987;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Float f9988;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9989;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Boolean f9990;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Boolean f9991;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9992;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f9993;

    public /* synthetic */ C3126(int i, String str, String str2, String str3, String str4, Integer num, Float f, Integer num2, Boolean bool, Boolean bool2, String str5, Integer num3) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3124.f9982.mo1509());
            throw null;
        }
        this.f9983 = str;
        this.f9984 = str2;
        this.f9985 = str3;
        this.f9986 = str4;
        this.f9987 = num;
        this.f9988 = f;
        this.f9989 = num2;
        this.f9990 = bool;
        this.f9991 = bool2;
        this.f9992 = str5;
        this.f9993 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3126)) {
            return false;
        }
        C3126 c3126 = (C3126) obj;
        return AbstractC1469.m3322(this.f9983, c3126.f9983) && AbstractC1469.m3322(this.f9984, c3126.f9984) && AbstractC1469.m3322(this.f9985, c3126.f9985) && AbstractC1469.m3322(this.f9986, c3126.f9986) && AbstractC1469.m3322(this.f9987, c3126.f9987) && AbstractC1469.m3322(this.f9988, c3126.f9988) && AbstractC1469.m3322(this.f9989, c3126.f9989) && AbstractC1469.m3322(this.f9990, c3126.f9990) && AbstractC1469.m3322(this.f9991, c3126.f9991) && AbstractC1469.m3322(this.f9992, c3126.f9992) && AbstractC1469.m3322(this.f9993, c3126.f9993);
    }

    public final int hashCode() {
        String str = this.f9983;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9984;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9985;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9986;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f9987;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Float f = this.f9988;
        int iHashCode6 = (iHashCode5 + (f == null ? 0 : f.hashCode())) * 31;
        Integer num2 = this.f9989;
        int iHashCode7 = (iHashCode6 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f9990;
        int iHashCode8 = (iHashCode7 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f9991;
        int iHashCode9 = (iHashCode8 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        String str5 = this.f9992;
        int iHashCode10 = (iHashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num3 = this.f9993;
        return iHashCode10 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("f93Proto(app_id=");
        sb.append(this.f9983);
        sb.append(", path=");
        sb.append(this.f9984);
        sb.append(", query=");
        sb.append(this.f9985);
        sb.append(", default_url=");
        sb.append(this.f9986);
        sb.append(", height_percent=");
        sb.append(this.f9987);
        sb.append(", half_height=");
        sb.append(this.f9988);
        sb.append(", open_type=");
        sb.append(this.f9989);
        sb.append(", is_transparent=");
        sb.append(this.f9990);
        sb.append(", is_forbid_rightgesture=");
        sb.append(this.f9991);
        sb.append(", mini_version=");
        sb.append(this.f9992);
        sb.append(", position=");
        return AbstractC2647.m4623(sb, this.f9993, ')');
    }
}
