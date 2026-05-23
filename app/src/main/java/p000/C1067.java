package p000;

import java.io.File;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1067 {

    public boolean f3855;

    public final Object f3856;

    public final Object f3857;

    public final Object f3858;

    public C1067(C1215 c1215, C2709 c2709) {
        this.f3858 = new C2711(this);
        this.f3857 = c1215;
        this.f3856 = c2709;
    }

    public void m2617() {
        C1069.m2620((C1069) this.f3858, this, false);
    }

    public File m2618() {
        File file;
        synchronized (((C1069) this.f3858)) {
            try {
                C1068 c1068 = (C1068) this.f3856;
                if (c1068.f3864 != this) {
                    throw new IllegalStateException();
                }
                if (!c1068.f3863) {
                    ((boolean[]) this.f3857)[0] = true;
                }
                file = c1068.f3862[0];
                ((C1069) this.f3858).f3866.mkdirs();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public C1067(C1069 c1069, C1068 c1068) {
        this.f3858 = c1069;
        this.f3856 = c1068;
        this.f3857 = c1068.f3863 ? null : new boolean[1];
    }
}
