package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᛸᲀᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3081 {
    public static final C3080 Companion = new C3080();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9877;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9878;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9879;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9880;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3385 f9881;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f9882;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3196 f9883;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f9884;

    public /* synthetic */ C3081(int i, String str, Integer num, String str2, String str3, C3385 c3385, String str4, C3196 c3196, String str5) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C3079.f9876.mo1509());
            throw null;
        }
        this.f9877 = str;
        this.f9878 = num;
        this.f9879 = str2;
        this.f9880 = str3;
        this.f9881 = c3385;
        this.f9882 = str4;
        this.f9883 = c3196;
        this.f9884 = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3081)) {
            return false;
        }
        C3081 c3081 = (C3081) obj;
        return AbstractC1469.m3322(this.f9877, c3081.f9877) && AbstractC1469.m3322(this.f9878, c3081.f9878) && AbstractC1469.m3322(this.f9879, c3081.f9879) && AbstractC1469.m3322(this.f9880, c3081.f9880) && AbstractC1469.m3322(this.f9881, c3081.f9881) && AbstractC1469.m3322(this.f9882, c3081.f9882) && AbstractC1469.m3322(this.f9883, c3081.f9883) && AbstractC1469.m3322(this.f9884, c3081.f9884);
    }

    public final int hashCode() {
        String str = this.f9877;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9878;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f9879;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9880;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C3385 c3385 = this.f9881;
        int iHashCode5 = (iHashCode4 + (c3385 == null ? 0 : c3385.hashCode())) * 31;
        String str4 = this.f9882;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C3196 c3196 = this.f9883;
        int iHashCode7 = (iHashCode6 + (c3196 == null ? 0 : c3196.hashCode())) * 31;
        String str5 = this.f9884;
        return iHashCode7 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("b22Proto(topic=");
        sb.append(this.f9877);
        sb.append(", topicType=");
        sb.append(this.f9878);
        sb.append(", iconUrl=");
        sb.append(this.f9879);
        sb.append(", desc=");
        sb.append(this.f9880);
        sb.append(", location=");
        sb.append(this.f9881);
        sb.append(", patMusicId=");
        sb.append(this.f9882);
        sb.append(", event=");
        sb.append(this.f9883);
        sb.append(", feedId=");
        return AbstractC1095.m2801(sb, this.f9884, ')');
    }
}
