package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2680Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f8567Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Object f8568Ujhhgtgfeyxiexzf;

    public C2680Ujhhgtgfeyxiexzf(Object obj, String str) {
        this.f8567Ujhhgtgfeyxiexzf = str;
        this.f8568Ujhhgtgfeyxiexzf = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2680Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf = (C2680Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8567Ujhhgtgfeyxiexzf, c2680Ujhhgtgfeyxiexzf.f8567Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8568Ujhhgtgfeyxiexzf, c2680Ujhhgtgfeyxiexzf.f8568Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = this.f8567Ujhhgtgfeyxiexzf.hashCode() * 31;
        Object obj = this.f8568Ujhhgtgfeyxiexzf;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        return "ChannelData(key=" + this.f8567Ujhhgtgfeyxiexzf + ", value=" + this.f8568Ujhhgtgfeyxiexzf + ")";
    }
}
