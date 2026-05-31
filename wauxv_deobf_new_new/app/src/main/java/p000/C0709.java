package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤞᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0709 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0709 f2710 = new C0709();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f2711 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap f2712 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2233(HashMap map, C0708 c0708, EnumC1792 enumC1792, Class cls) {
        EnumC1792 enumC1793 = (EnumC1792) map.get(c0708);
        if (enumC1793 == null || enumC1792 == enumC1793) {
            if (enumC1793 == null) {
                map.put(c0708, enumC1792);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0708.f2709.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC1793 + ", new value " + enumC1792);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0707 m2234(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2711;
        if (superclass != null) {
            C0707 c0707M2234 = (C0707) map2.get(superclass);
            if (c0707M2234 == null) {
                c0707M2234 = m2234(superclass, null);
            }
            map.putAll(c0707M2234.f2707);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0707 c0707M2235 = (C0707) map2.get(cls2);
            if (c0707M2235 == null) {
                c0707M2235 = m2234(cls2, null);
            }
            for (Map.Entry entry : c0707M2235.f2707.entrySet()) {
                m2233(map, (C0708) entry.getKey(), (EnumC1792) entry.getValue(), cls);
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
            InterfaceC2314 interfaceC2314 = (InterfaceC2314) method.getAnnotation(InterfaceC2314.class);
            if (interfaceC2314 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1800.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC1792 enumC1792Value = interfaceC2314.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1792.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1792Value != EnumC1792.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2233(map, new C0708(i, method), enumC1792Value, cls);
                z = true;
            }
        }
        C0707 c0707 = new C0707(map);
        map2.put(cls, c0707);
        this.f2712.put(cls, Boolean.valueOf(z));
        return c0707;
    }
}
