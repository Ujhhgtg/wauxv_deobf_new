package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᲀᛸᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0990 extends AbstractC1243 implements Executor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final ExecutorC0990 f3609 = new ExecutorC0990();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final AbstractC0878 f3610;

    static {
        C3502 c3502 = C3502.f11003;
        int i = AbstractC2883.f9237;
        if (64 >= i) {
            i = 64;
        }
        f3610 = c3502.mo2394(AbstractC2205.m4076(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo2392(C1187.f4327, runnable);
    }

    @Override // p000.AbstractC0878
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.AbstractC0878
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2392(InterfaceC0877 interfaceC0877, Runnable runnable) {
        f3610.mo2392(interfaceC0877, runnable);
    }
}
