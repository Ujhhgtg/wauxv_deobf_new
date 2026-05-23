package p000;

import bsh.classpath.ClassManagerImpl;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤝᤞᲀᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C0479 extends URLClassLoader {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final ClassManagerImpl f2089;

    public C0479(ClassManagerImpl classManagerImpl, URL[] urlArr) {
        super(urlArr);
        this.f2089 = classManagerImpl;
    }

    @Override // java.net.URLClassLoader
    public final void addURL(URL url) {
        super.addURL(url);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        ClassManagerImpl classManagerImpl = this.f2089;
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
        C0479 c0479 = classManagerImpl.f463;
        if (c0479 != null && c0479 != this) {
            try {
                return c0479.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        ClassLoader classLoader2 = classManagerImpl.f2094;
        Class<?> clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
        classManagerImpl.m1722(clsLoadClass, str);
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
        if (str.startsWith("bsh") && (classLoader = RunnableC1668.class.getClassLoader()) != null) {
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
