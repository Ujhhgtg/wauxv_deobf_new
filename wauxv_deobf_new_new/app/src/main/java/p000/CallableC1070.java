package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᤞᲇᛸᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1070 implements Callable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ C1074 f3865;

    public CallableC1070(C1074 c1074) {
        this.f3865 = c1074;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        synchronized (this.f3865) {
            try {
                C1074 c1074 = this.f3865;
                if (c1074.f3885 == null) {
                    return null;
                }
                c1074.m2759();
                if (this.f3865.m2754()) {
                    this.f3865.m2758();
                    this.f3865.f3887 = 0;
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
