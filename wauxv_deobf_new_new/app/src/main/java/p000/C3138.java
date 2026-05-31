package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᤞᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3138 {
    public static final C3137 Companion = new C3137();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10010;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3078 f10011;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3455 f10012;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3319 f10013;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10014;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f10015;

    public /* synthetic */ C3138(int i, Integer num, C3078 c3078, C3455 c3455, C3319 c3319, Integer num2, Integer num3) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3136.f10009.mo1509());
            throw null;
        }
        this.f10010 = num;
        this.f10011 = c3078;
        this.f10012 = c3455;
        this.f10013 = c3319;
        this.f10014 = num2;
        this.f10015 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3138)) {
            return false;
        }
        C3138 c3138 = (C3138) obj;
        return AbstractC1469.m3322(this.f10010, c3138.f10010) && AbstractC1469.m3322(this.f10011, c3138.f10011) && AbstractC1469.m3322(this.f10012, c3138.f10012) && AbstractC1469.m3322(this.f10013, c3138.f10013) && AbstractC1469.m3322(this.f10014, c3138.f10014) && AbstractC1469.m3322(this.f10015, c3138.f10015);
    }

    public final int hashCode() {
        Integer num = this.f10010;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3078 c3078 = this.f10011;
        int iHashCode2 = (iHashCode + (c3078 == null ? 0 : c3078.hashCode())) * 31;
        C3455 c3455 = this.f10012;
        int iHashCode3 = (iHashCode2 + (c3455 == null ? 0 : c3455.hashCode())) * 31;
        C3319 c3319 = this.f10013;
        int iHashCode4 = (iHashCode3 + (c3319 == null ? 0 : c3319.hashCode())) * 31;
        Integer num2 = this.f10014;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10015;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("fw3Proto(createTime=");
        sb.append(this.f10010);
        sb.append(", newlifeInfo=");
        sb.append(this.f10011);
        sb.append(", desc=");
        sb.append(this.f10012);
        sb.append(", location=");
        sb.append(this.f10013);
        sb.append(", commentEggCount=");
        sb.append(this.f10014);
        sb.append(", activityType=");
        return AbstractC2647.m4623(sb, this.f10015, ')');
    }
}
