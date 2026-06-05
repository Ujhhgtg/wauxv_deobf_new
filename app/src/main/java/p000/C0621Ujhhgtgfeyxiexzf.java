package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0621Ujhhgtgfeyxiexzf {
    public static final C0620Ujhhgtgfeyxiexzf Companion = new C0620Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Integer f2649Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3603feyxiexzfUjhhgtg f2650Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0621Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0621Ujhhgtgfeyxiexzf c0621Ujhhgtgfeyxiexzf = (C0621Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2649Ujhhgtgfeyxiexzf, c0621Ujhhgtgfeyxiexzf.f2649Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f2650Ujhhgtgfeyxiexzf, c0621Ujhhgtgfeyxiexzf.f2650Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f2649Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3603feyxiexzfUjhhgtg c3603feyxiexzfUjhhgtg = this.f2650Ujhhgtgfeyxiexzf;
        return iHashCode + (c3603feyxiexzfUjhhgtg != null ? c3603feyxiexzfUjhhgtg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928514391369844106L, strArr));
        sb.append(this.f2649Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928514455794353546L, strArr));
        sb.append(this.f2650Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
