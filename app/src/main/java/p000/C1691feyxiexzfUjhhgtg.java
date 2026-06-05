package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ能不能ᛴ要点脸ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1691feyxiexzfUjhhgtg {
    public static final C1690feyxiexzfUjhhgtg Companion = new C1690feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5675Ujhhgtgfeyxiexzf = {null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(17))};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5676Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f5677Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1691feyxiexzfUjhhgtg(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1682feyxiexzfUjhhgtg.f5649Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5676Ujhhgtgfeyxiexzf = num;
        this.f5677Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1691feyxiexzfUjhhgtg)) {
            return false;
        }
        C1691feyxiexzfUjhhgtg c1691feyxiexzfUjhhgtg = (C1691feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5676Ujhhgtgfeyxiexzf, c1691feyxiexzfUjhhgtg.f5676Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5677Ujhhgtgfeyxiexzf, c1691feyxiexzfUjhhgtg.f5677Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5676Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f5677Ujhhgtgfeyxiexzf;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928115908599088522L, strArr));
        sb.append(this.f5676Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928115960138696074L, strArr));
        sb.append(this.f5677Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
