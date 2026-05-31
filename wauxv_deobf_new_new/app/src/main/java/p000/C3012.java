package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲇᤝᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3012 {
    public static final C3011 Companion = new C3011();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9621;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9622;

    public /* synthetic */ C3012(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3010.f9620.mo1509());
            throw null;
        }
        this.f9621 = str;
        this.f9622 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3012)) {
            return false;
        }
        C3012 c3012 = (C3012) obj;
        return AbstractC1469.m3322(this.f9621, c3012.f9621) && AbstractC1469.m3322(this.f9622, c3012.f9622);
    }

    public final int hashCode() {
        String str = this.f9621;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9622;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("EmotionProto(md5=");
        sb.append(this.f9621);
        sb.append(", wording=");
        return AbstractC1095.m2801(sb, this.f9622, ')');
    }
}
