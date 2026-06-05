package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛴᛳᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2169feyxiexzfUjhhgtg {
    public static final C2166Ujhhgtgfeyxiexzf Companion = new C2166Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f7040Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f7041Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f7042Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2169feyxiexzfUjhhgtg(int i, Integer num, Integer num2, Long l) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2167Ujhhgtgfeyxiexzf.f7038Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f7040Ujhhgtgfeyxiexzf = num;
        this.f7041Ujhhgtgfeyxiexzf = num2;
        this.f7042Ujhhgtgfeyxiexzf = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2169feyxiexzfUjhhgtg)) {
            return false;
        }
        C2169feyxiexzfUjhhgtg c2169feyxiexzfUjhhgtg = (C2169feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7040Ujhhgtgfeyxiexzf, c2169feyxiexzfUjhhgtg.f7040Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7041Ujhhgtgfeyxiexzf, c2169feyxiexzfUjhhgtg.f7041Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7042Ujhhgtgfeyxiexzf, c2169feyxiexzfUjhhgtg.f7042Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f7040Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f7041Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f7042Ujhhgtgfeyxiexzf;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928169492611073418L, strArr));
        sb.append(this.f7040Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928169638639961482L, strArr));
        sb.append(this.f7041Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928169715949372810L, strArr));
        sb.append(this.f7042Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
