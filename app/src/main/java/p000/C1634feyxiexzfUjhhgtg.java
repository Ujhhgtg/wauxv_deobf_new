package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲᛱfeyxiexzfᛱᛳᛴ能不能ᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1634feyxiexzfUjhhgtg {
    public static final C1635feyxiexzfUjhhgtg Companion = new C1635feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2165feyxiexzfUjhhgtg f5572Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2026Ujhhgtgfeyxiexzf f5573Ujhhgtgfeyxiexzf;

    public /* synthetic */ C1634feyxiexzfUjhhgtg(int i, C2165feyxiexzfUjhhgtg c2165feyxiexzfUjhhgtg, C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C1627feyxiexzfUjhhgtg.f5562Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f5572Ujhhgtgfeyxiexzf = c2165feyxiexzfUjhhgtg;
        this.f5573Ujhhgtgfeyxiexzf = c2026Ujhhgtgfeyxiexzf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1634feyxiexzfUjhhgtg)) {
            return false;
        }
        C1634feyxiexzfUjhhgtg c1634feyxiexzfUjhhgtg = (C1634feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5572Ujhhgtgfeyxiexzf, c1634feyxiexzfUjhhgtg.f5572Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f5573Ujhhgtgfeyxiexzf, c1634feyxiexzfUjhhgtg.f5573Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        C2165feyxiexzfUjhhgtg c2165feyxiexzfUjhhgtg = this.f5572Ujhhgtgfeyxiexzf;
        int iHashCode = (c2165feyxiexzfUjhhgtg == null ? 0 : c2165feyxiexzfUjhhgtg.hashCode()) * 31;
        C2026Ujhhgtgfeyxiexzf c2026Ujhhgtgfeyxiexzf = this.f5573Ujhhgtgfeyxiexzf;
        return iHashCode + (c2026Ujhhgtgfeyxiexzf != null ? c2026Ujhhgtgfeyxiexzf.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append("vq0Proto(music_info=");
        sb.append(this.f5572Ujhhgtgfeyxiexzf);
        sb.append(", contact=");
        sb.append(this.f5573Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
