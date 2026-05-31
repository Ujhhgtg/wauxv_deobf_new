package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᤝᲀᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3280 {
    public static final C3279 Companion = new C3279();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10419 = {null, AbstractC2240.m4259(new C3163(14))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10421;

    public /* synthetic */ C3280(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3278.f10418.mo1509());
            throw null;
        }
        this.f10420 = num;
        this.f10421 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3280)) {
            return false;
        }
        C3280 c3280 = (C3280) obj;
        return AbstractC1469.m3322(this.f10420, c3280.f10420) && AbstractC1469.m3322(this.f10421, c3280.f10421);
    }

    public final int hashCode() {
        Integer num = this.f10420;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10421;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("p72Proto(relation_singer_flag=");
        sb.append(this.f10420);
        sb.append(", relation_singers=");
        sb.append(this.f10421);
        sb.append(')');
        return sb.toString();
    }
}
