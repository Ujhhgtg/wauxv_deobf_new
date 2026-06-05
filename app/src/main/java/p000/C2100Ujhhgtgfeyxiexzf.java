package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2100Ujhhgtgfeyxiexzf {
    public static final C2201feyxiexzfUjhhgtg Companion = new C2201feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6876Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6877Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f6878Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f6879Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2100Ujhhgtgfeyxiexzf(int i, String str, Integer num, Integer num2, Integer num3) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C2200Ujhhgtgfeyxiexzf.f7165Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6876Ujhhgtgfeyxiexzf = str;
        this.f6877Ujhhgtgfeyxiexzf = num;
        this.f6878Ujhhgtgfeyxiexzf = num2;
        this.f6879Ujhhgtgfeyxiexzf = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2100Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2100Ujhhgtgfeyxiexzf c2100Ujhhgtgfeyxiexzf = (C2100Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6876Ujhhgtgfeyxiexzf, c2100Ujhhgtgfeyxiexzf.f6876Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6877Ujhhgtgfeyxiexzf, c2100Ujhhgtgfeyxiexzf.f6877Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6878Ujhhgtgfeyxiexzf, c2100Ujhhgtgfeyxiexzf.f6878Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6879Ujhhgtgfeyxiexzf, c2100Ujhhgtgfeyxiexzf.f6879Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6876Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f6877Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6878Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f6879Ujhhgtgfeyxiexzf;
        return iHashCode3 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("a23Proto(gift_id=");
        sb.append(this.f6876Ujhhgtgfeyxiexzf);
        sb.append(", max_size=");
        sb.append(this.f6877Ujhhgtgfeyxiexzf);
        sb.append(", curr_size=");
        sb.append(this.f6878Ujhhgtgfeyxiexzf);
        sb.append(", indicator_type=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6879Ujhhgtgfeyxiexzf, ')');
    }
}
