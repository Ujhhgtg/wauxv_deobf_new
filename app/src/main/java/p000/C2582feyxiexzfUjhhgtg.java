package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.C0029Ujhhgtgfeyxiexzf;
import bsh.Node;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳ要点脸ᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2582feyxiexzfUjhhgtg extends AbstractC2584feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final Object f8348Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f8349Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final boolean f8350Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Class f8351Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Method[] f8352Ujhhgtgfeyxiexzf;

    public C2582feyxiexzfUjhhgtg(Node node, Object obj, String str) {
        super(node);
        this.f8348Ujhhgtgfeyxiexzf = obj;
        this.f8349Ujhhgtgfeyxiexzf = str;
        boolean z = obj instanceof C2810Ujhhgtgfeyxiexzf;
        this.f8350Ujhhgtgfeyxiexzf = z;
        Class<?> cls = z ? ((C2810Ujhhgtgfeyxiexzf) obj).f8945Ujhhgtgfeyxiexzf : obj.getClass();
        this.f8351Ujhhgtgfeyxiexzf = cls;
        this.f8352Ujhhgtgfeyxiexzf = cls.isInterface() ? (Method[]) AbstractC0615Ujhhgtgfeyxiexzf.m1877Ujhhgtgfeyxiexzf(cls.getMethods(), Object.class.getMethods()) : cls.getMethods();
    }

    @Override // p000.AbstractC2584feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Object mo306Ujhhgtgfeyxiexzf(Object[] objArr) throws C1863Ujhhgtgfeyxiexzf, C1985Ujhhgtgfeyxiexzf {
        Node node = this.f8359Ujhhgtgfeyxiexzf;
        String str = this.f8349Ujhhgtgfeyxiexzf;
        try {
            C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf = new C0029Ujhhgtgfeyxiexzf(null, null, "MethodReferenceLambda");
            C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg = new C2637feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf);
            RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf = new RunnableC0026Ujhhgtgfeyxiexzf(c0029Ujhhgtgfeyxiexzf, null);
            if (!this.f8350Ujhhgtgfeyxiexzf) {
                return AbstractC0033Ujhhgtgfeyxiexzf.m543Ujhhgtgfeyxiexzf(this.f8348Ujhhgtgfeyxiexzf, this.f8349Ujhhgtgfeyxiexzf, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node);
            }
            boolean zEquals = str.equals("new");
            Class cls = this.f8351Ujhhgtgfeyxiexzf;
            if (zEquals) {
                return AbstractC0033Ujhhgtgfeyxiexzf.m521Ujhhgtgfeyxiexzf(cls, null, objArr);
            }
            if (objArr.length != 0 && cls.isInstance(objArr[0])) {
                Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr);
                Class[] clsArr = (Class[]) Arrays.copyOfRange(clsArrM563Ujhhgtgfeyxiexzf, 1, clsArrM563Ujhhgtgfeyxiexzf.length);
                for (Method method : this.f8352Ujhhgtgfeyxiexzf) {
                    if (str.equals(method.getName())) {
                        try {
                            Object[] objArr2 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                            if (Modifier.isStatic(method.getModifiers())) {
                                if (AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(clsArrM563Ujhhgtgfeyxiexzf, method.getGenericParameterTypes(), 1)) {
                                    return method.invoke(null, objArr);
                                }
                            } else if (AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(clsArr, method.getGenericParameterTypes(), 1)) {
                                return method.invoke(objArr[0], Arrays.copyOfRange(objArr, 1, objArr.length));
                            }
                        } catch (IllegalAccessException unused) {
                            continue;
                        }
                    }
                }
                throw new C1863Ujhhgtgfeyxiexzf("Can't invoke lambda made from method reference!");
            }
            return AbstractC0033Ujhhgtgfeyxiexzf.m544feyxiexzfUjhhgtg(c0029Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf(), cls, str, objArr, node);
        } catch (InvocationTargetException e) {
            throw new C1985Ujhhgtgfeyxiexzf(e.getTargetException(), node, null);
        }
    }

    @Override // p000.AbstractC2584feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public final boolean mo307Ujhhgtgfeyxiexzf(int i, Method method) {
        boolean z = this.f8350Ujhhgtgfeyxiexzf;
        String str = this.f8349Ujhhgtgfeyxiexzf;
        Class cls = this.f8351Ujhhgtgfeyxiexzf;
        if (!z) {
            for (Method method2 : cls.getMethods()) {
                if (str.equals(method2.getName())) {
                    Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                    if (!Modifier.isStatic(method2.getModifiers()) && AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(method2.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0034Ujhhgtgfeyxiexzf.m565Ujhhgtgfeyxiexzf(method2.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        } else if (str.equals("new")) {
            for (Constructor<?> constructor : cls.getConstructors()) {
                if (AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(constructor.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0034Ujhhgtgfeyxiexzf.m565Ujhhgtgfeyxiexzf(cls, method.getGenericReturnType(), i)) {
                    return true;
                }
            }
        } else {
            for (Method method3 : this.f8352Ujhhgtgfeyxiexzf) {
                if (str.equals(method3.getName())) {
                    Object[] objArr2 = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
                    if (Modifier.isStatic(method3.getModifiers())) {
                        if (AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf(method3.getParameterTypes(), method.getGenericParameterTypes(), i) && AbstractC0034Ujhhgtgfeyxiexzf.m565Ujhhgtgfeyxiexzf(method3.getReturnType(), method.getGenericReturnType(), i)) {
                            return true;
                        }
                    } else if (AbstractC0034Ujhhgtgfeyxiexzf.m577Ujhhgtgfeyxiexzf((Class[]) AbstractC0615Ujhhgtgfeyxiexzf.m1877Ujhhgtgfeyxiexzf(new Class[]{cls}, method3.getParameterTypes()), method.getGenericParameterTypes(), i) && AbstractC0034Ujhhgtgfeyxiexzf.m565Ujhhgtgfeyxiexzf(method3.getReturnType(), method.getGenericReturnType(), i)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
