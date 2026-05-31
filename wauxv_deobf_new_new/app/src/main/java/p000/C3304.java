package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᛸᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3304 {
    public static final C3303 Companion = new C3303();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10465 = {null, AbstractC2240.m4259(new C3163(16))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10466;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10467;

    public /* synthetic */ C3304(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3302.f10464.mo1509());
            throw null;
        }
        this.f10466 = num;
        this.f10467 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3304)) {
            return false;
        }
        C3304 c3304 = (C3304) obj;
        return AbstractC1469.m3322(this.f10466, c3304.f10466) && AbstractC1469.m3322(this.f10467, c3304.f10467);
    }

    public final int hashCode() {
        Integer num = this.f10466;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10467;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("rn3Proto(live_mode=");
        sb.append(this.f10466);
        sb.append(", seat_info_list=");
        sb.append(this.f10467);
        sb.append(')');
        return sb.toString();
    }
}
