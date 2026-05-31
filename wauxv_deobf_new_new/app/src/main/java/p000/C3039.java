package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᤞᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3039 {
    public static final C3038 Companion = new C3038();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9731;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9732;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9733;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9734;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f9735;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9736;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9737;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9738;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f9739;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9740;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f9741;

    public /* synthetic */ C3039(int i, Integer num, Integer num2, String str, Integer num3, Integer num4, Integer num5, Integer num6, String str2, Integer num7, String str3, Integer num8) {
        if (2047 != (i & 2047)) {
            AbstractC2234.m4187(i, 2047, C3037.f9730.mo1509());
            throw null;
        }
        this.f9731 = num;
        this.f9732 = num2;
        this.f9733 = str;
        this.f9734 = num3;
        this.f9735 = num4;
        this.f9736 = num5;
        this.f9737 = num6;
        this.f9738 = str2;
        this.f9739 = num7;
        this.f9740 = str3;
        this.f9741 = num8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3039)) {
            return false;
        }
        C3039 c3039 = (C3039) obj;
        return AbstractC1469.m3322(this.f9731, c3039.f9731) && AbstractC1469.m3322(this.f9732, c3039.f9732) && AbstractC1469.m3322(this.f9733, c3039.f9733) && AbstractC1469.m3322(this.f9734, c3039.f9734) && AbstractC1469.m3322(this.f9735, c3039.f9735) && AbstractC1469.m3322(this.f9736, c3039.f9736) && AbstractC1469.m3322(this.f9737, c3039.f9737) && AbstractC1469.m3322(this.f9738, c3039.f9738) && AbstractC1469.m3322(this.f9739, c3039.f9739) && AbstractC1469.m3322(this.f9740, c3039.f9740) && AbstractC1469.m3322(this.f9741, c3039.f9741);
    }

    public final int hashCode() {
        Integer num = this.f9731;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9732;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f9733;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f9734;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9735;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f9736;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f9737;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.f9738;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.f9739;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.f9740;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.f9741;
        return iHashCode10 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ReadershareProto(itemshowtype=");
        sb.append(this.f9731);
        sb.append(", nativepage=");
        sb.append(this.f9732);
        sb.append(", digest=");
        sb.append(this.f9733);
        sb.append(", width=");
        sb.append(this.f9734);
        sb.append(", height=");
        sb.append(this.f9735);
        sb.append(", pubtime=");
        sb.append(this.f9736);
        sb.append(", duration=");
        sb.append(this.f9737);
        sb.append(", vid=");
        sb.append(this.f9738);
        sb.append(", funcflag=");
        sb.append(this.f9739);
        sb.append(", cover=");
        sb.append(this.f9740);
        sb.append(", ispaysubscribe=");
        return AbstractC2647.m4623(sb, this.f9741, ')');
    }
}
