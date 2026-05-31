package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᤝᛸᲀᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3443 {
    public static final C3442 Companion = new C3442();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f10829;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f10830;

    public /* synthetic */ C3443(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C3441.f10828.mo1509());
            throw null;
        }
        this.f10829 = str;
        this.f10830 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3443)) {
            return false;
        }
        C3443 c3443 = (C3443) obj;
        return AbstractC1469.m3322(this.f10829, c3443.f10829) && AbstractC1469.m3322(this.f10830, c3443.f10830);
    }

    public final int hashCode() {
        String str = this.f10829;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f10830;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("zd0Proto(d=");
        sb.append(this.f10829);
        sb.append(", e=");
        return AbstractC1095.m2801(sb, this.f10830, ')');
    }
}
