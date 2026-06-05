package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛴᛳ能不能ᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0731Ujhhgtgfeyxiexzf implements InterfaceC0717Ujhhgtgfeyxiexzf, InterfaceC1376feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3004Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0731Ujhhgtgfeyxiexzf.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3005Ujhhgtgfeyxiexzf = AtomicReferenceFieldUpdater.newUpdater(C0731Ujhhgtgfeyxiexzf.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public C0731Ujhhgtgfeyxiexzf(boolean z) {
        this._state$volatile = z ? AbstractC3085Ujhhgtgfeyxiexzf.f9545Ujhhgtgfeyxiexzf : AbstractC3085Ujhhgtgfeyxiexzf.f9544Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static C2815Ujhhgtgfeyxiexzf m2046feyxiexzfUjhhgtg(C0279Ujhhgtgfeyxiexzf c0279Ujhhgtgfeyxiexzf) {
        while (c0279Ujhhgtgfeyxiexzf.mo1488Ujhhgtgfeyxiexzf()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C0279Ujhhgtgfeyxiexzf.f1700Ujhhgtgfeyxiexzf;
            C0279Ujhhgtgfeyxiexzf c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf = c0279Ujhhgtgfeyxiexzf.m1485Ujhhgtgfeyxiexzf();
            if (c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf == null) {
                Object obj = atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf);
                while (true) {
                    c0279Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) obj;
                    if (!c0279Ujhhgtgfeyxiexzf.mo1488Ujhhgtgfeyxiexzf()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(c0279Ujhhgtgfeyxiexzf);
                }
            } else {
                c0279Ujhhgtgfeyxiexzf = c0279UjhhgtgfeyxiexzfM1485Ujhhgtgfeyxiexzf;
            }
        }
        while (true) {
            c0279Ujhhgtgfeyxiexzf = c0279Ujhhgtgfeyxiexzf.m1487Ujhhgtgfeyxiexzf();
            if (!c0279Ujhhgtgfeyxiexzf.mo1488Ujhhgtgfeyxiexzf()) {
                if (c0279Ujhhgtgfeyxiexzf instanceof C2815Ujhhgtgfeyxiexzf) {
                    return (C2815Ujhhgtgfeyxiexzf) c0279Ujhhgtgfeyxiexzf;
                }
                if (c0279Ujhhgtgfeyxiexzf instanceof C1288feyxiexzfUjhhgtg) {
                    return null;
                }
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static String m2047feyxiexzfUjhhgtg(Object obj) {
        if (!(obj instanceof C0723Ujhhgtgfeyxiexzf)) {
            if (obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                return ((InterfaceC0665Ujhhgtgfeyxiexzf) obj).mo1932Ujhhgtgfeyxiexzf() ? "Active" : "New";
            }
            return obj instanceof C2874Ujhhgtgfeyxiexzf ? "Cancelled" : "Completed";
        }
        C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf = (C0723Ujhhgtgfeyxiexzf) obj;
        if (c0723Ujhhgtgfeyxiexzf.m2042Ujhhgtgfeyxiexzf()) {
            return "Cancelling";
        }
        return C0723Ujhhgtgfeyxiexzf.f2987Ujhhgtgfeyxiexzf.get(c0723Ujhhgtgfeyxiexzf) == 1 ? "Completing" : "Active";
    }

    @Override // p000.InterfaceC3737Ujhhgtgfeyxiexzf
    public final InterfaceC3738Ujhhgtgfeyxiexzf getKey() {
        return C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf;
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    public final boolean start() {
        int iM2071feyxiexzfUjhhgtg;
        do {
            iM2071feyxiexzfUjhhgtg = m2071feyxiexzfUjhhgtg(f3004Ujhhgtgfeyxiexzf.get(this));
            if (iM2071feyxiexzfUjhhgtg == 0) {
                return false;
            }
        } while (iM2071feyxiexzfUjhhgtg != 1);
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName() + '{' + m2047feyxiexzfUjhhgtg(f3004Ujhhgtgfeyxiexzf.get(this)) + '}');
        sb.append('@');
        sb.append(AbstractC3085Ujhhgtgfeyxiexzf.m4563Ujhhgtgfeyxiexzf(this));
        return sb.toString();
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public boolean mo1758Ujhhgtgfeyxiexzf() {
        Object obj = f3004Ujhhgtgfeyxiexzf.get(this);
        return (obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf) && ((InterfaceC0665Ujhhgtgfeyxiexzf) obj).mo1932Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final InterfaceC2916feyxiexzfUjhhgtg mo1759Ujhhgtgfeyxiexzf(C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf) {
        C2815Ujhhgtgfeyxiexzf c2815Ujhhgtgfeyxiexzf = new C2815Ujhhgtgfeyxiexzf(c0731Ujhhgtgfeyxiexzf);
        c2815Ujhhgtgfeyxiexzf.f2986Ujhhgtgfeyxiexzf = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C3301feyxiexzfUjhhgtg) {
                C3301feyxiexzfUjhhgtg c3301feyxiexzfUjhhgtg = (C3301feyxiexzfUjhhgtg) obj;
                if (c3301feyxiexzfUjhhgtg.f10340Ujhhgtgfeyxiexzf) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c2815Ujhhgtgfeyxiexzf)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                        }
                    }
                    break loop0;
                }
                m2069feyxiexzfUjhhgtg(c3301feyxiexzfUjhhgtg);
            } else {
                boolean z = obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf;
                C1270feyxiexzfUjhhgtg c1270feyxiexzfUjhhgtg = C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf;
                Throwable thM2041Ujhhgtgfeyxiexzf = null;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj2 instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj2 : null;
                    c2815Ujhhgtgfeyxiexzf.mo1975Ujhhgtgfeyxiexzf(c2874Ujhhgtgfeyxiexzf != null ? c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf : null);
                    return c1270feyxiexzfUjhhgtg;
                }
                C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf = ((InterfaceC0665Ujhhgtgfeyxiexzf) obj).mo1933Ujhhgtgfeyxiexzf();
                if (c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf != null) {
                    if (c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(c2815Ujhhgtgfeyxiexzf, 7)) {
                        break;
                    }
                    boolean zM1484Ujhhgtgfeyxiexzf = c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(c2815Ujhhgtgfeyxiexzf, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof C0723Ujhhgtgfeyxiexzf) {
                        thM2041Ujhhgtgfeyxiexzf = ((C0723Ujhhgtgfeyxiexzf) obj3).m2041Ujhhgtgfeyxiexzf();
                    } else {
                        C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf2 = obj3 instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj3 : null;
                        if (c2874Ujhhgtgfeyxiexzf2 != null) {
                            thM2041Ujhhgtgfeyxiexzf = c2874Ujhhgtgfeyxiexzf2.f9139Ujhhgtgfeyxiexzf;
                        }
                    }
                    c2815Ujhhgtgfeyxiexzf.mo1975Ujhhgtgfeyxiexzf(thM2041Ujhhgtgfeyxiexzf);
                    if (zM1484Ujhhgtgfeyxiexzf) {
                        break;
                    }
                    return c1270feyxiexzfUjhhgtg;
                }
                m2070feyxiexzfUjhhgtg((AbstractC0722Ujhhgtgfeyxiexzf) obj);
            }
        }
        return c2815Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public void mo2049Ujhhgtgfeyxiexzf(Object obj) {
        mo2048Ujhhgtgfeyxiexzf(obj);
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean m2050Ujhhgtgfeyxiexzf(Object obj) {
        Throwable thM2055Ujhhgtgfeyxiexzf;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj2;
        boolean z;
        Throwable thM2041Ujhhgtgfeyxiexzf;
        C3290Ujhhgtgfeyxiexzf c3290Ujhhgtgfeyxiexzf;
        InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf;
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf;
        C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf;
        Object objM2072feyxiexzfUjhhgtg;
        Object objM2072feyxiexzfUjhhgtg2 = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
        if (this instanceof C1175feyxiexzfUjhhgtg) {
            do {
                Object obj3 = f3004Ujhhgtgfeyxiexzf.get(this);
                if (obj3 instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                    if (obj3 instanceof C0723Ujhhgtgfeyxiexzf) {
                        if (C0723Ujhhgtgfeyxiexzf.f2987Ujhhgtgfeyxiexzf.get((C0723Ujhhgtgfeyxiexzf) obj3) == 1) {
                        }
                    }
                    objM2072feyxiexzfUjhhgtg2 = m2072feyxiexzfUjhhgtg(obj3, new C2874Ujhhgtgfeyxiexzf(m2055Ujhhgtgfeyxiexzf(obj), false));
                }
                objM2072feyxiexzfUjhhgtg2 = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
                break;
            } while (objM2072feyxiexzfUjhhgtg2 == AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf);
            if (objM2072feyxiexzfUjhhgtg2 != AbstractC3085Ujhhgtgfeyxiexzf.f9540Ujhhgtgfeyxiexzf) {
                if (objM2072feyxiexzfUjhhgtg2 == AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                    thM2055Ujhhgtgfeyxiexzf = null;
                    loop1: while (true) {
                        atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
                        obj2 = atomicReferenceFieldUpdater.get(this);
                        if (obj2 instanceof C0723Ujhhgtgfeyxiexzf) {
                            synchronized (obj2) {
                                if (C0723Ujhhgtgfeyxiexzf.f2989Ujhhgtgfeyxiexzf.get((C0723Ujhhgtgfeyxiexzf) obj2) == AbstractC3085Ujhhgtgfeyxiexzf.f9543Ujhhgtgfeyxiexzf) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (z) {
                                    c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf;
                                } else {
                                    boolean zM2042Ujhhgtgfeyxiexzf = ((C0723Ujhhgtgfeyxiexzf) obj2).m2042Ujhhgtgfeyxiexzf();
                                    if (obj == null || !zM2042Ujhhgtgfeyxiexzf) {
                                        if (thM2055Ujhhgtgfeyxiexzf == null) {
                                            thM2055Ujhhgtgfeyxiexzf = m2055Ujhhgtgfeyxiexzf(obj);
                                        }
                                        ((C0723Ujhhgtgfeyxiexzf) obj2).m2040Ujhhgtgfeyxiexzf(thM2055Ujhhgtgfeyxiexzf);
                                    }
                                    thM2041Ujhhgtgfeyxiexzf = zM2042Ujhhgtgfeyxiexzf ? null : ((C0723Ujhhgtgfeyxiexzf) obj2).m2041Ujhhgtgfeyxiexzf();
                                    if (thM2041Ujhhgtgfeyxiexzf != null) {
                                        m2066feyxiexzfUjhhgtg(((C0723Ujhhgtgfeyxiexzf) obj2).f2990Ujhhgtgfeyxiexzf, thM2041Ujhhgtgfeyxiexzf);
                                    }
                                    c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
                                }
                            }
                        } else if (obj2 instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                            if (thM2055Ujhhgtgfeyxiexzf == null) {
                                thM2055Ujhhgtgfeyxiexzf = m2055Ujhhgtgfeyxiexzf(obj);
                            }
                            interfaceC0665Ujhhgtgfeyxiexzf = (InterfaceC0665Ujhhgtgfeyxiexzf) obj2;
                            if (interfaceC0665Ujhhgtgfeyxiexzf.mo1932Ujhhgtgfeyxiexzf()) {
                                c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf = m2058Ujhhgtgfeyxiexzf(interfaceC0665Ujhhgtgfeyxiexzf);
                                if (c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf == null) {
                                    continue;
                                } else {
                                    c0723Ujhhgtgfeyxiexzf = new C0723Ujhhgtgfeyxiexzf(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, thM2055Ujhhgtgfeyxiexzf);
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0665Ujhhgtgfeyxiexzf, c0723Ujhhgtgfeyxiexzf)) {
                                            m2066feyxiexzfUjhhgtg(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, thM2055Ujhhgtgfeyxiexzf);
                                            c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
                                        } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0665Ujhhgtgfeyxiexzf) {
                                        }
                                    }
                                }
                            } else {
                                objM2072feyxiexzfUjhhgtg = m2072feyxiexzfUjhhgtg(obj2, new C2874Ujhhgtgfeyxiexzf(thM2055Ujhhgtgfeyxiexzf, false));
                                if (objM2072feyxiexzfUjhhgtg != AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                                    throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                                }
                                if (objM2072feyxiexzfUjhhgtg != AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf) {
                                    objM2072feyxiexzfUjhhgtg2 = objM2072feyxiexzfUjhhgtg;
                                    break;
                                }
                            }
                        } else {
                            c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf;
                        }
                        objM2072feyxiexzfUjhhgtg2 = c3290Ujhhgtgfeyxiexzf;
                        break;
                    }
                }
                if (objM2072feyxiexzfUjhhgtg2 != AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf && objM2072feyxiexzfUjhhgtg2 != AbstractC3085Ujhhgtgfeyxiexzf.f9540Ujhhgtgfeyxiexzf) {
                    if (objM2072feyxiexzfUjhhgtg2 == AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf) {
                        return false;
                    }
                    mo2048Ujhhgtgfeyxiexzf(objM2072feyxiexzfUjhhgtg2);
                    return true;
                }
            }
        } else {
            if (objM2072feyxiexzfUjhhgtg2 == AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                thM2055Ujhhgtgfeyxiexzf = null;
                loop1: while (true) {
                    atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
                    obj2 = atomicReferenceFieldUpdater.get(this);
                    if (obj2 instanceof C0723Ujhhgtgfeyxiexzf) {
                        synchronized (obj2) {
                            if (C0723Ujhhgtgfeyxiexzf.f2989Ujhhgtgfeyxiexzf.get((C0723Ujhhgtgfeyxiexzf) obj2) == AbstractC3085Ujhhgtgfeyxiexzf.f9543Ujhhgtgfeyxiexzf) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf;
                            } else {
                                boolean zM2042Ujhhgtgfeyxiexzf2 = ((C0723Ujhhgtgfeyxiexzf) obj2).m2042Ujhhgtgfeyxiexzf();
                                if (obj == null) {
                                    if (thM2055Ujhhgtgfeyxiexzf == null) {
                                        thM2055Ujhhgtgfeyxiexzf = m2055Ujhhgtgfeyxiexzf(obj);
                                    }
                                    ((C0723Ujhhgtgfeyxiexzf) obj2).m2040Ujhhgtgfeyxiexzf(thM2055Ujhhgtgfeyxiexzf);
                                } else {
                                    if (thM2055Ujhhgtgfeyxiexzf == null) {
                                        thM2055Ujhhgtgfeyxiexzf = m2055Ujhhgtgfeyxiexzf(obj);
                                    }
                                    ((C0723Ujhhgtgfeyxiexzf) obj2).m2040Ujhhgtgfeyxiexzf(thM2055Ujhhgtgfeyxiexzf);
                                }
                                if (zM2042Ujhhgtgfeyxiexzf2) {
                                }
                                if (thM2041Ujhhgtgfeyxiexzf != null) {
                                    m2066feyxiexzfUjhhgtg(((C0723Ujhhgtgfeyxiexzf) obj2).f2990Ujhhgtgfeyxiexzf, thM2041Ujhhgtgfeyxiexzf);
                                }
                                c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
                            }
                        }
                    } else if (obj2 instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                        if (thM2055Ujhhgtgfeyxiexzf == null) {
                            thM2055Ujhhgtgfeyxiexzf = m2055Ujhhgtgfeyxiexzf(obj);
                        }
                        interfaceC0665Ujhhgtgfeyxiexzf = (InterfaceC0665Ujhhgtgfeyxiexzf) obj2;
                        if (interfaceC0665Ujhhgtgfeyxiexzf.mo1932Ujhhgtgfeyxiexzf()) {
                            c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf = m2058Ujhhgtgfeyxiexzf(interfaceC0665Ujhhgtgfeyxiexzf);
                            if (c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf == null) {
                                continue;
                            } else {
                                c0723Ujhhgtgfeyxiexzf = new C0723Ujhhgtgfeyxiexzf(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, thM2055Ujhhgtgfeyxiexzf);
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0665Ujhhgtgfeyxiexzf, c0723Ujhhgtgfeyxiexzf)) {
                                        m2066feyxiexzfUjhhgtg(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, thM2055Ujhhgtgfeyxiexzf);
                                        c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
                                    } else if (atomicReferenceFieldUpdater.get(this) != interfaceC0665Ujhhgtgfeyxiexzf) {
                                    }
                                }
                            }
                        } else {
                            objM2072feyxiexzfUjhhgtg = m2072feyxiexzfUjhhgtg(obj2, new C2874Ujhhgtgfeyxiexzf(thM2055Ujhhgtgfeyxiexzf, false));
                            if (objM2072feyxiexzfUjhhgtg != AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                                throw new IllegalStateException(("Cannot happen in " + obj2).toString());
                            }
                            if (objM2072feyxiexzfUjhhgtg != AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf) {
                                objM2072feyxiexzfUjhhgtg2 = objM2072feyxiexzfUjhhgtg;
                                break;
                            }
                        }
                    } else {
                        c3290Ujhhgtgfeyxiexzf = AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf;
                    }
                    objM2072feyxiexzfUjhhgtg2 = c3290Ujhhgtgfeyxiexzf;
                    break;
                }
            }
            if (objM2072feyxiexzfUjhhgtg2 != AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                if (objM2072feyxiexzfUjhhgtg2 == AbstractC3085Ujhhgtgfeyxiexzf.f9542Ujhhgtgfeyxiexzf) {
                    return false;
                }
                mo2048Ujhhgtgfeyxiexzf(objM2072feyxiexzfUjhhgtg2);
                return true;
            }
        }
        return true;
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ */
    public final InterfaceC3227feyxiexzfUjhhgtg mo1760Ujhhgtgfeyxiexzf(boolean z, boolean z2, C0726Ujhhgtgfeyxiexzf c0726Ujhhgtgfeyxiexzf) {
        return m2063feyxiexzfUjhhgtg(z2, z ? new C0696Ujhhgtgfeyxiexzf(c0726Ujhhgtgfeyxiexzf) : new C2915Ujhhgtgfeyxiexzf(1, c0726Ujhhgtgfeyxiexzf));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean m2051Ujhhgtgfeyxiexzf(Throwable th) {
        if (mo2064feyxiexzfUjhhgtg()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        InterfaceC2916feyxiexzfUjhhgtg interfaceC2916feyxiexzfUjhhgtg = (InterfaceC2916feyxiexzfUjhhgtg) f3005Ujhhgtgfeyxiexzf.get(this);
        if (interfaceC2916feyxiexzfUjhhgtg == null || interfaceC2916feyxiexzfUjhhgtg == C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf) {
            return z;
        }
        return interfaceC2916feyxiexzfUjhhgtg.mo2842Ujhhgtgfeyxiexzf(th) || z;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public String mo2052Ujhhgtgfeyxiexzf() {
        return "Job was cancelled";
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo2053Ujhhgtgfeyxiexzf(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m2050Ujhhgtgfeyxiexzf(th) && mo2057Ujhhgtgfeyxiexzf();
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public final CancellationException mo1761Ujhhgtgfeyxiexzf() {
        CancellationException cancellationException;
        Object obj = f3004Ujhhgtgfeyxiexzf.get(this);
        if (!(obj instanceof C0723Ujhhgtgfeyxiexzf)) {
            if (obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof C2874Ujhhgtgfeyxiexzf)) {
                return new C0725Ujhhgtgfeyxiexzf(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((C2874Ujhhgtgfeyxiexzf) obj).f9139Ujhhgtgfeyxiexzf;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new C0725Ujhhgtgfeyxiexzf(mo2052Ujhhgtgfeyxiexzf(), th, this) : cancellationException;
        }
        Throwable thM2041Ujhhgtgfeyxiexzf = ((C0723Ujhhgtgfeyxiexzf) obj).m2041Ujhhgtgfeyxiexzf();
        if (thM2041Ujhhgtgfeyxiexzf == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thM2041Ujhhgtgfeyxiexzf instanceof CancellationException ? (CancellationException) thM2041Ujhhgtgfeyxiexzf : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = mo2052Ujhhgtgfeyxiexzf();
        }
        return new C0725Ujhhgtgfeyxiexzf(strConcat, thM2041Ujhhgtgfeyxiexzf, this);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final void m2054Ujhhgtgfeyxiexzf(InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3005Ujhhgtgfeyxiexzf;
        InterfaceC2916feyxiexzfUjhhgtg interfaceC2916feyxiexzfUjhhgtg = (InterfaceC2916feyxiexzfUjhhgtg) atomicReferenceFieldUpdater.get(this);
        if (interfaceC2916feyxiexzfUjhhgtg != null) {
            interfaceC2916feyxiexzfUjhhgtg.mo2039Ujhhgtgfeyxiexzf();
            atomicReferenceFieldUpdater.set(this, C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf);
        }
        C2870Ujhhgtgfeyxiexzf c2870Ujhhgtgfeyxiexzf = null;
        C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj : null;
        Throwable th = c2874Ujhhgtgfeyxiexzf != null ? c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf : null;
        if (interfaceC0665Ujhhgtgfeyxiexzf instanceof AbstractC0722Ujhhgtgfeyxiexzf) {
            try {
                ((AbstractC0722Ujhhgtgfeyxiexzf) interfaceC0665Ujhhgtgfeyxiexzf).mo1975Ujhhgtgfeyxiexzf(th);
                return;
            } catch (Throwable th2) {
                mo2060Ujhhgtgfeyxiexzf(new C2870Ujhhgtgfeyxiexzf("Exception in completion handler " + interfaceC0665Ujhhgtgfeyxiexzf + " for " + this, th2));
                return;
            }
        }
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf = interfaceC0665Ujhhgtgfeyxiexzf.mo1933Ujhhgtgfeyxiexzf();
        if (c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf != null) {
            c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(new C0093Ujhhgtgfeyxiexzf(1), 1);
            for (C0279Ujhhgtgfeyxiexzf c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) C0279Ujhhgtgfeyxiexzf.f1699Ujhhgtgfeyxiexzf.get(c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf); !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf, c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf); c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf = c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf.m1487Ujhhgtgfeyxiexzf()) {
                if (c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf instanceof AbstractC0722Ujhhgtgfeyxiexzf) {
                    try {
                        ((AbstractC0722Ujhhgtgfeyxiexzf) c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf).mo1975Ujhhgtgfeyxiexzf(th);
                    } catch (Throwable th3) {
                        if (c2870Ujhhgtgfeyxiexzf != null) {
                            AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(c2870Ujhhgtgfeyxiexzf, th3);
                        } else {
                            c2870Ujhhgtgfeyxiexzf = new C2870Ujhhgtgfeyxiexzf("Exception in completion handler " + c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf + " for " + this, th3);
                        }
                    }
                }
            }
            if (c2870Ujhhgtgfeyxiexzf != null) {
                mo2060Ujhhgtgfeyxiexzf(c2870Ujhhgtgfeyxiexzf);
            }
        }
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo1762Ujhhgtgfeyxiexzf(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf, interfaceC3738Ujhhgtgfeyxiexzf) ? C3303feyxiexzfUjhhgtg.f10342Ujhhgtgfeyxiexzf : this;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Throwable m2055Ujhhgtgfeyxiexzf(Object obj) {
        Throwable thM2041Ujhhgtgfeyxiexzf;
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            return th == null ? new C0725Ujhhgtgfeyxiexzf(mo2052Ujhhgtgfeyxiexzf(), null, this) : th;
        }
        C0731Ujhhgtgfeyxiexzf c0731Ujhhgtgfeyxiexzf = (C0731Ujhhgtgfeyxiexzf) ((InterfaceC1376feyxiexzfUjhhgtg) obj);
        c0731Ujhhgtgfeyxiexzf.getClass();
        Object obj2 = f3004Ujhhgtgfeyxiexzf.get(c0731Ujhhgtgfeyxiexzf);
        if (obj2 instanceof C0723Ujhhgtgfeyxiexzf) {
            thM2041Ujhhgtgfeyxiexzf = ((C0723Ujhhgtgfeyxiexzf) obj2).m2041Ujhhgtgfeyxiexzf();
        } else if (obj2 instanceof C2874Ujhhgtgfeyxiexzf) {
            thM2041Ujhhgtgfeyxiexzf = ((C2874Ujhhgtgfeyxiexzf) obj2).f9139Ujhhgtgfeyxiexzf;
        } else {
            if (obj2 instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj2).toString());
            }
            thM2041Ujhhgtgfeyxiexzf = null;
        }
        CancellationException cancellationException = thM2041Ujhhgtgfeyxiexzf instanceof CancellationException ? (CancellationException) thM2041Ujhhgtgfeyxiexzf : null;
        return cancellationException == null ? new C0725Ujhhgtgfeyxiexzf("Parent job is ".concat(m2047feyxiexzfUjhhgtg(obj2)), thM2041Ujhhgtgfeyxiexzf, c0731Ujhhgtgfeyxiexzf) : cancellationException;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public final Object m2056Ujhhgtgfeyxiexzf(C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf, Object obj) {
        Object obj2 = null;
        Throwable c0725Ujhhgtgfeyxiexzf = null;
        C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj : null;
        Throwable th = c2874Ujhhgtgfeyxiexzf != null ? c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf : null;
        synchronized (c0723Ujhhgtgfeyxiexzf) {
            c0723Ujhhgtgfeyxiexzf.m2042Ujhhgtgfeyxiexzf();
            ArrayList<Throwable> arrayListM2043Ujhhgtgfeyxiexzf = c0723Ujhhgtgfeyxiexzf.m2043Ujhhgtgfeyxiexzf(th);
            if (!arrayListM2043Ujhhgtgfeyxiexzf.isEmpty()) {
                for (Object obj3 : arrayListM2043Ujhhgtgfeyxiexzf) {
                    if (!(((Throwable) obj3) instanceof CancellationException)) {
                        obj2 = obj3;
                        break;
                    }
                }
                c0725Ujhhgtgfeyxiexzf = (Throwable) obj2;
                if (c0725Ujhhgtgfeyxiexzf == null) {
                    c0725Ujhhgtgfeyxiexzf = (Throwable) arrayListM2043Ujhhgtgfeyxiexzf.get(0);
                }
            } else if (c0723Ujhhgtgfeyxiexzf.m2042Ujhhgtgfeyxiexzf()) {
                c0725Ujhhgtgfeyxiexzf = new C0725Ujhhgtgfeyxiexzf(mo2052Ujhhgtgfeyxiexzf(), null, this);
            }
            if (c0725Ujhhgtgfeyxiexzf != null && arrayListM2043Ujhhgtgfeyxiexzf.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListM2043Ujhhgtgfeyxiexzf.size()));
                for (Throwable th2 : arrayListM2043Ujhhgtgfeyxiexzf) {
                    if (th2 != c0725Ujhhgtgfeyxiexzf && th2 != c0725Ujhhgtgfeyxiexzf && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf, th2);
                    }
                }
            }
        }
        if (c0725Ujhhgtgfeyxiexzf != null && c0725Ujhhgtgfeyxiexzf != th) {
            obj = new C2874Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf, false);
        }
        if (c0725Ujhhgtgfeyxiexzf != null && (m2051Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf) || mo2059Ujhhgtgfeyxiexzf(c0725Ujhhgtgfeyxiexzf))) {
            C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf2 = (C2874Ujhhgtgfeyxiexzf) obj;
            c2874Ujhhgtgfeyxiexzf2.getClass();
            C2874Ujhhgtgfeyxiexzf.f9138Ujhhgtgfeyxiexzf.compareAndSet(c2874Ujhhgtgfeyxiexzf2, 0, 1);
        }
        mo2067feyxiexzfUjhhgtg(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
        Object c0666Ujhhgtgfeyxiexzf = obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf ? new C0666Ujhhgtgfeyxiexzf((InterfaceC0665Ujhhgtgfeyxiexzf) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, c0723Ujhhgtgfeyxiexzf, c0666Ujhhgtgfeyxiexzf) && atomicReferenceFieldUpdater.get(this) == c0723Ujhhgtgfeyxiexzf) {
        }
        m2054Ujhhgtgfeyxiexzf(c0723Ujhhgtgfeyxiexzf, obj);
        return obj;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo2057Ujhhgtgfeyxiexzf() {
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public final C1288feyxiexzfUjhhgtg m2058Ujhhgtgfeyxiexzf(InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf) {
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf = interfaceC0665Ujhhgtgfeyxiexzf.mo1933Ujhhgtgfeyxiexzf();
        if (c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf != null) {
            return c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf;
        }
        if (interfaceC0665Ujhhgtgfeyxiexzf instanceof C3301feyxiexzfUjhhgtg) {
            return new C1288feyxiexzfUjhhgtg();
        }
        if (interfaceC0665Ujhhgtgfeyxiexzf instanceof AbstractC0722Ujhhgtgfeyxiexzf) {
            m2070feyxiexzfUjhhgtg((AbstractC0722Ujhhgtgfeyxiexzf) interfaceC0665Ujhhgtgfeyxiexzf);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC0665Ujhhgtgfeyxiexzf).toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public boolean mo2059Ujhhgtgfeyxiexzf(Throwable th) {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final void m2061Ujhhgtgfeyxiexzf(InterfaceC0717Ujhhgtgfeyxiexzf interfaceC0717Ujhhgtgfeyxiexzf) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3005Ujhhgtgfeyxiexzf;
        C1270feyxiexzfUjhhgtg c1270feyxiexzfUjhhgtg = C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf;
        if (interfaceC0717Ujhhgtgfeyxiexzf == null) {
            atomicReferenceFieldUpdater.set(this, c1270feyxiexzfUjhhgtg);
            return;
        }
        interfaceC0717Ujhhgtgfeyxiexzf.start();
        InterfaceC2916feyxiexzfUjhhgtg interfaceC2916feyxiexzfUjhhgtgMo1759Ujhhgtgfeyxiexzf = interfaceC0717Ujhhgtgfeyxiexzf.mo1759Ujhhgtgfeyxiexzf(this);
        atomicReferenceFieldUpdater.set(this, interfaceC2916feyxiexzfUjhhgtgMo1759Ujhhgtgfeyxiexzf);
        if (f3004Ujhhgtgfeyxiexzf.get(this) instanceof InterfaceC0665Ujhhgtgfeyxiexzf) {
            return;
        }
        interfaceC2916feyxiexzfUjhhgtgMo1759Ujhhgtgfeyxiexzf.mo2039Ujhhgtgfeyxiexzf();
        atomicReferenceFieldUpdater.set(this, c1270feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ */
    public final Object mo1763feyxiexzfUjhhgtg(Object obj, InterfaceC3553feyxiexzfUjhhgtg interfaceC3553feyxiexzfUjhhgtg) {
        return interfaceC3553feyxiexzfUjhhgtg.mo1179Ujhhgtgfeyxiexzf(obj, this);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ */
    public final InterfaceC3739feyxiexzfUjhhgtg mo1764feyxiexzfUjhhgtg(InterfaceC3739feyxiexzfUjhhgtg interfaceC3739feyxiexzfUjhhgtg) {
        return AbstractC3593Ujhhgtgfeyxiexzf.m5163feyxiexzfUjhhgtg(this, interfaceC3739feyxiexzfUjhhgtg);
    }

    @Override // p000.InterfaceC3739feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ */
    public final InterfaceC3737Ujhhgtgfeyxiexzf mo1765feyxiexzfUjhhgtg(InterfaceC3738Ujhhgtgfeyxiexzf interfaceC3738Ujhhgtgfeyxiexzf) {
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(C3382feyxiexzfUjhhgtg.f10561Ujhhgtgfeyxiexzf, interfaceC3738Ujhhgtgfeyxiexzf)) {
            return this;
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public final InterfaceC3227feyxiexzfUjhhgtg m2062feyxiexzfUjhhgtg(InterfaceC3549feyxiexzfUjhhgtg interfaceC3549feyxiexzfUjhhgtg) {
        return m2063feyxiexzfUjhhgtg(true, new C2915Ujhhgtgfeyxiexzf(1, interfaceC3549feyxiexzfUjhhgtg));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public final InterfaceC3227feyxiexzfUjhhgtg m2063feyxiexzfUjhhgtg(boolean z, AbstractC0722Ujhhgtgfeyxiexzf abstractC0722Ujhhgtgfeyxiexzf) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        boolean z2;
        boolean zM1484Ujhhgtgfeyxiexzf;
        abstractC0722Ujhhgtgfeyxiexzf.f2986Ujhhgtgfeyxiexzf = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof C3301feyxiexzfUjhhgtg;
            C1270feyxiexzfUjhhgtg c1270feyxiexzfUjhhgtg = C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf)) {
                    z2 = false;
                    break;
                }
                InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf = (InterfaceC0665Ujhhgtgfeyxiexzf) obj;
                C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf = interfaceC0665Ujhhgtgfeyxiexzf.mo1933Ujhhgtgfeyxiexzf();
                if (c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf == null) {
                    m2070feyxiexzfUjhhgtg((AbstractC0722Ujhhgtgfeyxiexzf) obj);
                } else {
                    if (abstractC0722Ujhhgtgfeyxiexzf.mo1974Ujhhgtgfeyxiexzf()) {
                        C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf = interfaceC0665Ujhhgtgfeyxiexzf instanceof C0723Ujhhgtgfeyxiexzf ? (C0723Ujhhgtgfeyxiexzf) interfaceC0665Ujhhgtgfeyxiexzf : null;
                        Throwable thM2041Ujhhgtgfeyxiexzf = c0723Ujhhgtgfeyxiexzf != null ? c0723Ujhhgtgfeyxiexzf.m2041Ujhhgtgfeyxiexzf() : null;
                        if (thM2041Ujhhgtgfeyxiexzf == null) {
                            zM1484Ujhhgtgfeyxiexzf = c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(abstractC0722Ujhhgtgfeyxiexzf, 5);
                        } else if (z) {
                            abstractC0722Ujhhgtgfeyxiexzf.mo1975Ujhhgtgfeyxiexzf(thM2041Ujhhgtgfeyxiexzf);
                            return c1270feyxiexzfUjhhgtg;
                        }
                    } else {
                        zM1484Ujhhgtgfeyxiexzf = c1288feyxiexzfUjhhgtgMo1933Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(abstractC0722Ujhhgtgfeyxiexzf, 1);
                    }
                    if (zM1484Ujhhgtgfeyxiexzf) {
                        break;
                    }
                }
            } else {
                C3301feyxiexzfUjhhgtg c3301feyxiexzfUjhhgtg = (C3301feyxiexzfUjhhgtg) obj;
                if (c3301feyxiexzfUjhhgtg.f10340Ujhhgtgfeyxiexzf) {
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, obj, abstractC0722Ujhhgtgfeyxiexzf)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == obj);
                } else {
                    m2069feyxiexzfUjhhgtg(c3301feyxiexzfUjhhgtg);
                }
            }
            return c1270feyxiexzfUjhhgtg;
        }
        if (z2) {
            return abstractC0722Ujhhgtgfeyxiexzf;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj2 instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj2 : null;
            abstractC0722Ujhhgtgfeyxiexzf.mo1975Ujhhgtgfeyxiexzf(c2874Ujhhgtgfeyxiexzf != null ? c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf : null);
        }
        return c1270feyxiexzfUjhhgtg;
    }

    @Override // p000.InterfaceC0717Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ */
    public final void mo1766feyxiexzfUjhhgtg(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0725Ujhhgtgfeyxiexzf(mo2052Ujhhgtgfeyxiexzf(), null, this);
        }
        m2050Ujhhgtgfeyxiexzf(cancellationException);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public boolean mo2064feyxiexzfUjhhgtg() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public final Object m2065feyxiexzfUjhhgtg(Object obj) {
        Object objM2072feyxiexzfUjhhgtg;
        do {
            objM2072feyxiexzfUjhhgtg = m2072feyxiexzfUjhhgtg(f3004Ujhhgtgfeyxiexzf.get(this), obj);
            if (objM2072feyxiexzfUjhhgtg == AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj : null;
                throw new IllegalStateException(str, c2874Ujhhgtgfeyxiexzf != null ? c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf : null);
            }
        } while (objM2072feyxiexzfUjhhgtg == AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf);
        return objM2072feyxiexzfUjhhgtg;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final void m2066feyxiexzfUjhhgtg(C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtg, Throwable th) {
        c1288feyxiexzfUjhhgtg.m1484Ujhhgtgfeyxiexzf(new C0093Ujhhgtgfeyxiexzf(4), 4);
        C2870Ujhhgtgfeyxiexzf c2870Ujhhgtgfeyxiexzf = null;
        for (C0279Ujhhgtgfeyxiexzf c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf = (C0279Ujhhgtgfeyxiexzf) C0279Ujhhgtgfeyxiexzf.f1699Ujhhgtgfeyxiexzf.get(c1288feyxiexzfUjhhgtg); !C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf, c1288feyxiexzfUjhhgtg); c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf = c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf.m1487Ujhhgtgfeyxiexzf()) {
            if ((c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf instanceof AbstractC0722Ujhhgtgfeyxiexzf) && ((AbstractC0722Ujhhgtgfeyxiexzf) c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf).mo1974Ujhhgtgfeyxiexzf()) {
                try {
                    ((AbstractC0722Ujhhgtgfeyxiexzf) c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf).mo1975Ujhhgtgfeyxiexzf(th);
                } catch (Throwable th2) {
                    if (c2870Ujhhgtgfeyxiexzf != null) {
                        AbstractC1791feyxiexzfUjhhgtg.m3129Ujhhgtgfeyxiexzf(c2870Ujhhgtgfeyxiexzf, th2);
                    } else {
                        c2870Ujhhgtgfeyxiexzf = new C2870Ujhhgtgfeyxiexzf("Exception in completion handler " + c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf + " for " + this, th2);
                    }
                }
            }
        }
        if (c2870Ujhhgtgfeyxiexzf != null) {
            mo2060Ujhhgtgfeyxiexzf(c2870Ujhhgtgfeyxiexzf);
        }
        m2051Ujhhgtgfeyxiexzf(th);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛲᛴ, reason: contains not printable characters */
    public final void m2069feyxiexzfUjhhgtg(C3301feyxiexzfUjhhgtg c3301feyxiexzfUjhhgtg) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtg = new C1288feyxiexzfUjhhgtg();
        Object c0664Ujhhgtgfeyxiexzf = c1288feyxiexzfUjhhgtg;
        if (!c3301feyxiexzfUjhhgtg.f10340Ujhhgtgfeyxiexzf) {
            c0664Ujhhgtgfeyxiexzf = new C0664Ujhhgtgfeyxiexzf(c1288feyxiexzfUjhhgtg);
        }
        do {
            atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
            if (atomicReferenceFieldUpdater.compareAndSet(this, c3301feyxiexzfUjhhgtg, c0664Ujhhgtgfeyxiexzf)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == c3301feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱᛴᛲ, reason: contains not printable characters */
    public final void m2070feyxiexzfUjhhgtg(AbstractC0722Ujhhgtgfeyxiexzf abstractC0722Ujhhgtgfeyxiexzf) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtg = new C1288feyxiexzfUjhhgtg();
        abstractC0722Ujhhgtgfeyxiexzf.getClass();
        C0279Ujhhgtgfeyxiexzf.f1700Ujhhgtgfeyxiexzf.set(c1288feyxiexzfUjhhgtg, abstractC0722Ujhhgtgfeyxiexzf);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C0279Ujhhgtgfeyxiexzf.f1699Ujhhgtgfeyxiexzf;
        atomicReferenceFieldUpdater2.set(c1288feyxiexzfUjhhgtg, abstractC0722Ujhhgtgfeyxiexzf);
        loop0: while (atomicReferenceFieldUpdater2.get(abstractC0722Ujhhgtgfeyxiexzf) == abstractC0722Ujhhgtgfeyxiexzf) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(abstractC0722Ujhhgtgfeyxiexzf, abstractC0722Ujhhgtgfeyxiexzf, c1288feyxiexzfUjhhgtg)) {
                    c1288feyxiexzfUjhhgtg.m1486Ujhhgtgfeyxiexzf(abstractC0722Ujhhgtgfeyxiexzf);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(abstractC0722Ujhhgtgfeyxiexzf) == abstractC0722Ujhhgtgfeyxiexzf);
        }
        C0279Ujhhgtgfeyxiexzf c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf = abstractC0722Ujhhgtgfeyxiexzf.m1487Ujhhgtgfeyxiexzf();
        do {
            atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
            if (atomicReferenceFieldUpdater.compareAndSet(this, abstractC0722Ujhhgtgfeyxiexzf, c0279UjhhgtgfeyxiexzfM1487Ujhhgtgfeyxiexzf)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == abstractC0722Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛲᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public final int m2071feyxiexzfUjhhgtg(Object obj) {
        boolean z = obj instanceof C3301feyxiexzfUjhhgtg;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
        if (z) {
            if (((C3301feyxiexzfUjhhgtg) obj).f10340Ujhhgtgfeyxiexzf) {
                return 0;
            }
            C3301feyxiexzfUjhhgtg c3301feyxiexzfUjhhgtg = AbstractC3085Ujhhgtgfeyxiexzf.f9545Ujhhgtgfeyxiexzf;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c3301feyxiexzfUjhhgtg)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof C0664Ujhhgtgfeyxiexzf)) {
            return 0;
        }
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtg = ((C0664Ujhhgtgfeyxiexzf) obj).f2777Ujhhgtgfeyxiexzf;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c1288feyxiexzfUjhhgtg)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛱUjhhgtgᛱᛲ, reason: contains not printable characters */
    public final Object m2072feyxiexzfUjhhgtg(Object obj, Object obj2) {
        if (!(obj instanceof InterfaceC0665Ujhhgtgfeyxiexzf)) {
            return AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
        }
        if (((obj instanceof C3301feyxiexzfUjhhgtg) || (obj instanceof AbstractC0722Ujhhgtgfeyxiexzf)) && !(obj instanceof C2815Ujhhgtgfeyxiexzf) && !(obj2 instanceof C2874Ujhhgtgfeyxiexzf)) {
            InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf = (InterfaceC0665Ujhhgtgfeyxiexzf) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3004Ujhhgtgfeyxiexzf;
            Object c0666Ujhhgtgfeyxiexzf = obj2 instanceof InterfaceC0665Ujhhgtgfeyxiexzf ? new C0666Ujhhgtgfeyxiexzf((InterfaceC0665Ujhhgtgfeyxiexzf) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC0665Ujhhgtgfeyxiexzf, c0666Ujhhgtgfeyxiexzf)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC0665Ujhhgtgfeyxiexzf) {
                    return AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf;
                }
            }
            mo2067feyxiexzfUjhhgtg(obj2);
            m2054Ujhhgtgfeyxiexzf(interfaceC0665Ujhhgtgfeyxiexzf, obj2);
            return obj2;
        }
        InterfaceC0665Ujhhgtgfeyxiexzf interfaceC0665Ujhhgtgfeyxiexzf2 = (InterfaceC0665Ujhhgtgfeyxiexzf) obj;
        C1288feyxiexzfUjhhgtg c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf = m2058Ujhhgtgfeyxiexzf(interfaceC0665Ujhhgtgfeyxiexzf2);
        if (c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf == null) {
            return AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf;
        }
        C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf = interfaceC0665Ujhhgtgfeyxiexzf2 instanceof C0723Ujhhgtgfeyxiexzf ? (C0723Ujhhgtgfeyxiexzf) interfaceC0665Ujhhgtgfeyxiexzf2 : null;
        if (c0723Ujhhgtgfeyxiexzf == null) {
            c0723Ujhhgtgfeyxiexzf = new C0723Ujhhgtgfeyxiexzf(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, null);
        }
        synchronized (c0723Ujhhgtgfeyxiexzf) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C0723Ujhhgtgfeyxiexzf.f2987Ujhhgtgfeyxiexzf;
            if (atomicIntegerFieldUpdater.get(c0723Ujhhgtgfeyxiexzf) == 1) {
                return AbstractC3085Ujhhgtgfeyxiexzf.f9539Ujhhgtgfeyxiexzf;
            }
            atomicIntegerFieldUpdater.set(c0723Ujhhgtgfeyxiexzf, 1);
            if (c0723Ujhhgtgfeyxiexzf != interfaceC0665Ujhhgtgfeyxiexzf2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f3004Ujhhgtgfeyxiexzf;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC0665Ujhhgtgfeyxiexzf2, c0723Ujhhgtgfeyxiexzf)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC0665Ujhhgtgfeyxiexzf2) {
                        return AbstractC3085Ujhhgtgfeyxiexzf.f9541Ujhhgtgfeyxiexzf;
                    }
                }
            }
            boolean zM2042Ujhhgtgfeyxiexzf = c0723Ujhhgtgfeyxiexzf.m2042Ujhhgtgfeyxiexzf();
            C2874Ujhhgtgfeyxiexzf c2874Ujhhgtgfeyxiexzf = obj2 instanceof C2874Ujhhgtgfeyxiexzf ? (C2874Ujhhgtgfeyxiexzf) obj2 : null;
            if (c2874Ujhhgtgfeyxiexzf != null) {
                c0723Ujhhgtgfeyxiexzf.m2040Ujhhgtgfeyxiexzf(c2874Ujhhgtgfeyxiexzf.f9139Ujhhgtgfeyxiexzf);
            }
            Throwable thM2041Ujhhgtgfeyxiexzf = zM2042Ujhhgtgfeyxiexzf ? null : c0723Ujhhgtgfeyxiexzf.m2041Ujhhgtgfeyxiexzf();
            if (thM2041Ujhhgtgfeyxiexzf != null) {
                m2066feyxiexzfUjhhgtg(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf, thM2041Ujhhgtgfeyxiexzf);
            }
            C2815Ujhhgtgfeyxiexzf c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg = m2046feyxiexzfUjhhgtg(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf);
            if (c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg != null && m2073feyxiexzfUjhhgtg(c0723Ujhhgtgfeyxiexzf, c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg, obj2)) {
                return AbstractC3085Ujhhgtgfeyxiexzf.f9540Ujhhgtgfeyxiexzf;
            }
            c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf.m1484Ujhhgtgfeyxiexzf(new C0093Ujhhgtgfeyxiexzf(2), 2);
            C2815Ujhhgtgfeyxiexzf c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg2 = m2046feyxiexzfUjhhgtg(c1288feyxiexzfUjhhgtgM2058Ujhhgtgfeyxiexzf);
            return (c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg2 == null || !m2073feyxiexzfUjhhgtg(c0723Ujhhgtgfeyxiexzf, c2815UjhhgtgfeyxiexzfM2046feyxiexzfUjhhgtg2, obj2)) ? m2056Ujhhgtgfeyxiexzf(c0723Ujhhgtgfeyxiexzf, obj2) : AbstractC3085Ujhhgtgfeyxiexzf.f9540Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ, reason: contains not printable characters */
    public final boolean m2073feyxiexzfUjhhgtg(C0723Ujhhgtgfeyxiexzf c0723Ujhhgtgfeyxiexzf, C2815Ujhhgtgfeyxiexzf c2815Ujhhgtgfeyxiexzf, Object obj) {
        while (AbstractC3085Ujhhgtgfeyxiexzf.m4566Ujhhgtgfeyxiexzf(c2815Ujhhgtgfeyxiexzf.f8964Ujhhgtgfeyxiexzf, false, new C0724Ujhhgtgfeyxiexzf(this, c0723Ujhhgtgfeyxiexzf, c2815Ujhhgtgfeyxiexzf, obj)) == C1270feyxiexzfUjhhgtg.f4645Ujhhgtgfeyxiexzf) {
            c2815Ujhhgtgfeyxiexzf = m2046feyxiexzfUjhhgtg(c2815Ujhhgtgfeyxiexzf);
            if (c2815Ujhhgtgfeyxiexzf == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛳᛱUjhhgtgᛱ, reason: contains not printable characters */
    public void m2068feyxiexzfUjhhgtg() {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public void mo2048Ujhhgtgfeyxiexzf(Object obj) {
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public void mo2060Ujhhgtgfeyxiexzf(C2870Ujhhgtgfeyxiexzf c2870Ujhhgtgfeyxiexzf) {
        throw c2870Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛴᛱUjhhgtgᛱᛳ, reason: contains not printable characters */
    public void mo2067feyxiexzfUjhhgtg(Object obj) {
    }
}
