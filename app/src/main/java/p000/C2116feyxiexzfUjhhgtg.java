package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱfeyxiexzfᛱᛳ能不能ᛱUjhhgtgᛱᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2116feyxiexzfUjhhgtg {
    public static final C2108feyxiexzfUjhhgtg Companion = new C2108feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final InterfaceC0058Ujhhgtgfeyxiexzf[] f6903Ujhhgtgfeyxiexzf = {AbstractC0217Ujhhgtgfeyxiexzf.m1333feyxiexzfUjhhgtg(new C0478Ujhhgtgfeyxiexzf(26)), null, null};

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final List f6904Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6905Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6906Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2116feyxiexzfUjhhgtg(int i, List list, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2109feyxiexzfUjhhgtg.f6887Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6904Ujhhgtgfeyxiexzf = list;
        this.f6905Ujhhgtgfeyxiexzf = str;
        this.f6906Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2116feyxiexzfUjhhgtg)) {
            return false;
        }
        C2116feyxiexzfUjhhgtg c2116feyxiexzfUjhhgtg = (C2116feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6904Ujhhgtgfeyxiexzf, c2116feyxiexzfUjhhgtg.f6904Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6905Ujhhgtgfeyxiexzf, c2116feyxiexzfUjhhgtg.f6905Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6906Ujhhgtgfeyxiexzf, c2116feyxiexzfUjhhgtg.f6906Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        List list = this.f6904Ujhhgtgfeyxiexzf;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.f6905Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6906Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928139337645688202L, strArr));
        sb.append(this.f6904Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928139475084641674L, strArr));
        sb.append(this.f6905Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928139526624249226L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6906Ujhhgtgfeyxiexzf, ')');
    }
}
