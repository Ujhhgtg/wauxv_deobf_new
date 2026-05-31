package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲀᤞᛸᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3346 {
    public static final C3345 Companion = new C3345();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10588 = {null, AbstractC2240.m4259(new C3163(21))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10589;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10590;

    public /* synthetic */ C3346(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3344.f10587.mo1509());
            throw null;
        }
        this.f10589 = num;
        this.f10590 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3346)) {
            return false;
        }
        C3346 c3346 = (C3346) obj;
        return AbstractC1469.m3322(this.f10589, c3346.f10589) && AbstractC1469.m3322(this.f10590, c3346.f10590);
    }

    public final int hashCode() {
        Integer num = this.f10589;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f10590;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("u51Proto(current_extra_times_multi_100=");
        sb.append(this.f10589);
        sb.append(", extra_items=");
        sb.append(this.f10590);
        sb.append(')');
        return sb.toString();
    }
}
