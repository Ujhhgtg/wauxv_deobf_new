package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛴᛳᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2046Ujhhgtgfeyxiexzf {
    public static final C2047Ujhhgtgfeyxiexzf Companion = new C2047Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6744Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6745Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2046Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2051feyxiexzfUjhhgtg.f6758Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6744Ujhhgtgfeyxiexzf = str;
        this.f6745Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2046Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2046Ujhhgtgfeyxiexzf c2046Ujhhgtgfeyxiexzf = (C2046Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6744Ujhhgtgfeyxiexzf, c2046Ujhhgtgfeyxiexzf.f6744Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6745Ujhhgtgfeyxiexzf, c2046Ujhhgtgfeyxiexzf.f6745Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6744Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f6745Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928104952137516426L, strArr));
        sb.append(this.f6744Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928105093871437194L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6745Ujhhgtgfeyxiexzf, ')');
    }
}
