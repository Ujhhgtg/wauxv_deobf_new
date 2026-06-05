package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ能不能ᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1628feyxiexzfUjhhgtg {
    public static final C1629feyxiexzfUjhhgtg Companion = new C1629feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5563Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5564Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5565Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1628feyxiexzfUjhhgtg(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1646feyxiexzfUjhhgtg.f5601Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5563Ujhhgtgfeyxiexzf = str;
        this.f5564Ujhhgtgfeyxiexzf = str2;
        this.f5565Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628feyxiexzfUjhhgtg)) {
            return false;
        }
        C1628feyxiexzfUjhhgtg c1628feyxiexzfUjhhgtg = (C1628feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5563Ujhhgtgfeyxiexzf, c1628feyxiexzfUjhhgtg.f5563Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5564Ujhhgtgfeyxiexzf, c1628feyxiexzfUjhhgtg.f5564Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5565Ujhhgtgfeyxiexzf, c1628feyxiexzfUjhhgtg.f5565Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5563Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5564Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5565Ujhhgtgfeyxiexzf;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("vd5Proto(finder_username=");
        sb.append(this.f5563Ujhhgtgfeyxiexzf);
        sb.append(", sdk_user_id=");
        sb.append(this.f5564Ujhhgtgfeyxiexzf);
        sb.append(", seat_id=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5565Ujhhgtgfeyxiexzf, ')');
    }
}
