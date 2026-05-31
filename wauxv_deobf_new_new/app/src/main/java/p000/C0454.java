package p000;

import bsh.RunnableC0008;
import bsh.classpath.ClassManagerImpl;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲇᲈᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0454 extends URLClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ClassManagerImpl f2061;

    public C0454(ClassManagerImpl classManagerImpl, URL[] urlArr) {
        super(urlArr);
        this.f2061 = classManagerImpl;
    }

    @Override // java.net.URLClassLoader
    public final void addURL(URL url) {
        super.addURL(url);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        ClassManagerImpl classManagerImpl = this.f2061;
        ClassLoader classLoader = (ClassLoader) classManagerImpl.f464.get(str);
        if (classLoader != null && classLoader != this) {
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException e) {
                throw new ClassNotFoundException("Designated loader could not find class: " + e);
            }
        }
        if (getURLs().length > 0) {
            try {
                return super.findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        C0454 c0454 = classManagerImpl.f463;
        if (c0454 != null && c0454 != this) {
            try {
                return c0454.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        ClassLoader classLoader2 = classManagerImpl.f2067;
        Class<?> clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
        classManagerImpl.m1830(clsLoadClass, str);
        return clsLoadClass;
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z) throws ClassNotFoundException {
        ClassLoader classLoader;
        if (str.startsWith("java.")) {
            return super.loadClass(str, z);
        }
        Class<?> clsFindLoadedClass = findLoadedClass(str);
        if (clsFindLoadedClass != null) {
            return clsFindLoadedClass;
        }
        if (str.startsWith("bsh") && (classLoader = RunnableC0008.class.getClassLoader()) != null) {
            try {
                return classLoader.loadClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        Class clsFindClass = findClass(str);
        if (z) {
            resolveClass(clsFindClass);
        }
        return clsFindClass;
    }
}
