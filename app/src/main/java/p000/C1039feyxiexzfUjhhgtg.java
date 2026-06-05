package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳᛲ能不能ᛱUjhhgtgᛱ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1039feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f4052Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f4053Ujhhgtgfeyxiexzf;

    public C1039feyxiexzfUjhhgtg(String str, String str2) {
        this.f4052Ujhhgtgfeyxiexzf = str;
        this.f4053Ujhhgtgfeyxiexzf = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1039feyxiexzfUjhhgtg)) {
            return false;
        }
        C1039feyxiexzfUjhhgtg c1039feyxiexzfUjhhgtg = (C1039feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4052Ujhhgtgfeyxiexzf, c1039feyxiexzfUjhhgtg.f4052Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f4053Ujhhgtgfeyxiexzf, c1039feyxiexzfUjhhgtg.f4053Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f4053Ujhhgtgfeyxiexzf.hashCode() + (this.f4052Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928391572485047690L, strArr));
        sb.append(this.f4052Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928391632614589834L, strArr));
        return AbstractC3317feyxiexzfUjhhgtg.m4803Ujhhgtgfeyxiexzf(sb, this.f4053Ujhhgtgfeyxiexzf, ')');
    }
}
