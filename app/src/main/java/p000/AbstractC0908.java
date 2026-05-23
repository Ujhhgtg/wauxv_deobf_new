package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᛸᲈᲁᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0908 extends AbstractC0909 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final long f3365;

    public AbstractC0908(long j) {
        this.f3365 = j;
    }

    public final boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f3365 == ((AbstractC0908) obj).f3365;
    }

    public final int hashCode() {
        long j = this.f3365;
        return ((int) (j >> 32)) ^ ((int) j);
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final int mo2267(AbstractC0777 abstractC0777) {
        long j = ((AbstractC0908) abstractC0777).f3365;
        long j2 = this.f3365;
        if (j2 < j) {
            return -1;
        }
        return j2 > j ? 1 : 0;
    }

    @Override // p000.AbstractC0777
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public final boolean mo2268() {
        return true;
    }

    @Override // p000.AbstractC0909
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public final boolean mo2423() {
        long j = this.f3365;
        return ((long) ((int) j)) == j;
    }

    @Override // p000.AbstractC0909
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final int mo2424() {
        return (int) this.f3365;
    }

    @Override // p000.AbstractC0909
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final long mo2425() {
        return this.f3365;
    }
}
