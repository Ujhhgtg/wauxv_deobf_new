package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0577 extends AbstractC1352 implements Comparable {

    public static final C0577 f2350 = new C0577(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0577 c0577 = (C0577) obj;
        if (this != c0577) {
            int length = this.f4836.length;
            int length2 = c0577.f4836.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C0576) m3062(i)).compareTo((C0576) c0577.m3062(i));
                if (iCompareTo != 0) {
                    return iCompareTo;
                }
            }
            if (length < length2) {
                return -1;
            }
            if (length > length2) {
                return 1;
            }
        }
        return 0;
    }
}
