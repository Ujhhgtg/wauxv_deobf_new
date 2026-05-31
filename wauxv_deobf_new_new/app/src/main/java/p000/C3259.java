package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᤝᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3259 {
    public static final C3258 Companion = new C3258();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final InterfaceC1780[] f10388 = {null, AbstractC2240.m4259(new C3163(13))};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3093 f10389;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f10390;

    public /* synthetic */ C3259(int i, C3093 c3093, List list) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3257.f10387.mo1509());
            throw null;
        }
        this.f10389 = c3093;
        this.f10390 = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3259)) {
            return false;
        }
        C3259 c3259 = (C3259) obj;
        return AbstractC1469.m3322(this.f10389, c3259.f10389) && AbstractC1469.m3322(this.f10390, c3259.f10390);
    }

    public final int hashCode() {
        C3093 c3093 = this.f10389;
        int iHashCode = (c3093 == null ? 0 : c3093.hashCode()) * 31;
        List list = this.f10390;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("o5Proto(music=");
        sb.append(this.f10389);
        sb.append(", vibratio_meta_info_list=");
        sb.append(this.f10390);
        sb.append(')');
        return sb.toString();
    }
}
