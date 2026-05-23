package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0276 {
    public static C0280 m1401() throws InterruptedException {
        C0280 c0280 = C0280.head.next;
        if (c0280 == null) {
            long jNanoTime = System.nanoTime();
            C0280.condition.await(C0280.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            if (C0280.head.next != null || System.nanoTime() - jNanoTime < C0280.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C0280.head;
        }
        long jAccess$remainingNanos = C0280.access$remainingNanos(c0280, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            C0280.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C0280.head.next = c0280.next;
        c0280.next = null;
        return c0280;
    }
}
