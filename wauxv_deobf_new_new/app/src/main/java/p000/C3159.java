package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᤞᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3159 {
    public static final C3158 Companion = new C3158();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f10066;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C3015 f10067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f10068;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f10069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final String f10070;

    public /* synthetic */ C3159(int i, Integer num, C3015 c3015, Integer num2, String str, String str2) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3157.f10065.mo1509());
            throw null;
        }
        this.f10066 = num;
        this.f10067 = c3015;
        this.f10068 = num2;
        this.f10069 = str;
        this.f10070 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3159)) {
            return false;
        }
        C3159 c3159 = (C3159) obj;
        return AbstractC1469.m3322(this.f10066, c3159.f10066) && AbstractC1469.m3322(this.f10067, c3159.f10067) && AbstractC1469.m3322(this.f10068, c3159.f10068) && AbstractC1469.m3322(this.f10069, c3159.f10069) && AbstractC1469.m3322(this.f10070, c3159.f10070);
    }

    public final int hashCode() {
        Integer num = this.f10066;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3015 c3015 = this.f10067;
        int iHashCode2 = (iHashCode + (c3015 == null ? 0 : c3015.hashCode())) * 31;
        Integer num2 = this.f10068;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f10069;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10070;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ht1Proto(music_mv_topic_id=");
        sb.append(this.f10066);
        sb.append(", contact=");
        sb.append(this.f10067);
        sb.append(", object_id=");
        sb.append(this.f10068);
        sb.append(", object_nonce_id=");
        sb.append(this.f10069);
        sb.append(", recommend_reason=");
        return AbstractC1095.m2801(sb, this.f10070, ')');
    }
}
