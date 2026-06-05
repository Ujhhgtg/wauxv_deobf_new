package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1841feyxiexzfUjhhgtg {
    public static final C1840Ujhhgtgfeyxiexzf Companion = new C1840Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6179Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6180Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1841feyxiexzfUjhhgtg(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1839feyxiexzfUjhhgtg.f6178Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6179Ujhhgtgfeyxiexzf = str;
        this.f6180Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1841feyxiexzfUjhhgtg)) {
            return false;
        }
        C1841feyxiexzfUjhhgtg c1841feyxiexzfUjhhgtg = (C1841feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6179Ujhhgtgfeyxiexzf, c1841feyxiexzfUjhhgtg.f6179Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6180Ujhhgtgfeyxiexzf, c1841feyxiexzfUjhhgtg.f6180Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6179Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f6180Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("yq3Proto(name=");
        sb.append(this.f6179Ujhhgtgfeyxiexzf);
        sb.append(", inner_tab_type=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6180Ujhhgtgfeyxiexzf, ')');
    }
}
