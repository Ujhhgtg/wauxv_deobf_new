package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.C0027Ujhhgtgfeyxiexzf;
import bsh.Primitive;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛲᛴ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0695Ujhhgtgfeyxiexzf implements Member {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final boolean f2843Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final boolean f2844Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final String f2845Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final String f2846Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public final int f2847Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final Class f2848Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public MethodHandle f2842Ujhhgtgfeyxiexzf = null;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final ArrayList f2849Ujhhgtgfeyxiexzf = new ArrayList();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public int f2850Ujhhgtgfeyxiexzf = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0695Ujhhgtgfeyxiexzf(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f2847Ujhhgtgfeyxiexzf = member.getModifiers();
        this.f2848Ujhhgtgfeyxiexzf = member.getDeclaringClass();
        this.f2846Ujhhgtgfeyxiexzf = member.getName();
        this.f2845Ujhhgtgfeyxiexzf = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        this.f2843Ujhhgtgfeyxiexzf = Modifier.isStatic(member2.getModifiers());
        this.f2844Ujhhgtgfeyxiexzf = member2.isSynthetic();
        if (!C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Object m1963Ujhhgtgfeyxiexzf(Class cls, Object obj) {
        Class<?> clsM562Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(obj, false);
        if (clsM562Ujhhgtgfeyxiexzf == null || !cls.isAssignableFrom(clsM562Ujhhgtgfeyxiexzf)) {
            obj = AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(0, cls, obj);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = (AbstractC0695Ujhhgtgfeyxiexzf) obj;
                if (this.f2846Ujhhgtgfeyxiexzf.equals(abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf) && this.f2848Ujhhgtgfeyxiexzf == abstractC0695Ujhhgtgfeyxiexzf.f2848Ujhhgtgfeyxiexzf && mo1966Ujhhgtgfeyxiexzf() == abstractC0695Ujhhgtgfeyxiexzf.mo1966Ujhhgtgfeyxiexzf() && mo1641Ujhhgtgfeyxiexzf() == abstractC0695Ujhhgtgfeyxiexzf.mo1641Ujhhgtgfeyxiexzf() && this.f2847Ujhhgtgfeyxiexzf == abstractC0695Ujhhgtgfeyxiexzf.f2847Ujhhgtgfeyxiexzf) {
                    for (int i = 0; i < mo1966Ujhhgtgfeyxiexzf(); i++) {
                        if (mo1967Ujhhgtgfeyxiexzf()[i] == abstractC0695Ujhhgtgfeyxiexzf.mo1967Ujhhgtgfeyxiexzf()[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Member
    public final Class getDeclaringClass() {
        return this.f2848Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f2847Ujhhgtgfeyxiexzf;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f2846Ujhhgtgfeyxiexzf;
    }

    public final int hashCode() {
        return (((((getClass().hashCode() ^ this.f2846Ujhhgtgfeyxiexzf.hashCode()) ^ this.f2848Ujhhgtgfeyxiexzf.hashCode()) ^ mo1966Ujhhgtgfeyxiexzf()) ^ mo1641Ujhhgtgfeyxiexzf().hashCode()) ^ this.f2847Ujhhgtgfeyxiexzf) ^ ((Integer) Stream.of((Object[]) mo1967Ujhhgtgfeyxiexzf()).map(new C2389Ujhhgtgfeyxiexzf(13)).reduce(75, new C0714Ujhhgtgfeyxiexzf())).intValue();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f2844Ujhhgtgfeyxiexzf;
    }

    public final String toString() {
        return this.f2845Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C2667feyxiexzfUjhhgtg mo1640Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f2850Ujhhgtgfeyxiexzf > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f2846Ujhhgtgfeyxiexzf + Arrays.asList(mo1967Ujhhgtgfeyxiexzf()));
        }
        ArrayList arrayList = this.f2849Ujhhgtgfeyxiexzf;
        arrayList.clear();
        for (int i = 0; i < this.f2850Ujhhgtgfeyxiexzf; i++) {
            arrayList.add(m1963Ujhhgtgfeyxiexzf(mo1967Ujhhgtgfeyxiexzf()[i], objArr[i]));
        }
        return new C2667feyxiexzfUjhhgtg((Object) arrayList, false);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final MethodHandle m1964Ujhhgtgfeyxiexzf() {
        if (this.f2842Ujhhgtgfeyxiexzf == null) {
            this.f2842Ujhhgtgfeyxiexzf = mo1644Ujhhgtgfeyxiexzf(null);
        }
        return this.f2842Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final String[] m1965Ujhhgtgfeyxiexzf() {
        return (String[]) MethodType.methodType((Class<?>) mo1641Ujhhgtgfeyxiexzf(), (Class<?>[]) mo1967Ujhhgtgfeyxiexzf()).parameterList().stream().map(new C0027Ujhhgtgfeyxiexzf()).toArray(new C2571Ujhhgtgfeyxiexzf(3));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public abstract int mo1966Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public abstract Class[] mo1967Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public abstract Class mo1641Ujhhgtgfeyxiexzf();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public Class mo1968Ujhhgtgfeyxiexzf() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public synchronized Object mo1969Ujhhgtgfeyxiexzf(Object obj, Object... objArr) {
        if (objArr == null) {
            objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            try {
            } catch (Throwable th) {
                throw new InvocationTargetException(th);
            }
        }
        throw th;
        return Primitive.wrap(m1970Ujhhgtgfeyxiexzf(obj, objArr), (Class<?>) mo1641Ujhhgtgfeyxiexzf());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final synchronized Object m1970Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) {
        try {
            AbstractC0033Ujhhgtgfeyxiexzf.m546feyxiexzfUjhhgtg("Invoking method (entry): ", this, objArr);
            C2667feyxiexzfUjhhgtg c2667feyxiexzfUjhhgtgMo1640Ujhhgtgfeyxiexzf = mo1640Ujhhgtgfeyxiexzf(obj, objArr);
            List<?> list = (List) c2667feyxiexzfUjhhgtgMo1640Ujhhgtgfeyxiexzf.f8534Ujhhgtgfeyxiexzf;
            if (((Boolean) RunnableC0026Ujhhgtgfeyxiexzf.f514Ujhhgtgfeyxiexzf.get()).booleanValue()) {
                AbstractC0033Ujhhgtgfeyxiexzf.m546feyxiexzfUjhhgtg("Invoking method (after): ", this, list.toArray());
            }
            if (mo1966Ujhhgtgfeyxiexzf() > 0) {
                MethodHandle methodHandleM1964Ujhhgtgfeyxiexzf = m1964Ujhhgtgfeyxiexzf();
                if (c2667feyxiexzfUjhhgtgMo1640Ujhhgtgfeyxiexzf.f8533Ujhhgtgfeyxiexzf) {
                    methodHandleM1964Ujhhgtgfeyxiexzf = methodHandleM1964Ujhhgtgfeyxiexzf.asFixedArity();
                }
                return methodHandleM1964Ujhhgtgfeyxiexzf.invokeWithArguments(list);
            }
            if (!mo1972Ujhhgtgfeyxiexzf() && !(this instanceof C3659Ujhhgtgfeyxiexzf)) {
                return (Object) m1964Ujhhgtgfeyxiexzf().invoke(list.get(0));
            }
            return (Object) m1964Ujhhgtgfeyxiexzf().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ */
    public boolean mo1642Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public boolean mo1971Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ */
    public boolean mo1643Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public boolean mo1972Ujhhgtgfeyxiexzf() {
        return this.f2843Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public boolean mo1973Ujhhgtgfeyxiexzf() {
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ */
    public abstract MethodHandle mo1644Ujhhgtgfeyxiexzf(MethodHandle methodHandle);
}
