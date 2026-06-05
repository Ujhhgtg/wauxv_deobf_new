package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛴᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2034Ujhhgtgfeyxiexzf {
    public static final C2035Ujhhgtgfeyxiexzf Companion = new C2035Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6673Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6674Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6675Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2034Ujhhgtgfeyxiexzf(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2039Ujhhgtgfeyxiexzf.f6683Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6673Ujhhgtgfeyxiexzf = str;
        this.f6674Ujhhgtgfeyxiexzf = str2;
        this.f6675Ujhhgtgfeyxiexzf = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2034Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2034Ujhhgtgfeyxiexzf c2034Ujhhgtgfeyxiexzf = (C2034Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6673Ujhhgtgfeyxiexzf, c2034Ujhhgtgfeyxiexzf.f6673Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6674Ujhhgtgfeyxiexzf, c2034Ujhhgtgfeyxiexzf.f6674Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6675Ujhhgtgfeyxiexzf, c2034Ujhhgtgfeyxiexzf.f6675Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6673Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6674Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6675Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("LiteappInfoProto(appId=");
        sb.append(this.f6673Ujhhgtgfeyxiexzf);
        sb.append(", path=");
        sb.append(this.f6674Ujhhgtgfeyxiexzf);
        sb.append(", query=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6675Ujhhgtgfeyxiexzf, ')');
    }
}
