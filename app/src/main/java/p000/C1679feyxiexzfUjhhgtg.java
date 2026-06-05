package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1679feyxiexzfUjhhgtg {
    public static final C1678feyxiexzfUjhhgtg Companion = new C1678feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5646Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5647Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1679feyxiexzfUjhhgtg(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1697feyxiexzfUjhhgtg.f5683Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5646Ujhhgtgfeyxiexzf = num;
        this.f5647Ujhhgtgfeyxiexzf = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679feyxiexzfUjhhgtg)) {
            return false;
        }
        C1679feyxiexzfUjhhgtg c1679feyxiexzfUjhhgtg = (C1679feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5646Ujhhgtgfeyxiexzf, c1679feyxiexzfUjhhgtg.f5646Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5647Ujhhgtgfeyxiexzf, c1679feyxiexzfUjhhgtg.f5647Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5646Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f5647Ujhhgtgfeyxiexzf;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928111987293947274L, strArr));
        sb.append(this.f5646Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928112038833554826L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5647Ujhhgtgfeyxiexzf, ')');
    }
}
