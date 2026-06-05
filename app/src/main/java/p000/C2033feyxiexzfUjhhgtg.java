package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛳ要点脸ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2033feyxiexzfUjhhgtg {
    public static final C2032Ujhhgtgfeyxiexzf Companion = new C2032Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6670Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f6671Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6672Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2033feyxiexzfUjhhgtg(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2031feyxiexzfUjhhgtg.f6669Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6670Ujhhgtgfeyxiexzf = str;
        this.f6671Ujhhgtgfeyxiexzf = str2;
        this.f6672Ujhhgtgfeyxiexzf = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2033feyxiexzfUjhhgtg)) {
            return false;
        }
        C2033feyxiexzfUjhhgtg c2033feyxiexzfUjhhgtg = (C2033feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6670Ujhhgtgfeyxiexzf, c2033feyxiexzfUjhhgtg.f6670Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6671Ujhhgtgfeyxiexzf, c2033feyxiexzfUjhhgtg.f6671Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6672Ujhhgtgfeyxiexzf, c2033feyxiexzfUjhhgtg.f6672Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6670Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f6671Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f6672Ujhhgtgfeyxiexzf;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("AppJumpWordingProto(en=");
        sb.append(this.f6670Ujhhgtgfeyxiexzf);
        sb.append(", zh_CN=");
        sb.append(this.f6671Ujhhgtgfeyxiexzf);
        sb.append(", zh_TW=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f6672Ujhhgtgfeyxiexzf, ')');
    }
}
