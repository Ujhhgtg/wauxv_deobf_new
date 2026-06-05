package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ要点脸能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1838feyxiexzfUjhhgtg {
    public static final C1837Ujhhgtgfeyxiexzf Companion = new C1837Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f6174Ujhhgtgfeyxiexzf = {AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C1795Ujhhgtgfeyxiexzf(3)), null, null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List f6175Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6176Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C1832feyxiexzfUjhhgtg f6177Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1838feyxiexzfUjhhgtg(int i, List list, Integer num, C1832feyxiexzfUjhhgtg c1832feyxiexzfUjhhgtg) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1836Ujhhgtgfeyxiexzf.f6173Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6175Ujhhgtgfeyxiexzf = list;
        this.f6176Ujhhgtgfeyxiexzf = num;
        this.f6177Ujhhgtgfeyxiexzf = c1832feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1838feyxiexzfUjhhgtg)) {
            return false;
        }
        C1838feyxiexzfUjhhgtg c1838feyxiexzfUjhhgtg = (C1838feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6175Ujhhgtgfeyxiexzf, c1838feyxiexzfUjhhgtg.f6175Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6176Ujhhgtgfeyxiexzf, c1838feyxiexzfUjhhgtg.f6176Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6177Ujhhgtgfeyxiexzf, c1838feyxiexzfUjhhgtg.f6177Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        List list = this.f6175Ujhhgtgfeyxiexzf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.f6176Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        C1832feyxiexzfUjhhgtg c1832feyxiexzfUjhhgtg = this.f6177Ujhhgtgfeyxiexzf;
        return iHashCode2 + (c1832feyxiexzfUjhhgtg != null ? c1832feyxiexzfUjhhgtg.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928616916534166922L, strArr));
        sb.append(this.f6175Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928615890036983178L, strArr));
        sb.append(this.f6176Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928615941576590730L, strArr));
        sb.append(this.f6177Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
