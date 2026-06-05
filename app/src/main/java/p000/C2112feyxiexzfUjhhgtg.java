package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2112feyxiexzfUjhhgtg {
    public static final C2113feyxiexzfUjhhgtg Companion = new C2113feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Boolean f6900Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6901Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2112feyxiexzfUjhhgtg(int i, Boolean bool, Integer num) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2117feyxiexzfUjhhgtg.f6907Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6900Ujhhgtgfeyxiexzf = bool;
        this.f6901Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2112feyxiexzfUjhhgtg)) {
            return false;
        }
        C2112feyxiexzfUjhhgtg c2112feyxiexzfUjhhgtg = (C2112feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6900Ujhhgtgfeyxiexzf, c2112feyxiexzfUjhhgtg.f6900Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6901Ujhhgtgfeyxiexzf, c2112feyxiexzfUjhhgtg.f6901Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Boolean bool = this.f6900Ujhhgtgfeyxiexzf;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.f6901Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928139118602356106L, strArr));
        sb.append(this.f6900Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928142550281225610L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6901Ujhhgtgfeyxiexzf, ')');
    }
}
