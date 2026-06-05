package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱ能不能ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2086Ujhhgtgfeyxiexzf {
    public static final C2105Ujhhgtgfeyxiexzf Companion = new C2105Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6846Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6847Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f6848Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Long f6849Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2086Ujhhgtgfeyxiexzf(int i, Integer num, Integer num2, Long l, Long l2) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C2104Ujhhgtgfeyxiexzf.f6884Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6846Ujhhgtgfeyxiexzf = num;
        this.f6847Ujhhgtgfeyxiexzf = num2;
        this.f6848Ujhhgtgfeyxiexzf = l;
        this.f6849Ujhhgtgfeyxiexzf = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2086Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2086Ujhhgtgfeyxiexzf c2086Ujhhgtgfeyxiexzf = (C2086Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6846Ujhhgtgfeyxiexzf, c2086Ujhhgtgfeyxiexzf.f6846Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6847Ujhhgtgfeyxiexzf, c2086Ujhhgtgfeyxiexzf.f6847Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6848Ujhhgtgfeyxiexzf, c2086Ujhhgtgfeyxiexzf.f6848Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6849Ujhhgtgfeyxiexzf, c2086Ujhhgtgfeyxiexzf.f6849Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6846Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f6847Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l = this.f6848Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.f6849Ujhhgtgfeyxiexzf;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928156912651863434L, strArr));
        sb.append(this.f6846Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928157037205915018L, strArr));
        sb.append(this.f6847Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928157101630424458L, strArr));
        sb.append(this.f6848Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928157178939835786L, strArr));
        sb.append(this.f6849Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
