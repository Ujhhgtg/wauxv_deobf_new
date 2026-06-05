package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛴᛳ能不能ᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1538Ujhhgtgfeyxiexzf {
    public static final C1539Ujhhgtgfeyxiexzf Companion = new C1539Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5341Ujhhgtgfeyxiexzf = {null, AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(15))};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5342Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f5343Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1538Ujhhgtgfeyxiexzf(int i, Integer num, List list) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1531Ujhhgtgfeyxiexzf.f5327Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5342Ujhhgtgfeyxiexzf = num;
        this.f5343Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1538Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1538Ujhhgtgfeyxiexzf c1538Ujhhgtgfeyxiexzf = (C1538Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5342Ujhhgtgfeyxiexzf, c1538Ujhhgtgfeyxiexzf.f5342Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5343Ujhhgtgfeyxiexzf, c1538Ujhhgtgfeyxiexzf.f5343Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5342Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f5343Ujhhgtgfeyxiexzf;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928124936620344714L, strArr));
        sb.append(this.f5342Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928125078354265482L, strArr));
        sb.append(this.f5343Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
