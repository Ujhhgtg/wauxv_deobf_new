package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ能不能要点脸ᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1696feyxiexzfUjhhgtg {
    public static final C1695feyxiexzfUjhhgtg Companion = new C1695feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2026Ujhhgtgfeyxiexzf f5681Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5682Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1696feyxiexzfUjhhgtg(int i, C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf, Integer num) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1694feyxiexzfUjhhgtg.f5680Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5681Ujhhgtgfeyxiexzf = c2026Ujhhgtgfeyxiexzf;
        this.f5682Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1696feyxiexzfUjhhgtg)) {
            return false;
        }
        C1696feyxiexzfUjhhgtg c1696feyxiexzfUjhhgtg = (C1696feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5681Ujhhgtgfeyxiexzf, c1696feyxiexzfUjhhgtg.f5681Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5682Ujhhgtgfeyxiexzf, c1696feyxiexzfUjhhgtg.f5682Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf = this.f5681Ujhhgtgfeyxiexzf;
        int iHashCode = (c2026Ujhhgtgfeyxiexzf == null ? 0 : c2026Ujhhgtgfeyxiexzf.hashCode()) * 31;
        Integer num = this.f5682Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928108061693838730L, strArr));
        sb.append(this.f5681Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928108121823380874L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5682Ujhhgtgfeyxiexzf, ')');
    }
}
