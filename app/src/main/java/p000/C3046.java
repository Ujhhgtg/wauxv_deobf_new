package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3046 {
    public static final C3045 Companion = new C3045();

    public static final InterfaceC1758[] f9756 = {AbstractC1458.m3163(new C2083(23)), null, null};

    public final List f9757;

    public final String f9758;

    public final String f9759;

    public /* synthetic */ C3046(int i, List list, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3044.f9755.mo1363());
            throw null;
        }
        this.f9757 = list;
        this.f9758 = str;
        this.f9759 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3046)) {
            return false;
        }
        C3046 c3046 = (C3046) obj;
        return AbstractC2207.m4087(this.f9757, c3046.f9757) && AbstractC2207.m4087(this.f9758, c3046.f9758) && AbstractC2207.m4087(this.f9759, c3046.f9759);
    }

    public final int hashCode() {
        List list = this.f9757;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f9758;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9759;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("cy1Proto(post_guide_topic_tags=");
        sb.append(this.f9757);
        sb.append(", bg_color_top_hex=");
        sb.append(this.f9758);
        sb.append(", bg_color_bottom_hex=");
        return AbstractC1194.m2786(sb, this.f9759, ')');
    }
}
