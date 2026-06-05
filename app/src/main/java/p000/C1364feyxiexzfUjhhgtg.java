package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛲᛴᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1364feyxiexzfUjhhgtg {
    public static final C1365feyxiexzfUjhhgtg Companion = new C1365feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f4844Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f4845Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final int f4846Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f4847Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1364feyxiexzfUjhhgtg(int i, String str, String str2, int i2, boolean z) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1362feyxiexzfUjhhgtg.f4840Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f4844Ujhhgtgfeyxiexzf = str;
        this.f4845Ujhhgtgfeyxiexzf = str2;
        this.f4846Ujhhgtgfeyxiexzf = i2;
        if ((i & 8) == 0) {
            this.f4847Ujhhgtgfeyxiexzf = true;
        } else {
            this.f4847Ujhhgtgfeyxiexzf = z;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C1364feyxiexzfUjhhgtg m2869Ujhhgtgfeyxiexzf(C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg, String str, int i, boolean z, int i2) {
        String str2 = c1364feyxiexzfUjhhgtg.f4844Ujhhgtgfeyxiexzf;
        if ((i2 & 2) != 0) {
            str = c1364feyxiexzfUjhhgtg.f4845Ujhhgtgfeyxiexzf;
        }
        if ((i2 & 4) != 0) {
            i = c1364feyxiexzfUjhhgtg.f4846Ujhhgtgfeyxiexzf;
        }
        if ((i2 & 8) != 0) {
            z = c1364feyxiexzfUjhhgtg.f4847Ujhhgtgfeyxiexzf;
        }
        c1364feyxiexzfUjhhgtg.getClass();
        return new C1364feyxiexzfUjhhgtg(str2, str, i, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1364feyxiexzfUjhhgtg)) {
            return false;
        }
        C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg = (C1364feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4844Ujhhgtgfeyxiexzf, c1364feyxiexzfUjhhgtg.f4844Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4845Ujhhgtgfeyxiexzf, c1364feyxiexzfUjhhgtg.f4845Ujhhgtgfeyxiexzf) && this.f4846Ujhhgtgfeyxiexzf == c1364feyxiexzfUjhhgtg.f4846Ujhhgtgfeyxiexzf && this.f4847Ujhhgtgfeyxiexzf == c1364feyxiexzfUjhhgtg.f4847Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4847Ujhhgtgfeyxiexzf) + ((Integer.hashCode(this.f4846Ujhhgtgfeyxiexzf) + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(this.f4844Ujhhgtgfeyxiexzf.hashCode() * 31, 31, this.f4845Ujhhgtgfeyxiexzf)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928403452364588426L, strArr));
        sb.append(this.f4844Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928403594098509194L, strArr));
        sb.append(this.f4845Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928402593371129226L, strArr));
        sb.append(this.f4846Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928402554716423562L, strArr));
        sb.append(this.f4847Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }

    public C1364feyxiexzfUjhhgtg(String str, String str2, int i, boolean z) {
        this.f4844Ujhhgtgfeyxiexzf = str;
        this.f4845Ujhhgtgfeyxiexzf = str2;
        this.f4846Ujhhgtgfeyxiexzf = i;
        this.f4847Ujhhgtgfeyxiexzf = z;
    }
}
