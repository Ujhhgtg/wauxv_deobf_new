package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸ᛳ能不能ᛱfeyxiexzfᛱᛴᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2151feyxiexzfUjhhgtg {
    public static final C2150feyxiexzfUjhhgtg Companion = new C2150feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f6998Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Long f6999Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2151feyxiexzfUjhhgtg(int i, String str, Long l) {
        if (3 != (i & 3)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 3, C2149Ujhhgtgfeyxiexzf.f6997Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f6998Ujhhgtgfeyxiexzf = str;
        this.f6999Ujhhgtgfeyxiexzf = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2151feyxiexzfUjhhgtg)) {
            return false;
        }
        C2151feyxiexzfUjhhgtg c2151feyxiexzfUjhhgtg = (C2151feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6998Ujhhgtgfeyxiexzf, c2151feyxiexzfUjhhgtg.f6998Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f6999Ujhhgtgfeyxiexzf, c2151feyxiexzfUjhhgtg.f6999Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        String str = this.f6998Ujhhgtgfeyxiexzf;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.f6999Ujhhgtgfeyxiexzf;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928201026260960650L, strArr));
        sb.append(this.f6998Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928201064915666314L, strArr));
        sb.append(this.f6999Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
