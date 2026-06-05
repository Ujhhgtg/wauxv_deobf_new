package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛳᛴᛲ能不能ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1425feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f5009Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f5010Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final String f5011Ujhhgtgfeyxiexzf;

    public C1425feyxiexzfUjhhgtg(String str, String str2, String str3) {
        this.f5009Ujhhgtgfeyxiexzf = str;
        this.f5010Ujhhgtgfeyxiexzf = str2;
        this.f5011Ujhhgtgfeyxiexzf = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1425feyxiexzfUjhhgtg)) {
            return false;
        }
        C1425feyxiexzfUjhhgtg c1425feyxiexzfUjhhgtg = (C1425feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5009Ujhhgtgfeyxiexzf, c1425feyxiexzfUjhhgtg.f5009Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5010Ujhhgtgfeyxiexzf, c1425feyxiexzfUjhhgtg.f5010Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5011Ujhhgtgfeyxiexzf, c1425feyxiexzfUjhhgtg.f5011Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f5011Ujhhgtgfeyxiexzf.hashCode() + AbstractC0924feyxiexzfUjhhgtg.m2415Ujhhgtgfeyxiexzf(this.f5009Ujhhgtgfeyxiexzf.hashCode() * 31, 31, this.f5010Ujhhgtgfeyxiexzf);
    }

    public final String toString() {
        String strM5246Ujhhgtgfeyxiexzf = AbstractC3612feyxiexzfUjhhgtg.m5246Ujhhgtgfeyxiexzf(System.currentTimeMillis(), null, null, 3);
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("[");
        sb2.append(strM5246Ujhhgtgfeyxiexzf);
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb2.append(MagicFactory.get(4928461692121122186L, strArr));
        sb2.append(this.f5009Ujhhgtgfeyxiexzf);
        sb2.append(MagicFactory.get(4928461726480860554L, strArr));
        sb2.append(this.f5010Ujhhgtgfeyxiexzf);
        sb2.append(']');
        sb.append(sb2.toString());
        sb.append(MagicFactory.get(4928461713595958666L, strArr));
        sb.append(this.f5011Ujhhgtgfeyxiexzf);
        return sb.toString();
    }
}
