package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳ能不能ᛴ要点脸ᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0082Ujhhgtgfeyxiexzf extends AbstractC3740feyxiexzfUjhhgtg implements InterfaceC3123Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f1152Ujhhgtgfeyxiexzf = AtomicIntegerFieldUpdater.newUpdater(C0082Ujhhgtgfeyxiexzf.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3123Ujhhgtgfeyxiexzf f1153Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC3740feyxiexzfUjhhgtg f1154Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final int f1155Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final C0280Ujhhgtgfeyxiexzf f1156Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final Object f1157Ujhhgtgfeyxiexzf;

    /* JADX WARN: Multi-variable type inference failed */
    public C0082Ujhhgtgfeyxiexzf(AbstractC3740feyxiexzfUjhhgtg abstractC3740feyxiexzfUjhhgtg, int i) {
        InterfaceC3123Ujhhgtgfeyxiexzf interfaceC3123Ujhhgtgfeyxiexzf = abstractC3740feyxiexzfUjhhgtg instanceof InterfaceC3123Ujhhgtgfeyxiexzf ? (InterfaceC3123Ujhhgtgfeyxiexzf) abstractC3740feyxiexzfUjhhgtg : null;
        this.f1153Ujhhgtgfeyxiexzf = interfaceC3123Ujhhgtgfeyxiexzf == null ? AbstractC3129Ujhhgtgfeyxiexzf.f9721Ujhhgtgfeyxiexzf : interfaceC3123Ujhhgtgfeyxiexzf;
        this.f1154Ujhhgtgfeyxiexzf = abstractC3740feyxiexzfUjhhgtg;
        this.f1155Ujhhgtgfeyxiexzf = i;
        this.f1156Ujhhgtgfeyxiexzf = new C0280Ujhhgtgfeyxiexzf();
        this.f1157Ujhhgtgfeyxiexzf = new Object();
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1154Ujhhgtgfeyxiexzf);
        sb.append(".limitedParallelism(");
        return AbstractC3317feyxiexzfUjhhgtg.m4802Ujhhgtgfeyxiexzf(sb, this.f1155Ujhhgtgfeyxiexzf, ')');
    }

    @Override // p000.InterfaceC3123Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final void mo1128Ujhhgtgfeyxiexzf(long j, C2774Ujhhgtgfeyxiexzf c2774Ujhhgtgfeyxiexzf) {
        this.f1153Ujhhgtgfeyxiexzf.mo1128Ujhhgtgfeyxiexzf(j, c2774Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC3740feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public final void mo1129feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg, Runnable runnable) {
        this.f1156Ujhhgtgfeyxiexzf.m1489Ujhhgtgfeyxiexzf(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1152Ujhhgtgfeyxiexzf;
        if (atomicIntegerFieldUpdater.get(this) < this.f1155Ujhhgtgfeyxiexzf) {
            synchronized (this.f1157Ujhhgtgfeyxiexzf) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f1155Ujhhgtgfeyxiexzf) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM1130feyxiexzfUjhhgtg = m1130feyxiexzfUjhhgtg();
                if (runnableM1130feyxiexzfUjhhgtg == null) {
                    return;
                }
                try {
                    AbstractC1264feyxiexzfUjhhgtg.m2806Ujhhgtgfeyxiexzf(this.f1154Ujhhgtgfeyxiexzf, this, new RunnableC3003feyxiexzfUjhhgtg(this, 4, runnableM1130feyxiexzfUjhhgtg));
                } catch (Throwable th) {
                    f1152Ujhhgtgfeyxiexzf.decrementAndGet(this);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final Runnable m1130feyxiexzfUjhhgtg() {
        while (true) {
            Runnable runnable = (Runnable) this.f1156Ujhhgtgfeyxiexzf.m1492Ujhhgtgfeyxiexzf();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f1157Ujhhgtgfeyxiexzf) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1152Ujhhgtgfeyxiexzf;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f1156Ujhhgtgfeyxiexzf.m1491Ujhhgtgfeyxiexzf() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
