package p000;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲁᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0705 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final ConcurrentHashMap f2692 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Class m2223(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException(("JVM class not resolved: " + str).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Object m2224(Class cls, final Object[] objArr) {
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
        ConcurrentHashMap concurrentHashMap = f2692;
        Constructor constructor = (Constructor) concurrentHashMap.get(string);
        if (constructor != null) {
            return m2225(constructor, objArr);
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        final int i3 = 0;
        C1333 c1333M4688 = AbstractC2713.m4688(AbstractC2713.m4688(declaredConstructors.length == 0 ? C1193.f4328 : new C0281(declaredConstructors, 0), new C0661(13)), new InterfaceC1433() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲁᤞᲇ
            @Override // p000.InterfaceC1433
            public final Object invoke(Object obj2) {
                Constructor constructor2 = (Constructor) obj2;
                switch (i3) {
                    case 0:
                        return Boolean.valueOf(constructor2.getParameterCount() == objArr.length);
                    default:
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        int length3 = parameterTypes.length;
                        Object[] objArr2 = objArr;
                        int iMin = Math.min(length3, objArr2.length);
                        ArrayList<C2348> arrayList = new ArrayList(iMin);
                        boolean z = false;
                        for (int i4 = 0; i4 < iMin; i4++) {
                            arrayList.add(new C2348(parameterTypes[i4], objArr2[i4]));
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            for (C2348 c2348 : arrayList) {
                                Class cls2 = (Class) c2348.f7567;
                                Object obj3 = c2348.f7568;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (AbstractC1469.m3322(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (AbstractC1469.m3322(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (AbstractC1469.m3322(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (AbstractC1469.m3322(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (AbstractC1469.m3322(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (AbstractC1469.m3322(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (AbstractC1469.m3322(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (AbstractC1469.m3322(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (AbstractC1469.m3322(cls2, Void.TYPE)) {
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
        C1332 c1332 = new C1332(AbstractC2713.m4688(c1333M4688, new InterfaceC1433() { // from class: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲁᤞᲇ
            @Override // p000.InterfaceC1433
            public final Object invoke(Object obj2) {
                Constructor constructor2 = (Constructor) obj2;
                switch (i4) {
                    case 0:
                        return Boolean.valueOf(constructor2.getParameterCount() == objArr.length);
                    default:
                        Class<?>[] parameterTypes = constructor2.getParameterTypes();
                        int length3 = parameterTypes.length;
                        Object[] objArr2 = objArr;
                        int iMin = Math.min(length3, objArr2.length);
                        ArrayList<C2348> arrayList = new ArrayList(iMin);
                        boolean z = false;
                        for (int i5 = 0; i5 < iMin; i5++) {
                            arrayList.add(new C2348(parameterTypes[i5], objArr2[i5]));
                        }
                        if (arrayList.isEmpty()) {
                            z = true;
                        } else {
                            for (C2348 c2348 : arrayList) {
                                Class cls2 = (Class) c2348.f7567;
                                Object obj3 = c2348.f7568;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (AbstractC1469.m3322(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (AbstractC1469.m3322(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (AbstractC1469.m3322(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (AbstractC1469.m3322(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (AbstractC1469.m3322(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (AbstractC1469.m3322(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (AbstractC1469.m3322(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (AbstractC1469.m3322(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (AbstractC1469.m3322(cls2, Void.TYPE)) {
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
        }));
        Constructor constructor2 = null;
        Constructor constructor3 = (Constructor) (!c1332.hasNext() ? null : c1332.next());
        if (constructor3 == null) {
            constructor3 = null;
        } else if (!constructor3.isAccessible()) {
            constructor3.setAccessible(true);
        }
        if (constructor3 != null) {
            concurrentHashMap.put(string, constructor3);
            constructor2 = constructor3;
        }
        return m2225(constructor2, objArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Object m2225(Constructor constructor, Object[] objArr) {
        Object objNewInstance = constructor != null ? constructor.newInstance(Arrays.copyOf(objArr, objArr.length)) : null;
        Object obj = objNewInstance != null ? objNewInstance : null;
        if (obj != null) {
            return obj;
        }
        String strM1533 = AbstractC0280.m1533(objArr, null, null, null, null, 63);
        if (AbstractC2901.m4869(strM1533)) {
            strM1533 = "(empty)";
        }
        throw new NoSuchMethodError("Could not find a suitable constructor for " + constructor + " with arguments: " + ((Object) strM1533) + ".");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Class m2226(String str, ClassLoader classLoader, int i) {
        Object c2641;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            c2641 = m2223(classLoader, str);
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        return (Class) (c2641 instanceof C2641 ? null : c2641);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final boolean m2227(ClassLoader classLoader, String str) {
        Object c2641;
        try {
            c2641 = classLoader.loadClass(str);
            if (c2641 == null) {
                c2641 = null;
            }
        } catch (Throwable th) {
            c2641 = new C2641(th);
        }
        return ((Class) (c2641 instanceof C2641 ? null : c2641)) != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static C0253 m2228(String str, C0112 c0112, int i) {
        if ((i & 4) != 0) {
            c0112 = null;
        }
        return new C0253(str, c0112);
    }
}
