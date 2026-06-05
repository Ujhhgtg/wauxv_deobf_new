package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1512Ujhhgtgfeyxiexzf {
    public static final C1516Ujhhgtgfeyxiexzf Companion = new C1516Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5292Ujhhgtgfeyxiexzf = {null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(14))};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2124feyxiexzfUjhhgtg f5293Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f5294Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1512Ujhhgtgfeyxiexzf(int i, C2124feyxiexzfUjhhgtg c2124feyxiexzfUjhhgtg, List list) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1517Ujhhgtgfeyxiexzf.f5302Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5293Ujhhgtgfeyxiexzf = c2124feyxiexzfUjhhgtg;
        this.f5294Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1512Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1512Ujhhgtgfeyxiexzf c1512Ujhhgtgfeyxiexzf = (C1512Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5293Ujhhgtgfeyxiexzf, c1512Ujhhgtgfeyxiexzf.f5293Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5294Ujhhgtgfeyxiexzf, c1512Ujhhgtgfeyxiexzf.f5294Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C2124feyxiexzfUjhhgtg c2124feyxiexzfUjhhgtg = this.f5293Ujhhgtgfeyxiexzf;
        int iHashCode = (c2124feyxiexzfUjhhgtg == null ? 0 : c2124feyxiexzfUjhhgtg.hashCode()) * 31;
        List list = this.f5294Ujhhgtgfeyxiexzf;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("o5Proto(music=");
        sb.append(this.f5293Ujhhgtgfeyxiexzf);
        sb.append(", vibratio_meta_info_list=");
        sb.append(this.f5294Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
