package com.alibaba.fastjson2.util;

import com.alibaba.fastjson2.codec.BeanInfo;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p000.AbstractC0730;
import p000.AbstractC0981;
import p000.AbstractC1438;
import p000.AbstractC1861;
import p000.AbstractC2519;
import p000.C0597;
import p000.C0731;
import p000.C0886;
import p000.C1664;
import p000.InterfaceC1740;
import p000.InterfaceC1967;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public class KotlinUtils {
    public static final int STATE;
    private static volatile Map<Class, String[]> kotlinIgnores;
    private static volatile boolean kotlinIgnores_error;
    private static volatile boolean kotlin_class_klass_error;
    private static volatile boolean kotlin_error;
    private static volatile Constructor kotlin_kclass_constructor;
    private static volatile Method kotlin_kclass_getConstructors;
    private static volatile Method kotlin_kfunction_getParameters;
    private static volatile Method kotlin_kparameter_getName;
    private static volatile Class kotlin_metadata;
    private static volatile boolean kotlin_metadata_error;

    static {
        int i;
        try {
            Class.forName("kotlin.reflect.jvm.ReflectJvmMapping");
            i = 2;
        } catch (Throwable unused) {
            i = 1;
        }
        STATE = i;
    }

    private KotlinUtils() {
        throw new IllegalStateException();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:18:0x0037  */
    public static void getConstructor(Class<?> cls, BeanInfo beanInfo) {
        String[] strArr = beanInfo.createParameterNames;
        Constructor constructor = null;
        int i = 0;
        for (Constructor constructor2 : BeanUtils.getConstructor(cls)) {
            int parameterCount = constructor2.getParameterCount();
            if (strArr == null || parameterCount == strArr.length) {
                if (parameterCount > 2) {
                    Class<?>[] parameterTypes = constructor2.getParameterTypes();
                    if (parameterTypes[parameterCount - 2] == Integer.TYPE && parameterTypes[parameterCount - 1] == AbstractC0981.class) {
                        beanInfo.markerConstructor = constructor2;
                    } else if (constructor != null || i < parameterCount) {
                        constructor = constructor2;
                        i = parameterCount;
                    }
                } else if (constructor != null) {
                    constructor = constructor2;
                    i = parameterCount;
                } else {
                    constructor = constructor2;
                    i = parameterCount;
                }
            }
        }
        if (i != 0 && STATE == 2) {
            try {
                AbstractC2519.m4527(cls);
                throw new C0886();
            } catch (Throwable unused) {
            }
        }
        beanInfo.creatorConstructor = constructor;
    }

    public static String[] getKoltinConstructorParameters(Class cls) {
        if (kotlin_kclass_constructor == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_constructor = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getConstructor(Class.class);
            } catch (Throwable unused) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kclass_constructor == null) {
            return null;
        }
        if (kotlin_kclass_getConstructors == null && !kotlin_class_klass_error) {
            try {
                kotlin_kclass_getConstructors = Class.forName("kotlin.reflect.jvm.internal.KClassImpl").getMethod("getConstructors", null);
            } catch (Throwable unused2) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kfunction_getParameters == null && !kotlin_class_klass_error) {
            try {
                kotlin_kfunction_getParameters = AbstractC1438.class.getMethod("getParameters", null);
            } catch (Throwable unused3) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_kparameter_getName == null && !kotlin_class_klass_error) {
            try {
                kotlin_kparameter_getName = InterfaceC1740.class.getMethod("getName", null);
            } catch (Throwable unused4) {
                kotlin_class_klass_error = true;
            }
        }
        if (kotlin_error) {
            return null;
        }
        try {
            Object obj = null;
            for (Object obj2 : (Iterable) kotlin_kclass_getConstructors.invoke(kotlin_kclass_constructor.newInstance(cls), null)) {
                List list = (List) kotlin_kfunction_getParameters.invoke(obj2, null);
                if (obj == null || list.size() != 0) {
                    obj = obj2;
                }
            }
            if (obj == null) {
                return null;
            }
            List list2 = (List) kotlin_kfunction_getParameters.invoke(obj, null);
            String[] strArr = new String[list2.size()];
            for (int i = 0; i < list2.size(); i++) {
                strArr[i] = (String) kotlin_kparameter_getName.invoke(list2.get(i), null);
            }
            return strArr;
        } catch (Throwable th) {
            th.printStackTrace();
            kotlin_error = true;
            return null;
        }
    }

    public static Constructor getKotlinConstructor(Constructor[] constructorArr) {
        return getKotlinConstructor(constructorArr, null);
    }

    public static boolean isKotlin(Class cls) {
        if (kotlin_metadata == null && !kotlin_metadata_error) {
            try {
                kotlin_metadata = InterfaceC1967.class;
            } catch (Throwable unused) {
                kotlin_metadata_error = true;
            }
        }
        return kotlin_metadata != null && cls.isAnnotationPresent(kotlin_metadata);
    }

    public static boolean isKotlinIgnore(Class cls, String str) {
        if (kotlinIgnores == null && !kotlinIgnores_error) {
            try {
                HashMap map = new HashMap();
                int i = C0597.f2410;
                map.put(C0597.class, new String[]{"getEndInclusive", "isEmpty"});
                C1664 c1664 = C1664.f5621;
                map.put(C1664.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(AbstractC1861.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(C0731.class, new String[]{"getEndInclusive", "isEmpty"});
                map.put(AbstractC0730.class, new String[]{"getEndInclusive", "isEmpty"});
                kotlinIgnores = map;
            } catch (Throwable unused) {
                kotlinIgnores_error = true;
            }
        }
        if (kotlinIgnores == null) {
            return false;
        }
        String[] strArr = kotlinIgnores.get(cls);
        return strArr != null && Arrays.binarySearch(strArr, str) >= 0;
    }

    public static Constructor getKotlinConstructor(Constructor[] constructorArr, String[] strArr) {
        Constructor constructor = null;
        for (Constructor constructor2 : constructorArr) {
            Class<?>[] parameterTypes = constructor2.getParameterTypes();
            if ((strArr == null || parameterTypes.length == strArr.length) && ((parameterTypes.length <= 0 || !"ᛱᛲᛳᛴᛵᛶᛷᤝᤞᲇᲈᲁᛸᲀ".equals(parameterTypes[parameterTypes.length - 1].getName())) && (constructor == null || constructor.getParameterTypes().length < parameterTypes.length))) {
                constructor = constructor2;
            }
        }
        return constructor;
    }
}
