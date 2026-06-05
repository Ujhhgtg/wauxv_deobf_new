package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴ能不能ᛳᛲᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0738Ujhhgtgfeyxiexzf {
    public static final C0737Ujhhgtgfeyxiexzf Companion = new C0737Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f3013Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f3014Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0738Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C0736Ujhhgtgfeyxiexzf.f3012Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f3013Ujhhgtgfeyxiexzf = num;
        this.f3014Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0738Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C0738Ujhhgtgfeyxiexzf c0738Ujhhgtgfeyxiexzf = (C0738Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f3013Ujhhgtgfeyxiexzf, c0738Ujhhgtgfeyxiexzf.f3013Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f3014Ujhhgtgfeyxiexzf, c0738Ujhhgtgfeyxiexzf.f3014Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f3013Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f3014Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("JSAPIBaseResp(errCode=");
        sb.append(this.f3013Ujhhgtgfeyxiexzf);
        sb.append(", errMsg=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f3014Ujhhgtgfeyxiexzf, ')');
    }
}
