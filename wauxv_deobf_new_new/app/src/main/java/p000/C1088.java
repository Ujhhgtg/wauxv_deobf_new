package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲇᛸᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1088 {
    public static final C1087 Companion = new C1087();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public Integer f3911;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public C1091 f3912;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public String f3913;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1091 f3914;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1088)) {
            return false;
        }
        C1088 c1088 = (C1088) obj;
        return AbstractC1469.m3322(this.f3911, c1088.f3911) && AbstractC1469.m3322(this.f3912, c1088.f3912) && AbstractC1469.m3322(this.f3913, c1088.f3913) && AbstractC1469.m3322(this.f3914, c1088.f3914);
    }

    public final int hashCode() {
        Integer num = this.f3911;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C1091 c1091 = this.f3912;
        int iHashCode2 = (iHashCode + (c1091 == null ? 0 : c1091.hashCode())) * 31;
        String str = this.f3913;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C1091 c1092 = this.f3914;
        return iHashCode3 + (c1092 != null ? c1092.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("DisturbSetting(nightSetting=");
        sb.append(this.f3911);
        sb.append(", nightTime=");
        sb.append(this.f3912);
        sb.append(", allDaySetting=");
        sb.append(this.f3913);
        sb.append(", allDayTime=");
        sb.append(this.f3914);
        sb.append(')');
        return sb.toString();
    }
}
