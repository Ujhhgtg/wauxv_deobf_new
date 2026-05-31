package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲀᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3090 {
    public static final C3089 Companion = new C3089();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3166 f9896;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9897;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f9898;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f9899;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Long f9900;

    public /* synthetic */ C3090(int i, C3166 c3166, Integer num, String str, String str2, Long l) {
        if (31 != (i & 31)) {
            AbstractC2234.m4187(i, 31, C3088.f9895.mo1509());
            throw null;
        }
        this.f9896 = c3166;
        this.f9897 = num;
        this.f9898 = str;
        this.f9899 = str2;
        this.f9900 = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3090)) {
            return false;
        }
        C3090 c3090 = (C3090) obj;
        return AbstractC1469.m3322(this.f9896, c3090.f9896) && AbstractC1469.m3322(this.f9897, c3090.f9897) && AbstractC1469.m3322(this.f9898, c3090.f9898) && AbstractC1469.m3322(this.f9899, c3090.f9899) && AbstractC1469.m3322(this.f9900, c3090.f9900);
    }

    public final int hashCode() {
        C3166 c3166 = this.f9896;
        int iHashCode = (c3166 == null ? 0 : c3166.hashCode()) * 31;
        Integer num = this.f9897;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f9898;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9899;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f9900;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("bf1Proto(mic_contact=");
        sb.append(this.f9896);
        sb.append(", mic_type=");
        sb.append(this.f9897);
        sb.append(", mic_sdk_user_id=");
        sb.append(this.f9898);
        sb.append(", live_mic_id=");
        sb.append(this.f9899);
        sb.append(", mic_seq=");
        sb.append(this.f9900);
        sb.append(')');
        return sb.toString();
    }
}
