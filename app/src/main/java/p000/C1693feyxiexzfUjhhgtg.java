package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1693feyxiexzfUjhhgtg {
    public static final C1692feyxiexzfUjhhgtg Companion = new C1692feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5678Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5679Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1693feyxiexzfUjhhgtg(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1537Ujhhgtgfeyxiexzf.f5340Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5678Ujhhgtgfeyxiexzf = str;
        this.f5679Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693feyxiexzfUjhhgtg)) {
            return false;
        }
        C1693feyxiexzfUjhhgtg c1693feyxiexzfUjhhgtg = (C1693feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5678Ujhhgtgfeyxiexzf, c1693feyxiexzfUjhhgtg.f5678Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5679Ujhhgtgfeyxiexzf, c1693feyxiexzfUjhhgtg.f5679Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5678Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5679Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928108581384881546L, strArr));
        sb.append(this.f5678Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928108671579194762L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5679Ujhhgtgfeyxiexzf, ')');
    }
}
