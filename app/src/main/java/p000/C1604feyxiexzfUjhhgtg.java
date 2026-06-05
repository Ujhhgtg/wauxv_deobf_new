package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ能不能ᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1604feyxiexzfUjhhgtg {
    public static final C1605feyxiexzfUjhhgtg Companion = new C1605feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5499Ujhhgtgfeyxiexzf = {null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(22))};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5500Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f5501Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1604feyxiexzfUjhhgtg(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1622feyxiexzfUjhhgtg.f5546Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5500Ujhhgtgfeyxiexzf = num;
        this.f5501Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1604feyxiexzfUjhhgtg)) {
            return false;
        }
        C1604feyxiexzfUjhhgtg c1604feyxiexzfUjhhgtg = (C1604feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5500Ujhhgtgfeyxiexzf, c1604feyxiexzfUjhhgtg.f5500Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5501Ujhhgtgfeyxiexzf, c1604feyxiexzfUjhhgtg.f5501Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5500Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f5501Ujhhgtgfeyxiexzf;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("u51Proto(current_extra_times_multi_100=");
        sb.append(this.f5500Ujhhgtgfeyxiexzf);
        sb.append(", extra_items=");
        sb.append(this.f5501Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
