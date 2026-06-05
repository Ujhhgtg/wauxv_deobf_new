package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛴᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3754feyxiexzfUjhhgtg extends AbstractC3474Ujhhgtgfeyxiexzf implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C3754feyxiexzfUjhhgtg c3754feyxiexzfUjhhgtg) {
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        int length2 = c3754feyxiexzfUjhhgtg.f10801Ujhhgtgfeyxiexzf.length;
        int i = length < length2 ? length : length2;
        for (int i2 = 0; i2 < i; i2++) {
            int iCompareTo = ((AbstractC3638Ujhhgtgfeyxiexzf) m4969Ujhhgtgfeyxiexzf(i2)).compareTo((AbstractC3638Ujhhgtgfeyxiexzf) c3754feyxiexzfUjhhgtg.m4969Ujhhgtgfeyxiexzf(i2));
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
