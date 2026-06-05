package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2124feyxiexzfUjhhgtg {
    public static final C2096Ujhhgtgfeyxiexzf Companion = new C2096Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6935Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6936Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2124feyxiexzfUjhhgtg(int i, String str, String str2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2097Ujhhgtgfeyxiexzf.f6870Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6935Ujhhgtgfeyxiexzf = str;
        this.f6936Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2124feyxiexzfUjhhgtg)) {
            return false;
        }
        C2124feyxiexzfUjhhgtg c2124feyxiexzfUjhhgtg = (C2124feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6935Ujhhgtgfeyxiexzf, c2124feyxiexzfUjhhgtg.f6935Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6936Ujhhgtgfeyxiexzf, c2124feyxiexzfUjhhgtg.f6936Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6935Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6936Ujhhgtgfeyxiexzf;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928150380006606218L, strArr));
        sb.append(this.f6935Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928150457316017546L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6936Ujhhgtgfeyxiexzf, ')');
    }
}
