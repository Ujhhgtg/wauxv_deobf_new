package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛲ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2863Ujhhgtgfeyxiexzf implements InterfaceC2864Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final float f9122Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final float f9123Ujhhgtgfeyxiexzf;

    public C2863Ujhhgtgfeyxiexzf(float f, float f2) {
        this.f9122Ujhhgtgfeyxiexzf = f;
        this.f9123Ujhhgtgfeyxiexzf = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2863Ujhhgtgfeyxiexzf)) {
            return false;
        }
        float f = this.f9122Ujhhgtgfeyxiexzf;
        float f2 = this.f9123Ujhhgtgfeyxiexzf;
        if (f > f2) {
            C2863Ujhhgtgfeyxiexzf c2863Ujhhgtgfeyxiexzf = (C2863Ujhhgtgfeyxiexzf) obj;
            if (c2863Ujhhgtgfeyxiexzf.f9122Ujhhgtgfeyxiexzf > c2863Ujhhgtgfeyxiexzf.f9123Ujhhgtgfeyxiexzf) {
                return true;
            }
        }
        C2863Ujhhgtgfeyxiexzf c2863Ujhhgtgfeyxiexzf2 = (C2863Ujhhgtgfeyxiexzf) obj;
        return f == c2863Ujhhgtgfeyxiexzf2.f9122Ujhhgtgfeyxiexzf && f2 == c2863Ujhhgtgfeyxiexzf2.f9123Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        float f = this.f9122Ujhhgtgfeyxiexzf;
        float f2 = this.f9123Ujhhgtgfeyxiexzf;
        if (f > f2) {
            return -1;
        }
        return Float.hashCode(f2) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        return this.f9122Ujhhgtgfeyxiexzf + ".." + this.f9123Ujhhgtgfeyxiexzf;
    }
}
