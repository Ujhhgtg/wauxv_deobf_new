package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1557Ujhhgtgfeyxiexzf {
    public static final C1554Ujhhgtgfeyxiexzf Companion = new C1554Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5361Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5362Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1557Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1555Ujhhgtgfeyxiexzf.f5359Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5361Ujhhgtgfeyxiexzf = num;
        this.f5362Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1557Ujhhgtgfeyxiexzf c1557Ujhhgtgfeyxiexzf = (C1557Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5361Ujhhgtgfeyxiexzf, c1557Ujhhgtgfeyxiexzf.f5361Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5362Ujhhgtgfeyxiexzf, c1557Ujhhgtgfeyxiexzf.f5362Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5361Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5362Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("k71Proto(effect_type=");
        sb.append(this.f5361Ujhhgtgfeyxiexzf);
        sb.append(", effect_text=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5362Ujhhgtgfeyxiexzf, ')');
    }
}
