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
import p000.AbstractC1095;
import p000.AbstractC1687;
import p000.AbstractC2240;
import p000.AbstractC2647;
import p000.AbstractC2844;
import p000.C0456;
import p000.C0457;
import p000.C0458;
import p000.C0461;
import p000.C0527;
import p000.C0538;
import p000.C1231;
import p000.C1684;
import p000.C1893;
import p000.C2286;
import p000.C2573;
import p000.C2954;
import p000.C3581;
import p000.C3582;

/* JADX INFO: renamed from: bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0016 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final Object[] f568 = new Object[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final Class[] f569 = new Class[0];

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final WeakHashMap f570 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final Pattern f571 = Pattern.compile("[^\\.]+|bsh\\..*");

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static final Pattern f572;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final WeakHashMap f573;

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f572 = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C0456(7)).collect(Collectors.joining("|", "(?:", ").*")));
        f573 = new WeakHashMap();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m521(String str, String str2) {
        WeakHashMap weakHashMap = f570;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM4787 = AbstractC2844.m4787(str);
        sbM4787.append((String) weakHashMap.get(str2));
        return sbM4787.toString();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static Object m522(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new C2573(AbstractC1095.m2797(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM564 = AbstractC0017.m564(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM564 = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM564)).toArray(new C0461(9));
        }
        RunnableC0008.m333("Looking for most specific constructor: ", cls);
        AbstractC1687 abstractC1687M1825 = ((C0457) C0458.f2065.m3819(cls)).m1825(cls.getName(), clsArrM564);
        if (abstractC1687M1825 == null || !(objArr.length == abstractC1687M1825.mo3008() || abstractC1687M1825.mo3011() || abstractC1687M1825.mo2462())) {
            if (clsArrM564.length == 0) {
                throw new C2573(AbstractC1095.m2797(cls, "Can't find default constructor for: "));
            }
            throw new C2573("Can't find constructor: " + AbstractC2240.m4261(cls.getName(), clsArrM564) + " in class: " + cls.getName());
        }
        try {
            return abstractC1687M1825.mo3115(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new C2573("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static int m523(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM2802 = AbstractC1095.m2802(i, "  ", ":");
            sbM2802.append(((BshMethod) list.get(i)).toString());
            sbM2802.append(" ");
            sbM2802.append(((BshMethod) list.get(i)).getClass().getName());
            RunnableC0008.m333(sbM2802.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class<?>[] parameterTypes = ((BshMethod) it.next()).getParameterTypes();
            if (clsArr.length == parameterTypes.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(parameterTypes);
            }
            i2++;
        }
        int iM525 = m525(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM525 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM525)).intValue();
            RunnableC0008.m333(" remap: " + arrayList2);
            RunnableC0008.m333(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            BshMethod bshMethod = (BshMethod) it2.next();
            Class<?>[] parameterTypes2 = bshMethod.getParameterTypes();
            if (bshMethod.isVarArgs() && clsArr.length >= parameterTypes2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(parameterTypes2, 0, clsArr2, 0, parameterTypes2.length - 1);
                Arrays.fill(clsArr2, parameterTypes2.length - 1, clsArr.length, parameterTypes2[parameterTypes2.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM526 = m525(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM526 < 0) {
            return iM526;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM526)).intValue();
        RunnableC0008.m333(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC0008.m333(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static int m524(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM2802 = AbstractC1095.m2802(i, "  ", "=");
            sbM2802.append(((AbstractC1687) list.get(i)).f5670);
            RunnableC0008.m333(sbM2802.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo3009 = ((AbstractC1687) it.next()).mo3009();
            if (clsArr.length == clsArrMo3009.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo3009);
            }
            i2++;
        }
        int iM525 = m525(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM525 >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM525)).intValue();
            RunnableC0008.m333(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            RunnableC0008.m333(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC1687 abstractC1687 = (AbstractC1687) it2.next();
            Class[] clsArrMo30010 = abstractC1687.mo3009();
            if (abstractC1687.mo3011() && clsArr.length >= clsArrMo30010.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo30010, 0, clsArr2, 0, clsArrMo30010.length - 1);
                Arrays.fill(clsArr2, clsArrMo30010.length - 1, clsArr.length, abstractC1687.mo3010());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM526 = m525(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM526 >= 0) {
            iM526 = ((Integer) arrayList2.get(iM526)).intValue();
        }
        RunnableC0008.m333(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC0008.m333(" match (varargs) =" + iM526);
        return iM526;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static int m525(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC0017.m555(clsArr4, clsArr3)) && AbstractC0017.m577(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC0017.m555(clsArr, clsArr4) || (AbstractC0017.m577(clsArr4, clsArr3, 1) && !AbstractC0017.m555(clsArr, clsArr3)))) {
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static This m526(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m536(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            throw new C1684("Generated class: Error getting This " + e, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static Modifiers m527(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            C0012 c0012M539 = m539(cls);
            Variable variableM377 = null;
            if (c0012M539 != null) {
                try {
                    variableM377 = c0012M539.m377(string, false);
                } catch (Exception unused) {
                }
            }
            return (Modifiers) variableM377.getValue();
        } catch (Exception unused2) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static This m528(Class cls, String str) {
        try {
            return (This) m531(cls, null, This.Keys.BSHSTATIC + str, true);
        } catch (Exception e) {
            throw new C1684("Unable to get class static space: " + e, e);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static BshMethod[] m529(Class cls) {
        if (!m546(cls)) {
            return new BshMethod[0];
        }
        if (cls.isInterface()) {
            C0012 c0012M539 = m539(cls);
            return c0012M539 == null ? new BshMethod[0] : c0012M539.m371();
        }
        C0012 c0012M540 = m540(m535(cls));
        return c0012M540 == null ? new BshMethod[0] : c0012M540.m371();
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static Map.Entry m530(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static Object m531(Class cls, Object obj, String str, boolean z) throws C3582 {
        try {
            return m549(cls, str, z).mo3115(obj, new Object[0]);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof C1684) {
                throw ((C1684) e.getCause());
            }
            if (!(e.getCause() instanceof C3581)) {
                throw new C2573(AbstractC2844.m4790("Can't access field: ", str), e.getCause());
            }
            Throwable cause = e.getCause();
            throw new C3582(cause.getMessage(), cause);
        } catch (C2573 e2) {
            C0012 c0012M539 = m539(cls);
            if (m546(cls) && c0012M539 != null && c0012M539.f535) {
                if (z) {
                    Variable variableM377 = c0012M539.m377(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object value = (variableM377 == null || (variableM377.hasModifier("private") && !C0538.m2050())) ? primitive : variableM377.getValue();
                    if (primitive != value) {
                        return value;
                    }
                } else {
                    C0012 c0012M540 = m540(obj);
                    if (c0012M540 != null) {
                        Variable variableM378 = c0012M540.m377(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object value2 = (variableM378 == null || (variableM378.hasModifier("private") && !C0538.m2050())) ? primitive2 : variableM378.getValue();
                        if (primitive2 != value2) {
                            return value2;
                        }
                    }
                }
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static LHS m532(Object obj, String str) {
        Variable variableM377;
        if (obj instanceof This) {
            return new LHS(((This) obj).namespace, str, false);
        }
        try {
            return new LHS(obj, m549(obj.getClass(), str, false));
        } catch (C2573 e) {
            C0012 c0012M540 = m540(obj);
            if (m546(obj.getClass()) && c0012M540 != null && c0012M540.f535 && (variableM377 = c0012M540.m377(str, true)) != null && (!variableM377.hasModifier("private") || C0538.m2050())) {
                return new LHS(c0012M540, str);
            }
            if (m542(obj.getClass(), str)) {
                return new LHS(obj, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static LHS m533(Class cls, String str) {
        Variable variableM377;
        try {
            return new LHS(m549(cls, str, true));
        } catch (C2573 e) {
            C0012 c0012M539 = m539(cls);
            if (m546(cls) && c0012M539 != null && c0012M539.f535 && (variableM377 = c0012M539.m377(str, true)) != null && (!variableM377.hasModifier("private") || C0538.m2050())) {
                return new LHS(c0012M539, str);
            }
            if (m542(cls, str)) {
                return new LHS(cls, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static BshMethod m534(C0012 c0012, String str, Class[] clsArr, boolean z) {
        if (c0012 == null) {
            return null;
        }
        try {
            return c0012.m370(str, clsArr, z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Object m535(Class cls) {
        WeakHashMap weakHashMap = f573;
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

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static Object m536(Object obj, String str) throws C3582 {
        if (obj instanceof This) {
            return ((This) obj).namespace.m376(str, true);
        }
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC1095.m2800("Attempt to access field '", str, "' on null value"));
            throw new C3582(nullPointerException.getMessage(), nullPointerException);
        }
        try {
            return m531(obj.getClass(), obj, str, false);
        } catch (C2573 e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC0017.f574;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC0017.m576(cls)) {
                C1893 c1893 = C0458.f2065;
                if (!((C0457) c1893.m3819(cls)).f2063.containsKey(str) || ((C0457) c1893.m3819(cls)).m1824(str) == null) {
                    throw e;
                }
            }
            return m538(obj, str);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static Object m537(Object obj, Object obj2) {
        Map map = AbstractC0017.f574;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0017.m576(cls)) {
            Map.Entry entryM530 = m530(obj2, (Map.Entry[]) obj);
            return entryM530 != null ? entryM530.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1687 abstractC1687M1824 = ((C0457) C0458.f2065.m3819(cls)).m1824(obj2.toString());
        if (abstractC1687M1824 == null) {
            RunnableC0008.m333("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC1687M1824.mo3115(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            RunnableC0008.m333("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static Object m538(Object obj, String str) {
        Map map = AbstractC0017.f574;
        if (obj instanceof Map.Entry) {
            str.getClass();
            switch (str) {
                case "key":
                    return ((Map.Entry) obj).getKey();
                case "val":
                case "value":
                    return ((Map.Entry) obj).getValue();
            }
        }
        return m537(obj, str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static C0012 m539(Class cls) {
        if (!m546(cls)) {
            return null;
        }
        try {
            return m528(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof C3582) {
                throw new C1684(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲇᲁ, reason: contains not printable characters */
    public static C0012 m540(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m546(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m539(cls.getInterfaces()[0]) : m526(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲀᲇ, reason: contains not printable characters */
    public static Variable[] m541(C0012 c0012) {
        String[] strArr = c0012 == null ? new String[0] : (String[]) Stream.of(c0012.f522.keySet().stream().toArray(new C0461(5))).filter(new C0456(6)).toArray(new C0461(11));
        return (c0012 == null || strArr == null) ? new Variable[0] : (Variable[]) Stream.of((Object[]) strArr).map(new C2286(c0012, 4)).filter(new C0456(4)).toArray(new C0461(10));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲁᲇᲀ, reason: contains not printable characters */
    public static boolean m542(Class cls, String str) {
        Map map = AbstractC0017.f574;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC0017.m576(cls)) {
            return true;
        }
        C1893 c1893 = C0458.f2065;
        return ((C0457) c1893.m3819(cls)).f2063.containsKey(str) && ((C0457) c1893.m3819(cls)).m1826(str) != null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲀᲁ, reason: contains not printable characters */
    public static Object m543(Class cls, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node) throws C3581 {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = runnableC0008;
        objArr2[1] = c0527;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m545(runnableC0008.f505.m365(), cls, "invoke", objArr2, node);
        } catch (InvocationTargetException e) {
            throw new C3581("Error in compiled command: " + e.getCause(), e);
        } catch (C2573 e2) {
            throw new C3581("Error invoking compiled command: " + e2, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [bsh.ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ] */
    /* JADX WARN: Type inference failed for: r10v1, types: [ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤝᲇᤞᲀᛸ] */
    /* JADX WARN: Type inference failed for: r10v23, types: [ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᛸᲀᲈᲁ] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bsh.BshMethod] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲈᲀᲇᤞᤝ] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bsh.Node] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲇᲁᲀ, reason: contains not printable characters */
    public static Object m544(Object obj, String str, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node) throws C1231 {
        ?? r6;
        ?? r7;
        ?? r10;
        ?? r8;
        ?? r9;
        ?? r4;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, runnableC0008, c0527, node, false);
        }
        C0458 c0458M365 = runnableC0008.f505.m365();
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
                    if (!str.equals("getType")) {
                        if (str.equals("getClass")) {
                        }
                    }
                    return obj == Primitive.VOID ? ((Primitive) obj).getType() : type;
                } catch (C3581 e) {
                    r10 = e;
                    r9 = c0527;
                    r8 = node;
                    throw r10.mo4677(r8, r9);
                }
            }
            Object obj2 = obj;
            r6 = str;
            r7 = objArr;
            Class<?> cls = type;
            try {
                ?? M550 = m550(c0458M365, cls, obj2, r6, r7, false);
                r4 = r6;
                r5 = r7;
                try {
                    C0012 c0012M540 = m540(obj2);
                    if (c0012M540 != null) {
                        c0012M540.f533 = node;
                    }
                    return M550.mo3115(obj2, r5);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw m554(e, r4, c0527, node);
                } catch (C2573 e3) {
                    e = e3;
                    C2573 c2573 = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new C1231("Attempt to invoke method: " + r4 + "() on undefined", node, c0527, c2573);
                        }
                        ?? M367 = c0527.m2024().m367(type, r4, AbstractC0017.m564(r5));
                        if (M367 != 0) {
                            return M367.invoke(r5, runnableC0008, c0527, node, false, obj2);
                        }
                        C0527 c0528 = c0527;
                        Node node2 = node;
                        Object obj3 = obj2;
                        if (z) {
                            try {
                                if (!AbstractC0017.m575(obj3)) {
                                    return m544(obj3, r4, r5, runnableC0008, c0528, node2);
                                }
                                try {
                                    return m548(obj3, type, r4, r5, runnableC0008, c0528, node2);
                                } catch (C2954 e4) {
                                    e = e4;
                                    throw e;
                                } catch (C1231 unused) {
                                    c0528 = c0528;
                                    node2 = node2;
                                    throw new C1231("Error in method invocation: " + c2573.getMessage(), node2, c0528, c2573);
                                } catch (C3581 e5) {
                                    e = e5;
                                    r6 = c0528;
                                    r7 = node2;
                                    r10 = e;
                                    r9 = r6;
                                    r8 = r7;
                                    throw r10.mo4677(r8, r9);
                                }
                            } catch (C2954 e6) {
                                e = e6;
                            } catch (C1231 unused2) {
                            }
                            throw e;
                        }
                        throw new C1231("Error in method invocation: " + c2573.getMessage(), node2, c0528, c2573);
                    } catch (C3581 e7) {
                        e = e7;
                    }
                    r10 = e;
                    r9 = r6;
                    r8 = r7;
                    throw r10.mo4677(r8, r9);
                }
            } catch (InvocationTargetException e8) {
                e = e8;
                r4 = r6;
            } catch (C2573 e9) {
                e = e9;
                type = cls;
                obj2 = obj2;
                r4 = r6;
                r5 = r7;
            }
        } catch (C3581 e10) {
            e = e10;
            r6 = c0527;
            r7 = node;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲇᲈ, reason: contains not printable characters */
    public static Object m545(C0458 c0458, Class cls, String str, Object[] objArr, Node node) {
        RunnableC0008.m333("invoke static Method");
        C0012 c0012M539 = m539(cls);
        if (c0012M539 != null) {
            c0012M539.f533 = node;
        }
        return m550(c0458, cls, null, str, objArr, true).mo3115(null, objArr);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲁᲈᲇ, reason: contains not printable characters */
    public static boolean m546(Class cls) {
        return (cls == null || cls == GeneratedClass.class || !GeneratedClass.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲁᲈ, reason: contains not printable characters */
    public static void m547(String str, AbstractC1687 abstractC1687, Object[] objArr) {
        if (((Boolean) RunnableC0008.f500.get()).booleanValue()) {
            RunnableC0008.m333(str, abstractC1687, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                RunnableC0008.m333("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲇᲈᲁ, reason: contains not printable characters */
    public static Object m548(Object obj, Class cls, String str, Object[] objArr, RunnableC0008 runnableC0008, C0527 c0527, Node node) throws C1231 {
        Class<BigInteger> cls2 = AbstractC0017.m570(obj) ? BigDecimal.class : BigInteger.class;
        try {
            Object objM544 = m544(Primitive.castWrapper(cls2, obj), str, objArr, runnableC0008, c0527, node);
            return ((objM544 instanceof Primitive) && ((Primitive) objM544).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM544), (Class<?>) cls) : objM544;
        } catch (C2954 e) {
            e.m2986("Method found on " + cls2.getSimpleName() + " but with error");
            throw e;
        } catch (C1231 unused) {
            Class cls3 = AbstractC0017.m570(obj) ? BigInteger.class : BigDecimal.class;
            Object objM545 = m544(Primitive.castWrapper(cls3, obj), str, objArr, runnableC0008, c0527, node);
            return ((objM545 instanceof Primitive) && ((Primitive) objM545).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM545), (Class<?>) cls) : objM545;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲁᲇ, reason: contains not printable characters */
    public static AbstractC1687 m549(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C0457) C0458.f2065.m3819(cls)).f2064;
        AbstractC1687 abstractC1687 = !concurrentHashMap.containsKey(str) ? null : (AbstractC1687) concurrentHashMap.get(str);
        if (abstractC1687 == null) {
            StringBuilder sbM4625 = AbstractC2647.m4625("No such field: ", str, " for class: ");
            sbM4625.append(cls.getName());
            throw new C2573(sbM4625.toString());
        }
        if (!z || abstractC1687.mo2463()) {
            return abstractC1687;
        }
        StringBuilder sbM4626 = AbstractC2647.m4625("Can't reach instance field: ", str, " from static context: ");
        sbM4626.append(cls.getName());
        throw new C3581(sbM4626.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᤞᲈᲇᲁ, reason: contains not printable characters */
    public static AbstractC1687 m550(C0458 c0458, Class cls, Object obj, String str, Object[] objArr, boolean z) throws C3582 {
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC1095.m2800("Attempt to invoke method ", str, " on null value"));
            throw new C3582(nullPointerException.getMessage(), nullPointerException);
        }
        Class[] clsArrM564 = AbstractC0017.m564(objArr);
        AbstractC1687 abstractC1687M551 = m551(cls, str, clsArrM564, z);
        if (abstractC1687M551 != null) {
            return abstractC1687M551;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC2240.m4261(str, clsArrM564));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new C2573(sb.toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲇᲈ, reason: contains not printable characters */
    public static AbstractC1687 m551(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            throw new C1684("null class");
        }
        AbstractC1687 abstractC1687M1825 = ((C0457) C0458.f2065.m3819(cls)).m1825(str, clsArr);
        RunnableC0008.m333("resolved java method: ", abstractC1687M1825, " on class: ", cls);
        if (abstractC1687M1825 == null || !z || abstractC1687M1825.mo2463()) {
            return abstractC1687M1825;
        }
        throw new C3581("Cannot reach instance method: " + AbstractC2240.m4261(abstractC1687M1825.f5671, abstractC1687M1825.mo3009()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᤞᲈᲇ, reason: contains not printable characters */
    public static Object m552(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC0017.f574;
        if (obj instanceof Map) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            throw new C2573("No such property setter: " + obj2 + " for type: " + AbstractC2240.m4268(obj));
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0017.m576(cls)) {
            return m530(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC1687 abstractC1687M1826 = ((C0457) C0458.f2065.m3819(cls)).m1826(obj2.toString());
        if (abstractC1687M1826 != null) {
            try {
                return abstractC1687M1826.mo3115(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new C2573("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        throw new C2573("No such property setter: " + obj2 + " for type: " + AbstractC2240.m4267(cls));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᤞᲈ, reason: contains not printable characters */
    public static BshMethod m553(Class cls, String str) {
        C0457 c0457 = (C0457) C0458.f2065.m3819(cls);
        AbstractC1687 abstractC1687 = !c0457.f2063.containsKey(str) ? null : (AbstractC1687) c0457.m1827(str).stream().filter(new C0456(0)).findFirst().get();
        if (abstractC1687 != null) {
            return new BshMethod(abstractC1687, (Object) null);
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᲀᲁᲇᲈᤞ, reason: contains not printable characters */
    public static C2954 m554(InvocationTargetException invocationTargetException, String str, C0527 c0527, Node node) {
        String strM4790 = AbstractC2844.m4790("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof C1231) && (!(cause instanceof C2954) || !((C2954) cause).f9479)) {
            z = false;
        }
        return new C2954(strM4790, cause, node, c0527, z);
    }
}
