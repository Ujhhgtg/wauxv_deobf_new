package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛱfeyxiexzfᛱ要点脸能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1505Ujhhgtgfeyxiexzf {
    public static final C1504Ujhhgtgfeyxiexzf Companion = new C1504Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5269Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5270Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Long f5271Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1505Ujhhgtgfeyxiexzf(int i, String str, Integer num, Long l) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1496Ujhhgtgfeyxiexzf.f5170Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5269Ujhhgtgfeyxiexzf = str;
        this.f5270Ujhhgtgfeyxiexzf = num;
        this.f5271Ujhhgtgfeyxiexzf = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1505Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1505Ujhhgtgfeyxiexzf c1505Ujhhgtgfeyxiexzf = (C1505Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5269Ujhhgtgfeyxiexzf, c1505Ujhhgtgfeyxiexzf.f5269Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5270Ujhhgtgfeyxiexzf, c1505Ujhhgtgfeyxiexzf.f5270Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5271Ujhhgtgfeyxiexzf, c1505Ujhhgtgfeyxiexzf.f5271Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5269Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5270Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f5271Ujhhgtgfeyxiexzf;
        return iHashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928069780650329482L, strArr));
        sb.append(this.f5269Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928069853664773514L, strArr));
        sb.append(this.f5270Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928069922384250250L, strArr));
        sb.append(this.f5271Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
