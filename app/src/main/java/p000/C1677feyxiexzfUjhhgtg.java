package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ能不能ᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1677feyxiexzfUjhhgtg {
    public static final C1674feyxiexzfUjhhgtg Companion = new C1674feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5643Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5644Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f5645Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1677feyxiexzfUjhhgtg(int i, String str, String str2, Long l) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1675feyxiexzfUjhhgtg.f5641Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5643Ujhhgtgfeyxiexzf = str;
        this.f5644Ujhhgtgfeyxiexzf = str2;
        this.f5645Ujhhgtgfeyxiexzf = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1677feyxiexzfUjhhgtg)) {
            return false;
        }
        C1677feyxiexzfUjhhgtg c1677feyxiexzfUjhhgtg = (C1677feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5643Ujhhgtgfeyxiexzf, c1677feyxiexzfUjhhgtg.f5643Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5644Ujhhgtgfeyxiexzf, c1677feyxiexzfUjhhgtg.f5644Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5645Ujhhgtgfeyxiexzf, c1677feyxiexzfUjhhgtg.f5645Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5643Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5644Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f5645Ujhhgtgfeyxiexzf;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("qh1Proto(session_id=");
        sb.append(this.f5643Ujhhgtgfeyxiexzf);
        sb.append(", vroom_id=");
        sb.append(this.f5644Ujhhgtgfeyxiexzf);
        sb.append(", vroom_id_version=");
        sb.append(this.f5645Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
