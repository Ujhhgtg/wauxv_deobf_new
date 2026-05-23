package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3482 implements Comparable {

    public final long f10979;

    public /* synthetic */ C3482(long j) {
        this.f10979 = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C3482) obj).f10979;
        long j2 = this.f10979 ^ -9223372036854775808L;
        long j3 = j ^ -9223372036854775808L;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3482) {
            return this.f10979 == ((C3482) obj).f10979;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10979);
    }

    public final String toString() {
        long j = this.f10979;
        if (j >= 0) {
            AbstractC3681.m5317(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / 10L) << 1;
        long j4 = j - (j3 * 10L);
        if (j4 >= 10L) {
            j4 -= 10L;
            j3++;
        }
        AbstractC3681.m5317(10);
        String string = Long.toString(j3, 10);
        AbstractC3681.m5317(10);
        return string.concat(Long.toString(j4, 10));
    }
}
