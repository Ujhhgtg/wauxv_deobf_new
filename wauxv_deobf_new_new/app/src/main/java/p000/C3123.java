package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᲀᲈᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3123 {
    public static final C3122 Companion = new C3122();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9980;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Integer f9981;

    public /* synthetic */ C3123(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3121.f9979.mo1509());
            throw null;
        }
        this.f9980 = str;
        this.f9981 = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3123)) {
            return false;
        }
        C3123 c3123 = (C3123) obj;
        return AbstractC1469.m3322(this.f9980, c3123.f9980) && AbstractC1469.m3322(this.f9981, c3123.f9981);
    }

    public final int hashCode() {
        String str = this.f9980;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f9981;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("f52Proto(template_id=");
        sb.append(this.f9980);
        sb.append(", template_type=");
        return AbstractC2647.m4623(sb, this.f9981, ')');
    }
}
