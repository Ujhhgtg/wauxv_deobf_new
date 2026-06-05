package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2469feyxiexzfUjhhgtg {
    public static final C2470feyxiexzfUjhhgtg Companion = new C2470feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f8000Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C0935feyxiexzfUjhhgtg f8001Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2469feyxiexzfUjhhgtg(int i, Integer num, C0935feyxiexzfUjhhgtg c0935feyxiexzfUjhhgtg) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2467feyxiexzfUjhhgtg.f7997Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f8000Ujhhgtgfeyxiexzf = num;
        this.f8001Ujhhgtgfeyxiexzf = c0935feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2469feyxiexzfUjhhgtg)) {
            return false;
        }
        C2469feyxiexzfUjhhgtg c2469feyxiexzfUjhhgtg = (C2469feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8000Ujhhgtgfeyxiexzf, c2469feyxiexzfUjhhgtg.f8000Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8001Ujhhgtgfeyxiexzf, c2469feyxiexzfUjhhgtg.f8001Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f8000Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C0935feyxiexzfUjhhgtg c0935feyxiexzfUjhhgtg = this.f8001Ujhhgtgfeyxiexzf;
        return iHashCode + (c0935feyxiexzfUjhhgtg != null ? c0935feyxiexzfUjhhgtg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928594754502919562L, strArr));
        sb.append(this.f8000Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928594952071415178L, strArr));
        sb.append(this.f8001Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
