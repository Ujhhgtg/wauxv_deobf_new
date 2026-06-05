package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛴᛳᛱUjhhgtgᛱ能不能要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1656feyxiexzfUjhhgtg {
    public static final C1660feyxiexzfUjhhgtg Companion = new C1660feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Long f5613Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f5614Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5615Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f5616Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1656feyxiexzfUjhhgtg(int i, Long l, Integer num, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1661feyxiexzfUjhhgtg.f5620Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5613Ujhhgtgfeyxiexzf = l;
        this.f5614Ujhhgtgfeyxiexzf = num;
        this.f5615Ujhhgtgfeyxiexzf = str;
        this.f5616Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1656feyxiexzfUjhhgtg)) {
            return false;
        }
        C1656feyxiexzfUjhhgtg c1656feyxiexzfUjhhgtg = (C1656feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5613Ujhhgtgfeyxiexzf, c1656feyxiexzfUjhhgtg.f5613Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5614Ujhhgtgfeyxiexzf, c1656feyxiexzfUjhhgtg.f5614Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5615Ujhhgtgfeyxiexzf, c1656feyxiexzfUjhhgtg.f5615Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5616Ujhhgtgfeyxiexzf, c1656feyxiexzfUjhhgtg.f5616Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Long l = this.f5613Ujhhgtgfeyxiexzf;
        int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.f5614Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f5615Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5616Ujhhgtgfeyxiexzf;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("wq0Proto(highest_reward=");
        sb.append(this.f5613Ujhhgtgfeyxiexzf);
        sb.append(", share_percentage=");
        sb.append(this.f5614Ujhhgtgfeyxiexzf);
        sb.append(", share_wording=");
        sb.append(this.f5615Ujhhgtgfeyxiexzf);
        sb.append(", highest_reward_suffix_wording=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5616Ujhhgtgfeyxiexzf, ')');
    }
}
