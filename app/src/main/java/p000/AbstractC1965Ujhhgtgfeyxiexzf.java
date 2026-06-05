package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛲ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1965Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final String f6441Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final long f6442Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final int f6443Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final int f6444Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final long f6445Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final C3382feyxiexzfUjhhgtg f6446Ujhhgtgfeyxiexzf;

    static {
        String property;
        int i = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        try {
            property = System.getProperty("kotlinx.coroutines.scheduler.default.name");
        } catch (SecurityException unused) {
            property = null;
        }
        if (property == null) {
            property = "DefaultDispatcher";
        }
        f6441Ujhhgtgfeyxiexzf = property;
        f6442Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1896Ujhhgtgfeyxiexzf("kotlinx.coroutines.scheduler.resolution.ns", 100000L, 1L, Long.MAX_VALUE);
        int i2 = AbstractC2075feyxiexzfUjhhgtg.f6819Ujhhgtgfeyxiexzf;
        if (i2 < 2) {
            i2 = 2;
        }
        f6443Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1897Ujhhgtgfeyxiexzf(i2, 8, "kotlinx.coroutines.scheduler.core.pool.size");
        f6444Ujhhgtgfeyxiexzf = AbstractC0615Ujhhgtgfeyxiexzf.m1897Ujhhgtgfeyxiexzf(2097150, 4, "kotlinx.coroutines.scheduler.max.pool.size");
        f6445Ujhhgtgfeyxiexzf = TimeUnit.SECONDS.toNanos(AbstractC0615Ujhhgtgfeyxiexzf.m1896Ujhhgtgfeyxiexzf("kotlinx.coroutines.scheduler.keep.alive.sec", 60L, 1L, Long.MAX_VALUE));
        f6446Ujhhgtgfeyxiexzf = C3382feyxiexzfUjhhgtg.f10564Ujhhgtgfeyxiexzf;
    }
}
