package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛱfeyxiexzfᛱᛳ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1923feyxiexzfUjhhgtg implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final long f6393Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1923feyxiexzfUjhhgtg(long j) {
        this.f6393Ujhhgtgfeyxiexzf = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = ((C1923feyxiexzfUjhhgtg) obj).f6393Ujhhgtgfeyxiexzf;
        long j2 = this.f6393Ujhhgtgfeyxiexzf ^ Long.MIN_VALUE;
        long j3 = j ^ Long.MIN_VALUE;
        if (j2 < j3) {
            return -1;
        }
        return j2 == j3 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1923feyxiexzfUjhhgtg) {
            return this.f6393Ujhhgtgfeyxiexzf == ((C1923feyxiexzfUjhhgtg) obj).f6393Ujhhgtgfeyxiexzf;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6393Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        long j = this.f6393Ujhhgtgfeyxiexzf;
        if (j >= 0) {
            AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(10);
            return Long.toString(j, 10);
        }
        long j2 = 10;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(10);
        String string = Long.toString(j3, 10);
        AbstractC0217Ujhhgtgfeyxiexzf.m1310Ujhhgtgfeyxiexzf(10);
        return string.concat(Long.toString(j4, 10));
    }
}
