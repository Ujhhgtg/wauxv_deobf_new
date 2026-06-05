package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2755feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final int f8728Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f8729Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3545feyxiexzfUjhhgtg f8730Ujhhgtgfeyxiexzf;

    public C2755feyxiexzfUjhhgtg(int i, String str, InterfaceC3545feyxiexzfUjhhgtg interfaceC3545feyxiexzfUjhhgtg) {
        this.f8728Ujhhgtgfeyxiexzf = i;
        this.f8729Ujhhgtgfeyxiexzf = str;
        this.f8730Ujhhgtgfeyxiexzf = interfaceC3545feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2755feyxiexzfUjhhgtg)) {
            return false;
        }
        C2755feyxiexzfUjhhgtg c2755feyxiexzfUjhhgtg = (C2755feyxiexzfUjhhgtg) obj;
        return this.f8728Ujhhgtgfeyxiexzf == c2755feyxiexzfUjhhgtg.f8728Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8729Ujhhgtgfeyxiexzf, c2755feyxiexzfUjhhgtg.f8729Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8730Ujhhgtgfeyxiexzf, c2755feyxiexzfUjhhgtg.f8730Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f8730Ujhhgtgfeyxiexzf.hashCode() + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(Integer.hashCode(this.f8728Ujhhgtgfeyxiexzf) * 31, 31, this.f8729Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("MenuBean(iconId=");
        sb.append(this.f8728Ujhhgtgfeyxiexzf);
        sb.append(", title=");
        sb.append(this.f8729Ujhhgtgfeyxiexzf);
        sb.append(", onClick=");
        sb.append(this.f8730Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
