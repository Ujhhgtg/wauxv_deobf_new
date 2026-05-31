package p000;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᛸᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3562 implements InterfaceC1780, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public InterfaceC1422 f11158;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public Object f11159;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new C1649(getValue());
    }

    @Override // p000.InterfaceC1780
    public final Object getValue() {
        if (this.f11159 == C1139.f4227) {
            this.f11159 = this.f11158.invoke();
            this.f11158 = null;
        }
        return this.f11159;
    }

    public final String toString() {
        return this.f11159 != C1139.f4227 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
