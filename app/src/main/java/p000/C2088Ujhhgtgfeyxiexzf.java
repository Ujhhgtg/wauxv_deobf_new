package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2088Ujhhgtgfeyxiexzf {
    public static final C2089Ujhhgtgfeyxiexzf Companion = new C2089Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6851Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1652feyxiexzfUjhhgtg f6852Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f6853Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f6854Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2088Ujhhgtgfeyxiexzf(int i, String str, C1652feyxiexzfUjhhgtg c1652feyxiexzfUjhhgtg, Integer num, Integer num2) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C2093Ujhhgtgfeyxiexzf.f6864Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6851Ujhhgtgfeyxiexzf = str;
        this.f6852Ujhhgtgfeyxiexzf = c1652feyxiexzfUjhhgtg;
        this.f6853Ujhhgtgfeyxiexzf = num;
        this.f6854Ujhhgtgfeyxiexzf = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2088Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2088Ujhhgtgfeyxiexzf c2088Ujhhgtgfeyxiexzf = (C2088Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6851Ujhhgtgfeyxiexzf, c2088Ujhhgtgfeyxiexzf.f6851Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6852Ujhhgtgfeyxiexzf, c2088Ujhhgtgfeyxiexzf.f6852Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6853Ujhhgtgfeyxiexzf, c2088Ujhhgtgfeyxiexzf.f6853Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6854Ujhhgtgfeyxiexzf, c2088Ujhhgtgfeyxiexzf.f6854Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6851Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        C1652feyxiexzfUjhhgtg c1652feyxiexzfUjhhgtg = this.f6852Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c1652feyxiexzfUjhhgtg == null ? 0 : c1652feyxiexzfUjhhgtg.hashCode())) * 31;
        Integer num = this.f6853Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f6854Ujhhgtgfeyxiexzf;
        return iHashCode3 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928148679199557002L, strArr));
        sb.append(this.f6851Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928148709264328074L, strArr));
        sb.append(this.f6852Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928148872473085322L, strArr));
        sb.append(this.f6853Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928148958372431242L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6854Ujhhgtgfeyxiexzf, ')');
    }
}
