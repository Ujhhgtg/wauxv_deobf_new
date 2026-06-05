package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ要点脸ᛳ能不能ᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1709feyxiexzfUjhhgtg {
    public static final C1708feyxiexzfUjhhgtg Companion = new C1708feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5715Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5716Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5717Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1709feyxiexzfUjhhgtg(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1700feyxiexzfUjhhgtg.f5685Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5715Ujhhgtgfeyxiexzf = str;
        this.f5716Ujhhgtgfeyxiexzf = str2;
        this.f5717Ujhhgtgfeyxiexzf = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1709feyxiexzfUjhhgtg)) {
            return false;
        }
        C1709feyxiexzfUjhhgtg c1709feyxiexzfUjhhgtg = (C1709feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5715Ujhhgtgfeyxiexzf, c1709feyxiexzfUjhhgtg.f5715Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5716Ujhhgtgfeyxiexzf, c1709feyxiexzfUjhhgtg.f5716Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5717Ujhhgtgfeyxiexzf, c1709feyxiexzfUjhhgtg.f5717Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5715Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5716Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5717Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928575800812242314L, strArr));
        sb.append(this.f5715Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928575959726032266L, strArr));
        sb.append(this.f5716Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928576024150541706L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5717Ujhhgtgfeyxiexzf, ')');
    }
}
