package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ能不能要点脸ᛴᛱfeyxiexzfᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1576Ujhhgtgfeyxiexzf {
    public static final C1575Ujhhgtgfeyxiexzf Companion = new C1575Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2026Ujhhgtgfeyxiexzf f5425Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C1508Ujhhgtgfeyxiexzf f5426Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5427Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f5428Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1576Ujhhgtgfeyxiexzf(int i, C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf, C1508Ujhhgtgfeyxiexzf c1508Ujhhgtgfeyxiexzf, String str, String str2) {
        if (15 != (i & 15)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 15, C1574Ujhhgtgfeyxiexzf.f5424Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5425Ujhhgtgfeyxiexzf = c2026Ujhhgtgfeyxiexzf;
        this.f5426Ujhhgtgfeyxiexzf = c1508Ujhhgtgfeyxiexzf;
        this.f5427Ujhhgtgfeyxiexzf = str;
        this.f5428Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1576Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1576Ujhhgtgfeyxiexzf c1576Ujhhgtgfeyxiexzf = (C1576Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5425Ujhhgtgfeyxiexzf, c1576Ujhhgtgfeyxiexzf.f5425Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5426Ujhhgtgfeyxiexzf, c1576Ujhhgtgfeyxiexzf.f5426Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5427Ujhhgtgfeyxiexzf, c1576Ujhhgtgfeyxiexzf.f5427Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5428Ujhhgtgfeyxiexzf, c1576Ujhhgtgfeyxiexzf.f5428Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf = this.f5425Ujhhgtgfeyxiexzf;
        int iHashCode = (c2026Ujhhgtgfeyxiexzf == null ? 0 : c2026Ujhhgtgfeyxiexzf.hashCode()) * 31;
        C1508Ujhhgtgfeyxiexzf c1508Ujhhgtgfeyxiexzf = this.f5426Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (c1508Ujhhgtgfeyxiexzf == null ? 0 : c1508Ujhhgtgfeyxiexzf.hashCode())) * 31;
        String str = this.f5427Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5428Ujhhgtgfeyxiexzf;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("j72Proto(contact=");
        sb.append(this.f5425Ujhhgtgfeyxiexzf);
        sb.append(", video_template=");
        sb.append(this.f5426Ujhhgtgfeyxiexzf);
        sb.append(", template_creator_h5_url=");
        sb.append(this.f5427Ujhhgtgfeyxiexzf);
        sb.append(", template_music_id=");
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5428Ujhhgtgfeyxiexzf, ')');
    }
}
