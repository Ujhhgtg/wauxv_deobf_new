package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛳᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2707feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C1981Ujhhgtgfeyxiexzf f8640Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2550feyxiexzfUjhhgtg f8641Ujhhgtgfeyxiexzf;

    public C2707feyxiexzfUjhhgtg(C1981Ujhhgtgfeyxiexzf c1981Ujhhgtgfeyxiexzf, C2550feyxiexzfUjhhgtg c2550feyxiexzfUjhhgtg) {
        this.f8640Ujhhgtgfeyxiexzf = c1981Ujhhgtgfeyxiexzf;
        this.f8641Ujhhgtgfeyxiexzf = c2550feyxiexzfUjhhgtg;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2707feyxiexzfUjhhgtg)) {
            return false;
        }
        C2707feyxiexzfUjhhgtg c2707feyxiexzfUjhhgtg = (C2707feyxiexzfUjhhgtg) obj;
        return this.f8640Ujhhgtgfeyxiexzf.equals(c2707feyxiexzfUjhhgtg.f8640Ujhhgtgfeyxiexzf) && this.f8641Ujhhgtgfeyxiexzf.equals(c2707feyxiexzfUjhhgtg.f8641Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f8641Ujhhgtgfeyxiexzf.hashCode() + (this.f8640Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("ActiveTabHost(tabLayout=");
        sb.append(this.f8640Ujhhgtgfeyxiexzf);
        sb.append(", refreshList=");
        sb.append(this.f8641Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
