package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ能不能ᛲᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1381feyxiexzfUjhhgtg implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f4874Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f4875Ujhhgtgfeyxiexzf;

    public C1381feyxiexzfUjhhgtg(Object obj, Object obj2) {
        this.f4874Ujhhgtgfeyxiexzf = obj;
        this.f4875Ujhhgtgfeyxiexzf = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1381feyxiexzfUjhhgtg)) {
            return false;
        }
        C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg = (C1381feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4874Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4875Ujhhgtgfeyxiexzf, c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Object obj = this.f4874Ujhhgtgfeyxiexzf;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f4875Ujhhgtgfeyxiexzf;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f4874Ujhhgtgfeyxiexzf + ", " + this.f4875Ujhhgtgfeyxiexzf + ')';
    }
}
