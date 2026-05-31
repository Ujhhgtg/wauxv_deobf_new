package p000;

import bsh.classpath.ClassManagerImpl;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᲁᛸᲈᤞᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1066 extends C0454 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C1066 f3857;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public C1065 f3858;

    @Override // p000.C0454, java.net.URLClassLoader, java.lang.ClassLoader
    public final Class findClass(String str) {
        AbstractC0464 abstractC0464M2740 = this.f3858.m2740(str);
        if (abstractC0464M2740 == null) {
            return super.findClass(str);
        }
        byte[] bArrMo1831 = abstractC0464M2740.mo1831(str);
        ClassManagerImpl classManagerImpl = this.f2061;
        Class clsM1847 = AbstractC0475.m1847(str, bArrMo1831, classManagerImpl.f2069);
        ((ConcurrentHashMap) classManagerImpl.f2069.f6773).put(str, clsM1847);
        return clsM1847;
    }

    public final String toString() {
        return super.toString() + "for files: " + this.f3858;
    }
}
