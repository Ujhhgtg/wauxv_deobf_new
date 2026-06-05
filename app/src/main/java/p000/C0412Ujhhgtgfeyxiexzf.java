package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ能不能要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0412Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f2233Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC3638Ujhhgtgfeyxiexzf f2234Ujhhgtgfeyxiexzf;

    public C0412Ujhhgtgfeyxiexzf(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf, AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf) {
        if (c3056Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("name == null");
        }
        if (abstractC3638Ujhhgtgfeyxiexzf == null) {
            throw new NullPointerException("value == null");
        }
        this.f2233Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf;
        this.f2234Ujhhgtgfeyxiexzf = abstractC3638Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf = (C0412Ujhhgtgfeyxiexzf) obj;
        int iCompareTo = this.f2233Ujhhgtgfeyxiexzf.compareTo(c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf);
        return iCompareTo != 0 ? iCompareTo : this.f2234Ujhhgtgfeyxiexzf.compareTo(c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0412Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0412Ujhhgtgfeyxiexzf c0412Ujhhgtgfeyxiexzf = (C0412Ujhhgtgfeyxiexzf) obj;
        return this.f2233Ujhhgtgfeyxiexzf.equals(c0412Ujhhgtgfeyxiexzf.f2233Ujhhgtgfeyxiexzf) && this.f2234Ujhhgtgfeyxiexzf.equals(c0412Ujhhgtgfeyxiexzf.f2234Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f2234Ujhhgtgfeyxiexzf.hashCode() + (this.f2233Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        return this.f2233Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + ":" + this.f2234Ujhhgtgfeyxiexzf;
    }
}
