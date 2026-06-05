package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ能不能ᛴᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3210feyxiexzfUjhhgtg {
    public static final C3209feyxiexzfUjhhgtg Companion = new C3209feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public Integer f9904Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public C3208feyxiexzfUjhhgtg f9905Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public String f9906Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public C3208feyxiexzfUjhhgtg f9907Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3210feyxiexzfUjhhgtg)) {
            return false;
        }
        C3210feyxiexzfUjhhgtg c3210feyxiexzfUjhhgtg = (C3210feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9904Ujhhgtgfeyxiexzf, c3210feyxiexzfUjhhgtg.f9904Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9905Ujhhgtgfeyxiexzf, c3210feyxiexzfUjhhgtg.f9905Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9906Ujhhgtgfeyxiexzf, c3210feyxiexzfUjhhgtg.f9906Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f9907Ujhhgtgfeyxiexzf, c3210feyxiexzfUjhhgtg.f9907Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f9904Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        C3208feyxiexzfUjhhgtg c3208feyxiexzfUjhhgtg = this.f9905Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c3208feyxiexzfUjhhgtg == null ? 0 : c3208feyxiexzfUjhhgtg.hashCode())) * 31;
        String str = this.f9906Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C3208feyxiexzfUjhhgtg c3208feyxiexzfUjhhgtg2 = this.f9907Ujhhgtgfeyxiexzf;
        return iHashCode3 + (c3208feyxiexzfUjhhgtg2 != null ? c3208feyxiexzfUjhhgtg2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("DisturbSetting(nightSetting=");
        sb.append(this.f9904Ujhhgtgfeyxiexzf);
        sb.append(", nightTime=");
        sb.append(this.f9905Ujhhgtgfeyxiexzf);
        sb.append(", allDaySetting=");
        sb.append(this.f9906Ujhhgtgfeyxiexzf);
        sb.append(", allDayTime=");
        sb.append(this.f9907Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
