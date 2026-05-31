package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import org.luckypray.dexkit.util.NativeReflect;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲀᛸᲇᲁᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1028 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final String f3761;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String f3762;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final ArrayList f3763;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String f3764;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final C2933 f3765 = new C2933(new C0114(this, 20));

    public C1028(String str) {
        int i;
        int iM4866 = 0;
        int iM4867 = AbstractC2901.m4867(str, "->", 0, false, 6);
        int iM4868 = AbstractC2901.m4867(str, "(", iM4867 + 1, false, 4);
        int i2 = iM4868 + 1;
        int iM4869 = AbstractC2901.m4867(str, ")", i2, false, 4);
        if (iM4867 == -1 || iM4868 == -1 || iM4869 == -1) {
            throw new IllegalAccessError("not method descriptor: ".concat(str));
        }
        this.f3761 = AbstractC1031.m2726(str.substring(0, iM4867));
        this.f3762 = str.substring(iM4867 + 2, iM4868);
        String strSubstring = str.substring(i2, iM4869);
        ArrayList arrayList = new ArrayList();
        loop0: while (true) {
            i = iM4866;
            while (true) {
                if (iM4866 >= strSubstring.length()) {
                    break loop0;
                }
                char cCharAt = strSubstring.charAt(iM4866);
                if (cCharAt == 'L') {
                    iM4866 = AbstractC2901.m4866(';', iM4866, 4, strSubstring);
                    break;
                } else if (cCharAt != '[') {
                    break;
                } else {
                    iM4866++;
                }
            }
            iM4866++;
            arrayList.add(AbstractC1031.m2726(strSubstring.substring(i, iM4866)));
        }
        if (i != iM4866) {
            throw new IllegalStateException("Unknown signString: ".concat(strSubstring));
        }
        this.f3763 = arrayList;
        this.f3764 = AbstractC1031.m2726(str.substring(iM4869 + 1));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1028)) {
            return false;
        }
        C1028 c1028 = (C1028) obj;
        return AbstractC1469.m3322(this.f3761, c1028.f3761) && AbstractC1469.m3322(this.f3762, c1028.f3762) && AbstractC1469.m3322(this.f3763, c1028.f3763) && AbstractC1469.m3322(this.f3764, c1028.f3764);
    }

    public final int hashCode() {
        return this.f3764.hashCode() + (this.f3763.hashCode() * 31) + (this.f3762.hashCode() * 31) + (this.f3761.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC1031.m2728(this.f3761) + "->" + this.f3762 + ((String) this.f3765.getValue());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Constructor m2721(ClassLoader classLoader) throws NoSuchMethodException {
        Object c2641;
        C2933 c2933 = this.f3765;
        C2136 c2136 = AbstractC1665.f5628;
        String str = this.f3762;
        if (!AbstractC1469.m3322(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a constructor").toString());
        }
        Class clsM3543 = AbstractC1665.m3543(classLoader, this.f3761);
        Object objM3544 = AbstractC1665.m3544(classLoader, this.f3763);
        Throwable thM4616 = C2642.m4616(objM3544);
        if (thM4616 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Constructor " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4616);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3544;
        try {
            Constructor declaredConstructor = clsM3543.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
            declaredConstructor.setAccessible(true);
            c2641 = declaredConstructor;
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        boolean z = c2641 instanceof C2641;
        Object obj = c2641;
        if (z) {
            obj = null;
        }
        Constructor constructor = (Constructor) obj;
        if (constructor != null) {
            return constructor;
        }
        try {
            for (Constructor<?> constructor2 : clsM3543.getDeclaredConstructors()) {
                String str2 = (String) c2933.getValue();
                LinkedHashMap linkedHashMap = AbstractC1031.f3778;
                if (AbstractC1469.m3322(str2, "(" + AbstractC0280.m1533(constructor2.getParameterTypes(), "", null, null, new C0943(16), 30) + ")V")) {
                    constructor2.setAccessible(true);
                    return constructor2;
                }
            }
        } catch (Throwable unused) {
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3543, str, (String) c2933.getValue(), Boolean.FALSE);
        if (reflectedMethod != null) {
            Constructor constructor3 = (Constructor) reflectedMethod;
            constructor3.setAccessible(true);
            return constructor3;
        }
        throw new NoSuchMethodException("Constructor " + this + " not found");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method m2722(ClassLoader classLoader, Boolean bool) throws NoSuchMethodException {
        Object c2641;
        C2933 c2933;
        Object c2642;
        C2136 c2136 = AbstractC1665.f5628;
        String str = this.f3762;
        if (AbstractC1469.m3322(str, "<clinit>") || AbstractC1469.m3322(str, "<init>")) {
            throw new IllegalArgumentException((this + " not a method").toString());
        }
        Class clsM3543 = AbstractC1665.m3543(classLoader, this.f3761);
        Object objM3544 = AbstractC1665.m3544(classLoader, this.f3763);
        Throwable thM4616 = C2642.m4616(objM3544);
        if (thM4616 != null) {
            NoSuchMethodException noSuchMethodException = new NoSuchMethodException("Method " + this + " not available: parameter type(s) missing");
            noSuchMethodException.initCause(thM4616);
            throw noSuchMethodException;
        }
        Class[] clsArr = (Class[]) objM3544;
        try {
            c2641 = AbstractC1665.m3543(classLoader, this.f3764);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        Throwable thM4617 = C2642.m4616(c2641);
        if (thM4617 != null) {
            NoSuchMethodException noSuchMethodException2 = new NoSuchMethodException("Method " + this + " not available: return type missing");
            noSuchMethodException2.initCause(thM4617);
            throw noSuchMethodException2;
        }
        Class cls = (Class) c2641;
        for (Class superclass = clsM3543; superclass != null; superclass = superclass.getSuperclass()) {
            try {
                Method declaredMethod = superclass.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
                declaredMethod.setAccessible(true);
                c2642 = declaredMethod;
            } catch (Throwable th2) {
                c2642 = new C2641(th2);
            }
            boolean z = c2642 instanceof C2641;
            Object obj = c2642;
            if (z) {
                obj = null;
            }
            Method method = (Method) obj;
            if (method != null && AbstractC1469.m3322(method.getReturnType(), cls)) {
                return method;
            }
        }
        Class superclass2 = clsM3543;
        while (true) {
            c2933 = this.f3765;
            if (superclass2 == null) {
                break;
            }
            try {
                for (Method method2 : superclass2.getDeclaredMethods()) {
                    if (AbstractC1469.m3322(method2.getName(), str) && AbstractC1469.m3322((String) c2933.getValue(), AbstractC1031.m2724(method2))) {
                        method2.setAccessible(true);
                        return method2;
                    }
                }
                superclass2 = superclass2.getSuperclass();
            } catch (Throwable unused) {
            }
        }
        Member reflectedMethod = NativeReflect.getReflectedMethod(clsM3543, str, (String) c2933.getValue(), bool);
        if (reflectedMethod != null) {
            Method method3 = (Method) reflectedMethod;
            method3.setAccessible(true);
            return method3;
        }
        throw new NoSuchMethodException("Method " + this + " not found");
    }
}
