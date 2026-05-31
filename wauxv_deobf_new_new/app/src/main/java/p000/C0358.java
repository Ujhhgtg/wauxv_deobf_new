package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᲇᲈᤝᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0358 {
    public static final C0357 Companion = new C0357();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Integer f1755;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final C2676 f1756;

    public /* synthetic */ C0358(int i, Integer num, C2676 c2676) {
        if (3 != (i & 3)) {
            AbstractC2234.m4187(i, 3, C0356.f1754.mo1509());
            throw null;
        }
        this.f1755 = num;
        this.f1756 = c2676;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0358)) {
            return false;
        }
        C0358 c0358 = (C0358) obj;
        return AbstractC1469.m3322(this.f1755, c0358.f1755) && AbstractC1469.m3322(this.f1756, c0358.f1756);
    }

    public final int hashCode() {
        Integer num = this.f1755;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C2676 c2676 = this.f1756;
        return iHashCode + (c2676 != null ? c2676.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("BaseResponse(ret=");
        sb.append(this.f1755);
        sb.append(", errMsg=");
        sb.append(this.f1756);
        sb.append(')');
        return sb.toString();
    }
}
