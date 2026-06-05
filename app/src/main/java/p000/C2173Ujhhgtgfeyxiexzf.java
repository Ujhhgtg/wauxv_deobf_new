package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛴ能不能ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2173Ujhhgtgfeyxiexzf {
    public static final C2172Ujhhgtgfeyxiexzf Companion = new C2172Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f7048Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f7049Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2173Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2144feyxiexzfUjhhgtg.f6970Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f7048Ujhhgtgfeyxiexzf = num;
        this.f7049Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2173Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2173Ujhhgtgfeyxiexzf c2173Ujhhgtgfeyxiexzf = (C2173Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7048Ujhhgtgfeyxiexzf, c2173Ujhhgtgfeyxiexzf.f7048Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7049Ujhhgtgfeyxiexzf, c2173Ujhhgtgfeyxiexzf.f7049Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f7048Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7049Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928179272251606410L, strArr));
        sb.append(this.f7048Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928178370308474250L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f7049Ujhhgtgfeyxiexzf, ')');
    }
}
