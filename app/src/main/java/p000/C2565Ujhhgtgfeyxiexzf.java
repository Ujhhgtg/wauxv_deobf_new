package p000;

import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.net.URL;
import java.net.URLClassLoader;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class C2565Ujhhgtgfeyxiexzf extends URLClassLoader {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final C2809Ujhhgtgfeyxiexzf f8309Ujhhgtgfeyxiexzf;

    public C2565Ujhhgtgfeyxiexzf(C2809Ujhhgtgfeyxiexzf c2809Ujhhgtgfeyxiexzf, URL[] urlArr) {
        super(urlArr);
        this.f8309Ujhhgtgfeyxiexzf = c2809Ujhhgtgfeyxiexzf;
    }

    @Override // java.net.URLClassLoader
    public final void addURL(URL url) {
        super.addURL(url);
    }

    @Override // java.net.URLClassLoader, java.lang.ClassLoader
    public Class findClass(String str) throws ClassNotFoundException {
        C2809Ujhhgtgfeyxiexzf c2809Ujhhgtgfeyxiexzf = this.f8309Ujhhgtgfeyxiexzf;
        ClassLoader classLoader = (ClassLoader) c2809Ujhhgtgfeyxiexzf.f8944Ujhhgtgfeyxiexzf.get(str);
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
        C2565Ujhhgtgfeyxiexzf c2565Ujhhgtgfeyxiexzf = c2809Ujhhgtgfeyxiexzf.f8943Ujhhgtgfeyxiexzf;
        if (c2565Ujhhgtgfeyxiexzf != null && c2565Ujhhgtgfeyxiexzf != this) {
            try {
                return c2565Ujhhgtgfeyxiexzf.loadClass(str);
            } catch (ClassNotFoundException unused2) {
            }
        }
        ClassLoader classLoader2 = c2809Ujhhgtgfeyxiexzf.f8932Ujhhgtgfeyxiexzf;
        Class<?> clsLoadClass = classLoader2 != null ? classLoader2.loadClass(str) : Class.forName(str);
        c2809Ujhhgtgfeyxiexzf.m4132Ujhhgtgfeyxiexzf(clsLoadClass, str);
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
        if (str.startsWith("bsh") && (classLoader = RunnableC0026Ujhhgtgfeyxiexzf.class.getClassLoader()) != null) {
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
