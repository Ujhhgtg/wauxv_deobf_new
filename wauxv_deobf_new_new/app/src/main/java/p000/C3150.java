package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲇᲈᲀᛸᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3150 {
    public static final C3149 Companion = new C3149();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10037;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10038;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3126 f10039;

    public /* synthetic */ C3150(int i, Integer num, String str, C3126 c3126) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3148.f10036.mo1509());
            throw null;
        }
        this.f10037 = num;
        this.f10038 = str;
        this.f10039 = c3126;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3150)) {
            return false;
        }
        C3150 c3150 = (C3150) obj;
        return AbstractC1469.m3322(this.f10037, c3150.f10037) && AbstractC1469.m3322(this.f10038, c3150.f10038) && AbstractC1469.m3322(this.f10039, c3150.f10039);
    }

    public final int hashCode() {
        Integer num = this.f10037;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f10038;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C3126 c3126 = this.f10039;
        return iHashCode2 + (c3126 != null ? c3126.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("gm1Proto(anchor_shop_tag=");
        sb.append(this.f10037);
        sb.append(", anchor_shop_tag_url=");
        sb.append(this.f10038);
        sb.append(", lite_app_info=");
        sb.append(this.f10039);
        sb.append(')');
        return sb.toString();
    }
}
