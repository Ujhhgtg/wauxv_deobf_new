package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲁᲈᲇᛸᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1804 extends AbstractC0877 implements InterfaceC1010 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5960 = AtomicIntegerFieldUpdater.newUpdater(C1804.class, "runningWorkers$volatile");
    private volatile /* synthetic */ int runningWorkers$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC1010 f5961;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC0877 f5962;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final int f5963;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C1875 f5964;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object f5965;

    /* JADX WARN: Multi-variable type inference failed */
    public C1804(AbstractC0877 abstractC0877, int i) {
        InterfaceC1010 interfaceC1010 = abstractC0877 instanceof InterfaceC1010 ? (InterfaceC1010) abstractC0877 : null;
        this.f5961 = interfaceC1010 == null ? AbstractC0989.f3619 : interfaceC1010;
        this.f5962 = abstractC0877;
        this.f5963 = i;
        this.f5964 = new C1875();
        this.f5965 = new Object();
    }

    @Override // p000.AbstractC0877
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5962);
        sb.append(".limitedParallelism(");
        return AbstractC2844.m4784(sb, this.f5963, ')');
    }

    @Override // p000.InterfaceC1010
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ */
    public final void mo2701(long j, C0535 c0535) {
        this.f5961.mo2701(j, c0535);
    }

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable) {
        this.f5964.m3789(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5960;
        if (atomicIntegerFieldUpdater.get(this) < this.f5963) {
            synchronized (this.f5965) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f5963) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableM3687 = m3687();
                if (runnableM3687 == null) {
                    return;
                }
                try {
                    AbstractC2235.m4213(this.f5962, this, new RunnableC0140(this, 4, runnableM3687));
                } catch (Throwable th) {
                    f5960.decrementAndGet(this);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final Runnable m3687() {
        while (true) {
            Runnable runnable = (Runnable) this.f5964.m3792();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f5965) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f5960;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f5964.m3791() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }
}
