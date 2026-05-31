package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲇᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3093 {
    public static final C3092 Companion = new C3092();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9902;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9903;

    public /* synthetic */ C3093(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3091.f9901.mo1509());
            throw null;
        }
        this.f9902 = str;
        this.f9903 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3093)) {
            return false;
        }
        C3093 c3093 = (C3093) obj;
        return AbstractC1469.m3322(this.f9902, c3093.f9902) && AbstractC1469.m3322(this.f9903, c3093.f9903);
    }

    public final int hashCode() {
        String str = this.f9902;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9903;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("ca2Proto(url=");
        sb.append(this.f9902);
        sb.append(", md5=");
        return AbstractC1095.m2801(sb, this.f9903, ')');
    }
}
