package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3200 {
    public static final C3199 Companion = new C3199();

    public static final InterfaceC1758[] f10221 = {null, AbstractC1458.m3163(new C3125(11))};

    public final C3034 f10222;

    public final List f10223;

    public /* synthetic */ C3200(int i, C3034 c3034, List list) {
        if (3 != (i & 3)) {
            AbstractC1270.m2997(i, 3, C3198.f10220.mo1363());
            throw null;
        }
        this.f10222 = c3034;
        this.f10223 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3200)) {
            return false;
        }
        C3200 c3200 = (C3200) obj;
        return AbstractC2207.m4087(this.f10222, c3200.f10222) && AbstractC2207.m4087(this.f10223, c3200.f10223);
    }

    public final int hashCode() {
        C3034 c3034 = this.f10222;
        int iHashCode = (c3034 == null ? 0 : c3034.hashCode()) * 31;
        List list = this.f10223;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("o5Proto(music=");
        sb.append(this.f10222);
        sb.append(", vibratio_meta_info_list=");
        sb.append(this.f10223);
        sb.append(')');
        return sb.toString();
    }
}
