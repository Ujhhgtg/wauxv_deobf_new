package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᲈᤝᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3027 {
    public static final C3026 Companion = new C3026();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9661;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9662;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9663;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9664;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9665;

    public /* synthetic */ C3027(int i, Integer num, Integer num2, Integer num3, String str, String str2, String str3) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3025.f9659.mo1509());
            throw null;
        }
        this.f9660 = str;
        this.f9661 = str2;
        this.f9662 = num;
        this.f9663 = num2;
        this.f9664 = str3;
        this.f9665 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3027)) {
            return false;
        }
        C3027 c3027 = (C3027) obj;
        return AbstractC1469.m3322(this.f9660, c3027.f9660) && AbstractC1469.m3322(this.f9661, c3027.f9661) && AbstractC1469.m3322(this.f9662, c3027.f9662) && AbstractC1469.m3322(this.f9663, c3027.f9663) && AbstractC1469.m3322(this.f9664, c3027.f9664) && AbstractC1469.m3322(this.f9665, c3027.f9665);
    }

    public final int hashCode() {
        String str = this.f9660;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9661;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f9662;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9663;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str3 = this.f9664;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num3 = this.f9665;
        return iHashCode5 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("GameShareCardObjectProto(sharedata=");
        sb.append(this.f9660);
        sb.append(", gameshareid=");
        sb.append(this.f9661);
        sb.append(", isvideo=");
        sb.append(this.f9662);
        sb.append(", duration=");
        sb.append(this.f9663);
        sb.append(", liteappbizdata=");
        sb.append(this.f9664);
        sb.append(", liteapppriority=");
        return AbstractC2647.m4623(sb, this.f9665, ')');
    }
}
