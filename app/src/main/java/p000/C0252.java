package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᤝᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0252 extends AbstractC2207 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static volatile C0252 f1420;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f1421;

    public C0252(int i) {
        switch (i) {
            case 1:
                this.f1421 = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1003());
                break;
            default:
                this.f1421 = new C0252(1);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public static C0252 m1341() {
        if (f1420 != null) {
            return f1420;
        }
        synchronized (C0252.class) {
            try {
                if (f1420 == null) {
                    f1420 = new C0252(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1420;
    }
}
