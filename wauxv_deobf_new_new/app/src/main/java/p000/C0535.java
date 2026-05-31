package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤝᤞᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0535 extends AbstractC1079 implements InterfaceC0841, InterfaceC0884 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2240 = AtomicIntegerFieldUpdater.newUpdater(C0535.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2241 = AtomicReferenceFieldUpdater.newUpdater(C0535.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2242 = AtomicReferenceFieldUpdater.newUpdater(C0535.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final InterfaceC0841 f2243;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0876 f2244;

    public C0535(InterfaceC0841 interfaceC0841) {
        super(1);
        this.f2243 = interfaceC0841;
        this.f2244 = interfaceC0841.mo1078();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0148.f1202;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m2033(C0532 c0532, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0532 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static void m2034(C0535 c0535, Object obj, int i) throws C1076 {
        Object c0755;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241;
            Object obj2 = atomicReferenceFieldUpdater.get(c0535);
            if (!(obj2 instanceof InterfaceC2259)) {
                if (obj2 instanceof C0536) {
                    if (C0536.f2245.compareAndSet((C0536) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC2259 interfaceC2259 = (InterfaceC2259) obj2;
            if (!(obj instanceof C0757) && ((i == 1 || i == 2) && (interfaceC2259 instanceof C0532))) {
                c0755 = new C0755(obj, interfaceC2259 instanceof C0532 ? (C0532) interfaceC2259 : null, null, 16);
            } else {
                c0755 = obj;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0535, obj2, c0755)) {
                    if (!c0535.m2046()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2242;
                        InterfaceC1085 interfaceC1085 = (InterfaceC1085) atomicReferenceFieldUpdater2.get(c0535);
                        if (interfaceC1085 != null) {
                            interfaceC1085.mo2774();
                            atomicReferenceFieldUpdater2.set(c0535, C2258.f7344);
                        }
                    }
                    c0535.m2042(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0535) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo2047());
        sb.append('(');
        sb.append(AbstractC0972.m2607(this.f2243));
        sb.append("){");
        Object obj = f2241.get(this);
        if (obj instanceof InterfaceC2259) {
            str = "Active";
        } else {
            str = obj instanceof C0536 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0972.m2594(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC0884
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC0884 mo1596() {
        InterfaceC0841 interfaceC0841 = this.f2243;
        if (interfaceC0841 instanceof InterfaceC0884) {
            return (InterfaceC0884) interfaceC0841;
        }
        return null;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo2035(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC2259) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0757) {
                return;
            }
            C0532 c0532 = null;
            if (!(obj instanceof C0755)) {
                C0755 c0755 = new C0755(obj, c0532, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0755)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0755 c0756 = (C0755) obj;
            if (c0756.f2858 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0755 c0755M2328 = C0755.m2328(c0756, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0755M2328)) {
                    C0532 c0533 = c0756.f2855;
                    if (c0533 != null) {
                        m2040(c0533, cancellationException);
                    }
                    InterfaceC1438 interfaceC1438 = c0756.f2856;
                    if (interfaceC1438 != null) {
                        Object obj2 = c0756.f2854;
                        InterfaceC0876 interfaceC0876 = this.f2244;
                        try {
                            interfaceC1438.mo2135(cancellationException, obj2, interfaceC0876);
                            return;
                        } catch (Throwable th) {
                            AbstractC2236.m4233(interfaceC0876, new C0758("Exception in resume onCancellation handler for " + this, th));
                            return;
                        }
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1077(Object obj) throws C1076 {
        Throwable thM4616 = C2642.m4616(obj);
        if (thM4616 != null) {
            obj = new C0757(thM4616, false);
        }
        m2034(this, obj, this.f3903);
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0841 mo2036() {
        return this.f2243;
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0876 mo1078() {
        return this.f2244;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Throwable mo2037(Object obj) {
        Throwable thMo2037 = super.mo2037(obj);
        if (thMo2037 != null) {
            return thMo2037;
        }
        return null;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object mo2038(Object obj) {
        return obj instanceof C0755 ? ((C0755) obj).f2854 : obj;
    }

    @Override // p000.AbstractC1079
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object mo2039() {
        return f2241.get(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m2040(C0532 c0532, Throwable th) {
        try {
            switch (c0532.f2235) {
                case 0:
                    ((C1526) c0532.f2236).invoke(th);
                    break;
                default:
                    ((InterfaceC1085) c0532.f2236).mo2774();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC2236.m4233(this.f2244, new C0758("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m2041(Throwable th) throws C1076 {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2241;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2259)) {
                return;
            }
            boolean z = obj instanceof C0532;
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0536 c0536 = new C0536(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0536)) {
                    if (((InterfaceC2259) obj) instanceof C0532) {
                        m2040((C0532) obj, th);
                    }
                    if (!m2046()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2242;
                        InterfaceC1085 interfaceC1085 = (InterfaceC1085) atomicReferenceFieldUpdater2.get(this);
                        if (interfaceC1085 != null) {
                            interfaceC1085.mo2774();
                            atomicReferenceFieldUpdater2.set(this, C2258.f7344);
                        }
                    }
                    m2042(this.f3903);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m2042(int i) throws C1076 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f2240;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC0841 interfaceC0841 = this.f2243;
                if (!z && (interfaceC0841 instanceof C1077)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f3903;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C1077 c1077 = (C1077) interfaceC0841;
                        AbstractC0877 abstractC0877 = c1077.f3898;
                        InterfaceC0876 interfaceC0876 = c1077.f3899.f3256;
                        try {
                            if (abstractC0877.mo2510(interfaceC0876)) {
                                AbstractC2235.m4213(abstractC0877, interfaceC0876, this);
                                return;
                            }
                            AbstractC1237 abstractC1237M4983 = AbstractC2979.m4983();
                            if (abstractC1237M4983.f4461 >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                                C0266 c0266 = abstractC1237M4983.f4463;
                                if (c0266 == null) {
                                    c0266 = new C0266();
                                    abstractC1237M4983.f4463 = c0266;
                                }
                                c0266.addLast(this);
                                return;
                            }
                            abstractC1237M4983.m2996(true);
                            try {
                                AbstractC1470.m3369(this, interfaceC0841, true);
                                do {
                                } while (abstractC1237M4983.m2997());
                            } catch (Throwable th) {
                                try {
                                    m2763(th);
                                } finally {
                                    abstractC1237M4983.m2995();
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            throw new C1076(th2, abstractC0877, interfaceC0876);
                        }
                    }
                }
                AbstractC1470.m3369(this, interfaceC0841, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Throwable mo2043(C1723 c1723) {
        return c1723.mo3608();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Object m2044() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC1716 interfaceC1716;
        boolean zM2046 = m2046();
        do {
            atomicIntegerFieldUpdater = f2240;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM2046) {
                    m2048();
                }
                Object obj = f2241.get(this);
                if (obj instanceof C0757) {
                    throw ((C0757) obj).f2861;
                }
                int i3 = this.f3903;
                if ((i3 != 1 && i3 != 2) || (interfaceC1716 = (InterfaceC1716) this.f2244.mo1086(C1139.f4219)) == null || interfaceC1716.mo3605()) {
                    return mo2038(obj);
                }
                CancellationException cancellationExceptionMo3608 = interfaceC1716.mo3608();
                mo2035(cancellationExceptionMo3608);
                throw cancellationExceptionMo3608;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC1085) f2242.get(this)) == null) {
            m2045();
        }
        if (zM2046) {
            m2048();
        }
        return EnumC0883.f3332;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final InterfaceC1085 m2045() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1716 interfaceC1716 = (InterfaceC1716) this.f2244.mo1086(C1139.f4219);
        if (interfaceC1716 == null) {
            return null;
        }
        InterfaceC1085 interfaceC1085M3396 = AbstractC1471.m3396(interfaceC1716, true, new C0677(this, 0));
        do {
            atomicReferenceFieldUpdater = f2242;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC1085M3396)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC1085M3396;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m2046() {
        if (this.f3903 != 2) {
            return false;
        }
        C1077 c1077 = (C1077) this.f2243;
        c1077.getClass();
        return C1077.f3897.get(c1077) != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public String mo2047() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m2048() throws C1076 {
        InterfaceC0841 interfaceC0841 = this.f2243;
        Throwable th = null;
        C1077 c1077 = interfaceC0841 instanceof C1077 ? (C1077) interfaceC0841 : null;
        if (c1077 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1077.f3897;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1077);
                C1174 c1174 = AbstractC2235.f7287;
                if (obj != c1174) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1077, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1077) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c1077, c1174, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c1077) == c1174);
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2242;
            InterfaceC1085 interfaceC1085 = (InterfaceC1085) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC1085 != null) {
                interfaceC1085.mo2774();
                atomicReferenceFieldUpdater2.set(this, C2258.f7344);
            }
            m2041(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m2049(AbstractC0877 abstractC0877) throws C1076 {
        InterfaceC0841 interfaceC0841 = this.f2243;
        C1077 c1077 = interfaceC0841 instanceof C1077 ? (C1077) interfaceC0841 : null;
        m2034(this, C3554.UNIT, (c1077 != null ? c1077.f3898 : null) == abstractC0877 ? 4 : this.f3903);
    }
}
