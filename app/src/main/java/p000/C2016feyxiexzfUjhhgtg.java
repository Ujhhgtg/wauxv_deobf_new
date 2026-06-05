package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛳᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2016feyxiexzfUjhhgtg {
    public static final C2017feyxiexzfUjhhgtg Companion = new C2017feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6608Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6609Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2016feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2021feyxiexzfUjhhgtg.f6633Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6608Ujhhgtgfeyxiexzf = str;
        this.f6609Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2016feyxiexzfUjhhgtg)) {
            return false;
        }
        C2016feyxiexzfUjhhgtg c2016feyxiexzfUjhhgtg = (C2016feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6608Ujhhgtgfeyxiexzf, c2016feyxiexzfUjhhgtg.f6608Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6609Ujhhgtgfeyxiexzf, c2016feyxiexzfUjhhgtg.f6609Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6608Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6609Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("EmotionProto(md5=");
        sb.append(this.f6608Ujhhgtgfeyxiexzf);
        sb.append(", wording=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6609Ujhhgtgfeyxiexzf, ')');
    }
}
