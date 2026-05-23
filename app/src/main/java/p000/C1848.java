package p000;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1848 {

    public static final /* synthetic */ AtomicReferenceFieldUpdater f6150 = AtomicReferenceFieldUpdater.newUpdater(C1848.class, Object.class, "_next$volatile");

    public static final /* synthetic */ AtomicReferenceFieldUpdater f6151 = AtomicReferenceFieldUpdater.newUpdater(C1848.class, Object.class, "_prev$volatile");

    public static final /* synthetic */ AtomicReferenceFieldUpdater f6152 = AtomicReferenceFieldUpdater.newUpdater(C1848.class, Object.class, "_removedRef$volatile");
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    public String toString() {
        return new C1847(this, AbstractC0968.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + AbstractC0968.m2473(this);
    }

    public final boolean m3606(C1848 c1848, int i) {
        while (true) {
            C1848 c1848M3607 = m3607();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6151;
            if (c1848M3607 == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    c1848M3607 = (C1848) obj;
                    if (!c1848M3607.mo3610()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1848M3607);
                }
            }
            if (c1848M3607 instanceof C1810) {
                return (((C1810) c1848M3607).f6047 & i) == 0 && c1848M3607.m3606(c1848, i);
            }
            atomicReferenceFieldUpdater.set(c1848, c1848M3607);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6150;
            atomicReferenceFieldUpdater2.set(c1848, this);
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(c1848M3607, this, c1848)) {
                    c1848.m3608(this);
                    return true;
                }
            } while (atomicReferenceFieldUpdater2.get(c1848M3607) == this);
        }
    }

    public final C1848 m3607() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f6151;
            C1848 c1848 = (C1848) atomicReferenceFieldUpdater2.get(this);
            C1848 c1849 = c1848;
            while (true) {
                C1848 c18410 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f6150;
                    obj = atomicReferenceFieldUpdater.get(c1849);
                    if (obj == this) {
                        if (c1848 == c1849) {
                            return c1849;
                        }
                        while (!atomicReferenceFieldUpdater2.compareAndSet(this, c1848, c1849)) {
                            if (atomicReferenceFieldUpdater2.get(this) != c1848) {
                                break;
                            }
                        }
                        return c1849;
                    }
                    if (mo3610()) {
                        return null;
                    }
                    if (!(obj instanceof C2543)) {
                        c18410 = c1849;
                        c1849 = (C1848) obj;
                    } else {
                        if (c18410 != null) {
                            break;
                        }
                        c1849 = (C1848) atomicReferenceFieldUpdater2.get(c1849);
                    }
                }
                C1848 c18411 = ((C2543) obj).f8099;
                while (!atomicReferenceFieldUpdater.compareAndSet(c18410, c1849, c18411)) {
                    if (atomicReferenceFieldUpdater.get(c18410) != c1849) {
                        break;
                    }
                }
                c1849 = c18410;
            }
        }
    }

    public final void m3608(C1848 c1848) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f6151;
            C1848 c1849 = (C1848) atomicReferenceFieldUpdater.get(c1848);
            if (f6150.get(this) != c1848) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c1848, c1849, this)) {
                    if (mo3610()) {
                        c1848.m3607();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c1848) == c1849);
        }
    }

    public final C1848 m3609() {
        C1848 c1848;
        Object obj = f6150.get(this);
        C2543 c2543 = obj instanceof C2543 ? (C2543) obj : null;
        return (c2543 == null || (c1848 = c2543.f8099) == null) ? (C1848) obj : c1848;
    }

    public boolean mo3610() {
        return f6150.get(this) instanceof C2543;
    }
}
