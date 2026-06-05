package p000;

import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ要点脸ᛲᛴᛳ能不能ᛱUjhhgtgᛱᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3365Ujhhgtgfeyxiexzf extends AbstractC0695Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public final Class f10521Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public final Class[] f10522Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public final int f10523Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public final boolean f10524Ujhhgtgfeyxiexzf;

    public AbstractC3365Ujhhgtgfeyxiexzf(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f10522Ujhhgtgfeyxiexzf = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f10523Ujhhgtgfeyxiexzf = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f10524Ujhhgtgfeyxiexzf = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f2850Ujhhgtgfeyxiexzf = i;
        this.f10521Ujhhgtgfeyxiexzf = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public C2667feyxiexzfUjhhgtg mo1640Ujhhgtgfeyxiexzf(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo1640Ujhhgtgfeyxiexzf(obj, objArr);
        boolean z = this.f10524Ujhhgtgfeyxiexzf;
        ArrayList arrayList = this.f2849Ujhhgtgfeyxiexzf;
        boolean z2 = false;
        z2 = false;
        if (z) {
            int i = this.f2850Ujhhgtgfeyxiexzf;
            int length = objArr.length;
            Class cls = this.f10521Ujhhgtgfeyxiexzf;
            if (i < length) {
                Object obj2 = objArr[i];
                int length2 = objArr.length;
                int i2 = this.f10523Ujhhgtgfeyxiexzf;
                if (i2 == length2 && obj2 != null && obj2.getClass().isArray() && AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls).isAssignableFrom(obj2.getClass().getComponentType())) {
                    arrayList.add(obj2);
                } else if (i2 == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance((Class<?>) AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls), objArr2.length);
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        Array.set(objNewInstance, i3, AbstractC0695Ujhhgtgfeyxiexzf.m1963Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls), objArr2[i3]));
                    }
                    arrayList.add(objNewInstance);
                } else {
                    int length3 = objArr.length - this.f2850Ujhhgtgfeyxiexzf;
                    Object objNewInstance2 = Array.newInstance((Class<?>) AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls), length3);
                    for (int i4 = 0; i4 < length3; i4++) {
                        Array.set(objNewInstance2, i4, AbstractC0695Ujhhgtgfeyxiexzf.m1963Ujhhgtgfeyxiexzf(AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls), objArr[this.f2850Ujhhgtgfeyxiexzf + i4]));
                    }
                    arrayList.add(objNewInstance2);
                }
            } else {
                arrayList.add(Array.newInstance((Class<?>) AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(cls), 0));
            }
            z2 = true;
        } else {
            int i5 = this.f2850Ujhhgtgfeyxiexzf;
            if (i5 < objArr.length) {
                arrayList.add(AbstractC0695Ujhhgtgfeyxiexzf.m1963Ujhhgtgfeyxiexzf(this.f10522Ujhhgtgfeyxiexzf[i5], objArr[i5]));
            }
        }
        return new C2667feyxiexzfUjhhgtg(arrayList, z2);
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ */
    public final int mo1966Ujhhgtgfeyxiexzf() {
        return this.f10523Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ */
    public final Class[] mo1967Ujhhgtgfeyxiexzf() {
        return this.f10522Ujhhgtgfeyxiexzf;
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public final Class mo1968Ujhhgtgfeyxiexzf() {
        return AbstractC0034Ujhhgtgfeyxiexzf.m556Ujhhgtgfeyxiexzf(this.f10521Ujhhgtgfeyxiexzf);
    }

    @Override // p000.AbstractC0695Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ */
    public final boolean mo1973Ujhhgtgfeyxiexzf() {
        return this.f10524Ujhhgtgfeyxiexzf;
    }
}
