package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0643Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f2693Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f2694Ujhhgtgfeyxiexzf;

    public C0643Ujhhgtgfeyxiexzf(int i, Object obj) {
        this.f2693Ujhhgtgfeyxiexzf = i;
        this.f2694Ujhhgtgfeyxiexzf = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0643Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0643Ujhhgtgfeyxiexzf c0643Ujhhgtgfeyxiexzf = (C0643Ujhhgtgfeyxiexzf) obj;
        return this.f2693Ujhhgtgfeyxiexzf == c0643Ujhhgtgfeyxiexzf.f2693Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2694Ujhhgtgfeyxiexzf, c0643Ujhhgtgfeyxiexzf.f2694Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f2693Ujhhgtgfeyxiexzf) * 31;
        Object obj = this.f2694Ujhhgtgfeyxiexzf;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "IndexedValue(index=" + this.f2693Ujhhgtgfeyxiexzf + ", value=" + this.f2694Ujhhgtgfeyxiexzf + ')';
    }
}
