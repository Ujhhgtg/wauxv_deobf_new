package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2490feyxiexzfUjhhgtg extends AbstractC2485feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8128Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f8129Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f8130Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f8131Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int f8132Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final ViewOnClickListenerC3674feyxiexzfUjhhgtg f8133Ujhhgtgfeyxiexzf;

    public C2490feyxiexzfUjhhgtg(String str, String str2, int i, String str3, int i2, ViewOnClickListenerC3674feyxiexzfUjhhgtg viewOnClickListenerC3674feyxiexzfUjhhgtg) {
        this.f8128Ujhhgtgfeyxiexzf = str;
        this.f8129Ujhhgtgfeyxiexzf = str2;
        this.f8130Ujhhgtgfeyxiexzf = i;
        this.f8131Ujhhgtgfeyxiexzf = str3;
        this.f8132Ujhhgtgfeyxiexzf = i2;
        this.f8133Ujhhgtgfeyxiexzf = viewOnClickListenerC3674feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2490feyxiexzfUjhhgtg)) {
            return false;
        }
        C2490feyxiexzfUjhhgtg c2490feyxiexzfUjhhgtg = (C2490feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8128Ujhhgtgfeyxiexzf, c2490feyxiexzfUjhhgtg.f8128Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8129Ujhhgtgfeyxiexzf, c2490feyxiexzfUjhhgtg.f8129Ujhhgtgfeyxiexzf) && this.f8130Ujhhgtgfeyxiexzf == c2490feyxiexzfUjhhgtg.f8130Ujhhgtgfeyxiexzf && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8131Ujhhgtgfeyxiexzf, c2490feyxiexzfUjhhgtg.f8131Ujhhgtgfeyxiexzf) && this.f8132Ujhhgtgfeyxiexzf == c2490feyxiexzfUjhhgtg.f8132Ujhhgtgfeyxiexzf && this.f8133Ujhhgtgfeyxiexzf.equals(c2490feyxiexzfUjhhgtg.f8133Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        int iHashCode = this.f8128Ujhhgtgfeyxiexzf.hashCode() * 31;
        String str = this.f8129Ujhhgtgfeyxiexzf;
        return this.f8133Ujhhgtgfeyxiexzf.hashCode() + ((Integer.hashCode(this.f8132Ujhhgtgfeyxiexzf) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf((Integer.hashCode(this.f8130Ujhhgtgfeyxiexzf) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f8131Ujhhgtgfeyxiexzf)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("SearchResult(title=");
        sb.append(this.f8128Ujhhgtgfeyxiexzf);
        sb.append(", desc=");
        sb.append(this.f8129Ujhhgtgfeyxiexzf);
        sb.append(", tabPos=");
        sb.append(this.f8130Ujhhgtgfeyxiexzf);
        sb.append(", tabName=");
        sb.append(this.f8131Ujhhgtgfeyxiexzf);
        sb.append(", itemIndexInTab=");
        sb.append(this.f8132Ujhhgtgfeyxiexzf);
        sb.append(", onClick=");
        sb.append(this.f8133Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
