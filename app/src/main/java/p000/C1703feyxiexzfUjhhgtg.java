package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1703feyxiexzfUjhhgtg {
    public static final C1702feyxiexzfUjhhgtg Companion = new C1702feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5704Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5705Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Integer f5706Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1703feyxiexzfUjhhgtg(int i, Integer num, String str, String str2) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C1721feyxiexzfUjhhgtg.f5778Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5704Ujhhgtgfeyxiexzf = str;
        this.f5705Ujhhgtgfeyxiexzf = str2;
        this.f5706Ujhhgtgfeyxiexzf = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1703feyxiexzfUjhhgtg)) {
            return false;
        }
        C1703feyxiexzfUjhhgtg c1703feyxiexzfUjhhgtg = (C1703feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5704Ujhhgtgfeyxiexzf, c1703feyxiexzfUjhhgtg.f5704Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5705Ujhhgtgfeyxiexzf, c1703feyxiexzfUjhhgtg.f5705Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5706Ujhhgtgfeyxiexzf, c1703feyxiexzfUjhhgtg.f5706Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5704Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5705Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f5706Ujhhgtgfeyxiexzf;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("sm0Proto(biz_nickname=");
        sb.append(this.f5704Ujhhgtgfeyxiexzf);
        sb.append(", biz_username=");
        sb.append(this.f5705Ujhhgtgfeyxiexzf);
        sb.append(", biz_friend_follow_count=");
        return AbstractC0924feyxiexzfUjhhgtg.m2417Ujhhgtgfeyxiexzf(sb, this.f5706Ujhhgtgfeyxiexzf, ')');
    }
}
