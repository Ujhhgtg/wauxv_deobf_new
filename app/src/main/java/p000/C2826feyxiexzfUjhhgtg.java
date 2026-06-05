package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱᛱUjhhgtgᛱ要点脸ᛳᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2826feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C2826feyxiexzfUjhhgtg f8985Ujhhgtgfeyxiexzf = new C2826feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final HashMap f8986Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final HashMap f8987Ujhhgtgfeyxiexzf = new HashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static void m4155Ujhhgtgfeyxiexzf(HashMap map, C2825feyxiexzfUjhhgtg c2825feyxiexzfUjhhgtg, Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf, Class cls) {
        Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzf2 = (Ujhhgtgfeyxiexzf) map.get(c2825feyxiexzfUjhhgtg);
        if (ujhhgtgfeyxiexzf2 == null || ujhhgtgfeyxiexzf == ujhhgtgfeyxiexzf2) {
            if (ujhhgtgfeyxiexzf2 == null) {
                map.put(c2825feyxiexzfUjhhgtg, ujhhgtgfeyxiexzf);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c2825feyxiexzfUjhhgtg.f8984Ujhhgtgfeyxiexzf.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + ujhhgtgfeyxiexzf2 + ", new value " + ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final C2844feyxiexzfUjhhgtg m4156Ujhhgtgfeyxiexzf(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f8986Ujhhgtgfeyxiexzf;
        if (superclass != null) {
            C2844feyxiexzfUjhhgtg c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf = (C2844feyxiexzfUjhhgtg) map2.get(superclass);
            if (c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf == null) {
                c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf = m4156Ujhhgtgfeyxiexzf(superclass, null);
            }
            map.putAll(c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf.f9043Ujhhgtgfeyxiexzf);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C2844feyxiexzfUjhhgtg c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf2 = (C2844feyxiexzfUjhhgtg) map2.get(cls2);
            if (c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf2 == null) {
                c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf2 = m4156Ujhhgtgfeyxiexzf(cls2, null);
            }
            for (Map.Entry entry : c2844feyxiexzfUjhhgtgM4156Ujhhgtgfeyxiexzf2.f9043Ujhhgtgfeyxiexzf.entrySet()) {
                m4155Ujhhgtgfeyxiexzf(map, (C2825feyxiexzfUjhhgtg) entry.getKey(), (Ujhhgtgfeyxiexzf) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            InterfaceC1320feyxiexzfUjhhgtg interfaceC1320feyxiexzfUjhhgtg = (InterfaceC1320feyxiexzfUjhhgtg) method.getAnnotation(InterfaceC1320feyxiexzfUjhhgtg.class);
            if (interfaceC1320feyxiexzfUjhhgtg != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC0083Ujhhgtgfeyxiexzf.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                Ujhhgtgfeyxiexzf ujhhgtgfeyxiexzfValue = interfaceC1320feyxiexzfUjhhgtg.value();
                if (parameterTypes.length > 1) {
                    if (!Ujhhgtgfeyxiexzf.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (ujhhgtgfeyxiexzfValue != Ujhhgtgfeyxiexzf.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m4155Ujhhgtgfeyxiexzf(map, new C2825feyxiexzfUjhhgtg(i, method), ujhhgtgfeyxiexzfValue, cls);
                z = true;
            }
        }
        C2844feyxiexzfUjhhgtg c2844feyxiexzfUjhhgtg = new C2844feyxiexzfUjhhgtg(map);
        map2.put(cls, c2844feyxiexzfUjhhgtg);
        this.f8987Ujhhgtgfeyxiexzf.put(cls, Boolean.valueOf(z));
        return c2844feyxiexzfUjhhgtg;
    }
}
