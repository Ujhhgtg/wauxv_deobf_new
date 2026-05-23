package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᛸᲁᲀᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1705 implements InterfaceC1698, InterfaceC2330 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5796 = AtomicReferenceFieldUpdater.newUpdater(C1705.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5797 = AtomicReferenceFieldUpdater.newUpdater(C1705.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C1705(boolean z) {
        this._state$volatile = z ? AbstractC1458.f5191 : AbstractC1458.f5190;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static C0688 m3446(C1848 c1848) {
        while (c1848.mo3610()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1848.f6151;
            C1848 c1848M3607 = c1848.m3607();
            if (c1848M3607 == null) {
                Object obj = atomicReferenceFieldUpdater.get(c1848);
                while (true) {
                    c1848 = (C1848) obj;
                    if (!c1848.mo3610()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1848);
                }
            } else {
                c1848 = c1848M3607;
            }
        }
        while (true) {
            c1848 = c1848.m3609();
            if (!c1848.mo3610()) {
                if (c1848 instanceof C0688) {
                    return (C0688) c1848;
                }
                if (c1848 instanceof C2226) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m3447(Object obj) {
        if (!(obj instanceof C1704)) {
            if (obj instanceof InterfaceC1624) {
                return ((InterfaceC1624) obj).mo2771() ? "Active" : "New";
            }
            return obj instanceof C0760 ? "Cancelled" : "Completed";
        }
        C1704 c1704 = (C1704) obj;
        if (c1704.m3444()) {
            return "Cancelling";
        }
        return C1704.f5792.get(c1704) == 1 ? "Completing" : "Active";
    }

    @Override // p000.InterfaceC0875
    public final InterfaceC0876 getKey() {
        return C1133.f4207;
    }

    @Override // p000.InterfaceC1698
    public final boolean start() {
        int iM3465;
        do {
            iM3465 = m3465(f5796.get(this));
            if (iM3465 == 0) {
                return false;
            }
        } while (iM3465 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m3447(f5796.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0968.m2473(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public boolean mo3437() {
        Object obj = f5796.get(this);
        return (obj instanceof InterfaceC1624) && ((InterfaceC1624) obj).mo2771();
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC0687 mo3438(C1705 c1705) {
        C0688 c0688 = new C0688(c1705);
        c0688.f5786 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5796;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1185) {
                C1185 c1185 = (C1185) obj;
                if (c1185.f4326) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0688)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                m3463(c1185);
            } else {
                boolean z = obj instanceof InterfaceC1624;
                C2228 c2228 = C2228.f7225;
                Throwable thM3443 = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0760 c0760 = obj2 instanceof C0760 ? (C0760) obj2 : null;
                    c0688.mo2068(c0760 != null ? c0760.f2861 : null);
                    return c2228;
                }
                C2226 c2226Mo2772 = ((InterfaceC1624) obj).mo2772();
                if (c2226Mo2772 != null) {
                    if (c2226Mo2772.m3606(c0688, 7)) {
                        break;
                    }
                    boolean zM3606 = c2226Mo2772.m3606(c0688, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C1704) {
                        thM3443 = ((C1704) obj3).m3443();
                    } else {
                        C0760 c0761 = obj3 instanceof C0760 ? (C0760) obj3 : null;
                        if (c0761 != null) {
                            thM3443 = c0761.f2861;
                        }
                    }
                    c0688.mo2068(thM3443);
                    if (zM3606) {
                        break;
                    }
                    return c2228;
                }
                m3464((AbstractC1701) obj);
            }
        }
        return c0688;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo2636(Object obj) {
        mo2635(obj);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:2: B:59:0x00b6->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[PHI: r0
      0x003c: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v13 java.lang.Object) binds: [B:3:0x0006, B:16:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x005a  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x005f A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x004d, B:29:0x005f, B:34:0x0067, B:40:0x007e, B:38:0x0074, B:39:0x0078), top: B:84:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0067 A[Catch: all -> 0x0065, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x004d, B:29:0x005f, B:34:0x0067, B:40:0x007e, B:38:0x0074, B:39:0x0078), top: B:84:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0072 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0074 A[Catch: all -> 0x0065, TryCatch #0 {, blocks: (B:24:0x004d, B:29:0x005f, B:34:0x0067, B:40:0x007e, B:38:0x0074, B:39:0x0078), top: B:84:0x004d }] */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:62:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0107 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:82:0x0108  */
    /* JADX WARN: Code duplicated, block: B:84:0x004d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00dd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x00db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x0042 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x0040, please report this as an issue */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean m3448(Object obj) {
        Throwable thM3452;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z;
        Throwable thM3443;
        C1172 c1172;
        InterfaceC1624 interfaceC1624;
        C2226 c2226M3455;
        C1704 c1704;
        Object objM3466;
        Object objM3467 = AbstractC1458.f5185;
        if (this instanceof C2857) {
            do {
                Object obj3 = f5796.get(this);
                if (obj3 instanceof InterfaceC1624) {
                    if (obj3 instanceof C1704) {
                        if (C1704.f5792.get((C1704) obj3) == 1) {
                        }
                    }
                    objM3467 = m3466(obj3, new C0760(m3452(obj), false));
                }
                objM3467 = AbstractC1458.f5185;
                break;
            } while (objM3467 == AbstractC1458.f5187);
            if (objM3467 != AbstractC1458.f5186) {
                if (true) {
                    thM3452 = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f5796;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C1704) {
                            synchronized (obj2) {
                                if (C1704.f5794.get((C1704) obj2) == AbstractC1458.f5189) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c1172 = AbstractC1458.f5188;
                                } else {
                                    boolean zM3444 = ((C1704) obj2).m3444();
                                    if (obj == null || !zM3444) {
                                        if (thM3452 == null) {
                                            thM3452 = m3452(obj);
                                        }
                                        ((C1704) obj2).m3442(thM3452);
                                    }
                                    thM3443 = zM3444 ? null : ((C1704) obj2).m3443();
                                    if (thM3443 != null) {
                                        m3461(((C1704) obj2).f5795, thM3443);
                                    }
                                    c1172 = AbstractC1458.f5185;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC1624) {
                            if (thM3452 == null) {
                                thM3452 = m3452(obj);
                            }
                            interfaceC1624 = (InterfaceC1624) obj2;
                            if (interfaceC1624.mo2771()) {
                                c2226M3455 = m3455(interfaceC1624);
                                if (c2226M3455 == null) {
                                    continue;
                                } else {
                                    c1704 = new C1704(c2226M3455, thM3452);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1624, c1704)) {
                                            m3461(c2226M3455, thM3452);
                                            c1172 = AbstractC1458.f5185;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC1624) {
                                        }
                                    }
                                }
                            } else {
                                objM3466 = m3466(obj2, new C0760(thM3452, false));
                                if (objM3466 != AbstractC1458.f5185) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objM3466 != AbstractC1458.f5187) {
                                    objM3467 = objM3466;
                                    break;
                                }
                            }
                        } else {
                            c1172 = AbstractC1458.f5188;
                        }
                        objM3467 = c1172;
                        break;
                    }
                }
                if (objM3467 != AbstractC1458.f5185 && objM3467 != AbstractC1458.f5186) {
                    if (objM3467 == AbstractC1458.f5188) {
                        return false;
                    }
                    mo2635(objM3467);
                    return true;
                }
            }
        } else {
            if (true) {
                thM3452 = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f5796;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C1704) {
                        synchronized (obj2) {
                            if (C1704.f5794.get((C1704) obj2) == AbstractC1458.f5189) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c1172 = AbstractC1458.f5188;
                            } else {
                                boolean zM3445 = ((C1704) obj2).m3444();
                                if (obj == null) {
                                    if (thM3452 == null) {
                                        thM3452 = m3452(obj);
                                    }
                                    ((C1704) obj2).m3442(thM3452);
                                } else {
                                    if (thM3452 == null) {
                                        thM3452 = m3452(obj);
                                    }
                                    ((C1704) obj2).m3442(thM3452);
                                }
                                if (zM3445) {
                                }
                                if (thM3443 != null) {
                                    m3461(((C1704) obj2).f5795, thM3443);
                                }
                                c1172 = AbstractC1458.f5185;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC1624) {
                        if (thM3452 == null) {
                            thM3452 = m3452(obj);
                        }
                        interfaceC1624 = (InterfaceC1624) obj2;
                        if (interfaceC1624.mo2771()) {
                            c2226M3455 = m3455(interfaceC1624);
                            if (c2226M3455 == null) {
                                continue;
                            } else {
                                c1704 = new C1704(c2226M3455, thM3452);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1624, c1704)) {
                                        m3461(c2226M3455, thM3452);
                                        c1172 = AbstractC1458.f5185;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC1624) {
                                    }
                                }
                            }
                        } else {
                            objM3466 = m3466(obj2, new C0760(thM3452, false));
                            if (objM3466 != AbstractC1458.f5185) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objM3466 != AbstractC1458.f5187) {
                                objM3467 = objM3466;
                                break;
                            }
                        }
                    } else {
                        c1172 = AbstractC1458.f5188;
                    }
                    objM3467 = c1172;
                    break;
                }
            }
            if (objM3467 != AbstractC1458.f5185) {
                if (objM3467 == AbstractC1458.f5188) {
                    return false;
                }
                mo2635(objM3467);
                return true;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final InterfaceC1080 mo3439(boolean z, boolean z2, C1700 c1700) {
        return m3458(z2, z ? new C1673(c1700) : new C0686(1, c1700));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m3449(Throwable th) {
        if (mo3459()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0687 interfaceC0687 = (InterfaceC0687) f5797.get(this);
        if (interfaceC0687 == null || interfaceC0687 == C2228.f7225) {
            return z;
        }
        return interfaceC0687.mo2069(th) || z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public String mo935() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo3450(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m3448(th) && mo3454();
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final CancellationException mo3440() {
        CancellationException cancellationException;
        Object obj = f5796.get(this);
        if (!(obj instanceof C1704)) {
            if (obj instanceof InterfaceC1624) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0760)) {
                return new C1699(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0760) obj).f2861;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C1699(mo935(), th, this) : cancellationException;
        }
        Throwable thM3443 = ((C1704) obj).m3443();
        if (thM3443 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM3443 instanceof CancellationException ? (CancellationException) thM3443 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (false) {
            strConcat = mo935();
        }
        return new C1699(strConcat, thM3443, this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3451(InterfaceC1624 interfaceC1624, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5797;
        InterfaceC0687 interfaceC0687 = (InterfaceC0687) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0687 != null) {
            interfaceC0687.mo2648();
            atomicReferenceFieldUpdater.set(this, C2228.f7225);
        }
        C0761 c0761 = null;
        C0760 c0760 = obj instanceof C0760 ? (C0760) obj : null;
        Throwable th = c0760 != null ? c0760.f2861 : null;
        if (interfaceC1624 instanceof AbstractC1701) {
            try {
                ((AbstractC1701) interfaceC1624).mo2068(th);
                return;
            } catch (Throwable th2) {
                mo936(new C0761("Exception in completion handler " + interfaceC1624 + " for " + this, th2));
                return;
            }
        }
        C2226 c2226Mo2772 = interfaceC1624.mo2772();
        if (c2226Mo2772 != null) {
            c2226Mo2772.m3606(new C1810(1), 1);
            for (C1848 c1848M3609 = (C1848) C1848.f6150.get(c2226Mo2772); !AbstractC2207.m4087(c1848M3609, c2226Mo2772); c1848M3609 = c1848M3609.m3609()) {
                if (c1848M3609 instanceof AbstractC1701) {
                    try {
                        ((AbstractC1701) c1848M3609).mo2068(th);
                    } catch (Throwable th3) {
                        if (c0761 != null) {
                            AbstractC2202.m3992(c0761, th3);
                        } else {
                            c0761 = new C0761("Exception in completion handler " + c1848M3609 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0761 != null) {
                mo936(c0761);
            }
        }
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0877 mo939(InterfaceC0876 interfaceC0876) {
        return AbstractC2207.m4087(C1133.f4207, interfaceC0876) ? C1187.f4327 : this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Throwable m3452(Object obj) {
        Throwable thM3443;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1699(mo935(), null, this) : th;
        }
        C1705 c1705 = (C1705) ((InterfaceC2330) obj);
        
        Object obj2 = f5796.get(c1705);
        if (obj2 instanceof C1704) {
            thM3443 = ((C1704) obj2).m3443();
        } else if (obj2 instanceof C0760) {
            thM3443 = ((C0760) obj2).f2861;
        } else {
            if (obj2 instanceof InterfaceC1624) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM3443 = null;
        }
        CancellationException cancellationException = thM3443 instanceof CancellationException ? (CancellationException) thM3443 : null;
        return cancellationException == null ? new C1699("Parent job is ".concat(m3447(obj2)), thM3443, c1705) : cancellationException;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Object m3453(C1704 c1704, Object obj) {
        Object obj2 = null;
        Throwable c1699 = null;
        C0760 c0760 = obj instanceof C0760 ? (C0760) obj : null;
        Throwable th = c0760 != null ? c0760.f2861 : null;
        synchronized (c1704) {
            c1704.m3444();
            ArrayList<Throwable> arrayListM3445 = c1704.m3445(th);
            if (!arrayListM3445.isEmpty()) {
                for (Object obj3 : arrayListM3445) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c1699 = (Throwable) obj2;
                if (c1699 == null) {
                    c1699 = (Throwable) arrayListM3445.get(0);
                }
            } else if (c1704.m3444()) {
                c1699 = new C1699(mo935(), null, this);
            }
            if (c1699 != null && arrayListM3445.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM3445.size()));
                for (Throwable th2 : arrayListM3445) {
                    if (th2 != c1699 && true && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC2202.m3992(c1699, th2);
                    }
                }
            }
        }
        if (c1699 != null && c1699 != th) {
            obj = new C0760(c1699, false);
        }
        if (c1699 != null && (m3449(c1699) || mo2574(c1699))) {
            C0760 c0761 = (C0760) obj;
            
            C0760.f2860.compareAndSet(c0761, 0, 1);
        }
        mo937(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5796;
        Object c1625 = obj instanceof InterfaceC1624 ? new C1625((InterfaceC1624) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1704, c1625) && atomicReferenceFieldUpdater.get(this) == c1704) {
        }
        m3451(c1704, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean mo3454() {
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2226 m3455(InterfaceC1624 interfaceC1624) {
        C2226 c2226Mo2772 = interfaceC1624.mo2772();
        if (c2226Mo2772 != null) {
            return c2226Mo2772;
        }
        if (interfaceC1624 instanceof C1185) {
            return new C2226();
        }
        if (interfaceC1624 instanceof AbstractC1701) {
            m3464((AbstractC1701) interfaceC1624);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1624).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public boolean mo2574(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m3456(InterfaceC1698 interfaceC1698) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5797;
        C2228 c2228 = C2228.f7225;
        if (interfaceC1698 == null) {
            atomicReferenceFieldUpdater.set(this, c2228);
            return;
        }
        interfaceC1698.start();
        InterfaceC0687 interfaceC0687Mo3438 = interfaceC1698.mo3438(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0687Mo3438);
        if (f5796.get(this) instanceof InterfaceC1624) {
            return;
        }
        interfaceC0687Mo3438.mo2648();
        atomicReferenceFieldUpdater.set(this, c2228);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo940(Object obj, InterfaceC1429 interfaceC1429) {
        return interfaceC1429.mo1196(obj, this);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final InterfaceC0877 mo941(InterfaceC0877 interfaceC0877) {
        return AbstractC2209.m4140(this, interfaceC0877);
    }

    @Override // p000.InterfaceC0877
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0875 mo942(InterfaceC0876 interfaceC0876) {
        if (AbstractC2207.m4087(C1133.f4207, interfaceC0876)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1080 m3457(InterfaceC1425 interfaceC1425) {
        return m3458(true, new C0686(1, interfaceC1425));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1080 m3458(boolean z, AbstractC1701 abstractC1701) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zM3606;
        abstractC1701.f5786 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5796;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C1185;
            C2228 c2228 = C2228.f7225;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1624)) {
                    z2 = false;
                    break;
                }
                InterfaceC1624 interfaceC1624 = (InterfaceC1624) obj;
                C2226 c2226Mo2772 = interfaceC1624.mo2772();
                if (c2226Mo2772 == null) {
                    m3464((AbstractC1701) obj);
                } else {
                    if (abstractC1701.mo2067()) {
                        C1704 c1704 = interfaceC1624 instanceof C1704 ? (C1704) interfaceC1624 : null;
                        Throwable thM3443 = c1704 != null ? c1704.m3443() : null;
                        if (thM3443 == null) {
                            zM3606 = c2226Mo2772.m3606(abstractC1701, 5);
                        } else if (z) {
                            abstractC1701.mo2068(thM3443);
                            return c2228;
                        }
                    } else {
                        zM3606 = c2226Mo2772.m3606(abstractC1701, 1);
                    }
                    if (zM3606) {
                        break;
                    }
                }
            } else {
                C1185 c1185 = (C1185) obj;
                if (c1185.f4326) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1701)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m3463(c1185);
                }
            }
            return c2228;
        }
        if (z2) {
            return abstractC1701;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0760 c0760 = obj2 instanceof C0760 ? (C0760) obj2 : null;
            abstractC1701.mo2068(c0760 != null ? c0760.f2861 : null);
        }
        return c2228;
    }

    @Override // p000.InterfaceC1698
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo3441(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1699(mo935(), null, this);
        }
        m3448(cancellationException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean mo3459() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Object m3460(Object obj) {
        Object objM3466;
        do {
            objM3466 = m3466(f5796.get(this), obj);
            if (objM3466 == AbstractC1458.f5185) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0760 c0760 = obj instanceof C0760 ? (C0760) obj : null;
                throw new IllegalStateException(str, c0760 != null ? c0760.f2861 : null);
            }
        } while (objM3466 == AbstractC1458.f5187);
        return objM3466;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m3461(C2226 c2226, Throwable th) {
        c2226.m3606(new C1810(4), 4);
        C0761 c0761 = null;
        for (C1848 c1848M3609 = (C1848) C1848.f6150.get(c2226); !AbstractC2207.m4087(c1848M3609, c2226); c1848M3609 = c1848M3609.m3609()) {
            if ((c1848M3609 instanceof AbstractC1701) && ((AbstractC1701) c1848M3609).mo2067()) {
                try {
                    ((AbstractC1701) c1848M3609).mo2068(th);
                } catch (Throwable th2) {
                    if (c0761 != null) {
                        AbstractC2202.m3992(c0761, th2);
                    } else {
                        c0761 = new C0761("Exception in completion handler " + c1848M3609 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0761 != null) {
            mo936(c0761);
        }
        m3449(th);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m3463(C1185 c1185) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2226 c2226 = new C2226();
        Object c1623 = c2226;
        if (!c1185.f4326) {
            c1623 = new C1623(c2226);
        }
        do {
            atomicReferenceFieldUpdater = f5796;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1185, c1623)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1185);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3464(AbstractC1701 abstractC1701) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2226 c2226 = new C2226();
        
        C1848.f6151.set(c2226, abstractC1701);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1848.f6150;
        atomicReferenceFieldUpdater2.set(c2226, abstractC1701);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC1701) == abstractC1701) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC1701, abstractC1701, c2226)) {
                    c2226.m3608(abstractC1701);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC1701) == abstractC1701);
        }
        C1848 c1848M3609 = abstractC1701.m3609();
        do {
            atomicReferenceFieldUpdater = f5796;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1701, c1848M3609)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1701);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final int m3465(Object obj) {
        boolean z = obj instanceof C1185;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5796;
        if (z) {
            if (((C1185) obj).f4326) {
                return 0;
            }
            C1185 c1185 = AbstractC1458.f5191;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1185)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C1623)) {
            return 0;
        }
        C2226 c2226 = ((C1623) obj).f5496;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2226)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final Object m3466(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1624)) {
            return AbstractC1458.f5185;
        }
        if (((obj instanceof C1185) || (obj instanceof AbstractC1701)) && !(obj instanceof C0688) && !(obj2 instanceof C0760)) {
            InterfaceC1624 interfaceC1624 = (InterfaceC1624) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5796;
            Object c1625 = obj2 instanceof InterfaceC1624 ? new C1625((InterfaceC1624) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1624, c1625)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1624) {
                    return AbstractC1458.f5187;
                }
            }
            mo937(obj2);
            m3451(interfaceC1624, obj2);
            return obj2;
        }
        InterfaceC1624 interfaceC1625 = (InterfaceC1624) obj;
        C2226 c2226M3455 = m3455(interfaceC1625);
        if (c2226M3455 == null) {
            return AbstractC1458.f5187;
        }
        C1704 c1704 = interfaceC1625 instanceof C1704 ? (C1704) interfaceC1625 : null;
        if (c1704 == null) {
            c1704 = new C1704(c2226M3455, null);
        }
        synchronized (c1704) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1704.f5792;
            if (atomicIntegerFieldUpdater.get(c1704) == 1) {
                return AbstractC1458.f5185;
            }
            atomicIntegerFieldUpdater.set(c1704, 1);
            if (c1704 != interfaceC1625) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5796;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1625, c1704)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1625) {
                        return AbstractC1458.f5187;
                    }
                }
            }
            boolean zM3444 = c1704.m3444();
            C0760 c0760 = obj2 instanceof C0760 ? (C0760) obj2 : null;
            if (c0760 != null) {
                c1704.m3442(c0760.f2861);
            }
            Throwable thM3443 = zM3444 ? null : c1704.m3443();
            if (thM3443 != null) {
                m3461(c2226M3455, thM3443);
            }
            C0688 c0688M3446 = m3446(c2226M3455);
            if (c0688M3446 != null && m3467(c1704, c0688M3446, obj2)) {
                return AbstractC1458.f5186;
            }
            c2226M3455.m3606(new C1810(2), 2);
            C0688 c0688M3447 = m3446(c2226M3455);
            return (c0688M3447 == null || !m3467(c1704, c0688M3447, obj2)) ? m3453(c1704, obj2) : AbstractC1458.f5186;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final boolean m3467(C1704 c1704, C0688 c0688, Object obj) {
        while (AbstractC3453.m4999(c0688.f2572, false, new C1703(this, c1704, c0688, obj)) == C2228.f7225) {
            c0688 = m3446(c0688);
            if (c0688 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public void m3462() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo2635(Object obj) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public void mo936(C0761 c0761) {
        throw c0761;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public void mo937(Object obj) {
    }
}
