package p000;

import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱ能不能ᛴᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1385feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1364feyxiexzfUjhhgtg f4880Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Object f4881Ujhhgtgfeyxiexzf;

    public C1385feyxiexzfUjhhgtg(C1364feyxiexzfUjhhgtg c1364feyxiexzfUjhhgtg, List list) {
        this.f4880Ujhhgtgfeyxiexzf = c1364feyxiexzfUjhhgtg;
        this.f4881Ujhhgtgfeyxiexzf = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1385feyxiexzfUjhhgtg)) {
            return false;
        }
        C1385feyxiexzfUjhhgtg c1385feyxiexzfUjhhgtg = (C1385feyxiexzfUjhhgtg) obj;
        return this.f4880Ujhhgtgfeyxiexzf.equals(c1385feyxiexzfUjhhgtg.f4880Ujhhgtgfeyxiexzf) && this.f4881Ujhhgtgfeyxiexzf.equals(c1385feyxiexzfUjhhgtg.f4881Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f4881Ujhhgtgfeyxiexzf.hashCode() + (this.f4880Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928404238343603594L, strArr));
        sb.append(this.f4880Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928404268408374666L, strArr));
        sb.append(this.f4881Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
