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
import p000.AbstractC2584feyxiexzfUjhhgtg;
import p000.AbstractC3516feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C1862Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1932Ujhhgtgfeyxiexzf;
import p000.C1933Ujhhgtgfeyxiexzf;
import p000.C2586feyxiexzfUjhhgtg;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0034Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Map f588Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Primitive f589Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final Primitive f590Ujhhgtgfeyxiexzf;

    static {
        C1932Ujhhgtgfeyxiexzf c1932Ujhhgtgfeyxiexzf = new C1932Ujhhgtgfeyxiexzf();
        c1932Ujhhgtgfeyxiexzf.put(Byte.TYPE, 0);
        c1932Ujhhgtgfeyxiexzf.put(Byte.class, 1);
        c1932Ujhhgtgfeyxiexzf.put(Short.TYPE, 2);
        c1932Ujhhgtgfeyxiexzf.put(Short.class, 3);
        c1932Ujhhgtgfeyxiexzf.put(Character.TYPE, 4);
        c1932Ujhhgtgfeyxiexzf.put(Character.class, 5);
        c1932Ujhhgtgfeyxiexzf.put(Integer.TYPE, 6);
        c1932Ujhhgtgfeyxiexzf.put(Integer.class, 7);
        c1932Ujhhgtgfeyxiexzf.put(Long.TYPE, 8);
        c1932Ujhhgtgfeyxiexzf.put(Long.class, 9);
        c1932Ujhhgtgfeyxiexzf.put(Float.TYPE, 10);
        c1932Ujhhgtgfeyxiexzf.put(Float.class, 11);
        c1932Ujhhgtgfeyxiexzf.put(Double.TYPE, 12);
        c1932Ujhhgtgfeyxiexzf.put(Double.class, 13);
        c1932Ujhhgtgfeyxiexzf.put(BigInteger.class, 14);
        c1932Ujhhgtgfeyxiexzf.put(BigDecimal.class, 15);
        f588Ujhhgtgfeyxiexzf = Collections.unmodifiableMap(c1932Ujhhgtgfeyxiexzf);
        f589Ujhhgtgfeyxiexzf = new Primitive(1);
        f590Ujhhgtgfeyxiexzf = new Primitive(-1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static boolean m554Ujhhgtgfeyxiexzf(Class[] clsArr, Class[] clsArr2) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static int m555Ujhhgtgfeyxiexzf(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static Class m556Ujhhgtgfeyxiexzf(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static C1863Ujhhgtgfeyxiexzf m557Ujhhgtgfeyxiexzf(String str, String str2, Object obj, int i) {
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
            return new C1863Ujhhgtgfeyxiexzf(sb.toString());
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
        return new C1862Ujhhgtgfeyxiexzf(classCastException.getMessage(), classCastException);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static Object m558Ujhhgtgfeyxiexzf(int i, Class cls, Object obj) {
        if (obj != null) {
            return m559Ujhhgtgfeyxiexzf(cls, m562Ujhhgtgfeyxiexzf(obj, false), obj, i, false);
        }
        if (i == 0) {
            return (cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        throw new C0712Ujhhgtgfeyxiexzf("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
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
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m559Ujhhgtgfeyxiexzf(Class cls, Class cls2, Object obj, int i, boolean z) throws C1863Ujhhgtgfeyxiexzf {
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
                    if (((!m573Ujhhgtgfeyxiexzf(cls2) && !String.valueOf(obj).matches("[-+0-9.]*")) || !m573Ujhhgtgfeyxiexzf(cls)) && cls != Boolean.TYPE) {
                        if (!z) {
                            throw m557Ujhhgtgfeyxiexzf(AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls), AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls2), obj, i);
                        }
                        return f590Ujhhgtgfeyxiexzf;
                    }
                    if (!z) {
                        return Primitive.wrap(Primitive.castWrapper(cls, obj), (Class<?>) cls);
                    }
                } else if (cls2 == cls3 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(obj).matches("[-+0-9.]*") && m573Ujhhgtgfeyxiexzf(cls))) {
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
                } else if (m570Ujhhgtgfeyxiexzf(cls) && (obj instanceof AbstractC2584feyxiexzfUjhhgtg)) {
                    if (!z) {
                        AbstractC2584feyxiexzfUjhhgtg abstractC2584feyxiexzfUjhhgtg = (AbstractC2584feyxiexzfUjhhgtg) obj;
                        if (!AbstractC2584feyxiexzfUjhhgtg.m3832Ujhhgtgfeyxiexzf(abstractC2584feyxiexzfUjhhgtg.f8360Ujhhgtgfeyxiexzf, cls, 4)) {
                            throw new C1863Ujhhgtgfeyxiexzf("This BshLambda can't be converted to ".concat(cls.getName()));
                        }
                        try {
                            return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C2586feyxiexzfUjhhgtg(0, abstractC2584feyxiexzfUjhhgtg));
                        } catch (Throwable th) {
                            throw new C1863Ujhhgtgfeyxiexzf("Can't create a instance for the generate class for the BshLambda: " + th.getMessage(), th);
                        }
                    }
                } else if (cls.isAssignableFrom(cls2)) {
                    if (!z) {
                        if (AbstractC0033Ujhhgtgfeyxiexzf.m545feyxiexzfUjhhgtg(cls) && !Proxy.isProxyClass(cls2)) {
                            return AbstractC0033Ujhhgtgfeyxiexzf.m525Ujhhgtgfeyxiexzf(obj, cls.getSimpleName());
                        }
                        return obj;
                    }
                } else if (!This.class.isInstance(obj) || ((This) obj).getNameSpace().f552Ujhhgtgfeyxiexzf != cls) {
                    if (!cls.isInterface() || !This.class.isAssignableFrom(cls2)) {
                        if (!Primitive.isWrapperType(cls) || !Primitive.isWrapperType(cls2)) {
                            if (!z) {
                                throw m557Ujhhgtgfeyxiexzf(AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls), AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls2), obj, i);
                            }
                            return f590Ujhhgtgfeyxiexzf;
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
                            return new ArrayList(Arrays.asList((Object[]) m558Ujhhgtgfeyxiexzf(0, Object.class, obj)));
                        }
                        if (cls.isAssignableFrom(LinkedList.class)) {
                            return new LinkedList(Arrays.asList((Object[]) m558Ujhhgtgfeyxiexzf(0, Object.class, obj)));
                        }
                    } else {
                        if (cls.isAssignableFrom(ArrayDeque.class)) {
                            return new ArrayDeque(Arrays.asList((Object[]) m558Ujhhgtgfeyxiexzf(0, Object.class, obj)));
                        }
                        if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            return new LinkedHashSet(Arrays.asList((Object[]) m558Ujhhgtgfeyxiexzf(0, Object.class, obj)));
                        }
                    }
                }
                Class clsM556Ujhhgtgfeyxiexzf = m556Ujhhgtgfeyxiexzf(cls2);
                if (Map.class.isAssignableFrom(cls)) {
                    if (Map.Entry.class.isAssignableFrom(clsM556Ujhhgtgfeyxiexzf)) {
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
                int[] iArrM5056Ujhhgtgfeyxiexzf = AbstractC3516feyxiexzfUjhhgtg.m5056Ujhhgtgfeyxiexzf(obj);
                int i4 = iArrM5056Ujhhgtgfeyxiexzf[0];
                if (i4 == 0) {
                    return Array.newInstance((Class<?>) cls, iArrM5056Ujhhgtgfeyxiexzf);
                }
                if (Object.class == clsM556Ujhhgtgfeyxiexzf) {
                    Class clsM561Ujhhgtgfeyxiexzf = null;
                    for (int i5 = 0; i5 < i4; i5++) {
                        clsM561Ujhhgtgfeyxiexzf = m561Ujhhgtgfeyxiexzf(clsM561Ujhhgtgfeyxiexzf, m562Ujhhgtgfeyxiexzf(Array.get(obj, 0), false));
                        if (Object.class == clsM561Ujhhgtgfeyxiexzf) {
                            break;
                        }
                    }
                    if (clsM561Ujhhgtgfeyxiexzf != null && clsM561Ujhhgtgfeyxiexzf != clsM556Ujhhgtgfeyxiexzf) {
                        clsM556Ujhhgtgfeyxiexzf = clsM561Ujhhgtgfeyxiexzf;
                    }
                }
                if (!Map.Entry.class.isAssignableFrom(cls)) {
                    Class clsM556Ujhhgtgfeyxiexzf2 = m556Ujhhgtgfeyxiexzf(cls);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM556Ujhhgtgfeyxiexzf2, iArrM5056Ujhhgtgfeyxiexzf);
                    AbstractC3516feyxiexzfUjhhgtg.m5054Ujhhgtgfeyxiexzf(clsM556Ujhhgtgfeyxiexzf2, objNewInstance, obj);
                    return objNewInstance;
                }
                if (Map.Entry.class.isAssignableFrom(clsM556Ujhhgtgfeyxiexzf)) {
                    if (C1933Ujhhgtgfeyxiexzf.class != clsM556Ujhhgtgfeyxiexzf) {
                        return obj;
                    }
                    Map.Entry[] entryArr2 = new Map.Entry[Array.getLength(obj)];
                    AbstractC3516feyxiexzfUjhhgtg.m5054Ujhhgtgfeyxiexzf(Map.Entry.class, entryArr2, obj);
                    return entryArr2;
                }
                if (i4 == 1) {
                    return new C1933Ujhhgtgfeyxiexzf(Array.get(obj, 0), null);
                }
                if (i4 == 2) {
                    return new C1933Ujhhgtgfeyxiexzf(Array.get(obj, 0), Array.get(obj, 1));
                }
                Map.Entry[] entryArr3 = new Map.Entry[(int) Math.ceil((((double) i4) + 0.0d) / 2.0d)];
                int i6 = 0;
                while (i2 < i4) {
                    int i7 = i6 + 1;
                    int i8 = i2 + 1;
                    entryArr3[i6] = new C1933Ujhhgtgfeyxiexzf(Array.get(obj, i2), i8 < i4 ? Array.get(obj, i8) : null);
                    i2 += 2;
                    i6 = i7;
                }
                return entryArr3;
            }
            return f589Ujhhgtgfeyxiexzf;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static String m560Ujhhgtgfeyxiexzf(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static Class m561Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f588Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Class m562Ujhhgtgfeyxiexzf(Object obj, boolean z) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        if (!(obj instanceof Primitive) || z) {
            return obj instanceof AbstractC2584feyxiexzfUjhhgtg ? ((AbstractC2584feyxiexzfUjhhgtg) obj).f8360Ujhhgtgfeyxiexzf : Primitive.unwrap(obj).getClass();
        }
        return ((Primitive) obj).getType();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Class[] m563Ujhhgtgfeyxiexzf(Object[] objArr) {
        if (objArr == null) {
            return AbstractC0033Ujhhgtgfeyxiexzf.f583Ujhhgtgfeyxiexzf;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = m562Ujhhgtgfeyxiexzf(objArr[i], false);
        }
        return clsArr;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean m564Ujhhgtgfeyxiexzf(Class cls, Class cls2, int i) {
        if (m570Ujhhgtgfeyxiexzf(cls2) && AbstractC2584feyxiexzfUjhhgtg.m3832Ujhhgtgfeyxiexzf(cls, cls2, i)) {
            return true;
        }
        if (i == 1) {
            return m571Ujhhgtgfeyxiexzf(cls2, cls);
        }
        if (i == 2) {
            return m572Ujhhgtgfeyxiexzf(cls2, cls);
        }
        if (i == 3) {
            return false;
        }
        if (i == 4) {
            return m567Ujhhgtgfeyxiexzf(cls2, cls);
        }
        throw new C0712Ujhhgtgfeyxiexzf("bad case");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m565Ujhhgtgfeyxiexzf(Class cls, Type type, int i) {
        if (type instanceof Class) {
            return m564Ujhhgtgfeyxiexzf(cls, (Class) type, i);
        }
        if (type instanceof ParameterizedType) {
            return m565Ujhhgtgfeyxiexzf(cls, ((ParameterizedType) type).getRawType(), i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m565Ujhhgtgfeyxiexzf(cls, type2, i)) {
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
            if (!m565Ujhhgtgfeyxiexzf(cls, type3, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m566Ujhhgtgfeyxiexzf(type4, cls, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static boolean m566Ujhhgtgfeyxiexzf(Type type, Class cls, int i) {
        if (type instanceof Class) {
            return m566Ujhhgtgfeyxiexzf(type, cls, i);
        }
        if (type instanceof ParameterizedType) {
            return m566Ujhhgtgfeyxiexzf(((ParameterizedType) type).getRawType(), cls, i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m566Ujhhgtgfeyxiexzf(type2, cls, i)) {
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
            if (!m566Ujhhgtgfeyxiexzf(type3, cls, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m565Ujhhgtgfeyxiexzf(cls, type4, i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static boolean m567Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
        try {
            return m559Ujhhgtgfeyxiexzf(cls, cls2, null, 1, true) == f589Ujhhgtgfeyxiexzf;
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            throw new C0712Ujhhgtgfeyxiexzf("err in cast check: " + e, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static boolean m568Ujhhgtgfeyxiexzf(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m569Ujhhgtgfeyxiexzf(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static boolean m570Ujhhgtgfeyxiexzf(Class cls) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m571Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
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
            Map map = f588Ujhhgtgfeyxiexzf;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m573Ujhhgtgfeyxiexzf(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static boolean m572Ujhhgtgfeyxiexzf(Class cls, Class cls2) {
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
            return m571Ujhhgtgfeyxiexzf(cls, cls2);
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static boolean m573Ujhhgtgfeyxiexzf(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static boolean m574Ujhhgtgfeyxiexzf(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m575Ujhhgtgfeyxiexzf(Class cls) {
        return cls.isArray() && Map.Entry.class.isAssignableFrom(cls.getComponentType());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static boolean m576Ujhhgtgfeyxiexzf(Class[] clsArr, Class[] clsArr2, int i) {
        if (i != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m564Ujhhgtgfeyxiexzf(clsArr[i2], clsArr2[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m577Ujhhgtgfeyxiexzf(Class[] clsArr, Type[] typeArr, int i) {
        if (i != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m565Ujhhgtgfeyxiexzf(clsArr[i2], typeArr[i2], i)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m578feyxiexzfUjhhgtg(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return m578feyxiexzfUjhhgtg(cls.getComponentType()) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}
