package bsh;

import com.alibaba.fastjson2.internal.asm.ASMUtils;
import com.alibaba.fastjson2.internal.asm.Opcodes;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;
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
import java.util.Base64;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import okhttp3.HttpUrl;
import p000.AbstractC0496;
import p000.AbstractC0499;
import p000.AbstractC2201;
import p000.AbstractC2202;
import p000.C0491;
import p000.C0711;
import p000.C1669;
import p000.C1983;
import p000.C3449;
import p000.C3467;
import p000.C3468;
import p000.C3523;
import p000.C3524;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0010 {

    public static final Map f522;

    public static final Primitive f523;

    public static final Primitive f524;

    static {
        C0491 c0491 = new C0491(2);
        c0491.put(Byte.TYPE, 0);
        c0491.put(Byte.class, 1);
        c0491.put(Short.TYPE, 2);
        c0491.put(Short.class, 3);
        c0491.put(Character.TYPE, 4);
        c0491.put(Character.class, 5);
        c0491.put(Integer.TYPE, 6);
        c0491.put(Integer.class, 7);
        c0491.put(Long.TYPE, 8);
        c0491.put(Long.class, 9);
        c0491.put(Float.TYPE, 10);
        c0491.put(Float.class, 11);
        c0491.put(Double.TYPE, 12);
        c0491.put(Double.class, 13);
        c0491.put(BigInteger.class, 14);
        c0491.put(BigDecimal.class, 15);
        f522 = Collections.unmodifiableMap(c0491);
        f523 = new Primitive(1);
        f524 = new Primitive(-1);
    }

    public static boolean m410(Class[] clsArr, Class[] clsArr2) {
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

    public static int m411(Class cls) {
        if (cls == null || !cls.isArray()) {
            return 0;
        }
        return cls.getName().lastIndexOf(91) + 1;
    }

    public static Class m412(Class cls) {
        if (cls == null) {
            return null;
        }
        while (cls.isArray()) {
            cls = cls.getComponentType();
        }
        return cls;
    }

    public static C3523 m413(String str, String str2, Object obj, int i) {
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
            return new C3523(sb.toString());
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
        return new C3524(classCastException.getMessage(), classCastException);
    }

    public static Object m414(int i, Class cls, Object obj) {
        if (obj != null) {
            return m415(cls, m419(obj, false), obj, i, false);
        }
        if (i == 0) {
            return (cls.isPrimitive() || cls == BigInteger.class || cls == BigDecimal.class || Primitive.isWrapperType(cls)) ? Primitive.getDefaultValue(cls) : Primitive.NULL;
        }
        throw new C1669("Cast error: null fromValue for toType: ".concat(cls.getSimpleName()));
    }

    /* JADX WARN: Code duplicated, block: B:216:0x0574  */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x0725, code lost:
    
        if (r36 != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:319:0x0799, code lost:
    
        if (r36 != false) goto L324;
     */
    /* JADX WARN: Code restructure failed: missing block: B:323:0x07a4, code lost:
    
        if (r36 != false) goto L324;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m415(Class cls, Class cls2, Object obj, int i, boolean z) throws C3523 {
        AbstractC0496 abstractC0496;
        C0711 c0711;
        Class<?> cls3;
        Class<?> cls4;
        String str;
        Class<?> cls5;
        Class<?>[] clsArr;
        Class<?> cls6;
        Class<?> cls7;
        Class<?> cls8;
        Class<?> cls9;
        Class<?> cls10;
        Class clsM1744;
        Class<?> cls11;
        int i2;
        double d;
        Object objWrap = obj;
        if (cls != null && cls != cls2) {
            int i3 = 0;
            if (cls2 == null || !cls2.isArray() || (i != 0 && !Collection.class.isAssignableFrom(cls))) {
                boolean zIsPrimitive = cls.isPrimitive();
                Class<?> cls12 = Boolean.TYPE;
                Class<?> cls13 = Void.TYPE;
                if (zIsPrimitive) {
                    if (cls2 == cls13 || cls2 == null || cls2.isPrimitive()) {
                        if (!Primitive.class.isInstance(objWrap)) {
                            objWrap = Primitive.wrap(objWrap, (Class<?>) cls2);
                        }
                        return Primitive.castPrimitive(cls, cls2, (Primitive) objWrap, z, i);
                    }
                    if (((!m430(cls2) && !String.valueOf(objWrap).matches("[-+0-9.]*")) || !m430(cls)) && cls != cls12) {
                        if (!z) {
                            throw m413(AbstractC2202.m4018(cls), AbstractC2202.m4018(cls2), objWrap, i);
                        }
                        return f524;
                    }
                    if (!z) {
                        return Primitive.wrap(Primitive.castWrapper(cls, objWrap), (Class<?>) cls);
                    }
                } else if (cls2 == cls13 || cls2 == null || cls2.isPrimitive() || cls == Boolean.class || (String.valueOf(objWrap).matches("[-+0-9.]*") && m430(cls))) {
                    if (!Primitive.isWrapperType(cls) || cls2 == cls13 || cls2 == null) {
                        if (cls != Object.class || cls2 == cls13 || cls2 == null) {
                            if (cls2 == null || cls2.isPrimitive() || !cls.isAssignableFrom(cls2)) {
                                return Primitive.castPrimitive(cls, cls2, (Primitive) objWrap, z, i);
                            }
                        } else if (!z) {
                            return Primitive.unwrap(objWrap);
                        }
                    } else if (!z) {
                        return Primitive.castWrapper(Primitive.unboxType(cls), objWrap);
                    }
                } else if (m427(cls) && (objWrap instanceof AbstractC0496)) {
                    if (!z) {
                        AbstractC0496 abstractC0497 = (AbstractC0496) objWrap;
                        if (!AbstractC0496.m1741(abstractC0497.f2138, cls, 4)) {
                            throw new C3523("This BshLambda can't be converted to ".concat(cls.getName()));
                        }
                        HashMap map = AbstractC0496.f2136;
                        if (map.containsKey(cls)) {
                            clsM1744 = (Class) map.get(cls);
                            abstractC0496 = abstractC0497;
                        } else {
                            String str2 = AbstractC0496.class.getName() + "Generated" + Base64.getUrlEncoder().withoutPadding().encodeToString(cls.getName().getBytes());
                            String strReplace = str2.replace(".", "/");
                            C0711 c0712 = new C0711();
                            String[] strArr = {C3449.m4978(cls)};
                            Type c3467 = cls.getTypeParameters().length != 0 ? new C3467(cls, cls.getTypeParameters()) : cls;
                            TypeVariable[] typeParameters = cls.getTypeParameters();
                            Type[] typeArr = {c3467};
                            StringBuilder sb = new StringBuilder();
                            if (typeParameters.length != 0) {
                                sb.append("<");
                                int length = typeParameters.length;
                                int i4 = 0;
                                while (i4 < length) {
                                    TypeVariable typeVariable = typeParameters[i4];
                                    AbstractC0496 abstractC0498 = abstractC0497;
                                    sb.append(typeVariable.getName());
                                    TypeVariable[] typeVariableArr = typeParameters;
                                    for (Type type : typeVariable.getBounds()) {
                                        sb.append(":");
                                        sb.append(m416(type));
                                    }
                                    i4++;
                                    abstractC0497 = abstractC0498;
                                    typeParameters = typeVariableArr;
                                }
                                abstractC0496 = abstractC0497;
                                sb.append(">");
                            } else {
                                abstractC0496 = abstractC0497;
                            }
                            sb.append(m416(Object.class));
                            sb.append(m416(typeArr[0]));
                            c0712.m2137(1, strReplace, sb.toString(), "java/lang/Object", strArr);
                            c0712.m2138(2, "bshLambda", C3449.m4977(AbstractC0496.class), null);
                            C3449[] c3449Arr = {C3449.m4980(new Class[]{AbstractC0496.class}[0])};
                            C3449 c3449M4980 = C3449.m4980(cls13);
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append('(');
                            c3449Arr[0].m4981(sb2);
                            sb2.append(')');
                            c3449M4980.m4981(sb2);
                            C1983 c1983M2139 = c0712.m2139(1, "<init>", sb2.toString(), null, null);
                            c1983M2139.m3847(25, 0);
                            c1983M2139.m3845(183, "java/lang/Object", "<init>", "()V");
                            c1983M2139.m3847(25, 0);
                            c1983M2139.m3847(25, 1);
                            c1983M2139.m3836(181, strReplace, "bshLambda", C3449.m4977(AbstractC0496.class));
                            c1983M2139.m3839(177);
                            c1983M2139.m3844();
                            Method methodM1742 = AbstractC0496.m1742(cls);
                            String strM4978 = C3449.m4978(AbstractC0496.class);
                            Parameter[] parameters = methodM1742.getParameters();
                            Class<?>[] exceptionTypes = methodM1742.getExceptionTypes();
                            String name = methodM1742.getName();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append('(');
                            for (Class<?> cls14 : methodM1742.getParameterTypes()) {
                                C3449.m4975(sb3, cls14);
                            }
                            sb3.append(')');
                            C3449.m4975(sb3, methodM1742.getReturnType());
                            String string = sb3.toString();
                            TypeVariable<Method>[] typeParameters2 = methodM1742.getTypeParameters();
                            Type[] genericParameterTypes = methodM1742.getGenericParameterTypes();
                            Type genericReturnType = methodM1742.getGenericReturnType();
                            Type[] genericExceptionTypes = methodM1742.getGenericExceptionTypes();
                            StringBuilder sb4 = new StringBuilder();
                            if (typeParameters2.length > 0) {
                                sb4.append("<");
                                int length2 = typeParameters2.length;
                                int i5 = 0;
                                while (i5 < length2) {
                                    TypeVariable<Method> typeVariable2 = typeParameters2[i5];
                                    TypeVariable<Method>[] typeVariableArr2 = typeParameters2;
                                    sb4.append(typeVariable2.getName());
                                    Type[] bounds = typeVariable2.getBounds();
                                    int i6 = length2;
                                    for (Type type2 : bounds) {
                                        sb4.append(":");
                                        sb4.append(m416(type2));
                                    }
                                    i5++;
                                    length2 = i6;
                                    typeParameters2 = typeVariableArr2;
                                }
                                sb4.append(">");
                            }
                            sb4.append("(");
                            for (Type type3 : genericParameterTypes) {
                                sb4.append(m416(type3));
                            }
                            sb4.append(")");
                            sb4.append(m416(genericReturnType));
                            for (Type type4 : genericExceptionTypes) {
                                sb4.append("^");
                                sb4.append(m416(type4));
                            }
                            String string2 = sb4.toString();
                            String[] strArr2 = new String[exceptionTypes.length];
                            for (int i7 = 0; i7 < exceptionTypes.length; i7++) {
                                strArr2[i7] = C3449.m4978(exceptionTypes[i7]);
                            }
                            C1983 c1983M21310 = c0712.m2139(1, name, string, string2, strArr2);
                            C0711 c0713 = c0712;
                            c1983M21310.m3847(25, 0);
                            c1983M21310.m3836(180, strReplace, "bshLambda", C3449.m4977(AbstractC0496.class));
                            c1983M21310.m3843(Integer.valueOf(parameters.length));
                            c1983M21310.m3846(189, "java/lang/Object");
                            int i8 = 0;
                            int i9 = 1;
                            while (true) {
                                int length3 = parameters.length;
                                Parameter[] parameterArr = parameters;
                                c0711 = c0713;
                                cls3 = cls13;
                                cls4 = Float.TYPE;
                                str = strM4978;
                                cls5 = Integer.TYPE;
                                clsArr = exceptionTypes;
                                cls6 = Short.TYPE;
                                cls7 = Byte.TYPE;
                                cls8 = Character.TYPE;
                                cls9 = Double.TYPE;
                                cls10 = Long.TYPE;
                                if (i8 >= length3) {
                                    break;
                                }
                                Class<?> type5 = parameterArr[i8].getType();
                                int i10 = i8;
                                c1983M21310.m3839(89);
                                c1983M21310.m3843(Integer.valueOf(i10));
                                if (type5 == cls8) {
                                    c1983M21310.m3847(21, i9);
                                    c1983M21310.m3845(184, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;");
                                } else if (type5 == cls12) {
                                    c1983M21310.m3847(21, i9);
                                    c1983M21310.m3845(184, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;");
                                } else if (type5 == cls7) {
                                    c1983M21310.m3847(21, i9);
                                    c1983M21310.m3845(184, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;");
                                } else if (type5 == cls6) {
                                    c1983M21310.m3847(21, i9);
                                    c1983M21310.m3845(184, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;");
                                } else if (type5 == cls5) {
                                    c1983M21310.m3847(21, i9);
                                    c1983M21310.m3845(184, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;");
                                } else if (type5 == cls10) {
                                    c1983M21310.m3847(22, i9);
                                    c1983M21310.m3845(184, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;");
                                } else {
                                    if (type5 == cls4) {
                                        c1983M21310.m3847(23, i9);
                                        c1983M21310.m3845(184, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;");
                                    } else {
                                        cls11 = cls9;
                                        if (type5 == cls11) {
                                            c1983M21310.m3847(24, i9);
                                            c1983M21310.m3845(184, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;");
                                        } else {
                                            c1983M21310.m3847(25, i9);
                                        }
                                    }
                                    c1983M21310.m3839(83);
                                    if (true) {
                                        i2 = 2;
                                    } else {
                                        i2 = 1;
                                    }
                                    i9 += 2;
                                    i8 = i10 + 1;
                                    parameters = parameterArr;
                                    c0713 = c0711;
                                    cls13 = cls3;
                                    strM4978 = str;
                                    exceptionTypes = clsArr;
                                }
                                cls11 = cls9;
                                c1983M21310.m3839(83);
                                if (type5 != cls10) {
                                    i2 = 2;
                                } else {
                                    i2 = 2;
                                }
                                i9 += 2;
                                i8 = i10 + 1;
                                parameters = parameterArr;
                                c0713 = c0711;
                                cls13 = cls3;
                                strM4978 = str;
                                exceptionTypes = clsArr;
                            }
                            c1983M21310.m3843(Integer.valueOf(clsArr.length));
                            c1983M21310.m3846(189, "java/lang/Class");
                            int i11 = 0;
                            while (i11 < clsArr.length) {
                                Class<?> cls15 = clsArr[i11];
                                int i12 = i11;
                                c1983M21310.m3839(89);
                                c1983M21310.m3843(Integer.valueOf(i12));
                                c1983M21310.m3843(C3449.m4980(cls15));
                                c1983M21310.m3839(83);
                                i11 = i12 + 1;
                            }
                            Class<?> returnType = methodM1742.getReturnType();
                            Class<?> clsBoxType = returnType.isPrimitive() ? Primitive.boxType(returnType) : returnType;
                            if (returnType.isPrimitive()) {
                                c1983M21310.m3836(178, C3449.m4978(clsBoxType), "TYPE", "Ljava/lang/Class;");
                            } else {
                                c1983M21310.m3843(C3449.m4980(returnType));
                            }
                            c1983M21310.m3845(182, str, "invoke", "([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;");
                            c1983M21310.m3846(192, C3449.m4978(clsBoxType));
                            if (returnType == cls3) {
                                c1983M21310.m3839(87);
                                c1983M21310.m3839(177);
                            } else if (returnType == cls12) {
                                c1983M21310.m3845(182, "java/lang/Boolean", "booleanValue", "()Z");
                                c1983M21310.m3839(172);
                            } else if (returnType == cls8) {
                                c1983M21310.m3845(182, "java/lang/Character", "charValue", "()C");
                                c1983M21310.m3839(172);
                            } else if (returnType == cls7) {
                                c1983M21310.m3845(182, "java/lang/Byte", "byteValue", "()B");
                                c1983M21310.m3839(172);
                            } else if (returnType == cls6) {
                                c1983M21310.m3845(182, "java/lang/Short", "shortValue", "()S");
                                c1983M21310.m3839(172);
                            } else if (returnType == cls5) {
                                c1983M21310.m3845(182, "java/lang/Integer", "intValue", "()I");
                                c1983M21310.m3839(172);
                            } else if (returnType == cls10) {
                                c1983M21310.m3845(182, "java/lang/Long", "longValue", "()J");
                                c1983M21310.m3839(173);
                            } else if (returnType == cls4) {
                                c1983M21310.m3845(182, "java/lang/Float", "floatValue", "()F");
                                c1983M21310.m3839(174);
                            } else if (returnType == cls9) {
                                c1983M21310.m3845(182, "java/lang/Double", "doubleValue", "()D");
                                c1983M21310.m3839(175);
                            } else {
                                c1983M21310.m3839(176);
                            }
                            c1983M21310.m3844();
                            byte[] bArrM2136 = c0711.m2136();
                            
                            clsM1744 = AbstractC0499.m1744(str2, bArrM2136);
                            map.put(cls, clsM1744);
                        }
                        try {
                            return clsM1744.getConstructors()[0].newInstance(abstractC0496);
                        } catch (Throwable th) {
                            throw new C3523("Can't create a instance for the generate class for the BshLambda: " + th.getMessage(), th);
                        }
                    }
                } else if (cls.isAssignableFrom(cls2)) {
                    if (!z) {
                        if (AbstractC0009.m401(cls) && !Proxy.isProxyClass(cls2)) {
                            return AbstractC0009.m381(objWrap, cls.getSimpleName());
                        }
                        return objWrap;
                    }
                } else if (!This.class.isInstance(objWrap) || ((This) objWrap).getNameSpace().f511 != cls) {
                    if (!cls.isInterface() || !This.class.isAssignableFrom(cls2)) {
                        if (!Primitive.isWrapperType(cls) || !Primitive.isWrapperType(cls2)) {
                            if (!z) {
                                throw m413(AbstractC2202.m4018(cls), AbstractC2202.m4018(cls2), objWrap, i);
                            }
                            return f524;
                        }
                        if (!z) {
                            return Primitive.castWrapper(cls, objWrap);
                        }
                    } else if (!z) {
                        return ((This) objWrap).getInterface((Class<?>) cls);
                    }
                }
            } else if (!z) {
                if (Collection.class.isAssignableFrom(cls)) {
                    if (List.class.isAssignableFrom(cls) || Queue.class == cls) {
                        if (cls.isAssignableFrom(ArrayList.class)) {
                            return new ArrayList(Arrays.asList((Object[]) m414(0, Object.class, objWrap)));
                        }
                        if (cls.isAssignableFrom(LinkedList.class)) {
                            return new LinkedList(Arrays.asList((Object[]) m414(0, Object.class, objWrap)));
                        }
                    } else {
                        if (cls.isAssignableFrom(ArrayDeque.class)) {
                            return new ArrayDeque(Arrays.asList((Object[]) m414(0, Object.class, objWrap)));
                        }
                        if (cls.isAssignableFrom(LinkedHashSet.class)) {
                            return new LinkedHashSet(Arrays.asList((Object[]) m414(0, Object.class, objWrap)));
                        }
                    }
                }
                Class clsM412 = m412(cls2);
                if (Map.class.isAssignableFrom(cls)) {
                    if (Map.Entry.class.isAssignableFrom(clsM412)) {
                        Map.Entry[] entryArr = (Map.Entry[]) objWrap;
                        LinkedHashMap linkedHashMap = new LinkedHashMap(entryArr.length);
                        int length4 = entryArr.length;
                        while (i3 < length4) {
                            Map.Entry entry = entryArr[i3];
                            linkedHashMap.put(entry.getKey(), entry.getValue());
                            i3++;
                        }
                        return linkedHashMap;
                    }
                    if (cls.isAssignableFrom(LinkedHashMap.class)) {
                        int length5 = Array.getLength(objWrap);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap((int) Math.ceil((((double) length5) + 0.0d) / 2.0d));
                        while (i3 < length5) {
                            int i13 = i3 + 1;
                            linkedHashMap2.put(Array.get(objWrap, i3), i13 < length5 ? Array.get(objWrap, i13) : null);
                            i3 += 2;
                        }
                        return linkedHashMap2;
                    }
                }
                int[] iArrM3967 = AbstractC2201.m3967(objWrap);
                int i14 = iArrM3967[0];
                if (i14 == 0) {
                    return Array.newInstance((Class<?>) cls, iArrM3967);
                }
                if (Object.class != clsM412) {
                    d = 2.0d;
                } else {
                    d = 2.0d;
                    Class clsM418 = null;
                    for (int i15 = 0; i15 < i14; i15++) {
                        clsM418 = m418(clsM418, m419(Array.get(objWrap, 0), false));
                        if (Object.class == clsM418) {
                            break;
                        }
                    }
                    if (clsM418 != null && clsM418 != Object.class) {
                        clsM412 = clsM418;
                    }
                }
                if (!Map.Entry.class.isAssignableFrom(cls)) {
                    Class clsM413 = m412(cls);
                    Object objNewInstance = Array.newInstance((Class<?>) clsM413, iArrM3967);
                    AbstractC2201.m3966(clsM413, objNewInstance, objWrap);
                    return objNewInstance;
                }
                if (Map.Entry.class.isAssignableFrom(clsM412)) {
                    if (C3468.class != clsM412) {
                        return objWrap;
                    }
                    Map.Entry[] entryArr2 = new Map.Entry[Array.getLength(objWrap)];
                    AbstractC2201.m3966(Map.Entry.class, entryArr2, objWrap);
                    return entryArr2;
                }
                if (i14 == 1) {
                    return new C3468(Array.get(objWrap, 0), null);
                }
                if (i14 == 2) {
                    return new C3468(Array.get(objWrap, 0), Array.get(objWrap, 1));
                }
                Map.Entry[] entryArr3 = new Map.Entry[(int) Math.ceil((((double) i14) + 0.0d) / 2.0)];
                int i16 = 0;
                while (i3 < i14) {
                    int i17 = i16 + 1;
                    int i18 = i3 + 1;
                    entryArr3[i16] = new C3468(Array.get(objWrap, i3), i18 < i14 ? Array.get(objWrap, i18) : null);
                    i3 += 2;
                    i16 = i17;
                }
                return entryArr3;
            }
            return f523;
        }
    }

    public static String m416(Type type) {
        if (type instanceof Class) {
            return C3449.m4977((Class) type);
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            StringBuilder sb = new StringBuilder();
            sb.append("L" + C3449.m4978((Class) parameterizedType.getRawType()));
            sb.append("<");
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                sb.append(m416(type2));
            }
            sb.append(">;");
            return sb.toString();
        }
        if (type instanceof TypeVariable) {
            return "T" + ((TypeVariable) type).getName() + ";";
        }
        if (!(type instanceof WildcardType)) {
            StringBuilder sb2 = new StringBuilder("Can't get the signature of this type because its Class is unknown: ");
            sb2.append(type != null ? type.getClass() : null);
            throw new IllegalArgumentException(sb2.toString());
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        if (lowerBounds.length > 0) {
            return "-" + C3449.m4977((Class) lowerBounds[0]);
        }
        return "+" + C3449.m4977((Class) wildcardType.getUpperBounds()[0]);
    }

    public static String m417(String str) {
        int iLastIndexOf = str.lastIndexOf("$");
        return iLastIndexOf == -1 ? str : str.substring(iLastIndexOf + 1);
    }

    public static Class m418(Class cls, Class cls2) {
        if (cls != null) {
            if (cls2 == null || cls.isAssignableFrom(cls2)) {
                return cls;
            }
            Map map = f522;
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

    public static Class m419(Object obj, boolean z) {
        if (obj == null || Primitive.NULL == obj) {
            return null;
        }
        if (!(obj instanceof Primitive) || z) {
            return obj instanceof AbstractC0496 ? ((AbstractC0496) obj).f2138 : Primitive.unwrap(obj).getClass();
        }
        return ((Primitive) obj).getType();
    }

    public static Class[] m420(Object[] objArr) {
        if (objArr == null) {
            return AbstractC0009.f517;
        }
        Class[] clsArr = new Class[objArr.length];
        for (int i = 0; i < objArr.length; i++) {
            clsArr[i] = m419(objArr[i], false);
        }
        return clsArr;
    }

    public static boolean m421(Class cls, Class cls2, int i) {
        if (m427(cls2) && AbstractC0496.m1741(cls, cls2, i)) {
            return true;
        }
        if (i == 1) {
            return m428(cls2, cls);
        }
        if (i == 2) {
            return m429(cls2, cls);
        }
        if (i == 3) {
            return false;
        }
        if (i == 4) {
            return m424(cls2, cls);
        }
        throw new C1669("bad case");
    }

    public static boolean m422(Class cls, Type type, int i) {
        if (type instanceof Class) {
            return m421(cls, (Class) type, i);
        }
        if (type instanceof ParameterizedType) {
            return m422(cls, ((ParameterizedType) type).getRawType(), i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m422(cls, type2, i)) {
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
            if (!m422(cls, type3, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m423(type4, cls, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m423(Type type, Class cls, int i) {
        if (type instanceof Class) {
            return m423(type, cls, i);
        }
        if (type instanceof ParameterizedType) {
            return m423(((ParameterizedType) type).getRawType(), cls, i);
        }
        if (type instanceof TypeVariable) {
            for (Type type2 : ((TypeVariable) type).getBounds()) {
                if (!m423(type2, cls, i)) {
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
            if (!m423(type3, cls, i)) {
                return false;
            }
        }
        for (Type type4 : wildcardType.getLowerBounds()) {
            if (!m422(cls, type4, i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m424(Class cls, Class cls2) {
        try {
            return m415(cls, cls2, null, 1, true) == f523;
        } catch (C3523 e) {
            throw new C1669("err in cast check: " + e, e);
        }
    }

    public static boolean m425(Class cls) {
        return Collection.class.isAssignableFrom(cls) || Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls);
    }

    public static boolean m426(Object obj) {
        return (obj instanceof Float) || (obj instanceof Double) || (obj instanceof BigDecimal);
    }

    public static boolean m427(Class cls) {
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

    public static boolean m428(Class cls, Class cls2) {
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
            Map map = f522;
            return map.containsKey(cls2) && map.containsKey(cls) && ((Integer) map.get(cls2)).intValue() < ((Integer) map.get(cls)).intValue();
        }
        if (((cls == BigInteger.class || cls == BigDecimal.class) && m430(cls2)) || cls.isAssignableFrom(cls2)) {
            return true;
        }
        return false;
    }

    public static boolean m429(Class cls, Class cls2) {
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
            return m428(cls, cls2);
        }
        return true;
    }

    public static boolean m430(Class cls) {
        if (Number.class.isAssignableFrom(cls.isPrimitive() ? Primitive.boxType(cls) : cls)) {
            return true;
        }
        if (cls.isPrimitive()) {
            cls = Primitive.boxType(cls);
        }
        return Character.class.isAssignableFrom(cls);
    }

    public static boolean m431(Object obj) {
        return (obj instanceof Number) || (obj instanceof Character);
    }

    public static boolean m432(Class cls) {
        return cls.isArray() && Map.Entry.class.isAssignableFrom(cls.getComponentType());
    }

    public static boolean m433(Class[] clsArr, Class[] clsArr2, int i) {
        if (i != 3 && clsArr.length != clsArr2.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m421(clsArr[i2], clsArr2[i2], i)) {
                return false;
            }
        }
        return true;
    }

    public static boolean m434(Class[] clsArr, Type[] typeArr, int i) {
        if (i != 3 && clsArr.length != typeArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < clsArr.length; i2++) {
            if (!m422(clsArr[i2], typeArr[i2], i)) {
                return false;
            }
        }
        return true;
    }

    public static String m435(Class cls) {
        if (cls == null) {
            return "null";
        }
        if (!cls.isArray()) {
            return cls.getName();
        }
        return m435(cls.getComponentType()) + "[]";
    }
}
