package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᤝᤞᲈᲇᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3102 {
    public static final C3101 Companion = new C3101();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f9920;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f9921;

    public /* synthetic */ C3102(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3100.f9919.mo1509());
            throw null;
        }
        this.f9920 = str;
        this.f9921 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3102)) {
            return false;
        }
        C3102 c3102 = (C3102) obj;
        return AbstractC1469.m3322(this.f9920, c3102.f9920) && AbstractC1469.m3322(this.f9921, c3102.f9921);
    }

    public final int hashCode() {
        String str = this.f9920;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f9921;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("cq4Proto(pag_url=");
        sb.append(this.f9920);
        sb.append(", pag_md5=");
        return AbstractC1095.m2801(sb, this.f9921, ')');
    }
}
