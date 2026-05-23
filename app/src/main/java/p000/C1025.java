package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1025 {

    public final String f3754;

    public final String f3755;

    public final ArrayList f3756;

    public final String f3757;

    public final C2873 f3758 = new C2873(new C0106(18, this));

    public C1025(String str) {
        int i;
        int iM4833 = 0;
        int iM4834 = AbstractC2841.m4834(str, "->", 0, false, 6);
        int iM4835 = AbstractC2841.m4834(str, "(", iM4834 + 1, false, 4);
        int i2 = iM4835 + 1;
        int iM4836 = AbstractC2841.m4834(str, ")", i2, false, 4);
        if (iM4834 == -1 || iM4835 == -1 || iM4836 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f3754 = AbstractC1028.m2602(str.substring(0, iM4834));
        this.f3755 = str.substring(iM4834 + 2, iM4835);
        String strSubstring = str.substring(i2, iM4836);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM4833;
            while (true) {
                if (iM4833 >= strSubstring.length()) {
                    break loop0;
                }
                char cCharAt = strSubstring.charAt(iM4833);
                if (cCharAt == 'L') {
                    iM4833 = AbstractC2841.m4833(';', iM4833, 4, strSubstring);
                    break;
                } else if (cCharAt != '[') {
                    break;
                } else {
                    iM4833++;
                }
            }
            iM4833++;
            arrayList.add(AbstractC1028.m2602(strSubstring.substring(i, iM4833)));
        }
        if (i != iM4833) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring));
        }
        this.f3756 = arrayList;
        this.f3757 = AbstractC1028.m2602(str.substring(iM4836 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1025)) {
            return false;
        }
        C1025 c1025 = (C1025) obj;
        return AbstractC2207.m4087(this.f3754, c1025.f3754) && AbstractC2207.m4087(this.f3755, c1025.f3755) && AbstractC2207.m4087(this.f3756, c1025.f3756) && AbstractC2207.m4087(this.f3757, c1025.f3757);
    }

    public final int hashCode() {
        return this.f3757.hashCode() + (this.f3756.hashCode() * 31) + (this.f3755.hashCode() * 31) + (this.f3754.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC1028.m2604(this.f3754) + "->" + this.f3755 + ((String) this.f3758.getValue());
    }

    public final Constructor m2597(ClassLoader classLoader) throws NoSuchMethodException {
        Object c2585;
        C2873 c2873 = this.f3758;
        C2103 c2103 = AbstractC1651.f5593;
        String str = this.f3755;
        if (!AbstractC2207.m4087(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a constructor").toString());
        }
        Class clsM3379 = AbstractC1651.m3379(classLoader, this.f3754);
        Object objM3380 = AbstractC1651.m3380(classLoader, this.f3756);
        Throwable thM4594 = C2586.m4594(objM3380);
        if (thM4594 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4594);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3380;
        try {
            Constructor declaredConstructor = clsM3379.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c2585 = declaredConstructor;
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        boolean z = c2585 instanceof C2585;
        Object obj = c2585;
        if (z) {
            obj = null;
        }
        Constructor constructor = (Constructor) obj;
        if (constructor != null) {
            return constructor;
        }
        try {
            for (Constructor<?> constructor2 : clsM3379.getDeclaredConstructors()) {
                String str2 = (String) c2873.getValue();
                LinkedHashMap linkedHashMap = AbstractC1028.f3771;
                if (AbstractC2207.m4087(str2, "(" + AbstractC0270.m1387(constructor2.getParameterTypes(), "", null, null, new C0853(29), 30) + ")V")) {
                    constructor2.setAccessible(true);
                    return constructor2;
                }
            }
        } catch (Throwable unused) {
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3379, str, (String) c2873.getValue(), Boolean.FALSE);
        if (reflectedMethod != null) {
            Constructor constructor3 = (Constructor) reflectedMethod;
            constructor3.setAccessible(true);
            return constructor3;
        }
        throw new NoSuchMethodException("Constructor " + this + " not found");
    }

    public final Method m2598(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object c2585;
        C2873 c2873;
        Object c2586;
        C2103 c2103 = AbstractC1651.f5593;
        String str = this.f3755;
        if (AbstractC2207.m4087(str, "<clinit>") || AbstractC2207.m4087(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsM3379 = AbstractC1651.m3379(classLoader, this.f3754);
        Object objM3380 = AbstractC1651.m3380(classLoader, this.f3756);
        Throwable thM4594 = C2586.m4594(objM3380);
        if (thM4594 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4594);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3380;
        try {
            c2585 = AbstractC1651.m3379(classLoader, this.f3757);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        Throwable thM4595 = C2586.m4594(c2585);
        if (thM4595 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thM4595);
            throw noSuchMethodException2;
        }
        Class cls = (Class) c2585;
        for (Class superclass = clsM3379; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                c2586 = declaredMethod;
            } catch (Throwable th2) {
                c2586 = new C2585(th2);
            }
            boolean z = c2586 instanceof C2585;
            Object obj = c2586;
            if (z) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && AbstractC2207.m4087(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsM3379;
        while (true) {
            c2873 = this.f3758;
            if (superclass2 == null) {
                break;
            }
            try {
                for (Method method2 : superclass2.getDeclaredMethods()) {
                    if (AbstractC2207.m4087(method2.getName(), str) && AbstractC2207.m4087((String) c2873.getValue(), AbstractC1028.m2600(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3379, str, (String) c2873.getValue(), bool);
        if (reflectedMethod != null) {
            Method method3 = (Method) reflectedMethod;
            method3.setAccessible(true);
            return method3;
        }
        throw new NoSuchMethodException("Method " + this + " not found");
    }
}
