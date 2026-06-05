package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1926Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final short f6397Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1926Ujhhgtgfeyxiexzf(short s) {
        this.f6397Ujhhgtgfeyxiexzf = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(this.f6397Ujhhgtgfeyxiexzf & 65535, ((C1926Ujhhgtgfeyxiexzf) obj).f6397Ujhhgtgfeyxiexzf & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1926Ujhhgtgfeyxiexzf) {
            return this.f6397Ujhhgtgfeyxiexzf == ((C1926Ujhhgtgfeyxiexzf) obj).f6397Ujhhgtgfeyxiexzf;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f6397Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        return String.valueOf(this.f6397Ujhhgtgfeyxiexzf & 65535);
    }
}
