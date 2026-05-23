package bsh;

import bsh.This;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import p000.AbstractC1194;
import p000.AbstractC1672;
import p000.AbstractC2202;
import p000.AbstractC2668;
import p000.AbstractC2707;
import p000.AbstractC2784;
import p000.C0335;
import p000.C0481;
import p000.C0482;
import p000.C0484;
import p000.C0501;
import p000.C0550;
import p000.C0561;
import p000.C1229;
import p000.C1669;
import p000.C1751;
import p000.C1867;
import p000.C2000;
import p000.C2255;
import p000.C2518;
import p000.C2895;
import p000.C3523;
import p000.C3524;
import p000.C3532;
import p000.InterfaceC2225;
import p000.RunnableC1668;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0009 {

    public static final Object[] f516 = new Object[0];

    public static final Class[] f517 = new Class[0];

    public static final WeakHashMap f518 = new WeakHashMap();

    public static final Pattern f519 = Pattern.compile("[^\\.]+|bsh\\..*");

    public static final Pattern f520;

    public static final WeakHashMap f521;

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f520 = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C0335(8)).collect(Collectors.joining("|", "(?:", ").*")));
        f521 = new WeakHashMap();
    }

    public static String m376(String str, String str2) {
        WeakHashMap weakHashMap = f518;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM4753 = AbstractC2784.m4753(str);
        sbM4753.append((String) weakHashMap.get(str2));
        return sbM4753.toString();
    }

    public static Object m377(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new C2518(AbstractC1194.m2782(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM420 = AbstractC0010.m420(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM420 = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM420)).toArray(new C0484(9));
        }
        RunnableC1668.m3389("Looking for most specific constructor: ", cls);
        AbstractC1672 abstractC1672M1717 = ((C0481) C0482.f2092.m3641(cls)).m1717(cls.getName(), clsArrM420);
        if (abstractC1672M1717 == null || !(objArr.length == abstractC1672M1717.mo2889() || abstractC1672M1717.mo2892() || abstractC1672M1717.mo2347())) {
            if (clsArrM420.length == 0) {
                throw new C2518(AbstractC1194.m2782(cls, "Can't find default constructor for: "));
            }
            throw new C2518("Can't find constructor: " + AbstractC2202.m4011(cls.getName(), clsArrM420) + " in class: " + cls.getName());
        }
        try {
            return abstractC1672M1717.mo3012(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new C2518("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    public static int m378(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i, "  ", ":");
            sbM2787.append(((C0501) list.get(i)).toString());
            sbM2787.append(" ");
            sbM2787.append(((C0501) list.get(i)).getClass().getName());
            RunnableC1668.m3389(sbM2787.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo1751 = ((C0501) it.next()).mo1751();
            if (clsArr.length == clsArrMo1751.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo1751);
            }
            i2++;
        }
        int iM380 = m380(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM380 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM380)).intValue();
            RunnableC1668.m3389(" remap: " + arrayList2);
            RunnableC1668.m3389(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            C0501 c0501 = (C0501) it2.next();
            Class[] clsArrMo1752 = c0501.mo1751();
            AbstractC1672 abstractC1672 = c0501.f2156;
            if ((abstractC1672 == null ? c0501.f2159 : abstractC1672.mo2892()) && clsArr.length >= clsArrMo1752.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo1752, 0, clsArr2, 0, clsArrMo1752.length - 1);
                Arrays.fill(clsArr2, clsArrMo1752.length - 1, clsArr.length, clsArrMo1752[clsArrMo1752.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM381 = m380(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM381 < 0) {
            return iM381;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM381)).intValue();
        RunnableC1668.m3389(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC1668.m3389(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    public static int m379(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM2787 = AbstractC1194.m2787(i, "  ", "=");
            sbM2787.append(((AbstractC1672) list.get(i)).f5643);
            RunnableC1668.m3389(sbM2787.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo2890 = ((AbstractC1672) it.next()).mo2890();
            if (clsArr.length == clsArrMo2890.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo2890);
            }
            i2++;
        }
        int iM380 = m380(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM380 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM380)).intValue();
            RunnableC1668.m3389(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            RunnableC1668.m3389(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC1672 abstractC1672 = (AbstractC1672) it2.next();
            Class[] clsArrMo2891 = abstractC1672.mo2890();
            if (abstractC1672.mo2892() && clsArr.length >= clsArrMo2891.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo2891, 0, clsArr2, 0, clsArrMo2891.length - 1);
                Arrays.fill(clsArr2, clsArrMo2891.length - 1, clsArr.length, abstractC1672.mo2891());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM381 = m380(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM381 >= 0) {
            iM381 = ((Integer) arrayList2.get(iM381)).intValue();
        }
        RunnableC1668.m3389(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC1668.m3389(" match (varargs) =" + iM381);
        return iM381;
    }

    public static int m380(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC0010.m410(clsArr4, clsArr3)) && AbstractC0010.m433(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC0010.m410(clsArr, clsArr4) || (AbstractC0010.m433(clsArr4, clsArr3, 1) && !AbstractC0010.m410(clsArr, clsArr3)))) {
                    i2 = i3;
                    clsArr3 = clsArr4;
                }
            }
            if (clsArr3 != null) {
                return i2;
            }
            i++;
        }
    }

    public static This m381(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m391(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            throw new C1669("Generated class: Error getting This " + e, e);
        }
    }

    public static C2000 m382(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            C0007 c0007M394 = m394(cls);
            C3532 c3532M357 = null;
            if (c0007M394 != null) {
                try {
                    c3532M357 = c0007M394.m357(string, false);
                } catch (Exception unused) {
                }
            }
            return (C2000) c3532M357.m5124();
        } catch (Exception unused2) {
            return new C2000(cls.isInterface() ? 1 : 0);
        }
    }

    public static This m383(Class cls, String str) {
        try {
            return (This) m386(cls, null, This.Keys.BSHSTATIC + str, true);
        } catch (Exception e) {
            throw new C1669("Unable to get class static space: " + e, e);
        }
    }

    public static C0501[] m384(Class cls) {
        if (!m401(cls)) {
            return new C0501[0];
        }
        if (cls.isInterface()) {
            C0007 c0007M394 = m394(cls);
            return c0007M394 == null ? new C0501[0] : c0007M394.m351();
        }
        C0007 c0007M395 = m395(m390(cls));
        return c0007M395 == null ? new C0501[0] : c0007M395.m351();
    }

    public static Map.Entry m385(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    public static Object m386(Class cls, Object obj, String str, boolean z) throws C3524 {
        try {
            return m404(cls, str, z).mo3012(obj, new Object[0]);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof C1669) {
                throw ((C1669) e.getCause());
            }
            if (!(e.getCause() instanceof C3523)) {
                throw new C2518(AbstractC2784.m4757("Can't access field: ", str), e.getCause());
            }
            Throwable cause = e.getCause();
            throw new C3524(cause.getMessage(), cause);
        } catch (C2518 e2) {
            C0007 c0007M394 = m394(cls);
            if (m401(cls) && c0007M394 != null && c0007M394.f508) {
                if (z) {
                    C3532 c3532M357 = c0007M394.m357(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objM341 = (c3532M357 == null || (c3532M357.m5125("private") && !C0561.m1955())) ? primitive : C0007.m341(c3532M357);
                    if (primitive != objM341) {
                        return objM341;
                    }
                } else {
                    C0007 c0007M395 = m395(obj);
                    if (c0007M395 != null) {
                        C3532 c3532M358 = c0007M395.m357(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objM342 = (c3532M358 == null || (c3532M358.m5125("private") && !C0561.m1955())) ? primitive2 : C0007.m341(c3532M358);
                        if (primitive2 != objM342) {
                            return objM342;
                        }
                    }
                }
            }
            throw e2;
        }
    }

    public static C1751 m387(Object obj, String str) {
        C3532 c3532M357;
        if (obj instanceof This) {
            return new C1751(((This) obj).namespace, str, false);
        }
        try {
            return new C1751(m404(obj.getClass(), str, false), obj);
        } catch (C2518 e) {
            C0007 c0007M395 = m395(obj);
            if (m401(obj.getClass()) && c0007M395 != null && c0007M395.f508 && (c3532M357 = c0007M395.m357(str, true)) != null && (!c3532M357.m5125("private") || C0561.m1955())) {
                return new C1751(c0007M395, str);
            }
            if (m397(obj.getClass(), str)) {
                return new C1751(obj, str);
            }
            throw e;
        }
    }

    public static C1751 m388(Class cls, String str) {
        C3532 c3532M357;
        try {
            return new C1751(m404(cls, str, true));
        } catch (C2518 e) {
            C0007 c0007M394 = m394(cls);
            if (m401(cls) && c0007M394 != null && c0007M394.f508 && (c3532M357 = c0007M394.m357(str, true)) != null && (!c3532M357.m5125("private") || C0561.m1955())) {
                return new C1751(c0007M394, str);
            }
            if (m397(cls, str)) {
                return new C1751(cls, str);
            }
            throw e;
        }
    }

    public static C0501 m389(C0007 c0007, String str, Class[] clsArr, boolean z) {
        if (c0007 == null) {
            return null;
        }
        try {
            return c0007.m350(str, clsArr, z);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object m390(Class cls) {
        WeakHashMap weakHashMap = f521;
        if (weakHashMap.containsKey(cls)) {
            return weakHashMap.get(cls);
        }
        try {
            weakHashMap.put(cls, cls.getConstructor(null).newInstance(null));
        } catch (IllegalArgumentException | ReflectiveOperationException | SecurityException unused) {
            weakHashMap.put(cls, null);
        }
        return weakHashMap.get(cls);
    }

    public static Object m391(Object obj, String str) throws C3524 {
        if (obj instanceof This) {
            return ((This) obj).namespace.m356(str, true);
        }
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC1194.m2785("Attempt to access field '", str, "' on null value"));
            throw new C3524(nullPointerException.getMessage(), nullPointerException);
        }
        try {
            return m386(obj.getClass(), obj, str, false);
        } catch (C2518 e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC0010.f522;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC0010.m432(cls)) {
                C1867 c1867 = C0482.f2092;
                if (!((C0481) c1867.m3641(cls)).f2090.containsKey(str) || ((C0481) c1867.m3641(cls)).m1716(str) == null) {
                    throw e;
                }
            }
            return m393(obj, str);
        }
    }

    public static Object m392(Object obj, Object obj2) {
        Map map = AbstractC0010.f522;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0010.m432(cls)) {
            Map.Entry entryM385 = m385(obj2, (Map.Entry[]) obj);
            return entryM385 != null ? entryM385.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1672 abstractC1672M1716 = ((C0481) C0482.f2092.m3641(cls)).m1716(obj2.toString());
        if (abstractC1672M1716 == null) {
            RunnableC1668.m3389("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC1672M1716.mo3012(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            RunnableC1668.m3389("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    public static Object m393(Object obj, String str) {
        Map map = AbstractC0010.f522;
        if (obj instanceof Map.Entry) {
            
            switch (str) {
                case "key":
                    return ((Map.Entry) obj).getKey();
                case "val":
                case "value":
                    return ((Map.Entry) obj).getValue();
            }
        }
        return m392(obj, str);
    }

    public static C0007 m394(Class cls) {
        if (!m401(cls)) {
            return null;
        }
        try {
            return m383(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof C3524) {
                throw new C1669(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    public static C0007 m395(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m401(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m394(cls.getInterfaces()[0]) : m381(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    public static C3532[] m396(C0007 c0007) {
        String[] strArr = c0007 == null ? new String[0] : (String[]) Stream.of(c0007.f495.keySet().stream().toArray(new C0484(5))).filter(new C0335(7)).toArray(new C0484(11));
        return (c0007 == null || strArr == null) ? new C3532[0] : (C3532[]) Stream.of((Object[]) strArr).map(new C2255(4, c0007)).filter(new C0335(5)).toArray(new C0484(10));
    }

    public static boolean m397(Class cls, String str) {
        Map map = AbstractC0010.f522;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC0010.m432(cls)) {
            return true;
        }
        C1867 c1867 = C0482.f2092;
        return ((C0481) c1867.m3641(cls)).f2090.containsKey(str) && ((C0481) c1867.m3641(cls)).m1718(str) != null;
    }

    public static Object m398(Class cls, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, InterfaceC2225 interfaceC2225) throws C3523 {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = runnableC1668;
        objArr2[1] = c0550;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m400(runnableC1668.f5634.m346(), cls, "invoke", objArr2, interfaceC2225);
        } catch (InvocationTargetException e) {
            throw new C3523("Error in compiled command: " + e.getCause(), e);
        } catch (C2518 e2) {
            throw new C3523("Error invoking compiled command: " + e2, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v2 */
    public static Object m399(Object obj, String str, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, AbstractC2707 abstractC2707) throws C1229 {
        Object[] objArr2;
        InterfaceC2225 interfaceC2225;
        C3523 c3523;
        C0550 c0551;
        Object obj2;
        String str2;
        Object[] objArr3;
        C0550 c0552;
        AbstractC2707 abstractC2708;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, runnableC1668, c0550, abstractC2707, false);
        }
        C0482 c0482M346 = runnableC1668.f5634.m346();
        boolean z = obj instanceof Primitive;
        try {
            Class<?> type = obj.getClass();
            if (z) {
                try {
                    if (str.equals("equals")) {
                        return Boolean.valueOf(((Primitive) obj).equals(objArr[0]));
                    }
                    if (obj != Primitive.NULL && obj != Primitive.VOID) {
                        type = ((Primitive) obj).getType();
                        obj = Primitive.unwrap(obj);
                    }
                    if (str.equals("getType") || str.equals("getClass")) {
                        return obj == Primitive.VOID ? ((Primitive) obj).getType() : type;
                    }
                } catch (C3523 e) {
                    c3523 = e;
                    c0551 = c0550;
                    interfaceC2225 = abstractC2707;
                    throw c3523.mo4643(interfaceC2225, c0551);
                }
            }
            interfaceC2225 = null;
            objArr2 = objArr;
            Object obj3 = obj;
            Class<?> cls = type;
            try {
                AbstractC1672 abstractC1672M405 = m405(c0482M346, cls, obj3, str, objArr2, false);
                obj2 = obj3;
                str2 = str;
                objArr3 = objArr2;
                try {
                    C0007 c0007M395 = m395(obj2);
                    if (c0007M395 != null) {
                        c0007M395.f506 = abstractC2707;
                    }
                    return abstractC1672M405.mo3012(obj2, objArr3);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw m409(e, str2, c0550, abstractC2707);
                } catch (C2518 e3) {
                    e = e3;
                    C2518 c2518 = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new C1229("Attempt to invoke method: " + str2 + "() on undefined", abstractC2707, c0550, c2518);
                        }
                        if (z) {
                            try {
                                if (AbstractC0010.m431(obj2)) {
                                    c0552 = c0550;
                                    abstractC2708 = abstractC2707;
                                    try {
                                        return m403(obj2, type, str2, objArr3, runnableC1668, c0552, abstractC2708);
                                    } catch (C2895 e4) {
                                        e = e4;
                                        throw e;
                                    } catch (C1229 unused) {
                                        throw new C1229("Error in method invocation: " + c2518.getMessage(), abstractC2708, c0552, c2518);
                                    }
                                }
                                try {
                                    return m399(obj2, str2, objArr3, runnableC1668, c0550, abstractC2707);
                                } catch (C2895 e5) {
                                    e = e5;
                                    throw e;
                                } catch (C1229 unused2) {
                                    abstractC2708 = abstractC2707;
                                    c0552 = c0550;
                                    throw new C1229("Error in method invocation: " + c2518.getMessage(), abstractC2708, c0552, c2518);
                                } catch (C3523 e6) {
                                    e = e6;
                                    interfaceC2225 = abstractC2707;
                                    objArr2 = c0550;
                                    c3523 = e;
                                    c0551 = objArr2;
                                    throw c3523.mo4643(interfaceC2225, c0551);
                                }
                            } catch (C2895 e7) {
                                e = e7;
                            } catch (C1229 unused3) {
                                c0552 = c0550;
                                abstractC2708 = abstractC2707;
                                throw new C1229("Error in method invocation: " + c2518.getMessage(), abstractC2708, c0552, c2518);
                            }
                        } else {
                            c0552 = c0550;
                            abstractC2708 = abstractC2707;
                        }
                        throw new C1229("Error in method invocation: " + c2518.getMessage(), abstractC2708, c0552, c2518);
                    } catch (C3523 e8) {
                        e = e8;
                    }
                    c3523 = e;
                    c0551 = objArr2;
                    throw c3523.mo4643(interfaceC2225, c0551);
                }
            } catch (InvocationTargetException e9) {
                e = e9;
                str2 = str;
            } catch (C2518 e10) {
                e = e10;
                type = cls;
                obj2 = obj3;
                str2 = str;
                objArr3 = objArr2;
            }
        } catch (C3523 e11) {
            e = e11;
            objArr2 = c0550;
            interfaceC2225 = abstractC2707;
        }
    }

    public static Object m400(C0482 c0482, Class cls, String str, Object[] objArr, InterfaceC2225 interfaceC2225) {
        RunnableC1668.m3389("invoke static Method");
        C0007 c0007M394 = m394(cls);
        if (c0007M394 != null) {
            c0007M394.f506 = interfaceC2225;
        }
        return m405(c0482, cls, null, str, objArr, true).mo3012(null, objArr);
    }

    public static boolean m401(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    public static void m402(String str, AbstractC1672 abstractC1672, Object[] objArr) {
        if (((Boolean) RunnableC1668.f5629.get()).booleanValue()) {
            RunnableC1668.m3389(str, abstractC1672, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                RunnableC1668.m3389("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    public static Object m403(Object obj, Class cls, String str, Object[] objArr, RunnableC1668 runnableC1668, C0550 c0550, AbstractC2707 abstractC2707) throws C1229 {
        Class<BigInteger> cls2 = AbstractC0010.m426(obj) ? BigDecimal.class : BigInteger.class;
        try {
            Object objM399 = m399(Primitive.castWrapper(cls2, obj), str, objArr, runnableC1668, c0550, abstractC2707);
            return ((objM399 instanceof Primitive) && ((Primitive) objM399).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM399), (Class<?>) cls) : objM399;
        } catch (C2895 e) {
            e.m2864("Method found on " + cls2.getSimpleName() + " but with error");
            throw e;
        } catch (C1229 unused) {
            Class cls3 = AbstractC0010.m426(obj) ? BigInteger.class : BigDecimal.class;
            Object objM3910 = m399(Primitive.castWrapper(cls3, obj), str, objArr, runnableC1668, c0550, abstractC2707);
            return ((objM3910 instanceof Primitive) && ((Primitive) objM3910).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM3910), (Class<?>) cls) : objM3910;
        }
    }

    public static AbstractC1672 m404(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C0481) C0482.f2092.m3641(cls)).f2091;
        AbstractC1672 abstractC1672 = !concurrentHashMap.containsKey(str) ? null : (AbstractC1672) concurrentHashMap.get(str);
        if (abstractC1672 == null) {
            StringBuilder sbM4679 = AbstractC2668.m4679("No such field: ", str, " for class: ");
            sbM4679.append(cls.getName());
            throw new C2518(sbM4679.toString());
        }
        if (!z || abstractC1672.mo2348()) {
            return abstractC1672;
        }
        StringBuilder sbM46710 = AbstractC2668.m4679("Can't reach instance field: ", str, " from static context: ");
        sbM46710.append(cls.getName());
        throw new C3523(sbM46710.toString());
    }

    public static AbstractC1672 m405(C0482 c0482, Class cls, Object obj, String str, Object[] objArr, boolean z) throws C3524 {
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC1194.m2785("Attempt to invoke method ", str, " on null value"));
            throw new C3524(nullPointerException.getMessage(), nullPointerException);
        }
        Class[] clsArrM420 = AbstractC0010.m420(objArr);
        AbstractC1672 abstractC1672M406 = m406(cls, str, clsArrM420, z);
        if (abstractC1672M406 != null) {
            return abstractC1672M406;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC2202.m4011(str, clsArrM420));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new C2518(sb.toString());
    }

    public static AbstractC1672 m406(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            throw new C1669("null class");
        }
        AbstractC1672 abstractC1672M1717 = ((C0481) C0482.f2092.m3641(cls)).m1717(str, clsArr);
        RunnableC1668.m3389("resolved java method: ", abstractC1672M1717, " on class: ", cls);
        if (abstractC1672M1717 == null || !z || abstractC1672M1717.mo2348()) {
            return abstractC1672M1717;
        }
        throw new C3523("Cannot reach instance method: " + AbstractC2202.m4011(abstractC1672M1717.f5644, abstractC1672M1717.mo2890()) + " from static context: " + cls.getName());
    }

    public static Object m407(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC0010.f522;
        if (obj instanceof Map) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            throw new C2518("No such property setter: " + obj2 + " for type: " + AbstractC2202.m4019(obj));
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0010.m432(cls)) {
            return m385(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1672 abstractC1672M1718 = ((C0481) C0482.f2092.m3641(cls)).m1718(obj2.toString());
        if (abstractC1672M1718 != null) {
            try {
                return abstractC1672M1718.mo3012(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new C2518("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        throw new C2518("No such property setter: " + obj2 + " for type: " + AbstractC2202.m4018(cls));
    }

    public static C0501 m408(Class cls, String str) {
        C0481 c0481 = (C0481) C0482.f2092.m3641(cls);
        AbstractC1672 abstractC1672 = !c0481.f2090.containsKey(str) ? null : (AbstractC1672) c0481.m1719(str).stream().filter(new C0335(1)).findFirst().get();
        if (abstractC1672 != null) {
            return new C0501(abstractC1672, null);
        }
        return null;
    }

    public static C2895 m409(InvocationTargetException invocationTargetException, String str, C0550 c0550, AbstractC2707 abstractC2707) {
        String strM4757 = AbstractC2784.m4757("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof C1229) && (!(cause instanceof C2895) || !((C2895) cause).f9312)) {
            z = false;
        }
        return new C2895(strM4757, cause, abstractC2707, c0550, z);
    }
}
