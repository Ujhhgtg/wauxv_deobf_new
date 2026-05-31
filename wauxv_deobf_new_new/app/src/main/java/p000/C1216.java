package p000;

import java.io.File;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲇᤞᲈᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1216 implements InterfaceC1478 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile Object f4381;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Object f4382;

    public /* synthetic */ C1216(Object obj) {
        this.f4382 = obj;
    }

    @Override // p000.InterfaceC1478
    public Object get() {
        if (this.f4381 == null) {
            synchronized (this) {
                try {
                    if (this.f4381 == null) {
                        Object obj = ((InterfaceC1478) this.f4382).get();
                        AbstractC2727.m4693(obj, "Argument must not be null");
                        this.f4381 = obj;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f4381;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public InterfaceC1067 m2953() {
        if (((InterfaceC1067) this.f4381) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC1067) this.f4381) == null) {
                        File cacheDir = ((C1047) ((C1681) this.f4382).f5660).f3815.getCacheDir();
                        C1075 c1075 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c1075 = new C1075(file);
                        }
                        this.f4381 = c1075;
                    }
                    if (((InterfaceC1067) this.f4381) == null) {
                        this.f4381 = new C0348(20);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (InterfaceC1067) this.f4381;
    }
}
