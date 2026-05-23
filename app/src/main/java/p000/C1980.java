package p000;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1980 extends AbstractC1241 {

    public static final Pattern f6552 = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    public final Class f6553;

    public Method f6554;

    public final boolean f6555;

    public final boolean f6556;

    public C1980(Method method) {
        super(method);
        this.f6555 = false;
        this.f6556 = false;
        this.f6554 = method;
        Class<?> returnType = method.getReturnType();
        this.f6553 = returnType;
        this.f5648 = this.f4504 - (this.f4505 ? 1 : 0);
        if (f6552.matcher(this.f5644).matches()) {
            boolean zStartsWith = this.f5644.startsWith("set");
            this.f6556 = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f4504 != 0 || returnType == cls) ? false : true;
            this.f6555 = z;
            this.f6556 = zStartsWith & (this.f4504 == 1 && returnType == cls);
            if (z && this.f5644.startsWith("is")) {
                this.f6555 = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    public static MethodHandle m3816(Method method) {
        String name = method.getName();
        Class<?>[] parameterTypes = method.getParameterTypes();
        Class<?> declaringClass = method.getDeclaringClass();
        MethodHandles.Lookup lookup = MethodHandles.lookup();
        Class<?> superclass = declaringClass;
        while (superclass != null) {
            if (method != null) {
                try {
                    return lookup.unreflect(method);
                } catch (IllegalAccessException unused) {
                }
            }
            for (Class<?> cls : superclass.getInterfaces()) {
                try {
                    return lookup.unreflect(cls.getDeclaredMethod(name, parameterTypes));
                } catch (IllegalAccessException | NoSuchMethodException | SecurityException unused2) {
                }
            }
            superclass = superclass.getSuperclass();
            if (superclass != null) {
                try {
                    method = superclass.getDeclaredMethod(name, parameterTypes);
                } catch (NoSuchMethodException | SecurityException unused3) {
                    method = null;
                }
            }
        }
        StringBuilder sbM4679 = AbstractC2668.m4679("MethodHandle lookup failed to find a ", name, " in ");
        sbM4679.append(declaringClass.getName());
        throw new RuntimeException(sbM4679.toString());
    }

    @Override // p000.AbstractC1241, p000.AbstractC1672
    public final C0452 mo2345(Object obj, Object[] objArr) throws InvocationTargetException {
        C0452 c0452Mo2345 = super.mo2345(obj, objArr);
        boolean z = this.f5641;
        ArrayList arrayList = this.f5647;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C0452(arrayList, c0452Mo2345.f2021);
    }

    @Override // p000.AbstractC1672
    public final Class mo2346() {
        return this.f6553;
    }

    @Override // p000.AbstractC1672
    public final boolean mo3401() {
        return this.f6555;
    }

    @Override // p000.AbstractC1672
    public final boolean mo3402() {
        return this.f6556;
    }

    @Override // p000.AbstractC1672
    public final MethodHandle mo2349(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM3816 = m3816(this.f6554);
                if (this.f4505 && methodHandleM3816 != null) {
                    methodHandleM3816 = methodHandleM3816.asVarargsCollector(this.f4502);
                }
                this.f6554 = null;
                return methodHandleM3816;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f6554 = null;
            throw th;
        }
    }
}
