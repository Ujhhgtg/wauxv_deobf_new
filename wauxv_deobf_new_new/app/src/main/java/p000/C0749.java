package p000;

import java.io.Serializable;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲁᲇᲀᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0749 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0876[] f2842;

    public C0749(InterfaceC0876[] interfaceC0876Arr) {
        this.f2842 = interfaceC0876Arr;
    }

    private final Object readResolve() {
        InterfaceC0876[] interfaceC0876Arr = this.f2842;
        InterfaceC0876 interfaceC0876Mo1085 = C1189.f4324;
        for (InterfaceC0876 interfaceC0876 : interfaceC0876Arr) {
            interfaceC0876Mo1085 = interfaceC0876Mo1085.mo1085(interfaceC0876);
        }
        return interfaceC0876Mo1085;
    }
}
