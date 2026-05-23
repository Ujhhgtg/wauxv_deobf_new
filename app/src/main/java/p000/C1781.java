package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1781 extends AbstractC0878 implements InterfaceC1006 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f5904 = AtomicIntegerFieldUpdater.newUpdater(C1781.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    public final /* synthetic */ InterfaceC1006 f5905;

    public final AbstractC0878 f5906;

    public final int f5907;

    public final C1849 f5908;

    public final Object f5909;

    /* JADX WARN: Multi-variable type inference failed */
    public C1781(AbstractC0878 abstractC0878, int i) {
        InterfaceC1006 interfaceC1006 = abstractC0878 instanceof InterfaceC1006 ? (InterfaceC1006) abstractC0878 : null;
        this.f5905 = interfaceC1006 == null ? AbstractC0985.f3603 : interfaceC1006;
        this.f5906 = abstractC0878;
        this.f5907 = i;
        this.f5908 = new C1849();
        this.f5909 = new Object();
    }

    @Override // p000.AbstractC0878
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5906);
        sb.append(".limitedParallelism(");
        return AbstractC2784.m4750(sb, this.f5907, ')');
    }

    @Override // p000.InterfaceC1006
    public final void mo2577(long j, C0558 c0558) {
        this.f5905.mo2577(j, c0558);
    }

    @Override // p000.AbstractC0878
    public final void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable) {
        this.f5908.m3611(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5904;
        if (atomicIntegerFieldUpdater.get(this) < this.f5907) {
            synchronized (this.f5909) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f5907) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM3515 = m3515();
                if (runnableM3515 == null) {
                    return;
                }
                try {
                    AbstractC2203.m4039(this.f5906, this, new RunnableC0132(this, 4, runnableM3515));
                } catch (Throwable th) {
                    f5904.decrementAndGet(this);
                    throw th;
                }
            }
        }
    }

    public final Runnable m3515() {
        while (true) {
            Runnable runnable = (Runnable) this.f5908.m3614();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5909) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5904;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5908.m3613() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
