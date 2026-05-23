package bsh.classpath;

import bsh.C0007;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import p000.AbstractC0488;
import p000.AbstractC2668;
import p000.AbstractC2784;
import p000.C0479;
import p000.C0482;
import p000.C0485;
import p000.C0486;
import p000.C0487;
import p000.C0489;
import p000.C0490;
import p000.C0491;
import p000.C0492;
import p000.C0706;
import p000.C1061;
import p000.C1229;
import p000.C1326;
import p000.C1669;
import p000.C1867;
import p000.C3523;
import p000.InterfaceC0480;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C0482 {

    public final C0492 f458;

    public boolean f459;

    public C0492 f460;

    public final ConcurrentHashMap.KeySetView f461 = ConcurrentHashMap.newKeySet();

    public final ReferenceQueue f462 = new ReferenceQueue();

    public C0479 f463;

    public final ConcurrentHashMap f464;

    public ClassManagerImpl() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f464 = concurrentHashMap;
        this.f458 = new C0492("baseClassPath");
        this.f463 = null;
        concurrentHashMap.clear();
        mo298();
    }

    @Override // p000.C0482
    public final void mo296(InterfaceC0480 interfaceC0480) {
        ReferenceQueue referenceQueue = this.f462;
        WeakReference weakReference = new WeakReference(interfaceC0480, referenceQueue);
        ConcurrentHashMap.KeySetView keySetView = this.f461;
        keySetView.add(weakReference);
        while (true) {
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (!keySetView.remove(referencePoll)) {
                RunnableC1668.m3389("tried to remove non-existent weak ref: ", referencePoll);
            }
        }
    }

    @Override // p000.C0482
    public final Class mo297(String str) {
        ClassLoader classLoader;
        C0479 c0479;
        Class<?> clsLoadClass = (Class) this.f2096.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        Class<?> cls = null;
        if (this.f2097.contains(str)) {
            RunnableC1668.m3389("absoluteNonClass list hit: ", str);
            return null;
        }
        RunnableC1668.m3389("Trying to load class: ", str);
        ClassLoader classLoader2 = (ClassLoader) this.f464.get(str);
        if (classLoader2 != null) {
            try {
                clsLoadClass = classLoader2.loadClass(str);
            } catch (Exception e) {
                RunnableC1668.m3389("overlay loader failed for '", "' - ", e);
            }
        }
        if (clsLoadClass == null && str.startsWith("bsh")) {
            ClassLoader classLoader3 = RunnableC1668.class.getClassLoader();
            try {
                clsLoadClass = classLoader3 != null ? classLoader3.loadClass(str) : Class.forName(str);
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
        }
        if (clsLoadClass == null && (c0479 = this.f463) != null) {
            try {
                clsLoadClass = c0479.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.f2094) != null) {
            try {
                clsLoadClass = classLoader.loadClass(str);
            } catch (ClassNotFoundException unused3) {
            }
        }
        if (clsLoadClass == null) {
            try {
                ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
                if (contextClassLoader != null) {
                    clsLoadClass = Class.forName(str, true, contextClassLoader);
                }
            } catch (ClassNotFoundException | NoClassDefFoundError | SecurityException unused4) {
            }
        }
        if (clsLoadClass == null) {
            try {
                clsLoadClass = Class.forName(str);
            } catch (ClassNotFoundException unused5) {
            } catch (NoClassDefFoundError e2) {
                PrintStream printStream = System.err;
                StringBuilder sbM4679 = AbstractC2668.m4679("The class named '", str, "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: ");
                sbM4679.append(e2.getMessage());
                printStream.println(sbM4679.toString());
            }
        }
        if (clsLoadClass == null) {
            String str2 = "/" + str.replace('.', '/') + ".java";
            URL urlMo302 = mo302(str2);
            if (urlMo302 != null) {
                try {
                    C1326 c1326 = new C1326((InputStream) urlMo302.getContent());
                    try {
                        RunnableC1668.m3389("Loading class from source file: " + str2);
                        RunnableC1668 runnableC1668 = this.f2093;
                        C0007 c0007 = runnableC1668.f5634;
                        String str3 = runnableC1668.f5636;
                        if (str3 == null) {
                            str3 = "eval stream";
                        }
                        runnableC1668.m3391(c1326, c0007, str3);
                        c1326.close();
                    } catch (Throwable th) {
                        try {
                            c1326.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | C1229 e3) {
                    if (((Boolean) RunnableC1668.f5629.get()).booleanValue()) {
                        e3.printStackTrace();
                    }
                }
                try {
                    ClassLoader classLoader4 = this.f2094;
                    Class<?> clsLoadClass2 = classLoader4 != null ? classLoader4.loadClass(str) : Class.forName(str);
                    m1722(clsLoadClass2, str);
                    cls = clsLoadClass2;
                } catch (ClassNotFoundException unused6) {
                    RunnableC1668.m3389("Class not found in source file: ".concat(str));
                }
            }
            clsLoadClass = cls;
        }
        m1722(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // p000.C0482
    public final void mo298() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap.KeySetView<WeakReference> keySetView = this.f461;
        for (WeakReference weakReference : keySetView) {
            InterfaceC0480 interfaceC0480 = (InterfaceC0480) weakReference.get();
            if (interfaceC0480 == null) {
                arrayList.add(weakReference);
            } else {
                interfaceC0480.mo343();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keySetView.remove((WeakReference) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0482
    public final Class mo299(String str, byte[] bArr) {
        C0489 c0489 = new C0489(1);
        c0489.f2105 = bArr;
        this.f458.f2119.put(str, c0489);
        try {
            m305(new String[]{str});
            return mo297(str);
        } catch (C0706 e) {
            throw new C1669("defineClass: " + e, e);
        }
    }

    @Override // p000.C0482
    public final void mo300() throws C3523 {
        try {
            m304().m1735(true);
            mo301("");
            this.f459 = true;
        } catch (C0706 e) {
            throw new C3523("Error importing classpath " + e, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0482
    public final String mo301(String str) throws C0706 {
        C0492 c0492M304 = m304();
        c0492M304.m1735(true);
        if (c0492M304.f2121 == null) {
            C0491 c0491 = new C0491(0);
            c0492M304.f2117.forEach(new C0485(c0491, 0));
            c0492M304.f2119.keySet().forEach(new C0485(c0491, 1));
            c0492M304.f2121 = c0491;
        }
        C0487 c0487 = (C0487) c0492M304.f2121.get(str);
        if (c0487 == null) {
            return null;
        }
        ArrayList arrayList = c0487.f2104;
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        throw new C0706("Ambiguous class names: " + arrayList);
    }

    @Override // p000.C0482
    public final URL mo302(String str) {
        C0479 c0479 = this.f463;
        URL resource = c0479 != null ? c0479.getResource(str.substring(1)) : null;
        return resource == null ? super.mo302(str) : resource;
    }

    @Override // p000.C0482
    public final boolean mo303() {
        return this.f459;
    }

    public final C0492 m304() {
        C0492 c0492 = this.f460;
        if (c0492 != null) {
            return c0492;
        }
        C0492 c0493 = new C0492("BeanShell Full Class Path");
        this.f460 = c0493;
        c0493.m1733(C0492.m1731());
        try {
            this.f460.m1733(C0492.m1729());
        } catch (C0706 unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.f460.m1733(this.f458);
        return this.f460;
    }

    public final void m305(String[] strArr) throws C0706 {
        this.f2097.clear();
        this.f2096.clear();
        C1867 c1867 = C0482.f2092;
        synchronized (c1867) {
            HashMap map = c1867.f6199;
            while (true) {
                Reference referencePoll = ((ReferenceQueue) c1867.f6202).poll();
                if (referencePoll == null) {
                    break;
                }
                Object obj = map.get(referencePoll);
                if (obj != null) {
                    c1867.f6198.remove(obj);
                }
                map.remove(referencePoll);
            }
            c1867.f6198.clear();
            c1867.f6199.clear();
            c1867.f6200 = 0;
        }
        if (this.f463 == null) {
            C0492 c0492 = this.f458;
            
            ArrayList arrayList = new ArrayList();
            c0492.f2117.forEach(new C0486(arrayList, 0));
            arrayList.addAll(c0492.f2116);
            this.f463 = new C0479(this, (URL[]) arrayList.toArray(new URL[0]));
        }
        C0491 c0491 = new C0491(1);
        for (String str : strArr) {
            AbstractC0488 abstractC0488M1734 = this.f458.m1734(str);
            if (abstractC0488M1734 == null) {
                C0492.m1731().m1735(true);
                abstractC0488M1734 = C0492.m1731().m1734(str);
            }
            if (abstractC0488M1734 == null) {
                throw new C0706(AbstractC2784.m4757("Nothing known about class: ", str));
            }
            if (abstractC0488M1734 instanceof C0490) {
                throw new C0706("Cannot reload class: " + str + " from source: " + abstractC0488M1734);
            }
            c0491.m1726(str, abstractC0488M1734);
        }
        C1061 c1061 = new C1061(this, new URL[0]);
        c1061.f3847 = c0491;
        C1061.f3846 = c1061;
        Iterator it = c0491.keySet().iterator();
        while (it.hasNext()) {
            this.f464.put((String) it.next(), C1061.f3846);
        }
        mo298();
    }
}
