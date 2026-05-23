package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲀᛸᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3221 {
    public static final C3220 Companion = new C3220();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10252 = {null, AbstractC1458.m3163(new C3125(12))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10253;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10254;

    public /* synthetic */ C3221(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3219.f10251.mo1363());
            throw null;
        }
        this.f10253 = num;
        this.f10254 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3221)) {
            return false;
        }
        C3221 c3221 = (C3221) obj;
        return AbstractC2207.m4087(this.f10253, c3221.f10253) && AbstractC2207.m4087(this.f10254, c3221.f10254);
    }

    public final int hashCode() {
        Integer num = this.f10253;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10254;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("p72Proto(relation_singer_flag=");
        sb.append(this.f10253);
        sb.append(", relation_singers=");
        sb.append(this.f10254);
        sb.append(')');
        return sb.toString();
    }
}
