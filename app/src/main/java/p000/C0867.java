package p000;

import dalvik.system.PathClassLoader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0867 extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (Executable.class.getName().equals(str)) {
                return C1528.class;
            }
            if (MethodHandle.class.getName().equals(str)) {
                return C1529.class;
            }
            return Class.class.getName().equals(str) ? C1527.class : super.loadClass(str);
        }
    }
}
