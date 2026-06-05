package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛴ能不能ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1581Ujhhgtgfeyxiexzf {
    public static final C1578Ujhhgtgfeyxiexzf Companion = new C1578Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5432Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5433Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1581Ujhhgtgfeyxiexzf(int i, Integer num, String str) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1579Ujhhgtgfeyxiexzf.f5430Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5432Ujhhgtgfeyxiexzf = num;
        this.f5433Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1581Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1581Ujhhgtgfeyxiexzf c1581Ujhhgtgfeyxiexzf = (C1581Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5432Ujhhgtgfeyxiexzf, c1581Ujhhgtgfeyxiexzf.f5432Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5433Ujhhgtgfeyxiexzf, c1581Ujhhgtgfeyxiexzf.f5433Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5432Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f5433Ujhhgtgfeyxiexzf;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928095902641423754L, strArr));
        sb.append(this.f5432Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928095945591096714L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5433Ujhhgtgfeyxiexzf, ')');
    }
}
