package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳᛴ能不能ᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1785feyxiexzfUjhhgtg implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Object f6024Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f6025Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f6026Ujhhgtgfeyxiexzf;

    public C1785feyxiexzfUjhhgtg(String str, String str2, String str3) {
        this.f6024Ujhhgtgfeyxiexzf = str;
        this.f6025Ujhhgtgfeyxiexzf = str2;
        this.f6026Ujhhgtgfeyxiexzf = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1785feyxiexzfUjhhgtg)) {
            return false;
        }
        C1785feyxiexzfUjhhgtg c1785feyxiexzfUjhhgtg = (C1785feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6024Ujhhgtgfeyxiexzf, c1785feyxiexzfUjhhgtg.f6024Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6025Ujhhgtgfeyxiexzf, c1785feyxiexzfUjhhgtg.f6025Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6026Ujhhgtgfeyxiexzf, c1785feyxiexzfUjhhgtg.f6026Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Object obj = this.f6024Ujhhgtgfeyxiexzf;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f6025Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f6026Ujhhgtgfeyxiexzf;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f6024Ujhhgtgfeyxiexzf + ", " + this.f6025Ujhhgtgfeyxiexzf + ", " + this.f6026Ujhhgtgfeyxiexzf + ')';
    }
}
