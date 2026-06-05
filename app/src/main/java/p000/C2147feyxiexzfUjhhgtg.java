package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛳᛴ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2147feyxiexzfUjhhgtg {
    public static final C2146Ujhhgtgfeyxiexzf Companion = new C2146Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6977Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6978Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2147feyxiexzfUjhhgtg(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2138feyxiexzfUjhhgtg.f6958Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6977Ujhhgtgfeyxiexzf = num;
        this.f6978Ujhhgtgfeyxiexzf = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2147feyxiexzfUjhhgtg)) {
            return false;
        }
        C2147feyxiexzfUjhhgtg c2147feyxiexzfUjhhgtg = (C2147feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6977Ujhhgtgfeyxiexzf, c2147feyxiexzfUjhhgtg.f6977Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6978Ujhhgtgfeyxiexzf, c2147feyxiexzfUjhhgtg.f6978Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6977Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f6978Ujhhgtgfeyxiexzf;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928195232350078346L, strArr));
        sb.append(this.f6977Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928194317522044298L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6978Ujhhgtgfeyxiexzf, ')');
    }
}
