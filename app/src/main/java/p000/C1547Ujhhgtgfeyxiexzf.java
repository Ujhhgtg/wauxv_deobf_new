package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛴ能不能要点脸ᛳᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1547Ujhhgtgfeyxiexzf {
    public static final C1546Ujhhgtgfeyxiexzf Companion = new C1546Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1816Ujhhgtgfeyxiexzf f5348Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5350Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1547Ujhhgtgfeyxiexzf(int i, C1816Ujhhgtgfeyxiexzf c1816Ujhhgtgfeyxiexzf, Integer num, String str) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1513Ujhhgtgfeyxiexzf.f5295Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5348Ujhhgtgfeyxiexzf = c1816Ujhhgtgfeyxiexzf;
        this.f5349Ujhhgtgfeyxiexzf = num;
        this.f5350Ujhhgtgfeyxiexzf = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1547Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1547Ujhhgtgfeyxiexzf c1547Ujhhgtgfeyxiexzf = (C1547Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5348Ujhhgtgfeyxiexzf, c1547Ujhhgtgfeyxiexzf.f5348Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5349Ujhhgtgfeyxiexzf, c1547Ujhhgtgfeyxiexzf.f5349Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5350Ujhhgtgfeyxiexzf, c1547Ujhhgtgfeyxiexzf.f5350Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C1816Ujhhgtgfeyxiexzf c1816Ujhhgtgfeyxiexzf = this.f5348Ujhhgtgfeyxiexzf;
        int iHashCode = (c1816Ujhhgtgfeyxiexzf == null ? 0 : c1816Ujhhgtgfeyxiexzf.hashCode()) * 31;
        Integer num = this.f5349Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f5350Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("o61Proto(cdnTransInfo=");
        sb.append(this.f5348Ujhhgtgfeyxiexzf);
        sb.append(", bitRate=");
        sb.append(this.f5349Ujhhgtgfeyxiexzf);
        sb.append(", codingFormat=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5350Ujhhgtgfeyxiexzf, ')');
    }
}
