package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᲁᤝᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2709 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C2707 f8713 = new C2707(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int f8714;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final AtomicReference[] f8715;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f8714 = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f8715 = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final void m4683(C2707 c2707) {
        if (c2707.f8709 != null || c2707.f8710 != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c2707.f8707) {
            return;
        }
        AtomicReference atomicReference = f8715[(int) (Thread.currentThread().getId() & (((long) f8714) - 1))];
        C2707 c2708 = f8713;
        C2707 c2709 = (C2707) atomicReference.getAndSet(c2708);
        if (c2709 == c2708) {
            return;
        }
        int i = c2709 != null ? c2709.f8706 : 0;
        if (i >= 65536) {
            atomicReference.set(c2709);
            return;
        }
        c2707.f8709 = c2709;
        c2707.f8705 = 0;
        c2707.f8706 = i + 8192;
        atomicReference.set(c2707);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2707 m4684() {
        AtomicReference atomicReference = f8715[(int) (Thread.currentThread().getId() & (((long) f8714) - 1))];
        C2707 c2707 = f8713;
        C2707 c2708 = (C2707) atomicReference.getAndSet(c2707);
        if (c2708 == c2707) {
            return new C2707();
        }
        if (c2708 == null) {
            atomicReference.set(null);
            return new C2707();
        }
        atomicReference.set(c2708.f8709);
        c2708.f8709 = null;
        c2708.f8706 = 0;
        return c2708;
    }
}
