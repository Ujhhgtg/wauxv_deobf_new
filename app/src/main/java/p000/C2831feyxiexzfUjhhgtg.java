package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛲ要点脸ᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2831feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f8998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final List f8999Ujhhgtgfeyxiexzf;

    public C2831feyxiexzfUjhhgtg(String str, List list) {
        this.f8998Ujhhgtgfeyxiexzf = str;
        this.f8999Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2831feyxiexzfUjhhgtg)) {
            return false;
        }
        C2831feyxiexzfUjhhgtg c2831feyxiexzfUjhhgtg = (C2831feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8998Ujhhgtgfeyxiexzf, c2831feyxiexzfUjhhgtg.f8998Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f8999Ujhhgtgfeyxiexzf, c2831feyxiexzfUjhhgtg.f8999Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f8999Ujhhgtgfeyxiexzf.hashCode() + (this.f8998Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928303456936002954L, strArr));
        sb.append(this.f8998Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928303525655479690L, strArr));
        sb.append(this.f8999Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
