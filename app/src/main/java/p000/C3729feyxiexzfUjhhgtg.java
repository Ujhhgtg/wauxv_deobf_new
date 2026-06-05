package p000;

import dalvik.system.PathClassLoader;
import java.lang.invoke.MethodHandle;
import java.lang.reflect.Executable;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸能不能ᛳᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3729feyxiexzfUjhhgtg extends PathClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str) {
        if (Object.class.getName().equals(str)) {
            return Object.class;
        }
        try {
            return findClass(str);
        } catch (ClassNotFoundException unused) {
            if (Executable.class.getName().equals(str)) {
                return C0569Ujhhgtgfeyxiexzf.class;
            }
            if (MethodHandle.class.getName().equals(str)) {
                return C0570Ujhhgtgfeyxiexzf.class;
            }
            return Class.class.getName().equals(str) ? C0568Ujhhgtgfeyxiexzf.class : super.loadClass(str);
        }
    }
}
