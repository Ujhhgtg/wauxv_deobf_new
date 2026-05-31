package p000;

import bsh.AbstractC0016;
import bsh.AbstractC0017;
import bsh.C0012;
import bsh.Node;
import bsh.RunnableC0008;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲇᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0470 extends AbstractC0472 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object f2098;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f2099;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final boolean f2100;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Class f2101;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Method[] f2102;

    public C0470(Node node, Object obj, String str) {
        super(node);
        this.f2098 = obj;
        this.f2099 = str;
        boolean z = obj instanceof C0699;
        this.f2100 = z;
        Class<?> cls = z ? ((C0699) obj).f2676 : obj.getClass();
        this.f2101 = cls;
        this.f2102 = cls.isInterface() ? (Method[]) AbstractC3528.m5091(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // p000.AbstractC0472
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Object mo320(Object[] objArr) throws C2954, C3581 {
        Node node = this.f2106;
        String str = this.f2099;
        try {
            C0012 c0012 = new C0012(null, null, "MethodReferenceLambda");
            C0527 c0527 = new C0527(c0012);
            RunnableC0008 runnableC0008 = new RunnableC0008(c0012, null);
            if (!this.f2100) {
                return AbstractC0016.m544(this.f2098, this.f2099, objArr, runnableC0008, c0527, node);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f2101;
            if (zEquals) {
                return AbstractC0016.m522(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM564 = AbstractC0017.m564(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM564, 1, clsArrM564.length);
                for (Method method : this.f2102) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC0016.f568;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC0017.m578(clsArrM564, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC0017.m578(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new C3581("Can't invoke lambda made from method reference!");
            }
            return AbstractC0016.m545(c0012.m365(), cls, str, objArr, node);
        } catch (InvocationTargetException e) {
            throw new C2954(e.getTargetException(), node, null);
        }
    }

    @Override // p000.AbstractC0472
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final boolean mo321(int i, Method method) {
        boolean z = this.f2100;
        String str = this.f2099;
        Class cls = this.f2101;
        if (!z) {
            for (Method method2 : cls.getMethods()) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC0016.f568;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC0017.m578(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0017.m566(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC0017.m578(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0017.m566(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f2102) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC0016.f568;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC0017.m578(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0017.m566(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC0017.m578((Class[]) AbstractC3528.m5091(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC0017.m566(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
