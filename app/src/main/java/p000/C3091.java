package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲈᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3091 {
    public static final C3090 Companion = new C3090();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9870;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9871;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C3067 f9872;

    public /* synthetic */ C3091(int i, Integer num, String str, C3067 c3067) {
        if (7 != (i & 7)) {
            AbstractC1270.m2997(i, 7, C3089.f9869.mo1363());
            throw null;
        }
        this.f9870 = num;
        this.f9871 = str;
        this.f9872 = c3067;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3091)) {
            return false;
        }
        C3091 c3091 = (C3091) obj;
        return AbstractC2207.m4087(this.f9870, c3091.f9870) && AbstractC2207.m4087(this.f9871, c3091.f9871) && AbstractC2207.m4087(this.f9872, c3091.f9872);
    }

    public final int hashCode() {
        Integer num = this.f9870;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f9871;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C3067 c3067 = this.f9872;
        return iHashCode2 + (c3067 != null ? c3067.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1574.f5469;
        sb.append("gm1Proto(anchor_shop_tag=");
        sb.append(this.f9870);
        sb.append(", anchor_shop_tag_url=");
        sb.append(this.f9871);
        sb.append(", lite_app_info=");
        sb.append(this.f9872);
        sb.append(')');
        return sb.toString();
    }
}
