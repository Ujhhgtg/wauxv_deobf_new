package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ要点脸ᛳ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1589Ujhhgtgfeyxiexzf {
    public static final C1588Ujhhgtgfeyxiexzf Companion = new C1588Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5459Ujhhgtgfeyxiexzf = {null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(6)), null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5460Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f5461Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5462Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1589Ujhhgtgfeyxiexzf(int i, Integer num, List list, String str) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1580Ujhhgtgfeyxiexzf.f5431Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5460Ujhhgtgfeyxiexzf = num;
        this.f5461Ujhhgtgfeyxiexzf = list;
        this.f5462Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1589Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1589Ujhhgtgfeyxiexzf c1589Ujhhgtgfeyxiexzf = (C1589Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5460Ujhhgtgfeyxiexzf, c1589Ujhhgtgfeyxiexzf.f5460Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5461Ujhhgtgfeyxiexzf, c1589Ujhhgtgfeyxiexzf.f5461Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5462Ujhhgtgfeyxiexzf, c1589Ujhhgtgfeyxiexzf.f5462Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5460Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f5461Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.f5462Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928097461714552202L, strArr));
        sb.append(this.f5460Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928097530434028938L, strArr));
        sb.append(this.f5461Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928097629218276746L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5462Ujhhgtgfeyxiexzf, ')');
    }
}
