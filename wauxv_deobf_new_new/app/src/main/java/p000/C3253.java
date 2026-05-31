package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤞᲇᛸᲈᲀᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3253 {
    public static final C3252 Companion = new C3252();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3015 f10375;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f10376;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10377;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3135 f10378;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C3325 f10379;

    public /* synthetic */ C3253(int i, C3015 c3015, Integer num, String str, C3135 c3135, C3325 c3325) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3251.f10374.mo1509());
            throw null;
        }
        this.f10375 = c3015;
        this.f10376 = num;
        this.f10377 = str;
        this.f10378 = c3135;
        this.f10379 = c3325;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3253)) {
            return false;
        }
        C3253 c3253 = (C3253) obj;
        return AbstractC1469.m3322(this.f10375, c3253.f10375) && AbstractC1469.m3322(this.f10376, c3253.f10376) && AbstractC1469.m3322(this.f10377, c3253.f10377) && AbstractC1469.m3322(this.f10378, c3253.f10378) && AbstractC1469.m3322(this.f10379, c3253.f10379);
    }

    public final int hashCode() {
        C3015 c3015 = this.f10375;
        int iHashCode = (c3015 == null ? 0 : c3015.hashCode()) * 31;
        Integer num = this.f10376;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f10377;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C3135 c3135 = this.f10378;
        int iHashCode4 = (iHashCode3 + (c3135 == null ? 0 : c3135.hashCode())) * 31;
        C3325 c3325 = this.f10379;
        return iHashCode4 + (c3325 != null ? c3325.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("o22Proto(contact=");
        sb.append(this.f10375);
        sb.append(", enable_click_author=");
        sb.append(this.f10376);
        sb.append(", h5_url=");
        sb.append(this.f10377);
        sb.append(", friend_data=");
        sb.append(this.f10378);
        sb.append(", lite_app_param=");
        sb.append(this.f10379);
        sb.append(')');
        return sb.toString();
    }
}
