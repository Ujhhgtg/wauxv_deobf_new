package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2106feyxiexzfUjhhgtg {
    public static final C2107feyxiexzfUjhhgtg Companion = new C2107feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6885Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6886Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2106feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2111feyxiexzfUjhhgtg.f6899Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6885Ujhhgtgfeyxiexzf = str;
        this.f6886Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2106feyxiexzfUjhhgtg)) {
            return false;
        }
        C2106feyxiexzfUjhhgtg c2106feyxiexzfUjhhgtg = (C2106feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6885Ujhhgtgfeyxiexzf, c2106feyxiexzfUjhhgtg.f6885Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6886Ujhhgtgfeyxiexzf, c2106feyxiexzfUjhhgtg.f6886Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6885Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6886Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("cq4Proto(pag_url=");
        sb.append(this.f6885Ujhhgtgfeyxiexzf);
        sb.append(", pag_md5=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6886Ujhhgtgfeyxiexzf, ')');
    }
}
