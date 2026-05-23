package p000;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲇᤝᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0714 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0714 f2716 = new C0714();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f2717 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap f2718 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static void m2141(HashMap map, C0713 c0713, EnumC1769 enumC1769, Class cls) {
        EnumC1769 enumC17610 = (EnumC1769) map.get(c0713);
        if (enumC17610 == null || enumC1769 == enumC17610) {
            if (enumC17610 == null) {
                map.put(c0713, enumC1769);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0713.f2715.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + enumC17610 + ", new value " + enumC1769);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final C0712 m2142(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.f2717;
        if (superclass != null) {
            C0712 c0712M2142 = (C0712) map2.get(superclass);
            if (c0712M2142 == null) {
                c0712M2142 = m2142(superclass, null);
            }
            map.putAll(c0712M2142.f2713);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            C0712 c0712M2143 = (C0712) map2.get(cls2);
            if (c0712M2143 == null) {
                c0712M2143 = m2142(cls2, null);
            }
            for (Map.Entry entry : c0712M2143.f2713.entrySet()) {
                m2141(map, (C0713) entry.getKey(), (EnumC1769) entry.getValue(), cls);
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
            InterfaceC2282 interfaceC2282 = (InterfaceC2282) method.getAnnotation(InterfaceC2282.class);
            if (interfaceC2282 != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!InterfaceC1777.class.isAssignableFrom(parameterTypes[0])) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                EnumC1769 enumC1769Value = interfaceC2282.value();
                if (parameterTypes.length > 1) {
                    if (!EnumC1769.class.isAssignableFrom(parameterTypes[1])) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (enumC1769Value != EnumC1769.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                m2141(map, new C0713(i, method), enumC1769Value, cls);
                z = true;
            }
        }
        C0712 c0712 = new C0712(map);
        map2.put(cls, c0712);
        this.f2718.put(cls, Boolean.valueOf(z));
        return c0712;
    }
}
