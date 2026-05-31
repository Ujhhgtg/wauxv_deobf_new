package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲁᲈᤞᛸᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2684 implements InterfaceC1780, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater f8675 = AtomicReferenceFieldUpdater.newUpdater(C2684.class, Object.class, "ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public volatile InterfaceC1422 f8676;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public volatile Object f8677;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C1649(getValue());
    }

    @Override // p000.InterfaceC1780
    public final Object getValue() {
        Object obj = this.f8677;
        C1139 c1139 = C1139.f4227;
        if (obj != c1139) {
            return obj;
        }
        InterfaceC1422 interfaceC1422 = this.f8676;
        if (interfaceC1422 != null) {
            Object objInvoke = interfaceC1422.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8675;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, c1139, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != c1139) {
                }
            }
            this.f8676 = null;
            return objInvoke;
        }
        return this.f8677;
    }

    public final String toString() {
        return this.f8677 != C1139.f4227 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
