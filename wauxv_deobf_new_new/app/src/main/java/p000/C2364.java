package p000;

import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤝᤞᲁᛸᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2364 implements InterfaceC3466, Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0912 f7600;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C3553 f7601;

    public C2364(C0912 c0912, C0187 c0187, C1026 c1026) {
        this.f7600 = c0912;
        int length = c0187.f4833.length;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            C0182 c0182 = new C0182((C0185) c0187.m3165(i), c1026);
            C0183 c0183 = new C0183(4, 4);
            c0183.f1279 = c0182;
            arrayList.add(c0183);
        }
        this.f7601 = new C3553(EnumC1701.f5767, arrayList);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f7600.compareTo(((C2364) obj).f7600);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2364)) {
            return false;
        }
        return this.f7600.equals(((C2364) obj).f7600);
    }

    public final int hashCode() {
        return this.f7600.hashCode();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f7600.mo1360());
        sb.append(": ");
        boolean z = true;
        for (C0183 c0183 : this.f7601.f11148) {
            if (z) {
                z = false;
            } else {
                sb.append(", ");
            }
            sb.append(c0183.f1279.f1277.toString());
        }
        return sb.toString();
    }
}
