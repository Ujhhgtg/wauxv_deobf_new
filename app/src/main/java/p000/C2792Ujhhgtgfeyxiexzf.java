package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛴᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2792Ujhhgtgfeyxiexzf extends AbstractC3474Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2792Ujhhgtgfeyxiexzf f8841Ujhhgtgfeyxiexzf = new C2792Ujhhgtgfeyxiexzf(0);

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2792Ujhhgtgfeyxiexzf c2792Ujhhgtgfeyxiexzf = (C2792Ujhhgtgfeyxiexzf) obj;
        if (this != c2792Ujhhgtgfeyxiexzf) {
            int length = this.f10801Ujhhgtgfeyxiexzf.length;
            int length2 = c2792Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
            int iMin = Math.min(length, length2);
            for (int i = 0; i < iMin; i++) {
                int iCompareTo = ((C2791Ujhhgtgfeyxiexzf) m4969Ujhhgtgfeyxiexzf(i)).compareTo((C2791Ujhhgtgfeyxiexzf) c2792Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i));
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
