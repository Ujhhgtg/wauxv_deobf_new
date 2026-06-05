package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONFactory;
import com.alibaba.fastjson2.JSONWriter;
import com.alibaba.fastjson2.TypeReference;
import com.alibaba.fastjson2.annotation.JSONField;
import com.alibaba.fastjson2.annotation.JSONType;
import com.alibaba.fastjson2.codec.BeanInfo;
import com.alibaba.fastjson2.codec.FieldInfo;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import com.alibaba.fastjson2.modules.ObjectCodecProvider;
import com.alibaba.fastjson2.reader.ObjectReader;
import com.alibaba.fastjson2.util.BeanUtils;
import com.alibaba.fastjson2.writer.ObjectWriter;
import com.umeng.analytics.pro.ek;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import okhttp3.HttpUrl;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.C2497feyxiexzfUjhhgtg;
import p000.C2498feyxiexzfUjhhgtg;
import p000.C2500feyxiexzfUjhhgtg;
import p000.C2502feyxiexzfUjhhgtg;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class BeanUtils {
    private static volatile Class RECORD_CLASS = null;
    private static volatile Method RECORD_COMPONENT_GET_NAME = null;
    private static volatile Method RECORD_GET_RECORD_COMPONENTS = null;
    public static final String SUPER = "$super$";
    static final Type[] EMPTY_TYPE_ARRAY = new Type[0];
    static final ConcurrentMap<Class, Field[]> fieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Map<String, Field>> fieldMapCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Field[]> declaredFieldCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Method[]> methodCache = new ConcurrentHashMap();
    static final ConcurrentMap<Class, Constructor[]> constructorCache = new ConcurrentHashMap();
    static final long[] IGNORE_CLASS_HASH_CODES = {-9214723784238596577L, -9030616758866828325L, -8335274122997354104L, -6963030519018899258L, -4863137578837233966L, -3653547262287832698L, -2819277587813726773L, -2669552864532011468L, -2458634727370886912L, -2291619803571459675L, -1811306045128064037L, -864440709753525476L, -779604756358333743L, 8731803887940231L, 1616814008855344660L, 2164749833121980361L, 2688642392827789427L, 3724195282986200606L, 3742915795806478647L, 3977020351318456359L, 4775491097662790952L, 4882459834864833642L, 6033839080488254886L, 7981148566008458638L, 8344106065386396833L, 9215465129261900012L};

    /* JADX INFO: compiled from: obf */
    public static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public GenericArrayTypeImpl(Type type) {
            this.componentType = BeanUtils.canonicalize(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && BeanUtils.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return BeanUtils.typeToString(this.componentType) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public ParameterizedTypeImpl(Type type, Type type2, Type... typeArr) {
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                BeanUtils.checkArgument(z);
            }
            this.ownerType = type == null ? null : BeanUtils.canonicalize(type);
            this.rawType = BeanUtils.canonicalize(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                BeanUtils.checkNotPrimitive(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = BeanUtils.canonicalize(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && BeanUtils.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.ownerType;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ BeanUtils.hashCodeOrZero(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return BeanUtils.typeToString(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(BeanUtils.typeToString(this.rawType));
            sb.append("<");
            sb.append(BeanUtils.typeToString(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(BeanUtils.typeToString(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* JADX INFO: compiled from: obf */
    public static final class WildcardTypeImpl implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            BeanUtils.checkArgument(typeArr2.length <= 1);
            BeanUtils.checkArgument(typeArr.length == 1);
            if (typeArr2.length != 1) {
                BeanUtils.checkNotPrimitive(typeArr[0]);
                this.lowerBound = null;
                this.upperBound = BeanUtils.canonicalize(typeArr[0]);
            } else {
                BeanUtils.checkNotPrimitive(typeArr2[0]);
                BeanUtils.checkArgument(typeArr[0] == Object.class);
                this.lowerBound = BeanUtils.canonicalize(typeArr2[0]);
                this.upperBound = Object.class;
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && BeanUtils.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            return type != null ? new Type[]{type} : BeanUtils.EMPTY_TYPE_ARRAY;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + BeanUtils.typeToString(this.lowerBound);
            }
            if (this.upperBound == Object.class) {
                return "?";
            }
            return "? extends " + BeanUtils.typeToString(this.upperBound);
        }
    }

    public static void annotationMethods(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (method.getParameterCount() == 0 && method.getDeclaringClass() != Object.class) {
                String name = method.getName();
                name.getClass();
                switch (name) {
                    case "toString":
                    case "hashCode":
                    case "annotationType":
                        break;
                    default:
                        consumer.accept(method);
                        break;
                }
            }
        }
    }

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    public static Method buildMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (!Modifier.isStatic(method.getModifiers()) && method.getParameterCount() == 0 && method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    public static void checkArgument(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void checkNotPrimitive(Type type) {
        checkArgument(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static void cleanupCache(Class cls) {
        if (cls == null) {
            return;
        }
        fieldCache.remove(cls);
        fieldMapCache.remove(cls);
        declaredFieldCache.remove(cls);
        methodCache.remove(cls);
        constructorCache.remove(cls);
    }

    public static void constructor(Class cls, Consumer<Constructor> consumer) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor<?>[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls, declaredConstructors);
        }
        boolean zIsRecord = isRecord(cls);
        for (Constructor<?> constructor : declaredConstructors) {
            if (!zIsRecord || constructor.getParameterCount() != 0) {
                consumer.accept(constructor);
            }
        }
    }

    public static String dashes(String str, int i, boolean z) {
        int i2;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        andSet[i4] = '-';
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        andSet[i4] = '-';
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                andSet[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i4);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static void declaredFields(Class cls, Consumer<Field> consumer) {
        boolean zEquals;
        if (cls == null || consumer == null || ignore(cls) || cls.getName().contains("$$Lambda") || JdbcSupport.isStruct(cls)) {
            return;
        }
        if (TypeUtils.isProxy(cls)) {
            declaredFields(cls.getSuperclass(), consumer);
            return;
        }
        Class superclass = cls.getSuperclass();
        if (superclass == null || superclass == Object.class) {
            zEquals = false;
        } else {
            zEquals = "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
            if (!zEquals) {
                declaredFields(superclass, consumer);
            }
        }
        ConcurrentMap<Class, Field[]> concurrentMap = declaredFieldCache;
        Field[] declaredFields = concurrentMap.get(cls);
        if (declaredFields == null) {
            try {
                declaredFields = cls.getDeclaredFields();
                concurrentMap.put(cls, declaredFields);
            } catch (Throwable unused) {
                declaredFields = new Field[0];
            }
            for (Field field : declaredFields) {
                if (Modifier.isStatic(field.getModifiers())) {
                    boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field2 : declaredFields) {
                        if (zIsAssignableFrom || !Modifier.isStatic(field2.getModifiers())) {
                            arrayList.add(field2);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    break;
                }
            }
            fieldCache.putIfAbsent(cls, declaredFields);
        }
        for (Field field3 : declaredFields) {
            int modifiers = field3.getModifiers();
            Class<?> type = field3.getType();
            if ((modifiers & 8) == 0 && !ignore(type)) {
                if (zEquals && "cardsmap_".equals(field3.getName()) && "com.google.protobuf.MapField".equals(type.getName())) {
                    return;
                }
                Class<?> declaringClass = field3.getDeclaringClass();
                if (declaringClass != AbstractMap.class && declaringClass != HashMap.class && declaringClass != LinkedHashMap.class && declaringClass != TreeMap.class && declaringClass != ConcurrentHashMap.class) {
                    consumer.accept(field3);
                }
            }
        }
    }

    private static Class<?> declaringClassOf(TypeVariable<?> typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    public static String dots(String str, int i, boolean z) {
        int i2;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        andSet[i4] = '.';
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        andSet[i4] = '.';
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                andSet[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i4);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static boolean equal(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return equal(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String fieldName(String str, String str2) {
        char cCharAt;
        char cCharAt2;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        if (str == null || str.isEmpty()) {
            return str;
        }
        byte b = -1;
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    b = 0;
                }
                break;
            case -1863045342:
                if (str2.equals("UpperCaseWithDots")) {
                    b = 1;
                }
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    b = 2;
                }
                break;
            case -46641534:
                if (str2.equals("LowerCaseWithUnderScores")) {
                    b = 3;
                }
                break;
            case 246111473:
                if (str2.equals("NoChange")) {
                    b = 4;
                }
                break;
            case 572594479:
                if (str2.equals("UpperCamelCaseWithUnderScores")) {
                    b = 5;
                }
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    b = 6;
                }
                break;
            case 928600554:
                if (str2.equals("UpperCamelCaseWithDashes")) {
                    b = 7;
                }
                break;
            case 975280372:
                if (str2.equals("UpperCamelCaseWithDots")) {
                    b = 8;
                }
                break;
            case 1315531521:
                if (str2.equals("LowerCaseWithDots")) {
                    b = 9;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    b = 10;
                }
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    b = 11;
                }
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    b = 12;
                }
                break;
            case 1488507313:
                if (str2.equals("LowerCase")) {
                    b = ek.k;
                }
                break;
            case 1492440247:
                if (str2.equals("LowerCaseWithDashes")) {
                    b = ek.l;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    b = ek.m;
                }
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    b = 16;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    b = 17;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    b = 18;
                }
                break;
        }
        switch (b) {
            case 0:
                return str.toUpperCase();
            case 1:
                return dots(str, 0, true);
            case 2:
            case 4:
            case 15:
                char cCharAt3 = str.charAt(0);
                char cCharAt4 = str.length() > 1 ? str.charAt(1) : (char) 0;
                if (cCharAt3 >= 'A' && cCharAt3 <= 'Z' && str.length() > 1 && (cCharAt4 < 'A' || cCharAt4 > 'Z')) {
                    char[] charArray = str.toCharArray();
                    charArray[0] = (char) (cCharAt3 + ' ');
                    return new String(charArray);
                }
                return str;
            case 3:
                return underScores(str, 0, false);
            case 5:
                return upperCamelWith(str, 0, '_');
            case 6:
                return dashes(str, 0, true);
            case 7:
                return upperCamelWith(str, 0, '-');
            case 8:
                return upperCamelWith(str, 0, '.');
            case 9:
                return dots(str, 0, false);
            case 10:
                char cCharAt5 = str.charAt(0);
                if (cCharAt5 >= 'a' && cCharAt5 <= 'z' && str.length() > 1 && (cCharAt2 = str.charAt(1)) >= 'a' && cCharAt2 <= 'z') {
                    char[] charArray2 = str.toCharArray();
                    charArray2[0] = (char) (cCharAt5 - ' ');
                    return new String(charArray2);
                }
                if (cCharAt5 == '_' && str.length() > 1 && (cCharAt = str.charAt(1)) >= 'a' && cCharAt <= 'z') {
                    char[] charArray3 = str.toCharArray();
                    charArray3[1] = (char) (cCharAt - ' ');
                    return new String(charArray3);
                }
                return str;
            case 11:
                return upperCamelWith(str, 0, ' ');
            case Opcodes.FCONST_1 /* 12 */:
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < str.length(); i++) {
                    char cCharAt6 = str.charAt(i);
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z') {
                        cCharAt6 = (char) (cCharAt6 + ' ');
                        if (i > 0) {
                            sb.append('-');
                        }
                    }
                    sb.append(cCharAt6);
                }
                return sb.toString();
            case 13:
                return str.toLowerCase();
            case Opcodes.DCONST_0 /* 14 */:
                return dashes(str, 0, false);
            case 16:
                char cCharAt7 = str.charAt(0);
                if (cCharAt7 >= 'A' && cCharAt7 <= 'Z' && str.length() > 1) {
                    char[] charArray4 = str.toCharArray();
                    charArray4[0] = (char) (cCharAt7 + ' ');
                    return new String(charArray4);
                }
                return str;
            case Opcodes.SIPUSH /* 17 */:
                return underScores(str, 0, true);
            case Opcodes.LDC /* 18 */:
                return snakeCase(str, 0);
            default:
                throw new JSONException("TODO : ".concat(str2));
        }
    }

    public static void fields(Class cls, Consumer<Field> consumer) {
        if (TypeUtils.isProxy(cls)) {
            fields(cls.getSuperclass(), consumer);
            return;
        }
        ConcurrentMap<Class, Field[]> concurrentMap = fieldCache;
        Field[] fields = concurrentMap.get(cls);
        if (fields == null) {
            fields = cls.getFields();
            concurrentMap.putIfAbsent(cls, fields);
        }
        boolean zIsAssignableFrom = Enum.class.isAssignableFrom(cls);
        for (Field field : fields) {
            if ((!Modifier.isStatic(field.getModifiers()) || zIsAssignableFrom) && !ignore(field.getType())) {
                consumer.accept(field);
            }
        }
    }

    public static <A extends Annotation> A findAnnotation(AnnotatedElement annotatedElement, Class<A> cls) {
        if (cls != null) {
            return (A) findAnnotation(annotatedElement, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        throw new NullPointerException("annotationType must not be null");
    }

    private static <A extends Annotation> A findMetaAnnotation(Class<A> cls, Annotation[] annotationArr, boolean z, Set<Annotation> set) {
        A a;
        for (Annotation annotation : annotationArr) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            if (!name.startsWith("java.lang.annotation") && !name.startsWith("kotlin.") && set.add(annotation) && (a = (A) findAnnotation(clsAnnotationType, cls, z, set)) != null) {
                return a;
            }
        }
        return null;
    }

    public static Method fluentSetter(Class cls, String str, Class cls2) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (method.getName().equals(str) && method.getReturnType() == cls && method.getParameterCount() == 1 && method.getParameterTypes()[0] == cls2) {
                return method;
            }
        }
        return null;
    }

    public static Annotation[] getAnnotations(AnnotatedElement annotatedElement) {
        try {
            return annotatedElement.getDeclaredAnnotations();
        } catch (Throwable unused) {
            return new Annotation[0];
        }
    }

    public static Constructor[] getConstructor(Class cls) {
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] constructorArr = concurrentMap.get(cls);
        if (constructorArr != null) {
            return constructorArr;
        }
        Constructor<?>[] declaredConstructors = cls.getDeclaredConstructors();
        concurrentMap.putIfAbsent(cls, declaredConstructors);
        return declaredConstructors;
    }

    public static Field getDeclaredField(Class cls, String str) {
        ConcurrentMap<Class, Map<String, Field>> concurrentMap = fieldMapCache;
        Map<String, Field> map = concurrentMap.get(cls);
        if (map == null) {
            HashMap map2 = new HashMap();
            declaredFields(cls, new C2500feyxiexzfUjhhgtg(0, map2));
            concurrentMap.putIfAbsent(cls, map2);
            map = concurrentMap.get(cls);
        }
        return map.get(str);
    }

    public static Constructor getDefaultConstructor(Class cls, boolean z) {
        Class<?> declaringClass;
        if ((cls == StackTraceElement.class && JDKUtils.JVM_VERSION >= 9) || isRecord(cls)) {
            return null;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls);
        if (declaredConstructors == null) {
            declaredConstructors = cls.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls, declaredConstructors);
        }
        for (Constructor<?> constructor : declaredConstructors) {
            if (constructor.getParameterCount() == 0) {
                return constructor;
            }
        }
        if (z && (declaringClass = cls.getDeclaringClass()) != null) {
            for (Constructor<?> constructor2 : declaredConstructors) {
                if (constructor2.getParameterCount() == 1 && declaringClass.equals(constructor2.getParameterTypes()[0])) {
                    return constructor2;
                }
            }
        }
        return null;
    }

    public static String[] getEnumAnnotationNames(Class cls) {
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        int length = enumArr.length;
        String[] strArr = new String[length];
        fields(cls, new C2497feyxiexzfUjhhgtg(enumArr, 2, strArr));
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (strArr[i2] == null) {
                i++;
            }
        }
        if (i == length) {
            return null;
        }
        return strArr;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d A[PHI: r8
      0x009d: PHI (r8v5 java.lang.reflect.Member) = 
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v1 java.lang.reflect.Member)
      (r8v8 java.lang.reflect.Member)
     binds: [B:11:0x002e, B:14:0x0036, B:17:0x003f, B:19:0x0043, B:22:0x0050, B:38:0x0089, B:40:0x009a, B:41:0x009c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [java.lang.reflect.Member] */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    public static Member getEnumValueField(Class cls, ObjectCodecProvider objectCodecProvider) {
        boolean z;
        ?? r16;
        Class<?> declaringClass;
        Field declaredField;
        ?? r2 = 0;
        r2 = 0;
        if (cls != null) {
            Class<?>[] interfaces = cls.getInterfaces();
            ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
            Method[] methods = concurrentMap.get(cls);
            if (methods == null) {
                methods = cls.getMethods();
                concurrentMap.putIfAbsent(cls, methods);
            }
            int length = methods.length;
            Member member = null;
            int i = 0;
            while (i < length) {
                final Method method = methods[i];
                if (method.getReturnType() == Void.class || method.getParameterCount() != 0 || (declaringClass = method.getDeclaringClass()) == Enum.class || declaringClass == Object.class) {
                    r16 = r2;
                } else {
                    final String name = method.getName();
                    if ("values".equals(name)) {
                        r16 = r2;
                    } else {
                        if (isJSONField(method)) {
                            return method;
                        }
                        if (!name.startsWith("get") || (declaredField = getDeclaredField(cls, getterName(name, (String) r2))) == null || !isJSONField(declaredField)) {
                            final AtomicReference atomicReference = new AtomicReference();
                            int length2 = interfaces.length;
                            int i2 = 0;
                            ?? r3 = r2;
                            while (i2 < length2) {
                                Class<?> cls2 = interfaces[i2];
                                ?? r17 = r3;
                                final int i3 = 0;
                                getters(cls2, new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ要点脸
                                    @Override // java.util.function.Consumer
                                    public final void accept(Object obj) {
                                        switch (i3) {
                                            case 0:
                                                BeanUtils.lambda$getEnumValueField$7(name, atomicReference, method, (Method) obj);
                                                break;
                                            default:
                                                BeanUtils.lambda$getEnumValueField$8(name, atomicReference, method, (Method) obj);
                                                break;
                                        }
                                    }
                                });
                                Class mixIn = objectCodecProvider != null ? objectCodecProvider.getMixIn(cls2) : JSONFactory.getDefaultObjectWriterProvider().getMixIn(cls2);
                                if (mixIn != null) {
                                    final int i4 = 1;
                                    getters(mixIn, new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛳᛴᛲᛱUjhhgtgᛱ要点脸
                                        @Override // java.util.function.Consumer
                                        public final void accept(Object obj) {
                                            switch (i4) {
                                                case 0:
                                                    BeanUtils.lambda$getEnumValueField$7(name, atomicReference, method, (Method) obj);
                                                    break;
                                                default:
                                                    BeanUtils.lambda$getEnumValueField$8(name, atomicReference, method, (Method) obj);
                                                    break;
                                            }
                                        }
                                    });
                                }
                                i2++;
                                r3 = r17;
                            }
                            r16 = r3;
                            Member member2 = (Member) atomicReference.get();
                            if (member2 == null) {
                                continue;
                            } else if (member == null) {
                                member = member2;
                            } else if (!member.getName().equals(member2.getName())) {
                                return r16;
                            }
                        } else if (member == null) {
                            r16 = r2;
                            member = method;
                        } else if (member.getName().equals(method.getName())) {
                            if ((member instanceof Method) && ((Method) member).getReturnType().isAssignableFrom(method.getReturnType())) {
                                member = method;
                            }
                            r16 = r2;
                        }
                    }
                }
                i++;
                r2 = r16;
            }
            ?? r18 = r2;
            if (member != null) {
                return member;
            }
            ConcurrentMap<Class, Field[]> concurrentMap2 = fieldCache;
            Field[] fields = concurrentMap2.get(cls);
            if (fields == null) {
                fields = cls.getFields();
                concurrentMap2.putIfAbsent(cls, fields);
            }
            Enum[] enumArr = (Enum[]) cls.getEnumConstants();
            for (Field field : fields) {
                if (enumArr == null) {
                    z = false;
                    break;
                }
                String name2 = field.getName();
                int length3 = enumArr.length;
                int i5 = 0;
                while (true) {
                    if (i5 >= length3) {
                        z = false;
                        break;
                    }
                    if (name2.equals(enumArr[i5].name())) {
                        z = true;
                        break;
                    }
                    i5++;
                }
                if (isJSONField(field) && !z) {
                    return field;
                }
            }
            return r18;
        }
        return r2;
    }

    public static Field getField(Class cls, String str) {
        Field[] fieldArr = new Field[1];
        declaredFields(cls, new C2497feyxiexzfUjhhgtg(str, 5, fieldArr));
        return fieldArr[0];
    }

    public static Type getFieldType(TypeReference typeReference, Class<?> cls, Member member, Type type) {
        Class<?> declaringClass = member == null ? null : member.getDeclaringClass();
        while (cls != Object.class) {
            Type type2 = typeReference == null ? null : typeReference.getType();
            if (declaringClass == cls) {
                return resolve(type2, declaringClass, type);
            }
            Type genericSuperclass = cls.getGenericSuperclass();
            if (genericSuperclass == null) {
                break;
            }
            typeReference = TypeReference.get(resolve(type2, cls, genericSuperclass));
            cls = typeReference.getRawType();
        }
        return null;
    }

    public static Type getGenericSupertype(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                Class<?> cls3 = interfaces[i];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return getGenericSupertype(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (cls != null && !cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return getGenericSupertype(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    public static Method getMethod(Class cls, String str) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (method.getName().equals(str)) {
                return method;
            }
        }
        return null;
    }

    private static Method[] getMethods(Class cls) {
        try {
            return isRecord(cls) ? getRecordMethods(cls) : cls.getMethods();
        } catch (NoClassDefFoundError unused) {
            return new Method[0];
        }
    }

    public static Type getParamType(TypeReference typeReference, Class<?> cls, Class cls2, Parameter parameter, Type type) {
        while (cls != Object.class) {
            if (cls2 == cls) {
                return resolve(typeReference.getType(), cls2, type);
            }
            typeReference = TypeReference.get(resolve(typeReference.getType(), cls, cls.getGenericSuperclass()));
            cls = typeReference.getRawType();
        }
        return null;
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            checkArgument(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    public static String[] getRecordFieldNames(Class<?> cls) {
        if (JDKUtils.JVM_VERSION < 14 && JDKUtils.ANDROID_SDK_INT < 33) {
            return new String[0];
        }
        try {
            if (RECORD_GET_RECORD_COMPONENTS == null) {
                RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", null);
            }
            if (RECORD_COMPONENT_GET_NAME == null) {
                RECORD_COMPONENT_GET_NAME = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) RECORD_GET_RECORD_COMPONENTS.invoke(cls, null);
            String[] strArr = new String[objArr.length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) RECORD_COMPONENT_GET_NAME.invoke(objArr[i], null);
            }
            return strArr;
        } catch (Exception e) {
            throw new RuntimeException("Failed to access Methods needed to support `java.lang.Record`: (" + e.getClass().getName() + ") " + e.getMessage(), e);
        }
    }

    private static Method[] getRecordMethods(Class<?> cls) {
        if (JDKUtils.JVM_VERSION < 14 && JDKUtils.ANDROID_SDK_INT < 33) {
            return new Method[0];
        }
        try {
            if (RECORD_GET_RECORD_COMPONENTS == null) {
                RECORD_GET_RECORD_COMPONENTS = Class.class.getMethod("getRecordComponents", null);
            }
            if (RECORD_COMPONENT_GET_NAME == null) {
                RECORD_COMPONENT_GET_NAME = Class.forName("java.lang.reflect.RecordComponent").getMethod("getName", null);
            }
            Object[] objArr = (Object[]) RECORD_GET_RECORD_COMPONENTS.invoke(cls, null);
            Method[] methods = cls.getMethods();
            int length = objArr.length;
            String[] strArr = new String[length];
            for (int i = 0; i < objArr.length; i++) {
                strArr[i] = (String) RECORD_COMPONENT_GET_NAME.invoke(objArr[i], null);
            }
            int length2 = objArr.length;
            Method[] methodArr = new Method[length2];
            boolean[] zArr = new boolean[methods.length];
            for (int i2 = 0; i2 < methods.length; i2++) {
                Method method = methods[i2];
                if (method.getParameterCount() == 0) {
                    String name = method.getName();
                    for (int i3 = 0; i3 < length; i3++) {
                        if (strArr[i3].equals(name)) {
                            if (methodArr[i3] != null) {
                                break;
                            }
                            methodArr[i3] = method;
                            zArr[i2] = true;
                            break;
                        }
                    }
                }
            }
            Method[] methodArr2 = new Method[methods.length];
            int i4 = 0;
            for (int i5 = 0; i5 < length2; i5++) {
                Method method2 = methodArr[i5];
                if (method2 != null) {
                    methodArr2[i4] = method2;
                    i4++;
                }
            }
            for (int i6 = 0; i6 < methods.length; i6++) {
                if (!zArr[i6]) {
                    int i7 = i4 + 1;
                    methodArr2[i4] = methods[i6];
                    i4 = i7;
                }
            }
            return methodArr2;
        } catch (Exception e) {
            throw new RuntimeException("Failed to access Methods needed to support `java.lang.Record`: (" + e.getClass().getName() + ") " + e.getMessage(), e);
        }
    }

    public static Method getSetter(Class cls, String str) {
        Method[] methodArr = new Method[1];
        setters(cls, new C2497feyxiexzfUjhhgtg(str, 3, methodArr));
        return methodArr[0];
    }

    public static String getterName(Method method, String str) {
        return getterName(method, false, str);
    }

    public static void getters(Class cls, Consumer<Method> consumer) {
        getters(cls, null, consumer);
    }

    public static boolean hasPublicDefaultConstructor(Class cls) {
        Constructor defaultConstructor = getDefaultConstructor(cls, false);
        return defaultConstructor != null && Modifier.isPublic(defaultConstructor.getModifiers());
    }

    public static int hashCodeOrZero(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static boolean ignore(Class cls) {
        return cls == null || Arrays.binarySearch(IGNORE_CLASS_HASH_CODES, Fnv.hashCode64(cls.getName())) >= 0;
    }

    private static int indexOf(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    public static boolean isExtendedMap(Class cls) {
        Class superclass;
        if (cls == HashMap.class || cls == LinkedHashMap.class || cls == TreeMap.class || cls.getSimpleName().isEmpty() || !(((superclass = cls.getSuperclass()) == HashMap.class || superclass == LinkedHashMap.class || superclass == TreeMap.class) && getDefaultConstructor(cls, false) == null)) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        declaredFields(cls, new C2497feyxiexzfUjhhgtg(superclass, 1, arrayList));
        return !arrayList.isEmpty();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x004d A[SYNTHETIC] */
    private static boolean isJSONField(AnnotatedElement annotatedElement) {
        for (Annotation annotation : annotatedElement.getAnnotations()) {
            String name = annotation.annotationType().getName();
            if (!name.equals("com.fasterxml.jackson.annotation.JsonValue") && !name.equals("com.fasterxml.jackson.annotation.JsonProperty")) {
                if (!name.equals("com.alibaba.fastjson.annotation.JSONField")) {
                    if (name.equals("com.fasterxml.jackson.annotation.JsonRawValue")) {
                        if (JSONFactory.isUseJacksonAnnotation()) {
                            return true;
                        }
                    } else if (!name.equals("com.alibaba.fastjson2.annotation.JSONField")) {
                        if (!name.equals("com.fasterxml.jackson.annotation.JsonUnwrapped")) {
                            continue;
                        } else if (JSONFactory.isUseJacksonAnnotation()) {
                            return true;
                        }
                    }
                }
                return true;
            }
            if (JSONFactory.isUseJacksonAnnotation()) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoneStaticMemberClass(Class cls, Class cls2) {
        Class<?> enclosingClass;
        if (cls2 == null || cls2.isPrimitive() || cls2 == String.class || cls2 == List.class || (enclosingClass = cls2.getEnclosingClass()) == null) {
            return false;
        }
        if (cls != null && !cls.equals(enclosingClass)) {
            return false;
        }
        ConcurrentMap<Class, Constructor[]> concurrentMap = constructorCache;
        Constructor[] declaredConstructors = concurrentMap.get(cls2);
        if (declaredConstructors == null) {
            declaredConstructors = cls2.getDeclaredConstructors();
            concurrentMap.putIfAbsent(cls2, declaredConstructors);
        }
        if (declaredConstructors.length == 0) {
            return false;
        }
        Constructor<?> constructor = declaredConstructors[0];
        if (constructor.getParameterCount() == 0) {
            return false;
        }
        return enclosingClass.equals(constructor.getParameterTypes()[0]);
    }

    public static boolean isRecord(Class cls) {
        Class superclass = cls.getSuperclass();
        if (superclass == null) {
            return false;
        }
        if (RECORD_CLASS != null) {
            return superclass == RECORD_CLASS;
        }
        if (!"com.android.tools.r8.RecordTag".equals(superclass.getName())) {
            return false;
        }
        RECORD_CLASS = superclass;
        return true;
    }

    public static boolean isWriteEnumAsJavaBean(Class cls) {
        int i = 0;
        for (Annotation annotation : getAnnotations(cls)) {
            JSONType jSONType = (JSONType) findAnnotation(annotation, JSONType.class);
            if (jSONType != null) {
                return jSONType.writeEnumAsJavaBean();
            }
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            String name = clsAnnotationType.getName();
            BeanInfo beanInfo = new BeanInfo(JSONFactory.getDefaultObjectWriterProvider());
            if (name.equals("com.fasterxml.jackson.annotation.JsonFormat")) {
                if (JSONFactory.isUseJacksonAnnotation()) {
                    processJacksonJsonFormat(beanInfo, annotation);
                }
            } else if (name.equals("com.alibaba.fastjson.annotation.JSONType")) {
                annotationMethods(clsAnnotationType, new C2502feyxiexzfUjhhgtg(beanInfo, annotation, i));
            }
            if (beanInfo.writeEnumAsJavaBean) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getDeclaredField$0(Map map, Field field) {
        map.put(field.getName(), field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumAnnotationNames$4(Annotation annotation, String str, String[] strArr, int i, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("name".equals(name)) {
                String str2 = (String) objInvoke;
                if (str2.length() == 0 || str2.equals(str)) {
                    return;
                }
                strArr[i] = str2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumAnnotationNames$5(Annotation annotation, String str, String[] strArr, int i, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String str2 = (String) objInvoke;
                if (str2.length() == 0 || str2.equals(str)) {
                    return;
                }
                strArr[i] = str2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumAnnotationNames$6(Enum[] enumArr, String[] strArr, Field field) {
        final String[] strArr2;
        String name = field.getName();
        int i = 0;
        for (final int i2 = 0; i2 < enumArr.length; i2++) {
            final String strName = enumArr[i2].name();
            if (name.equals(strName)) {
                Annotation[] annotations = field.getAnnotations();
                int length = annotations.length;
                while (i < length) {
                    final Annotation annotation = annotations[i];
                    Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
                    String name2 = clsAnnotationType.getName();
                    if ("com.alibaba.fastjson2.annotation.JSONField".equals(name2) || "com.alibaba.fastjson.annotation.JSONField".equals(name2)) {
                        strArr2 = strArr;
                        final int i3 = 0;
                        annotationMethods(clsAnnotationType, new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛲᛱUjhhgtgᛱᛳ
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                switch (i3) {
                                    case 0:
                                        BeanUtils.lambda$getEnumAnnotationNames$4(annotation, strName, strArr2, i2, (Method) obj);
                                        break;
                                    default:
                                        BeanUtils.lambda$getEnumAnnotationNames$5(annotation, strName, strArr2, i2, (Method) obj);
                                        break;
                                }
                            }
                        });
                    } else if ("com.fasterxml.jackson.annotation.JsonProperty".equals(name2)) {
                        final int i4 = 1;
                        strArr2 = strArr;
                        annotationMethods(clsAnnotationType, new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛲᛱUjhhgtgᛱᛳ
                            @Override // java.util.function.Consumer
                            public final void accept(Object obj) {
                                switch (i4) {
                                    case 0:
                                        BeanUtils.lambda$getEnumAnnotationNames$4(annotation, strName, strArr2, i2, (Method) obj);
                                        break;
                                    default:
                                        BeanUtils.lambda$getEnumAnnotationNames$5(annotation, strName, strArr2, i2, (Method) obj);
                                        break;
                                }
                            }
                        });
                    } else {
                        strArr2 = strArr;
                    }
                    i++;
                    strArr = strArr2;
                }
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumValueField$7(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getEnumValueField$8(String str, AtomicReference atomicReference, Method method, Method method2) {
        if (method2.getName().equals(str) && isJSONField(method2)) {
            atomicReference.set(method);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getField$10(Method method, int i, int i2, Class cls, char c, String str, Field[] fieldArr, Field field) {
        if (field.getDeclaringClass() != method.getDeclaringClass()) {
            return;
        }
        String name = field.getName();
        int length = name.length();
        if (length != i - i2 || (field.getType() != cls && !cls.isAssignableFrom(field.getType()))) {
            if (Boolean.TYPE == field.getType() && str.equals(name)) {
                fieldArr[0] = field;
                return;
            }
            return;
        }
        if (c >= 'A' && c <= 'Z' && c + ' ' == name.charAt(0) && name.regionMatches(1, str, i2 + 1, length - 1)) {
            fieldArr[0] = field;
        } else if (name.regionMatches(0, str, i2, length)) {
            fieldArr[1] = field;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getField$9(String str, Field[] fieldArr, Field field) {
        if (field.getName().equals(str)) {
            fieldArr[0] = field;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getSetter$1(String str, Method[] methodArr, Method method) {
        if (str.equals(method.getName())) {
            methodArr[0] = method;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isExtendedMap$20(Class cls, List list, Field field) {
        int modifiers = field.getModifiers();
        if (Modifier.isStatic(modifiers) || Modifier.isTransient(modifiers) || field.getDeclaringClass().isAssignableFrom(cls) || "this$0".equals(field.getName())) {
            return;
        }
        list.add(field);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$isWriteEnumAsJavaBean$3(BeanInfo beanInfo, Annotation annotation, Method method) {
        processJSONType1x(beanInfo, annotation, method);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processGsonSerializedName$19(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1408024454) {
                if (name.equals("alternate")) {
                    String[] strArr = (String[]) objInvoke;
                    if (strArr.length != 0) {
                        fieldInfo.alternateNames = strArr;
                        return;
                    }
                    return;
                }
                return;
            }
            if (iHashCode == 111972721 && name.equals("value")) {
                String str = (String) objInvoke;
                if (str.isEmpty()) {
                    return;
                }
                fieldInfo.fieldName = str;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonFormat$12(Annotation annotation, String[] strArr, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1097462182) {
                if (name.equals("locale")) {
                    strArr[2] = (String) objInvoke;
                }
            } else if (iHashCode == -791090288) {
                if (name.equals("pattern")) {
                    strArr[0] = (String) objInvoke;
                }
            } else if (iHashCode == 109399969 && name.equals("shape")) {
                strArr[1] = ((Enum) objInvoke).name();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonFormat$13(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == -1097462182) {
                if (name.equals("locale")) {
                    String str = (String) objInvoke;
                    if (str.isEmpty() || "##default".equals(str)) {
                        return;
                    }
                    beanInfo.locale = Locale.forLanguageTag(str);
                    return;
                }
                return;
            }
            if (iHashCode == -791090288) {
                if (name.equals("pattern")) {
                    String str2 = (String) objInvoke;
                    if (str2.isEmpty()) {
                        return;
                    }
                    beanInfo.format = str2;
                    return;
                }
                return;
            }
            if (iHashCode == 109399969 && name.equals("shape")) {
                String strName = ((Enum) objInvoke).name();
                if ("NUMBER".equals(strName)) {
                    beanInfo.format = "millis";
                } else if ("OBJECT".equals(strName)) {
                    beanInfo.writeEnumAsJavaBean = true;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonIgnore$11(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                fieldInfo.ignore = ((Boolean) objInvoke).booleanValue();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonInclude$14(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String strName = ((Enum) objInvoke).name();
                int iHashCode = strName.hashCode();
                if (iHashCode == -7755493) {
                    if (strName.equals("NON_EMPTY")) {
                        beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteEmptyArray.mask;
                    }
                } else if (iHashCode == 10566287) {
                    if (strName.equals("NON_DEFAULT")) {
                        beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteDefaultValue.mask;
                    }
                } else if (iHashCode == 1933739535 && strName.equals("ALWAYS")) {
                    beanInfo.writerFeatures |= JSONWriter.Feature.WriteNulls.mask;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonInclude$15(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String strName = ((Enum) objInvoke).name();
                int iHashCode = strName.hashCode();
                if (iHashCode == -7755493) {
                    if (strName.equals("NON_EMPTY")) {
                        long j = fieldInfo.features | JSONWriter.Feature.NotWriteEmptyArray.mask;
                        fieldInfo.features = j;
                        fieldInfo.features = j | JSONWriter.Feature.IgnoreEmpty.mask;
                        return;
                    }
                    return;
                }
                if (iHashCode == 10566287) {
                    if (strName.equals("NON_DEFAULT")) {
                        fieldInfo.features |= JSONWriter.Feature.NotWriteDefaultValue.mask;
                    }
                } else if (iHashCode == 1933739535 && strName.equals("ALWAYS")) {
                    fieldInfo.features |= JSONWriter.Feature.WriteNulls.mask;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonSubTypesType$18(Annotation annotation, BeanInfo beanInfo, int i, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            int iHashCode = name.hashCode();
            if (iHashCode == 3373707) {
                if (name.equals("name")) {
                    beanInfo.seeAlsoNames[i] = (String) objInvoke;
                    return;
                }
                return;
            }
            if (iHashCode == 111972721 && name.equals("value")) {
                beanInfo.seeAlso[i] = (Class) objInvoke;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonTypeName$17(Annotation annotation, BeanInfo beanInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("value".equals(name)) {
                String str = (String) objInvoke;
                if (str.isEmpty()) {
                    return;
                }
                beanInfo.typeName = str;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$processJacksonJsonUnwrapped$16(Annotation annotation, FieldInfo fieldInfo, Method method) {
        String name = method.getName();
        try {
            Object objInvoke = method.invoke(annotation, null);
            if ("enabled".equals(name) && ((Boolean) objInvoke).booleanValue()) {
                fieldInfo.features = FieldInfo.UNWRAPPED_MASK;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setters$2(Annotation annotation, AtomicBoolean atomicBoolean, Method method) {
        try {
            if ("unwrapped".equals(method.getName()) && ((Boolean) method.invoke(annotation, null)).booleanValue()) {
                atomicBoolean.set(true);
            }
        } catch (Throwable unused) {
        }
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Type type2, Type... typeArr) {
        return new ParameterizedTypeImpl(type, type2, typeArr);
    }

    private static String pascal(String str, int i, int i2) {
        char c;
        char c2;
        int i3 = i - i2;
        char[] cArr = new char[i3];
        str.getChars(i2, i, cArr, 0);
        char c3 = cArr[0];
        if (c3 >= 'a' && c3 <= 'z' && i3 > 1) {
            cArr[0] = (char) (c3 - ' ');
        } else if (c3 == '_' && i3 > 2 && (c = cArr[1]) >= 'a' && c <= 'z' && (c2 = cArr[2]) >= 'a' && c2 <= 'z') {
            cArr[1] = (char) (c - ' ');
        }
        return new String(cArr);
    }

    public static void processGsonSerializedName(FieldInfo fieldInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2498feyxiexzfUjhhgtg(annotation, fieldInfo, 1));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static void processJSONType1x(BeanInfo beanInfo, Annotation annotation, Method method) {
        try {
            Object objInvoke = method.invoke(annotation, null);
            String name = method.getName();
            switch (name.hashCode()) {
                case -1678076717:
                    if (name.equals("deserializer")) {
                        Class cls = (Class) objInvoke;
                        if (ObjectReader.class.isAssignableFrom(cls)) {
                            beanInfo.deserializer = cls;
                            return;
                        }
                        return;
                    }
                    return;
                case -1315832283:
                    if (name.equals("serializeEnumAsJavaBean") && ((Boolean) objInvoke).booleanValue()) {
                        beanInfo.writeEnumAsJavaBean = true;
                        return;
                    }
                    return;
                case -1210506547:
                    if (!name.equals("alphabetic") || ((Boolean) objInvoke).booleanValue()) {
                        return;
                    }
                    beanInfo.alphabetic = false;
                    return;
                case -1052827512:
                    if (name.equals("naming")) {
                        beanInfo.namingStrategy = ((Enum) objInvoke).name();
                        return;
                    }
                    return;
                case -1008770331:
                    if (name.equals("orders")) {
                        String[] strArr = (String[]) objInvoke;
                        if (strArr.length != 0) {
                            beanInfo.orders = strArr;
                            return;
                        }
                        return;
                    }
                    return;
                case -940893828:
                    if (!name.equals("serialzeFeatures")) {
                        return;
                    }
                    break;
                case -853109563:
                    if (name.equals("typeKey")) {
                        String str = (String) objInvoke;
                        if (str.isEmpty()) {
                            return;
                        }
                        beanInfo.typeKey = str;
                        return;
                    }
                    return;
                case -676507419:
                    if (name.equals("typeName")) {
                        String str2 = (String) objInvoke;
                        if (str2.isEmpty()) {
                            return;
                        }
                        beanInfo.typeName = str2;
                        return;
                    }
                    return;
                case -597985902:
                    if (name.equals("serializer")) {
                        Class cls2 = (Class) objInvoke;
                        if (ObjectWriter.class.isAssignableFrom(cls2)) {
                            beanInfo.writeEnumAsJavaBean = true;
                            beanInfo.serializer = cls2;
                            return;
                        }
                        return;
                    }
                    return;
                case -167039347:
                    if (name.equals("rootName")) {
                        String str3 = (String) objInvoke;
                        if (str3.isEmpty()) {
                            return;
                        }
                        beanInfo.rootName = str3;
                        return;
                    }
                    return;
                case 90259659:
                    if (name.equals("includes")) {
                        String[] strArr2 = (String[]) objInvoke;
                        if (strArr2.length != 0) {
                            beanInfo.includes = strArr2;
                            return;
                        }
                        return;
                    }
                    return;
                case 1752415457:
                    if (name.equals("ignores")) {
                        String[] strArr3 = (String[]) objInvoke;
                        if (strArr3.length != 0) {
                            if (beanInfo.ignores == null) {
                                beanInfo.ignores = strArr3;
                                return;
                            }
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            linkedHashSet.addAll(Arrays.asList(beanInfo.ignores));
                            linkedHashSet.addAll(Arrays.asList(strArr3));
                            beanInfo.ignores = (String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]);
                            return;
                        }
                        return;
                    }
                    return;
                case 1869860669:
                    if (!name.equals("serializeFeatures")) {
                        return;
                    }
                    break;
                case 1970571962:
                    if (name.equals("seeAlso")) {
                        Class[] clsArr = (Class[]) objInvoke;
                        if (clsArr.length != 0) {
                            beanInfo.seeAlso = clsArr;
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
            for (Enum r0 : (Enum[]) objInvoke) {
                String strName = r0.name();
                switch (strName.hashCode()) {
                    case -1937516631:
                        if (strName.equals("WriteNullNumberAsZero")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullNumberAsZero.mask;
                        }
                        break;
                    case -1779797023:
                        if (strName.equals("IgnoreErrorGetter")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.IgnoreErrorGetter.mask;
                        }
                        break;
                    case -335314544:
                        if (strName.equals("WriteEnumUsingToString")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteEnumUsingToString.mask;
                        }
                        break;
                    case -211922948:
                        if (strName.equals("BrowserCompatible")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.BrowserCompatible.mask;
                        }
                        break;
                    case -102443356:
                        if (strName.equals("WriteNullStringAsEmpty")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullStringAsEmpty.mask;
                        }
                        break;
                    case -62964779:
                        if (strName.equals("NotWriteRootClassName")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.NotWriteRootClassName.mask;
                        }
                        break;
                    case 1009181687:
                        if (strName.equals("WriteNullListAsEmpty")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullListAsEmpty.mask;
                        }
                        break;
                    case 1519175029:
                        if (strName.equals("WriteNonStringValueAsString")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNonStringValueAsString.mask;
                        }
                        break;
                    case 1808123471:
                        if (strName.equals("WriteNullBooleanAsFalse")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNullBooleanAsFalse.mask;
                        }
                        break;
                    case 1879776036:
                        if (strName.equals("WriteClassName")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteClassName.mask;
                        }
                        break;
                    case 2049970061:
                        if (strName.equals("WriteMapNullValue")) {
                            beanInfo.writerFeatures |= JSONWriter.Feature.WriteNulls.mask;
                        }
                        break;
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static void processJacksonJsonFormat(FieldInfo fieldInfo, Annotation annotation) {
        String[] strArr = new String[3];
        annotationMethods(annotation.getClass(), new C2497feyxiexzfUjhhgtg(annotation, 4, strArr));
        if (strArr[0].length() != 0) {
            fieldInfo.format = strArr[0];
        }
        if ("STRING".equals(strArr[1]) && fieldInfo.format == null) {
            fieldInfo.format = "string";
        } else if ("NUMBER".equals(strArr[1])) {
            fieldInfo.format = "millis";
        }
        if (strArr[2].isEmpty() || "##default".equals(strArr[2])) {
            return;
        }
        fieldInfo.locale = Locale.forLanguageTag(strArr[2]);
    }

    public static void processJacksonJsonIgnore(FieldInfo fieldInfo, Annotation annotation) {
        fieldInfo.ignore = true;
        annotationMethods(annotation.getClass(), new C2498feyxiexzfUjhhgtg(annotation, fieldInfo, 0));
    }

    public static void processJacksonJsonInclude(BeanInfo beanInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2502feyxiexzfUjhhgtg(annotation, beanInfo, 1));
    }

    public static void processJacksonJsonSubTypesType(final BeanInfo beanInfo, final int i, final Annotation annotation) {
        annotationMethods(annotation.getClass(), new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱᛳᛲ
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                BeanUtils.lambda$processJacksonJsonSubTypesType$18(annotation, beanInfo, i, (Method) obj);
            }
        });
    }

    public static void processJacksonJsonTypeName(BeanInfo beanInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2502feyxiexzfUjhhgtg(annotation, beanInfo, 2));
    }

    public static void processJacksonJsonUnwrapped(FieldInfo fieldInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2498feyxiexzfUjhhgtg(annotation, fieldInfo, 2));
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return resolve(type, cls, type2, new HashMap());
    }

    public static Type resolveCollectionItemType(Type type, Class<?> cls) {
        if (type == null) {
            type = cls;
        }
        Type genericSupertype = getGenericSupertype(type, cls, List.class);
        if (genericSupertype == null || genericSupertype == List.class) {
            genericSupertype = getGenericSupertype(type, cls, Collection.class);
        }
        Type typeResolve = resolve(type, cls, genericSupertype);
        if (!(typeResolve instanceof ParameterizedType)) {
            return null;
        }
        Type[] actualTypeArguments = ((ParameterizedType) typeResolve).getActualTypeArguments();
        if (actualTypeArguments.length == 1) {
            return actualTypeArguments[0];
        }
        return null;
    }

    public static Type resolveTypeVariable(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> clsDeclaringClassOf = declaringClassOf(typeVariable);
        if (clsDeclaringClassOf != null) {
            Type genericSupertype = getGenericSupertype(type, cls, clsDeclaringClassOf);
            if (genericSupertype instanceof ParameterizedType) {
                return ((ParameterizedType) genericSupertype).getActualTypeArguments()[indexOf(clsDeclaringClassOf.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static void setNoneStaticMemberClassParent(Object obj, Object obj2) {
        Class<?> cls = obj.getClass();
        Field[] declaredFields = declaredFieldCache.get(cls);
        if (declaredFields == null) {
            declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (Modifier.isStatic(field.getModifiers())) {
                    ArrayList arrayList = new ArrayList(declaredFields.length);
                    for (Field field2 : declaredFields) {
                        if (!Modifier.isStatic(field2.getModifiers())) {
                            arrayList.add(field2);
                        }
                    }
                    declaredFields = (Field[]) arrayList.toArray(new Field[arrayList.size()]);
                    break;
                }
            }
            fieldCache.putIfAbsent(cls, declaredFields);
        }
        Field field3 = null;
        for (Field field4 : declaredFields) {
            if ("this$0".equals(field4.getName())) {
                field3 = field4;
            }
        }
        if (field3 != null) {
            field3.setAccessible(true);
            try {
                field3.set(obj, obj2);
            } catch (IllegalAccessException unused) {
                throw new JSONException(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "setNoneStaticMemberClassParent error, class "));
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String setterName(String str, String str2) {
        char c;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        byte b = 3;
        if (length <= 3) {
            return str;
        }
        int i = str.startsWith("set") ? 3 : 0;
        switch (str2.hashCode()) {
            case -2068429102:
                b = str2.equals("UpperCase") ? (byte) 0 : (byte) -1;
                break;
            case -1863045342:
                b = str2.equals("UpperCaseWithDots") ? (byte) 1 : (byte) -1;
                break;
            case -1112704575:
                b = str2.equals("NeverUseThisValueExceptDefaultValue") ? (byte) 2 : (byte) -1;
                break;
            case -46641534:
                if (!str2.equals("LowerCaseWithUnderScores")) {
                    b = -1;
                }
                break;
            case 572594479:
                b = str2.equals("UpperCamelCaseWithUnderScores") ? (byte) 4 : (byte) -1;
                break;
            case 601822360:
                b = str2.equals("UpperCaseWithDashes") ? (byte) 5 : (byte) -1;
                break;
            case 928600554:
                b = str2.equals("UpperCamelCaseWithDashes") ? (byte) 6 : (byte) -1;
                break;
            case 975280372:
                b = str2.equals("UpperCamelCaseWithDots") ? (byte) 7 : (byte) -1;
                break;
            case 1315531521:
                b = str2.equals("LowerCaseWithDots") ? (byte) 8 : (byte) -1;
                break;
            case 1336502620:
                b = str2.equals("PascalCase") ? (byte) 9 : (byte) -1;
                break;
            case 1371349591:
                b = str2.equals("UpperCamelCaseWithSpaces") ? (byte) 10 : (byte) -1;
                break;
            case 1460726553:
                b = str2.equals("KebabCase") ? (byte) 11 : (byte) -1;
                break;
            case 1488507313:
                b = str2.equals("LowerCase") ? (byte) 12 : (byte) -1;
                break;
            case 1492440247:
                b = str2.equals("LowerCaseWithDashes") ? ek.k : (byte) -1;
                break;
            case 1655544038:
                b = str2.equals("CamelCase") ? ek.l : (byte) -1;
                break;
            case 1839922637:
                b = str2.equals("CamelCase1x") ? ek.m : (byte) -1;
                break;
            case 1976554305:
                b = str2.equals("UpperCaseWithUnderScores") ? (byte) 16 : (byte) -1;
                break;
            case 2087942256:
                b = str2.equals("SnakeCase") ? (byte) 17 : (byte) -1;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                int i2 = length - i;
                char[] cArr = new char[i2];
                str.getChars(i, length, cArr, 0);
                char c2 = cArr[0];
                for (int i3 = 0; i3 < i2; i3++) {
                    char c3 = cArr[i3];
                    if (c3 >= 'a' && c2 <= 'z') {
                        cArr[i3] = (char) (c3 - ' ');
                    }
                }
                return new String(cArr);
            case 1:
                return dots(str, i, true);
            case 2:
            case Opcodes.DCONST_0 /* 14 */:
                int i4 = length - i;
                char[] cArr2 = new char[i4];
                str.getChars(i, length, cArr2, 0);
                char c4 = cArr2[0];
                boolean z = i4 > 1 && (c = cArr2[1]) >= 'A' && c <= 'Z';
                if (c4 >= 'A' && c4 <= 'Z' && !z) {
                    cArr2[0] = (char) (c4 + ' ');
                }
                return new String(cArr2);
            case 3:
                return underScores(str, i, false);
            case 4:
                return upperCamelWith(str, i, '_');
            case 5:
                return dashes(str, i, true);
            case 6:
                return upperCamelWith(str, i, '-');
            case 7:
                return upperCamelWith(str, i, '.');
            case 8:
                return dots(str, i, false);
            case 9:
                return pascal(str, length, i);
            case 10:
                return upperCamelWith(str, i, ' ');
            case 11:
                StringBuilder sb = new StringBuilder();
                for (int i5 = i; i5 < str.length(); i5++) {
                    char cCharAt = str.charAt(i5);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i5 > i) {
                            sb.append('-');
                        }
                    }
                    sb.append(cCharAt);
                }
                return sb.toString();
            case Opcodes.FCONST_1 /* 12 */:
                return str.substring(i).toLowerCase();
            case 13:
                return dashes(str, i, false);
            case 15:
                char[] cArr3 = new char[length - i];
                str.getChars(i, length, cArr3, 0);
                char c5 = cArr3[0];
                if (c5 >= 'A' && c5 <= 'Z') {
                    cArr3[0] = (char) (c5 + ' ');
                }
                return new String(cArr3);
            case 16:
                return underScores(str, i, true);
            case Opcodes.SIPUSH /* 17 */:
                return snakeCase(str, i);
            default:
                throw new JSONException("TODO : ".concat(str2));
        }
    }

    public static void setters(Class cls, Consumer<Method> consumer) {
        setters(cls, null, null, consumer);
    }

    public static String snakeCase(String str, int i) {
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i2 = i;
        int i3 = 0;
        while (i2 < length) {
            try {
                char cCharAt = str.charAt(i2);
                if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    cCharAt = (char) (cCharAt + ' ');
                    if (i2 > i) {
                        andSet[i3] = '_';
                        i3++;
                    }
                }
                andSet[i3] = cCharAt;
                i2++;
                i3++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i3);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static void staticMethod(Class cls, Consumer<Method> consumer) {
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            if (Modifier.isStatic(method.getModifiers())) {
                consumer.accept(method);
            }
        }
    }

    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, EMPTY_TYPE_ARRAY);
    }

    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }

    public static String underScores(String str, int i, boolean z) {
        int i2;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i3 = i;
        int i4 = 0;
        while (i3 < length) {
            try {
                char cCharAt = str.charAt(i3);
                if (z) {
                    if (cCharAt < 'A' || cCharAt > 'Z') {
                        if (cCharAt >= 'a' && cCharAt <= 'z') {
                            i2 = cCharAt - ' ';
                            cCharAt = (char) i2;
                        }
                    } else if (i3 > i) {
                        andSet[i4] = '_';
                        i4++;
                    }
                } else if (cCharAt >= 'A' && cCharAt <= 'Z') {
                    if (i3 > i) {
                        andSet[i4] = '_';
                        i4++;
                    }
                    i2 = cCharAt + ' ';
                    cCharAt = (char) i2;
                }
                andSet[i4] = cCharAt;
                i3++;
                i4++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i4);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static String upperCamelWith(String str, int i, char c) {
        int i2;
        char cCharAt;
        char cCharAt2;
        int i3;
        int i4;
        char cCharAt3;
        int i5;
        char cCharAt4;
        int i6;
        char cCharAt5;
        int length = str.length();
        char[] andSet = TypeUtils.CHARS_UPDATER.getAndSet(TypeUtils.CACHE, null);
        if (andSet == null) {
            andSet = new char[128];
        }
        int i7 = i;
        int i8 = 0;
        while (i7 < length) {
            try {
                char cCharAt6 = str.charAt(i7);
                if (i7 == i) {
                    if (cCharAt6 >= 'a' && cCharAt6 <= 'z' && (i6 = i7 + 1) < length && (cCharAt5 = str.charAt(i6)) >= 'a' && cCharAt5 <= 'z') {
                        cCharAt6 = (char) (cCharAt6 - ' ');
                    } else if (cCharAt6 == '_' && (i5 = i7 + 1) < length && (cCharAt4 = str.charAt(i5)) >= 'a' && cCharAt4 <= 'z') {
                        andSet[i8] = cCharAt6;
                        cCharAt6 = (char) (cCharAt4 - ' ');
                        i8++;
                        i7 = i5;
                    }
                } else if (cCharAt6 < 'A' || cCharAt6 > 'Z' || (i4 = i7 + 1) >= length || ((cCharAt3 = str.charAt(i4)) >= 'A' && cCharAt3 <= 'Z')) {
                    if (cCharAt6 >= 'A' && cCharAt6 <= 'Z' && i7 > i && (i2 = i7 + 1) < length && (cCharAt = str.charAt(i2)) >= 'A' && cCharAt <= 'Z' && (cCharAt2 = str.charAt(i7 - 1)) >= 'a' && cCharAt2 <= 'z') {
                        i3 = i8 + 1;
                        andSet[i8] = c;
                        i8 = i3;
                    }
                } else if (i7 > i) {
                    i3 = i8 + 1;
                    andSet[i8] = c;
                    i8 = i3;
                }
                andSet[i8] = cCharAt6;
                i7++;
                i8++;
            } catch (Throwable th) {
                TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
                throw th;
            }
        }
        String str2 = new String(andSet, 0, i8);
        TypeUtils.CHARS_UPDATER.set(TypeUtils.CACHE, andSet);
        return str2;
    }

    public static String getterName(Method method, boolean z, String str) {
        int iIndexOf;
        Class<?> returnType;
        String name = method.getName();
        if (name.startsWith("is") && (((returnType = method.getReturnType()) != Boolean.class && returnType != Boolean.TYPE) || z)) {
            return name;
        }
        String strSubstring = getterName(name, str);
        if (z && (iIndexOf = strSubstring.indexOf(45)) != -1) {
            strSubstring = strSubstring.substring(0, iIndexOf);
        }
        if (strSubstring.length() > 2 && strSubstring.charAt(0) >= 'A' && strSubstring.charAt(0) <= 'Z' && strSubstring.charAt(1) >= 'A' && strSubstring.charAt(1) <= 'Z') {
            char[] charArray = strSubstring.toCharArray();
            charArray[0] = (char) (charArray[0] + ' ');
            Field declaredField = getDeclaredField(method.getDeclaringClass(), new String(charArray));
            if (declaredField != null && Modifier.isPublic(declaredField.getModifiers())) {
                return declaredField.getName();
            }
        }
        return strSubstring;
    }

    public static void getters(Class cls, Class cls2, Consumer<Method> consumer) {
        getters(cls, cls2, false, consumer);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:35:0x0080  */
    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x00af  */
    /* JADX WARN: Code duplicated, block: B:50:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c7 A[EDGE_INSN: B:52:0x00c7->B:58:0x00dd BREAK  A[LOOP:0: B:3:0x0001->B:64:?]] */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:67:0x009d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x009d A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.Map, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type>] */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v5 */
    private static Type resolve(Type type, Class<?> cls, Type type2, Map<TypeVariable<?>, Type> map) {
        int i;
        Type[] lowerBounds;
        Type[] upperBounds;
        Type typeResolve;
        Type typeResolve2;
        Type typeResolve3;
        boolean z;
        Type[] actualTypeArguments;
        int length;
        Type typeNewParameterizedTypeWithOwner;
        Type type3;
        Type typeResolve4;
        Type genericComponentType;
        Type typeResolve5;
        TypeVariable typeVariable;
        TypeVariable typeVariable2 = null;
        do {
            if (!(type2 instanceof TypeVariable)) {
                if (!(type2 instanceof Class)) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            WildcardType wildcardType = (WildcardType) type2;
                            lowerBounds = wildcardType.getLowerBounds();
                            upperBounds = wildcardType.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1) {
                                    break;
                                }
                                type2 = subtypeOf(typeResolve);
                                break;
                            }
                            typeResolve2 = resolve(type, cls, lowerBounds[0], map);
                            if (typeResolve2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = supertypeOf(typeResolve2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType = type2.getOwnerType();
                        typeResolve3 = resolve(type, cls, ownerType, map);
                        z = !equal(typeResolve3, ownerType);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        for (i = 0; i < length; i++) {
                            type3 = actualTypeArguments[i];
                            if (type3 == String.class) {
                                typeResolve4 = resolve(type, cls, type3, map);
                                if (equal(typeResolve4, type3)) {
                                    if (!z) {
                                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                        z = true;
                                    }
                                    actualTypeArguments[i] = typeResolve4;
                                }
                            }
                        }
                        if (z) {
                            break;
                        }
                        typeNewParameterizedTypeWithOwner = newParameterizedTypeWithOwner(typeResolve3, type2.getRawType(), actualTypeArguments);
                        type2 = typeNewParameterizedTypeWithOwner;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeResolve5 = resolve(type, cls, genericComponentType, map);
                    if (equal(genericComponentType, typeResolve5)) {
                        typeNewParameterizedTypeWithOwner = arrayOf(typeResolve5);
                        type2 = typeNewParameterizedTypeWithOwner;
                        break;
                    }
                    break;
                }
                Class cls2 = (Class) type2;
                if (!cls2.isArray()) {
                    if (type2 instanceof GenericArrayType) {
                        if (type2 instanceof ParameterizedType) {
                            if (type2 instanceof WildcardType) {
                                break;
                            }
                            WildcardType wildcardType2 = (WildcardType) type2;
                            lowerBounds = wildcardType2.getLowerBounds();
                            upperBounds = wildcardType2.getUpperBounds();
                            if (lowerBounds.length == 1) {
                                if (upperBounds.length != 1 && (typeResolve = resolve(type, cls, upperBounds[0], map)) != upperBounds[0]) {
                                    type2 = subtypeOf(typeResolve);
                                    break;
                                }
                                break;
                                break;
                            }
                            typeResolve2 = resolve(type, cls, lowerBounds[0], map);
                            if (typeResolve2 != lowerBounds[0]) {
                                break;
                            }
                            type2 = supertypeOf(typeResolve2);
                            break;
                        }
                        type2 = (ParameterizedType) type2;
                        Type ownerType2 = type2.getOwnerType();
                        typeResolve3 = resolve(type, cls, ownerType2, map);
                        z = !equal(typeResolve3, ownerType2);
                        actualTypeArguments = type2.getActualTypeArguments();
                        length = actualTypeArguments.length;
                        while (i < length) {
                            type3 = actualTypeArguments[i];
                            if (type3 == String.class) {
                                typeResolve4 = resolve(type, cls, type3, map);
                                if (equal(typeResolve4, type3)) {
                                    if (!z) {
                                        actualTypeArguments = (Type[]) actualTypeArguments.clone();
                                        z = true;
                                    }
                                    actualTypeArguments[i] = typeResolve4;
                                }
                            }
                        }
                        if (z) {
                            break;
                        }
                        typeNewParameterizedTypeWithOwner = newParameterizedTypeWithOwner(typeResolve3, type2.getRawType(), actualTypeArguments);
                        type2 = typeNewParameterizedTypeWithOwner;
                        break;
                    }
                    type2 = (GenericArrayType) type2;
                    genericComponentType = type2.getGenericComponentType();
                    typeResolve5 = resolve(type, cls, genericComponentType, map);
                    if (equal(genericComponentType, typeResolve5)) {
                        break;
                    }
                    typeNewParameterizedTypeWithOwner = arrayOf(typeResolve5);
                    type2 = typeNewParameterizedTypeWithOwner;
                    break;
                }
                Class<?> componentType = cls2.getComponentType();
                Type typeResolve6 = resolve(type, cls, componentType, map);
                if (!equal(componentType, typeResolve6)) {
                    typeNewParameterizedTypeWithOwner = arrayOf(typeResolve6);
                    type2 = typeNewParameterizedTypeWithOwner;
                    break;
                }
                type2 = cls2;
                break;
            }
            typeVariable = (TypeVariable) type2;
            Type type4 = (Type) map.get(typeVariable);
            Class cls3 = Void.TYPE;
            if (type4 != null) {
                return type4 == cls3 ? type2 : type4;
            }
            map.put(typeVariable, cls3);
            if (typeVariable2 == null) {
                typeVariable2 = typeVariable;
            }
            type2 = resolveTypeVariable(type, cls, typeVariable);
        } while (type2 != typeVariable);
        if (typeVariable2 != null) {
            map.put(typeVariable2, type2);
        }
        return type2;
    }

    public static void setters(Class cls, Class cls2, Consumer<Method> consumer) {
        setters(cls, null, cls2, consumer);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:130:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0209 A[LOOP:2: B:133:0x01fa->B:137:0x0209, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x020c  */
    /* JADX WARN: Code duplicated, block: B:140:0x0213  */
    /* JADX WARN: Code duplicated, block: B:143:0x021d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0224  */
    /* JADX WARN: Code duplicated, block: B:148:0x022a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0231  */
    /* JADX WARN: Code duplicated, block: B:154:0x0235  */
    /* JADX WARN: Code duplicated, block: B:156:0x0238  */
    /* JADX WARN: Code duplicated, block: B:161:0x0241  */
    /* JADX WARN: Code duplicated, block: B:164:0x024b  */
    /* JADX WARN: Code duplicated, block: B:166:0x024e  */
    /* JADX WARN: Code duplicated, block: B:172:0x025b  */
    /* JADX WARN: Code duplicated, block: B:174:0x025e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0267 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:185:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x028d  */
    /* JADX WARN: Code duplicated, block: B:194:0x028f  */
    /* JADX WARN: Code duplicated, block: B:197:0x0297  */
    /* JADX WARN: Code duplicated, block: B:200:0x02a3  */
    /* JADX WARN: Code duplicated, block: B:203:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:204:0x02af  */
    /* JADX WARN: Code duplicated, block: B:207:0x02b8  */
    /* JADX WARN: Code duplicated, block: B:208:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:211:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:212:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:216:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:219:0x02da  */
    /* JADX WARN: Code duplicated, block: B:221:0x02df A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:222:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:224:0x02ed A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:228:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:237:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:238:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:239:0x02f6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:247:0x020c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x0204 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:89:0x012d  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r19v3 */
    /* JADX WARN: Type inference failed for: r19v4 */
    /* JADX WARN: Type inference failed for: r19v5 */
    /* JADX WARN: Type inference failed for: r19v6 */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    public static void getters(Class cls, Class cls2, boolean z, Consumer<Method> consumer) {
        Class<?> returnType;
        Class<?> cls3;
        boolean z2;
        boolean z3;
        boolean z4;
        Method[] methodArr;
        int i;
        int i2;
        boolean z5;
        boolean zStartsWith;
        Class<?> cls4;
        int length;
        boolean z6;
        char c;
        char c2;
        char cCharAt;
        Class<?> returnType2;
        boolean z7;
        Method method;
        char cCharAt2;
        int length2;
        int i3;
        String str;
        boolean z8;
        if (cls == null) {
            return;
        }
        boolean z9 = true;
        if (Proxy.isProxyClass(cls)) {
            Class<?>[] interfaces = cls.getInterfaces();
            if (interfaces.length == 1) {
                getters(interfaces[0], consumer);
                return;
            }
        }
        if (ignore(cls)) {
            return;
        }
        Class<?> superclass = cls.getSuperclass();
        if (TypeUtils.isProxy(cls)) {
            getters(superclass, consumer);
            return;
        }
        boolean zIsRecord = isRecord(cls);
        boolean zIsStruct = JdbcSupport.isStruct(cls);
        String[] recordFieldNames = zIsRecord ? getRecordFieldNames(cls) : null;
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        boolean z10 = superclass != null && "com.google.protobuf.GeneratedMessageV3".equals(superclass.getName());
        int length3 = methods.length;
        int i4 = 0;
        boolean z11 = z10;
        while (i4 < length3) {
            Method method2 = methods[i4];
            if (method2.getParameterCount() != 0 || Modifier.isStatic(method2.getModifiers()) || (returnType = method2.getReturnType()) == Void.class || returnType == (cls3 = Void.TYPE) || ignore(returnType)) {
                z2 = zIsRecord;
                z3 = zIsStruct;
                z4 = z11;
                methodArr = methods;
                i = length3;
                i2 = i4;
                z5 = z9;
            } else {
                Class<?> declaringClass = method2.getDeclaringClass();
                if (declaringClass == Enum.class || declaringClass == Object.class) {
                    z2 = zIsRecord;
                    z3 = zIsStruct;
                    z4 = z11;
                    methodArr = methods;
                    i = length3;
                    i2 = i4;
                    z5 = true;
                } else {
                    String name = method2.getName();
                    if (!zIsStruct || "getSQLTypeName".equals(name) || "getAttributes".equals(name)) {
                        name.getClass();
                        z2 = zIsRecord;
                        ?? r19 = -1;
                        r19 = -1;
                        r19 = -1;
                        r19 = -1;
                        r19 = -1;
                        r19 = -1;
                        z3 = zIsStruct;
                        switch (name) {
                            case "toString":
                            case "equals":
                            case "hashCode":
                                break;
                            case "getSerializedSize":
                            case "isInitialized":
                            case "getInitializationErrorString":
                                if (!z11) {
                                    if (z11 || ((!name.endsWith("Type") && !name.endsWith("Bytes")) || !"com.google.protobuf.ByteString".equals(returnType.getName()))) {
                                        zStartsWith = name.startsWith("isSet");
                                        cls4 = Boolean.TYPE;
                                        if (!zStartsWith && returnType == cls4) {
                                            z4 = z11;
                                            String str2 = getterName(name, (String) null);
                                            i = length3;
                                            StringBuilder sb = new StringBuilder("g");
                                            i2 = i4;
                                            sb.append(str2.substring(1));
                                            String string = sb.toString();
                                            String strConcat = "un".concat(str2);
                                            int length4 = methods.length;
                                            methodArr = methods;
                                            int i5 = 0;
                                            boolean z12 = false;
                                            boolean z13 = false;
                                            boolean z14 = false;
                                            while (i5 < length4) {
                                                Method method3 = methodArr[i5];
                                                int i6 = i5;
                                                if (method3.getName().equals(str2)) {
                                                    str = str2;
                                                    z8 = true;
                                                    if (method3.getParameterCount() == 1 && method3.getReturnType() == cls3) {
                                                        z12 = true;
                                                    }
                                                    i5 = i6 + 1;
                                                    str2 = str;
                                                } else {
                                                    str = str2;
                                                    z8 = true;
                                                }
                                                if (method3.getName().equals(string) && method3.getParameterCount() == 0) {
                                                    z14 = z8;
                                                } else if (method3.getName().equals(strConcat) && method3.getParameterCount() == 0 && method3.getReturnType() == cls3) {
                                                    z13 = z8;
                                                }
                                                i5 = i6 + 1;
                                                str2 = str;
                                            }
                                            z5 = true;
                                            z4 = z4;
                                            z4 = z4;
                                            z4 = z4;
                                            if (z12 && z13 && z14 && findAnnotation(method2, JSONField.class) == null) {
                                                z4 = z4;
                                                break;
                                            }
                                        } else {
                                            z4 = z11;
                                            methodArr = methods;
                                            i = length3;
                                            i2 = i4;
                                            z5 = true;
                                        }
                                        if (z2) {
                                            length2 = recordFieldNames.length;
                                            i3 = 0;
                                            while (true) {
                                                if (i3 < length2) {
                                                    if (name.equals(recordFieldNames[i3])) {
                                                        consumer.accept(method2);
                                                    } else {
                                                        i3++;
                                                    }
                                                } else {
                                                    length = name.length();
                                                    if (length > 3 || !name.startsWith("get")) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        cCharAt2 = name.charAt(3);
                                                        if (cCharAt2 < 'a' && cCharAt2 <= 'z') {
                                                            if (length == 4) {
                                                                z6 = false;
                                                            }
                                                        }
                                                    } else {
                                                        if (returnType != cls4 || returnType == Boolean.class || z) {
                                                            c = 2;
                                                            if (length > 2 || !name.startsWith("is")) {
                                                                z6 = false;
                                                            } else {
                                                                z6 = z5;
                                                            }
                                                            if (z6 || (cCharAt = name.charAt(2)) < 'a' || cCharAt > 'z') {
                                                                c2 = 3;
                                                            } else {
                                                                c2 = 3;
                                                                if (length == 3) {
                                                                    z6 = false;
                                                                }
                                                            }
                                                        }
                                                        if (!z6 && isJSONField(method2)) {
                                                            z6 = z5;
                                                        }
                                                        if (!z6 && cls2 != null && (method = getMethod(cls2, method2)) != null && isJSONField(method)) {
                                                            z6 = z5;
                                                        }
                                                        if (!z6 && cls != returnType && !name.startsWith("build") && fluentSetter(cls, name, returnType) != null) {
                                                            z6 = z5;
                                                        }
                                                        if (z6) {
                                                            if (!z4) {
                                                                if (method2.getDeclaringClass() == superclass) {
                                                                    returnType2 = method2.getReturnType();
                                                                    switch (name.hashCode()) {
                                                                        case -1650707301:
                                                                            if (name.equals("getSerializedSize")) {
                                                                                r19 = 0;
                                                                            }
                                                                            break;
                                                                        case 132778702:
                                                                            if (name.equals("getParserForType")) {
                                                                                r19 = z5;
                                                                            }
                                                                            break;
                                                                        case 208401389:
                                                                            if (name.equals("getUnknownFields")) {
                                                                                r19 = c;
                                                                            }
                                                                            break;
                                                                        case 313806618:
                                                                            if (name.equals("getMessageBytes")) {
                                                                                r19 = c2;
                                                                            }
                                                                            break;
                                                                        case 2019988419:
                                                                            if (name.equals("getDefaultInstanceForType")) {
                                                                                r19 = 4;
                                                                            }
                                                                            break;
                                                                    }
                                                                    switch (r19) {
                                                                        case 0:
                                                                        case 1:
                                                                        case 2:
                                                                        case 3:
                                                                        case 4:
                                                                            if (!returnType2.getName().startsWith("com.google.protobuf.") || returnType2 == cls) {
                                                                                z7 = z5;
                                                                                break;
                                                                            }
                                                                        default:
                                                                            z7 = false;
                                                                            break;
                                                                    }
                                                                    if (z7) {
                                                                        consumer.accept(method2);
                                                                    }
                                                                }
                                                            } else {
                                                                consumer.accept(method2);
                                                            }
                                                        }
                                                        break;
                                                    }
                                                    c2 = 3;
                                                    c = 2;
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (z6) {
                                                        if (!z4) {
                                                            if (method2.getDeclaringClass() == superclass) {
                                                                returnType2 = method2.getReturnType();
                                                                switch (name.hashCode()) {
                                                                    case -1650707301:
                                                                        if (name.equals("getSerializedSize")) {
                                                                            r19 = 0;
                                                                        }
                                                                        break;
                                                                    case 132778702:
                                                                        if (name.equals("getParserForType")) {
                                                                            r19 = z5;
                                                                        }
                                                                        break;
                                                                    case 208401389:
                                                                        if (name.equals("getUnknownFields")) {
                                                                            r19 = c;
                                                                        }
                                                                        break;
                                                                    case 313806618:
                                                                        if (name.equals("getMessageBytes")) {
                                                                            r19 = c2;
                                                                        }
                                                                        break;
                                                                    case 2019988419:
                                                                        if (name.equals("getDefaultInstanceForType")) {
                                                                            r19 = 4;
                                                                        }
                                                                        break;
                                                                }
                                                                switch (r19) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                        if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                        }
                                                                        z7 = z5;
                                                                    default:
                                                                        z7 = false;
                                                                        break;
                                                                }
                                                                if (z7) {
                                                                    consumer.accept(method2);
                                                                }
                                                            }
                                                        } else {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            length = name.length();
                                            if (length > 3) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            if (!z6) {
                                                if (returnType != cls4) {
                                                }
                                                c = 2;
                                                if (length > 2) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (z6) {
                                                    c2 = 3;
                                                } else {
                                                    c2 = 3;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (z6) {
                                                    if (!z4) {
                                                        if (method2.getDeclaringClass() == superclass) {
                                                            returnType2 = method2.getReturnType();
                                                            switch (name.hashCode()) {
                                                                case -1650707301:
                                                                    if (name.equals("getSerializedSize")) {
                                                                        r19 = 0;
                                                                    }
                                                                    break;
                                                                case 132778702:
                                                                    if (name.equals("getParserForType")) {
                                                                        r19 = z5;
                                                                    }
                                                                    break;
                                                                case 208401389:
                                                                    if (name.equals("getUnknownFields")) {
                                                                        r19 = c;
                                                                    }
                                                                    break;
                                                                case 313806618:
                                                                    if (name.equals("getMessageBytes")) {
                                                                        r19 = c2;
                                                                    }
                                                                    break;
                                                                case 2019988419:
                                                                    if (name.equals("getDefaultInstanceForType")) {
                                                                        r19 = 4;
                                                                    }
                                                                    break;
                                                            }
                                                            switch (r19) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                    if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                    }
                                                                    z7 = z5;
                                                                default:
                                                                    z7 = false;
                                                                    break;
                                                            }
                                                            if (z7) {
                                                                consumer.accept(method2);
                                                            }
                                                        }
                                                    } else {
                                                        consumer.accept(method2);
                                                    }
                                                }
                                                break;
                                            } else {
                                                cCharAt2 = name.charAt(3);
                                                if (cCharAt2 < 'a') {
                                                }
                                            }
                                            c2 = 3;
                                            c = 2;
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (z6) {
                                                if (!z4) {
                                                    if (method2.getDeclaringClass() == superclass) {
                                                        returnType2 = method2.getReturnType();
                                                        switch (name.hashCode()) {
                                                            case -1650707301:
                                                                if (name.equals("getSerializedSize")) {
                                                                    r19 = 0;
                                                                }
                                                                break;
                                                            case 132778702:
                                                                if (name.equals("getParserForType")) {
                                                                    r19 = z5;
                                                                }
                                                                break;
                                                            case 208401389:
                                                                if (name.equals("getUnknownFields")) {
                                                                    r19 = c;
                                                                }
                                                                break;
                                                            case 313806618:
                                                                if (name.equals("getMessageBytes")) {
                                                                    r19 = c2;
                                                                }
                                                                break;
                                                            case 2019988419:
                                                                if (name.equals("getDefaultInstanceForType")) {
                                                                    r19 = 4;
                                                                }
                                                                break;
                                                        }
                                                        switch (r19) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                                if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                }
                                                                z7 = z5;
                                                            default:
                                                                z7 = false;
                                                                break;
                                                        }
                                                        if (z7) {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                } else {
                                                    consumer.accept(method2);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                            default:
                                if (z11) {
                                    break;
                                }
                                zStartsWith = name.startsWith("isSet");
                                cls4 = Boolean.TYPE;
                                if (!zStartsWith) {
                                    z4 = z11;
                                    methodArr = methods;
                                    i = length3;
                                    i2 = i4;
                                    z5 = true;
                                    if (z2) {
                                        length2 = recordFieldNames.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length2) {
                                                if (name.equals(recordFieldNames[i3])) {
                                                    consumer.accept(method2);
                                                } else {
                                                    i3++;
                                                }
                                            } else {
                                                length = name.length();
                                                if (length > 3) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (!z6) {
                                                    if (returnType != cls4) {
                                                    }
                                                    c = 2;
                                                    if (length > 2) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6) {
                                                        c2 = 3;
                                                    } else {
                                                        c2 = 3;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (z6) {
                                                        if (!z4) {
                                                            if (method2.getDeclaringClass() == superclass) {
                                                                returnType2 = method2.getReturnType();
                                                                switch (name.hashCode()) {
                                                                    case -1650707301:
                                                                        if (name.equals("getSerializedSize")) {
                                                                            r19 = 0;
                                                                        }
                                                                        break;
                                                                    case 132778702:
                                                                        if (name.equals("getParserForType")) {
                                                                            r19 = z5;
                                                                        }
                                                                        break;
                                                                    case 208401389:
                                                                        if (name.equals("getUnknownFields")) {
                                                                            r19 = c;
                                                                        }
                                                                        break;
                                                                    case 313806618:
                                                                        if (name.equals("getMessageBytes")) {
                                                                            r19 = c2;
                                                                        }
                                                                        break;
                                                                    case 2019988419:
                                                                        if (name.equals("getDefaultInstanceForType")) {
                                                                            r19 = 4;
                                                                        }
                                                                        break;
                                                                }
                                                                switch (r19) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                        if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                        }
                                                                        z7 = z5;
                                                                    default:
                                                                        z7 = false;
                                                                        break;
                                                                }
                                                                if (z7) {
                                                                    consumer.accept(method2);
                                                                }
                                                            }
                                                        } else {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    cCharAt2 = name.charAt(3);
                                                    if (cCharAt2 < 'a') {
                                                    }
                                                }
                                                c2 = 3;
                                                c = 2;
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (z6) {
                                                    if (!z4) {
                                                        if (method2.getDeclaringClass() == superclass) {
                                                            returnType2 = method2.getReturnType();
                                                            switch (name.hashCode()) {
                                                                case -1650707301:
                                                                    if (name.equals("getSerializedSize")) {
                                                                        r19 = 0;
                                                                    }
                                                                    break;
                                                                case 132778702:
                                                                    if (name.equals("getParserForType")) {
                                                                        r19 = z5;
                                                                    }
                                                                    break;
                                                                case 208401389:
                                                                    if (name.equals("getUnknownFields")) {
                                                                        r19 = c;
                                                                    }
                                                                    break;
                                                                case 313806618:
                                                                    if (name.equals("getMessageBytes")) {
                                                                        r19 = c2;
                                                                    }
                                                                    break;
                                                                case 2019988419:
                                                                    if (name.equals("getDefaultInstanceForType")) {
                                                                        r19 = 4;
                                                                    }
                                                                    break;
                                                            }
                                                            switch (r19) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                    if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                    }
                                                                    z7 = z5;
                                                                default:
                                                                    z7 = false;
                                                                    break;
                                                            }
                                                            if (z7) {
                                                                consumer.accept(method2);
                                                            }
                                                        }
                                                    } else {
                                                        consumer.accept(method2);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        length = name.length();
                                        if (length > 3) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (!z6) {
                                            if (returnType != cls4) {
                                            }
                                            c = 2;
                                            if (length > 2) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            if (z6) {
                                                c2 = 3;
                                            } else {
                                                c2 = 3;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (z6) {
                                                if (!z4) {
                                                    if (method2.getDeclaringClass() == superclass) {
                                                        returnType2 = method2.getReturnType();
                                                        switch (name.hashCode()) {
                                                            case -1650707301:
                                                                if (name.equals("getSerializedSize")) {
                                                                    r19 = 0;
                                                                }
                                                                break;
                                                            case 132778702:
                                                                if (name.equals("getParserForType")) {
                                                                    r19 = z5;
                                                                }
                                                                break;
                                                            case 208401389:
                                                                if (name.equals("getUnknownFields")) {
                                                                    r19 = c;
                                                                }
                                                                break;
                                                            case 313806618:
                                                                if (name.equals("getMessageBytes")) {
                                                                    r19 = c2;
                                                                }
                                                                break;
                                                            case 2019988419:
                                                                if (name.equals("getDefaultInstanceForType")) {
                                                                    r19 = 4;
                                                                }
                                                                break;
                                                        }
                                                        switch (r19) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                                if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                }
                                                                z7 = z5;
                                                            default:
                                                                z7 = false;
                                                                break;
                                                        }
                                                        if (z7) {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                } else {
                                                    consumer.accept(method2);
                                                }
                                            }
                                            break;
                                        } else {
                                            cCharAt2 = name.charAt(3);
                                            if (cCharAt2 < 'a') {
                                            }
                                        }
                                        c2 = 3;
                                        c = 2;
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (z6) {
                                            if (!z4) {
                                                if (method2.getDeclaringClass() == superclass) {
                                                    returnType2 = method2.getReturnType();
                                                    switch (name.hashCode()) {
                                                        case -1650707301:
                                                            if (name.equals("getSerializedSize")) {
                                                                r19 = 0;
                                                            }
                                                            break;
                                                        case 132778702:
                                                            if (name.equals("getParserForType")) {
                                                                r19 = z5;
                                                            }
                                                            break;
                                                        case 208401389:
                                                            if (name.equals("getUnknownFields")) {
                                                                r19 = c;
                                                            }
                                                            break;
                                                        case 313806618:
                                                            if (name.equals("getMessageBytes")) {
                                                                r19 = c2;
                                                            }
                                                            break;
                                                        case 2019988419:
                                                            if (name.equals("getDefaultInstanceForType")) {
                                                                r19 = 4;
                                                            }
                                                            break;
                                                    }
                                                    switch (r19) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                            if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                            }
                                                            z7 = z5;
                                                        default:
                                                            z7 = false;
                                                            break;
                                                    }
                                                    if (z7) {
                                                        consumer.accept(method2);
                                                    }
                                                }
                                            } else {
                                                consumer.accept(method2);
                                            }
                                        }
                                    }
                                    break;
                                } else {
                                    z4 = z11;
                                    methodArr = methods;
                                    i = length3;
                                    i2 = i4;
                                    z5 = true;
                                    if (z2) {
                                        length2 = recordFieldNames.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 < length2) {
                                                if (name.equals(recordFieldNames[i3])) {
                                                    consumer.accept(method2);
                                                } else {
                                                    i3++;
                                                }
                                            } else {
                                                length = name.length();
                                                if (length > 3) {
                                                    z6 = false;
                                                } else {
                                                    z6 = false;
                                                }
                                                if (!z6) {
                                                    if (returnType != cls4) {
                                                    }
                                                    c = 2;
                                                    if (length > 2) {
                                                        z6 = false;
                                                    } else {
                                                        z6 = false;
                                                    }
                                                    if (z6) {
                                                        c2 = 3;
                                                    } else {
                                                        c2 = 3;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (!z6) {
                                                        z6 = z5;
                                                    }
                                                    if (z6) {
                                                        if (!z4) {
                                                            if (method2.getDeclaringClass() == superclass) {
                                                                returnType2 = method2.getReturnType();
                                                                switch (name.hashCode()) {
                                                                    case -1650707301:
                                                                        if (name.equals("getSerializedSize")) {
                                                                            r19 = 0;
                                                                        }
                                                                        break;
                                                                    case 132778702:
                                                                        if (name.equals("getParserForType")) {
                                                                            r19 = z5;
                                                                        }
                                                                        break;
                                                                    case 208401389:
                                                                        if (name.equals("getUnknownFields")) {
                                                                            r19 = c;
                                                                        }
                                                                        break;
                                                                    case 313806618:
                                                                        if (name.equals("getMessageBytes")) {
                                                                            r19 = c2;
                                                                        }
                                                                        break;
                                                                    case 2019988419:
                                                                        if (name.equals("getDefaultInstanceForType")) {
                                                                            r19 = 4;
                                                                        }
                                                                        break;
                                                                }
                                                                switch (r19) {
                                                                    case 0:
                                                                    case 1:
                                                                    case 2:
                                                                    case 3:
                                                                    case 4:
                                                                        if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                        }
                                                                        z7 = z5;
                                                                    default:
                                                                        z7 = false;
                                                                        break;
                                                                }
                                                                if (z7) {
                                                                    consumer.accept(method2);
                                                                }
                                                            }
                                                        } else {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                    break;
                                                } else {
                                                    cCharAt2 = name.charAt(3);
                                                    if (cCharAt2 < 'a') {
                                                    }
                                                }
                                                c2 = 3;
                                                c = 2;
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (!z6) {
                                                    z6 = z5;
                                                }
                                                if (z6) {
                                                    if (!z4) {
                                                        if (method2.getDeclaringClass() == superclass) {
                                                            returnType2 = method2.getReturnType();
                                                            switch (name.hashCode()) {
                                                                case -1650707301:
                                                                    if (name.equals("getSerializedSize")) {
                                                                        r19 = 0;
                                                                    }
                                                                    break;
                                                                case 132778702:
                                                                    if (name.equals("getParserForType")) {
                                                                        r19 = z5;
                                                                    }
                                                                    break;
                                                                case 208401389:
                                                                    if (name.equals("getUnknownFields")) {
                                                                        r19 = c;
                                                                    }
                                                                    break;
                                                                case 313806618:
                                                                    if (name.equals("getMessageBytes")) {
                                                                        r19 = c2;
                                                                    }
                                                                    break;
                                                                case 2019988419:
                                                                    if (name.equals("getDefaultInstanceForType")) {
                                                                        r19 = 4;
                                                                    }
                                                                    break;
                                                            }
                                                            switch (r19) {
                                                                case 0:
                                                                case 1:
                                                                case 2:
                                                                case 3:
                                                                case 4:
                                                                    if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                    }
                                                                    z7 = z5;
                                                                default:
                                                                    z7 = false;
                                                                    break;
                                                            }
                                                            if (z7) {
                                                                consumer.accept(method2);
                                                            }
                                                        }
                                                    } else {
                                                        consumer.accept(method2);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        length = name.length();
                                        if (length > 3) {
                                            z6 = false;
                                        } else {
                                            z6 = false;
                                        }
                                        if (!z6) {
                                            if (returnType != cls4) {
                                            }
                                            c = 2;
                                            if (length > 2) {
                                                z6 = false;
                                            } else {
                                                z6 = false;
                                            }
                                            if (z6) {
                                                c2 = 3;
                                            } else {
                                                c2 = 3;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (!z6) {
                                                z6 = z5;
                                            }
                                            if (z6) {
                                                if (!z4) {
                                                    if (method2.getDeclaringClass() == superclass) {
                                                        returnType2 = method2.getReturnType();
                                                        switch (name.hashCode()) {
                                                            case -1650707301:
                                                                if (name.equals("getSerializedSize")) {
                                                                    r19 = 0;
                                                                }
                                                                break;
                                                            case 132778702:
                                                                if (name.equals("getParserForType")) {
                                                                    r19 = z5;
                                                                }
                                                                break;
                                                            case 208401389:
                                                                if (name.equals("getUnknownFields")) {
                                                                    r19 = c;
                                                                }
                                                                break;
                                                            case 313806618:
                                                                if (name.equals("getMessageBytes")) {
                                                                    r19 = c2;
                                                                }
                                                                break;
                                                            case 2019988419:
                                                                if (name.equals("getDefaultInstanceForType")) {
                                                                    r19 = 4;
                                                                }
                                                                break;
                                                        }
                                                        switch (r19) {
                                                            case 0:
                                                            case 1:
                                                            case 2:
                                                            case 3:
                                                            case 4:
                                                                if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                                }
                                                                z7 = z5;
                                                            default:
                                                                z7 = false;
                                                                break;
                                                        }
                                                        if (z7) {
                                                            consumer.accept(method2);
                                                        }
                                                    }
                                                } else {
                                                    consumer.accept(method2);
                                                }
                                            }
                                            break;
                                        } else {
                                            cCharAt2 = name.charAt(3);
                                            if (cCharAt2 < 'a') {
                                            }
                                        }
                                        c2 = 3;
                                        c = 2;
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (!z6) {
                                            z6 = z5;
                                        }
                                        if (z6) {
                                            if (!z4) {
                                                if (method2.getDeclaringClass() == superclass) {
                                                    returnType2 = method2.getReturnType();
                                                    switch (name.hashCode()) {
                                                        case -1650707301:
                                                            if (name.equals("getSerializedSize")) {
                                                                r19 = 0;
                                                            }
                                                            break;
                                                        case 132778702:
                                                            if (name.equals("getParserForType")) {
                                                                r19 = z5;
                                                            }
                                                            break;
                                                        case 208401389:
                                                            if (name.equals("getUnknownFields")) {
                                                                r19 = c;
                                                            }
                                                            break;
                                                        case 313806618:
                                                            if (name.equals("getMessageBytes")) {
                                                                r19 = c2;
                                                            }
                                                            break;
                                                        case 2019988419:
                                                            if (name.equals("getDefaultInstanceForType")) {
                                                                r19 = 4;
                                                            }
                                                            break;
                                                    }
                                                    switch (r19) {
                                                        case 0:
                                                        case 1:
                                                        case 2:
                                                        case 3:
                                                        case 4:
                                                            if (!returnType2.getName().startsWith("com.google.protobuf.")) {
                                                            }
                                                            z7 = z5;
                                                        default:
                                                            z7 = false;
                                                            break;
                                                    }
                                                    if (z7) {
                                                        consumer.accept(method2);
                                                    }
                                                }
                                            } else {
                                                consumer.accept(method2);
                                            }
                                        }
                                    }
                                    break;
                                }
                                break;
                        }
                    } else {
                        z2 = zIsRecord;
                        z3 = zIsStruct;
                    }
                    z4 = z11;
                    methodArr = methods;
                    i = length3;
                    i2 = i4;
                    z5 = true;
                }
            }
            i4 = i2 + 1;
            z9 = z5;
            z11 = z4;
            zIsRecord = z2;
            zIsStruct = z3;
            length3 = i;
            methods = methodArr;
        }
    }

    public static void processJacksonJsonInclude(FieldInfo fieldInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2498feyxiexzfUjhhgtg(annotation, fieldInfo, 3));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:101:0x0161  */
    /* JADX WARN: Code duplicated, block: B:105:0x016d  */
    /* JADX WARN: Code duplicated, block: B:107:0x0170 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:112:0x0180  */
    /* JADX WARN: Code duplicated, block: B:116:0x0190  */
    /* JADX WARN: Code duplicated, block: B:117:0x0192 A[LOOP:2: B:111:0x017e->B:117:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x0197  */
    /* JADX WARN: Code duplicated, block: B:121:0x019f  */
    /* JADX WARN: Code duplicated, block: B:125:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:0x01b1 A[LOOP:3: B:120:0x019d->B:126:0x01b1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:127:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:130:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x01bb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:147:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:150:0x01a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x003a  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0099  */
    /* JADX WARN: Code duplicated, block: B:95:0x014f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0154  */
    /* JADX WARN: Code duplicated, block: B:99:0x015a  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static void setters(Class cls, BeanInfo beanInfo, Class cls2, Consumer<Method> consumer) {
        int parameterCount;
        Class<?> returnType;
        boolean z;
        ?? r9;
        ?? r13;
        Annotation[] annotations;
        int length;
        int i;
        Annotation annotation;
        Method method;
        Annotation[] annotations2;
        int length2;
        int i2;
        Annotation annotation2;
        boolean z2;
        if (ignore(cls) || isRecord(cls)) {
            return;
        }
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        int length3 = methods.length;
        boolean z3 = false;
        int i3 = 0;
        while (i3 < length3) {
            Method method2 = methods[i3];
            if (!Modifier.isStatic(method2.getModifiers()) && method2.getDeclaringClass() != Object.class) {
                String name = method2.getName();
                name.getClass();
                boolean z4 = true;
                ?? r14 = -1;
                r14 = -1;
                r14 = -1;
                r14 = -1;
                r14 = -1;
                switch (name.hashCode()) {
                    case -1776922004:
                        if (name.equals("toString")) {
                            r14 = z3 ? 1 : 0;
                        }
                        break;
                    case -1295482945:
                        if (name.equals("equals")) {
                            r14 = 1;
                        }
                        break;
                    case 3059573:
                        if (name.equals("copy")) {
                            r14 = 2;
                        }
                        break;
                    case 147696667:
                        if (name.equals("hashCode")) {
                            r14 = 3;
                        }
                        break;
                }
                switch (r14) {
                    case 0:
                    case 1:
                    case 3:
                        z = z3 ? 1 : 0;
                        break;
                    case 2:
                        if (beanInfo == 0 || !beanInfo.kotlin) {
                            parameterCount = method2.getParameterCount();
                            returnType = method2.getReturnType();
                            if (parameterCount == 0) {
                                if (name.length() > 3 && name.startsWith("get")) {
                                    if (returnType != AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || returnType == AtomicReference.class || Collection.class.isAssignableFrom(returnType) || Map.class.isAssignableFrom(returnType)) {
                                        consumer.accept(method2);
                                    }
                                }
                                z = z3 ? 1 : 0;
                            }
                            if (parameterCount != 2 && method2.getReturnType() == Void.TYPE && method2.getParameterTypes()[z3 ? 1 : 0] == String.class) {
                                Annotation[] annotations3 = getAnnotations(method2);
                                AtomicBoolean atomicBoolean = new AtomicBoolean(z3);
                                int length4 = annotations3.length;
                                int i4 = z3 ? 1 : 0;
                                while (i4 < length4) {
                                    Annotation annotation3 = annotations3[i4];
                                    Class<? extends Annotation> clsAnnotationType = annotation3.annotationType();
                                    JSONField jSONField = (JSONField) findAnnotation(annotation3, JSONField.class);
                                    if (jSONField != null) {
                                        if (jSONField.unwrapped()) {
                                            atomicBoolean.set(z4);
                                            z = z3;
                                            if (atomicBoolean.get()) {
                                                consumer.accept(method2);
                                            }
                                        } else {
                                            z2 = z3;
                                        }
                                        break;
                                    } else {
                                        String name2 = clsAnnotationType.getName();
                                        if (name2.equals("com.fasterxml.jackson.annotation.JsonAnySetter")) {
                                            z2 = false;
                                            z2 = false;
                                            if (JSONFactory.isUseJacksonAnnotation()) {
                                                atomicBoolean.set(true);
                                            }
                                        } else if (name2.equals("com.alibaba.fastjson.annotation.JSONField")) {
                                            z2 = false;
                                            annotationMethods(annotation3.getClass(), new C2497feyxiexzfUjhhgtg(annotation3, 0 == true ? 1 : 0, atomicBoolean));
                                        } else {
                                            z2 = false;
                                        }
                                    }
                                    i4++;
                                    z3 = z2;
                                    z4 = true;
                                }
                                z = z3;
                                if (atomicBoolean.get()) {
                                    consumer.accept(method2);
                                }
                            } else {
                                z = z3 ? 1 : 0;
                                if (parameterCount == 1) {
                                    if (name.length() > 3 || !(name.startsWith("set") || returnType == cls)) {
                                        r9 = z ? 1 : 0;
                                    } else {
                                        r9 = 1;
                                    }
                                    if (r9 == 0 && cls2 != null && (method = getMethod(cls2, method2)) != null) {
                                        annotations2 = getAnnotations(method);
                                        length2 = annotations2.length;
                                        for (i2 = z ? 1 : 0; i2 < length2; i2++) {
                                            annotation2 = annotations2[i2];
                                            if (annotation2.annotationType() == JSONField.class) {
                                                if (!((JSONField) annotation2).unwrapped()) {
                                                    r9 = 1;
                                                }
                                            }
                                        }
                                    }
                                    if (r9 == 0) {
                                        annotations = getAnnotations(method2);
                                        length = annotations.length;
                                        i = z ? 1 : 0;
                                        while (true) {
                                            if (i < length) {
                                                annotation = annotations[i];
                                                if (annotation.annotationType() != JSONField.class) {
                                                    i++;
                                                } else if (!((JSONField) annotation).unwrapped()) {
                                                    r13 = 1;
                                                }
                                            }
                                            r13 = r9;
                                        }
                                    } else {
                                        r13 = r9;
                                    }
                                    if (r13 != 0) {
                                        consumer.accept(method2);
                                    }
                                }
                            }
                        } else {
                            z = z3 ? 1 : 0;
                        }
                        break;
                    default:
                        parameterCount = method2.getParameterCount();
                        returnType = method2.getReturnType();
                        if (parameterCount == 0) {
                            if (name.length() > 3) {
                                if (returnType != AtomicInteger.class) {
                                }
                                consumer.accept(method2);
                            }
                            z = z3 ? 1 : 0;
                        }
                        if (parameterCount != 2) {
                            z = z3 ? 1 : 0;
                            if (parameterCount == 1) {
                                if (name.length() > 3) {
                                    r9 = z ? 1 : 0;
                                } else {
                                    r9 = z ? 1 : 0;
                                }
                                if (r9 == 0) {
                                    annotations2 = getAnnotations(method);
                                    length2 = annotations2.length;
                                    while (i2 < length2) {
                                        annotation2 = annotations2[i2];
                                        if (annotation2.annotationType() == JSONField.class) {
                                            if (!((JSONField) annotation2).unwrapped()) {
                                                r9 = 1;
                                            }
                                        }
                                    }
                                }
                                if (r9 == 0) {
                                    annotations = getAnnotations(method2);
                                    length = annotations.length;
                                    i = z ? 1 : 0;
                                    while (true) {
                                        if (i < length) {
                                            annotation = annotations[i];
                                            if (annotation.annotationType() != JSONField.class) {
                                                i++;
                                            } else if (!((JSONField) annotation).unwrapped()) {
                                                r13 = 1;
                                            }
                                        }
                                        r13 = r9;
                                    }
                                } else {
                                    r13 = r9;
                                }
                                if (r13 != 0) {
                                    consumer.accept(method2);
                                }
                            }
                        } else {
                            z = z3 ? 1 : 0;
                            if (parameterCount == 1) {
                                if (name.length() > 3) {
                                    r9 = z ? 1 : 0;
                                } else {
                                    r9 = z ? 1 : 0;
                                }
                                if (r9 == 0) {
                                    annotations2 = getAnnotations(method);
                                    length2 = annotations2.length;
                                    while (i2 < length2) {
                                        annotation2 = annotations2[i2];
                                        if (annotation2.annotationType() == JSONField.class) {
                                            if (!((JSONField) annotation2).unwrapped()) {
                                                r9 = 1;
                                            }
                                        }
                                    }
                                }
                                if (r9 == 0) {
                                    annotations = getAnnotations(method2);
                                    length = annotations.length;
                                    i = z ? 1 : 0;
                                    while (true) {
                                        if (i < length) {
                                            annotation = annotations[i];
                                            if (annotation.annotationType() != JSONField.class) {
                                                i++;
                                            } else if (!((JSONField) annotation).unwrapped()) {
                                                r13 = 1;
                                            }
                                        }
                                        r13 = r9;
                                    }
                                } else {
                                    r13 = r9;
                                }
                                if (r13 != 0) {
                                    consumer.accept(method2);
                                }
                            }
                        }
                        break;
                }
            } else {
                z = z3 ? 1 : 0;
            }
            i3++;
            z3 = z;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <A extends Annotation> A findAnnotation(Annotation annotation, Class<A> cls) {
        if (annotation == 0) {
            throw new NullPointerException("annotation must not be null");
        }
        if (cls != null) {
            Class<? extends Annotation> clsAnnotationType = annotation.annotationType();
            return clsAnnotationType == cls ? annotation : (A) findAnnotation(clsAnnotationType, cls, cls.isAnnotationPresent(Inherited.class), new HashSet());
        }
        throw new NullPointerException("annotationType must not be null");
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    public static Field getField(Class cls, final Method method) {
        boolean z;
        boolean z2;
        boolean z3;
        final String name = method.getName();
        final int length = name.length();
        Class<?> returnType = method.getReturnType();
        if (length > 2) {
            char cCharAt = name.charAt(0);
            char cCharAt2 = name.charAt(1);
            char cCharAt3 = name.charAt(2);
            if (cCharAt == 'i' && cCharAt2 == 's') {
                z = returnType == Boolean.class || returnType == Boolean.TYPE;
                z2 = false;
                z3 = z2;
            } else if (cCharAt == 'g' && cCharAt2 == 'e' && cCharAt3 == 't') {
                z2 = length > 3;
                z = false;
                z3 = false;
            } else if (cCharAt == 's' && cCharAt2 == 'e' && cCharAt3 == 't') {
                z3 = length > 3 && method.getParameterCount() == 1;
                z = false;
                z2 = false;
            } else {
                z = false;
                z2 = false;
                z3 = z2;
            }
        } else {
            z = false;
            z2 = false;
            z3 = z2;
        }
        final Field[] fieldArr = new Field[2];
        if (z || z2 || z3) {
            final Class<?> cls2 = (z || z2) ? returnType : method.getParameterTypes()[0];
            final int i = z ? 2 : 3;
            char[] cArr = new char[length - i];
            name.getChars(i, length, cArr, 0);
            final char c = cArr[0];
            declaredFields(cls, new Consumer() { // from class: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛴ要点脸ᛱUjhhgtgᛱᛲᛳ
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    BeanUtils.lambda$getField$10(method, length, i, cls2, c, name, fieldArr, (Field) obj);
                }
            });
        }
        Field field = fieldArr[0];
        if (field == null) {
            field = fieldArr[1];
        }
        if (Throwable.class.isAssignableFrom(cls)) {
            if (returnType == String.class && ((field == null && "getMessage".equals(name)) || (field == null && "getLocalizedMessage".equals(name)))) {
                return getDeclaredField(cls, "detailMessage");
            }
            if (returnType == Throwable[].class && "getSuppressed".equals(name)) {
                return getDeclaredField(cls, "suppressedExceptions");
            }
        }
        return field;
    }

    public static void cleanupCache(ClassLoader classLoader) {
        Iterator<Map.Entry<Class, Field[]>> it = fieldCache.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().getClassLoader() == classLoader) {
                it.remove();
            }
        }
        Iterator<Map.Entry<Class, Map<String, Field>>> it2 = fieldMapCache.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getKey().getClassLoader() == classLoader) {
                it2.remove();
            }
        }
        Iterator<Map.Entry<Class, Field[]>> it3 = declaredFieldCache.entrySet().iterator();
        while (it3.hasNext()) {
            if (it3.next().getKey().getClassLoader() == classLoader) {
                it3.remove();
            }
        }
        Iterator<Map.Entry<Class, Method[]>> it4 = methodCache.entrySet().iterator();
        while (it4.hasNext()) {
            if (it4.next().getKey().getClassLoader() == classLoader) {
                it4.remove();
            }
        }
        Iterator<Map.Entry<Class, Constructor[]>> it5 = constructorCache.entrySet().iterator();
        while (it5.hasNext()) {
            if (it5.next().getKey().getClassLoader() == classLoader) {
                it5.remove();
            }
        }
    }

    public static Method getMethod(Class cls, Method method) {
        if (cls != null && cls != Object.class && cls != Serializable.class) {
            ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
            Method[] methods = concurrentMap.get(cls);
            if (methods == null) {
                methods = getMethods(cls);
                concurrentMap.putIfAbsent(cls, methods);
            }
            for (Method method2 : methods) {
                if (method2.getName().equals(method.getName()) && method2.getParameterCount() == method.getParameterCount()) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    Class<?>[] parameterTypes2 = method.getParameterTypes();
                    for (int i = 0; i < parameterTypes.length; i++) {
                        if (parameterTypes[i].equals(parameterTypes2[i])) {
                        }
                    }
                    return method2;
                }
            }
        }
        return null;
    }

    private static <A extends Annotation> A findAnnotation(AnnotatedElement annotatedElement, Class<A> cls, boolean z, Set<Annotation> set) {
        Class superclass;
        A a;
        A a2;
        if (annotatedElement == null || cls == null) {
            return null;
        }
        A a3 = (A) annotatedElement.getDeclaredAnnotation(cls);
        if (a3 != null) {
            return a3;
        }
        A a4 = (A) findMetaAnnotation(cls, annotatedElement.getDeclaredAnnotations(), z, set);
        if (a4 != null) {
            return a4;
        }
        if (annotatedElement instanceof Class) {
            Class cls2 = (Class) annotatedElement;
            for (Class<?> cls3 : cls2.getInterfaces()) {
                if (cls3 != Annotation.class && (a2 = (A) findAnnotation(cls3, cls, z, set)) != null) {
                    return a2;
                }
            }
            if (z && (superclass = cls2.getSuperclass()) != null && superclass != Object.class && (a = (A) findAnnotation(superclass, cls, true, set)) != null) {
                return a;
            }
        }
        return (A) findMetaAnnotation(cls, getAnnotations(annotatedElement), z, set);
    }

    public static void processJacksonJsonFormat(BeanInfo beanInfo, Annotation annotation) {
        annotationMethods(annotation.getClass(), new C2502feyxiexzfUjhhgtg(annotation, beanInfo, 3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String getterName(String str, String str2) {
        char c;
        if (str2 == null) {
            str2 = "CamelCase";
        }
        int length = str.length();
        boolean zStartsWith = str.startsWith("is");
        boolean zStartsWith2 = str.startsWith("get");
        int i = 3;
        int i2 = zStartsWith ? 2 : zStartsWith2 ? 3 : 0;
        if (length == i2) {
            return str;
        }
        byte b = -1;
        switch (str2.hashCode()) {
            case -2068429102:
                if (str2.equals("UpperCase")) {
                    b = 0;
                }
                break;
            case -1863045342:
                if (str2.equals("UpperCaseWithDots")) {
                    b = 1;
                }
                break;
            case -1112704575:
                if (str2.equals("NeverUseThisValueExceptDefaultValue")) {
                    b = 2;
                }
                break;
            case -46641534:
                if (str2.equals("LowerCaseWithUnderScores")) {
                    b = 3;
                }
                break;
            case 572594479:
                if (str2.equals("UpperCamelCaseWithUnderScores")) {
                    b = 4;
                }
                break;
            case 601822360:
                if (str2.equals("UpperCaseWithDashes")) {
                    b = 5;
                }
                break;
            case 928600554:
                if (str2.equals("UpperCamelCaseWithDashes")) {
                    b = 6;
                }
                break;
            case 975280372:
                if (str2.equals("UpperCamelCaseWithDots")) {
                    b = 7;
                }
                break;
            case 1315531521:
                if (str2.equals("LowerCaseWithDots")) {
                    b = 8;
                }
                break;
            case 1336502620:
                if (str2.equals("PascalCase")) {
                    b = 9;
                }
                break;
            case 1371349591:
                if (str2.equals("UpperCamelCaseWithSpaces")) {
                    b = 10;
                }
                break;
            case 1460726553:
                if (str2.equals("KebabCase")) {
                    b = 11;
                }
                break;
            case 1488507313:
                if (str2.equals("LowerCase")) {
                    b = 12;
                }
                break;
            case 1492440247:
                if (str2.equals("LowerCaseWithDashes")) {
                    b = ek.k;
                }
                break;
            case 1655544038:
                if (str2.equals("CamelCase")) {
                    b = ek.l;
                }
                break;
            case 1839922637:
                if (str2.equals("CamelCase1x")) {
                    b = ek.m;
                }
                break;
            case 1976554305:
                if (str2.equals("UpperCaseWithUnderScores")) {
                    b = 16;
                }
                break;
            case 2087942256:
                if (str2.equals("SnakeCase")) {
                    b = 17;
                }
                break;
        }
        switch (b) {
            case 0:
                return str.substring(i2).toUpperCase();
            case 1:
                return dots(str, i2, true);
            case 2:
            case Opcodes.DCONST_0 /* 14 */:
                int i3 = length - i2;
                char[] cArr = new char[i3];
                str.getChars(i2, length, cArr, 0);
                char c2 = cArr[0];
                boolean z = i3 > 1 && (c = cArr[1]) >= 'A' && c <= 'Z';
                if (c2 >= 'A' && c2 <= 'Z' && !z) {
                    cArr[0] = (char) (c2 + ' ');
                }
                return new String(cArr);
            case 3:
                return underScores(str, i2, false);
            case 4:
                return upperCamelWith(str, i2, '_');
            case 5:
                return dashes(str, i2, true);
            case 6:
                return upperCamelWith(str, i2, '-');
            case 7:
                return upperCamelWith(str, i2, '.');
            case 8:
                return dots(str, i2, false);
            case 9:
                return pascal(str, length, i2);
            case 10:
                return upperCamelWith(str, i2, ' ');
            case 11:
                StringBuilder sb = new StringBuilder();
                if (zStartsWith) {
                    i = 2;
                } else if (!zStartsWith2) {
                    i = 0;
                }
                for (int i4 = i; i4 < str.length(); i4++) {
                    char cCharAt = str.charAt(i4);
                    if (cCharAt >= 'A' && cCharAt <= 'Z') {
                        cCharAt = (char) (cCharAt + ' ');
                        if (i4 > i) {
                            sb.append('-');
                        }
                    }
                    sb.append(cCharAt);
                }
                return sb.toString();
            case Opcodes.FCONST_1 /* 12 */:
                return str.substring(i2).toLowerCase();
            case 13:
                return dashes(str, i2, false);
            case 15:
                char[] cArr2 = new char[length - i2];
                str.getChars(i2, length, cArr2, 0);
                char c3 = cArr2[0];
                if (c3 >= 'A' && c3 <= 'Z') {
                    cArr2[0] = (char) (c3 + ' ');
                }
                return new String(cArr2);
            case 16:
                return underScores(str, i2, true);
            case Opcodes.SIPUSH /* 17 */:
                return snakeCase(str, i2);
            default:
                throw new JSONException("TODO : ".concat(str2));
        }
    }

    public static String setterName(String str, int i) {
        char c;
        int length = str.length();
        int i2 = length - i;
        char[] cArr = new char[i2];
        str.getChars(i, length, cArr, 0);
        char c2 = cArr[0];
        boolean z = i2 > 1 && (c = cArr[1]) >= 'A' && c <= 'Z';
        if (c2 >= 'A' && c2 <= 'Z' && !z) {
            cArr[0] = (char) (c2 + ' ');
        }
        return new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0083  */
    public static void setters(Class cls, boolean z, Consumer<Method> consumer) {
        if (ignore(cls)) {
            return;
        }
        ConcurrentMap<Class, Method[]> concurrentMap = methodCache;
        Method[] methods = concurrentMap.get(cls);
        if (methods == null) {
            methods = getMethods(cls);
            concurrentMap.putIfAbsent(cls, methods);
        }
        for (Method method : methods) {
            int parameterCount = method.getParameterCount();
            if (parameterCount == 0) {
                String name = method.getName();
                if (!z || (name.length() > 3 && name.startsWith("get"))) {
                    Class<?> returnType = method.getReturnType();
                    if (returnType == AtomicInteger.class || returnType == AtomicLong.class || returnType == AtomicBoolean.class || returnType == AtomicIntegerArray.class || returnType == AtomicLongArray.class || Collection.class.isAssignableFrom(returnType)) {
                        consumer.accept(method);
                    } else if (parameterCount == 1 && !Modifier.isStatic(method.getModifiers())) {
                        String name2 = method.getName();
                        int length = name2.length();
                        if (z || (length > 3 && name2.startsWith("set"))) {
                            consumer.accept(method);
                        }
                    }
                }
            } else if (parameterCount == 1) {
                String name3 = method.getName();
                int length2 = name3.length();
                if (z) {
                    consumer.accept(method);
                } else {
                    consumer.accept(method);
                }
            }
        }
    }
}
