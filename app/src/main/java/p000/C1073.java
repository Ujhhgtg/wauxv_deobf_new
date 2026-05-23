package p000;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1073 extends C2636 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f3891 = AtomicIntegerFieldUpdater.newUpdater(C1073.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    @Override // p000.C2636, p000.C1705
    public final void mo2635(Object obj) throws C1071 {
        mo2636(obj);
    }

    @Override // p000.C2636, p000.C1705
    public final void mo2636(Object obj) throws C1071 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        do {
            atomicIntegerFieldUpdater = f3891;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                AbstractC2203.m4038(AbstractC2209.m4135(this.f8530), AbstractC2201.m3983(obj));
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, 0, 2));
    }
}
