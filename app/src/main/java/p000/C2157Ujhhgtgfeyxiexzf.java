package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛴᛱUjhhgtgᛱᛳ能不能ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2157Ujhhgtgfeyxiexzf {
    public static final C2154Ujhhgtgfeyxiexzf Companion = new C2154Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f7003Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f7004Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2130Ujhhgtgfeyxiexzf f7005Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2157Ujhhgtgfeyxiexzf(int i, Integer num, String str, C2130Ujhhgtgfeyxiexzf c2130Ujhhgtgfeyxiexzf) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2155Ujhhgtgfeyxiexzf.f7001Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f7003Ujhhgtgfeyxiexzf = num;
        this.f7004Ujhhgtgfeyxiexzf = str;
        this.f7005Ujhhgtgfeyxiexzf = c2130Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2157Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2157Ujhhgtgfeyxiexzf c2157Ujhhgtgfeyxiexzf = (C2157Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7003Ujhhgtgfeyxiexzf, c2157Ujhhgtgfeyxiexzf.f7003Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7004Ujhhgtgfeyxiexzf, c2157Ujhhgtgfeyxiexzf.f7004Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7005Ujhhgtgfeyxiexzf, c2157Ujhhgtgfeyxiexzf.f7005Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f7003Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.f7004Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        C2130Ujhhgtgfeyxiexzf c2130Ujhhgtgfeyxiexzf = this.f7005Ujhhgtgfeyxiexzf;
        return iHashCode2 + (c2130Ujhhgtgfeyxiexzf != null ? c2130Ujhhgtgfeyxiexzf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("gm1Proto(anchor_shop_tag=");
        sb.append(this.f7003Ujhhgtgfeyxiexzf);
        sb.append(", anchor_shop_tag_url=");
        sb.append(this.f7004Ujhhgtgfeyxiexzf);
        sb.append(", lite_app_info=");
        sb.append(this.f7005Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
