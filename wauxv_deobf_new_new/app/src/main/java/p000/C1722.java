package p000;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲁᛸᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1722 implements InterfaceC1637 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f5835 = AtomicIntegerFieldUpdater.newUpdater(C1722.class, "_isCompleting$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5836 = AtomicReferenceFieldUpdater.newUpdater(C1722.class, Object.class, "_rootCause$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5837 = AtomicReferenceFieldUpdater.newUpdater(C1722.class, Object.class, "_exceptionsHolder$volatile");
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C2256 f5838;

    public C1722(C2256 c2256, Throwable th) {
        this.f5838 = c2256;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Finishing[cancelling=");
        sb.append(m3612());
        sb.append(", completing=");
        sb.append(f5835.get(this) == 1);
        sb.append(", rootCause=");
        sb.append(m3611());
        sb.append(", exceptions=");
        sb.append(f5837.get(this));
        sb.append(", list=");
        sb.append(this.f5838);
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m3610(Throwable th) {
        Throwable thM3611 = m3611();
        if (thM3611 == null) {
            f5836.set(this, th);
            return;
        }
        if (th == thM3611) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5837;
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

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo2915() {
        return m3611() == null;
    }

    @Override // p000.InterfaceC1637
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final C2256 mo2916() {
        return this.f5838;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final Throwable m3611() {
        return (Throwable) f5836.get(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean m3612() {
        return m3611() != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final ArrayList m3613(Throwable th) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5837;
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
        Throwable thM3611 = m3611();
        if (thM3611 != null) {
            arrayList.add(0, thM3611);
        }
        if (th != null && !th.equals(thM3611)) {
            arrayList.add(th);
        }
        atomicReferenceFieldUpdater.set(this, AbstractC1272.f4643);
        return arrayList;
    }
}
