package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᲈᲇᛸᲁᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2917 extends C1723 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f9298;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:27:0x0043  */
    public C2917() {
        super(true);
        boolean z = true;
        m3624(null);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1723.f5840;
        InterfaceC0678 interfaceC0678 = (InterfaceC0678) atomicReferenceFieldUpdater.get(this);
        C0679 c0679 = interfaceC0678 instanceof C0679 ? (C0679) interfaceC0678 : null;
        if (c0679 == null) {
            z = false;
            break;
        }
        C1723 c1723 = c0679.f5829;
        c1723 = c1723 == null ? null : c1723;
        if (c1723 == null) {
            z = false;
            break;
        }
        while (!c1723.mo3622()) {
            InterfaceC0678 interfaceC0679 = (InterfaceC0678) atomicReferenceFieldUpdater.get(c1723);
            C0679 c06710 = interfaceC0679 instanceof C0679 ? (C0679) interfaceC0679 : null;
            if (c06710 != null) {
                c1723 = c06710.f5829;
                if (c1723 == null) {
                    c1723 = null;
                }
                if (c1723 == null) {
                }
            }
            z = false;
        }
        this.f9298 = z;
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public final boolean mo3618(Throwable th) {
        return false;
    }

    @Override // p000.C1723
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ */
    public final boolean mo3622() {
        return this.f9298;
    }
}
