package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᲁᤝᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1853 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0916 f6183;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0916 f6184;

    public C1853(C0916 c0916, C0916 c0917) {
        this.f6183 = c0916;
        this.f6184 = c0917;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1853) && compareTo((C1853) obj) == 0;
    }

    public final int hashCode() {
        C0916 c0916 = this.f6183;
        int iHashCode = (c0916 == null ? 0 : c0916.f3385.hashCode()) * 31;
        C0916 c0917 = this.f6184;
        return iHashCode + (c0917 != null ? c0917.f3385.hashCode() : 0);
    }

    public final String toString() {
        C0916 c0916 = this.f6184;
        C0916 c0917 = this.f6183;
        if (c0917 != null && c0916 == null) {
            return c0917.m2547();
        }
        if (c0917 == null && c0916 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c0917 == null ? "" : c0917.m2547());
        sb.append("|");
        sb.append(c0916 != null ? c0916.m2547() : "");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1853 c1853) {
        int iCompareTo;
        AbstractC0775 abstractC0775 = c1853.f6183;
        C0916 c0916 = this.f6183;
        if (c0916 == abstractC0775) {
            iCompareTo = 0;
        } else if (c0916 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC0775 == null ? 1 : c0916.compareTo(abstractC0775);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC0775 abstractC0776 = c1853.f6184;
        C0916 c0917 = this.f6184;
        if (c0917 == abstractC0776) {
            return 0;
        }
        if (c0917 == null) {
            return -1;
        }
        if (abstractC0776 == null) {
            return 1;
        }
        return c0917.compareTo(abstractC0776);
    }
}
