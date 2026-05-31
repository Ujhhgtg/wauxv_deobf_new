package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲀᲇᤝᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2996 {
    public static final C2995 Companion = new C2995();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9578;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9579;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f9582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f9583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f9584;

    public /* synthetic */ C2996(int i, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        if (127 != (i & 127)) {
            AbstractC2234.m4187(i, 127, C2994.f9577.mo1509());
            throw null;
        }
        this.f9578 = str;
        this.f9579 = str2;
        this.f9580 = str3;
        this.f9581 = str4;
        this.f9582 = str5;
        this.f9583 = num;
        this.f9584 = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2996)) {
            return false;
        }
        C2996 c2996 = (C2996) obj;
        return AbstractC1469.m3322(this.f9578, c2996.f9578) && AbstractC1469.m3322(this.f9579, c2996.f9579) && AbstractC1469.m3322(this.f9580, c2996.f9580) && AbstractC1469.m3322(this.f9581, c2996.f9581) && AbstractC1469.m3322(this.f9582, c2996.f9582) && AbstractC1469.m3322(this.f9583, c2996.f9583) && AbstractC1469.m3322(this.f9584, c2996.f9584);
    }

    public final int hashCode() {
        String str = this.f9578;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9579;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f9580;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9581;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f9582;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f9583;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f9584;
        return iHashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("AppInfoProto(id=");
        sb.append(this.f9578);
        sb.append(", version=");
        sb.append(this.f9579);
        sb.append(", appName=");
        sb.append(this.f9580);
        sb.append(", installUrl=");
        sb.append(this.f9581);
        sb.append(", fromUrl=");
        sb.append(this.f9582);
        sb.append(", clickable=");
        sb.append(this.f9583);
        sb.append(", isHidden=");
        return AbstractC2647.m4623(sb, this.f9584, ')');
    }
}
