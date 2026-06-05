package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1625feyxiexzfUjhhgtg {
    public static final C1624feyxiexzfUjhhgtg Companion = new C1624feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5554Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5555Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5556Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f5557Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1625feyxiexzfUjhhgtg(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1616feyxiexzfUjhhgtg.f5542Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5554Ujhhgtgfeyxiexzf = str;
        this.f5555Ujhhgtgfeyxiexzf = str2;
        this.f5556Ujhhgtgfeyxiexzf = str3;
        this.f5557Ujhhgtgfeyxiexzf = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1625feyxiexzfUjhhgtg)) {
            return false;
        }
        C1625feyxiexzfUjhhgtg c1625feyxiexzfUjhhgtg = (C1625feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5554Ujhhgtgfeyxiexzf, c1625feyxiexzfUjhhgtg.f5554Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5555Ujhhgtgfeyxiexzf, c1625feyxiexzfUjhhgtg.f5555Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5556Ujhhgtgfeyxiexzf, c1625feyxiexzfUjhhgtg.f5556Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5557Ujhhgtgfeyxiexzf, c1625feyxiexzfUjhhgtg.f5557Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5554Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5555Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5556Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f5557Ujhhgtgfeyxiexzf;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("tuProto(wholly_push_wording=");
        sb.append(this.f5554Ujhhgtgfeyxiexzf);
        sb.append(", abbreviated_push_wording=");
        sb.append(this.f5555Ujhhgtgfeyxiexzf);
        sb.append(", chosen_chatroom_name=");
        sb.append(this.f5556Ujhhgtgfeyxiexzf);
        sb.append(", chosen_chatroom_head_url=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5557Ujhhgtgfeyxiexzf, ')');
    }
}
