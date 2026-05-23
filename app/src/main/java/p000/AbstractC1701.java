package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᲈᲁᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1701 extends C1848 implements InterfaceC1080, InterfaceC1624 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public C1705 f5786;

    @Override // p000.C1848
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(AbstractC0968.m2473(this));
        sb.append("[job@");
        C1705 c1705 = this.f5786;
        if (c1705 == null) {
            c1705 = null;
        }
        sb.append(AbstractC0968.m2473(c1705));
        sb.append(']');
        return sb.toString();
    }

    @Override // p000.InterfaceC1624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2771() {
        return true;
    }

    @Override // p000.InterfaceC1624
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C2226 mo2772() {
        return null;
    }

    @Override // p000.InterfaceC1080
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo2648() {
        C1705 c1705 = this.f5786;
        if (c1705 == null) {
            c1705 = null;
        }
        
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1705.f5796;
            Object obj = atomicReferenceFieldUpdater.get(c1705);
            if (obj instanceof AbstractC1701) {
                if (obj != this) {
                    return;
                }
                C1185 c1185 = AbstractC1458.f5191;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1705, obj, c1185)) {
                    if (atomicReferenceFieldUpdater.get(c1705) != obj) {
                    }
                }
                return;
            }
            if (!(obj instanceof InterfaceC1624) || ((InterfaceC1624) obj).mo2772() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1848.f6150;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof C2543) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                C1848 c1848 = (C1848) obj2;
                
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = C1848.f6152;
                C2543 c2543 = (C2543) atomicReferenceFieldUpdater3.get(c1848);
                if (c2543 == null) {
                    c2543 = new C2543(c1848);
                    atomicReferenceFieldUpdater3.set(c1848, c2543);
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj2, c2543)) {
                        c1848.m3607();
                        return;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj2);
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public abstract boolean mo2067();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public abstract void mo2068(Throwable th);
}
