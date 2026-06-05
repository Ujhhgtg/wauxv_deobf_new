package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1808feyxiexzfUjhhgtg {
    public static final C1809feyxiexzfUjhhgtg Companion = new C1809feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6100Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6101Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6102Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1808feyxiexzfUjhhgtg(int i, Integer num, Integer num2, String str) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1806Ujhhgtgfeyxiexzf.f6097Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6100Ujhhgtgfeyxiexzf = num;
        this.f6101Ujhhgtgfeyxiexzf = num2;
        this.f6102Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1808feyxiexzfUjhhgtg)) {
            return false;
        }
        C1808feyxiexzfUjhhgtg c1808feyxiexzfUjhhgtg = (C1808feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6100Ujhhgtgfeyxiexzf, c1808feyxiexzfUjhhgtg.f6100Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6101Ujhhgtgfeyxiexzf, c1808feyxiexzfUjhhgtg.f6101Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6102Ujhhgtgfeyxiexzf, c1808feyxiexzfUjhhgtg.f6102Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6100Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f6101Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.f6102Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928617492059784586L, strArr));
        sb.append(this.f6100Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928617444815144330L, strArr));
        sb.append(this.f6101Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928616461267633546L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6102Ujhhgtgfeyxiexzf, ')');
    }
}
