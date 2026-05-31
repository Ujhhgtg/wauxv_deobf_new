package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲈᲇᤞᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3172 {
    public static final C3171 Companion = new C3171();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C3166 f10100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f10102;

    public /* synthetic */ C3172(int i, C3166 c3166, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3170.f10099.mo1509());
            throw null;
        }
        this.f10100 = c3166;
        this.f10101 = str;
        this.f10102 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3172)) {
            return false;
        }
        C3172 c3172 = (C3172) obj;
        return AbstractC1469.m3322(this.f10100, c3172.f10100) && AbstractC1469.m3322(this.f10101, c3172.f10101) && AbstractC1469.m3322(this.f10102, c3172.f10102);
    }

    public final int hashCode() {
        C3166 c3166 = this.f10100;
        int iHashCode = (c3166 == null ? 0 : c3166.hashCode()) * 31;
        String str = this.f10101;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f10102;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("k23Proto(mic_contact=");
        sb.append(this.f10100);
        sb.append(", sdk_user_id=");
        sb.append(this.f10101);
        sb.append(", session_id=");
        return AbstractC1095.m2801(sb, this.f10102, ')');
    }
}
