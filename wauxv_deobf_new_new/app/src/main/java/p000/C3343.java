package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤝᲈᲇᤞᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3343 {
    public static final C3342 Companion = new C3342();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10580;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3102 f10581;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3102 f10582;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3102 f10583;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3102 f10584;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C3102 f10585;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C3102 f10586;

    public /* synthetic */ C3343(int i, String str, C3102 c3102, C3102 c3103, C3102 c3104, C3102 c3105, C3102 c3106, C3102 c3107) {
        if (127 != (i & 127)) {
            AbstractC2234.m4187(i, 127, C3341.f10579.mo1509());
            throw null;
        }
        this.f10580 = str;
        this.f10581 = c3102;
        this.f10582 = c3103;
        this.f10583 = c3104;
        this.f10584 = c3105;
        this.f10585 = c3106;
        this.f10586 = c3107;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3343)) {
            return false;
        }
        C3343 c3343 = (C3343) obj;
        return AbstractC1469.m3322(this.f10580, c3343.f10580) && AbstractC1469.m3322(this.f10581, c3343.f10581) && AbstractC1469.m3322(this.f10582, c3343.f10582) && AbstractC1469.m3322(this.f10583, c3343.f10583) && AbstractC1469.m3322(this.f10584, c3343.f10584) && AbstractC1469.m3322(this.f10585, c3343.f10585) && AbstractC1469.m3322(this.f10586, c3343.f10586);
    }

    public final int hashCode() {
        String str = this.f10580;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C3102 c3102 = this.f10581;
        int iHashCode2 = (iHashCode + (c3102 == null ? 0 : c3102.hashCode())) * 31;
        C3102 c3103 = this.f10582;
        int iHashCode3 = (iHashCode2 + (c3103 == null ? 0 : c3103.hashCode())) * 31;
        C3102 c3104 = this.f10583;
        int iHashCode4 = (iHashCode3 + (c3104 == null ? 0 : c3104.hashCode())) * 31;
        C3102 c3105 = this.f10584;
        int iHashCode5 = (iHashCode4 + (c3105 == null ? 0 : c3105.hashCode())) * 31;
        C3102 c3106 = this.f10585;
        int iHashCode6 = (iHashCode5 + (c3106 == null ? 0 : c3106.hashCode())) * 31;
        C3102 c3107 = this.f10586;
        return iHashCode6 + (c3107 != null ? c3107.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("u40Proto(key=");
        sb.append(this.f10580);
        sb.append(", thumbnail=");
        sb.append(this.f10581);
        sb.append(", preview=");
        sb.append(this.f10582);
        sb.append(", animation=");
        sb.append(this.f10583);
        sb.append(", landscape_animation=");
        sb.append(this.f10584);
        sb.append(", sign_preview=");
        sb.append(this.f10585);
        sb.append(", sign_thumbnail=");
        sb.append(this.f10586);
        sb.append(')');
        return sb.toString();
    }
}
