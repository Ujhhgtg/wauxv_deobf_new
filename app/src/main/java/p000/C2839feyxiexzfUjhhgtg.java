package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛱUjhhgtgᛱᛲᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2839feyxiexzfUjhhgtg implements InterfaceC0144Ujhhgtgfeyxiexzf, InterfaceC2808Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Class f9019Ujhhgtgfeyxiexzf;

    static {
        List listM4192Ujhhgtgfeyxiexzf = AbstractC2852feyxiexzfUjhhgtg.m4192Ujhhgtgfeyxiexzf(InterfaceC3545feyxiexzfUjhhgtg.class, InterfaceC3549feyxiexzfUjhhgtg.class, InterfaceC3553feyxiexzfUjhhgtg.class, InterfaceC3556feyxiexzfUjhhgtg.class, C0451Ujhhgtgfeyxiexzf.class, InterfaceC3555feyxiexzfUjhhgtg.class, InterfaceC3583Ujhhgtgfeyxiexzf.class, InterfaceC3584Ujhhgtgfeyxiexzf.class, InterfaceC3585feyxiexzfUjhhgtg.class, InterfaceC3586feyxiexzfUjhhgtg.class, InterfaceC3546feyxiexzfUjhhgtg.class, InterfaceC3542feyxiexzfUjhhgtg.class, InterfaceC3541feyxiexzfUjhhgtg.class, InterfaceC3544feyxiexzfUjhhgtg.class, InterfaceC3543feyxiexzfUjhhgtg.class, InterfaceC3551feyxiexzfUjhhgtg.class, InterfaceC3552feyxiexzfUjhhgtg.class, InterfaceC3548feyxiexzfUjhhgtg.class, InterfaceC3547feyxiexzfUjhhgtg.class, InterfaceC3550feyxiexzfUjhhgtg.class, InterfaceC3557feyxiexzfUjhhgtg.class, InterfaceC3558feyxiexzfUjhhgtg.class, InterfaceC3554feyxiexzfUjhhgtg.class);
        ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(listM4192Ujhhgtgfeyxiexzf, 10));
        int i = 0;
        for (Object obj : listM4192Ujhhgtgfeyxiexzf) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC2852feyxiexzfUjhhgtg.m4193Ujhhgtgfeyxiexzf();
                throw null;
            }
            arrayList.add(new C1381feyxiexzfUjhhgtg((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        AbstractC0202Ujhhgtgfeyxiexzf.m1283Ujhhgtgfeyxiexzf(arrayList);
    }

    public C2839feyxiexzfUjhhgtg(Class cls) {
        this.f9019Ujhhgtgfeyxiexzf = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C2839feyxiexzfUjhhgtg) && AbstractC3593Ujhhgtgfeyxiexzf.m5158Ujhhgtgfeyxiexzf(this).equals(AbstractC3593Ujhhgtgfeyxiexzf.m5158Ujhhgtgfeyxiexzf((InterfaceC0144Ujhhgtgfeyxiexzf) obj));
    }

    public final int hashCode() {
        return AbstractC3593Ujhhgtgfeyxiexzf.m5158Ujhhgtgfeyxiexzf(this).hashCode();
    }

    public final String toString() {
        return this.f9019Ujhhgtgfeyxiexzf.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000.InterfaceC2808Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final Class mo2998Ujhhgtgfeyxiexzf() {
        return this.f9019Ujhhgtgfeyxiexzf;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final String m4165Ujhhgtgfeyxiexzf() {
        String strM2838Ujhhgtgfeyxiexzf;
        Class cls = this.f9019Ujhhgtgfeyxiexzf;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2838Ujhhgtgfeyxiexzf2 = AbstractC1265feyxiexzfUjhhgtg.m2838Ujhhgtgfeyxiexzf(cls.getName());
                return strM2838Ujhhgtgfeyxiexzf2 == null ? cls.getSimpleName() : strM2838Ujhhgtgfeyxiexzf2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM2838Ujhhgtgfeyxiexzf = AbstractC1265feyxiexzfUjhhgtg.m2838Ujhhgtgfeyxiexzf(componentType.getName())) != null) {
                strConcat = strM2838Ujhhgtgfeyxiexzf.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM2628feyxiexzfUjhhgtg = AbstractC1152feyxiexzfUjhhgtg.m2628feyxiexzfUjhhgtg('$', 0, 6, simpleName);
            return iM2628feyxiexzfUjhhgtg == -1 ? simpleName : simpleName.substring(iM2628feyxiexzfUjhhgtg + 1, simpleName.length());
        }
        return AbstractC1152feyxiexzfUjhhgtg.m2639Ujhhgtgfeyxiexzf(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
