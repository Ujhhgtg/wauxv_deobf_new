package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ要点脸能不能ᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1720feyxiexzfUjhhgtg {
    public static final C1719feyxiexzfUjhhgtg Companion = new C1719feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Long f5774Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f5775Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5776Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Boolean f5777Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1720feyxiexzfUjhhgtg(int i, Long l, Long l2, Integer num, Boolean bool) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1718feyxiexzfUjhhgtg.f5773Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5774Ujhhgtgfeyxiexzf = l;
        this.f5775Ujhhgtgfeyxiexzf = l2;
        this.f5776Ujhhgtgfeyxiexzf = num;
        this.f5777Ujhhgtgfeyxiexzf = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1720feyxiexzfUjhhgtg)) {
            return false;
        }
        C1720feyxiexzfUjhhgtg c1720feyxiexzfUjhhgtg = (C1720feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5774Ujhhgtgfeyxiexzf, c1720feyxiexzfUjhhgtg.f5774Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5775Ujhhgtgfeyxiexzf, c1720feyxiexzfUjhhgtg.f5775Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5776Ujhhgtgfeyxiexzf, c1720feyxiexzfUjhhgtg.f5776Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5777Ujhhgtgfeyxiexzf, c1720feyxiexzfUjhhgtg.f5777Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Long l = this.f5774Ujhhgtgfeyxiexzf;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f5775Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.f5776Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.f5777Ujhhgtgfeyxiexzf;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928103607812752778L, strArr));
        sb.append(this.f5774Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928103629287589258L, strArr));
        sb.append(this.f5775Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928103813971182986L, strArr));
        sb.append(this.f5776Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928103779611444618L, strArr));
        sb.append(this.f5777Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
