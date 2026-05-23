package p000;

import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0147 {

    public final WeakReference f1155;

    public C0147(Object obj) {
        this.f1155 = new WeakReference(obj);
    }

    public final Object m1192() {
        return this.f1155.get();
    }
}
