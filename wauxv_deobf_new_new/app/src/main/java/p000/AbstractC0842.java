package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲁᲈᲀᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0842 extends AbstractC0345 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0876 f3256;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public transient InterfaceC0841 f3257;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0842(InterfaceC0841 interfaceC0841) {
        super(interfaceC0841);
        InterfaceC0876 interfaceC0876Mo1078 = interfaceC0841 != null ? interfaceC0841.mo1078() : null;
        this.f3256 = interfaceC0876Mo1078;
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0876 mo1078() {
        return this.f3256;
    }

    @Override // p000.AbstractC0345
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1597() {
        InterfaceC0841 interfaceC0841 = this.f3257;
        if (interfaceC0841 != null && interfaceC0841 != this) {
            ((AbstractC0877) this.f3256.mo1086(C1139.f4214)).getClass();
            C1077 c1077 = (C1077) interfaceC0841;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1077.f3897;
            while (atomicReferenceFieldUpdater.get(c1077) == AbstractC2235.f7287) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c1077);
            C0535 c0535 = obj instanceof C0535 ? (C0535) obj : null;
            if (c0535 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0535.f2242;
                InterfaceC1085 interfaceC1085 = (InterfaceC1085) atomicReferenceFieldUpdater2.get(c0535);
                if (interfaceC1085 != null) {
                    interfaceC1085.mo2774();
                    atomicReferenceFieldUpdater2.set(c0535, C2258.f7344);
                }
            }
        }
        this.f3257 = C0756.f2859;
    }
}
