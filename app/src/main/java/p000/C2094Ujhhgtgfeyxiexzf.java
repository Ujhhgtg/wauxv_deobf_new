package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2094Ujhhgtgfeyxiexzf {
    public static final C2095Ujhhgtgfeyxiexzf Companion = new C2095Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1573Ujhhgtgfeyxiexzf f6865Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Integer f6866Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f6867Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f6868Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Long f6869Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2094Ujhhgtgfeyxiexzf(int i, C1573Ujhhgtgfeyxiexzf c1573Ujhhgtgfeyxiexzf, Integer num, String str, String str2, Long l) {
        if (31 != (i & 31)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 31, C2099Ujhhgtgfeyxiexzf.f6875Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6865Ujhhgtgfeyxiexzf = c1573Ujhhgtgfeyxiexzf;
        this.f6866Ujhhgtgfeyxiexzf = num;
        this.f6867Ujhhgtgfeyxiexzf = str;
        this.f6868Ujhhgtgfeyxiexzf = str2;
        this.f6869Ujhhgtgfeyxiexzf = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2094Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2094Ujhhgtgfeyxiexzf c2094Ujhhgtgfeyxiexzf = (C2094Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6865Ujhhgtgfeyxiexzf, c2094Ujhhgtgfeyxiexzf.f6865Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6866Ujhhgtgfeyxiexzf, c2094Ujhhgtgfeyxiexzf.f6866Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6867Ujhhgtgfeyxiexzf, c2094Ujhhgtgfeyxiexzf.f6867Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6868Ujhhgtgfeyxiexzf, c2094Ujhhgtgfeyxiexzf.f6868Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6869Ujhhgtgfeyxiexzf, c2094Ujhhgtgfeyxiexzf.f6869Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C1573Ujhhgtgfeyxiexzf c1573Ujhhgtgfeyxiexzf = this.f6865Ujhhgtgfeyxiexzf;
        int iHashCode = (c1573Ujhhgtgfeyxiexzf == null ? 0 : c1573Ujhhgtgfeyxiexzf.hashCode()) * 31;
        Integer num = this.f6866Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f6867Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f6868Ujhhgtgfeyxiexzf;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.f6869Ujhhgtgfeyxiexzf;
        return iHashCode4 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("bf1Proto(mic_contact=");
        sb.append(this.f6865Ujhhgtgfeyxiexzf);
        sb.append(", mic_type=");
        sb.append(this.f6866Ujhhgtgfeyxiexzf);
        sb.append(", mic_sdk_user_id=");
        sb.append(this.f6867Ujhhgtgfeyxiexzf);
        sb.append(", live_mic_id=");
        sb.append(this.f6868Ujhhgtgfeyxiexzf);
        sb.append(", mic_seq=");
        sb.append(this.f6869Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
