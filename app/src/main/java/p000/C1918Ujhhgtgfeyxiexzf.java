package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛴ能不能ᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1918Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final byte f6387Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1918Ujhhgtgfeyxiexzf(byte b) {
        this.f6387Ujhhgtgfeyxiexzf = b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return C3052Ujhhgtgfeyxiexzf.m4514Ujhhgtgfeyxiexzf(this.f6387Ujhhgtgfeyxiexzf & 255, ((C1918Ujhhgtgfeyxiexzf) obj).f6387Ujhhgtgfeyxiexzf & 255);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1918Ujhhgtgfeyxiexzf) {
            return this.f6387Ujhhgtgfeyxiexzf == ((C1918Ujhhgtgfeyxiexzf) obj).f6387Ujhhgtgfeyxiexzf;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.f6387Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        return String.valueOf(this.f6387Ujhhgtgfeyxiexzf & 255);
    }
}
