package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᛸᤝᲀᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3539 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final long f11131;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C3539) obj).f11131;
        long j2 = this.f11131 ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3539) {
            return this.f11131 == ((C3539) obj).f11131;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11131);
    }

    public final String toString() {
        long j = this.f11131;
        if (j >= 0) {
            AbstractC2727.m4694(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        AbstractC2727.m4694(10);
        String string = Long.toString(j3, 10);
        AbstractC2727.m4694(10);
        return string.concat(Long.toString(j4, 10));
    }
}
