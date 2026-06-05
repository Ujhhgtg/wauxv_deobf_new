package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ要点脸能不能ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1600Ujhhgtgfeyxiexzf {
    public static final C1599Ujhhgtgfeyxiexzf Companion = new C1599Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f5486Ujhhgtgfeyxiexzf = {AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C2133Ujhhgtgfeyxiexzf(5)), null, null, null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List f5487Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f5488Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5489Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Long f5490Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1600Ujhhgtgfeyxiexzf(int i, List list, Long l, Integer num, Long l2) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1598Ujhhgtgfeyxiexzf.f5485Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5487Ujhhgtgfeyxiexzf = list;
        this.f5488Ujhhgtgfeyxiexzf = l;
        this.f5489Ujhhgtgfeyxiexzf = num;
        this.f5490Ujhhgtgfeyxiexzf = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1600Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1600Ujhhgtgfeyxiexzf c1600Ujhhgtgfeyxiexzf = (C1600Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5487Ujhhgtgfeyxiexzf, c1600Ujhhgtgfeyxiexzf.f5487Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5488Ujhhgtgfeyxiexzf, c1600Ujhhgtgfeyxiexzf.f5488Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5489Ujhhgtgfeyxiexzf, c1600Ujhhgtgfeyxiexzf.f5489Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5490Ujhhgtgfeyxiexzf, c1600Ujhhgtgfeyxiexzf.f5490Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        List list = this.f5487Ujhhgtgfeyxiexzf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Long l = this.f5488Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.f5489Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.f5490Ujhhgtgfeyxiexzf;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928094511072019850L, strArr));
        sb.append(this.f5487Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928094571201561994L, strArr));
        sb.append(this.f5488Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928094635626071434L, strArr));
        sb.append(this.f5489Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928093630603724170L, strArr));
        sb.append(this.f5490Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
