package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛱfeyxiexzfᛱᛲᛳ能不能ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0644Ujhhgtgfeyxiexzf extends AbstractC0691Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public int f2695Ujhhgtgfeyxiexzf = -1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final int m1909Ujhhgtgfeyxiexzf() {
        int i = this.f2695Ujhhgtgfeyxiexzf;
        if (i >= 0) {
            return i;
        }
        throw new RuntimeException("index not yet set");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String m1910Ujhhgtgfeyxiexzf() {
        return "[" + Integer.toHexString(this.f2695Ujhhgtgfeyxiexzf) + ']';
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m1911Ujhhgtgfeyxiexzf(int i) {
        if (this.f2695Ujhhgtgfeyxiexzf != -1) {
            throw new RuntimeException("index already set");
        }
        this.f2695Ujhhgtgfeyxiexzf = i;
    }
}
