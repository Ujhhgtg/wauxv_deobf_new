package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲈᲇᤞᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0888 extends AbstractC1352 implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0888 c0888) {
        int length = this.f4833.length;
        int length2 = c0888.f4833.length;
        int i = length < length2 ? length : length2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC0775) m3165(i2)).compareTo((AbstractC0775) c0888.m3165(i2));
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
