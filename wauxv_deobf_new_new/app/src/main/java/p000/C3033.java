package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᤝᤞᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3033 {
    public static final C3032 Companion = new C3032();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Float f9671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Float f9672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9675;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9677;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9678;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f9679;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Integer f9680;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f9681;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Float f9682;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Integer f9683;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final String f9684;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final String f9685;

    public /* synthetic */ C3033(int i, Float f, Float f2, String str, String str2, String str3, String str4, Integer num, String str5, Integer num2, Integer num3, Integer num4, Float f3, Integer num5, String str6, String str7) {
        if (32767 != (i & 32767)) {
            AbstractC2234.m4187(i, 32767, C3031.f9670.mo1509());
            throw null;
        }
        this.f9671 = f;
        this.f9672 = f2;
        this.f9673 = str;
        this.f9674 = str2;
        this.f9675 = str3;
        this.f9676 = str4;
        this.f9677 = num;
        this.f9678 = str5;
        this.f9679 = num2;
        this.f9680 = num3;
        this.f9681 = num4;
        this.f9682 = f3;
        this.f9683 = num5;
        this.f9684 = str6;
        this.f9685 = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3033)) {
            return false;
        }
        C3033 c3033 = (C3033) obj;
        return AbstractC1469.m3322(this.f9671, c3033.f9671) && AbstractC1469.m3322(this.f9672, c3033.f9672) && AbstractC1469.m3322(this.f9673, c3033.f9673) && AbstractC1469.m3322(this.f9674, c3033.f9674) && AbstractC1469.m3322(this.f9675, c3033.f9675) && AbstractC1469.m3322(this.f9676, c3033.f9676) && AbstractC1469.m3322(this.f9677, c3033.f9677) && AbstractC1469.m3322(this.f9678, c3033.f9678) && AbstractC1469.m3322(this.f9679, c3033.f9679) && AbstractC1469.m3322(this.f9680, c3033.f9680) && AbstractC1469.m3322(this.f9681, c3033.f9681) && AbstractC1469.m3322(this.f9682, c3033.f9682) && AbstractC1469.m3322(this.f9683, c3033.f9683) && AbstractC1469.m3322(this.f9684, c3033.f9684) && AbstractC1469.m3322(this.f9685, c3033.f9685);
    }

    public final int hashCode() {
        Float f = this.f9671;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f9672;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str = this.f9673;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9674;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9675;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9676;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Integer num = this.f9677;
        int iHashCode7 = (iHashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        String str5 = this.f9678;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num2 = this.f9679;
        int iHashCode9 = (iHashCode8 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9680;
        int iHashCode10 = (iHashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9681;
        int iHashCode11 = (iHashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Float f3 = this.f9682;
        int iHashCode12 = (iHashCode11 + (f3 == null ? 0 : f3.hashCode())) * 31;
        Integer num5 = this.f9683;
        int iHashCode13 = (iHashCode12 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str6 = this.f9684;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f9685;
        return iHashCode14 + (str7 != null ? str7.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("LocationProto(longitude=");
        sb.append(this.f9671);
        sb.append(", latitude=");
        sb.append(this.f9672);
        sb.append(", city=");
        sb.append(this.f9673);
        sb.append(", poiName=");
        sb.append(this.f9674);
        sb.append(", poiAddress=");
        sb.append(this.f9675);
        sb.append(", poiClassifyId=");
        sb.append(this.f9676);
        sb.append(", poiClassifyType=");
        sb.append(this.f9677);
        sb.append(", n=");
        sb.append(this.f9678);
        sb.append(", poiScale=");
        sb.append(this.f9679);
        sb.append(", poiClickableStatus=");
        sb.append(this.f9680);
        sb.append(", type=");
        sb.append(this.f9681);
        sb.append(", accuracy=");
        sb.append(this.f9682);
        sb.append(", t=");
        sb.append(this.f9683);
        sb.append(", poiAddressName=");
        sb.append(this.f9684);
        sb.append(", country=");
        return AbstractC1095.m2801(sb, this.f9685, ')');
    }
}
