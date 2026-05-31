package p000;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᛸᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2011 extends AbstractC1243 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static final Pattern f6657 = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final Class f6658;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public Method f6659;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public final boolean f6660;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public final boolean f6661;

    public C2011(Method method) {
        super(method);
        this.f6660 = false;
        this.f6661 = false;
        this.f6659 = method;
        Class<?> returnType = method.getReturnType();
        this.f6658 = returnType;
        this.f5675 = this.f4503 - (this.f4504 ? 1 : 0);
        if (f6657.matcher(this.f5671).matches()) {
            boolean zStartsWith = this.f5671.startsWith("set");
            this.f6661 = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f4503 != 0 || returnType == cls) ? false : true;
            this.f6660 = z;
            this.f6661 = zStartsWith & (this.f4503 == 1 && returnType == cls);
            if (z && this.f5671.startsWith("is")) {
                this.f6660 = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static MethodHandle m4010(Method method) {
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
        StringBuilder sbM4625 = AbstractC2647.m4625("MethodHandle lookup failed to find a ", name, " in ");
        sbM4625.append(declaringClass.getName());
        throw new RuntimeException(sbM4625.toString());
    }

    @Override // p000.AbstractC1243, p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final C0427 mo2460(Object obj, Object[] objArr) throws InvocationTargetException {
        C0427 c0427Mo2460 = super.mo2460(obj, objArr);
        boolean z = this.f5668;
        ArrayList arrayList = this.f5674;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C0427(arrayList, c0427Mo2460.f1993);
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public final Class mo2461() {
        return this.f6658;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ */
    public final boolean mo3568() {
        return this.f6660;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ */
    public final boolean mo3569() {
        return this.f6661;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public final MethodHandle mo2464(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM4010 = m4010(this.f6659);
                if (this.f4504 && methodHandleM4010 != null) {
                    methodHandleM4010 = methodHandleM4010.asVarargsCollector(this.f4501);
                }
                this.f6659 = null;
                return methodHandleM4010;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f6659 = null;
            throw th;
        }
    }
}
