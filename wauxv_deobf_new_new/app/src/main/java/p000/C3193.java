package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᛸᲇᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3193 {
    public static final C3192 Companion = new C3192();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10151 = {AbstractC2240.m4259(new C3163(4)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10152;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f10153;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10154;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f10155;

    public /* synthetic */ C3193(int i, List list, Long l, Integer num, Long l2) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3191.f10150.mo1509());
            throw null;
        }
        this.f10152 = list;
        this.f10153 = l;
        this.f10154 = num;
        this.f10155 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3193)) {
            return false;
        }
        C3193 c3193 = (C3193) obj;
        return AbstractC1469.m3322(this.f10152, c3193.f10152) && AbstractC1469.m3322(this.f10153, c3193.f10153) && AbstractC1469.m3322(this.f10154, c3193.f10154) && AbstractC1469.m3322(this.f10155, c3193.f10155);
    }

    public final int hashCode() {
        List list = this.f10152;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.f10153;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f10154;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f10155;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("lh1Proto(members=");
        sb.append(this.f10152);
        sb.append(", reward_wecoin=");
        sb.append(this.f10153);
        sb.append(", result=");
        sb.append(this.f10154);
        sb.append(", count=");
        sb.append(this.f10155);
        sb.append(')');
        return sb.toString();
    }
}
