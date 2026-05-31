package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᛸᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1874 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6224 = AtomicReferenceFieldUpdater.newUpdater(C1874.class, Object.class, "_next$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6225 = AtomicReferenceFieldUpdater.newUpdater(C1874.class, Object.class, "_prev$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6226 = AtomicReferenceFieldUpdater.newUpdater(C1874.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public String toString() {
        return new C1873(this, AbstractC0972.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0972.m2594(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m3784(C1874 c1874, int i) {
        while (true) {
            C1874 c1874M3785 = m3785();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6225;
            if (c1874M3785 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c1874M3785 = (C1874) obj;
                    if (!c1874M3785.mo3788()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1874M3785);
                }
            }
            if (c1874M3785 instanceof C1837) {
                return (((C1837) c1874M3785).f6122 & i) == 0 && c1874M3785.m3784(c1874, i);
            }
            atomicReferenceFieldUpdater.set(c1874, c1874M3785);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6224;
            atomicReferenceFieldUpdater2.set(c1874, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c1874M3785, this, c1874)) {
                    c1874.m3786(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c1874M3785) == this);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final C1874 m3785() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6225;
            C1874 c1874 = (C1874) atomicReferenceFieldUpdater2.get(this);
            C1874 c1875 = c1874;
            while (true) {
                C1874 c1876 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f6224;
                    obj = atomicReferenceFieldUpdater.get(c1875);
                    if (obj == this) {
                        if (c1874 == c1875) {
                            return c1875;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1874, c1875)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c1874) {
                                break;
                            }
                        }
                        return c1875;
                    }
                    if (mo3788()) {
                        return null;
                    }
                    if (!(obj instanceof C2600)) {
                        c1876 = c1875;
                        c1875 = (C1874) obj;
                    } else {
                        if (c1876 != null) {
                            break;
                        }
                        c1875 = (C1874) atomicReferenceFieldUpdater2.get(c1875);
                    }
                }
                C1874 c1877 = ((C2600) obj).f8253;
                while (!atomicReferenceFieldUpdater.compareAndSet(c1876, c1875, c1877)) {
                    if (atomicReferenceFieldUpdater.get(c1876) != c1875) {
                        break;
                    }
                }
                c1875 = c1876;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m3786(C1874 c1874) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6225;
            C1874 c1875 = (C1874) atomicReferenceFieldUpdater.get(c1874);
            if (f6224.get(this) != c1874) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c1874, c1875, this)) {
                    if (mo3788()) {
                        c1874.m3785();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c1874) == c1875);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C1874 m3787() {
        C1874 c1874;
        Object obj = f6224.get(this);
        C2600 c2600 = obj instanceof C2600 ? (C2600) obj : null;
        return (c2600 == null || (c1874 = c2600.f8253) == null) ? (C1874) obj : c1874;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public boolean mo3788() {
        return f6224.get(this) instanceof C2600;
    }
}
