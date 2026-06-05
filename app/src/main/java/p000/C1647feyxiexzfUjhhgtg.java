package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛳ要点脸ᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1647feyxiexzfUjhhgtg {
    public static final C1644feyxiexzfUjhhgtg Companion = new C1644feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5602Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5603Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5604Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1647feyxiexzfUjhhgtg(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1645feyxiexzfUjhhgtg.f5600Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5602Ujhhgtgfeyxiexzf = num;
        this.f5603Ujhhgtgfeyxiexzf = num2;
        this.f5604Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1647feyxiexzfUjhhgtg)) {
            return false;
        }
        C1647feyxiexzfUjhhgtg c1647feyxiexzfUjhhgtg = (C1647feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5602Ujhhgtgfeyxiexzf, c1647feyxiexzfUjhhgtg.f5602Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5603Ujhhgtgfeyxiexzf, c1647feyxiexzfUjhhgtg.f5603Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5604Ujhhgtgfeyxiexzf, c1647feyxiexzfUjhhgtg.f5604Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5602Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f5603Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f5604Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928557671755285898L, strArr));
        sb.append(this.f5602Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928557723294893450L, strArr));
        sb.append(this.f5603Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928557899388552586L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5604Ujhhgtgfeyxiexzf, ')');
    }
}
