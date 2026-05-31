package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᲈᲀᤞᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0554 extends AbstractC1352 implements Comparable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final C0554 f2312 = new C0554(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0554 c0554 = (C0554) obj;
        if (this != c0554) {
            int length = this.f4833.length;
            int length2 = c0554.f4833.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C0553) m3165(i)).compareTo((C0553) c0554.m3165(i));
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
