package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2373Ujhhgtgfeyxiexzf extends AbstractC0217Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static volatile C2373Ujhhgtgfeyxiexzf f7723Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final Object f7724Ujhhgtgfeyxiexzf;

    public C2373Ujhhgtgfeyxiexzf(int i) {
        switch (i) {
            case 1:
                this.f7724Ujhhgtgfeyxiexzf = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC3122Ujhhgtgfeyxiexzf());
                break;
            default:
                this.f7724Ujhhgtgfeyxiexzf = new C2373Ujhhgtgfeyxiexzf(1);
                break;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛴᛳᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static C2373Ujhhgtgfeyxiexzf m3614feyxiexzfUjhhgtg() {
        if (f7723Ujhhgtgfeyxiexzf != null) {
            return f7723Ujhhgtgfeyxiexzf;
        }
        synchronized (C2373Ujhhgtgfeyxiexzf.class) {
            try {
                if (f7723Ujhhgtgfeyxiexzf == null) {
                    f7723Ujhhgtgfeyxiexzf = new C2373Ujhhgtgfeyxiexzf(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f7723Ujhhgtgfeyxiexzf;
    }
}
