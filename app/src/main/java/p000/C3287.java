package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲈᲇᲀᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3287 {
    public static final C3286 Companion = new C3286();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1758[] f10421 = {null, AbstractC1458.m3163(new C3125(19))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10422;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10423;

    public /* synthetic */ C3287(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3285.f10420.mo1363());
            throw null;
        }
        this.f10422 = num;
        this.f10423 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3287)) {
            return false;
        }
        C3287 c3287 = (C3287) obj;
        return AbstractC2207.m4087(this.f10422, c3287.f10422) && AbstractC2207.m4087(this.f10423, c3287.f10423);
    }

    public final int hashCode() {
        Integer num = this.f10422;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10423;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("u51Proto(current_extra_times_multi_100=");
        sb.append(this.f10422);
        sb.append(", extra_items=");
        sb.append(this.f10423);
        sb.append(')');
        return sb.toString();
    }
}
