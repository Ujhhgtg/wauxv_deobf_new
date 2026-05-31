package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᛸᲀᤞᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3431 {
    public static final C3430 Companion = new C3430();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10793 = {AbstractC2240.m4259(new C3413(2)), null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f10794;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10795;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3452 f10796;

    public /* synthetic */ C3431(int i, List list, Integer num, C3452 c3452) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3429.f10792.mo1509());
            throw null;
        }
        this.f10794 = list;
        this.f10795 = num;
        this.f10796 = c3452;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3431)) {
            return false;
        }
        C3431 c3431 = (C3431) obj;
        return AbstractC1469.m3322(this.f10794, c3431.f10794) && AbstractC1469.m3322(this.f10795, c3431.f10795) && AbstractC1469.m3322(this.f10796, c3431.f10796);
    }

    public final int hashCode() {
        List list = this.f10794;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f10795;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C3452 c3452 = this.f10796;
        return iHashCode2 + (c3452 != null ? c3452.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("y52Proto(list=");
        sb.append(this.f10794);
        sb.append(", first_page_index=");
        sb.append(this.f10795);
        sb.append(", wordingInfo=");
        sb.append(this.f10796);
        sb.append(')');
        return sb.toString();
    }
}
