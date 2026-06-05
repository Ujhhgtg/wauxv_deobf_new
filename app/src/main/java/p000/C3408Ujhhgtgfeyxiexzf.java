package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛳᛱUjhhgtgᛱᛲ能不能ᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3408Ujhhgtgfeyxiexzf {
    public static final C3397Ujhhgtgfeyxiexzf Companion = new C3397Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C3398Ujhhgtgfeyxiexzf f10624Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C3407Ujhhgtgfeyxiexzf f10625Ujhhgtgfeyxiexzf;

    public /* synthetic */ C3408Ujhhgtgfeyxiexzf(int i, C3398Ujhhgtgfeyxiexzf c3398Ujhhgtgfeyxiexzf, C3407Ujhhgtgfeyxiexzf c3407Ujhhgtgfeyxiexzf) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C3420Ujhhgtgfeyxiexzf.f10676Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f10624Ujhhgtgfeyxiexzf = c3398Ujhhgtgfeyxiexzf;
        this.f10625Ujhhgtgfeyxiexzf = c3407Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3408Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C3408Ujhhgtgfeyxiexzf c3408Ujhhgtgfeyxiexzf = (C3408Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10624Ujhhgtgfeyxiexzf, c3408Ujhhgtgfeyxiexzf.f10624Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10625Ujhhgtgfeyxiexzf, c3408Ujhhgtgfeyxiexzf.f10625Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f10625Ujhhgtgfeyxiexzf.hashCode() + (this.f10624Ujhhgtgfeyxiexzf.f10609Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928246552914298250L, strArr));
        sb.append(this.f10624Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928246729007957386L, strArr));
        sb.append(this.f10625Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
