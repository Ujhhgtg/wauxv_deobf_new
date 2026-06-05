package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛳᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2134Ujhhgtgfeyxiexzf {
    public static final C2153feyxiexzfUjhhgtg Companion = new C2153feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6954Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6955Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2134Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2152Ujhhgtgfeyxiexzf.f7000Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6954Ujhhgtgfeyxiexzf = str;
        this.f6955Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2134Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2134Ujhhgtgfeyxiexzf c2134Ujhhgtgfeyxiexzf = (C2134Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6954Ujhhgtgfeyxiexzf, c2134Ujhhgtgfeyxiexzf.f6954Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6955Ujhhgtgfeyxiexzf, c2134Ujhhgtgfeyxiexzf.f6955Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6954Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f6955Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("f52Proto(template_id=");
        sb.append(this.f6954Ujhhgtgfeyxiexzf);
        sb.append(", template_type=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6955Ujhhgtgfeyxiexzf, ')');
    }
}
