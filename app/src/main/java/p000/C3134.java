package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲀᛸᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3134 {
    public static final C3133 Companion = new C3133();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final InterfaceC1758[] f9984 = {AbstractC1458.m3163(new C3125(2)), null, null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9985;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Long f9986;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9987;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Long f9988;

    public /* synthetic */ C3134(int i, List list, Long l, Integer num, Long l2) {
        if (15 != (i & 15)) {
            AbstractC1270.m2997(i, 15, C3132.f9983.mo1363());
            throw null;
        }
        this.f9985 = list;
        this.f9986 = l;
        this.f9987 = num;
        this.f9988 = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3134)) {
            return false;
        }
        C3134 c3134 = (C3134) obj;
        return AbstractC2207.m4087(this.f9985, c3134.f9985) && AbstractC2207.m4087(this.f9986, c3134.f9986) && AbstractC2207.m4087(this.f9987, c3134.f9987) && AbstractC2207.m4087(this.f9988, c3134.f9988);
    }

    public final int hashCode() {
        List list = this.f9985;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.f9986;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f9987;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f9988;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("lh1Proto(members=");
        sb.append(this.f9985);
        sb.append(", reward_wecoin=");
        sb.append(this.f9986);
        sb.append(", result=");
        sb.append(this.f9987);
        sb.append(", count=");
        sb.append(this.f9988);
        sb.append(')');
        return sb.toString();
    }
}
