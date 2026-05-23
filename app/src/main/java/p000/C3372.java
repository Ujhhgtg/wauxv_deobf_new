package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3372 {
    public static final C3371 Companion = new C3371();

    public static final InterfaceC1758[] f10626 = {AbstractC1458.m3163(new C3369(0)), null, null};

    public final List f10627;

    public final Integer f10628;

    public final C3393 f10629;

    public /* synthetic */ C3372(int i, List list, Integer num, C3393 c3393) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3370.f10625.mo1363());
            throw null;
        }
        this.f10627 = list;
        this.f10628 = num;
        this.f10629 = c3393;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3372)) {
            return false;
        }
        C3372 c3372 = (C3372) obj;
        return AbstractC2207.m4087(this.f10627, c3372.f10627) && AbstractC2207.m4087(this.f10628, c3372.f10628) && AbstractC2207.m4087(this.f10629, c3372.f10629);
    }

    public final int hashCode() {
        List list = this.f10627;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f10628;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C3393 c3393 = this.f10629;
        return iHashCode2 + (c3393 != null ? c3393.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("y52Proto(list=");
        sb.append(this.f10627);
        sb.append(", first_page_index=");
        sb.append(this.f10628);
        sb.append(", wordingInfo=");
        sb.append(this.f10629);
        sb.append(')');
        return sb.toString();
    }
}
