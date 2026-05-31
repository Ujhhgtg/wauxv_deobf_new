package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲁᲈᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0550 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0917 f2300;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final int f2301;

    public C0550(C0917 c0917, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f2301 = i;
        this.f2300 = c0917;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0550) && compareTo((C0550) obj) == 0;
    }

    public final int hashCode() {
        return this.f2300.hashCode() + (this.f2301 * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0550 c0550) {
        int i = c0550.f2301;
        int i2 = this.f2301;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f2300.compareTo(c0550.f2300);
    }
}
