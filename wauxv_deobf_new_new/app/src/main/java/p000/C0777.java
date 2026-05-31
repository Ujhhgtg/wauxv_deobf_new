package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲀᲇᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0777 implements InterfaceC2711 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AtomicReference f2882;

    public C0777(C0281 c0281) {
        this.f2882 = new AtomicReference(c0281);
    }

    @Override // p000.InterfaceC2711
    public final Iterator iterator() {
        InterfaceC2711 interfaceC2711 = (InterfaceC2711) this.f2882.getAndSet(null);
        if (interfaceC2711 != null) {
            return interfaceC2711.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
