package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᛸᲈᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2003 implements InterfaceC3466, Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0912 f6646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0182 f6647;

    public C2003(C0912 c0912, C0182 c0182) {
        this.f6646 = c0912;
        this.f6647 = c0182;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f6646.compareTo(((C2003) obj).f6646);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2003)) {
            return false;
        }
        return this.f6646.equals(((C2003) obj).f6646);
    }

    public final int hashCode() {
        return this.f6646.hashCode();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f6646.mo1360() + ": " + this.f6647;
    }
}
