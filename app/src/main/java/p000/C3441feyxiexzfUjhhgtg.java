package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛲᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3441feyxiexzfUjhhgtg implements InterfaceC1724Ujhhgtgfeyxiexzf, Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3140Ujhhgtgfeyxiexzf f10722Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C2422Ujhhgtgfeyxiexzf f10723Ujhhgtgfeyxiexzf;

    public C3441feyxiexzfUjhhgtg(C3140Ujhhgtgfeyxiexzf c3140Ujhhgtgfeyxiexzf, C2422Ujhhgtgfeyxiexzf c2422Ujhhgtgfeyxiexzf) {
        this.f10722Ujhhgtgfeyxiexzf = c3140Ujhhgtgfeyxiexzf;
        this.f10723Ujhhgtgfeyxiexzf = c2422Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f10722Ujhhgtgfeyxiexzf.compareTo(((C3441feyxiexzfUjhhgtg) obj).f10722Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3441feyxiexzfUjhhgtg)) {
            return false;
        }
        return this.f10722Ujhhgtgfeyxiexzf.equals(((C3441feyxiexzfUjhhgtg) obj).f10722Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f10722Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f10722Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + ": " + this.f10723Ujhhgtgfeyxiexzf;
    }
}
