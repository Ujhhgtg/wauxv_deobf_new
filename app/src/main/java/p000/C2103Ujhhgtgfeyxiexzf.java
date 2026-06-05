package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱUjhhgtgᛱ能不能ᛳᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2103Ujhhgtgfeyxiexzf {
    public static final C2102Ujhhgtgfeyxiexzf Companion = new C2102Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1717feyxiexzfUjhhgtg f6881Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f6882Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f6883Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2103Ujhhgtgfeyxiexzf(int i, C1717feyxiexzfUjhhgtg c1717feyxiexzfUjhhgtg, Long l, Long l2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2101Ujhhgtgfeyxiexzf.f6880Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6881Ujhhgtgfeyxiexzf = c1717feyxiexzfUjhhgtg;
        this.f6882Ujhhgtgfeyxiexzf = l;
        this.f6883Ujhhgtgfeyxiexzf = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2103Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2103Ujhhgtgfeyxiexzf c2103Ujhhgtgfeyxiexzf = (C2103Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6881Ujhhgtgfeyxiexzf, c2103Ujhhgtgfeyxiexzf.f6881Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6882Ujhhgtgfeyxiexzf, c2103Ujhhgtgfeyxiexzf.f6882Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6883Ujhhgtgfeyxiexzf, c2103Ujhhgtgfeyxiexzf.f6883Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C1717feyxiexzfUjhhgtg c1717feyxiexzfUjhhgtg = this.f6881Ujhhgtgfeyxiexzf;
        int iHashCode = (c1717feyxiexzfUjhhgtg == null ? 0 : c1717feyxiexzfUjhhgtg.hashCode()) * 31;
        Long l = this.f6882Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f6883Ujhhgtgfeyxiexzf;
        return iHashCode2 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("ab3Proto(gift=");
        sb.append(this.f6881Ujhhgtgfeyxiexzf);
        sb.append(", product_target_count=");
        sb.append(this.f6882Ujhhgtgfeyxiexzf);
        sb.append(", product_cur_count=");
        sb.append(this.f6883Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
