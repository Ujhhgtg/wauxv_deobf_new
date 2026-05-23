package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1673 extends AbstractC1701 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f5649 = AtomicIntegerFieldUpdater.newUpdater(C1673.class, "_invoked$volatile");
    private volatile /* synthetic */ int _invoked$volatile;

    public final C1700 f5650;

    public C1673(C1700 c1700) {
        this.f5650 = c1700;
    }

    @Override // p000.AbstractC1701
    public final boolean mo2067() {
        return true;
    }

    @Override // p000.AbstractC1701
    public final void mo2068(Throwable th) {
        if (f5649.compareAndSet(this, 0, 1)) {
            this.f5650.invoke(th);
        }
    }
}
