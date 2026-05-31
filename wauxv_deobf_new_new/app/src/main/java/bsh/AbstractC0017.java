package bsh;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.HttpUrl;
import p000.AbstractC0472;
import p000.AbstractC1468;
import p000.AbstractC2240;
import p000.C0469;
import p000.C1684;
import p000.C3523;
import p000.C3524;
import p000.C3581;
import p000.C3582;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0017 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Map f574;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Primitive f575;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final Primitive f576;

    static {
        C3523 c3523 = new C3523();
        c3523.put(Byte.TYPE, 0);
        c3523.put(Byte.class, 1);
        c3523.put(Short.TYPE, 2);
        c3523.put(Short.class, 3);
        c3523.put(Character.TYPE, 4);
        c3523.put(Character.class, 5);
        c3523.put(Integer.TYPE, 6);
        c3523.put(Integer.class, 7);
        c3523.put(Long.TYPE, 8);
        c3523.put(Long.class, 9);
        c3523.put(Float.TYPE, 10);
        c3523.put(Float.class, 11);
        c3523.put(Double.TYPE, 12);
        c3523.put(Double.class, 13);
        c3523.put(BigInteger.class, 14);
        c3523.put(BigDecimal.class, 15);
        f574 = Collections.unmodifiableMap(c3523);
        f575 = new Primitive(1);
        f576 = new Primitive(-1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static boolean m555(Class[] clsArr, Class[] clsArr2) {
        if (clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i = 0; i < clsArr.length; i++) {
            if (clsArr[i] != clsArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static int m556(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static Class m557(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static C3581 m558(String str, String str2, Object obj, int i) {
        String str3 = "";
        if (i == 1) {
            StringBuilder sb = new StringBuilder("Cannot assign ");
            sb.append(str2);
            if (obj != null) {
                str3 = " with value \"" + obj + "\"";
            }
            sb.append(str3);
            sb.append(" to ");
            sb.append(str);
            return new C3581(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("Cannot cast ");
        sb2.append(str2);
        if (obj != null) {
            str3 = " with value \"" + obj + "\"";
        }
        sb2.append(str3);
        sb2.append(" to ");
        sb2.append(str);
        ClassCastException classCastException = new ClassCastException(sb2.toString());
        return new C3582(classCastException.getMessage(), classCastException);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static Object m559(int i, Class cls, Object obj) {
        if (obj != null) {
            return m560(cls, m563(obj, false), obj, i, false);
        }
        if (i == 0) {
            return (cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        throw new C1684("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:167:0x02a0, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:210:0x0313, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x031d, code lost:
    
        if (r15 != false) goto L215;
     */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m560(Class cls, Class cls2, Object obj, int i, boolean z) throws C3581 {
        if (cls != null && cls != cls2) {
            if (cls2 == null || !cls2.isArray() || (i != 0 && !Collection.class.isAssignableFrom(cls))) {
                boolean zIsPrimitive = cls.isPrimitive();
                Class cls3 = Void.TYPE;
                if (zIsPrimitive) {
                    if (cls2 == cls3 || cls2 == null || cls2.isPrimitive()) {
                        if (!Primitive.class.isInstance(obj)) {
                            obj = Primitive.wrap(obj, (Class<?>) cls2);
                        }
                        return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z, i);
                    }
                    if (((!m574(cls2) && !String.valueOf(obj).matches("[-+0-9.]*")) || !m574(cls)) && cls != Boolean.TYPE) {
                        if (!z) {
                            throw m558(AbstractC2240.m4267(cls), AbstractC2240.m4267(cls2), obj, i);
                        }
                        return f576;
                    }
                    if (!z) {
                        return Primitive.wrap(Primitive.castWrapper(cls, obj), (Class<?>) cls);
                    }
                } else if (cls2 == cls3 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(obj).matches("[-+0-9.]*") && m574(cls))) {
                    if (!Primitive.isWrapperType(cls) || cls2 == cls3 || cls2 == null) {
                        if (cls != Object.class || cls2 == cls3 || cls2 == null) {
                            if (cls2 == null || cls2.isPrimitive() || !cls.isAssignableFrom(cls2)) {
                                return Primitive.castPrimitive(cls, cls2, (Primitive) obj, z, i);
                            }
                        } else if (!z) {
                            return Primitive.unwrap(obj);
                        }
                    } else if (!z) {
                        return Primitive.castWrapper(Primitive.unboxType(cls), obj);
                    }
                } else if (m571(cls) && (obj instanceof AbstractC0472)) {
                    if (!z) {
                        AbstractC0472 abstractC0472 = (AbstractC0472) obj;
                        if (!AbstractC0472.m1845(abstractC0472.f2107, cls, 4)) {
                            throw new C3581("This BshLambda can't be converted to ".concat(cls.getName()));
                        }
                        try {
                            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0469(abstractC0472, 0));
                        } catch (Throwable th) {
                            throw new C3581("Can't create a instance for the generate class for the BshLambda: " + th.getMessage(), th);
                        }
                    }
                } else if (cls.isAssignableFrom(cls2)) {
                    if (!z) {
                        if (AbstractC0016.m546(cls) && !Proxy.isProxyClass(cls2)) {
                            return AbstractC0016.m526(obj, cls.getSimpleName());
                        }
                        return obj;
                    }
                } else if (!This.class.isInstance(obj) || ((This) obj).getNameSpace().f538 != cls) {
                    if (!cls.isInterface() || !This.class.isAssignableFrom(cls2)) {
                        if (!Primitive.isWrapperType(cls) || !Primitive.isWrapperType(cls2)) {
                            if (!z) {
                                throw m558(AbstractC2240.m4267(cls), AbstractC2240.m4267(cls2), obj, i);
                            }
                            return f576;
                        }
                        if (!z) {
                            return Primitive.castWrapper(cls, obj);
                        }
                    } else if (!z) {
                        return ((This) obj).getInterface((Class<?>) cls);
                    }
                }
            } else if (!z) {
                int i2 = 0;
                if (Collection.class.isAssignableFrom(cls)) {
                    if (List.class.isAssignableFrom(cls) || Queue.class == cls) {
                        if (cls.isAssignableFrom(ArrayList.class)) {
                            return new ArrayList(Arrays.asList((Object[]) m559(0, Object.class, obj)));
                        }
                        if (cls.isAssignableFrom(LinkedList.class)) {
                            return new LinkedList(Arrays.asList((Object[]) m559(0, Object.class, obj)));
                        }
                    } else {
                        if (cls.isAssignableFrom(ArrayDeque.class)) {
                            return new ArrayDeque(Arrays.asList((Object[]) m559(0, Object.class, obj)));
                        }
                        if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            return new LinkedHashSet(Arrays.asList((Object[]) m559(0, Object.class, obj)));
                        }
                    }
                }
                Class clsM557 = m557(cls2);
                if (Map.class.isAssignableFrom(cls)) {
                    if (Map.Entry.class.isAssignableFrom(clsM557)) {
                        Map.Entry[] entryArr = (Map.Entry[]) obj;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(entryArr.length);
                        int length = entryArr.length;
                        while (i2 < length) {
                            Map.Entry entry = entryArr[i2];
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i2++;
                        }
                        return linkedHashMap;
                    }
                    if (cls.isAssignableFrom(LinkedHashMap.class)) {
                        int length2 = Array.getLength(obj);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap((int) Math.ceil((((double) length2) + 0.0d) / 2.0d));
                        while (i2 < length2) {
                            int i3 = i2 + 1;
                            linkedHashMap2.put(Array.get(obj, i2), i3 < length2 ? Array.get(obj, i3) : null);
                            i2 += 2;
                        }
                        return linkedHashMap2;
                    }
                }
                int[] iArrM3304 = AbstractC1468.m3304(obj);
                int i4 = iArrM3304[0];
                if (i4 == 0) {
                    return Array.newInstance((Class<?>) cls, iArrM3304);
                }
                if (Object.class == clsM557) {
                    Class clsM562 = null;
                    for (int i5 = 0; i5 < i4; i5++) {
                        clsM562 = m562(clsM562, m563(Array.get(obj, 0), false));
                        if (Object.class == clsM562) {
                            break;
                        }
                    }
                    if (clsM562 != null && clsM562 != clsM557) {
                        clsM557 = clsM562;
                    }
                }
                if (!Map.Entry.class.isAssignableFrom(cls)) {
                    Class clsM558 = m557(cls);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM558, iArrM3304);
                    AbstractC1468.m3303(clsM558, objNewInstance, obj);
                    return objNewInstance;
                }
                if (Map.Entry.class.isAssignableFrom(clsM557)) {
                    if (C3524.class != clsM557) {
                        return obj;
                    }
                    Map.Entry[] entryArr2 = new Map.Entry[Array.getLength(obj)];
                    AbstractC1468.m3303(Map.Entry.class, entryArr2, obj);
                    return entryArr2;
                }
                if (i4 == 1) {
                    return new C3524(Array.get(obj, 0), null);
                }
                if (i4 == 2) {
                    return new C3524(Array.get(obj, 0), Array.get(obj, 1));
                }
                Map.Entry[] entryArr3 = new Map.Entry[(int) Math.ceil((((double) i4) + 0.0d) / 2.0d)];
                int i6 = 0;
                while (i2 < i4) {
                    int i7 = i6 + 1;
                    int i8 = i2 + 1;
                    entryArr3[i6] = new C3524(Array.get(obj, i2), i8 < i4 ? Array.get(obj, i8) : null);
                    i2 += 2;
                    i6 = i7;
                }
                return entryArr3;
            }
            return f575;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static String m561(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static Class m562(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f574;
            if (!map.containsKey(cls) || !map.containsKey(cls2)) {
                do {
                    cls = cls.getSuperclass();
                    if (cls == null || Object.class == cls) {
                        return Object.class;
                    }
                } while (!cls.isAssignableFrom(cls2));
                return cls;
            }
            if (((Integer) map.get(cls)).intValue() >= ((Integer) map.get(cls2)).intValue()) {
                return cls;
            }
        }
        return cls2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static Class m563(Object obj, boolean z) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        if (!(obj instanceof Primitive) || z) {
            return obj instanceof AbstractC0472 ? ((AbstractC0472) obj).f2107 : Primitive.unwrap(obj).getClass();
        }
        return ((Primitive) obj).getType();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static Class[] m564(Object[] objArr) {
        if (objArr == null) {
            return AbstractC0016.f569;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = m563(objArr[i], false);
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static boolean m565(Class cls, Class cls2, int i) {
        if (m571(cls2) && AbstractC0472.m1845(cls, cls2, i)) {
            return true;
        }
        if (i == 1) {
            return m572(cls2, cls);
        }
        if (i == 2) {
            return m573(cls2, cls);
        }
        if (i == 3) {
            return false;
        }
        if (i == 4) {
            return m568(cls2, cls);
        }
        throw new C1684("bad case");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static boolean m566(Class cls, Type type, int i) {
        if (type instanceof Class) {
            return m565(cls, (Class) type, i);
        }
        if (type instanceof ParameterizedType) {
            return m566(cls, ((ParameterizedType) type).getRawType(), i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m566(cls, type2, i)) {
                    return false;
                }
            }
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return type == null;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type3 : wildcardType.getUpperBounds()) {
            if (!m566(cls, type3, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m567(type4, cls, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static boolean m567(Type type, Class cls, int i) {
        if (type instanceof Class) {
            return m567(type, cls, i);
        }
        if (type instanceof ParameterizedType) {
            return m567(((ParameterizedType) type).getRawType(), cls, i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m567(type2, cls, i)) {
                    return false;
                }
            }
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return cls == null;
        }
        WildcardType wildcardType = (WildcardType) type;
        for (Type type3 : wildcardType.getUpperBounds()) {
            if (!m567(type3, cls, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m566(cls, type4, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static boolean m568(Class cls, Class cls2) {
        try {
            return m560(cls, cls2, null, 1, true) == f575;
        } catch (C3581 e) {
            throw new C1684("err in cast check: " + e, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static boolean m569(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static boolean m570(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static boolean m571(Class cls) {
        if (cls != null && cls.isInterface()) {
            if (cls.getAnnotation(FunctionalInterface.class) == null) {
                int i = 0;
                for (Method method : cls.getMethods()) {
                    if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                        try {
                            Object.class.getMethod(method.getName(), method.getParameterTypes());
                        } catch (NoSuchMethodException unused) {
                            int i2 = i + 1;
                            if (i > 1) {
                                return false;
                            }
                            i = i2;
                        }
                    }
                }
                if (i == 1) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static boolean m572(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        if (cls2 == null) {
            return cls == String.class;
        }
        if (cls.isPrimitive() && cls2.isPrimitive()) {
            if (cls == cls2) {
                return true;
            }
            Map map = f574;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m574(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static boolean m573(Class cls, Class cls2) {
        if (cls == null) {
            return false;
        }
        if (cls == Object.class) {
            return true;
        }
        if (cls2 == null) {
            return (cls.isPrimitive() || cls.isArray()) ? false : true;
        }
        if ((cls != Number.class || cls2 == Character.TYPE || cls2 == Boolean.TYPE) && Primitive.wrapperMap.get(cls) != cls2) {
            return m572(cls, cls2);
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static boolean m574(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static boolean m575(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static boolean m576(Class cls) {
        return cls.isArray() && Map.Entry.class.isAssignableFrom(cls.getComponentType());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static boolean m577(Class[] clsArr, Class[] clsArr2, int i) {
        if (i != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m565(clsArr[i2], clsArr2[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static boolean m578(Class[] clsArr, Type[] typeArr, int i) {
        if (i != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m566(clsArr[i2], typeArr[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static String m579(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return m579(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
