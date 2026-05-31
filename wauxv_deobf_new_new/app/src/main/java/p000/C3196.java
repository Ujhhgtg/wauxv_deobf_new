package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3196 {
    public static final C3195 Companion = new C3195();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10157;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10159;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10160;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Long f10161;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f10162;

    public /* synthetic */ C3196(int i, String str, String str2, String str3, Integer num, Long l, String str4) {
        if (63 != (i & 63)) {
            AbstractC2234.m4187(i, 63, C3194.f10156.mo1509());
            throw null;
        }
        this.f10157 = str;
        this.f10158 = str2;
        this.f10159 = str3;
        this.f10160 = num;
        this.f10161 = l;
        this.f10162 = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3196)) {
            return false;
        }
        C3196 c3196 = (C3196) obj;
        return AbstractC1469.m3322(this.f10157, c3196.f10157) && AbstractC1469.m3322(this.f10158, c3196.f10158) && AbstractC1469.m3322(this.f10159, c3196.f10159) && AbstractC1469.m3322(this.f10160, c3196.f10160) && AbstractC1469.m3322(this.f10161, c3196.f10161) && AbstractC1469.m3322(this.f10162, c3196.f10162);
    }

    public final int hashCode() {
        String str = this.f10157;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10158;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f10159;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f10160;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f10161;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f10162;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("lk0Proto(topicEventId=");
        sb.append(this.f10157);
        sb.append(", topicEventName=");
        sb.append(this.f10158);
        sb.append(", topicEventCreator=");
        sb.append(this.f10159);
        sb.append(", participateCount=");
        sb.append(this.f10160);
        sb.append(", displayMask=");
        sb.append(this.f10161);
        sb.append(", shareTitle=");
        return AbstractC1095.m2801(sb, this.f10162, ')');
    }
}
