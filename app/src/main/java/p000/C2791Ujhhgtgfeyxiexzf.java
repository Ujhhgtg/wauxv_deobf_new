package p000;

import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳ要点脸ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2791Ujhhgtgfeyxiexzf implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8838Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final int f8839Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2789Ujhhgtgfeyxiexzf f8840Ujhhgtgfeyxiexzf;

    public C2791Ujhhgtgfeyxiexzf(int i, int i2, C2789Ujhhgtgfeyxiexzf c2789Ujhhgtgfeyxiexzf) {
        if (i < 0) {
            throw new IllegalArgumentException("start < 0");
        }
        if (i2 <= i) {
            throw new IllegalArgumentException("end <= start");
        }
        if (c2789Ujhhgtgfeyxiexzf.f2247Ujhhgtgfeyxiexzf) {
            throw new IllegalArgumentException("handlers.isMutable()");
        }
        this.f8838Ujhhgtgfeyxiexzf = i;
        this.f8839Ujhhgtgfeyxiexzf = i2;
        this.f8840Ujhhgtgfeyxiexzf = c2789Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2791Ujhhgtgfeyxiexzf) && compareTo((C2791Ujhhgtgfeyxiexzf) obj) == 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8840Ujhhgtgfeyxiexzf.f10801Ujhhgtgfeyxiexzf) + (((this.f8838Ujhhgtgfeyxiexzf * 31) + this.f8839Ujhhgtgfeyxiexzf) * 31);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final int compareTo(C2791Ujhhgtgfeyxiexzf c2791Ujhhgtgfeyxiexzf) {
        int i = c2791Ujhhgtgfeyxiexzf.f8838Ujhhgtgfeyxiexzf;
        int i2 = this.f8838Ujhhgtgfeyxiexzf;
        if (i2 < i) {
            return -1;
        }
        if (i2 > i) {
            return 1;
        }
        int i3 = c2791Ujhhgtgfeyxiexzf.f8839Ujhhgtgfeyxiexzf;
        int i4 = this.f8839Ujhhgtgfeyxiexzf;
        if (i4 < i3) {
            return -1;
        }
        if (i4 > i3) {
            return 1;
        }
        return this.f8840Ujhhgtgfeyxiexzf.compareTo(c2791Ujhhgtgfeyxiexzf.f8840Ujhhgtgfeyxiexzf);
    }
}
