package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2397Ujhhgtgfeyxiexzf {
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static C2401Ujhhgtgfeyxiexzf m3662Ujhhgtgfeyxiexzf() throws InterruptedException {
        C2401Ujhhgtgfeyxiexzf c2401Ujhhgtgfeyxiexzf = C2401Ujhhgtgfeyxiexzf.head.next;
        if (c2401Ujhhgtgfeyxiexzf == null) {
            long jNanoTime = System.nanoTime();
            C2401Ujhhgtgfeyxiexzf.condition.await(C2401Ujhhgtgfeyxiexzf.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            if (C2401Ujhhgtgfeyxiexzf.head.next != null || System.nanoTime() - jNanoTime < C2401Ujhhgtgfeyxiexzf.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C2401Ujhhgtgfeyxiexzf.head;
        }
        long jAccess$remainingNanos = C2401Ujhhgtgfeyxiexzf.access$remainingNanos(c2401Ujhhgtgfeyxiexzf, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            C2401Ujhhgtgfeyxiexzf.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C2401Ujhhgtgfeyxiexzf.head.next = c2401Ujhhgtgfeyxiexzf.next;
        c2401Ujhhgtgfeyxiexzf.next = null;
        return c2401Ujhhgtgfeyxiexzf;
    }
}
