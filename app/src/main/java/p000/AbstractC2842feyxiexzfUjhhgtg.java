package p000;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛲᛳᛱUjhhgtgᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2842feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final ConcurrentHashMap f9028Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Class m4167Ujhhgtgfeyxiexzf(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            classLoader = null;
        }
        Class<?> cls = classLoader != null ? Class.forName(str, false, classLoader) : Class.forName(str);
        if (cls != null) {
            return cls;
        }
        throw new IllegalStateException(("JVM class not resolved: " + str).toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Object m4168Ujhhgtgfeyxiexzf(Class cls, final Object[] objArr) {
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
        ArrayList arrayList = new ArrayList(objArr.length);
        int length2 = objArr.length;
        for (int i2 = 0; i2 < length2; i2++) {
            Object obj = objArr[i2];
            arrayList.add(obj != null ? new C3750feyxiexzfUjhhgtg(obj.getClass()) : C3749Ujhhgtgfeyxiexzf.f11824Ujhhgtgfeyxiexzf);
        }
        C3751Ujhhgtgfeyxiexzf c3751Ujhhgtgfeyxiexzf = new C3751Ujhhgtgfeyxiexzf(cls, arrayList);
        ConcurrentHashMap concurrentHashMap = f9028Ujhhgtgfeyxiexzf;
        Constructor constructor = (Constructor) concurrentHashMap.get(c3751Ujhhgtgfeyxiexzf);
        if (constructor != null) {
            return m4169Ujhhgtgfeyxiexzf(constructor, objArr);
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        final int i3 = 0;
        final int i4 = 1;
        C3447Ujhhgtgfeyxiexzf c3447Ujhhgtgfeyxiexzf = new C3447Ujhhgtgfeyxiexzf(new C3455feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(new C3455feyxiexzfUjhhgtg(declaredConstructors.length == 0 ? C3307feyxiexzfUjhhgtg.f10344Ujhhgtgfeyxiexzf : new C2399Ujhhgtgfeyxiexzf(0, declaredConstructors), new C2901feyxiexzfUjhhgtg(11), 0), new InterfaceC3549feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱᛳ
            @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
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
                        ArrayList<C1381feyxiexzfUjhhgtg> arrayList2 = new ArrayList(iMin);
                        boolean z = false;
                        for (int i5 = 0; i5 < iMin; i5++) {
                            arrayList2.add(new C1381feyxiexzfUjhhgtg(parameterTypes[i5], objArr2[i5]));
                        }
                        if (arrayList2.isEmpty()) {
                            z = true;
                        } else {
                            for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : arrayList2) {
                                Class cls2 = (Class) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf;
                                Object obj3 = c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Void.TYPE)) {
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
        }, 0), new InterfaceC3549feyxiexzfUjhhgtg() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛴᛱfeyxiexzfᛱ要点脸ᛲᛱUjhhgtgᛱᛳ
            @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
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
                        ArrayList<C1381feyxiexzfUjhhgtg> arrayList2 = new ArrayList(iMin);
                        boolean z = false;
                        for (int i5 = 0; i5 < iMin; i5++) {
                            arrayList2.add(new C1381feyxiexzfUjhhgtg(parameterTypes[i5], objArr2[i5]));
                        }
                        if (arrayList2.isEmpty()) {
                            z = true;
                        } else {
                            for (C1381feyxiexzfUjhhgtg c1381feyxiexzfUjhhgtg : arrayList2) {
                                Class cls2 = (Class) c1381feyxiexzfUjhhgtg.f4874Ujhhgtgfeyxiexzf;
                                Object obj3 = c1381feyxiexzfUjhhgtg.f4875Ujhhgtgfeyxiexzf;
                                if (obj3 != null || cls2.isPrimitive()) {
                                    if (obj3 != null) {
                                        Class<?> cls3 = obj3.getClass();
                                        if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Boolean.TYPE)) {
                                            cls2 = Boolean.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Byte.TYPE)) {
                                            cls2 = Byte.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Character.TYPE)) {
                                            cls2 = Character.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Short.TYPE)) {
                                            cls2 = Short.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Integer.TYPE)) {
                                            cls2 = Integer.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Long.TYPE)) {
                                            cls2 = Long.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Float.TYPE)) {
                                            cls2 = Float.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Double.TYPE)) {
                                            cls2 = Double.class;
                                        } else if (C3052Ujhhgtgfeyxiexzf.m4512Ujhhgtgfeyxiexzf(cls2, Void.TYPE)) {
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
        }, 0));
        Constructor constructor2 = null;
        Constructor constructor3 = (Constructor) (!c3447Ujhhgtgfeyxiexzf.hasNext() ? null : c3447Ujhhgtgfeyxiexzf.next());
        if (constructor3 != null) {
            if (!AbstractC0376Ujhhgtgfeyxiexzf.m1623Ujhhgtgfeyxiexzf(constructor3)) {
                throw new IllegalArgumentException(("Failed to make the constructor \"" + constructor3 + "\" accessible. Please check if the constructor is accessible or if the security manager allows it.").toString());
            }
            concurrentHashMap.put(c3751Ujhhgtgfeyxiexzf, constructor3);
            constructor2 = constructor3;
        }
        return m4169Ujhhgtgfeyxiexzf(constructor2, objArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Object m4169Ujhhgtgfeyxiexzf(Constructor constructor, Object[] objArr) {
        Object objNewInstance = constructor != null ? constructor.newInstance(Arrays.copyOf(objArr, objArr.length)) : null;
        Object obj = objNewInstance != null ? objNewInstance : null;
        if (obj != null) {
            return obj;
        }
        String strM3651feyxiexzfUjhhgtg = AbstractC2391Ujhhgtgfeyxiexzf.m3651feyxiexzfUjhhgtg(objArr, null, null, null, null, 63);
        if (AbstractC1152feyxiexzfUjhhgtg.m2631feyxiexzfUjhhgtg(strM3651feyxiexzfUjhhgtg)) {
            strM3651feyxiexzfUjhhgtg = "(empty)";
        }
        throw new NoSuchMethodError("Could not find a suitable constructor for " + constructor + " with arguments: " + ((Object) strM3651feyxiexzfUjhhgtg) + ".");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static Class m4170Ujhhgtgfeyxiexzf(String str, ClassLoader classLoader, int i) {
        Object c0919feyxiexzfUjhhgtg;
        if ((i & 1) != 0) {
            classLoader = null;
        }
        try {
            c0919feyxiexzfUjhhgtg = m4167Ujhhgtgfeyxiexzf(classLoader, str);
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        return (Class) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final boolean m4171Ujhhgtgfeyxiexzf(ClassLoader classLoader, String str) {
        Object c0919feyxiexzfUjhhgtg;
        try {
            c0919feyxiexzfUjhhgtg = classLoader.loadClass(str);
            if (c0919feyxiexzfUjhhgtg == null) {
                c0919feyxiexzfUjhhgtg = null;
            }
        } catch (Throwable th) {
            c0919feyxiexzfUjhhgtg = new C0919feyxiexzfUjhhgtg(th);
        }
        return ((Class) (c0919feyxiexzfUjhhgtg instanceof C0919feyxiexzfUjhhgtg ? null : c0919feyxiexzfUjhhgtg)) != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static C2366Ujhhgtgfeyxiexzf m4172Ujhhgtgfeyxiexzf(String str, C2975feyxiexzfUjhhgtg c2975feyxiexzfUjhhgtg, int i) {
        if ((i & 4) != 0) {
            c2975feyxiexzfUjhhgtg = null;
        }
        return new C2366Ujhhgtgfeyxiexzf(str, c2975feyxiexzfUjhhgtg);
    }
}
