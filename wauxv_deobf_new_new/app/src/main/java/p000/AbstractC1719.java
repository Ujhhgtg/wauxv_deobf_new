package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲀᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1719 extends C1874 implements InterfaceC1085, InterfaceC1637 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public C1723 f5829;

    @Override // p000.C1874
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0972.m2594(this));
        sb.append("[job@");
        C1723 c1723 = this.f5829;
        if (c1723 == null) {
            c1723 = null;
        }
        sb.append(AbstractC0972.m2594(c1723));
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2915() {
        return true;
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C2256 mo2916() {
        return null;
    }

    @Override // p000.InterfaceC1085
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2774() {
        C1723 c1723 = this.f5829;
        if (c1723 == null) {
            c1723 = null;
        }
        c1723.getClass();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1723.f5839;
            Object obj = atomicReferenceFieldUpdater.get(c1723);
            if (obj instanceof AbstractC1719) {
                if (obj != this) {
                    return;
                }
                C1187 c1187 = AbstractC1272.f4645;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1723, obj, c1187)) {
                    if (atomicReferenceFieldUpdater.get(c1723) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1637) || ((InterfaceC1637) obj).mo2916() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1874.f6224;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2600) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C1874 c1874 = (C1874) obj2;
                c1874.getClass();
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1874.f6226;
                C2600 c2600 = (C2600) atomicReferenceFieldUpdater3.get(c1874);
                if (c2600 == null) {
                    c2600 = new C2600(c1874);
                    atomicReferenceFieldUpdater3.set(c1874, c2600);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2600)) {
                        c1874.m3785();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public abstract boolean mo2162();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract void mo2163(Throwable th);
}
