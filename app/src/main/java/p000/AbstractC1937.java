package p000;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Executable;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲈᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1937 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1227 f6392 = new C1227(29);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1331 m3733(C0271 c0271, AbstractC1928 abstractC1928, C1927 c1927) {
        return m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(c0271, c1927, "name", abstractC1928.name, new C0184(23)), c1927, "nameCondition", abstractC1928.f6371, new C0184(24)), c1927, "modifiers", abstractC1928.f6372, new C0184(26)), c1927, "modifiersNot", abstractC1928.f6373, new C0184(27)), c1927, "modifiersCondition", null, new C0184(28)), c1927, "isSynthetic", null, new C0184(29)), c1927, "isSyntheticNot", null, new C1933(0)), c1927, "annotations", abstractC1928.f6374, new C1931(c1927, 15)), c1927, "annotationsNot", abstractC1928.f6375, new C1931(c1927, 16)), c1927, "genericString", null, new C1933(1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int m3734(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String m3735(int i, String str) {
        int iM3734 = i - m3734(str);
        return iM3734 > 0 ? AbstractC2784.m4748(str, AbstractC2849.m4856(iM3734, " ")) : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static boolean m3736(Collection collection, List list, C1927 c1927) {
        if (collection.size() == list.size()) {
            ArrayList arrayList = new ArrayList(AbstractC0746.m2214(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m3751(it.next(), c1927, null));
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0745.m2213();
                    throw null;
                }
                Class cls = (Class) obj;
                Class cls2 = (Class) list.get(i);
                Class<C3529> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(C3529.class));
                if (AbstractC2207.m4087(cls, clsM2183 != null ? clsM2183 : C3529.class) || AbstractC2207.m4087(cls2, cls)) {
                    arrayList2.add(obj);
                }
                i = i2;
            }
            if (arrayList2.size() == list.size()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static C1331 m3737(C1331 c1331, AbstractC1240 abstractC1240, C1927 c1927) {
        return m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(m3746(c1331, c1927, "parameters", abstractC1240.f4480, new C1931(c1927, 1)), c1927, "parametersNot", abstractC1240.f4481, new C1931(c1927, 7)), c1927, "parametersCondition", abstractC1240.f4482, new C0184(16)), c1927, "parameterCount", abstractC1240.f4485, new C0184(18)), c1927, "parameterCountCondition", null, new C0184(19)), c1927, "typeParameters", abstractC1240.f4483, new C0184(20)), c1927, "typeParametersNot", abstractC1240.f4484, new C0184(21)), c1927, "exceptionTypes", abstractC1240.f4486, new C1931(c1927, 13)), c1927, "exceptionTypesNot", abstractC1240.f4487, new C1931(c1927, 14)), c1927, "genericExceptionTypes", abstractC1240.f4488, new C0184(22)), c1927, "genericExceptionTypesNot", abstractC1240.f4489, new C0184(10)), c1927, "genericParameters", abstractC1240.f4490, new C0184(11)), c1927, "genericParametersNot", abstractC1240.f4491, new C0184(12)), c1927, "isVarArgs", null, new C0184(13)), c1927, "isVarArgsNot", null, new C0184(14)), c1927, "parameterAnnotations", abstractC1240.f4492, new C1931(c1927, 2)), c1927, "parameterAnnotationsNot", abstractC1240.f4493, new C1931(c1927, 3)), c1927, "annotatedReturnType", abstractC1240.f4494, new C1931(c1927, 4)), c1927, "annotatedReturnTypeNot", abstractC1240.f4495, new C1931(c1927, 5)), c1927, "annotatedReceiverType", abstractC1240.f4496, new C1931(c1927, 6)), c1927, "annotatedReceiverTypeNot", abstractC1240.f4497, new C1931(c1927, 8)), c1927, "annotatedParameterTypes", abstractC1240.f4498, new C1931(c1927, 9)), c1927, "annotatedParameterTypesNot", abstractC1240.f4499, new C1931(c1927, 10)), c1927, "annotatedExceptionTypes", abstractC1240.f4500, new C1931(c1927, 11)), c1927, "annotatedExceptionTypesNot", abstractC1240.f4501, new C1931(c1927, 12));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final boolean m3738(C1927 c1927, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0743.m2180(annotation).mo2114());
        }
        return m3736(set, arrayList, c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final boolean m3739(C1927 c1927, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0743.m2180(annotation).mo2114());
        }
        return !m3736(set, arrayList, c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final boolean m3740(C1927 c1927, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0743.m2180(annotation).mo2114());
        }
        return m3736(set, arrayList, c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final boolean m3741(C1927 c1927, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC0743.m2180(annotation).mo2114());
        }
        return !m3736(set, arrayList, c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final boolean m3742(C1927 c1927, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC0743.m2180(annotation).mo2114());
            }
            arrayList.add(arrayList2);
        }
        return m3736(set, AbstractC0746.m2215(arrayList), c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final boolean m3743(C1927 c1927, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC0743.m2180(annotation).mo2114());
            }
            arrayList.add(arrayList2);
        }
        return !m3736(set, AbstractC0746.m2215(arrayList), c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean m3744(C1927 c1927, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC0743.m2180(annotation).mo2114());
            }
            arrayList.add(arrayList2);
        }
        return m3736(set, AbstractC0746.m2215(arrayList), c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean m3745(C1927 c1927, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC0743.m2180(annotation).mo2114());
            }
            arrayList.add(arrayList2);
        }
        return !m3736(set, AbstractC0746.m2215(arrayList), c1927);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C1331 m3746(InterfaceC2650 interfaceC2650, C1927 c1927, String str, Object obj, InterfaceC1429 interfaceC1429) {
        return AbstractC2652.m4654(interfaceC2650, new C1932(obj, interfaceC1429, c1927, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Annotation[] m3747(Member member) {
        if (member instanceof AnnotatedElement) {
            return ((AnnotatedElement) member).getDeclaredAnnotations();
        }
        throw new IllegalStateException(("Unsupported member type: " + member).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static List m3748(AbstractC1928 abstractC1928, C1927 c1927, Class cls, InterfaceC1425 interfaceC1425) throws NoSuchFieldException, NoSuchMethodException {
        List listM3748 = C1189.f4329;
        if (cls != null) {
            Class<Object> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Object.class));
            if (!cls.equals(clsM2183 != null ? clsM2183 : Object.class)) {
                Collection collection = (Collection) interfaceC1425.invoke(cls);
                if (collection.isEmpty()) {
                    if (c1927.f6367) {
                        listM3748 = m3748(abstractC1928, c1927, cls.getSuperclass(), interfaceC1425);
                    } else {
                        m3749(abstractC1928, c1927);
                    }
                    collection = listM3748;
                }
                return (List) collection;
            }
        }
        m3749(abstractC1928, c1927);
        return listM3748;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m3749(AbstractC1928 abstractC1928, C1927 c1927) throws NoSuchFieldException, NoSuchMethodException {
        String strM3750;
        boolean z = abstractC1928 instanceof MethodResolver;
        if (z) {
            strM3750 = m3750(c1927, abstractC1928, "method");
        } else if (abstractC1928 instanceof C0796) {
            strM3750 = m3750(c1927, abstractC1928, "constructor");
        } else {
            if (!(abstractC1928 instanceof C1299)) {
                throw new IllegalStateException(("Unsupported condition type: " + abstractC1928).toString());
            }
            strM3750 = m3750(c1927, abstractC1928, "field");
        }
        int i = c1927.f6368;
        if (i != 1) {
            if (i == 2) {
                C2873 c2873 = C1747.f5845;
                C1747.m3496(AbstractC2841.m4848(strM3750).toString(), null);
                return;
            }
            return;
        }
        if (z) {
            throw new NoSuchMethodException(AbstractC2784.m4748(strM3750, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        if (abstractC1928 instanceof C0796) {
            throw new NoSuchMethodException(AbstractC2784.m4748(strM3750, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        if (true) {
            throw new NoSuchFieldException(AbstractC2784.m4748(strM3750, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        throw new IllegalStateException(("Unsupported condition type: " + abstractC1928).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String m3750(C1927 c1927, AbstractC1928 abstractC1928, String str) {
        String strConcat;
        String strM5113;
        boolean z = c1927.f6367;
        Class cls = c1927.f6364;
        String str2 = z ? " (Also tried for superclass)" : "";
        try {
            Map mapMo2886 = abstractC1928.mo2886();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo2886.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM5113 = value instanceof InterfaceC1436 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : C3529.m5113(value);
                }
                String strM4857 = strM5113 != null ? AbstractC2849.m4857(strM5113.toString(), " (Kotlin reflection is not available)", "") : null;
                C2315 c2315 = strM4857 != null ? new C2315(str3, strM4857) : null;
                if (c2315 != null) {
                    arrayList.add(c2315);
                }
            }
            if (arrayList.isEmpty()) {
                strConcat = cls.toString();
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                final int iM3734 = m3734((String) ((C2315) it.next()).f7445);
                while (it.hasNext()) {
                    int iM3735 = m3734((String) ((C2315) it.next()).f7445);
                    if (iM3734 < iM3735) {
                        iM3734 = iM3735;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM3736 = m3734((String) ((C2315) it2.next()).f7446);
                while (it2.hasNext()) {
                    int iM3737 = m3734((String) ((C2315) it2.next()).f7446);
                    if (iM3736 < iM3737) {
                        iM3736 = iM3737;
                    }
                }
                String strM4858 = AbstractC2849.m4857(cls.toString(), " (Kotlin reflection is not available)", "");
                int iM3738 = m3734(strM4858) - ((iM3734 + iM3736) + 3);
                if (iM3738 < 0) {
                    iM3738 = 0;
                }
                final int i = iM3736 + iM3738;
                String str4 = "+-" + AbstractC2849.m4856(iM3734, "-") + "-+-" + AbstractC2849.m4856(i, "-") + "-+";
                int i2 = iM3734 + i + 3;
                strConcat = AbstractC0744.m2196(AbstractC0745.listOf("+-" + AbstractC2849.m4856(i2, "-") + "-+", "| " + m3735(i2, strM4858) + " |", str4, AbstractC0744.m2196(arrayList, "\n", null, null, new InterfaceC1425() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲇᲀᤝᲈᛸ
                    @Override // p000.InterfaceC1425
                    public final Object invoke(Object obj) {
                        C2315 c2316 = (C2315) obj;
                        String str5 = (String) c2316.f7445;
                        String str6 = (String) c2316.f7446;
                        return "| " + AbstractC1937.m3735(iM3734, str5) + " | " + AbstractC1937.m3735(i, str6) + " |";
                    }
                }, 30), str4), "\n", null, null, null, 62);
            }
        } catch (Throwable unused) {
            strConcat = AbstractC2849.m4857(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        }
        return "No " + str + " found matching the condition for current class" + str2 + ".\n" + strConcat + "\nSuggestion: " + (!c1927.f6367 ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static Class m3751(Object obj, C1927 c1927, String str) {
        Class clsM2133;
        if (obj instanceof Class) {
            clsM2133 = (Class) obj;
        } else if (obj instanceof InterfaceC1736) {
            clsM2133 = ((InterfaceC0696) ((InterfaceC1736) obj)).mo2114();
        } else if (obj instanceof String) {
            int i = c1927.f6368;
            Class cls = c1927.f6364;
            if (i == 1) {
                clsM2133 = AbstractC0710.m2130(cls.getClassLoader(), (String) obj);
            } else {
                clsM2133 = AbstractC0710.m2133((String) obj, cls.getClassLoader(), 2);
                if (clsM2133 == null) {
                    clsM2133 = Object.class;
                    Class clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(Object.class));
                    if (clsM2183 != null) {
                        clsM2133 = clsM2183;
                    }
                }
            }
        } else {
            if (!(obj instanceof C3529)) {
                throw new IllegalStateException(("Unsupported type: " + obj + ", supported types are Class, KClass, String and VagueType.").toString());
            }
            clsM2133 = obj.getClass();
        }
        Class<C3529> clsM2184 = AbstractC0743.m2183(AbstractC2519.classToKClass(C3529.class));
        if (!AbstractC2207.m4087(clsM2133, clsM2184 != null ? clsM2184 : C3529.class) || str == null) {
            return clsM2133;
        }
        throw new IllegalStateException(("VagueType is not supported for \"" + str + "\".").toString());
    }
}
