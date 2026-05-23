package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᤝᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2980 {
    public static final C2979 Companion = new C2979();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9564;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9565;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9566;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9567;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f9568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9569;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9571;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Integer f9572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String f9573;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final Integer f9574;

    public /* synthetic */ C2980(int i, Integer num, Integer num2, String str, Integer num3, Integer num4, Integer num5, Integer num6, String str2, Integer num7, String str3, Integer num8) {
        if (2047 != (i & 2047)) {
            AbstractC1270.m2997(i, 2047, C2978.f9563.mo1363());
            throw null;
        }
        this.f9564 = num;
        this.f9565 = num2;
        this.f9566 = str;
        this.f9567 = num3;
        this.f9568 = num4;
        this.f9569 = num5;
        this.f9570 = num6;
        this.f9571 = str2;
        this.f9572 = num7;
        this.f9573 = str3;
        this.f9574 = num8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2980)) {
            return false;
        }
        C2980 c2980 = (C2980) obj;
        return AbstractC2207.m4087(this.f9564, c2980.f9564) && AbstractC2207.m4087(this.f9565, c2980.f9565) && AbstractC2207.m4087(this.f9566, c2980.f9566) && AbstractC2207.m4087(this.f9567, c2980.f9567) && AbstractC2207.m4087(this.f9568, c2980.f9568) && AbstractC2207.m4087(this.f9569, c2980.f9569) && AbstractC2207.m4087(this.f9570, c2980.f9570) && AbstractC2207.m4087(this.f9571, c2980.f9571) && AbstractC2207.m4087(this.f9572, c2980.f9572) && AbstractC2207.m4087(this.f9573, c2980.f9573) && AbstractC2207.m4087(this.f9574, c2980.f9574);
    }

    public final int hashCode() {
        Integer num = this.f9564;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9565;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f9566;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num3 = this.f9567;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9568;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f9569;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f9570;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        String str2 = this.f9571;
        int iHashCode8 = (iHashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num7 = this.f9572;
        int iHashCode9 = (iHashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        String str3 = this.f9573;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num8 = this.f9574;
        return iHashCode10 + (num8 != null ? num8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("ReadershareProto(itemshowtype=");
        sb.append(this.f9564);
        sb.append(", nativepage=");
        sb.append(this.f9565);
        sb.append(", digest=");
        sb.append(this.f9566);
        sb.append(", width=");
        sb.append(this.f9567);
        sb.append(", height=");
        sb.append(this.f9568);
        sb.append(", pubtime=");
        sb.append(this.f9569);
        sb.append(", duration=");
        sb.append(this.f9570);
        sb.append(", vid=");
        sb.append(this.f9571);
        sb.append(", funcflag=");
        sb.append(this.f9572);
        sb.append(", cover=");
        sb.append(this.f9573);
        sb.append(", ispaysubscribe=");
        return AbstractC2668.m4677(sb, this.f9574, ')');
    }
}
