package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1710 {
    public static final C1709 Companion = new C1709();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f5792;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f5793;

    public /* synthetic */ C1710(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C1708.f5791.mo1509());
            throw null;
        }
        this.f5792 = num;
        this.f5793 = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1710)) {
            return false;
        }
        C1710 c1710 = (C1710) obj;
        return AbstractC1469.m3322(this.f5792, c1710.f5792) && AbstractC1469.m3322(this.f5793, c1710.f5793);
    }

    public final int hashCode() {
        Integer num = this.f5792;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5793;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("JSAPIBaseResp(errCode=");
        sb.append(this.f5792);
        sb.append(", errMsg=");
        return AbstractC1095.m2801(sb, this.f5793, ')');
    }
}
