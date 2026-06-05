package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛳᛱfeyxiexzfᛱᛴ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2139feyxiexzfUjhhgtg {
    public static final C2136feyxiexzfUjhhgtg Companion = new C2136feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6959Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6960Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2139feyxiexzfUjhhgtg(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2137feyxiexzfUjhhgtg.f6957Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6959Ujhhgtgfeyxiexzf = num;
        this.f6960Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2139feyxiexzfUjhhgtg)) {
            return false;
        }
        C2139feyxiexzfUjhhgtg c2139feyxiexzfUjhhgtg = (C2139feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6959Ujhhgtgfeyxiexzf, c2139feyxiexzfUjhhgtg.f6959Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6960Ujhhgtgfeyxiexzf, c2139feyxiexzfUjhhgtg.f6960Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6959Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f6960Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928195739156219274L, strArr));
        sb.append(this.f6959Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928194789968446858L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6960Ujhhgtgfeyxiexzf, ')');
    }
}
