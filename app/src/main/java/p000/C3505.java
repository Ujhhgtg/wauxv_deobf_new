package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲇᲈᛸᤝᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3505 implements InterfaceC1758, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public InterfaceC1414 f11006;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public Object f11007;

    @Override // p000.InterfaceC1758
    public final Object getValue() {
        if (this.f11007 == C1133.f4215) {
            this.f11007 = this.f11006.invoke();
            this.f11006 = null;
        }
        return this.f11007;
    }

    public final String toString() {
        return this.f11007 != C1133.f4215 ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
