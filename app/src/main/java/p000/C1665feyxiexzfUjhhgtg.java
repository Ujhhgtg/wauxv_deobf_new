package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛴ能不能ᛳ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1665feyxiexzfUjhhgtg {
    public static final C1662feyxiexzfUjhhgtg Companion = new C1662feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5623Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Float f5624Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Float f5625Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1665feyxiexzfUjhhgtg(int i, String str, Float f, Float f2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1663feyxiexzfUjhhgtg.f5621Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5623Ujhhgtgfeyxiexzf = str;
        this.f5624Ujhhgtgfeyxiexzf = f;
        this.f5625Ujhhgtgfeyxiexzf = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665feyxiexzfUjhhgtg)) {
            return false;
        }
        C1665feyxiexzfUjhhgtg c1665feyxiexzfUjhhgtg = (C1665feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5623Ujhhgtgfeyxiexzf, c1665feyxiexzfUjhhgtg.f5623Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5624Ujhhgtgfeyxiexzf, c1665feyxiexzfUjhhgtg.f5624Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5625Ujhhgtgfeyxiexzf, c1665feyxiexzfUjhhgtg.f5625Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5623Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.f5624Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.f5625Ujhhgtgfeyxiexzf;
        return iHashCode2 + (f2 != null ? f2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928561305297618314L, strArr));
        sb.append(this.f5623Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928564775631193482L, strArr));
        sb.append(this.f5624Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928564719796618634L, strArr));
        sb.append(this.f5625Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
