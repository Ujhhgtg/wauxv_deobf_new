package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1999feyxiexzfUjhhgtg {
    public static final C2003feyxiexzfUjhhgtg Companion = new C2003feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f6585Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6586Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1999feyxiexzfUjhhgtg(int i, Integer num, Integer num2) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2002feyxiexzfUjhhgtg.f6594Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6585Ujhhgtgfeyxiexzf = num;
        this.f6586Ujhhgtgfeyxiexzf = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1999feyxiexzfUjhhgtg)) {
            return false;
        }
        C1999feyxiexzfUjhhgtg c1999feyxiexzfUjhhgtg = (C1999feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6585Ujhhgtgfeyxiexzf, c1999feyxiexzfUjhhgtg.f6585Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6586Ujhhgtgfeyxiexzf, c1999feyxiexzfUjhhgtg.f6586Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f6585Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f6586Ujhhgtgfeyxiexzf;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928156689313564042L, strArr));
        sb.append(this.f6585Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928160219776681354L, strArr));
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f6586Ujhhgtgfeyxiexzf, ')');
    }
}
