package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᲀᤝᲇᛸᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2152 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0916 f7102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC0775 f7103;

    public C2152(C0916 c0916, AbstractC0775 abstractC0775) {
        if (c0916 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC0775 == null) {
            throw new NullPointerException("value == null");
        }
        this.f7102 = c0916;
        this.f7103 = abstractC0775;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2152 c2152 = (C2152) obj;
        int iCompareTo = this.f7102.compareTo(c2152.f7102);
        return iCompareTo != 0 ? iCompareTo : this.f7103.compareTo(c2152.f7103);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2152)) {
            return false;
        }
        C2152 c2152 = (C2152) obj;
        return this.f7102.equals(c2152.f7102) && this.f7103.equals(c2152.f7103);
    }

    public final int hashCode() {
        return this.f7103.hashCode() + (this.f7102.f3385.hashCode() * 31);
    }

    public final String toString() {
        return this.f7102.mo1360() + ":" + this.f7103;
    }
}
