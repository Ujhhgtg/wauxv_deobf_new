package p000;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0710 {

    public static final ConcurrentHashMap f2698 = new ConcurrentHashMap();

    public static final Class m2130(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (true) {
            return cls;
        }
        throw new IllegalStateException(("JVM class not resolved: " + str).toString());
    }

    public static final Object m2131(Class cls, final Object[] objArr) {
        if (objArr.length != 0) {
            int length = objArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    throw new IllegalStateException(("Not allowed to create an instance with all null arguments for " + cls + ".").toString());
                }
                if (objArr[i] != null) {
                    break;
                }
                i++;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cls.getName());
        sb.append('|');
        int length2 = objArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            sb.append(obj != null ? obj.getClass().getName() : "null");
            sb.append('|');
        }
        sb.append("isPublic: true");
        String string = sb.toString();
        ConcurrentHashMap concurrentHashMap = f2698;
        Constructor constructor = (Constructor) concurrentHashMap.get(string);
        if (constructor != null) {
            return m2132(constructor, objArr);
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        final int i3 = 0;
        C1331 c1331M4654 = AbstractC2652.m4654(AbstractC2652.m4654(declaredConstructors.length == 0 ? C1191.f4331 : new C0271(0, declaredConstructors), new C0679(4)), new InterfaceC1425() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᤞᤝᲇ
            @Override // p000.InterfaceC1425
            public final Object invoke(Object obj2) {
                Constructor constructor2 = (Constructor) obj2;
                switch (0) {
                    case 0:
                        return Boolean.valueOf(constructor2.getParameterCount() == objArr.length);
                    default:
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        int length3 = parameterTypes.length;
                        Object[] objArr2 = objArr;
                        int iMin = Math.min(length3, objArr2.length);
                        ArrayList<C2315> arrayList = new ArrayList(iMin);
                        boolean z = false;
                        for (int i4 = 0; i4 < iMin; i4++) {
                            arrayList.add(new C2315(parameterTypes[i4], objArr2[i4]));
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            for (C2315 c2315 : arrayList) {
                                Class cls2 = (Class) c2315.f7445;
                                Object obj3 = c2315.f7446;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (AbstractC2207.m4087(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (AbstractC2207.m4087(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (AbstractC2207.m4087(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (AbstractC2207.m4087(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (AbstractC2207.m4087(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (AbstractC2207.m4087(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (AbstractC2207.m4087(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (AbstractC2207.m4087(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (AbstractC2207.m4087(cls2, Void.TYPE)) {
                                            cls2 = Void.class;
                                        }
                                        if (cls2.isAssignableFrom(cls3)) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i4 = 1;
        C1330 c1330 = new C1330(AbstractC2652.m4654(c1331M4654, new InterfaceC1425() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᤞᤝᲇ
            @Override // p000.InterfaceC1425
            public final Object invoke(Object obj2) {
                Constructor constructor2 = (Constructor) obj2;
                switch (1) {
                    case 0:
                        return Boolean.valueOf(constructor2.getParameterCount() == objArr.length);
                    default:
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        int length3 = parameterTypes.length;
                        Object[] objArr2 = objArr;
                        int iMin = Math.min(length3, objArr2.length);
                        ArrayList<C2315> arrayList = new ArrayList(iMin);
                        boolean z = false;
                        for (int i5 = 0; i5 < iMin; i5++) {
                            arrayList.add(new C2315(parameterTypes[i5], objArr2[i5]));
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            for (C2315 c2315 : arrayList) {
                                Class cls2 = (Class) c2315.f7445;
                                Object obj3 = c2315.f7446;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (AbstractC2207.m4087(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (AbstractC2207.m4087(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (AbstractC2207.m4087(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (AbstractC2207.m4087(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (AbstractC2207.m4087(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (AbstractC2207.m4087(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (AbstractC2207.m4087(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (AbstractC2207.m4087(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (AbstractC2207.m4087(cls2, Void.TYPE)) {
                                            cls2 = Void.class;
                                        }
                                        if (cls2.isAssignableFrom(cls3)) {
                                        }
                                    }
                                }
                            }
                            z = true;
                        }
                        return Boolean.valueOf(true);
                }
            }
        }));
        Constructor constructor2 = null;
        Constructor constructor3 = (Constructor) (!c1330.hasNext() ? null : c1330.next());
        if (constructor3 == null) {
            constructor3 = null;
        } else if (!constructor3.isAccessible()) {
            constructor3.setAccessible(true);
        }
        if (constructor3 != null) {
            concurrentHashMap.put(string, constructor3);
            constructor2 = constructor3;
        }
        return m2132(constructor2, objArr);
    }

    public static final Object m2132(Constructor constructor, Object[] objArr) {
        Object objNewInstance = constructor != null ? constructor.newInstance(Arrays.copyOf(objArr, objArr.length)) : null;
        Object obj = objNewInstance != null ? objNewInstance : null;
        if (obj != null) {
            return obj;
        }
        String strM1387 = AbstractC0270.m1387(objArr, null, null, null, null, 63);
        if (AbstractC2841.m4836(strM1387)) {
            strM1387 = "(empty)";
        }
        throw new NoSuchMethodError("Could not find a suitable constructor for " + constructor + " with arguments: " + ((Object) strM1387) + ".");
    }

    public static Class m2133(String str, ClassLoader classLoader, int i) {
        Object c2585;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            c2585 = m2130(classLoader, str);
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        return (Class) (c2585 instanceof C2585 ? null : c2585);
    }

    public static final boolean m2134(ClassLoader classLoader, String str) {
        Object c2585;
        try {
            c2585 = classLoader.loadClass(str);
            if (c2585 == null) {
                c2585 = null;
            }
        } catch (Throwable th) {
            c2585 = new C2585(th);
        }
        return ((Class) (c2585 instanceof C2585 ? null : c2585)) != null;
    }

    public static C0243 m2135(String str, C0104 c0104, int i) {
        if ((i & 4) != 0) {
            c0104 = null;
        }
        return new C0243(str, c0104);
    }
}
