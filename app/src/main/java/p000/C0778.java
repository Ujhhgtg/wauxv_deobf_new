package p000;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᤞᲁᲈᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0778 implements InterfaceC2650 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AtomicReference f2875;

    public C0778(C0271 c0271) {
        this.f2875 = new AtomicReference(c0271);
    }

    @Override // p000.InterfaceC2650
    public final Iterator iterator() {
        InterfaceC2650 interfaceC2650 = (InterfaceC2650) this.f2875.getAndSet(null);
        if (interfaceC2650 != null) {
            return interfaceC2650.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
