package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᛸᤞᲁᲈᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2249 {
    public static final C2248 Companion = new C2248();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f7315;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2676 f7316;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f7317;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f7318;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f7319;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Integer f7320;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Integer f7321;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Long f7322;

    public /* synthetic */ C2249(int i, Integer num, C2676 c2676, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Long l) {
        if (255 != (i & 255)) {
            AbstractC2234.m4187(i, 255, C2247.f7314.mo1509());
            throw null;
        }
        this.f7315 = num;
        this.f7316 = c2676;
        this.f7317 = num2;
        this.f7318 = num3;
        this.f7319 = num4;
        this.f7320 = num5;
        this.f7321 = num6;
        this.f7322 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2249)) {
            return false;
        }
        C2249 c2249 = (C2249) obj;
        return AbstractC1469.m3322(this.f7315, c2249.f7315) && AbstractC1469.m3322(this.f7316, c2249.f7316) && AbstractC1469.m3322(this.f7317, c2249.f7317) && AbstractC1469.m3322(this.f7318, c2249.f7318) && AbstractC1469.m3322(this.f7319, c2249.f7319) && AbstractC1469.m3322(this.f7320, c2249.f7320) && AbstractC1469.m3322(this.f7321, c2249.f7321) && AbstractC1469.m3322(this.f7322, c2249.f7322);
    }

    public final int hashCode() {
        Integer num = this.f7315;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2676 c2676 = this.f7316;
        int iHashCode2 = (iHashCode + (c2676 == null ? 0 : c2676.hashCode())) * 31;
        Integer num2 = this.f7317;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f7318;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f7319;
        int iHashCode5 = (iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.f7320;
        int iHashCode6 = (iHashCode5 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f7321;
        int iHashCode7 = (iHashCode6 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Long l = this.f7322;
        return iHashCode7 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("MicroMsgRespNew(ret=");
        sb.append(this.f7315);
        sb.append(", toUserName=");
        sb.append(this.f7316);
        sb.append(", msgId=");
        sb.append(this.f7317);
        sb.append(", clientMsgId=");
        sb.append(this.f7318);
        sb.append(", createTime=");
        sb.append(this.f7319);
        sb.append(", serverTime=");
        sb.append(this.f7320);
        sb.append(", type=");
        sb.append(this.f7321);
        sb.append(", newMsgId=");
        sb.append(this.f7322);
        sb.append(')');
        return sb.toString();
    }
}
