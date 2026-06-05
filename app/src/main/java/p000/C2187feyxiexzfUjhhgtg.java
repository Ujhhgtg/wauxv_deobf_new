package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸能不能ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2187feyxiexzfUjhhgtg {
    public static final C2186feyxiexzfUjhhgtg Companion = new C2186feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f7117Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f7118Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2187feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2185feyxiexzfUjhhgtg.f7116Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f7117Ujhhgtgfeyxiexzf = str;
        this.f7118Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2187feyxiexzfUjhhgtg)) {
            return false;
        }
        C2187feyxiexzfUjhhgtg c2187feyxiexzfUjhhgtg = (C2187feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7117Ujhhgtgfeyxiexzf, c2187feyxiexzfUjhhgtg.f7117Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7118Ujhhgtgfeyxiexzf, c2187feyxiexzfUjhhgtg.f7118Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f7117Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f7118Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("VideoColdDLRuleProto(type=");
        sb.append(this.f7117Ujhhgtgfeyxiexzf);
        sb.append(", value=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f7118Ujhhgtgfeyxiexzf, ')');
    }
}
