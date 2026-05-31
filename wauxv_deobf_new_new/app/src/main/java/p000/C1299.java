package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲇᤞᲈᲀᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1299 implements InterfaceC3466, Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0898 f4722;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C0182 f4723;

    public C1299(C0898 c0898, C0182 c0182) {
        this.f4722 = c0898;
        this.f4723 = c0182;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f4722.compareTo(((C1299) obj).f4722);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1299)) {
            return false;
        }
        return this.f4722.equals(((C1299) obj).f4722);
    }

    public final int hashCode() {
        return this.f4722.hashCode();
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f4722.mo1360() + ": " + this.f4723;
    }
}
