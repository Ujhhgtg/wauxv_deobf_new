package p000;

import java.util.concurrent.Executors;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤞᲇᲁᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0262 extends AbstractC3744 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static volatile C0262 f1494;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Object f1495;

    public C0262(int i) {
        switch (i) {
            case 1:
                this.f1495 = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC1007());
                break;
            default:
                this.f1495 = new C0262(1);
                break;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static C0262 m1487() {
        if (f1494 != null) {
            return f1494;
        }
        synchronized (C0262.class) {
            try {
                if (f1494 == null) {
                    f1494 = new C0262(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1494;
    }
}
