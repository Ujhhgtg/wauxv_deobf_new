package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1632feyxiexzfUjhhgtg {
    public static final C1636feyxiexzfUjhhgtg Companion = new C1636feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Integer f5567Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5568Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5569Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f5570Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1632feyxiexzfUjhhgtg(int i, Integer num, Integer num2, Integer num3, Integer num4) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1637feyxiexzfUjhhgtg.f5574Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5567Ujhhgtgfeyxiexzf = num;
        this.f5568Ujhhgtgfeyxiexzf = num2;
        this.f5569Ujhhgtgfeyxiexzf = num3;
        this.f5570Ujhhgtgfeyxiexzf = num4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1632feyxiexzfUjhhgtg)) {
            return false;
        }
        C1632feyxiexzfUjhhgtg c1632feyxiexzfUjhhgtg = (C1632feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5567Ujhhgtgfeyxiexzf, c1632feyxiexzfUjhhgtg.f5567Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5568Ujhhgtgfeyxiexzf, c1632feyxiexzfUjhhgtg.f5568Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5569Ujhhgtgfeyxiexzf, c1632feyxiexzfUjhhgtg.f5569Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5570Ujhhgtgfeyxiexzf, c1632feyxiexzfUjhhgtg.f5570Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Integer num = this.f5567Ujhhgtgfeyxiexzf;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f5568Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f5569Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f5570Ujhhgtgfeyxiexzf;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("vq5Proto(d=");
        sb.append(this.f5567Ujhhgtgfeyxiexzf);
        sb.append(", e=");
        sb.append(this.f5568Ujhhgtgfeyxiexzf);
        sb.append(", f=");
        sb.append(this.f5569Ujhhgtgfeyxiexzf);
        sb.append(", g=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5570Ujhhgtgfeyxiexzf, ')');
    }
}
