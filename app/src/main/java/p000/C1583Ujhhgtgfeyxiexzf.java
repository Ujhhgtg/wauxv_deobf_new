package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛴᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1583Ujhhgtgfeyxiexzf {
    public static final C1582Ujhhgtgfeyxiexzf Companion = new C1582Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5434Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5435Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5436Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final Integer f5437Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Long f5438Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f5439Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1583Ujhhgtgfeyxiexzf(int i, String str, String str2, String str3, Integer num, Long l, String str4) {
        if (63 != (i & 63)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 63, C1601Ujhhgtgfeyxiexzf.f5491Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5434Ujhhgtgfeyxiexzf = str;
        this.f5435Ujhhgtgfeyxiexzf = str2;
        this.f5436Ujhhgtgfeyxiexzf = str3;
        this.f5437Ujhhgtgfeyxiexzf = num;
        this.f5438Ujhhgtgfeyxiexzf = l;
        this.f5439Ujhhgtgfeyxiexzf = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1583Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C1583Ujhhgtgfeyxiexzf c1583Ujhhgtgfeyxiexzf = (C1583Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5434Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5434Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5435Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5435Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5436Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5436Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5437Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5437Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5438Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5438Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5439Ujhhgtgfeyxiexzf, c1583Ujhhgtgfeyxiexzf.f5439Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f5434Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f5435Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f5436Ujhhgtgfeyxiexzf;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.f5437Ujhhgtgfeyxiexzf;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Long l = this.f5438Ujhhgtgfeyxiexzf;
        int iHashCode5 = (iHashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        String str4 = this.f5439Ujhhgtgfeyxiexzf;
        return iHashCode5 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928092810264970634L, strArr));
        sb.append(this.f5434Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928092848919676298L, strArr));
        sb.append(this.f5435Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928092909049218442L, strArr));
        sb.append(this.f5436Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928096392267695498L, strArr));
        sb.append(this.f5437Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928096443807303050L, strArr));
        sb.append(this.f5438Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928096516821747082L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f5439Ujhhgtgfeyxiexzf, ')');
    }
}
