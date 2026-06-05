package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ能不能ᛱfeyxiexzfᛱ要点脸ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1559Ujhhgtgfeyxiexzf {
    public static final C1558Ujhhgtgfeyxiexzf Companion = new C1558Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1573Ujhhgtgfeyxiexzf f5363Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5364Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5365Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1559Ujhhgtgfeyxiexzf(int i, C1573Ujhhgtgfeyxiexzf c1573Ujhhgtgfeyxiexzf, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1577Ujhhgtgfeyxiexzf.f5429Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5363Ujhhgtgfeyxiexzf = c1573Ujhhgtgfeyxiexzf;
        this.f5364Ujhhgtgfeyxiexzf = str;
        this.f5365Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1559Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1559Ujhhgtgfeyxiexzf c1559Ujhhgtgfeyxiexzf = (C1559Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5363Ujhhgtgfeyxiexzf, c1559Ujhhgtgfeyxiexzf.f5363Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5364Ujhhgtgfeyxiexzf, c1559Ujhhgtgfeyxiexzf.f5364Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5365Ujhhgtgfeyxiexzf, c1559Ujhhgtgfeyxiexzf.f5365Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C1573Ujhhgtgfeyxiexzf c1573Ujhhgtgfeyxiexzf = this.f5363Ujhhgtgfeyxiexzf;
        int iHashCode = (c1573Ujhhgtgfeyxiexzf == null ? 0 : c1573Ujhhgtgfeyxiexzf.hashCode()) * 31;
        String str = this.f5364Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5365Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("k23Proto(mic_contact=");
        sb.append(this.f5363Ujhhgtgfeyxiexzf);
        sb.append(", sdk_user_id=");
        sb.append(this.f5364Ujhhgtgfeyxiexzf);
        sb.append(", session_id=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5365Ujhhgtgfeyxiexzf, ')');
    }
}
