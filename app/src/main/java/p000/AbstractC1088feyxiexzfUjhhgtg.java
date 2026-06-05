package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛳ能不能ᛴᛲᛱUjhhgtgᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1088feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final C1086feyxiexzfUjhhgtg f4166Ujhhgtgfeyxiexzf = new C1086feyxiexzfUjhhgtg(new byte[0], 0, 0, false, false);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final int f4167Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final AtomicReference[] f4168Ujhhgtgfeyxiexzf;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f4167Ujhhgtgfeyxiexzf = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f4168Ujhhgtgfeyxiexzf = atomicReferenceArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final void m2559Ujhhgtgfeyxiexzf(C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg) {
        if (c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf != null || c1086feyxiexzfUjhhgtg.f4165Ujhhgtgfeyxiexzf != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c1086feyxiexzfUjhhgtg.f4162Ujhhgtgfeyxiexzf) {
            return;
        }
        AtomicReference atomicReference = f4168Ujhhgtgfeyxiexzf[(int) (Thread.currentThread().getId() & (((long) f4167Ujhhgtgfeyxiexzf) - 1))];
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = f4166Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg3 = (C1086feyxiexzfUjhhgtg) atomicReference.getAndSet(c1086feyxiexzfUjhhgtg2);
        if (c1086feyxiexzfUjhhgtg3 == c1086feyxiexzfUjhhgtg2) {
            return;
        }
        int i = c1086feyxiexzfUjhhgtg3 != null ? c1086feyxiexzfUjhhgtg3.f4161Ujhhgtgfeyxiexzf : 0;
        if (i >= 65536) {
            atomicReference.set(c1086feyxiexzfUjhhgtg3);
            return;
        }
        c1086feyxiexzfUjhhgtg.f4164Ujhhgtgfeyxiexzf = c1086feyxiexzfUjhhgtg3;
        c1086feyxiexzfUjhhgtg.f4160Ujhhgtgfeyxiexzf = 0;
        c1086feyxiexzfUjhhgtg.f4161Ujhhgtgfeyxiexzf = i + 8192;
        atomicReference.set(c1086feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final C1086feyxiexzfUjhhgtg m2560Ujhhgtgfeyxiexzf() {
        AtomicReference atomicReference = f4168Ujhhgtgfeyxiexzf[(int) (Thread.currentThread().getId() & (((long) f4167Ujhhgtgfeyxiexzf) - 1))];
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg = f4166Ujhhgtgfeyxiexzf;
        C1086feyxiexzfUjhhgtg c1086feyxiexzfUjhhgtg2 = (C1086feyxiexzfUjhhgtg) atomicReference.getAndSet(c1086feyxiexzfUjhhgtg);
        if (c1086feyxiexzfUjhhgtg2 == c1086feyxiexzfUjhhgtg) {
            return new C1086feyxiexzfUjhhgtg();
        }
        if (c1086feyxiexzfUjhhgtg2 == null) {
            atomicReference.set(null);
            return new C1086feyxiexzfUjhhgtg();
        }
        atomicReference.set(c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf);
        c1086feyxiexzfUjhhgtg2.f4164Ujhhgtgfeyxiexzf = null;
        c1086feyxiexzfUjhhgtg2.f4161Ujhhgtgfeyxiexzf = 0;
        return c1086feyxiexzfUjhhgtg2;
    }
}
