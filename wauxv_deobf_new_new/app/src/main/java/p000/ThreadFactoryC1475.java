package p000;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲇᛸᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC1475 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ThreadFactoryC0150 f5255;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f5256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C1139 f5257;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5258;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AtomicInteger f5259;

    public ThreadFactoryC1475(ThreadFactoryC0150 threadFactoryC0150, String str, boolean z) {
        C1139 c1139 = C1139.f4218;
        this.f5259 = new AtomicInteger();
        this.f5255 = threadFactoryC0150;
        this.f5256 = str;
        this.f5257 = c1139;
        this.f5258 = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        RunnableC0140 runnableC0140 = new RunnableC0140(this, 2, runnable);
        this.f5255.getClass();
        C0287 c0287 = new C0287(runnableC0140);
        c0287.setName("glide-" + this.f5256 + "-thread-" + this.f5259.getAndIncrement());
        return c0287;
    }
}
