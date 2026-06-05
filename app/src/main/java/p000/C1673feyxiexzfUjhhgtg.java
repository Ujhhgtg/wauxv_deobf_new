package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛴ要点脸能不能ᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1673feyxiexzfUjhhgtg {
    public static final C1672feyxiexzfUjhhgtg Companion = new C1672feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5638Ujhhgtgfeyxiexzf = {AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(26)), null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List f5639Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5640Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1673feyxiexzfUjhhgtg(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1664feyxiexzfUjhhgtg.f5622Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5639Ujhhgtgfeyxiexzf = list;
        this.f5640Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1673feyxiexzfUjhhgtg)) {
            return false;
        }
        C1673feyxiexzfUjhhgtg c1673feyxiexzfUjhhgtg = (C1673feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5639Ujhhgtgfeyxiexzf, c1673feyxiexzfUjhhgtg.f5639Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5640Ujhhgtgfeyxiexzf, c1673feyxiexzfUjhhgtg.f5640Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        List list = this.f5639Ujhhgtgfeyxiexzf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f5640Ujhhgtgfeyxiexzf;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928564294594856330L, strArr));
        sb.append(this.f5639Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928564320364660106L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5640Ujhhgtgfeyxiexzf, ')');
    }
}
