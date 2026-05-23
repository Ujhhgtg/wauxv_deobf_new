package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᤝᤞᲇᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2931 {
    public static final C2930 Companion = new C2930();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9395;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9396;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9397;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9398;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9399;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9400;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C2946 f9401;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9402;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C2934 f9403;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C2940 f9404;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C2943 f9405;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final C2943 f9406;

    public /* synthetic */ C2931(int i, Integer num, String str, Integer num2, String str2, String str3, String str4, C2946 c2946, String str5, C2934 c2934, C2940 c2940, C2943 c2943, C2943 c2944) {
        if (4095 != (i & 4095)) {
            AbstractC1270.m2997(i, 4095, C2929.f9394.mo1363());
            throw null;
        }
        this.f9395 = num;
        this.f9396 = str;
        this.f9397 = num2;
        this.f9398 = str2;
        this.f9399 = str3;
        this.f9400 = str4;
        this.f9401 = c2946;
        this.f9402 = str5;
        this.f9403 = c2934;
        this.f9404 = c2940;
        this.f9405 = c2943;
        this.f9406 = c2944;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2931)) {
            return false;
        }
        C2931 c2931 = (C2931) obj;
        return AbstractC2207.m4087(this.f9395, c2931.f9395) && AbstractC2207.m4087(this.f9396, c2931.f9396) && AbstractC2207.m4087(this.f9397, c2931.f9397) && AbstractC2207.m4087(this.f9398, c2931.f9398) && AbstractC2207.m4087(this.f9399, c2931.f9399) && AbstractC2207.m4087(this.f9400, c2931.f9400) && AbstractC2207.m4087(this.f9401, c2931.f9401) && AbstractC2207.m4087(this.f9402, c2931.f9402) && AbstractC2207.m4087(this.f9403, c2931.f9403) && AbstractC2207.m4087(this.f9404, c2931.f9404) && AbstractC2207.m4087(this.f9405, c2931.f9405) && AbstractC2207.m4087(this.f9406, c2931.f9406);
    }

    public final int hashCode() {
        Integer num = this.f9395;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9396;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f9397;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str2 = this.f9398;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9399;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9400;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C2946 c2946 = this.f9401;
        int iHashCode7 = (iHashCode6 + (c2946 == null ? 0 : c2946.hashCode())) * 31;
        String str5 = this.f9402;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        C2934 c2934 = this.f9403;
        int iHashCode9 = (iHashCode8 + (c2934 == null ? 0 : c2934.hashCode())) * 31;
        C2940 c2940 = this.f9404;
        int iHashCode10 = (iHashCode9 + (c2940 == null ? 0 : c2940.hashCode())) * 31;
        C2943 c2943 = this.f9405;
        int iHashCode11 = (iHashCode10 + (c2943 == null ? 0 : c2943.hashCode())) * 31;
        C2943 c2944 = this.f9406;
        return iHashCode11 + (c2944 != null ? c2944.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ActionInfoProto(type=");
        sb.append(this.f9395);
        sb.append(", url=");
        sb.append(this.f9396);
        sb.append(", scene=");
        sb.append(this.f9397);
        sb.append(", appid=");
        sb.append(this.f9398);
        sb.append(", mediaTagName=");
        sb.append(this.f9399);
        sb.append(", wordingKey=");
        sb.append(this.f9400);
        sb.append(", appMsg=");
        sb.append(this.f9401);
        sb.append(", newWordingKey=");
        sb.append(this.f9402);
        sb.append(", appActionScene=");
        sb.append(this.f9403);
        sb.append(", appJumpWordingKey=");
        sb.append(this.f9404);
        sb.append(", installedWording=");
        sb.append(this.f9405);
        sb.append(", uninstalledWording=");
        sb.append(this.f9406);
        sb.append(')');
        return sb.toString();
    }
}
