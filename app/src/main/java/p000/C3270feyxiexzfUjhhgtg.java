package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛱfeyxiexzfᛱ能不能ᛳᛴᛲᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3270feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final String f10277Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String f10278Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final ArrayList f10279Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String f10280Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final C2065feyxiexzfUjhhgtg f10281Ujhhgtgfeyxiexzf = new C2065feyxiexzfUjhhgtg(new C2977Ujhhgtgfeyxiexzf(20, this));

    public C3270feyxiexzfUjhhgtg(String str) {
        int i;
        int iM2628feyxiexzfUjhhgtg = 0;
        int iM2629feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2629feyxiexzfUjhhgtg(str, "->", 0, false, 6);
        int iM2629feyxiexzfUjhhgtg2 = AbstractC1152feyxiexzfUjhhgtg.m2629feyxiexzfUjhhgtg(str, "(", iM2629feyxiexzfUjhhgtg + 1, false, 4);
        int i2 = iM2629feyxiexzfUjhhgtg2 + 1;
        int iM2629feyxiexzfUjhhgtg3 = AbstractC1152feyxiexzfUjhhgtg.m2629feyxiexzfUjhhgtg(str, ")", i2, false, 4);
        if (iM2629feyxiexzfUjhhgtg == -1 || iM2629feyxiexzfUjhhgtg2 == -1 || iM2629feyxiexzfUjhhgtg3 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f10277Ujhhgtgfeyxiexzf = AbstractC3273feyxiexzfUjhhgtg.m4781Ujhhgtgfeyxiexzf(str.substring(0, iM2629feyxiexzfUjhhgtg));
        this.f10278Ujhhgtgfeyxiexzf = str.substring(iM2629feyxiexzfUjhhgtg + 2, iM2629feyxiexzfUjhhgtg2);
        String strSubstring = str.substring(i2, iM2629feyxiexzfUjhhgtg3);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM2628feyxiexzfUjhhgtg;
            while (true) {
                if (iM2628feyxiexzfUjhhgtg >= strSubstring.length()) {
                    break loop0;
                }
                char cCharAt = strSubstring.charAt(iM2628feyxiexzfUjhhgtg);
                if (cCharAt == 'L') {
                    iM2628feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2628feyxiexzfUjhhgtg(';', iM2628feyxiexzfUjhhgtg, 4, strSubstring);
                    break;
                } else if (cCharAt != '[') {
                    break;
                } else {
                    iM2628feyxiexzfUjhhgtg++;
                }
            }
            iM2628feyxiexzfUjhhgtg++;
            arrayList.add(AbstractC3273feyxiexzfUjhhgtg.m4781Ujhhgtgfeyxiexzf(strSubstring.substring(i, iM2628feyxiexzfUjhhgtg)));
        }
        if (i != iM2628feyxiexzfUjhhgtg) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring));
        }
        this.f10279Ujhhgtgfeyxiexzf = arrayList;
        this.f10280Ujhhgtgfeyxiexzf = AbstractC3273feyxiexzfUjhhgtg.m4781Ujhhgtgfeyxiexzf(str.substring(iM2629feyxiexzfUjhhgtg3 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3270feyxiexzfUjhhgtg)) {
            return false;
        }
        C3270feyxiexzfUjhhgtg c3270feyxiexzfUjhhgtg = (C3270feyxiexzfUjhhgtg) obj;
        return C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10277Ujhhgtgfeyxiexzf, c3270feyxiexzfUjhhgtg.f10277Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10278Ujhhgtgfeyxiexzf, c3270feyxiexzfUjhhgtg.f10278Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10279Ujhhgtgfeyxiexzf, c3270feyxiexzfUjhhgtg.f10279Ujhhgtgfeyxiexzf) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(this.f10280Ujhhgtgfeyxiexzf, c3270feyxiexzfUjhhgtg.f10280Ujhhgtgfeyxiexzf);
    }

    public final int hashCode() {
        return this.f10280Ujhhgtgfeyxiexzf.hashCode() + (this.f10279Ujhhgtgfeyxiexzf.hashCode() * 31) + (this.f10278Ujhhgtgfeyxiexzf.hashCode() * 31) + (this.f10277Ujhhgtgfeyxiexzf.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC3273feyxiexzfUjhhgtg.m4783Ujhhgtgfeyxiexzf(this.f10277Ujhhgtgfeyxiexzf) + "->" + this.f10278Ujhhgtgfeyxiexzf + ((String) this.f10281Ujhhgtgfeyxiexzf.getValue());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Constructor m4776Ujhhgtgfeyxiexzf(ClassLoader classLoader) throws NoSuchMethodException {
        Object c0919feyxiexzfUjhhgtg;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg = this.f10281Ujhhgtgfeyxiexzf;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.f2783Ujhhgtgfeyxiexzf;
        String str = this.f10278Ujhhgtgfeyxiexzf;
        if (!C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a constructor").toString());
        }
        Class clsM1934Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.m1934Ujhhgtgfeyxiexzf(classLoader, this.f10277Ujhhgtgfeyxiexzf);
        Object objM1935Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.m1935Ujhhgtgfeyxiexzf(classLoader, this.f10279Ujhhgtgfeyxiexzf);
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(objM1935Ujhhgtgfeyxiexzf);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM2409Ujhhgtgfeyxiexzf);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM1935Ujhhgtgfeyxiexzf;
        try {
            Constructor declaredConstructor = clsM1934Ujhhgtgfeyxiexzf.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c0919feyxiexzfUjhhgtg = declaredConstructor;
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        boolean z = c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg;
        Object obj = c0919feyxiexzfUjhhgtg;
        if (z) {
            obj = null;
        }
        Constructor constructor = (Constructor) obj;
        if (constructor != null) {
            return constructor;
        }
        try {
            for (Constructor<?> constructor2 : clsM1934Ujhhgtgfeyxiexzf.getDeclaredConstructors()) {
                String str2 = (String) c2065feyxiexzfUjhhgtg.getValue();
                LinkedHashMap linkedHashMap = AbstractC3273feyxiexzfUjhhgtg.f10294Ujhhgtgfeyxiexzf;
                if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str2, "(" + AbstractC2391Ujhhgtgfeyxiexzf.m3651feyxiexzfUjhhgtg(constructor2.getParameterTypes(), "", null, null, new C3083Ujhhgtgfeyxiexzf(14), 30) + ")V")) {
                    constructor2.setAccessible(true);
                    return constructor2;
                }
            }
        } catch (Throwable unused) {
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM1934Ujhhgtgfeyxiexzf, str, (String) c2065feyxiexzfUjhhgtg.getValue(), Boolean.FALSE);
        if (reflectedMethod != null) {
            Constructor constructor3 = (Constructor) reflectedMethod;
            constructor3.setAccessible(true);
            return constructor3;
        }
        throw new NoSuchMethodException("Constructor " + this + " not found");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Method m4777Ujhhgtgfeyxiexzf(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object c0919feyxiexzfUjhhgtg;
        C2065feyxiexzfUjhhgtg c2065feyxiexzfUjhhgtg;
        Object c0919feyxiexzfUjhhgtg2;
        C0416Ujhhgtgfeyxiexzf c0416Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.f2783Ujhhgtgfeyxiexzf;
        String str = this.f10278Ujhhgtgfeyxiexzf;
        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "<clinit>") || C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsM1934Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.m1934Ujhhgtgfeyxiexzf(classLoader, this.f10277Ujhhgtgfeyxiexzf);
        Object objM1935Ujhhgtgfeyxiexzf = AbstractC0668Ujhhgtgfeyxiexzf.m1935Ujhhgtgfeyxiexzf(classLoader, this.f10279Ujhhgtgfeyxiexzf);
        Throwable thM2409Ujhhgtgfeyxiexzf = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(objM1935Ujhhgtgfeyxiexzf);
        if (thM2409Ujhhgtgfeyxiexzf != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM2409Ujhhgtgfeyxiexzf);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM1935Ujhhgtgfeyxiexzf;
        try {
            c0919feyxiexzfUjhhgtg = AbstractC0668Ujhhgtgfeyxiexzf.m1934Ujhhgtgfeyxiexzf(classLoader, this.f10280Ujhhgtgfeyxiexzf);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        Throwable thM2409Ujhhgtgfeyxiexzf2 = C0918feyxiexzfUjhhgtg.m2409Ujhhgtgfeyxiexzf(c0919feyxiexzfUjhhgtg);
        if (thM2409Ujhhgtgfeyxiexzf2 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thM2409Ujhhgtgfeyxiexzf2);
            throw noSuchMethodException2;
        }
        Class cls = (Class) c0919feyxiexzfUjhhgtg;
        for (Class superclass = clsM1934Ujhhgtgfeyxiexzf; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                c0919feyxiexzfUjhhgtg2 = declaredMethod;
            } catch (Throwable th2) {
                c0919feyxiexzfUjhhgtg2 = new C0919feyxiexzfUjhhgtg(th2);
            }
            boolean z = c0919feyxiexzfUjhhgtg2 instanceof C0919feyxiexzfUjhhgtg;
            Object obj = c0919feyxiexzfUjhhgtg2;
            if (z) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsM1934Ujhhgtgfeyxiexzf;
        while (true) {
            c2065feyxiexzfUjhhgtg = this.f10281Ujhhgtgfeyxiexzf;
            if (superclass2 == null) {
                break;
            }
            try {
                for (Method method2 : superclass2.getDeclaredMethods()) {
                    if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(method2.getName(), str) && C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf((String) c2065feyxiexzfUjhhgtg.getValue(), AbstractC3273feyxiexzfUjhhgtg.m4779Ujhhgtgfeyxiexzf(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM1934Ujhhgtgfeyxiexzf, str, (String) c2065feyxiexzfUjhhgtg.getValue(), bool);
        if (reflectedMethod != null) {
            Method method3 = (Method) reflectedMethod;
            method3.setAccessible(true);
            return method3;
        }
        throw new NoSuchMethodException("Method " + this + " not found");
    }
}
