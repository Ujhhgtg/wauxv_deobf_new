package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1626feyxiexzfUjhhgtg {
    public static final C1630feyxiexzfUjhhgtg Companion = new C1630feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5558Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5559Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5560Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f5561Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1626feyxiexzfUjhhgtg(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1631feyxiexzfUjhhgtg.f5566Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5558Ujhhgtgfeyxiexzf = str;
        this.f5559Ujhhgtgfeyxiexzf = num;
        this.f5560Ujhhgtgfeyxiexzf = num2;
        this.f5561Ujhhgtgfeyxiexzf = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1626feyxiexzfUjhhgtg)) {
            return false;
        }
        C1626feyxiexzfUjhhgtg c1626feyxiexzfUjhhgtg = (C1626feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5558Ujhhgtgfeyxiexzf, c1626feyxiexzfUjhhgtg.f5558Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5559Ujhhgtgfeyxiexzf, c1626feyxiexzfUjhhgtg.f5559Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5560Ujhhgtgfeyxiexzf, c1626feyxiexzfUjhhgtg.f5560Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5561Ujhhgtgfeyxiexzf, c1626feyxiexzfUjhhgtg.f5561Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5558Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f5559Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f5560Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5561Ujhhgtgfeyxiexzf;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("vo1Proto(stream_url=");
        sb.append(this.f5558Ujhhgtgfeyxiexzf);
        sb.append(", time_limit=");
        sb.append(this.f5559Ujhhgtgfeyxiexzf);
        sb.append(", remain_time=");
        sb.append(this.f5560Ujhhgtgfeyxiexzf);
        sb.append(", end_time=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5561Ujhhgtgfeyxiexzf, ')');
    }
}
