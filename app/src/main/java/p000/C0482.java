package p000;

import bsh.classpath.ClassManagerImpl;
import java.net.URL;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0482 {

    public static final C1867 f2092 = new C1867(2, new C0268(2));

    public RunnableC1668 f2093;

    public ClassLoader f2094;

    public final C0094 f2095 = new C0094(4);

    public final transient ConcurrentHashMap f2096 = new ConcurrentHashMap();

    public final transient ConcurrentHashMap.KeySetView f2097 = ConcurrentHashMap.newKeySet();

    public final transient ConcurrentHashMap f2098 = new ConcurrentHashMap();

    public static C0482 m1721(RunnableC1668 runnableC1668) {
        C0482 c0482;
        WeakHashMap weakHashMap = C0561.f2291;
        if (!weakHashMap.containsKey("bsh.classpath.ClassManagerImpl")) {
            try {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", ClassManagerImpl.class);
            } catch (ClassNotFoundException unused) {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", null);
            }
        }
        WeakHashMap weakHashMap2 = C0561.f2291;
        if (((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")) != null) {
            try {
                try {
                    c0482 = (C0482) ((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")).getConstructor(null).newInstance(null);
                } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException e) {
                    e = e;
                    throw new C1669("Error loading classmanager", e);
                }
            } catch (ReflectiveOperationException e2) {
                e = e2;
                throw new C1669("Error loading classmanager", e);
            } catch (SecurityException e3) {
                e = e3;
                throw new C1669("Error loading classmanager", e);
            }
        } else {
            c0482 = new C0482();
        }
        c0482.f2093 = runnableC1668;
        return c0482;
    }

    public final void m1722(Class cls, String str) {
        if (cls == null) {
            this.f2097.add(str);
        } else {
            this.f2096.put(str, cls);
            f2092.m3641(cls);
        }
    }

    public Class mo297(String str) {
        Class<?> clsLoadClass;
        try {
            ClassLoader classLoader = this.f2094;
            clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m1722(clsLoadClass, str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            
        }
        return clsLoadClass;
    }

    public Class mo299(String str, byte[] bArr) {
        throw new C1669(AbstractC1194.m2785("Can't create class (", str, ") without class manager package."));
    }

    public void mo300() throws C0560 {
        throw new C0560("ClassLoading features unavailable.");
    }

    public String mo301(String str) throws C0560 {
        throw new C0560("ClassLoading features unavailable.");
    }

    public URL mo302(String str) {
        ClassLoader classLoader = this.f2094;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? RunnableC1668.class.getResource(str) : resource;
    }

    public boolean mo303() {
        return false;
    }

    public void mo298() {
    }

    public void mo296(InterfaceC0480 interfaceC0480) {
    }
}
