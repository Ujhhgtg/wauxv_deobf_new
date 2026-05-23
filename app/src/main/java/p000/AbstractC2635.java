package p000;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᤞᲈᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2635 extends AbstractC1243 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public ExecutorC0882 f8529;

    @Override // p000.AbstractC0878
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable) {
        ExecutorC0882 executorC0882 = this.f8529;
        AtomicLongFieldUpdater atomicLongFieldUpdater = ExecutorC0882.f3314;
        executorC0882.m2405(runnable, false);
    }
}
