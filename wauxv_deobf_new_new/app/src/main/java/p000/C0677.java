package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤝᲇᲁᲀᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0677 extends AbstractC1719 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f2568;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object f2569;

    public /* synthetic */ C0677(Object obj, int i) {
        this.f2568 = i;
        this.f2569 = obj;
    }

    @Override // p000.AbstractC1719
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo2162() {
        switch (this.f2568) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᤞᲇᲁᛸ] */
    @Override // p000.AbstractC1719
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo2163(Throwable th) throws C1076 {
        switch (this.f2568) {
            case 0:
                C0535 c0535 = (C0535) this.f2569;
                C1723 c1723 = this.f5829;
                if (c1723 == null) {
                    c1723 = null;
                }
                Throwable thMo2043 = c0535.mo2043(c1723);
                if (c0535.m2046()) {
                    C1077 c1077 = (C1077) c0535.f2243;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1077.f3897;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c1077);
                        C1174 c1174 = AbstractC2235.f7287;
                        if (AbstractC1469.m3322(obj, c1174)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1077, c1174, thMo2043)) {
                                if (atomicReferenceFieldUpdater.get(c1077) != c1174) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c1077, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c1077) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0535.m2041(thMo2043);
                if (!c0535.m2046()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0535.f2242;
                    InterfaceC1085 interfaceC1085 = (InterfaceC1085) atomicReferenceFieldUpdater2.get(c0535);
                    if (interfaceC1085 != null) {
                        interfaceC1085.mo2774();
                        atomicReferenceFieldUpdater2.set(c0535, C2258.f7344);
                        break;
                    }
                }
                break;
            case 1:
                this.f2569.invoke(th);
                break;
            default:
                C1720 c1720 = (C1720) this.f2569;
                C1723 c1724 = this.f5829;
                if (c1724 == null) {
                    c1724 = null;
                }
                c1724.getClass();
                Object obj2 = C1723.f5839.get(c1724);
                if (!(obj2 instanceof C0757)) {
                    c1720.mo1077(AbstractC1272.m3102(obj2));
                } else {
                    c1720.mo1077(new C2641(((C0757) obj2).f2861));
                }
                break;
        }
    }
}
