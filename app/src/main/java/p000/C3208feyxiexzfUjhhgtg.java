package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ能不能ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3208feyxiexzfUjhhgtg {
    public static final C3205feyxiexzfUjhhgtg Companion = new C3205feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Integer f9902Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Integer f9903Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3208feyxiexzfUjhhgtg)) {
            return false;
        }
        C3208feyxiexzfUjhhgtg c3208feyxiexzfUjhhgtg = (C3208feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9902Ujhhgtgfeyxiexzf, c3208feyxiexzfUjhhgtg.f9902Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9903Ujhhgtgfeyxiexzf, c3208feyxiexzfUjhhgtg.f9903Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f9902Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f9903Ujhhgtgfeyxiexzf;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928599577751192970L, strArr));
        sb.append(this.f9902Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928599736664982922L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f9903Ujhhgtgfeyxiexzf, ')');
    }
}
