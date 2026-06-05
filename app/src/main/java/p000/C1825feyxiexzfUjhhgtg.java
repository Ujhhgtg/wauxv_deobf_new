package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1825feyxiexzfUjhhgtg {
    public static final C1829feyxiexzfUjhhgtg Companion = new C1829feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6147Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6148Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1825feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1828feyxiexzfUjhhgtg.f6154Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6147Ujhhgtgfeyxiexzf = str;
        this.f6148Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1825feyxiexzfUjhhgtg)) {
            return false;
        }
        C1825feyxiexzfUjhhgtg c1825feyxiexzfUjhhgtg = (C1825feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6147Ujhhgtgfeyxiexzf, c1825feyxiexzfUjhhgtg.f6147Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6148Ujhhgtgfeyxiexzf, c1825feyxiexzfUjhhgtg.f6148Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6147Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6148Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928606561368016266L, strArr));
        sb.append(this.f6147Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928606509828408714L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6148Ujhhgtgfeyxiexzf, ')');
    }
}
