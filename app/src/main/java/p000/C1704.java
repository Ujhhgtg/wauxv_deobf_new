package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1704 implements InterfaceC1624 {

    public static final /* synthetic */ AtomicIntegerFieldUpdater f5792 = AtomicIntegerFieldUpdater.newUpdater(C1704.class, "_isCompleting$volatile");

    public static final /* synthetic */ AtomicReferenceFieldUpdater f5793 = AtomicReferenceFieldUpdater.newUpdater(C1704.class, Object.class, "_rootCause$volatile");

    public static final /* synthetic */ AtomicReferenceFieldUpdater f5794 = AtomicReferenceFieldUpdater.newUpdater(C1704.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    public final C2226 f5795;

    public C1704(C2226 c2226, Throwable th) {
        this.f5795 = c2226;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m3444());
        sb.append(", completing=");
        sb.append(f5792.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m3443());
        sb.append(", exceptions=");
        sb.append(f5794.get(this));
        sb.append(", list=");
        sb.append(this.f5795);
        sb.append(']');
        return sb.toString();
    }

    public final void m3442(Throwable th) {
        Throwable thM3443 = m3443();
        if (thM3443 == null) {
            f5793.set(this, th);
            return;
        }
        if (th == thM3443) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5794;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    @Override // p000.InterfaceC1624
    public final boolean mo2771() {
        return m3443() == null;
    }

    @Override // p000.InterfaceC1624
    public final C2226 mo2772() {
        return this.f5795;
    }

    public final Throwable m3443() {
        return (Throwable) f5793.get(this);
    }

    public final boolean m3444() {
        return m3443() != null;
    }

    public final ArrayList m3445(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5794;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thM3443 = m3443();
        if (thM3443 != null) {
            arrayList.add(0, thM3443);
        }
        if (th != null && !th.equals(thM3443)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1458.f5189);
        return arrayList;
    }
}
