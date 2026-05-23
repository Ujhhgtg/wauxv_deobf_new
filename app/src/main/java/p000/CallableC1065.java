package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᤞᲈᛸᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1065 implements Callable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1069 f3854;

    public CallableC1065(C1069 c1069) {
        this.f3854 = c1069;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f3854) {
            try {
                C1069 c1069 = this.f3854;
                if (c1069.f3874 == null) {
                    return null;
                }
                c1069.m2633();
                if (this.f3854.m2628()) {
                    this.f3854.m2632();
                    this.f3854.f3876 = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
