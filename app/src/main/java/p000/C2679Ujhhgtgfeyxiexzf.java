package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2679Ujhhgtgfeyxiexzf implements Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f8562Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f8563Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f8564Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f8565Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C2680Ujhhgtgfeyxiexzf f8566Ujhhgtgfeyxiexzf;

    public C2679Ujhhgtgfeyxiexzf(String str, boolean z, int i, int i2, C2680Ujhhgtgfeyxiexzf c2680Ujhhgtgfeyxiexzf) {
        this.f8562Ujhhgtgfeyxiexzf = str;
        this.f8563Ujhhgtgfeyxiexzf = z;
        this.f8564Ujhhgtgfeyxiexzf = i;
        this.f8565Ujhhgtgfeyxiexzf = i2;
        this.f8566Ujhhgtgfeyxiexzf = c2680Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2679Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2679Ujhhgtgfeyxiexzf c2679Ujhhgtgfeyxiexzf = (C2679Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8562Ujhhgtgfeyxiexzf, c2679Ujhhgtgfeyxiexzf.f8562Ujhhgtgfeyxiexzf) && this.f8563Ujhhgtgfeyxiexzf == c2679Ujhhgtgfeyxiexzf.f8563Ujhhgtgfeyxiexzf && this.f8564Ujhhgtgfeyxiexzf == c2679Ujhhgtgfeyxiexzf.f8564Ujhhgtgfeyxiexzf && this.f8565Ujhhgtgfeyxiexzf == c2679Ujhhgtgfeyxiexzf.f8565Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8566Ujhhgtgfeyxiexzf, c2679Ujhhgtgfeyxiexzf.f8566Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f8566Ujhhgtgfeyxiexzf.hashCode() + ((Integer.hashCode(this.f8565Ujhhgtgfeyxiexzf) + ((Integer.hashCode(this.f8564Ujhhgtgfeyxiexzf) + ((Boolean.hashCode(this.f8563Ujhhgtgfeyxiexzf) + (this.f8562Ujhhgtgfeyxiexzf.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChannelDataWrapper(wrapperId=" + this.f8562Ujhhgtgfeyxiexzf + ", isSegmentsType=" + this.f8563Ujhhgtgfeyxiexzf + ", segmentsSize=" + this.f8564Ujhhgtgfeyxiexzf + ", segmentsIndex=" + this.f8565Ujhhgtgfeyxiexzf + ", instance=" + this.f8566Ujhhgtgfeyxiexzf + ")";
    }
}
