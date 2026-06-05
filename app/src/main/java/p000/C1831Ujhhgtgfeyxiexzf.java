package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸ᛴᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1831Ujhhgtgfeyxiexzf {
    public static final C1835feyxiexzfUjhhgtg Companion = new C1835feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6156Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f6157Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f6158Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f6159Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1831Ujhhgtgfeyxiexzf(int i, Integer num, Long l, Long l2, String str) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1834Ujhhgtgfeyxiexzf.f6172Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6156Ujhhgtgfeyxiexzf = num;
        this.f6157Ujhhgtgfeyxiexzf = l;
        this.f6158Ujhhgtgfeyxiexzf = l2;
        this.f6159Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1831Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1831Ujhhgtgfeyxiexzf c1831Ujhhgtgfeyxiexzf = (C1831Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6156Ujhhgtgfeyxiexzf, c1831Ujhhgtgfeyxiexzf.f6156Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6157Ujhhgtgfeyxiexzf, c1831Ujhhgtgfeyxiexzf.f6157Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6158Ujhhgtgfeyxiexzf, c1831Ujhhgtgfeyxiexzf.f6158Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6159Ujhhgtgfeyxiexzf, c1831Ujhhgtgfeyxiexzf.f6159Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6156Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Long l = this.f6157Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f6158Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        String str = this.f6159Ujhhgtgfeyxiexzf;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928604864855934346L, strArr));
        sb.append(this.f6156Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928605045244560778L, strArr));
        sb.append(this.f6157Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928605122553972106L, strArr));
        sb.append(this.f6158Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928605058129462666L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6159Ujhhgtgfeyxiexzf, ')');
    }
}
