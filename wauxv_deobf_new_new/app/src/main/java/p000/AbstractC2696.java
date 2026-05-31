package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲇᛸᤝᤞᲁᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2696 extends AbstractC1245 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public ExecutorC0881 f8694;

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable) {
        ExecutorC0881 executorC0881 = this.f8694;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0881.f3321;
        executorC0881.m2522(runnable, false);
    }
}
