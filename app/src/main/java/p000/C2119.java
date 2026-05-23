package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲈᤝᲀᲁᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2119 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0917 f6978;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0777 f6979;

    public C2119(C0917 c0917, AbstractC0777 abstractC0777) {
        if (c0917 == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC0777 == null) {
            throw new NullPointerException("value == null");
        }
        this.f6978 = c0917;
        this.f6979 = abstractC0777;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2119 c2119 = (C2119) obj;
        int iCompareTo = this.f6978.compareTo(c2119.f6978);
        return iCompareTo != 0 ? iCompareTo : this.f6979.compareTo(c2119.f6979);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2119)) {
            return false;
        }
        C2119 c2119 = (C2119) obj;
        return this.f6978.equals(c2119.f6978) && this.f6979.equals(c2119.f6979);
    }

    public final int hashCode() {
        return this.f6979.hashCode() + (this.f6978.f3378.hashCode() * 31);
    }

    public final String toString() {
        return this.f6978.mo1214() + ":" + this.f6979;
    }
}
