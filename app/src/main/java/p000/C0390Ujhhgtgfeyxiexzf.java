package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛲ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0390Ujhhgtgfeyxiexzf implements InterfaceC1724Ujhhgtgfeyxiexzf, Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C3154Ujhhgtgfeyxiexzf f2124Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C2422Ujhhgtgfeyxiexzf f2125Ujhhgtgfeyxiexzf;

    public C0390Ujhhgtgfeyxiexzf(C3154Ujhhgtgfeyxiexzf c3154Ujhhgtgfeyxiexzf, C2422Ujhhgtgfeyxiexzf c2422Ujhhgtgfeyxiexzf) {
        this.f2124Ujhhgtgfeyxiexzf = c3154Ujhhgtgfeyxiexzf;
        this.f2125Ujhhgtgfeyxiexzf = c2422Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2124Ujhhgtgfeyxiexzf.compareTo(((C0390Ujhhgtgfeyxiexzf) obj).f2124Ujhhgtgfeyxiexzf);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0390Ujhhgtgfeyxiexzf)) {
            return false;
        }
        return this.f2124Ujhhgtgfeyxiexzf.equals(((C0390Ujhhgtgfeyxiexzf) obj).f2124Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f2124Ujhhgtgfeyxiexzf.hashCode();
    }

    @Override // p000.InterfaceC1724Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final String mo1392Ujhhgtgfeyxiexzf() {
        return this.f2124Ujhhgtgfeyxiexzf.mo1392Ujhhgtgfeyxiexzf() + ": " + this.f2125Ujhhgtgfeyxiexzf;
    }
}
