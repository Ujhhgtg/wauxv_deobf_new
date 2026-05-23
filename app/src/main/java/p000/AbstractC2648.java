package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2648 {

    public static final C2646 f8548 = new C2646(new byte[0], 0, 0, false, false);

    public static final int f8549;

    public static final AtomicReference[] f8550;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8549 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f8550 = atomicReferenceArr;
    }

    public static final void m4649(C2646 c2646) {
        if (c2646.f8544 != null || c2646.f8545 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c2646.f8542) {
            return;
        }
        AtomicReference atomicReference = f8550[(int) (Thread.currentThread().getId() & (((long) f8549) - 1))];
        C2646 c2647 = f8548;
        C2646 c2648 = (C2646) atomicReference.getAndSet(c2647);
        if (c2648 == c2647) {
            return;
        }
        int i = c2648 != null ? c2648.f8541 : 0;
        if (i >= 65536) {
            atomicReference.set(c2648);
            return;
        }
        c2646.f8544 = c2648;
        c2646.f8540 = 0;
        c2646.f8541 = i + 8192;
        atomicReference.set(c2646);
    }

    public static final C2646 m4650() {
        AtomicReference atomicReference = f8550[(int) (Thread.currentThread().getId() & (((long) f8549) - 1))];
        C2646 c2646 = f8548;
        C2646 c2647 = (C2646) atomicReference.getAndSet(c2646);
        if (c2647 == c2646) {
            return new C2646();
        }
        if (c2647 == null) {
            atomicReference.set(null);
            return new C2646();
        }
        atomicReference.set(c2647.f8544);
        c2647.f8544 = null;
        c2647.f8541 = 0;
        return c2647;
    }
}
