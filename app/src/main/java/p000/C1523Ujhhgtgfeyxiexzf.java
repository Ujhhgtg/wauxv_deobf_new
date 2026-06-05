package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱᛳ能不能要点脸ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1523Ujhhgtgfeyxiexzf {
    public static final C1522Ujhhgtgfeyxiexzf Companion = new C1522Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Boolean f5306Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2181Ujhhgtgfeyxiexzf f5307Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5308Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1523Ujhhgtgfeyxiexzf(int i, Boolean bool, C2181Ujhhgtgfeyxiexzf c2181Ujhhgtgfeyxiexzf, Integer num) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1489Ujhhgtgfeyxiexzf.f5165Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5306Ujhhgtgfeyxiexzf = bool;
        this.f5307Ujhhgtgfeyxiexzf = c2181Ujhhgtgfeyxiexzf;
        this.f5308Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1523Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1523Ujhhgtgfeyxiexzf c1523Ujhhgtgfeyxiexzf = (C1523Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5306Ujhhgtgfeyxiexzf, c1523Ujhhgtgfeyxiexzf.f5306Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5307Ujhhgtgfeyxiexzf, c1523Ujhhgtgfeyxiexzf.f5307Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5308Ujhhgtgfeyxiexzf, c1523Ujhhgtgfeyxiexzf.f5308Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Boolean bool = this.f5306Ujhhgtgfeyxiexzf;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        C2181Ujhhgtgfeyxiexzf c2181Ujhhgtgfeyxiexzf = this.f5307Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c2181Ujhhgtgfeyxiexzf == null ? 0 : c2181Ujhhgtgfeyxiexzf.hashCode())) * 31;
        Integer num = this.f5308Ujhhgtgfeyxiexzf;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("ne5Proto(d=");
        sb.append(this.f5306Ujhhgtgfeyxiexzf);
        sb.append(", e=");
        sb.append(this.f5307Ujhhgtgfeyxiexzf);
        sb.append(", f=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5308Ujhhgtgfeyxiexzf, ')');
    }
}
