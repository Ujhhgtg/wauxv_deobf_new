package p000;

import com.alibaba.fastjson2.JSONWriter;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲇᤞᲀᤝᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0558 extends AbstractC1074 implements InterfaceC0842, InterfaceC0885 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2284 = AtomicIntegerFieldUpdater.newUpdater(C0558.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2285 = AtomicReferenceFieldUpdater.newUpdater(C0558.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f2286 = AtomicReferenceFieldUpdater.newUpdater(C0558.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0842 f2287;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final InterfaceC0877 f2288;

    public C0558(InterfaceC0842 interfaceC0842) {
        super(1);
        this.f2287 = interfaceC0842;
        this.f2288 = interfaceC0842.mo934();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = C0140.f1134;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m1938(C0555 c0555, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + c0555 + ", already has " + obj).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static void m1939(C0558 c0558, Object obj, int i) throws C1071 {
        Object c0758;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2285;
            Object obj2 = atomicReferenceFieldUpdater.get(c0558);
            if (!(obj2 instanceof InterfaceC2229)) {
                if (obj2 instanceof C0559) {
                    if (C0559.f2289.compareAndSet((C0559) obj2, 0, 1)) {
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            InterfaceC2229 interfaceC2229 = (InterfaceC2229) obj2;
            if (!(obj instanceof C0760) && ((i == 1 || i == 2) && (interfaceC2229 instanceof C0555))) {
                c0758 = new C0758(obj, interfaceC2229 instanceof C0555 ? (C0555) interfaceC2229 : null, null, 16);
            } else {
                c0758 = obj;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(c0558, obj2, c0758)) {
                    if (!c0558.m1951()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2286;
                        InterfaceC1080 interfaceC1080 = (InterfaceC1080) atomicReferenceFieldUpdater2.get(c0558);
                        if (interfaceC1080 != null) {
                            interfaceC1080.mo2648();
                            atomicReferenceFieldUpdater2.set(c0558, C2228.f7225);
                        }
                    }
                    c0558.m1947(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(c0558) == obj2);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(mo1952());
        sb.append('(');
        sb.append(AbstractC0968.m2489(this.f2287));
        sb.append("){");
        Object obj = f2285.get(this);
        if (obj instanceof InterfaceC2229) {
            str = "Active";
        } else {
            str = obj instanceof C0559 ? "Cancelled" : "Completed";
        }
        sb.append(str);
        sb.append("}@");
        sb.append(AbstractC0968.m2473(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC0885
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC0885 mo1491() {
        InterfaceC0842 interfaceC0842 = this.f2287;
        if (interfaceC0842 instanceof InterfaceC0885) {
            return (InterfaceC0885) interfaceC0842;
        }
        return null;
    }

    @Override // p000.AbstractC1074
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void mo1940(CancellationException cancellationException) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2285;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof InterfaceC2229) {
                throw new IllegalStateException("Not completed");
            }
            if (obj instanceof C0760) {
                return;
            }
            if (!(obj instanceof C0758)) {
                C0758 c0758 = new C0758(obj, null, cancellationException, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0758)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            C0758 c0759 = (C0758) obj;
            if (c0759.f2858 != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            C0758 c0758M2227 = C0758.m2227(c0759, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0758M2227)) {
                    C0555 c0555 = c0759.f2855;
                    if (c0555 != null) {
                        m1945(c0555, cancellationException);
                    }
                    InterfaceC1430 interfaceC1430 = c0759.f2856;
                    if (interfaceC1430 != null) {
                        Object obj2 = c0759.f2854;
                        InterfaceC0877 interfaceC0877 = this.f2288;
                        try {
                            interfaceC1430.mo3133(cancellationException, obj2, interfaceC0877);
                            return;
                        } catch (Throwable th) {
                            AbstractC3681.m5328(interfaceC0877, new C0761("Exception in resume onCancellation handler for " + this, th));
                            return;
                        }
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo933(Object obj) throws C1071 {
        Throwable thM4594 = C2586.m4594(obj);
        if (thM4594 != null) {
            obj = new C0760(thM4594, false);
        }
        m1939(this, obj, this.f3892);
    }

    @Override // p000.AbstractC1074
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0842 mo1941() {
        return this.f2287;
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public final InterfaceC0877 mo934() {
        return this.f2288;
    }

    @Override // p000.AbstractC1074
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Throwable mo1942(Object obj) {
        Throwable thMo1942 = super.mo1942(obj);
        if (thMo1942 != null) {
            return thMo1942;
        }
        return null;
    }

    @Override // p000.AbstractC1074
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final Object mo1943(Object obj) {
        return obj instanceof C0758 ? ((C0758) obj).f2854 : obj;
    }

    @Override // p000.AbstractC1074
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Object mo1944() {
        return f2285.get(this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final void m1945(C0555 c0555, Throwable th) {
        try {
            switch (c0555.f2279) {
                case 0:
                    ((C1514) c0555.f2280).invoke(th);
                    break;
                default:
                    ((InterfaceC1080) c0555.f2280).mo2648();
                    break;
            }
        } catch (Throwable th2) {
            AbstractC3681.m5328(this.f2288, new C0761("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final void m1946(Throwable th) throws C1071 {
        Throwable cancellationException;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f2285;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof InterfaceC2229)) {
                return;
            }
            boolean z = obj instanceof C0555;
            if (th == null) {
                cancellationException = new CancellationException("Continuation " + this + " was cancelled normally");
            } else {
                cancellationException = th;
            }
            C0559 c0559 = new C0559(cancellationException, z);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, c0559)) {
                    if (((InterfaceC2229) obj) instanceof C0555) {
                        m1945((C0555) obj, th);
                    }
                    if (!m1951()) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2286;
                        InterfaceC1080 interfaceC1080 = (InterfaceC1080) atomicReferenceFieldUpdater2.get(this);
                        if (interfaceC1080 != null) {
                            interfaceC1080.mo2648();
                            atomicReferenceFieldUpdater2.set(this, C2228.f7225);
                        }
                    }
                    m1947(this.f3892);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m1947(int i) throws C1071 {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i2;
        do {
            atomicIntegerFieldUpdater = f2284;
            i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = i2 >> 29;
            if (i3 != 0) {
                if (i3 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z = i == 4;
                InterfaceC0842 interfaceC0842 = this.f2287;
                if (!z && (interfaceC0842 instanceof C1072)) {
                    boolean z2 = i == 1 || i == 2;
                    int i4 = this.f3892;
                    if (z2 == (i4 == 1 || i4 == 2)) {
                        C1072 c1072 = (C1072) interfaceC0842;
                        AbstractC0878 abstractC0878 = c1072.f3887;
                        InterfaceC0877 interfaceC0877 = c1072.f3888.f3249;
                        try {
                            if (abstractC0878.mo2393(interfaceC0877)) {
                                AbstractC2203.m4039(abstractC0878, interfaceC0877, this);
                                return;
                            }
                            AbstractC1235 abstractC1235M4921 = AbstractC2920.m4921();
                            if (abstractC1235M4921.f4463 >= JSONWriter.MASK_IGNORE_NON_FIELD_GETTER) {
                                C0256 c0256 = abstractC1235M4921.f4465;
                                if (c0256 == null) {
                                    c0256 = new C0256();
                                    abstractC1235M4921.f4465 = c0256;
                                }
                                c0256.addLast(this);
                                return;
                            }
                            abstractC1235M4921.m2874(true);
                            try {
                                AbstractC2207.m4112(this, interfaceC0842, true);
                                do {
                                } while (abstractC1235M4921.m2875());
                            } catch (Throwable th) {
                                try {
                                    m2637(th);
                                } finally {
                                    abstractC1235M4921.m2873();
                                }
                            }
                            return;
                        } catch (Throwable th2) {
                            throw new C1071(th2, abstractC0878, interfaceC0877);
                        }
                    }
                }
                AbstractC2207.m4112(this, interfaceC0842, z);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, 1073741824 + (536870911 & i2)));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public Throwable mo1948(C1705 c1705) {
        return c1705.mo3440();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Object m1949() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        InterfaceC1698 interfaceC1698;
        boolean zM1951 = m1951();
        do {
            atomicIntegerFieldUpdater = f2284;
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zM1951) {
                    m1953();
                }
                Object obj = f2285.get(this);
                if (obj instanceof C0760) {
                    throw ((C0760) obj).f2861;
                }
                int i3 = this.f3892;
                if ((i3 != 1 && i3 != 2) || (interfaceC1698 = (InterfaceC1698) this.f2288.mo942(C1133.f4207)) == null || interfaceC1698.mo3437()) {
                    return mo1943(obj);
                }
                CancellationException cancellationExceptionMo3440 = interfaceC1698.mo3440();
                mo1940(cancellationExceptionMo3440);
                throw cancellationExceptionMo3440;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((InterfaceC1080) f2286.get(this)) == null) {
            m1950();
        }
        if (zM1951) {
            m1953();
        }
        return EnumC0884.f3325;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final InterfaceC1080 m1950() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        InterfaceC1698 interfaceC1698 = (InterfaceC1698) this.f2288.mo942(C1133.f4207);
        if (interfaceC1698 == null) {
            return null;
        }
        InterfaceC1080 interfaceC1080M4999 = AbstractC3453.m4999(interfaceC1698, true, new C0686(0, this));
        do {
            atomicReferenceFieldUpdater = f2286;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, interfaceC1080M4999)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return interfaceC1080M4999;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean m1951() {
        if (this.f3892 != 2) {
            return false;
        }
        C1072 c1072 = (C1072) this.f2287;
        c1072.getClass();
        return C1072.f3886.get(c1072) != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public String mo1952() {
        return "CancellableContinuation";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final void m1953() throws C1071 {
        InterfaceC0842 interfaceC0842 = this.f2287;
        Throwable th = null;
        C1072 c1072 = interfaceC0842 instanceof C1072 ? (C1072) interfaceC0842 : null;
        if (c1072 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1072.f3886;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(c1072);
                C1172 c1172 = AbstractC2203.f7167;
                if (obj != c1172) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(c1072, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(c1072) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(c1072, c1172, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(c1072) == c1172);
            }
            if (th == null) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f2286;
            InterfaceC1080 interfaceC1080 = (InterfaceC1080) atomicReferenceFieldUpdater2.get(this);
            if (interfaceC1080 != null) {
                interfaceC1080.mo2648();
                atomicReferenceFieldUpdater2.set(this, C2228.f7225);
            }
            m1946(th);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public final void m1954(AbstractC0878 abstractC0878) throws C1071 {
        InterfaceC0842 interfaceC0842 = this.f2287;
        C1072 c1072 = interfaceC0842 instanceof C1072 ? (C1072) interfaceC0842 : null;
        m1939(this, C3497.f10997, (c1072 != null ? c1072.f3887 : null) == abstractC0878 ? 4 : this.f3892);
    }
}
