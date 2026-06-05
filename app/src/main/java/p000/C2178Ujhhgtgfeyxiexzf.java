package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ要点脸能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2178Ujhhgtgfeyxiexzf {
    public static final C2048feyxiexzfUjhhgtg Companion = new C2048feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Float f7060Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Float f7061Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final Float f7062Ujhhgtgfeyxiexzf;

    public /* synthetic */ C2178Ujhhgtgfeyxiexzf(int i, Float f, Float f2, Float f3) {
        if (7 != (i & 7)) {
            AbstractC3516feyxiexzfUjhhgtg.m5075feyxiexzfUjhhgtg(i, 7, C2049feyxiexzfUjhhgtg.f6746Ujhhgtgfeyxiexzf.mo1106Ujhhgtgfeyxiexzf());
            throw null;
        }
        this.f7060Ujhhgtgfeyxiexzf = f;
        this.f7061Ujhhgtgfeyxiexzf = f2;
        this.f7062Ujhhgtgfeyxiexzf = f3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2178Ujhhgtgfeyxiexzf)) {
            return false;
        }
        C2178Ujhhgtgfeyxiexzf c2178Ujhhgtgfeyxiexzf = (C2178Ujhhgtgfeyxiexzf) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7060Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7060Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7061Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7061Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f7062Ujhhgtgfeyxiexzf, c2178Ujhhgtgfeyxiexzf.f7062Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        Float f = this.f7060Ujhhgtgfeyxiexzf;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Float f2 = this.f7061Ujhhgtgfeyxiexzf;
        int iHashCode2 = (iHashCode + (f2 == null ? 0 : f2.hashCode())) * 31;
        Float f3 = this.f7062Ujhhgtgfeyxiexzf;
        return iHashCode2 + (f3 != null ? f3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
        sb.append(MagicFactory.get(4928107645082011018L, strArr));
        sb.append(this.f7060Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928107709506520458L, strArr));
        sb.append(this.f7061Ujhhgtgfeyxiexzf);
        sb.append(MagicFactory.get(4928107666556847498L, strArr));
        sb.append(this.f7062Ujhhgtgfeyxiexzf);
        sb.append(')');
        return sb.toString();
    }
}
