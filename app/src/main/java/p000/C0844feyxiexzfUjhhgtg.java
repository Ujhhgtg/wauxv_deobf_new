package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱ能不能ᛳ要点脸ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0844feyxiexzfUjhhgtg implements Comparable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public C1224feyxiexzfUjhhgtg f3327Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0845feyxiexzfUjhhgtg f3328Ujhhgtgfeyxiexzf;

    public C0844feyxiexzfUjhhgtg(C0845feyxiexzfUjhhgtg c0845feyxiexzfUjhhgtg) {
        this.f3328Ujhhgtgfeyxiexzf = c0845feyxiexzfUjhhgtg;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3327Ujhhgtgfeyxiexzf.f4535Ujhhgtgfeyxiexzf - ((C1224feyxiexzfUjhhgtg) obj).f4535Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        String string = "[ ";
        if (this.f3327Ujhhgtgfeyxiexzf != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(string);
                sbM2707Ujhhgtgfeyxiexzf.append(this.f3327Ujhhgtgfeyxiexzf.f4541Ujhhgtgfeyxiexzf[i]);
                sbM2707Ujhhgtgfeyxiexzf.append(" ");
                string = sbM2707Ujhhgtgfeyxiexzf.toString();
            }
        }
        StringBuilder sbM4805Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4805Ujhhgtgfeyxiexzf(string, "] ");
        sbM4805Ujhhgtgfeyxiexzf.append(this.f3327Ujhhgtgfeyxiexzf);
        return sbM4805Ujhhgtgfeyxiexzf.toString();
    }
}
