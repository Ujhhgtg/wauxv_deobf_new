package p000;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱᛳ要点脸ᛴᛱfeyxiexzfᛱᛲ能不能, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0391Ujhhgtgfeyxiexzf extends AbstractC3365Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static final Pattern f2126Ujhhgtgfeyxiexzf = Pattern.compile("(?:[gs]et|is)\\p{javaUpperCase}.*");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Class f2127Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public Method f2128Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final boolean f2129Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public final boolean f2130Ujhhgtgfeyxiexzf;

    public C0391Ujhhgtgfeyxiexzf(Method method) {
        super(method);
        this.f2129Ujhhgtgfeyxiexzf = false;
        this.f2130Ujhhgtgfeyxiexzf = false;
        this.f2128Ujhhgtgfeyxiexzf = method;
        Class<?> returnType = method.getReturnType();
        this.f2127Ujhhgtgfeyxiexzf = returnType;
        this.f2850Ujhhgtgfeyxiexzf = this.f10523Ujhhgtgfeyxiexzf - (this.f10524Ujhhgtgfeyxiexzf ? 1 : 0);
        if (f2126Ujhhgtgfeyxiexzf.matcher(this.f2846Ujhhgtgfeyxiexzf).matches()) {
            boolean zStartsWith = this.f2846Ujhhgtgfeyxiexzf.startsWith("set");
            this.f2130Ujhhgtgfeyxiexzf = zStartsWith;
            Class<?> cls = Void.TYPE;
            boolean z = (zStartsWith || this.f10523Ujhhgtgfeyxiexzf != 0 || returnType == cls) ? false : true;
            this.f2129Ujhhgtgfeyxiexzf = z;
            this.f2130Ujhhgtgfeyxiexzf = zStartsWith & (this.f10523Ujhhgtgfeyxiexzf == 1 && returnType == cls);
            if (z && this.f2846Ujhhgtgfeyxiexzf.startsWith("is")) {
                this.f2129Ujhhgtgfeyxiexzf = returnType == Boolean.class || returnType == Boolean.TYPE;
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static MethodHandle m1639Ujhhgtgfeyxiexzf(Method method) {
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
        StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("MethodHandle lookup failed to find a ", name, " in ");
        sbM2419Ujhhgtgfeyxiexzf.append(declaringClass.getName());
        throw new RuntimeException(sbM2419Ujhhgtgfeyxiexzf.toString());
    }

    @Override // p000.AbstractC3365Ujhhgtgfeyxiexzf, p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final C2667feyxiexzfUjhhgtg mo1640Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) throws InvocationTargetException {
        C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtgMo1640Ujhhgtgfeyxiexzf = super.mo1640Ujhhgtgfeyxiexzf(obj, objArr);
        boolean z = this.f2843Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f2849Ujhhgtgfeyxiexzf;
        if (!z) {
            arrayList.add(0, obj);
        }
        return new C2667feyxiexzfUjhhgtg(arrayList, c2667feyxiexzfUjhhgtgMo1640Ujhhgtgfeyxiexzf.f8533Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final Class mo1641Ujhhgtgfeyxiexzf() {
        return this.f2127Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public final boolean mo1642Ujhhgtgfeyxiexzf() {
        return this.f2129Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final boolean mo1643Ujhhgtgfeyxiexzf() {
        return this.f2130Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final MethodHandle mo1644Ujhhgtgfeyxiexzf(MethodHandle methodHandle) {
        try {
            try {
                MethodHandle methodHandleM1639Ujhhgtgfeyxiexzf = m1639Ujhhgtgfeyxiexzf(this.f2128Ujhhgtgfeyxiexzf);
                if (this.f10524Ujhhgtgfeyxiexzf && methodHandleM1639Ujhhgtgfeyxiexzf != null) {
                    methodHandleM1639Ujhhgtgfeyxiexzf = methodHandleM1639Ujhhgtgfeyxiexzf.asVarargsCollector(this.f10521Ujhhgtgfeyxiexzf);
                }
                this.f2128Ujhhgtgfeyxiexzf = null;
                return methodHandleM1639Ujhhgtgfeyxiexzf;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            this.f2128Ujhhgtgfeyxiexzf = null;
            throw th;
        }
    }
}
