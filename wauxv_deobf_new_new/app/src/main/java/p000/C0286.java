package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲈᲁᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0286 {
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C0290 m1547() throws InterruptedException {
        C0290 c0290 = C0290.head.next;
        if (c0290 == null) {
            long jNanoTime = System.nanoTime();
            C0290.condition.await(C0290.IDLE_TIMEOUT_MILLIS, TimeUnit.MILLISECONDS);
            if (C0290.head.next != null || System.nanoTime() - jNanoTime < C0290.IDLE_TIMEOUT_NANOS) {
                return null;
            }
            return C0290.head;
        }
        long jAccess$remainingNanos = C0290.access$remainingNanos(c0290, System.nanoTime());
        if (jAccess$remainingNanos > 0) {
            C0290.condition.await(jAccess$remainingNanos, TimeUnit.NANOSECONDS);
            return null;
        }
        C0290.head.next = c0290.next;
        c0290.next = null;
        return c0290;
    }
}
