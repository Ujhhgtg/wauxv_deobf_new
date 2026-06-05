package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛲᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2789Ujhhgtgfeyxiexzf extends AbstractC3474Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final C2789Ujhhgtgfeyxiexzf f8831Ujhhgtgfeyxiexzf = new C2789Ujhhgtgfeyxiexzf(0);

    @Override // p000.AbstractC3474Ujhhgtgfeyxiexzf, p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return m4071Ujhhgtgfeyxiexzf("", "");
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf) {
        if (this == c2789Ujhhgtgfeyxiexzf) {
            return 0;
        }
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        int length2 = c2789Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            int iCompareTo = ((C2788feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i)).compareTo((C2788feyxiexzfUjhhgtg) c2789Ujhhgtgfeyxiexzf.m4969Ujhhgtgfeyxiexzf(i));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
        }
        if (length < length2) {
            return -1;
        }
        return length > length2 ? 1 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0051  */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final String m4071Ujhhgtgfeyxiexzf(String str, String str2) {
        StringBuilder sb = new StringBuilder(100);
        int length = this.f10801Ujhhgtgfeyxiexzf.length;
        sb.append(str);
        sb.append(str2);
        sb.append("catch ");
        for (int i = 0; i < length; i++) {
            C2788feyxiexzfUjhhgtg c2788feyxiexzfUjhhgtg = (C2788feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(i);
            if (i != 0) {
                sb.append(",\n");
                sb.append(str);
                sb.append("  ");
            }
            if (i != length - 1) {
                sb.append(c2788feyxiexzfUjhhgtg.f8829Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
            } else {
                int length2 = this.f10801Ujhhgtgfeyxiexzf.length;
                if (length2 == 0 ? false : ((C2788feyxiexzfUjhhgtg) m4969Ujhhgtgfeyxiexzf(length2 - 1)).f8829Ujhhgtgfeyxiexzf.equals(C3057Ujhhgtgfeyxiexzf.f9453Ujhhgtgfeyxiexzf)) {
                    sb.append("<any>");
                } else {
                    sb.append(c2788feyxiexzfUjhhgtg.f8829Ujhhgtgfeyxiexzf.f9473Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf());
                }
            }
            sb.append(" -> ");
            int i2 = c2788feyxiexzfUjhhgtg.f8830Ujhhgtgfeyxiexzf;
            sb.append(i2 == ((char) i2) ? AbstractC1264feyxiexzfUjhhgtg.m2809Ujhhgtgfeyxiexzf(i2) : AbstractC1264feyxiexzfUjhhgtg.m2810Ujhhgtgfeyxiexzf(i2));
        }
        return sb.toString();
    }
}
