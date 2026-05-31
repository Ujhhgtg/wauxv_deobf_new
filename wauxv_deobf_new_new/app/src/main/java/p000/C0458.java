package p000;

import bsh.RunnableC0008;
import bsh.classpath.ClassManagerImpl;
import java.net.URL;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᲀᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0458 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final C1893 f2065 = new C1893(2, new C0278(2));

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public RunnableC0008 f2066;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public ClassLoader f2067;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C2033 f2069;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final C0102 f2068 = new C0102(4);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final transient ConcurrentHashMap f2070 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final transient ConcurrentHashMap.KeySetView f2071 = ConcurrentHashMap.newKeySet();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final transient ConcurrentHashMap f2072 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C0458 m1829(RunnableC0008 runnableC0008) {
        C0458 c0458;
        WeakHashMap weakHashMap = C0538.f2247;
        if (!weakHashMap.containsKey("bsh.classpath.ClassManagerImpl")) {
            try {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", ClassManagerImpl.class);
            } catch (ClassNotFoundException unused) {
                weakHashMap.put("bsh.classpath.ClassManagerImpl", null);
            }
        }
        WeakHashMap weakHashMap2 = C0538.f2247;
        if (((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")) != null) {
            try {
                try {
                    c0458 = (C0458) ((Class) weakHashMap2.get("bsh.classpath.ClassManagerImpl")).getConstructor(null).newInstance(null);
                } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException e) {
                    e = e;
                    throw new C1684("Error loading classmanager", e);
                }
            } catch (ReflectiveOperationException e2) {
                e = e2;
                throw new C1684("Error loading classmanager", e);
            } catch (SecurityException e3) {
                e = e3;
                throw new C1684("Error loading classmanager", e);
            }
        } else {
            c0458 = new C0458();
        }
        c0458.f2066 = runnableC0008;
        return c0458;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final void m1830(Class cls, String str) {
        if (cls == null) {
            this.f2071.add(str);
        } else {
            this.f2070.put(str, cls);
            f2065.m3819(cls);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public Class mo303(String str) {
        Class<?> clsLoadClass;
        try {
            ClassLoader classLoader = this.f2067;
            clsLoadClass = classLoader != null ? classLoader.loadClass(str) : Class.forName(str);
            m1830(clsLoadClass, str);
        } catch (ClassNotFoundException unused) {
            clsLoadClass = null;
        }
        if (clsLoadClass == null) {
            this.f2066.getClass();
        }
        return clsLoadClass;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public Class mo305(String str, byte[] bArr) {
        throw new C1684(AbstractC1095.m2800("Can't create class (", str, ") without class manager package."));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public void mo306() throws C0537 {
        throw new C0537("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public String mo307(String str) throws C0537 {
        throw new C0537("ClassLoading features unavailable.");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public URL mo308(String str) {
        ClassLoader classLoader = this.f2067;
        URL resource = classLoader != null ? classLoader.getResource(str.substring(1)) : null;
        return resource == null ? RunnableC0008.class.getResource(str) : resource;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ */
    public boolean mo309() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public void mo304() {
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public void mo302(InterfaceC0455 interfaceC0455) {
    }
}
