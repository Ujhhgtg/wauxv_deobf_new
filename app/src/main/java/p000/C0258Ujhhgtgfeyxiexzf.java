package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛲ能不能要点脸ᛴᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0258Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f1634Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final C3056Ujhhgtgfeyxiexzf f1635Ujhhgtgfeyxiexzf;

    public C0258Ujhhgtgfeyxiexzf(C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf, C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2) {
        this.f1634Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf;
        this.f1635Ujhhgtgfeyxiexzf = c3056Ujhhgtgfeyxiexzf2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0258Ujhhgtgfeyxiexzf) && compareTo((C0258Ujhhgtgfeyxiexzf) obj) == 0;
    }

    public final int hashCode() {
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f1634Ujhhgtgfeyxiexzf;
        int iHashCode = (c3056Ujhhgtgfeyxiexzf == null ? 0 : c3056Ujhhgtgfeyxiexzf.f9450Ujhhgtgfeyxiexzf.hashCode()) * 31;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = this.f1635Ujhhgtgfeyxiexzf;
        return iHashCode + (c3056Ujhhgtgfeyxiexzf2 != null ? c3056Ujhhgtgfeyxiexzf2.f9450Ujhhgtgfeyxiexzf.hashCode() : 0);
    }

    public final String toString() {
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f1635Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = this.f1634Ujhhgtgfeyxiexzf;
        if (c3056Ujhhgtgfeyxiexzf2 != null && c3056Ujhhgtgfeyxiexzf == null) {
            return c3056Ujhhgtgfeyxiexzf2.m4537Ujhhgtgfeyxiexzf();
        }
        if (c3056Ujhhgtgfeyxiexzf2 == null && c3056Ujhhgtgfeyxiexzf == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(c3056Ujhhgtgfeyxiexzf2 == null ? "" : c3056Ujhhgtgfeyxiexzf2.m4537Ujhhgtgfeyxiexzf());
        sb.append("|");
        sb.append(c3056Ujhhgtgfeyxiexzf != null ? c3056Ujhhgtgfeyxiexzf.m4537Ujhhgtgfeyxiexzf() : "");
        return sb.toString();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C0258Ujhhgtgfeyxiexzf c0258Ujhhgtgfeyxiexzf) {
        int iCompareTo;
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf = c0258Ujhhgtgfeyxiexzf.f1634Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf = this.f1634Ujhhgtgfeyxiexzf;
        if (c3056Ujhhgtgfeyxiexzf == abstractC3638Ujhhgtgfeyxiexzf) {
            iCompareTo = 0;
        } else if (c3056Ujhhgtgfeyxiexzf == null) {
            iCompareTo = -1;
        } else {
            iCompareTo = abstractC3638Ujhhgtgfeyxiexzf == null ? 1 : c3056Ujhhgtgfeyxiexzf.compareTo(abstractC3638Ujhhgtgfeyxiexzf);
        }
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        AbstractC3638Ujhhgtgfeyxiexzf abstractC3638Ujhhgtgfeyxiexzf2 = c0258Ujhhgtgfeyxiexzf.f1635Ujhhgtgfeyxiexzf;
        C3056Ujhhgtgfeyxiexzf c3056Ujhhgtgfeyxiexzf2 = this.f1635Ujhhgtgfeyxiexzf;
        if (c3056Ujhhgtgfeyxiexzf2 == abstractC3638Ujhhgtgfeyxiexzf2) {
            return 0;
        }
        if (c3056Ujhhgtgfeyxiexzf2 == null) {
            return -1;
        }
        if (abstractC3638Ujhhgtgfeyxiexzf2 == null) {
            return 1;
        }
        return c3056Ujhhgtgfeyxiexzf2.compareTo(abstractC3638Ujhhgtgfeyxiexzf2);
    }
}
