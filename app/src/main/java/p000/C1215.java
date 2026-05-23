package p000;

import java.io.File;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1215 implements InterfaceC1467 {

    public volatile Object f4384;

    public final Object f4385;

    public /* synthetic */ C1215(Object obj) {
        this.f4385 = obj;
    }

    @Override // p000.InterfaceC1467
    public Object get() {
        if (this.f4384 == null) {
            synchronized (this) {
                try {
                    if (this.f4384 == null) {
                        Object obj = ((InterfaceC1467) this.f4385).get();
                        AbstractC1460.m3210(obj, "Argument must not be null");
                        this.f4384 = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4384;
    }

    public InterfaceC1062 m2831() {
        if (((InterfaceC1062) this.f4384) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC1062) this.f4384) == null) {
                        File cacheDir = ((C1044) ((C0094) this.f4385).f1049).f3808.getCacheDir();
                        C1070 c1070 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c1070 = new C1070(file);
                        }
                        this.f4384 = c1070;
                    }
                    if (((InterfaceC1062) this.f4384) == null) {
                        this.f4384 = new C0373(19);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC1062) this.f4384;
    }
}
