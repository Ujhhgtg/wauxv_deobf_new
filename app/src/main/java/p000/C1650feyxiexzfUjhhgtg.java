package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱᛳ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1650feyxiexzfUjhhgtg {
    public static final C1654feyxiexzfUjhhgtg Companion = new C1654feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5606Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5607Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5608Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1650feyxiexzfUjhhgtg(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1655feyxiexzfUjhhgtg.f5612Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5606Ujhhgtgfeyxiexzf = num;
        this.f5607Ujhhgtgfeyxiexzf = str;
        this.f5608Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1650feyxiexzfUjhhgtg)) {
            return false;
        }
        C1650feyxiexzfUjhhgtg c1650feyxiexzfUjhhgtg = (C1650feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5606Ujhhgtgfeyxiexzf, c1650feyxiexzfUjhhgtg.f5606Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5607Ujhhgtgfeyxiexzf, c1650feyxiexzfUjhhgtg.f5607Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5608Ujhhgtgfeyxiexzf, c1650feyxiexzfUjhhgtg.f5608Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5606Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5607Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5608Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928619287356114314L, strArr));
        sb.append(this.f5606Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928619463449773450L, strArr));
        sb.append(this.f5607Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928619506399446410L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5608Ujhhgtgfeyxiexzf, ')');
    }
}
