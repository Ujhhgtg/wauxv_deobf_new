package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᛸᤞᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1464 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ThreadFactoryC0142 f5223;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f5224;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1133 f5225;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5226;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AtomicInteger f5227;

    public ThreadFactoryC1464(ThreadFactoryC0142 threadFactoryC0142, String str, boolean z) {
        C1133 c1133 = C1133.f4206;
        this.f5227 = new AtomicInteger();
        this.f5223 = threadFactoryC0142;
        this.f5224 = str;
        this.f5225 = c1133;
        this.f5226 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC0132 runnableC0132 = new RunnableC0132(this, 2, runnable);
        this.f5223.getClass();
        C0277 c0277 = new C0277(runnableC0132);
        c0277.setName("glide-" + this.f5224 + "-thread-" + this.f5227.getAndIncrement());
        return c0277;
    }
}
