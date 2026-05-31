package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲈᲀᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0913 extends AbstractC0775 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0913 f3380 = new C0913(new C0916("TYPE"), new C0916("Ljava/lang/Class;"));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0916 f3381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0916 f3382;

    public C0913(C0916 c0916, C0916 c0917) {
        if (c0916 == null) {
            throw new NullPointerException("name == null");
        }
        if (c0917 == null) {
            throw new NullPointerException("descriptor == null");
        }
        this.f3381 = c0916;
        this.f3382 = c0917;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0913)) {
            return false;
        }
        C0913 c0913 = (C0913) obj;
        return this.f3381.equals(c0913.f3381) && this.f3382.equals(c0913.f3382);
    }

    public final int hashCode() {
        return (this.f3381.f3385.hashCode() * 31) ^ this.f3382.f3385.hashCode();
    }

    public final String toString() {
        return "nat{" + mo1360() + '}';
    }

    @Override // p000.InterfaceC3466
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final String mo1360() {
        return this.f3381.mo1360() + ':' + this.f3382.mo1360();
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2369(AbstractC0775 abstractC0775) {
        C0913 c0913 = (C0913) abstractC0775;
        int iCompareTo = this.f3381.compareTo(c0913.f3381);
        return iCompareTo != 0 ? iCompareTo : this.f3382.compareTo(c0913.f3382);
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2370() {
        return false;
    }

    @Override // p000.AbstractC0775
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final String mo2371() {
        return "nat";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final C3505 m2545() {
        return C3505.m5023(this.f3382.f3385);
    }
}
