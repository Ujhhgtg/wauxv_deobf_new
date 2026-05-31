package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᛸᲇᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3156 {
    public static final C3155 Companion = new C3155();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10060;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10061;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10062;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f10063;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Integer f10064;

    public /* synthetic */ C3156(int i, String str, Integer num, Integer num2, Integer num3, Integer num4) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3154.f10059.mo1509());
            throw null;
        }
        this.f10060 = str;
        this.f10061 = num;
        this.f10062 = num2;
        this.f10063 = num3;
        this.f10064 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3156)) {
            return false;
        }
        C3156 c3156 = (C3156) obj;
        return AbstractC1469.m3322(this.f10060, c3156.f10060) && AbstractC1469.m3322(this.f10061, c3156.f10061) && AbstractC1469.m3322(this.f10062, c3156.f10062) && AbstractC1469.m3322(this.f10063, c3156.f10063) && AbstractC1469.m3322(this.f10064, c3156.f10064);
    }

    public final int hashCode() {
        String str = this.f10060;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f10061;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f10062;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f10063;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f10064;
        return iHashCode4 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("hs3Proto(feed_detail_url=");
        sb.append(this.f10060);
        sb.append(", biz_uin=");
        sb.append(this.f10061);
        sb.append(", appmsg_id=");
        sb.append(this.f10062);
        sb.append(", appmsg_index=");
        sb.append(this.f10063);
        sb.append(", item_show_type=");
        return AbstractC2647.m4623(sb, this.f10064, ')');
    }
}
