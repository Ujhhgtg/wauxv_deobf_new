package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛴ要点脸ᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1551Ujhhgtgfeyxiexzf {
    public static final C1548Ujhhgtgfeyxiexzf Companion = new C1548Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2098Ujhhgtgfeyxiexzf f5353Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5354Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5355Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f5356Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Integer f5357Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1551Ujhhgtgfeyxiexzf(int i, C2098Ujhhgtgfeyxiexzf c2098Ujhhgtgfeyxiexzf, Integer num, String str, Integer num2, Integer num3) {
        if (31 != (i & 31)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 31, C1549Ujhhgtgfeyxiexzf.f5351Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5353Ujhhgtgfeyxiexzf = c2098Ujhhgtgfeyxiexzf;
        this.f5354Ujhhgtgfeyxiexzf = num;
        this.f5355Ujhhgtgfeyxiexzf = str;
        this.f5356Ujhhgtgfeyxiexzf = num2;
        this.f5357Ujhhgtgfeyxiexzf = num3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1551Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1551Ujhhgtgfeyxiexzf c1551Ujhhgtgfeyxiexzf = (C1551Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5353Ujhhgtgfeyxiexzf, c1551Ujhhgtgfeyxiexzf.f5353Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5354Ujhhgtgfeyxiexzf, c1551Ujhhgtgfeyxiexzf.f5354Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5355Ujhhgtgfeyxiexzf, c1551Ujhhgtgfeyxiexzf.f5355Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5356Ujhhgtgfeyxiexzf, c1551Ujhhgtgfeyxiexzf.f5356Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5357Ujhhgtgfeyxiexzf, c1551Ujhhgtgfeyxiexzf.f5357Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C2098Ujhhgtgfeyxiexzf c2098Ujhhgtgfeyxiexzf = this.f5353Ujhhgtgfeyxiexzf;
        int iHashCode = (c2098Ujhhgtgfeyxiexzf == null ? 0 : c2098Ujhhgtgfeyxiexzf.hashCode()) * 31;
        Integer num = this.f5354Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f5355Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.f5356Ujhhgtgfeyxiexzf;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5357Ujhhgtgfeyxiexzf;
        return iHashCode4 + (num3 != null ? num3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("or5Proto(tmpl_version_info=");
        sb.append(this.f5353Ujhhgtgfeyxiexzf);
        sb.append(", tmpl_type=");
        sb.append(this.f5354Ujhhgtgfeyxiexzf);
        sb.append(", camera_tmpl_id=");
        sb.append(this.f5355Ujhhgtgfeyxiexzf);
        sb.append(", permitted_publish_method_flag=");
        sb.append(this.f5356Ujhhgtgfeyxiexzf);
        sb.append(", camera_position=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5357Ujhhgtgfeyxiexzf, ')');
    }
}
