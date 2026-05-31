package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲁᛸᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C1723 implements InterfaceC1716, InterfaceC2370 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5839 = AtomicReferenceFieldUpdater.newUpdater(C1723.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5840 = AtomicReferenceFieldUpdater.newUpdater(C1723.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C1723(boolean z) {
        this._state$volatile = z ? AbstractC1272.f4645 : AbstractC1272.f4644;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static C0679 m3614(C1874 c1874) {
        while (c1874.mo3788()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1874.f6225;
            C1874 c1874M3785 = c1874.m3785();
            if (c1874M3785 == null) {
                Object obj = atomicReferenceFieldUpdater.get(c1874);
                while (true) {
                    c1874 = (C1874) obj;
                    if (!c1874.mo3788()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c1874);
                }
            } else {
                c1874 = c1874M3785;
            }
        }
        while (true) {
            c1874 = c1874.m3787();
            if (!c1874.mo3788()) {
                if (c1874 instanceof C0679) {
                    return (C0679) c1874;
                }
                if (c1874 instanceof C2256) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᲈᤞ, reason: contains not printable characters */
    public static String m3615(Object obj) {
        if (!(obj instanceof C1722)) {
            if (obj instanceof InterfaceC1637) {
                return ((InterfaceC1637) obj).mo2915() ? "Active" : "New";
            }
            return obj instanceof C0757 ? "Cancelled" : "Completed";
        }
        C1722 c1722 = (C1722) obj;
        if (c1722.m3612()) {
            return "Cancelling";
        }
        return C1722.f5835.get(c1722) == 1 ? "Completing" : "Active";
    }

    @Override // p000.InterfaceC0874
    public final InterfaceC0875 getKey() {
        return C1139.f4219;
    }

    @Override // p000.InterfaceC1716
    public final boolean start() {
        int iM3633;
        do {
            iM3633 = m3633(f5839.get(this));
            if (iM3633 == 0) {
                return false;
            }
        } while (iM3633 != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m3615(f5839.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC0972.m2594(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public boolean mo3605() {
        Object obj = f5839.get(this);
        return (obj instanceof InterfaceC1637) && ((InterfaceC1637) obj).mo2915();
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public final InterfaceC0678 mo3606(C1723 c1723) {
        C0679 c0679 = new C0679(c1723);
        c0679.f5829 = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5839;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C1187) {
                C1187 c1187 = (C1187) obj;
                if (c1187.f4323) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c0679)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                m3631(c1187);
            } else {
                boolean z = obj instanceof InterfaceC1637;
                C2258 c2258 = C2258.f7344;
                Throwable thM3611 = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C0757 c0757 = obj2 instanceof C0757 ? (C0757) obj2 : null;
                    c0679.mo2163(c0757 != null ? c0757.f2861 : null);
                    return c2258;
                }
                C2256 c2256Mo2916 = ((InterfaceC1637) obj).mo2916();
                if (c2256Mo2916 != null) {
                    if (c2256Mo2916.m3784(c0679, 7)) {
                        break;
                    }
                    boolean zM3784 = c2256Mo2916.m3784(c0679, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C1722) {
                        thM3611 = ((C1722) obj3).m3611();
                    } else {
                        C0757 c0758 = obj3 instanceof C0757 ? (C0757) obj3 : null;
                        if (c0758 != null) {
                            thM3611 = c0758.f2861;
                        }
                    }
                    c0679.mo2163(thM3611);
                    if (zM3784) {
                        break;
                    }
                    return c2258;
                }
                m3632((AbstractC1719) obj);
            }
        }
        return c0679;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo2762(Object obj) {
        mo2761(obj);
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
    public final boolean m3616(Object obj) {
        Throwable thM3620;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z;
        Throwable thM3611;
        C1174 c1174;
        InterfaceC1637 interfaceC1637;
        C2256 c2256M3623;
        C1722 c1722;
        Object objM3634;
        Object objM3635 = AbstractC1272.f4639;
        if (this instanceof C2917) {
            do {
                Object obj3 = f5839.get(this);
                if (obj3 instanceof InterfaceC1637) {
                    if (obj3 instanceof C1722) {
                        if (C1722.f5835.get((C1722) obj3) == 1) {
                        }
                    }
                    objM3635 = m3634(obj3, new C0757(m3620(obj), false));
                }
                objM3635 = AbstractC1272.f4639;
                break;
            } while (objM3635 == AbstractC1272.f4641);
            if (objM3635 != AbstractC1272.f4640) {
                if (objM3635 == AbstractC1272.f4639) {
                    thM3620 = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f5839;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C1722) {
                            synchronized (obj2) {
                                if (C1722.f5837.get((C1722) obj2) == AbstractC1272.f4643) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c1174 = AbstractC1272.f4642;
                                } else {
                                    boolean zM3612 = ((C1722) obj2).m3612();
                                    if (obj == null || !zM3612) {
                                        if (thM3620 == null) {
                                            thM3620 = m3620(obj);
                                        }
                                        ((C1722) obj2).m3610(thM3620);
                                    }
                                    thM3611 = zM3612 ? null : ((C1722) obj2).m3611();
                                    if (thM3611 != null) {
                                        m3629(((C1722) obj2).f5838, thM3611);
                                    }
                                    c1174 = AbstractC1272.f4639;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC1637) {
                            if (thM3620 == null) {
                                thM3620 = m3620(obj);
                            }
                            interfaceC1637 = (InterfaceC1637) obj2;
                            if (interfaceC1637.mo2915()) {
                                c2256M3623 = m3623(interfaceC1637);
                                if (c2256M3623 == null) {
                                    continue;
                                } else {
                                    c1722 = new C1722(c2256M3623, thM3620);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1637, c1722)) {
                                            m3629(c2256M3623, thM3620);
                                            c1174 = AbstractC1272.f4639;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC1637) {
                                        }
                                    }
                                }
                            } else {
                                objM3634 = m3634(obj2, new C0757(thM3620, false));
                                if (objM3634 != AbstractC1272.f4639) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objM3634 != AbstractC1272.f4641) {
                                    objM3635 = objM3634;
                                    break;
                                }
                            }
                        } else {
                            c1174 = AbstractC1272.f4642;
                        }
                        objM3635 = c1174;
                        break;
                    }
                }
                if (objM3635 != AbstractC1272.f4639 && objM3635 != AbstractC1272.f4640) {
                    if (objM3635 == AbstractC1272.f4642) {
                        return false;
                    }
                    mo2761(objM3635);
                    return true;
                }
            }
        } else {
            if (objM3635 == AbstractC1272.f4639) {
                thM3620 = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f5839;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C1722) {
                        synchronized (obj2) {
                            if (C1722.f5837.get((C1722) obj2) == AbstractC1272.f4643) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c1174 = AbstractC1272.f4642;
                            } else {
                                boolean zM3613 = ((C1722) obj2).m3612();
                                if (obj == null) {
                                    if (thM3620 == null) {
                                        thM3620 = m3620(obj);
                                    }
                                    ((C1722) obj2).m3610(thM3620);
                                } else {
                                    if (thM3620 == null) {
                                        thM3620 = m3620(obj);
                                    }
                                    ((C1722) obj2).m3610(thM3620);
                                }
                                if (zM3613) {
                                }
                                if (thM3611 != null) {
                                    m3629(((C1722) obj2).f5838, thM3611);
                                }
                                c1174 = AbstractC1272.f4639;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC1637) {
                        if (thM3620 == null) {
                            thM3620 = m3620(obj);
                        }
                        interfaceC1637 = (InterfaceC1637) obj2;
                        if (interfaceC1637.mo2915()) {
                            c2256M3623 = m3623(interfaceC1637);
                            if (c2256M3623 == null) {
                                continue;
                            } else {
                                c1722 = new C1722(c2256M3623, thM3620);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1637, c1722)) {
                                        m3629(c2256M3623, thM3620);
                                        c1174 = AbstractC1272.f4639;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC1637) {
                                    }
                                }
                            }
                        } else {
                            objM3634 = m3634(obj2, new C0757(thM3620, false));
                            if (objM3634 != AbstractC1272.f4639) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objM3634 != AbstractC1272.f4641) {
                                objM3635 = objM3634;
                                break;
                            }
                        }
                    } else {
                        c1174 = AbstractC1272.f4642;
                    }
                    objM3635 = c1174;
                    break;
                }
            }
            if (objM3635 != AbstractC1272.f4639) {
                if (objM3635 == AbstractC1272.f4642) {
                    return false;
                }
                mo2761(objM3635);
                return true;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public final InterfaceC1085 mo3607(boolean z, boolean z2, C1718 c1718) {
        return m3626(z2, z ? new C1688(c1718) : new C0677(c1718, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean m3617(Throwable th) {
        if (mo3627()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC0678 interfaceC0678 = (InterfaceC0678) f5840.get(this);
        if (interfaceC0678 == null || interfaceC0678 == C2258.f7344) {
            return z;
        }
        return interfaceC0678.mo2164(th) || z;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public String mo1079() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public boolean mo3618(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m3616(th) && mo3622();
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final CancellationException mo3608() {
        CancellationException cancellationException;
        Object obj = f5839.get(this);
        if (!(obj instanceof C1722)) {
            if (obj instanceof InterfaceC1637) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C0757)) {
                return new C1717(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C0757) obj).f2861;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C1717(mo1079(), th, this) : cancellationException;
        }
        Throwable thM3611 = ((C1722) obj).m3611();
        if (thM3611 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM3611 instanceof CancellationException ? (CancellationException) thM3611 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo1079();
        }
        return new C1717(strConcat, thM3611, this);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final void m3619(InterfaceC1637 interfaceC1637, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5840;
        InterfaceC0678 interfaceC0678 = (InterfaceC0678) atomicReferenceFieldUpdater.get(this);
        if (interfaceC0678 != null) {
            interfaceC0678.mo2774();
            atomicReferenceFieldUpdater.set(this, C2258.f7344);
        }
        C0758 c0758 = null;
        C0757 c0757 = obj instanceof C0757 ? (C0757) obj : null;
        Throwable th = c0757 != null ? c0757.f2861 : null;
        if (interfaceC1637 instanceof AbstractC1719) {
            try {
                ((AbstractC1719) interfaceC1637).mo2163(th);
                return;
            } catch (Throwable th2) {
                mo1080(new C0758("Exception in completion handler " + interfaceC1637 + " for " + this, th2));
                return;
            }
        }
        C2256 c2256Mo2916 = interfaceC1637.mo2916();
        if (c2256Mo2916 != null) {
            c2256Mo2916.m3784(new C1837(1), 1);
            for (C1874 c1874M3787 = (C1874) C1874.f6224.get(c2256Mo2916); !AbstractC1469.m3322(c1874M3787, c2256Mo2916); c1874M3787 = c1874M3787.m3787()) {
                if (c1874M3787 instanceof AbstractC1719) {
                    try {
                        ((AbstractC1719) c1874M3787).mo2163(th);
                    } catch (Throwable th3) {
                        if (c0758 != null) {
                            AbstractC1272.m3094(c0758, th3);
                        } else {
                            c0758 = new C0758("Exception in completion handler " + c1874M3787 + " for " + this, th3);
                        }
                    }
                }
            }
            if (c0758 != null) {
                mo1080(c0758);
            }
        }
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public final InterfaceC0876 mo1083(InterfaceC0875 interfaceC0875) {
        return AbstractC1469.m3322(C1139.f4219, interfaceC0875) ? C1189.f4324 : this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Throwable m3620(Object obj) {
        Throwable thM3611;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C1717(mo1079(), null, this) : th;
        }
        C1723 c1723 = (C1723) ((InterfaceC2370) obj);
        c1723.getClass();
        Object obj2 = f5839.get(c1723);
        if (obj2 instanceof C1722) {
            thM3611 = ((C1722) obj2).m3611();
        } else if (obj2 instanceof C0757) {
            thM3611 = ((C0757) obj2).f2861;
        } else {
            if (obj2 instanceof InterfaceC1637) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM3611 = null;
        }
        CancellationException cancellationException = thM3611 instanceof CancellationException ? (CancellationException) thM3611 : null;
        return cancellationException == null ? new C1717("Parent job is ".concat(m3615(obj2)), thM3611, c1723) : cancellationException;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public final Object m3621(C1722 c1722, Object obj) {
        Object obj2 = null;
        Throwable c1717 = null;
        C0757 c0757 = obj instanceof C0757 ? (C0757) obj : null;
        Throwable th = c0757 != null ? c0757.f2861 : null;
        synchronized (c1722) {
            c1722.m3612();
            ArrayList<Throwable> arrayListM3613 = c1722.m3613(th);
            if (!arrayListM3613.isEmpty()) {
                for (Object obj3 : arrayListM3613) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c1717 = (Throwable) obj2;
                if (c1717 == null) {
                    c1717 = (Throwable) arrayListM3613.get(0);
                }
            } else if (c1722.m3612()) {
                c1717 = new C1717(mo1079(), null, this);
            }
            if (c1717 != null && arrayListM3613.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM3613.size()));
                for (Throwable th2 : arrayListM3613) {
                    if (th2 != c1717 && th2 != c1717 && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC1272.m3094(c1717, th2);
                    }
                }
            }
        }
        if (c1717 != null && c1717 != th) {
            obj = new C0757(c1717, false);
        }
        if (c1717 != null && (m3617(c1717) || mo2698(c1717))) {
            C0757 c0758 = (C0757) obj;
            c0758.getClass();
            C0757.f2860.compareAndSet(c0758, 0, 1);
        }
        mo1081(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5839;
        Object c1638 = obj instanceof InterfaceC1637 ? new C1638((InterfaceC1637) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c1722, c1638) && atomicReferenceFieldUpdater.get(this) == c1722) {
        }
        m3619(c1722, obj);
        return obj;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public boolean mo3622() {
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public final C2256 m3623(InterfaceC1637 interfaceC1637) {
        C2256 c2256Mo2916 = interfaceC1637.mo2916();
        if (c2256Mo2916 != null) {
            return c2256Mo2916;
        }
        if (interfaceC1637 instanceof C1187) {
            return new C2256();
        }
        if (interfaceC1637 instanceof AbstractC1719) {
            m3632((AbstractC1719) interfaceC1637);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1637).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ */
    public boolean mo2698(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public final void m3624(InterfaceC1716 interfaceC1716) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5840;
        C2258 c2258 = C2258.f7344;
        if (interfaceC1716 == null) {
            atomicReferenceFieldUpdater.set(this, c2258);
            return;
        }
        interfaceC1716.start();
        InterfaceC0678 interfaceC0678Mo3606 = interfaceC1716.mo3606(this);
        atomicReferenceFieldUpdater.set(this, interfaceC0678Mo3606);
        if (f5839.get(this) instanceof InterfaceC1637) {
            return;
        }
        interfaceC0678Mo3606.mo2774();
        atomicReferenceFieldUpdater.set(this, c2258);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ */
    public final Object mo1084(Object obj, InterfaceC1437 interfaceC1437) {
        return interfaceC1437.mo1342(obj, this);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ */
    public final InterfaceC0876 mo1085(InterfaceC0876 interfaceC0876) {
        return AbstractC1586.m3481(this, interfaceC0876);
    }

    @Override // p000.InterfaceC0876
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ */
    public final InterfaceC0874 mo1086(InterfaceC0875 interfaceC0875) {
        if (AbstractC1469.m3322(C1139.f4219, interfaceC0875)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC1085 m3625(InterfaceC1433 interfaceC1433) {
        return m3626(true, new C0677(interfaceC1433, 1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public final InterfaceC1085 m3626(boolean z, AbstractC1719 abstractC1719) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zM3784;
        abstractC1719.f5829 = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f5839;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C1187;
            C2258 c2258 = C2258.f7344;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC1637)) {
                    z2 = false;
                    break;
                }
                InterfaceC1637 interfaceC1637 = (InterfaceC1637) obj;
                C2256 c2256Mo2916 = interfaceC1637.mo2916();
                if (c2256Mo2916 == null) {
                    m3632((AbstractC1719) obj);
                } else {
                    if (abstractC1719.mo2162()) {
                        C1722 c1722 = interfaceC1637 instanceof C1722 ? (C1722) interfaceC1637 : null;
                        Throwable thM3611 = c1722 != null ? c1722.m3611() : null;
                        if (thM3611 == null) {
                            zM3784 = c2256Mo2916.m3784(abstractC1719, 5);
                        } else if (z) {
                            abstractC1719.mo2163(thM3611);
                            return c2258;
                        }
                    } else {
                        zM3784 = c2256Mo2916.m3784(abstractC1719, 1);
                    }
                    if (zM3784) {
                        break;
                    }
                }
            } else {
                C1187 c1187 = (C1187) obj;
                if (c1187.f4323) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC1719)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m3631(c1187);
                }
            }
            return c2258;
        }
        if (z2) {
            return abstractC1719;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C0757 c0757 = obj2 instanceof C0757 ? (C0757) obj2 : null;
            abstractC1719.mo2163(c0757 != null ? c0757.f2861 : null);
        }
        return c2258;
    }

    @Override // p000.InterfaceC1716
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ */
    public final void mo3609(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C1717(mo1079(), null, this);
        }
        m3616(cancellationException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public boolean mo3627() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public final Object m3628(Object obj) {
        Object objM3634;
        do {
            objM3634 = m3634(f5839.get(this), obj);
            if (objM3634 == AbstractC1272.f4639) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C0757 c0757 = obj instanceof C0757 ? (C0757) obj : null;
                throw new IllegalStateException(str, c0757 != null ? c0757.f2861 : null);
            }
        } while (objM3634 == AbstractC1272.f4641);
        return objM3634;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public final void m3629(C2256 c2256, Throwable th) {
        c2256.m3784(new C1837(4), 4);
        C0758 c0758 = null;
        for (C1874 c1874M3787 = (C1874) C1874.f6224.get(c2256); !AbstractC1469.m3322(c1874M3787, c2256); c1874M3787 = c1874M3787.m3787()) {
            if ((c1874M3787 instanceof AbstractC1719) && ((AbstractC1719) c1874M3787).mo2162()) {
                try {
                    ((AbstractC1719) c1874M3787).mo2163(th);
                } catch (Throwable th2) {
                    if (c0758 != null) {
                        AbstractC1272.m3094(c0758, th2);
                    } else {
                        c0758 = new C0758("Exception in completion handler " + c1874M3787 + " for " + this, th2);
                    }
                }
            }
        }
        if (c0758 != null) {
            mo1080(c0758);
        }
        m3617(th);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲁᲈ, reason: contains not printable characters */
    public final void m3631(C1187 c1187) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2256 c2256 = new C2256();
        Object c1636 = c2256;
        if (!c1187.f4323) {
            c1636 = new C1636(c2256);
        }
        do {
            atomicReferenceFieldUpdater = f5839;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c1187, c1636)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c1187);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᤞᲈᲁ, reason: contains not printable characters */
    public final void m3632(AbstractC1719 abstractC1719) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2256 c2256 = new C2256();
        abstractC1719.getClass();
        C1874.f6225.set(c2256, abstractC1719);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1874.f6224;
        atomicReferenceFieldUpdater2.set(c2256, abstractC1719);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC1719) == abstractC1719) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC1719, abstractC1719, c2256)) {
                    c2256.m3786(abstractC1719);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC1719) == abstractC1719);
        }
        C1874 c1874M3787 = abstractC1719.m3787();
        do {
            atomicReferenceFieldUpdater = f5839;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC1719, c1874M3787)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC1719);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲁᤞᲈ, reason: contains not printable characters */
    public final int m3633(Object obj) {
        boolean z = obj instanceof C1187;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5839;
        if (z) {
            if (((C1187) obj).f4323) {
                return 0;
            }
            C1187 c1187 = AbstractC1272.f4645;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1187)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C1636)) {
            return 0;
        }
        C2256 c2256 = ((C1636) obj).f5530;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2256)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᤞᲁ, reason: contains not printable characters */
    public final Object m3634(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC1637)) {
            return AbstractC1272.f4639;
        }
        if (((obj instanceof C1187) || (obj instanceof AbstractC1719)) && !(obj instanceof C0679) && !(obj2 instanceof C0757)) {
            InterfaceC1637 interfaceC1637 = (InterfaceC1637) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5839;
            Object c1638 = obj2 instanceof InterfaceC1637 ? new C1638((InterfaceC1637) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC1637, c1638)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC1637) {
                    return AbstractC1272.f4641;
                }
            }
            mo1081(obj2);
            m3619(interfaceC1637, obj2);
            return obj2;
        }
        InterfaceC1637 interfaceC1638 = (InterfaceC1637) obj;
        C2256 c2256M3623 = m3623(interfaceC1638);
        if (c2256M3623 == null) {
            return AbstractC1272.f4641;
        }
        C1722 c1722 = interfaceC1638 instanceof C1722 ? (C1722) interfaceC1638 : null;
        if (c1722 == null) {
            c1722 = new C1722(c2256M3623, null);
        }
        synchronized (c1722) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C1722.f5835;
            if (atomicIntegerFieldUpdater.get(c1722) == 1) {
                return AbstractC1272.f4639;
            }
            atomicIntegerFieldUpdater.set(c1722, 1);
            if (c1722 != interfaceC1638) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f5839;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC1638, c1722)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC1638) {
                        return AbstractC1272.f4641;
                    }
                }
            }
            boolean zM3612 = c1722.m3612();
            C0757 c0757 = obj2 instanceof C0757 ? (C0757) obj2 : null;
            if (c0757 != null) {
                c1722.m3610(c0757.f2861);
            }
            Throwable thM3611 = zM3612 ? null : c1722.m3611();
            if (thM3611 != null) {
                m3629(c2256M3623, thM3611);
            }
            C0679 c0679M3614 = m3614(c2256M3623);
            if (c0679M3614 != null && m3635(c1722, c0679M3614, obj2)) {
                return AbstractC1272.f4640;
            }
            c2256M3623.m3784(new C1837(2), 2);
            C0679 c0679M3615 = m3614(c2256M3623);
            return (c0679M3615 == null || !m3635(c1722, c0679M3615, obj2)) ? m3621(c1722, obj2) : AbstractC1272.f4640;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲇᲈᲁᤞ, reason: contains not printable characters */
    public final boolean m3635(C1722 c1722, C0679 c0679, Object obj) {
        while (AbstractC1471.m3396(c0679.f2570, false, new C1721(this, c1722, c0679, obj)) == C2258.f7344) {
            c0679 = m3614(c0679);
            if (c0679 == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᲇᤞ, reason: contains not printable characters */
    public void m3630() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo2761(Object obj) {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ */
    public void mo1080(C0758 c0758) {
        throw c0758;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲈᤞᲇ */
    public void mo1081(Object obj) {
    }
}
