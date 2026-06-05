package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ能不能ᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1532Ujhhgtgfeyxiexzf {
    public static final C1533Ujhhgtgfeyxiexzf Companion = new C1533Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Boolean f5328Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5329Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1532Ujhhgtgfeyxiexzf(int i, Boolean bool, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1550Ujhhgtgfeyxiexzf.f5352Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5328Ujhhgtgfeyxiexzf = bool;
        this.f5329Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1532Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1532Ujhhgtgfeyxiexzf c1532Ujhhgtgfeyxiexzf = (C1532Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5328Ujhhgtgfeyxiexzf, c1532Ujhhgtgfeyxiexzf.f5328Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5329Ujhhgtgfeyxiexzf, c1532Ujhhgtgfeyxiexzf.f5329Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Boolean bool = this.f5328Ujhhgtgfeyxiexzf;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.f5329Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("p11Proto(need_replace_nickname=");
        sb.append(this.f5328Ujhhgtgfeyxiexzf);
        sb.append(", replace_nickname=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5329Ujhhgtgfeyxiexzf, ')');
    }
}
