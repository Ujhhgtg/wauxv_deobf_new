package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᲇᛸᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3373 {
    public static final C3372 Companion = new C3372();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10674;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10675;

    public /* synthetic */ C3373(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3371.f10671.mo1509());
            throw null;
        }
        this.f10672 = str;
        this.f10673 = num;
        this.f10674 = num2;
        this.f10675 = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3373)) {
            return false;
        }
        C3373 c3373 = (C3373) obj;
        return AbstractC1469.m3322(this.f10672, c3373.f10672) && AbstractC1469.m3322(this.f10673, c3373.f10673) && AbstractC1469.m3322(this.f10674, c3373.f10674) && AbstractC1469.m3322(this.f10675, c3373.f10675);
    }

    public final int hashCode() {
        String str = this.f10672;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10673;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10674;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10675;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("vo1Proto(stream_url=");
        sb.append(this.f10672);
        sb.append(", time_limit=");
        sb.append(this.f10673);
        sb.append(", remain_time=");
        sb.append(this.f10674);
        sb.append(", end_time=");
        return AbstractC2647.m4623(sb, this.f10675, ')');
    }
}
