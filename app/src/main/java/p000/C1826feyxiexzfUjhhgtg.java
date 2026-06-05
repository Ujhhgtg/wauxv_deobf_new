package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1826feyxiexzfUjhhgtg {
    public static final C1827feyxiexzfUjhhgtg Companion = new C1827feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f6149Ujhhgtgfeyxiexzf = {AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C1795Ujhhgtgfeyxiexzf(4)), null, null, null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List f6150Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1499Ujhhgtgfeyxiexzf f6151Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f6152Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f6153Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1826feyxiexzfUjhhgtg(int i, List list, C1499Ujhhgtgfeyxiexzf c1499Ujhhgtgfeyxiexzf, Integer num, String str) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1824feyxiexzfUjhhgtg.f6146Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6150Ujhhgtgfeyxiexzf = list;
        this.f6151Ujhhgtgfeyxiexzf = c1499Ujhhgtgfeyxiexzf;
        this.f6152Ujhhgtgfeyxiexzf = num;
        this.f6153Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1826feyxiexzfUjhhgtg)) {
            return false;
        }
        C1826feyxiexzfUjhhgtg c1826feyxiexzfUjhhgtg = (C1826feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6150Ujhhgtgfeyxiexzf, c1826feyxiexzfUjhhgtg.f6150Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6151Ujhhgtgfeyxiexzf, c1826feyxiexzfUjhhgtg.f6151Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6152Ujhhgtgfeyxiexzf, c1826feyxiexzfUjhhgtg.f6152Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6153Ujhhgtgfeyxiexzf, c1826feyxiexzfUjhhgtg.f6153Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        List list = this.f6150Ujhhgtgfeyxiexzf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        C1499Ujhhgtgfeyxiexzf c1499Ujhhgtgfeyxiexzf = this.f6151Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c1499Ujhhgtgfeyxiexzf == null ? 0 : c1499Ujhhgtgfeyxiexzf.hashCode())) * 31;
        Integer num = this.f6152Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f6153Ujhhgtgfeyxiexzf;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("ze1Proto(cdnTransInfo=");
        sb.append(this.f6150Ujhhgtgfeyxiexzf);
        sb.append(", anchor_video_params=");
        sb.append(this.f6151Ujhhgtgfeyxiexzf);
        sb.append(", audience_cdn_quality_cfg=");
        sb.append(this.f6152Ujhhgtgfeyxiexzf);
        sb.append(", audience_cdn_url=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6153Ujhhgtgfeyxiexzf, ')');
    }
}
