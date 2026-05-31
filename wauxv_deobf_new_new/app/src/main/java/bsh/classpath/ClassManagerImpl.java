package bsh.classpath;

import bsh.C0012;
import bsh.RunnableC0008;
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
import p000.AbstractC0464;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0454;
import p000.C0458;
import p000.C0459;
import p000.C0462;
import p000.C0463;
import p000.C0465;
import p000.C0466;
import p000.C0467;
import p000.C0468;
import p000.C0701;
import p000.C1065;
import p000.C1066;
import p000.C1231;
import p000.C1328_InputStreamReader_UTF8;
import p000.C1684;
import p000.C1893;
import p000.C2033;
import p000.C3581;
import p000.InterfaceC0455;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class ClassManagerImpl extends C0458 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final C0468 f458;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public boolean f459;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public C0468 f460;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final ConcurrentHashMap.KeySetView f461 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final ReferenceQueue f462 = new ReferenceQueue();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public C0454 f463;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap f464;

    public ClassManagerImpl() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f464 = concurrentHashMap;
        this.f458 = new C0468("baseClassPath");
        this.f463 = null;
        concurrentHashMap.clear();
        ClassLoader classLoader = this.f2067;
        this.f2069 = new C2033(classLoader == null ? getClass().getClassLoader() : classLoader, 1);
        mo304();
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void mo302(InterfaceC0455 interfaceC0455) {
        ReferenceQueue referenceQueue = this.f462;
        WeakReference weakReference = new WeakReference(interfaceC0455, referenceQueue);
        ConcurrentHashMap.KeySetView keySetView = this.f461;
        keySetView.add(weakReference);
        while (true) {
            Reference referencePoll = referenceQueue.poll();
            if (referencePoll == null) {
                return;
            }
            if (!keySetView.remove(referencePoll)) {
                RunnableC0008.m333("tried to remove non-existent weak ref: ", referencePoll);
            }
        }
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final Class mo303(String str) {
        ClassLoader classLoader;
        C0454 c0454;
        Class<?> clsLoadClass = (Class) this.f2070.get(str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        Class<?> cls = null;
        if (this.f2071.contains(str)) {
            RunnableC0008.m333("absoluteNonClass list hit: ", str);
            return null;
        }
        RunnableC0008.m333("Trying to load class: ", str);
        ClassLoader classLoader2 = (ClassLoader) this.f464.get(str);
        if (classLoader2 != null) {
            try {
                clsLoadClass = classLoader2.loadClass(str);
            } catch (Exception e) {
                RunnableC0008.m333("overlay loader failed for '", "' - ", e);
            }
        }
        if (clsLoadClass == null && str.startsWith("bsh")) {
            ClassLoader classLoader3 = RunnableC0008.class.getClassLoader();
            try {
                clsLoadClass = classLoader3 != null ? classLoader3.loadClass(str) : Class.forName(str);
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            }
        }
        if (clsLoadClass == null && (c0454 = this.f463) != null) {
            try {
                clsLoadClass = c0454.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        if (clsLoadClass == null && (classLoader = this.f2067) != null) {
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
                StringBuilder sbM4625 = AbstractC2647.m4625("The class named '", str, "' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: ");
                sbM4625.append(e2.getMessage());
                printStream.println(sbM4625.toString());
            }
        }
        if (clsLoadClass == null) {
            String str2 = "/" + str.replace('.', '/') + ".java";
            URL urlMo308 = mo308(str2);
            if (urlMo308 != null) {
                try {
                    C1328_InputStreamReader_UTF8 c1328 = new C1328_InputStreamReader_UTF8((InputStream) urlMo308.getContent());
                    try {
                        RunnableC0008.m333("Loading class from source file: " + str2);
                        RunnableC0008 runnableC0008 = this.f2066;
                        C0012 c0012 = runnableC0008.f505;
                        String str3 = runnableC0008.f507;
                        if (str3 == null) {
                            str3 = "eval stream";
                        }
                        runnableC0008.m339(c1328, c0012, str3);
                        c1328.close();
                    } catch (Throwable th) {
                        try {
                            c1328.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (IOException | C1231 e3) {
                    if (((Boolean) RunnableC0008.f500.get()).booleanValue()) {
                        e3.printStackTrace();
                    }
                }
                try {
                    ClassLoader classLoader4 = this.f2067;
                    Class<?> clsLoadClass2 = classLoader4 != null ? classLoader4.loadClass(str) : Class.forName(str);
                    m1830(clsLoadClass2, str);
                    cls = clsLoadClass2;
                } catch (ClassNotFoundException unused6) {
                    RunnableC0008.m333("Class not found in source file: ".concat(str));
                }
            }
            clsLoadClass = cls;
        }
        m1830(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final void mo304() {
        ArrayList arrayList = new ArrayList();
        ConcurrentHashMap.KeySetView<WeakReference> keySetView = this.f461;
        for (WeakReference weakReference : keySetView) {
            InterfaceC0455 interfaceC0455 = (InterfaceC0455) weakReference.get();
            if (interfaceC0455 == null) {
                arrayList.add(weakReference);
            } else {
                interfaceC0455.classLoaderChanged();
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            keySetView.remove((WeakReference) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Class mo305(String str, byte[] bArr) {
        C0465 c0465 = new C0465(1);
        c0465.f2079 = bArr;
        this.f458.f2092.put(str, c0465);
        try {
            m311(new String[]{str});
            return mo303(str);
        } catch (C0701 e) {
            throw new C1684("defineClass: " + e, e);
        }
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void mo306() throws C3581 {
        try {
            m310().m1841(true);
            mo307("");
            this.f459 = true;
        } catch (C0701 e) {
            throw new C3581("Error importing classpath " + e, e);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String mo307(String str) throws C0701 {
        C0468 c0468M310 = m310();
        c0468M310.m1841(true);
        if (c0468M310.f2094 == null) {
            C0467 c0467 = new C0467();
            c0468M310.f2090.forEach(new C0462(c0467, 0));
            c0468M310.f2092.keySet().forEach(new C0462(c0467, 1));
            c0468M310.f2094 = c0467;
        }
        C0463 c0463 = (C0463) c0468M310.f2094.get(str);
        if (c0463 == null) {
            return null;
        }
        ArrayList arrayList = c0463.f2078;
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        throw new C0701("Ambiguous class names: " + arrayList);
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final URL mo308(String str) {
        C0454 c0454 = this.f463;
        URL resource = c0454 != null ? c0454.getResource(str.substring(1)) : null;
        return resource == null ? super.mo308(str) : resource;
    }

    @Override // p000.C0458
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final boolean mo309() {
        return this.f459;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final C0468 m310() {
        C0468 c0468 = this.f460;
        if (c0468 != null) {
            return c0468;
        }
        C0468 c0469 = new C0468("BeanShell Full Class Path");
        this.f460 = c0469;
        c0469.m1839(C0468.m1837());
        try {
            this.f460.m1839(C0468.m1835());
        } catch (C0701 unused) {
            System.err.println("Warning: can't get boot class path");
        }
        this.f460.m1839(this.f458);
        return this.f460;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final void m311(String[] strArr) throws C0701 {
        this.f2071.clear();
        this.f2070.clear();
        C1893 c1893 = C0458.f2065;
        synchronized (c1893) {
            HashMap map = c1893.f6273;
            while (true) {
                Reference referencePoll = ((ReferenceQueue) c1893.f6276).poll();
                if (referencePoll == null) {
                    break;
                }
                Object obj = map.get(referencePoll);
                if (obj != null) {
                    c1893.f6272.remove(obj);
                }
                map.remove(referencePoll);
            }
            c1893.f6272.clear();
            c1893.f6273.clear();
            c1893.f6274 = 0;
        }
        if (this.f463 == null) {
            C0468 c0468 = this.f458;
            c0468.getClass();
            ArrayList arrayList = new ArrayList();
            c0468.f2090.forEach(new C0459(arrayList, 0));
            arrayList.addAll(c0468.f2089);
            this.f463 = new C0454(this, (URL[]) arrayList.toArray(new URL[0]));
        }
        C1065 c1065 = new C1065();
        for (String str : strArr) {
            AbstractC0464 abstractC0464M1840 = this.f458.m1840(str);
            if (abstractC0464M1840 == null) {
                C0468.m1837().m1841(true);
                abstractC0464M1840 = C0468.m1837().m1840(str);
            }
            if (abstractC0464M1840 == null) {
                throw new C0701(AbstractC2844.m4790("Nothing known about class: ", str));
            }
            if (abstractC0464M1840 instanceof C0466) {
                throw new C0701("Cannot reload class: " + str + " from source: " + abstractC0464M1840);
            }
            c1065.m2741(str, abstractC0464M1840);
        }
        C1066 c1066 = new C1066(this, new URL[0]);
        c1066.f3858 = c1065;
        C1066.f3857 = c1066;
        Iterator it = c1065.keySet().iterator();
        while (it.hasNext()) {
            this.f464.put((String) it.next(), C1066.f3857);
        }
        mo304();
    }
}
