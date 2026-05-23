package p000;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2623 implements InterfaceC1758, Serializable {

    public static final AtomicReferenceFieldUpdater f8510 = AtomicReferenceFieldUpdater.newUpdater(C2623.class, Object.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ");

    public volatile InterfaceC1414 f8511;

    public volatile Object f8512;

    @Override // p000.InterfaceC1758
    public final Object getValue() {
        Object obj = this.f8512;
        C1133 c1133 = C1133.f4215;
        if (obj != c1133) {
            return obj;
        }
        InterfaceC1414 interfaceC1414 = this.f8511;
        if (interfaceC1414 != null) {
            Object objInvoke = interfaceC1414.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8510;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1133, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1133) {
                }
            }
            this.f8511 = null;
            return objInvoke;
        }
        return this.f8512;
    }

    public final String toString() {
        return this.f8512 != C1133.f4215 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
