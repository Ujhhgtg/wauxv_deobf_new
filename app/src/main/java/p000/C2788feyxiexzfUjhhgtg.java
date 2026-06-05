package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2788feyxiexzfUjhhgtg implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3057Ujhhgtgfeyxiexzf f8829Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8830Ujhhgtgfeyxiexzf;

    public C2788feyxiexzfUjhhgtg(C3057Ujhhgtgfeyxiexzf c3057Ujhhgtgfeyxiexzf, int i) {
        if (i < 0) {
            throw new IllegalArgumentException("handler < 0");
        }
        this.f8830Ujhhgtgfeyxiexzf = i;
        this.f8829Ujhhgtgfeyxiexzf = c3057Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2788feyxiexzfUjhhgtg) && compareTo((C2788feyxiexzfUjhhgtg) obj) == 0;
    }

    public final int hashCode() {
        return this.f8829Ujhhgtgfeyxiexzf.hashCode() + (this.f8830Ujhhgtgfeyxiexzf * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2788feyxiexzfUjhhgtg c2788feyxiexzfUjhhgtg) {
        int i = c2788feyxiexzfUjhhgtg.f8830Ujhhgtgfeyxiexzf;
        int i2 = this.f8830Ujhhgtgfeyxiexzf;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        return this.f8829Ujhhgtgfeyxiexzf.compareTo(c2788feyxiexzfUjhhgtg.f8829Ujhhgtgfeyxiexzf);
    }
}
