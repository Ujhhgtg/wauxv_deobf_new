package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0889 extends AbstractC1352 implements Comparable {
    @Override // java.lang.Comparable
    public final int compareTo(C0889 c0889) {
        int length = this.f4836.length;
        int length2 = c0889.f4836.length;
        int i = length < length2 ? length : length2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC0777) m3062(i2)).compareTo((AbstractC0777) c0889.m3062(i2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }
}
