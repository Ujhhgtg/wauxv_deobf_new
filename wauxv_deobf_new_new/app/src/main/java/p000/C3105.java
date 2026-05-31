package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᛸᤞᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3105 {
    public static final C3104 Companion = new C3104();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final InterfaceC1780[] f9923 = {AbstractC2240.m4259(new C2096(25)), null, null};

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final List f9924;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9925;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9926;

    public /* synthetic */ C3105(int i, List list, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3103.f9922.mo1509());
            throw null;
        }
        this.f9924 = list;
        this.f9925 = str;
        this.f9926 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3105)) {
            return false;
        }
        C3105 c3105 = (C3105) obj;
        return AbstractC1469.m3322(this.f9924, c3105.f9924) && AbstractC1469.m3322(this.f9925, c3105.f9925) && AbstractC1469.m3322(this.f9926, c3105.f9926);
    }

    public final int hashCode() {
        List list = this.f9924;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f9925;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9926;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("cy1Proto(post_guide_topic_tags=");
        sb.append(this.f9924);
        sb.append(", bg_color_top_hex=");
        sb.append(this.f9925);
        sb.append(", bg_color_bottom_hex=");
        return AbstractC1095.m2801(sb, this.f9926, ')');
    }
}
