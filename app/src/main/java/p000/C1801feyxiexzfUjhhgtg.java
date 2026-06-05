package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1801feyxiexzfUjhhgtg {
    public static final C1805feyxiexzfUjhhgtg Companion = new C1805feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6072Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2106feyxiexzfUjhhgtg f6073Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2106feyxiexzfUjhhgtg f6074Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1801feyxiexzfUjhhgtg(int i, String str, C2106feyxiexzfUjhhgtg c2106feyxiexzfUjhhgtg, C2106feyxiexzfUjhhgtg c2106feyxiexzfUjhhgtg2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1804feyxiexzfUjhhgtg.f6096Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6072Ujhhgtgfeyxiexzf = str;
        this.f6073Ujhhgtgfeyxiexzf = c2106feyxiexzfUjhhgtg;
        this.f6074Ujhhgtgfeyxiexzf = c2106feyxiexzfUjhhgtg2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1801feyxiexzfUjhhgtg)) {
            return false;
        }
        C1801feyxiexzfUjhhgtg c1801feyxiexzfUjhhgtg = (C1801feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6072Ujhhgtgfeyxiexzf, c1801feyxiexzfUjhhgtg.f6072Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6073Ujhhgtgfeyxiexzf, c1801feyxiexzfUjhhgtg.f6073Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6074Ujhhgtgfeyxiexzf, c1801feyxiexzfUjhhgtg.f6074Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6072Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C2106feyxiexzfUjhhgtg c2106feyxiexzfUjhhgtg = this.f6073Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c2106feyxiexzfUjhhgtg == null ? 0 : c2106feyxiexzfUjhhgtg.hashCode())) * 31;
        C2106feyxiexzfUjhhgtg c2106feyxiexzfUjhhgtg2 = this.f6074Ujhhgtgfeyxiexzf;
        return iHashCode2 + (c2106feyxiexzfUjhhgtg2 != null ? c2106feyxiexzfUjhhgtg2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("xo3Proto(animation_id=");
        sb.append(this.f6072Ujhhgtgfeyxiexzf);
        sb.append(", animation=");
        sb.append(this.f6073Ujhhgtgfeyxiexzf);
        sb.append(", landscape_animation=");
        sb.append(this.f6074Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
