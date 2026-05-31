package p000;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲈᛸᲇᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0994 extends AbstractC1245 implements Executor {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final ExecutorC0994 f3625 = new ExecutorC0994();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final AbstractC0877 f3626;

    static {
        C3559 c3559 = C3559.f11155;
        int i = AbstractC2942.f9404;
        if (64 >= i) {
            i = 64;
        }
        f3626 = c3559.mo2511(AbstractC3528.m5103(i, 12, "kotlinx.coroutines.io.parallelism"));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo2509(C1189.f4324, runnable);
    }

    @Override // p000.AbstractC0877
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // p000.AbstractC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public final void mo2509(InterfaceC0876 interfaceC0876, Runnable runnable) {
        f3626.mo2509(interfaceC0876, runnable);
    }
}
