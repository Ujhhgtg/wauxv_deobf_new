package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛴᛳᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3603feyxiexzfUjhhgtg {
    public static final C3604feyxiexzfUjhhgtg Companion = new C3604feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public String f11214Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public Integer f11215Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public Integer f11216Ujhhgtgfeyxiexzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3603feyxiexzfUjhhgtg)) {
            return false;
        }
        C3603feyxiexzfUjhhgtg c3603feyxiexzfUjhhgtg = (C3603feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11214Ujhhgtgfeyxiexzf, c3603feyxiexzfUjhhgtg.f11214Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11215Ujhhgtgfeyxiexzf, c3603feyxiexzfUjhhgtg.f11215Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f11216Ujhhgtgfeyxiexzf, c3603feyxiexzfUjhhgtg.f11216Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f11214Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.f11215Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f11216Ujhhgtgfeyxiexzf;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("GmailInfo(gmailAcct=");
        sb.append(this.f11214Ujhhgtgfeyxiexzf);
        sb.append(", gmailSwitch=");
        sb.append(this.f11215Ujhhgtgfeyxiexzf);
        sb.append(", gmailErrCode=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f11216Ujhhgtgfeyxiexzf, ')');
    }
}
