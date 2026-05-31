package p000;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲈᤞᲀᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0150 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f1205;

    public /* synthetic */ ThreadFactoryC0150(int i) {
        this.f1205 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f1205) {
            case 0:
                return new Thread(new RunnableC0149(runnable, 0), "glide-active-resources");
            case 1:
                return new C0287(runnable);
            default:
                return new C2615(runnable);
        }
    }
}
