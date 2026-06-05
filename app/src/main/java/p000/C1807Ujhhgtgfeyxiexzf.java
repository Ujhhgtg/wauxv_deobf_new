package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛳ能不能ᛴᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1807Ujhhgtgfeyxiexzf {
    public static final C1811feyxiexzfUjhhgtg Companion = new C1811feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Long f6098Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f6099Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1807Ujhhgtgfeyxiexzf(int i, Long l, Long l2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1810Ujhhgtgfeyxiexzf.f6103Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6098Ujhhgtgfeyxiexzf = l;
        this.f6099Ujhhgtgfeyxiexzf = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1807Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1807Ujhhgtgfeyxiexzf c1807Ujhhgtgfeyxiexzf = (C1807Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6098Ujhhgtgfeyxiexzf, c1807Ujhhgtgfeyxiexzf.f6098Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6099Ujhhgtgfeyxiexzf, c1807Ujhhgtgfeyxiexzf.f6099Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Long l = this.f6098Ujhhgtgfeyxiexzf;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Long l2 = this.f6099Ujhhgtgfeyxiexzf;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928617955916252554L, strArr));
        sb.append(this.f6098Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928616955188872586L, strArr));
        sb.append(this.f6099Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
