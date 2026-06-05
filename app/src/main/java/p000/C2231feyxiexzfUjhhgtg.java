package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2231feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f7265Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f7266Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2208Ujhhgtgfeyxiexzf f7267Ujhhgtgfeyxiexzf;

    public C2231feyxiexzfUjhhgtg(String str, String str2, C2208Ujhhgtgfeyxiexzf c2208Ujhhgtgfeyxiexzf) {
        this.f7265Ujhhgtgfeyxiexzf = str;
        this.f7266Ujhhgtgfeyxiexzf = str2;
        this.f7267Ujhhgtgfeyxiexzf = c2208Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2231feyxiexzfUjhhgtg)) {
            return false;
        }
        C2231feyxiexzfUjhhgtg c2231feyxiexzfUjhhgtg = (C2231feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7265Ujhhgtgfeyxiexzf, c2231feyxiexzfUjhhgtg.f7265Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7266Ujhhgtgfeyxiexzf, c2231feyxiexzfUjhhgtg.f7266Ujhhgtgfeyxiexzf) && this.f7267Ujhhgtgfeyxiexzf.equals(c2231feyxiexzfUjhhgtg.f7267Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f7267Ujhhgtgfeyxiexzf.hashCode() + ((Integer.hashCode(0) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(this.f7265Ujhhgtgfeyxiexzf.hashCode() * 31, 31, this.f7266Ujhhgtgfeyxiexzf)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("PrefItemBean(key=");
        sb.append(this.f7265Ujhhgtgfeyxiexzf);
        sb.append(", title=");
        sb.append(this.f7266Ujhhgtgfeyxiexzf);
        sb.append(", index=");
        sb.append(0);
        sb.append(", onClick=");
        sb.append(this.f7267Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
