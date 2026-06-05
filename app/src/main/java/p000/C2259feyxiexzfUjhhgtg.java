package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛳ能不能ᛲᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2259feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7338Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C2259feyxiexzfUjhhgtg.class, Object.class, "lastScheduledTask$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7339Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C2259feyxiexzfUjhhgtg.class, "producerIndex$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7340Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C2259feyxiexzfUjhhgtg.class, "consumerIndex$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7341Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C2259feyxiexzfUjhhgtg.class, "blockingTasksInBuffer$volatile");
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AtomicReferenceArray f7342Ujhhgtgfeyxiexzf = new AtomicReferenceArray(128);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final AbstractRunnableC1963Ujhhgtgfeyxiexzf m3455Ujhhgtgfeyxiexzf() {
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7340Ujhhgtgfeyxiexzf;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f7339Ujhhgtgfeyxiexzf.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (abstractRunnableC1963Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) this.f7342Ujhhgtgfeyxiexzf.getAndSet(i2, null)) != null) {
                if (abstractRunnableC1963Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf) {
                    f7341Ujhhgtgfeyxiexzf.decrementAndGet(this);
                }
                return abstractRunnableC1963Ujhhgtgfeyxiexzf;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final AbstractRunnableC1963Ujhhgtgfeyxiexzf m3456Ujhhgtgfeyxiexzf(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f7342Ujhhgtgfeyxiexzf;
        AbstractRunnableC1963Ujhhgtgfeyxiexzf abstractRunnableC1963Ujhhgtgfeyxiexzf = (AbstractRunnableC1963Ujhhgtgfeyxiexzf) atomicReferenceArray.get(i2);
        if (abstractRunnableC1963Ujhhgtgfeyxiexzf != null && abstractRunnableC1963Ujhhgtgfeyxiexzf.f6439Ujhhgtgfeyxiexzf == z) {
            while (!atomicReferenceArray.compareAndSet(i2, abstractRunnableC1963Ujhhgtgfeyxiexzf, null)) {
                if (atomicReferenceArray.get(i2) != abstractRunnableC1963Ujhhgtgfeyxiexzf) {
                }
            }
            if (z) {
                f7341Ujhhgtgfeyxiexzf.decrementAndGet(this);
            }
            return abstractRunnableC1963Ujhhgtgfeyxiexzf;
        }
        return null;
    }
}
