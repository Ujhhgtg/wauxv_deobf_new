package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3245 {
    public static final C3244 Companion = new C3244();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10298 = {null, AbstractC1458.m3163(new C3125(14))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10299;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10300;

    public /* synthetic */ C3245(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3243.f10297.mo1363());
            throw null;
        }
        this.f10299 = num;
        this.f10300 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3245)) {
            return false;
        }
        C3245 c3245 = (C3245) obj;
        return AbstractC2207.m4087(this.f10299, c3245.f10299) && AbstractC2207.m4087(this.f10300, c3245.f10300);
    }

    public final int hashCode() {
        Integer num = this.f10299;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10300;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("rn3Proto(live_mode=");
        sb.append(this.f10299);
        sb.append(", seat_info_list=");
        sb.append(this.f10300);
        sb.append(')');
        return sb.toString();
    }
}
