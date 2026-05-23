package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1826 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C0917 f6108;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C0917 f6109;

    public C1826(C0917 c0917, C0917 c0918) {
        this.f6108 = c0917;
        this.f6109 = c0918;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C1826) && compareTo((C1826) obj) == 0;
    }

    public final int hashCode() {
        C0917 c0917 = this.f6108;
        int iHashCode = (c0917 == null ? 0 : c0917.f3378.hashCode()) * 31;
        C0917 c0918 = this.f6109;
        return iHashCode + (c0918 != null ? c0918.f3378.hashCode() : 0);
    }

    public final String toString() {
        C0917 c0917 = this.f6109;
        C0917 c0918 = this.f6108;
        if (c0918 != null && c0917 == null) {
            return c0918.m2430();
        }
        if (c0918 == null && c0917 == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c0918 == null ? "" : c0918.m2430());
        sb.append("|");
        sb.append(c0917 != null ? c0917.m2430() : "");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C1826 c1826) {
        int iCompareTo;
        AbstractC0777 abstractC0777 = c1826.f6108;
        C0917 c0917 = this.f6108;
        if (c0917 == abstractC0777) {
            iCompareTo = 0;
        } else if (c0917 == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC0777 == null ? 1 : c0917.compareTo(abstractC0777);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC0777 abstractC0778 = c1826.f6109;
        C0917 c0918 = this.f6109;
        if (c0918 == abstractC0778) {
            return 0;
        }
        if (c0918 == null) {
            return -1;
        }
        if (abstractC0778 == null) {
            return 1;
        }
        return c0918.compareTo(abstractC0778);
    }
}
