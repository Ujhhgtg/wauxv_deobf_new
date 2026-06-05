package p000;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1990feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ThreadLocal f6559Ujhhgtgfeyxiexzf = new ThreadLocal();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static AbstractC3359feyxiexzfUjhhgtg m3343Ujhhgtgfeyxiexzf() {
        ThreadLocal threadLocal = f6559Ujhhgtgfeyxiexzf;
        AbstractC3359feyxiexzfUjhhgtg abstractC3359feyxiexzfUjhhgtg = (AbstractC3359feyxiexzfUjhhgtg) threadLocal.get();
        if (abstractC3359feyxiexzfUjhhgtg != null) {
            return abstractC3359feyxiexzfUjhhgtg;
        }
        C2523feyxiexzfUjhhgtg c2523feyxiexzfUjhhgtg = new C2523feyxiexzfUjhhgtg(Thread.currentThread());
        threadLocal.set(c2523feyxiexzfUjhhgtg);
        return c2523feyxiexzfUjhhgtg;
    }
}
