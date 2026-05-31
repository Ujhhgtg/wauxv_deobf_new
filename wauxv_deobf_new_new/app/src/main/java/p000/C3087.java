package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲀᛸᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3087 {
    public static final C3086 Companion = new C3086();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f9891;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9892;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Integer f9893;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Integer f9894;

    public /* synthetic */ C3087(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC2234.m4187(i, 15, C3085.f9890.mo1509());
            throw null;
        }
        this.f9891 = num;
        this.f9892 = num2;
        this.f9893 = num3;
        this.f9894 = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3087)) {
            return false;
        }
        C3087 c3087 = (C3087) obj;
        return AbstractC1469.m3322(this.f9891, c3087.f9891) && AbstractC1469.m3322(this.f9892, c3087.f9892) && AbstractC1469.m3322(this.f9893, c3087.f9893) && AbstractC1469.m3322(this.f9894, c3087.f9894);
    }

    public final int hashCode() {
        Integer num = this.f9891;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9892;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f9893;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f9894;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("be5Proto(ios_sdk_version_min=");
        sb.append(this.f9891);
        sb.append(", ios_sdk_version_max=");
        sb.append(this.f9892);
        sb.append(", android_sdk_version_min=");
        sb.append(this.f9893);
        sb.append(", android_sdk_version_max=");
        return AbstractC2647.m4623(sb, this.f9894, ')');
    }
}
