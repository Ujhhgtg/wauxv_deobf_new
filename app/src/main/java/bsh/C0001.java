package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CompletionException;
import p000.AbstractC2707;
import p000.C0326;
import p000.C0327;
import p000.C0328;
import p000.C0333;
import p000.C0350;
import p000.C0550;
import p000.C0704;
import p000.C1229;
import p000.C1230;
import p000.C2000;
import p000.C2518;
import p000.C2644;
import p000.C2895;
import p000.EnumC0703;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0001 extends AbstractC2707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static int f466;

    @Override // p000.AbstractC2707, p000.InterfaceC2225
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object mo306(C0550 c0550, RunnableC1668 runnableC1668) throws C1229 {
        if (m4710().length == 1) {
            InterfaceC2225 interfaceC2225 = this.f8721[0];
            if (interfaceC2225 instanceof C0328) {
                return m307((C0328) interfaceC2225, Void.TYPE, c0550, runnableC1668);
            }
        }
        InterfaceC2225[] interfaceC2225Arr = this.f8721;
        InterfaceC2225 interfaceC2226 = interfaceC2225Arr[0];
        InterfaceC2225 interfaceC2227 = interfaceC2225Arr[1];
        if (!(interfaceC2226 instanceof C0326)) {
            return m307((C0328) interfaceC2227, ((C0350) interfaceC2226).f1659, c0550, runnableC1668);
        }
        C0326 c0326 = (C0326) interfaceC2226;
        if (!(interfaceC2227 instanceof C0327)) {
            return m307((C0328) interfaceC2227, c0326.m1432(c0550), c0550, runnableC1668);
        }
        Object[] objArrM1434 = ((C0327) interfaceC2227).m1434(c0550, runnableC1668);
        Object objM1433 = c0326.m1433(c0550, runnableC1668, true);
        if (!(objM1433 instanceof C0704)) {
            throw new C1230("Unknown class: " + c0326.f1577, this, c0550);
        }
        Class cls = ((C0704) objM1433).f2682;
        boolean z = m4710().length > 2;
        try {
            RunnableC1668.f5631.m3663(cls, objArrM1434);
            if (z) {
                C0333 c0333 = (C0333) this.f8721[2];
                if (cls.isInterface()) {
                    C0007 c0007 = new C0007(c0550.m1929(), null, "AnonymousBlock");
                    c0550.m1927(c0007);
                    try {
                        c0333.m1448(c0550, runnableC1668, Boolean.TRUE);
                        c0550.m1926();
                        c0007.m359(cls);
                        return c0007.mo310(runnableC1668).getInterface((Class<?>) cls);
                    } catch (Throwable th) {
                        c0550.m1926();
                        throw th;
                    }
                }
                StringBuilder sb = new StringBuilder("anon");
                int i = f466 + 1;
                f466 = i;
                sb.append(i);
                String string = sb.toString();
                String str = c0550.m1929().f493.replace('/', '_') + "$" + string;
                This.CONTEXT_ARGS.get().put(string, objArrM1434);
                C2000 c2000 = new C2000(0);
                if (C0004.f472 == null) {
                    C0004.f472 = new C0004();
                }
                
                try {
                    return AbstractC0009.m377(C0004.m317(str, c2000, null, cls, c0333, EnumC0703.f2678, c0550, runnableC1668), null, objArrM1434);
                } catch (Exception e) {
                    throw new C1230("Error constructing inner class instance: " + e, this, c0550, e instanceof InvocationTargetException ? e.getCause() : e);
                }
            }
            boolean zM401 = AbstractC0009.m401(cls);
            if (zM401) {
                This.registerConstructorContext(c0550, runnableC1668);
            }
            try {
                try {
                    Object objM377 = AbstractC0009.m377(cls, null, objArrM1434);
                    if (zM401) {
                        This.registerConstructorContext(null, null);
                    }
                    if (cls.getName().indexOf("$") != -1) {
                        C0007 nameSpace = c0550.m1929().mo310(null).getNameSpace();
                        if (C0006.m328(nameSpace) != null && !AbstractC0009.m382(objM377.getClass()).m3864("static")) {
                            C0007 c0007M395 = AbstractC0009.m395(objM377);
                            c0007M395.f494 = nameSpace;
                            if (false) {
                                c0007M395.m363();
                            }
                            return objM377;
                        }
                        if (AbstractC0009.m382(objM377.getClass()).m3864("static")) {
                            C0007 c0007M396 = AbstractC0009.m395(objM377);
                            C0007 c0008 = AbstractC0009.m394(objM377.getClass()).f494;
                            c0007M396.f494 = c0008;
                            if (c0008 == null) {
                                c0007M396.m363();
                            }
                        }
                    }
                    return objM377;
                } catch (InvocationTargetException e2) {
                    e = e2;
                    RunnableC1668.m3389("The constructor threw an exception:\n\t" + e.getCause());
                    throw new C2895("Object constructor", e.getCause(), this, c0550, true);
                } catch (CompletionException e3) {
                    e = e3;
                    RunnableC1668.m3389("The constructor threw an exception:\n\t" + e.getCause());
                    throw new C2895("Object constructor", e.getCause(), this, c0550, true);
                } catch (C2518 e4) {
                    throw new C1230("Constructor error: " + e4.getMessage(), this, c0550, e4);
                }
            } catch (Throwable th2) {
                if (!zM401) {
                    throw th2;
                }
                This.registerConstructorContext(null, null);
                throw th2;
            }
        } catch (C2644 e5) {
            throw e5.mo4643(this, c0550);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Object m307(C0328 c0328, Class cls, C0550 c0550, RunnableC1668 runnableC1668) throws C1230, C2895 {
        
        RunnableC1668.m3389("array base type = ", cls);
        c0328.f1578 = cls;
        Object objMo306 = c0328.mo306(c0550, runnableC1668);
        if (objMo306 != Primitive.VOID) {
            return objMo306;
        }
        int i = c0328.f1580;
        if (i > 0) {
            cls = Array.newInstance((Class<?>) cls, new int[i]).getClass();
        }
        try {
            return Array.newInstance((Class<?>) cls, c0328.f1581);
        } catch (NegativeArraySizeException e) {
            throw new C2895(e, this, c0550);
        } catch (Exception e2) {
            throw new C1230("Can't construct primitive array: " + e2.getMessage(), this, c0550, e2);
        }
    }
}
