package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᛸᲈᲀᤝᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3045 {
    public static final C3044 Companion = new C3044();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Float f9746;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Float f9747;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Float f9748;

    public /* synthetic */ C3045(int i, Float f, Float f2, Float f3) {
        if (7 != (i & 7)) {
            AbstractC2234.m4187(i, 7, C3043.f9745.mo1509());
            throw null;
        }
        this.f9746 = f;
        this.f9747 = f2;
        this.f9748 = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3045)) {
            return false;
        }
        C3045 c3045 = (C3045) obj;
        return AbstractC1469.m3322(this.f9746, c3045.f9746) && AbstractC1469.m3322(this.f9747, c3045.f9747) && AbstractC1469.m3322(this.f9748, c3045.f9748);
    }

    public final int hashCode() {
        Float f = this.f9746;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f9747;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f9748;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC1471.f5234;
        sb.append("SizeProto(width=");
        sb.append(this.f9746);
        sb.append(", height=");
        sb.append(this.f9747);
        sb.append(", totalSize=");
        sb.append(this.f9748);
        sb.append(')');
        return sb.toString();
    }
}
