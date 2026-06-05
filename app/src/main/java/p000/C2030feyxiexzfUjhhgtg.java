package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛳ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2030feyxiexzfUjhhgtg {
    public static final C2029Ujhhgtgfeyxiexzf Companion = new C2029Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6667Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6668Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2030feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2028Ujhhgtgfeyxiexzf.f6666Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6667Ujhhgtgfeyxiexzf = str;
        this.f6668Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2030feyxiexzfUjhhgtg)) {
            return false;
        }
        C2030feyxiexzfUjhhgtg c2030feyxiexzfUjhhgtg = (C2030feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6667Ujhhgtgfeyxiexzf, c2030feyxiexzfUjhhgtg.f6667Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6668Ujhhgtgfeyxiexzf, c2030feyxiexzfUjhhgtg.f6668Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6667Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6668Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928158544739435914L, strArr));
        sb.append(this.f6667Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928158768077735306L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6668Ujhhgtgfeyxiexzf, ')');
    }
}
