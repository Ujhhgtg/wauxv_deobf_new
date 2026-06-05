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
import p000.AbstractC0695Ujhhgtgfeyxiexzf;
import p000.AbstractC0924feyxiexzfUjhhgtg;
import p000.AbstractC1225feyxiexzfUjhhgtg;
import p000.AbstractC3317feyxiexzfUjhhgtg;
import p000.AbstractC3594Ujhhgtgfeyxiexzf;
import p000.C0151Ujhhgtgfeyxiexzf;
import p000.C0271Ujhhgtgfeyxiexzf;
import p000.C0712Ujhhgtgfeyxiexzf;
import p000.C0958feyxiexzfUjhhgtg;
import p000.C1292feyxiexzfUjhhgtg;
import p000.C1853Ujhhgtgfeyxiexzf;
import p000.C1862Ujhhgtgfeyxiexzf;
import p000.C1863Ujhhgtgfeyxiexzf;
import p000.C1985Ujhhgtgfeyxiexzf;
import p000.C2570Ujhhgtgfeyxiexzf;
import p000.C2571Ujhhgtgfeyxiexzf;
import p000.C2574Ujhhgtgfeyxiexzf;
import p000.C2637feyxiexzfUjhhgtg;
import p000.C2776Ujhhgtgfeyxiexzf;
import p000.C2809Ujhhgtgfeyxiexzf;
import p000.C3353Ujhhgtgfeyxiexzf;
import p000.InterfaceC3567Ujhhgtgfeyxiexzf;

/* JADX INFO: renamed from: bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0033Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static final Object[] f582Ujhhgtgfeyxiexzf = new Object[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static final Class[] f583Ujhhgtgfeyxiexzf = new Class[0];

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final WeakHashMap f584Ujhhgtgfeyxiexzf = new WeakHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final Pattern f585Ujhhgtgfeyxiexzf = Pattern.compile("[^\\.]+|bsh\\..*");

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static final Pattern f586Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static final WeakHashMap f587Ujhhgtgfeyxiexzf;

    static {
        String property = Security.getProperty("package.access");
        if (property == null) {
            property = "null";
        }
        f586Ujhhgtgfeyxiexzf = Pattern.compile((String) Stream.of((Object[]) property.split(",")).filter(new C2574Ujhhgtgfeyxiexzf(7)).collect(Collectors.joining("|", "(?:", ").*")));
        f587Ujhhgtgfeyxiexzf = new WeakHashMap();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public static String m520Ujhhgtgfeyxiexzf(String str, String str2) {
        WeakHashMap weakHashMap = f584Ujhhgtgfeyxiexzf;
        if (!weakHashMap.containsKey(str2)) {
            char[] charArray = str2.toCharArray();
            charArray[0] = Character.toUpperCase(charArray[0]);
            weakHashMap.put(str2, new String(charArray));
        }
        StringBuilder sbM2707Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2707Ujhhgtgfeyxiexzf(str);
        sbM2707Ujhhgtgfeyxiexzf.append((String) weakHashMap.get(str2));
        return sbM2707Ujhhgtgfeyxiexzf.toString();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public static Object m521Ujhhgtgfeyxiexzf(Class cls, Object obj, Object[] objArr) throws InvocationTargetException {
        if (cls == null) {
            return Primitive.NULL;
        }
        if (cls.isInterface()) {
            throw new C0958feyxiexzfUjhhgtg(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Can't create instance of an interface: "));
        }
        Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr);
        if (cls.isMemberClass() && !Modifier.isStatic(cls.getModifiers()) && obj != null) {
            clsArrM563Ujhhgtgfeyxiexzf = (Class[]) Stream.concat(Stream.of(obj.getClass()), Stream.of((Object[]) clsArrM563Ujhhgtgfeyxiexzf)).toArray(new C2571Ujhhgtgfeyxiexzf(9));
        }
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Looking for most specific constructor: ", cls);
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3826Ujhhgtgfeyxiexzf(cls.getName(), clsArrM563Ujhhgtgfeyxiexzf);
        if (abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf == null || !(objArr.length == abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1966Ujhhgtgfeyxiexzf() || abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf() || abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1971Ujhhgtgfeyxiexzf())) {
            if (clsArrM563Ujhhgtgfeyxiexzf.length == 0) {
                throw new C0958feyxiexzfUjhhgtg(AbstractC3317feyxiexzfUjhhgtg.m4798Ujhhgtgfeyxiexzf(cls, "Can't find default constructor for: "));
            }
            throw new C0958feyxiexzfUjhhgtg("Can't find constructor: " + AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(cls.getName(), clsArrM563Ujhhgtgfeyxiexzf) + " in class: " + cls.getName());
        }
        try {
            return abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(obj, objArr);
        } catch (InvocationTargetException e) {
            if (!(e.getCause().getCause() instanceof IllegalAccessException)) {
                throw e;
            }
            throw new C0958feyxiexzfUjhhgtg("We don't have permission to create an instance. " + e.getCause().getCause().getMessage() + " Use setAccessibility(true) to enable access.", e.getCause().getCause());
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static int m522Ujhhgtgfeyxiexzf(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "  ", ":");
            sbM4804Ujhhgtgfeyxiexzf.append(((C0021Ujhhgtgfeyxiexzf) list.get(i)).toString());
            sbM4804Ujhhgtgfeyxiexzf.append(" ");
            sbM4804Ujhhgtgfeyxiexzf.append(((C0021Ujhhgtgfeyxiexzf) list.get(i)).getClass().getName());
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(sbM4804Ujhhgtgfeyxiexzf.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo313Ujhhgtgfeyxiexzf = ((C0021Ujhhgtgfeyxiexzf) it.next()).mo313Ujhhgtgfeyxiexzf();
            if (clsArr.length == clsArrMo313Ujhhgtgfeyxiexzf.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo313Ujhhgtgfeyxiexzf);
            }
            i2++;
        }
        int iM524Ujhhgtgfeyxiexzf = m524Ujhhgtgfeyxiexzf(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM524Ujhhgtgfeyxiexzf >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM524Ujhhgtgfeyxiexzf)).intValue();
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" remap: " + arrayList2);
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" match:" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            C0021Ujhhgtgfeyxiexzf c0021Ujhhgtgfeyxiexzf = (C0021Ujhhgtgfeyxiexzf) it2.next();
            Class[] clsArrMo313Ujhhgtgfeyxiexzf2 = c0021Ujhhgtgfeyxiexzf.mo313Ujhhgtgfeyxiexzf();
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = c0021Ujhhgtgfeyxiexzf.f476Ujhhgtgfeyxiexzf;
            if ((abstractC0695Ujhhgtgfeyxiexzf == null ? c0021Ujhhgtgfeyxiexzf.f479Ujhhgtgfeyxiexzf : abstractC0695Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf()) && clsArr.length >= clsArrMo313Ujhhgtgfeyxiexzf2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo313Ujhhgtgfeyxiexzf2, 0, clsArr2, 0, clsArrMo313Ujhhgtgfeyxiexzf2.length - 1);
                Arrays.fill(clsArr2, clsArrMo313Ujhhgtgfeyxiexzf2.length - 1, clsArr.length, clsArrMo313Ujhhgtgfeyxiexzf2[clsArrMo313Ujhhgtgfeyxiexzf2.length - 1].getComponentType());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM524Ujhhgtgfeyxiexzf2 = m524Ujhhgtgfeyxiexzf(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM524Ujhhgtgfeyxiexzf2 < 0) {
            return iM524Ujhhgtgfeyxiexzf2;
        }
        int iIntValue2 = ((Integer) arrayList2.get(iM524Ujhhgtgfeyxiexzf2)).intValue();
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" remap (varargs): " + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" match (varargs):" + iIntValue2);
        return iIntValue2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static int m523Ujhhgtgfeyxiexzf(Class[] clsArr, List list) {
        for (int i = 0; i < list.size(); i++) {
            StringBuilder sbM4804Ujhhgtgfeyxiexzf = AbstractC3317feyxiexzfUjhhgtg.m4804Ujhhgtgfeyxiexzf(i, "  ", "=");
            sbM4804Ujhhgtgfeyxiexzf.append(((AbstractC0695Ujhhgtgfeyxiexzf) list.get(i)).f2845Ujhhgtgfeyxiexzf);
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(sbM4804Ujhhgtgfeyxiexzf.toString());
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            Class[] clsArrMo1967Ujhhgtgfeyxiexzf = ((AbstractC0695Ujhhgtgfeyxiexzf) it.next()).mo1967Ujhhgtgfeyxiexzf();
            if (clsArr.length == clsArrMo1967Ujhhgtgfeyxiexzf.length) {
                arrayList2.add(Integer.valueOf(i2));
                arrayList.add(clsArrMo1967Ujhhgtgfeyxiexzf);
            }
            i2++;
        }
        int iM524Ujhhgtgfeyxiexzf = m524Ujhhgtgfeyxiexzf(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM524Ujhhgtgfeyxiexzf >= 0) {
            int iIntValue = ((Integer) arrayList2.get(iM524Ujhhgtgfeyxiexzf)).intValue();
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" remap=" + Arrays.toString(arrayList2.toArray(new Integer[0])));
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" match=" + iIntValue);
            return iIntValue;
        }
        arrayList.clear();
        arrayList2.clear();
        Iterator it2 = list.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = (AbstractC0695Ujhhgtgfeyxiexzf) it2.next();
            Class[] clsArrMo1967Ujhhgtgfeyxiexzf2 = abstractC0695Ujhhgtgfeyxiexzf.mo1967Ujhhgtgfeyxiexzf();
            if (abstractC0695Ujhhgtgfeyxiexzf.mo1973Ujhhgtgfeyxiexzf() && clsArr.length >= clsArrMo1967Ujhhgtgfeyxiexzf2.length - 1) {
                Class[] clsArr2 = new Class[clsArr.length];
                System.arraycopy(clsArrMo1967Ujhhgtgfeyxiexzf2, 0, clsArr2, 0, clsArrMo1967Ujhhgtgfeyxiexzf2.length - 1);
                Arrays.fill(clsArr2, clsArrMo1967Ujhhgtgfeyxiexzf2.length - 1, clsArr.length, abstractC0695Ujhhgtgfeyxiexzf.mo1968Ujhhgtgfeyxiexzf());
                arrayList2.add(Integer.valueOf(i3));
                arrayList.add(clsArr2);
            }
            i3++;
        }
        int iM524Ujhhgtgfeyxiexzf2 = m524Ujhhgtgfeyxiexzf(clsArr, (Class[][]) arrayList.toArray(new Class[arrayList.size()][]));
        if (iM524Ujhhgtgfeyxiexzf2 >= 0) {
            iM524Ujhhgtgfeyxiexzf2 = ((Integer) arrayList2.get(iM524Ujhhgtgfeyxiexzf2)).intValue();
        }
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" remap (varargs) =" + Arrays.toString(arrayList2.toArray(new Integer[0])));
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(" match (varargs) =" + iM524Ujhhgtgfeyxiexzf2);
        return iM524Ujhhgtgfeyxiexzf2;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static int m524Ujhhgtgfeyxiexzf(Class[] clsArr, Class[][] clsArr2) {
        int i = 1;
        while (true) {
            int i2 = -1;
            if (i > 4) {
                return -1;
            }
            Class[] clsArr3 = null;
            for (int i3 = 0; i3 < clsArr2.length; i3++) {
                Class[] clsArr4 = clsArr2[i3];
                if ((clsArr3 == null || !AbstractC0034Ujhhgtgfeyxiexzf.m554Ujhhgtgfeyxiexzf(clsArr4, clsArr3)) && AbstractC0034Ujhhgtgfeyxiexzf.m576Ujhhgtgfeyxiexzf(clsArr, clsArr4, i) && (clsArr3 == null || AbstractC0034Ujhhgtgfeyxiexzf.m554Ujhhgtgfeyxiexzf(clsArr, clsArr4) || (AbstractC0034Ujhhgtgfeyxiexzf.m576Ujhhgtgfeyxiexzf(clsArr4, clsArr3, 1) && !AbstractC0034Ujhhgtgfeyxiexzf.m554Ujhhgtgfeyxiexzf(clsArr, clsArr3)))) {
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public static This m525Ujhhgtgfeyxiexzf(Object obj, String str) {
        try {
            return (This) Primitive.unwrap(m535Ujhhgtgfeyxiexzf(obj, This.Keys.BSHTHIS + str));
        } catch (Exception e) {
            throw new C0712Ujhhgtgfeyxiexzf("Generated class: Error getting This " + e, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public static Modifiers m526Ujhhgtgfeyxiexzf(Class cls) {
        try {
            String string = This.Keys.BSHCLASSMODIFIERS.toString();
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = m538Ujhhgtgfeyxiexzf(cls);
            C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = null;
            if (c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf != null) {
                try {
                    c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(string, false);
                } catch (Exception unused) {
                }
            }
            return (Modifiers) c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf.m3187Ujhhgtgfeyxiexzf();
        } catch (Exception unused2) {
            return new Modifiers(cls.isInterface() ? 1 : 0);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ, reason: contains not printable characters */
    public static This m527Ujhhgtgfeyxiexzf(Class cls, String str) {
        try {
            return (This) m530Ujhhgtgfeyxiexzf(cls, null, This.Keys.BSHSTATIC + str, true);
        } catch (Exception e) {
            throw new C0712Ujhhgtgfeyxiexzf("Unable to get class static space: " + e, e);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static C0021Ujhhgtgfeyxiexzf[] m528Ujhhgtgfeyxiexzf(Class cls) {
        if (!m545feyxiexzfUjhhgtg(cls)) {
            return new C0021Ujhhgtgfeyxiexzf[0];
        }
        if (cls.isInterface()) {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = m538Ujhhgtgfeyxiexzf(cls);
            return c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf == null ? new C0021Ujhhgtgfeyxiexzf[0] : c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.m370Ujhhgtgfeyxiexzf();
        }
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = m539Ujhhgtgfeyxiexzf(m534Ujhhgtgfeyxiexzf(cls));
        return c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf == null ? new C0021Ujhhgtgfeyxiexzf[0] : c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m370Ujhhgtgfeyxiexzf();
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Map.Entry m529Ujhhgtgfeyxiexzf(Object obj, Map.Entry[] entryArr) {
        for (Map.Entry entry : entryArr) {
            if (obj.equals(entry.getKey())) {
                return entry;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static Object m530Ujhhgtgfeyxiexzf(Class cls, Object obj, String str, boolean z) throws C1862Ujhhgtgfeyxiexzf {
        try {
            return m548feyxiexzfUjhhgtg(cls, str, z).mo1969Ujhhgtgfeyxiexzf(obj, new Object[0]);
        } catch (InvocationTargetException e) {
            if (e.getCause() instanceof C0712Ujhhgtgfeyxiexzf) {
                throw ((C0712Ujhhgtgfeyxiexzf) e.getCause());
            }
            if (!(e.getCause() instanceof C1863Ujhhgtgfeyxiexzf)) {
                throw new C0958feyxiexzfUjhhgtg(AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Can't access field: ", str), e.getCause());
            }
            Throwable cause = e.getCause();
            throw new C1862Ujhhgtgfeyxiexzf(cause.getMessage(), cause);
        } catch (C0958feyxiexzfUjhhgtg e2) {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = m538Ujhhgtgfeyxiexzf(cls);
            if (m545feyxiexzfUjhhgtg(cls) && c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf != null && c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf) {
                if (z) {
                    C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, true);
                    Primitive primitive = Primitive.VOID;
                    Object objM3187Ujhhgtgfeyxiexzf = (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf == null || (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("private") && !C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf())) ? primitive : c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf.m3187Ujhhgtgfeyxiexzf();
                    if (primitive != objM3187Ujhhgtgfeyxiexzf) {
                        return objM3187Ujhhgtgfeyxiexzf;
                    }
                } else {
                    C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = m539Ujhhgtgfeyxiexzf(obj);
                    if (c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf != null) {
                        C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf2 = c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, true);
                        Primitive primitive2 = Primitive.VOID;
                        Object objM3187Ujhhgtgfeyxiexzf2 = (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf2 == null || (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf2.m3188Ujhhgtgfeyxiexzf("private") && !C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf())) ? primitive2 : c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf2.m3187Ujhhgtgfeyxiexzf();
                        if (primitive2 != objM3187Ujhhgtgfeyxiexzf2) {
                            return objM3187Ujhhgtgfeyxiexzf2;
                        }
                    }
                }
            }
            throw e2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static C0151Ujhhgtgfeyxiexzf m531Ujhhgtgfeyxiexzf(Object obj, String str) {
        C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf;
        if (obj instanceof This) {
            return new C0151Ujhhgtgfeyxiexzf(((This) obj).namespace, str, false);
        }
        try {
            return new C0151Ujhhgtgfeyxiexzf(m548feyxiexzfUjhhgtg(obj.getClass(), str, false), obj);
        } catch (C0958feyxiexzfUjhhgtg e) {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = m539Ujhhgtgfeyxiexzf(obj);
            if (m545feyxiexzfUjhhgtg(obj.getClass()) && c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf != null && c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf && (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, true)) != null && (!c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("private") || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf())) {
                return new C0151Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf, str);
            }
            if (m541Ujhhgtgfeyxiexzf(obj.getClass(), str)) {
                return new C0151Ujhhgtgfeyxiexzf(obj, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛲᛴ, reason: contains not printable characters */
    public static C0151Ujhhgtgfeyxiexzf m532Ujhhgtgfeyxiexzf(Class cls, String str) {
        C1853Ujhhgtgfeyxiexzf c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf;
        try {
            return new C0151Ujhhgtgfeyxiexzf(m548feyxiexzfUjhhgtg(cls, str, true));
        } catch (C0958feyxiexzfUjhhgtg e) {
            C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = m538Ujhhgtgfeyxiexzf(cls);
            if (m545feyxiexzfUjhhgtg(cls) && c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf != null && c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.f549Ujhhgtgfeyxiexzf && (c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf = c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.m376Ujhhgtgfeyxiexzf(str, true)) != null && (!c1853UjhhgtgfeyxiexzfM376Ujhhgtgfeyxiexzf.m3188Ujhhgtgfeyxiexzf("private") || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf())) {
                return new C0151Ujhhgtgfeyxiexzf(c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf, str);
            }
            if (m541Ujhhgtgfeyxiexzf(cls, str)) {
                return new C0151Ujhhgtgfeyxiexzf(cls, str);
            }
            throw e;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛱfeyxiexzfᛱᛴᛲ, reason: contains not printable characters */
    public static C0021Ujhhgtgfeyxiexzf m533Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf, String str, Class[] clsArr, boolean z) {
        if (c0029Ujhhgtgfeyxiexzf == null) {
            return null;
        }
        try {
            return c0029Ujhhgtgfeyxiexzf.m369Ujhhgtgfeyxiexzf(str, clsArr, z);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public static Object m534Ujhhgtgfeyxiexzf(Class cls) {
        WeakHashMap weakHashMap = f587Ujhhgtgfeyxiexzf;
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

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛲᛴᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m535Ujhhgtgfeyxiexzf(Object obj, String str) throws C1862Ujhhgtgfeyxiexzf {
        if (obj instanceof This) {
            return ((This) obj).namespace.m375Ujhhgtgfeyxiexzf(str, true);
        }
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Attempt to access field '", str, "' on null value"));
            throw new C1862Ujhhgtgfeyxiexzf(nullPointerException.getMessage(), nullPointerException);
        }
        try {
            return m530Ujhhgtgfeyxiexzf(obj.getClass(), obj, str, false);
        } catch (C0958feyxiexzfUjhhgtg e) {
            Class<?> cls = obj.getClass();
            Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
            if (!Map.class.isAssignableFrom(cls) && !Map.Entry.class.isAssignableFrom(cls) && !AbstractC0034Ujhhgtgfeyxiexzf.m575Ujhhgtgfeyxiexzf(cls)) {
                C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf;
                if (!((C2570Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).f8321Ujhhgtgfeyxiexzf.containsKey(str) || ((C2570Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3825Ujhhgtgfeyxiexzf(str) == null) {
                    throw e;
                }
            }
            return m537Ujhhgtgfeyxiexzf(obj, str);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static Object m536Ujhhgtgfeyxiexzf(Object obj, Object obj2) {
        Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
        if (obj instanceof Map) {
            Map map2 = (Map) obj;
            return map2.containsKey(obj2) ? map2.get(obj2) : Primitive.VOID;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return obj2.equals(entry.getKey()) ? entry.getValue() : Primitive.VOID;
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0034Ujhhgtgfeyxiexzf.m575Ujhhgtgfeyxiexzf(cls)) {
            Map.Entry entryM529Ujhhgtgfeyxiexzf = m529Ujhhgtgfeyxiexzf(obj2, (Map.Entry[]) obj);
            return entryM529Ujhhgtgfeyxiexzf != null ? entryM529Ujhhgtgfeyxiexzf.getValue() : Primitive.VOID;
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM3825Ujhhgtgfeyxiexzf = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3825Ujhhgtgfeyxiexzf(obj2.toString());
        if (abstractC0695UjhhgtgfeyxiexzfM3825Ujhhgtgfeyxiexzf == null) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("property getter not found");
            return Primitive.VOID;
        }
        try {
            return abstractC0695UjhhgtgfeyxiexzfM3825Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(obj, new Object[0]);
        } catch (InvocationTargetException unused) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("Property accessor threw exception");
            return Primitive.VOID;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛳᛴᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m537Ujhhgtgfeyxiexzf(Object obj, String str) {
        Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
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
        return m536Ujhhgtgfeyxiexzf(obj, str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛲᛳ, reason: contains not printable characters */
    public static C0029Ujhhgtgfeyxiexzf m538Ujhhgtgfeyxiexzf(Class cls) {
        if (!m545feyxiexzfUjhhgtg(cls)) {
            return null;
        }
        try {
            return m527Ujhhgtgfeyxiexzf(cls, cls.getSimpleName()).namespace;
        } catch (Exception e) {
            if (e.getCause() instanceof C1862Ujhhgtgfeyxiexzf) {
                throw new C0712Ujhhgtgfeyxiexzf(e.getCause().getCause().getMessage(), e.getCause().getCause());
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱᛳᛲ, reason: contains not printable characters */
    public static C0029Ujhhgtgfeyxiexzf m539Ujhhgtgfeyxiexzf(Object obj) {
        if (obj == null) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (!m545feyxiexzfUjhhgtg(cls)) {
            return null;
        }
        try {
            return obj instanceof Proxy ? m538Ujhhgtgfeyxiexzf(cls.getInterfaces()[0]) : m525Ujhhgtgfeyxiexzf(obj, cls.getSimpleName()).namespace;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛱfeyxiexzfᛱᛳ, reason: contains not printable characters */
    public static C1853Ujhhgtgfeyxiexzf[] m540Ujhhgtgfeyxiexzf(C0029Ujhhgtgfeyxiexzf c0029Ujhhgtgfeyxiexzf) {
        String[] strArr = c0029Ujhhgtgfeyxiexzf == null ? new String[0] : (String[]) Stream.of(c0029Ujhhgtgfeyxiexzf.f536Ujhhgtgfeyxiexzf.keySet().stream().toArray(new C2571Ujhhgtgfeyxiexzf(5))).filter(new C2574Ujhhgtgfeyxiexzf(6)).toArray(new C2571Ujhhgtgfeyxiexzf(11));
        return (c0029Ujhhgtgfeyxiexzf == null || strArr == null) ? new C1853Ujhhgtgfeyxiexzf[0] : (C1853Ujhhgtgfeyxiexzf[]) Stream.of((Object[]) strArr).map(new C1292feyxiexzfUjhhgtg(4, c0029Ujhhgtgfeyxiexzf)).filter(new C2574Ujhhgtgfeyxiexzf(4)).toArray(new C2571Ujhhgtgfeyxiexzf(10));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛲᛳᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static boolean m541Ujhhgtgfeyxiexzf(Class cls, String str) {
        Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
        if (Map.class.isAssignableFrom(cls) || Map.Entry.class.isAssignableFrom(cls) || AbstractC0034Ujhhgtgfeyxiexzf.m575Ujhhgtgfeyxiexzf(cls)) {
            return true;
        }
        C0271Ujhhgtgfeyxiexzf c0271Ujhhgtgfeyxiexzf = C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf;
        return ((C2570Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).f8321Ujhhgtgfeyxiexzf.containsKey(str) && ((C2570Ujhhgtgfeyxiexzf) c0271Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3827Ujhhgtgfeyxiexzf(str) != null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛱfeyxiexzfᛱᛲ, reason: contains not printable characters */
    public static Object m542Ujhhgtgfeyxiexzf(Class cls, Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C1863Ujhhgtgfeyxiexzf {
        Object[] objArr2 = new Object[objArr.length + 2];
        objArr2[0] = runnableC0026Ujhhgtgfeyxiexzf;
        objArr2[1] = c2637feyxiexzfUjhhgtg;
        System.arraycopy(objArr, 0, objArr2, 2, objArr.length);
        try {
            return m544feyxiexzfUjhhgtg(runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf(), cls, "invoke", objArr2, node);
        } catch (InvocationTargetException e) {
            throw new C1863Ujhhgtgfeyxiexzf("Error in compiled command: " + e.getCause(), e);
        } catch (C0958feyxiexzfUjhhgtg e2) {
            throw new C1863Ujhhgtgfeyxiexzf("Error invoking compiled command: " + e2, e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛴᛳᛱfeyxiexzfᛱ] */
    /* JADX WARN: Type inference failed for: r10v1, types: [上海高中ᛱ谢子非ᛱᛲᛴᛱUjhhgtgᛱ要点脸ᛳ能不能ᛱfeyxiexzfᛱ] */
    /* JADX WARN: Type inference failed for: r10v23, types: [上海高中ᛱ谢子非ᛱᛱUjhhgtgᛱ要点脸ᛳᛱfeyxiexzfᛱ能不能ᛲᛴ] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1, types: [bsh.上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ] */
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
    /* JADX WARN: Type inference failed for: r6v1, types: [上海高中ᛱ谢子非ᛱ能不能ᛲᛴᛱfeyxiexzfᛱᛳᛱUjhhgtgᛱ要点脸] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [bsh.Node] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object[]] */
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛴᛳᛲᛱfeyxiexzfᛱ, reason: contains not printable characters */
    public static Object m543Ujhhgtgfeyxiexzf(Object obj, String str, Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C3353Ujhhgtgfeyxiexzf {
        ?? r6;
        ?? r7;
        ?? r10;
        ?? r8;
        ?? r9;
        ?? r4;
        ?? r5;
        if ((obj instanceof This) && !This.isExposedThisMethod(str)) {
            return ((This) obj).invokeMethod(str, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, false);
        }
        C2809Ujhhgtgfeyxiexzf c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf = runnableC0026Ujhhgtgfeyxiexzf.f519Ujhhgtgfeyxiexzf.m364Ujhhgtgfeyxiexzf();
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
                } catch (C1863Ujhhgtgfeyxiexzf e) {
                    r10 = e;
                    r9 = c2637feyxiexzfUjhhgtg;
                    r8 = node;
                    throw r10.mo2569Ujhhgtgfeyxiexzf(r8, r9);
                }
            }
            Object obj2 = obj;
            r6 = str;
            r7 = objArr;
            Class<?> cls = type;
            try {
                ?? M549feyxiexzfUjhhgtg = m549feyxiexzfUjhhgtg(c2809UjhhgtgfeyxiexzfM364Ujhhgtgfeyxiexzf, cls, obj2, r6, r7, false);
                r4 = r6;
                r5 = r7;
                try {
                    C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf = m539Ujhhgtgfeyxiexzf(obj2);
                    if (c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf != null) {
                        c0029UjhhgtgfeyxiexzfM539Ujhhgtgfeyxiexzf.f547Ujhhgtgfeyxiexzf = node;
                    }
                    return M549feyxiexzfUjhhgtg.mo1969Ujhhgtgfeyxiexzf(obj2, r5);
                } catch (InvocationTargetException e2) {
                    e = e2;
                    throw m553feyxiexzfUjhhgtg(e, r4, c2637feyxiexzfUjhhgtg, node);
                } catch (C0958feyxiexzfUjhhgtg e3) {
                    e = e3;
                    C0958feyxiexzfUjhhgtg c0958feyxiexzfUjhhgtg = e;
                    try {
                        if (obj2 == Primitive.VOID) {
                            throw new C3353Ujhhgtgfeyxiexzf("Attempt to invoke method: " + r4 + "() on undefined", node, c2637feyxiexzfUjhhgtg, c0958feyxiexzfUjhhgtg);
                        }
                        ?? M366Ujhhgtgfeyxiexzf = c2637feyxiexzfUjhhgtg.m3973Ujhhgtgfeyxiexzf().m366Ujhhgtgfeyxiexzf(type, r4, AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(r5));
                        if (M366Ujhhgtgfeyxiexzf != 0) {
                            return M366Ujhhgtgfeyxiexzf.m316Ujhhgtgfeyxiexzf(r5, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node, false, obj2);
                        }
                        C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg;
                        Node node2 = node;
                        Object obj3 = obj2;
                        if (z) {
                            try {
                                if (!AbstractC0034Ujhhgtgfeyxiexzf.m574Ujhhgtgfeyxiexzf(obj3)) {
                                    return m543Ujhhgtgfeyxiexzf(obj3, r4, r5, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg2, node2);
                                }
                                try {
                                    return m547feyxiexzfUjhhgtg(obj3, type, r4, r5, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg2, node2);
                                } catch (C1863Ujhhgtgfeyxiexzf e4) {
                                    e = e4;
                                    r6 = c2637feyxiexzfUjhhgtg2;
                                    r7 = node2;
                                    r10 = e;
                                    r9 = r6;
                                    r8 = r7;
                                    throw r10.mo2569Ujhhgtgfeyxiexzf(r8, r9);
                                } catch (C1985Ujhhgtgfeyxiexzf e5) {
                                    e = e5;
                                    throw e;
                                } catch (C3353Ujhhgtgfeyxiexzf unused) {
                                    c2637feyxiexzfUjhhgtg2 = c2637feyxiexzfUjhhgtg2;
                                    node2 = node2;
                                    throw new C3353Ujhhgtgfeyxiexzf("Error in method invocation: " + c0958feyxiexzfUjhhgtg.getMessage(), node2, c2637feyxiexzfUjhhgtg2, c0958feyxiexzfUjhhgtg);
                                }
                            } catch (C1985Ujhhgtgfeyxiexzf e6) {
                                e = e6;
                            } catch (C3353Ujhhgtgfeyxiexzf unused2) {
                            }
                            throw e;
                        }
                        throw new C3353Ujhhgtgfeyxiexzf("Error in method invocation: " + c0958feyxiexzfUjhhgtg.getMessage(), node2, c2637feyxiexzfUjhhgtg2, c0958feyxiexzfUjhhgtg);
                    } catch (C1863Ujhhgtgfeyxiexzf e7) {
                        e = e7;
                    }
                    r10 = e;
                    r9 = r6;
                    r8 = r7;
                    throw r10.mo2569Ujhhgtgfeyxiexzf(r8, r9);
                }
            } catch (InvocationTargetException e8) {
                e = e8;
                r4 = r6;
            } catch (C0958feyxiexzfUjhhgtg e9) {
                e = e9;
                type = cls;
                obj2 = obj2;
                r4 = r6;
                r5 = r7;
            }
        } catch (C1863Ujhhgtgfeyxiexzf e10) {
            e = e10;
            r6 = c2637feyxiexzfUjhhgtg;
            r7 = node;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛳᛴ, reason: contains not printable characters */
    public static Object m544feyxiexzfUjhhgtg(C2809Ujhhgtgfeyxiexzf c2809Ujhhgtgfeyxiexzf, Class cls, String str, Object[] objArr, Node node) {
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("invoke static Method");
        C0029Ujhhgtgfeyxiexzf c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf = m538Ujhhgtgfeyxiexzf(cls);
        if (c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf != null) {
            c0029UjhhgtgfeyxiexzfM538Ujhhgtgfeyxiexzf.f547Ujhhgtgfeyxiexzf = node;
        }
        return m549feyxiexzfUjhhgtg(c2809Ujhhgtgfeyxiexzf, cls, null, str, objArr, true).mo1969Ujhhgtgfeyxiexzf(null, objArr);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲᛴᛳ, reason: contains not printable characters */
    public static boolean m545feyxiexzfUjhhgtg(Class cls) {
        return (cls == null || cls == InterfaceC3567Ujhhgtgfeyxiexzf.class || !InterfaceC3567Ujhhgtgfeyxiexzf.class.isAssignableFrom(cls)) ? false : true;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛲᛴ, reason: contains not printable characters */
    public static void m546feyxiexzfUjhhgtg(String str, AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf, Object[] objArr) {
        if (((Boolean) RunnableC0026Ujhhgtgfeyxiexzf.f514Ujhhgtgfeyxiexzf.get()).booleanValue()) {
            RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf(str, abstractC0695Ujhhgtgfeyxiexzf, " with args:");
            for (int i = 0; i < objArr.length; i++) {
                Object obj = objArr[i];
                RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("args[", Integer.valueOf(i), "] = ", obj, " type = ", obj == null ? "<unknown>" : obj.getClass());
            }
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛳᛴᛲ, reason: contains not printable characters */
    public static Object m547feyxiexzfUjhhgtg(Object obj, Class cls, String str, Object[] objArr, RunnableC0026Ujhhgtgfeyxiexzf runnableC0026Ujhhgtgfeyxiexzf, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) throws C3353Ujhhgtgfeyxiexzf {
        Class<BigInteger> cls2 = AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(obj) ? BigDecimal.class : BigInteger.class;
        try {
            Object objM543Ujhhgtgfeyxiexzf = m543Ujhhgtgfeyxiexzf(Primitive.castWrapper(cls2, obj), str, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node);
            return ((objM543Ujhhgtgfeyxiexzf instanceof Primitive) && ((Primitive) objM543Ujhhgtgfeyxiexzf).getType() == cls2) ? Primitive.wrap(Primitive.castWrapper(cls, objM543Ujhhgtgfeyxiexzf), (Class<?>) cls) : objM543Ujhhgtgfeyxiexzf;
        } catch (C1985Ujhhgtgfeyxiexzf e) {
            e.m4858Ujhhgtgfeyxiexzf("Method found on " + cls2.getSimpleName() + " but with error");
            throw e;
        } catch (C3353Ujhhgtgfeyxiexzf unused) {
            Class cls3 = AbstractC0034Ujhhgtgfeyxiexzf.m569Ujhhgtgfeyxiexzf(obj) ? BigInteger.class : BigDecimal.class;
            Object objM543Ujhhgtgfeyxiexzf2 = m543Ujhhgtgfeyxiexzf(Primitive.castWrapper(cls3, obj), str, objArr, runnableC0026Ujhhgtgfeyxiexzf, c2637feyxiexzfUjhhgtg, node);
            return ((objM543Ujhhgtgfeyxiexzf2 instanceof Primitive) && ((Primitive) objM543Ujhhgtgfeyxiexzf2).getType() == cls3) ? Primitive.wrap(Primitive.castWrapper(cls, objM543Ujhhgtgfeyxiexzf2), (Class<?>) cls) : objM543Ujhhgtgfeyxiexzf2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛲᛳ, reason: contains not printable characters */
    public static AbstractC0695Ujhhgtgfeyxiexzf m548feyxiexzfUjhhgtg(Class cls, String str, boolean z) {
        ConcurrentHashMap concurrentHashMap = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).f8322Ujhhgtgfeyxiexzf;
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = !concurrentHashMap.containsKey(str) ? null : (AbstractC0695Ujhhgtgfeyxiexzf) concurrentHashMap.get(str);
        if (abstractC0695Ujhhgtgfeyxiexzf == null) {
            StringBuilder sbM2419Ujhhgtgfeyxiexzf = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("No such field: ", str, " for class: ");
            sbM2419Ujhhgtgfeyxiexzf.append(cls.getName());
            throw new C0958feyxiexzfUjhhgtg(sbM2419Ujhhgtgfeyxiexzf.toString());
        }
        if (!z || abstractC0695Ujhhgtgfeyxiexzf.mo1972Ujhhgtgfeyxiexzf()) {
            return abstractC0695Ujhhgtgfeyxiexzf;
        }
        StringBuilder sbM2419Ujhhgtgfeyxiexzf2 = AbstractC0924feyxiexzfUjhhgtg.m2419Ujhhgtgfeyxiexzf("Can't reach instance field: ", str, " from static context: ");
        sbM2419Ujhhgtgfeyxiexzf2.append(cls.getName());
        throw new C1863Ujhhgtgfeyxiexzf(sbM2419Ujhhgtgfeyxiexzf2.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴᛳᛲ, reason: contains not printable characters */
    public static AbstractC0695Ujhhgtgfeyxiexzf m549feyxiexzfUjhhgtg(C2809Ujhhgtgfeyxiexzf c2809Ujhhgtgfeyxiexzf, Class cls, Object obj, String str, Object[] objArr, boolean z) throws C1862Ujhhgtgfeyxiexzf {
        if (obj == Primitive.NULL) {
            NullPointerException nullPointerException = new NullPointerException(AbstractC3317feyxiexzfUjhhgtg.m4801Ujhhgtgfeyxiexzf("Attempt to invoke method ", str, " on null value"));
            throw new C1862Ujhhgtgfeyxiexzf(nullPointerException.getMessage(), nullPointerException);
        }
        Class[] clsArrM563Ujhhgtgfeyxiexzf = AbstractC0034Ujhhgtgfeyxiexzf.m563Ujhhgtgfeyxiexzf(objArr);
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg = m550feyxiexzfUjhhgtg(cls, str, clsArrM563Ujhhgtgfeyxiexzf, z);
        if (abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg != null) {
            return abstractC0695UjhhgtgfeyxiexzfM550feyxiexzfUjhhgtg;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(z ? "Static method " : "Method ");
        sb.append(AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(str, clsArrM563Ujhhgtgfeyxiexzf));
        sb.append(" not found in class'");
        sb.append(cls.getName());
        sb.append("'");
        throw new C0958feyxiexzfUjhhgtg(sb.toString());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛳᛴ, reason: contains not printable characters */
    public static AbstractC0695Ujhhgtgfeyxiexzf m550feyxiexzfUjhhgtg(Class cls, String str, Class[] clsArr, boolean z) {
        if (cls == null) {
            throw new C0712Ujhhgtgfeyxiexzf("null class");
        }
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3826Ujhhgtgfeyxiexzf(str, clsArr);
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("resolved java method: ", abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf, " on class: ", cls);
        if (abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf == null || !z || abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1972Ujhhgtgfeyxiexzf()) {
            return abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf;
        }
        throw new C1863Ujhhgtgfeyxiexzf("Cannot reach instance method: " + AbstractC3594Ujhhgtgfeyxiexzf.m5187Ujhhgtgfeyxiexzf(abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf, abstractC0695UjhhgtgfeyxiexzfM3826Ujhhgtgfeyxiexzf.mo1967Ujhhgtgfeyxiexzf()) + " from static context: " + cls.getName());
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛱUjhhgtgᛱᛴᛳ, reason: contains not printable characters */
    public static Object m551feyxiexzfUjhhgtg(Object obj, Object obj2, Object obj3) {
        Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
        if (obj instanceof Map) {
            return ((Map) obj).put(obj2, Primitive.unwrap(obj3));
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (obj2.equals(entry.getKey())) {
                return entry.setValue(Primitive.unwrap(obj3));
            }
            throw new C0958feyxiexzfUjhhgtg("No such property setter: " + obj2 + " for type: " + AbstractC3594Ujhhgtgfeyxiexzf.m5197feyxiexzfUjhhgtg(obj));
        }
        Class<?> cls = obj.getClass();
        if (AbstractC0034Ujhhgtgfeyxiexzf.m575Ujhhgtgfeyxiexzf(cls)) {
            return m529Ujhhgtgfeyxiexzf(obj2, (Map.Entry[]) obj).setValue(Primitive.unwrap(obj3));
        }
        if (obj instanceof Class) {
            cls = (Class) obj;
        }
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695UjhhgtgfeyxiexzfM3827Ujhhgtgfeyxiexzf = ((C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls)).m3827Ujhhgtgfeyxiexzf(obj2.toString());
        if (abstractC0695UjhhgtgfeyxiexzfM3827Ujhhgtgfeyxiexzf != null) {
            try {
                return abstractC0695UjhhgtgfeyxiexzfM3827Ujhhgtgfeyxiexzf.mo1969Ujhhgtgfeyxiexzf(obj, Primitive.unwrap(obj3));
            } catch (InvocationTargetException e) {
                throw new C0958feyxiexzfUjhhgtg("Property accessor threw exception: " + e.getCause(), e.getCause());
            }
        }
        throw new C0958feyxiexzfUjhhgtg("No such property setter: " + obj2 + " for type: " + AbstractC3594Ujhhgtgfeyxiexzf.m5196feyxiexzfUjhhgtg(cls));
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛱUjhhgtgᛱᛴ, reason: contains not printable characters */
    public static C0021Ujhhgtgfeyxiexzf m552feyxiexzfUjhhgtg(Class cls, String str) {
        C2570Ujhhgtgfeyxiexzf c2570Ujhhgtgfeyxiexzf = (C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls);
        AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf = !c2570Ujhhgtgfeyxiexzf.f8321Ujhhgtgfeyxiexzf.containsKey(str) ? null : (AbstractC0695Ujhhgtgfeyxiexzf) c2570Ujhhgtgfeyxiexzf.m3828Ujhhgtgfeyxiexzf(str).stream().filter(new C2574Ujhhgtgfeyxiexzf(0)).findFirst().get();
        if (abstractC0695Ujhhgtgfeyxiexzf != null) {
            return new C0021Ujhhgtgfeyxiexzf(abstractC0695Ujhhgtgfeyxiexzf, null);
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱfeyxiexzfᛱᛲᛳᛴᛱUjhhgtgᛱ, reason: contains not printable characters */
    public static C1985Ujhhgtgfeyxiexzf m553feyxiexzfUjhhgtg(InvocationTargetException invocationTargetException, String str, C2637feyxiexzfUjhhgtg c2637feyxiexzfUjhhgtg, Node node) {
        String strM2711Ujhhgtgfeyxiexzf = AbstractC1225feyxiexzfUjhhgtg.m2711Ujhhgtgfeyxiexzf("Method Invocation ", str);
        Throwable cause = invocationTargetException.getCause();
        boolean z = true;
        if ((cause instanceof C3353Ujhhgtgfeyxiexzf) && (!(cause instanceof C1985Ujhhgtgfeyxiexzf) || !((C1985Ujhhgtgfeyxiexzf) cause).f6551Ujhhgtgfeyxiexzf)) {
            z = false;
        }
        return new C1985Ujhhgtgfeyxiexzf(strM2711Ujhhgtgfeyxiexzf, cause, node, c2637feyxiexzfUjhhgtg, z);
    }
}
