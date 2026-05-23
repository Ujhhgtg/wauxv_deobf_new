package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᛸᲇᤞᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0843 extends AbstractC0370 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0877 f3249;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public transient InterfaceC0842 f3250;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC0843(InterfaceC0842 interfaceC0842) {
        super(interfaceC0842);
        InterfaceC0877 interfaceC0877Mo934 = interfaceC0842 != null ? interfaceC0842.mo934() : null;
        this.f3249 = interfaceC0877Mo934;
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0877 mo934() {
        return this.f3249;
    }

    @Override // p000.AbstractC0370
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final void mo1492() {
        InterfaceC0842 interfaceC0842 = this.f3250;
        if (interfaceC0842 != null && interfaceC0842 != this) {
            
            C1072 c1072 = (C1072) interfaceC0842;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1072.f3886;
            while (atomicReferenceFieldUpdater.get(c1072) == AbstractC2203.f7167) {
            }
            Object obj = atomicReferenceFieldUpdater.get(c1072);
            C0558 c0558 = obj instanceof C0558 ? (C0558) obj : null;
            if (c0558 != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0558.f2286;
                InterfaceC1080 interfaceC1080 = (InterfaceC1080) atomicReferenceFieldUpdater2.get(c0558);
                if (interfaceC1080 != null) {
                    interfaceC1080.mo2648();
                    atomicReferenceFieldUpdater2.set(c0558, C2228.f7225);
                }
            }
        }
        this.f3250 = C0759.f2859;
    }
}
