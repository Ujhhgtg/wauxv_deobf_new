package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᤞᲁᲀᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0686 extends AbstractC1701 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f2570;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object f2571;

    public /* synthetic */ C0686(int i, Object obj) {
        this.f2570 = i;
        this.f2571 = obj;
    }

    @Override // p000.AbstractC1701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo2067() {
        switch (this.f2570) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, ᛱᛲᛳᛴᛵᛶᛷᤝᲈᲀᤞᲇᛸᲁ] */
    @Override // p000.AbstractC1701
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void mo2068(Throwable th) throws C1071 {
        switch (this.f2570) {
            case 0:
                C0558 c0558 = (C0558) this.f2571;
                C1705 c1705 = this.f5786;
                if (c1705 == null) {
                    c1705 = null;
                }
                Throwable thMo1948 = c0558.mo1948(c1705);
                if (c0558.m1951()) {
                    C1072 c1072 = (C1072) c0558.f2287;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1072.f3886;
                    while (true) {
                        Object obj = atomicReferenceFieldUpdater.get(c1072);
                        C1172 c1172 = AbstractC2203.f7167;
                        if (AbstractC2207.m4087(obj, c1172)) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(c1072, c1172, thMo1948)) {
                                if (atomicReferenceFieldUpdater.get(c1072) != c1172) {
                                }
                            }
                            break;
                        } else if (obj instanceof Throwable) {
                            break;
                        } else {
                            while (true) {
                                if (!atomicReferenceFieldUpdater.compareAndSet(c1072, obj, null)) {
                                    if (atomicReferenceFieldUpdater.get(c1072) != obj) {
                                    }
                                }
                            }
                        }
                    }
                }
                c0558.m1946(thMo1948);
                if (!c0558.m1951()) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0558.f2286;
                    InterfaceC1080 interfaceC1080 = (InterfaceC1080) atomicReferenceFieldUpdater2.get(c0558);
                    if (interfaceC1080 != null) {
                        interfaceC1080.mo2648();
                        atomicReferenceFieldUpdater2.set(c0558, C2228.f7225);
                        break;
                    }
                }
                break;
            case 1:
                this.f2571.invoke(th);
                break;
            default:
                C1702 c1702 = (C1702) this.f2571;
                C1705 c1706 = this.f5786;
                if (c1706 == null) {
                    c1706 = null;
                }
                c1706.getClass();
                Object obj2 = C1705.f5796.get(c1706);
                if (!(obj2 instanceof C0760)) {
                    c1702.mo933(AbstractC1458.m3171(obj2));
                } else {
                    c1702.mo933(new C2585(((C0760) obj2).f2861));
                }
                break;
        }
    }
}
