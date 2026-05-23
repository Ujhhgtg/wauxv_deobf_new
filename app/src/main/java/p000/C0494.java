package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.C0007;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0494 extends AbstractC0496 {

    public final Object f2128;

    public final String f2129;

    public final boolean f2130;

    public final Class f2131;

    public final Method[] f2132;

    public C0494(C0349 c0349, Object obj, String str) {
        super(c0349);
        this.f2128 = obj;
        this.f2129 = str;
        boolean z = obj instanceof C0704;
        this.f2130 = z;
        Class<?> cls = z ? ((C0704) obj).f2682 : obj.getClass();
        this.f2131 = cls;
        this.f2132 = cls.isInterface() ? (Method[]) AbstractC2207.m4090(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // p000.AbstractC0496
    public final Object mo1739(Object[] objArr) throws C3523, C2895 {
        AbstractC2707 abstractC2707 = this.f2137;
        String str = this.f2129;
        try {
            C0007 c0007 = new C0007(null, null, "MethodReferenceLambda");
            C0550 c0550 = new C0550(c0007);
            RunnableC1668 runnableC1668 = new RunnableC1668(c0007, null);
            if (!this.f2130) {
                return AbstractC0009.m399(this.f2128, this.f2129, objArr, runnableC1668, c0550, abstractC2707);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f2131;
            if (zEquals) {
                return AbstractC0009.m377(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM420 = AbstractC0010.m420(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM420, 1, clsArrM420.length);
                for (Method method : this.f2132) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC0009.f516;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC0010.m434(clsArrM420, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC0010.m434(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new C3523("Can't invoke lambda made from method reference!");
            }
            return AbstractC0009.m400(c0007.m346(), cls, str, objArr, abstractC2707);
        } catch (InvocationTargetException e) {
            throw new C2895(e.getTargetException(), abstractC2707, null);
        }
    }

    @Override // p000.AbstractC0496
    public final boolean mo1740(int i, Method method) {
        boolean z = this.f2130;
        String str = this.f2129;
        Class cls = this.f2131;
        if (!z) {
            for (Method method2 : cls.getMethods()) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC0009.f516;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC0010.m434(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0010.m422(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC0010.m434(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0010.m422(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f2132) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC0009.f516;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC0010.m434(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0010.m422(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC0010.m434((Class[]) AbstractC2207.m4090(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC0010.m422(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
