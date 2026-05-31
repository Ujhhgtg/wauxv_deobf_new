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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲇᛸᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1968 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1224 f6497 = new C1224(29);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static C1333 m3927(C0281 c0281, AbstractC1959 abstractC1959, C1958 c1958) {
        return m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(c0281, c1958, "name", abstractC1959.f6475, new C0192(23)), c1958, "nameCondition", abstractC1959.f6476, new C0192(24)), c1958, "modifiers", abstractC1959.f6477, new C0192(26)), c1958, "modifiersNot", abstractC1959.f6478, new C0192(27)), c1958, "modifiersCondition", null, new C0192(28)), c1958, "isSynthetic", null, new C0192(29)), c1958, "isSyntheticNot", null, new C1964(0)), c1958, "annotations", abstractC1959.f6479, new C1962(c1958, 15)), c1958, "annotationsNot", abstractC1959.f6480, new C1962(c1958, 16)), c1958, "genericString", null, new C1964(1));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final int m3928(String str) {
        long j = 0;
        for (int i = 0; i < str.length(); i++) {
            j += ((long) str.charAt(i)) > 127 ? 2L : 1L;
        }
        return (int) j;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final String m3929(int i, String str) {
        int iM3928 = i - m3928(str);
        return iM3928 > 0 ? AbstractC2844.m4782(str, AbstractC2909.m4917(iM3928, " ")) : str;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static boolean m3930(Collection collection, List list, C1958 c1958) {
        if (collection.size() == list.size()) {
            ArrayList arrayList = new ArrayList(AbstractC0741.m2313(collection, 10));
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(m3945(it.next(), c1958, null));
            }
            ArrayList arrayList2 = new ArrayList();
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    AbstractC0740.m2312();
                    throw null;
                }
                Class cls = (Class) obj;
                Class cls2 = (Class) list.get(i);
                Class<C3588> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(C3588.class));
                if (AbstractC1469.m3322(cls, clsM4232 != null ? clsM4232 : C3588.class) || AbstractC1469.m3322(cls2, cls)) {
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
    public static C1333 m3931(C1333 c1333, AbstractC1242 abstractC1242, C1958 c1958) {
        return m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(m3940(c1333, c1958, "parameters", abstractC1242.f4479, new C1962(c1958, 1)), c1958, "parametersNot", abstractC1242.f4480, new C1962(c1958, 7)), c1958, "parametersCondition", abstractC1242.f4481, new C0192(16)), c1958, "parameterCount", abstractC1242.f4484, new C0192(18)), c1958, "parameterCountCondition", null, new C0192(19)), c1958, "typeParameters", abstractC1242.f4482, new C0192(20)), c1958, "typeParametersNot", abstractC1242.f4483, new C0192(21)), c1958, "exceptionTypes", abstractC1242.f4485, new C1962(c1958, 13)), c1958, "exceptionTypesNot", abstractC1242.f4486, new C1962(c1958, 14)), c1958, "genericExceptionTypes", abstractC1242.f4487, new C0192(22)), c1958, "genericExceptionTypesNot", abstractC1242.f4488, new C0192(10)), c1958, "genericParameters", abstractC1242.f4489, new C0192(11)), c1958, "genericParametersNot", abstractC1242.f4490, new C0192(12)), c1958, "isVarArgs", null, new C0192(13)), c1958, "isVarArgsNot", null, new C0192(14)), c1958, "parameterAnnotations", abstractC1242.f4491, new C1962(c1958, 2)), c1958, "parameterAnnotationsNot", abstractC1242.f4492, new C1962(c1958, 3)), c1958, "annotatedReturnType", abstractC1242.f4493, new C1962(c1958, 4)), c1958, "annotatedReturnTypeNot", abstractC1242.f4494, new C1962(c1958, 5)), c1958, "annotatedReceiverType", abstractC1242.f4495, new C1962(c1958, 6)), c1958, "annotatedReceiverTypeNot", abstractC1242.f4496, new C1962(c1958, 8)), c1958, "annotatedParameterTypes", abstractC1242.f4497, new C1962(c1958, 9)), c1958, "annotatedParameterTypesNot", abstractC1242.f4498, new C1962(c1958, 10)), c1958, "annotatedExceptionTypes", abstractC1242.f4499, new C1962(c1958, 11)), c1958, "annotatedExceptionTypesNot", abstractC1242.f4500, new C1962(c1958, 12));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final boolean m3932(C1958 c1958, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC2236.m4230(annotation).mo2209());
        }
        return m3930(set, arrayList, c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public static final boolean m3933(C1958 c1958, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReturnType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC2236.m4230(annotation).mo2209());
        }
        return !m3930(set, arrayList, c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public static final boolean m3934(C1958 c1958, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC2236.m4230(annotation).mo2209());
        }
        return m3930(set, arrayList, c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public static final boolean m3935(C1958 c1958, Set set, Executable executable) {
        Annotation[] annotations = executable.getAnnotatedReceiverType().getAnnotations();
        ArrayList arrayList = new ArrayList(annotations.length);
        for (Annotation annotation : annotations) {
            arrayList.add(AbstractC2236.m4230(annotation).mo2209());
        }
        return !m3930(set, arrayList, c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public static final boolean m3936(C1958 c1958, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC2236.m4230(annotation).mo2209());
            }
            arrayList.add(arrayList2);
        }
        return m3930(set, AbstractC0741.m2314(arrayList), c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public static final boolean m3937(C1958 c1958, Set set, Executable executable) {
        AnnotatedType[] annotatedParameterTypes = executable.getAnnotatedParameterTypes();
        ArrayList arrayList = new ArrayList(annotatedParameterTypes.length);
        for (AnnotatedType annotatedType : annotatedParameterTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC2236.m4230(annotation).mo2209());
            }
            arrayList.add(arrayList2);
        }
        return !m3930(set, AbstractC0741.m2314(arrayList), c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public static final boolean m3938(C1958 c1958, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC2236.m4230(annotation).mo2209());
            }
            arrayList.add(arrayList2);
        }
        return m3930(set, AbstractC0741.m2314(arrayList), c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public static final boolean m3939(C1958 c1958, Set set, Executable executable) {
        AnnotatedType[] annotatedExceptionTypes = executable.getAnnotatedExceptionTypes();
        ArrayList arrayList = new ArrayList(annotatedExceptionTypes.length);
        for (AnnotatedType annotatedType : annotatedExceptionTypes) {
            Annotation[] annotations = annotatedType.getAnnotations();
            ArrayList arrayList2 = new ArrayList(annotations.length);
            for (Annotation annotation : annotations) {
                arrayList2.add(AbstractC2236.m4230(annotation).mo2209());
            }
            arrayList.add(arrayList2);
        }
        return !m3930(set, AbstractC0741.m2314(arrayList), c1958);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public static C1333 m3940(InterfaceC2711 interfaceC2711, C1958 c1958, String str, Object obj, InterfaceC1437 interfaceC1437) {
        return AbstractC2713.m4688(interfaceC2711, new C1963(obj, interfaceC1437, c1958, str));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public static Annotation[] m3941(Member member) {
        if (member instanceof AnnotatedElement) {
            return ((AnnotatedElement) member).getDeclaredAnnotations();
        }
        throw new IllegalStateException(("Unsupported member type: " + member).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public static List m3942(AbstractC1959 abstractC1959, C1958 c1958, Class cls, InterfaceC1433 interfaceC1433) throws NoSuchFieldException, NoSuchMethodException {
        List listM3942 = C1191.f4326;
        if (cls != null) {
            Class<Object> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(Object.class));
            if (!cls.equals(clsM4232 != null ? clsM4232 : Object.class)) {
                Collection collection = (Collection) interfaceC1433.invoke(cls);
                if (collection.isEmpty()) {
                    if (c1958.f6472) {
                        listM3942 = m3942(abstractC1959, c1958, cls.getSuperclass(), interfaceC1433);
                    } else {
                        m3943(abstractC1959, c1958);
                    }
                    collection = listM3942;
                }
                return (List) collection;
            }
        }
        m3943(abstractC1959, c1958);
        return listM3942;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲀᲁ, reason: contains not printable characters */
    public static void m3943(AbstractC1959 abstractC1959, C1958 c1958) throws NoSuchFieldException, NoSuchMethodException {
        String strM3944;
        boolean z = abstractC1959 instanceof C2004;
        if (z) {
            strM3944 = m3944(c1958, abstractC1959, "method");
        } else if (abstractC1959 instanceof C0795) {
            strM3944 = m3944(c1958, abstractC1959, "constructor");
        } else {
            if (!(abstractC1959 instanceof C1300)) {
                throw new IllegalStateException(("Unsupported condition type: " + abstractC1959).toString());
            }
            strM3944 = m3944(c1958, abstractC1959, "field");
        }
        int i = c1958.f6473;
        if (i != 1) {
            if (i == 2) {
                C2933 c2933 = C1770.f5907;
                C1770.m3652(AbstractC2901.m4882(strM3944).toString(), null);
                return;
            }
            return;
        }
        if (z) {
            throw new NoSuchMethodException(AbstractC2844.m4782(strM3944, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        if (abstractC1959 instanceof C0795) {
            throw new NoSuchMethodException(AbstractC2844.m4782(strM3944, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        if (abstractC1959 instanceof C1300) {
            throw new NoSuchFieldException(AbstractC2844.m4782(strM3944, "\nIf you want to ignore this exception, adding optional() in your condition.\n\n====== Generated by KavaRef 1.0.2 ======\n"));
        }
        throw new IllegalStateException(("Unsupported condition type: " + abstractC1959).toString());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲈᲁᲀ, reason: contains not printable characters */
    public static final String m3944(C1958 c1958, AbstractC1959 abstractC1959, String str) {
        String strConcat;
        String strM5125;
        boolean z = c1958.f6472;
        Class cls = c1958.f6469;
        String str2 = z ? " (Also tried for superclass)" : "";
        try {
            Map mapMo3005 = abstractC1959.mo3005();
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : mapMo3005.entrySet()) {
                String str3 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value != null) {
                    strM5125 = value instanceof InterfaceC1444 ? "(Runtime Condition)" : ((value instanceof Collection) && ((Collection) value).isEmpty()) ? null : C3588.m5125(value);
                }
                String strM4918 = strM5125 != null ? AbstractC2909.m4918(strM5125.toString(), " (Kotlin reflection is not available)", "") : null;
                C2348 c2348 = strM4918 != null ? new C2348(str3, strM4918) : null;
                if (c2348 != null) {
                    arrayList.add(c2348);
                }
            }
            if (arrayList.isEmpty()) {
                strConcat = cls.toString();
            } else {
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                final int iM3928 = m3928((String) ((C2348) it.next()).f7567);
                while (it.hasNext()) {
                    int iM3929 = m3928((String) ((C2348) it.next()).f7567);
                    if (iM3928 < iM3929) {
                        iM3928 = iM3929;
                    }
                }
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    throw new NoSuchElementException();
                }
                int iM39210 = m3928((String) ((C2348) it2.next()).f7568);
                while (it2.hasNext()) {
                    int iM39211 = m3928((String) ((C2348) it2.next()).f7568);
                    if (iM39210 < iM39211) {
                        iM39210 = iM39211;
                    }
                }
                String strM4919 = AbstractC2909.m4918(cls.toString(), " (Kotlin reflection is not available)", "");
                int iM39212 = m3928(strM4919) - ((iM3928 + iM39210) + 3);
                if (iM39212 < 0) {
                    iM39212 = 0;
                }
                final int i = iM39210 + iM39212;
                String str4 = "+-" + AbstractC2909.m4917(iM3928, "-") + "-+-" + AbstractC2909.m4917(i, "-") + "-+";
                int i2 = iM3928 + i + 3;
                strConcat = AbstractC0739.m2295(AbstractC0740.m2311("+-" + AbstractC2909.m4917(i2, "-") + "-+", "| " + m3929(i2, strM4919) + " |", str4, AbstractC0739.m2295(arrayList, "\n", null, null, new InterfaceC1433() { // from class: ᛱᛲᛳᛴᛵᛶᛷᤞᲁᲈᲀᤝᲇᛸ
                    @Override // p000.InterfaceC1433
                    public final Object invoke(Object obj) {
                        C2348 c2349 = (C2348) obj;
                        String str5 = (String) c2349.f7567;
                        String str6 = (String) c2349.f7568;
                        return "| " + AbstractC1968.m3929(iM3928, str5) + " | " + AbstractC1968.m3929(i, str6) + " |";
                    }
                }, 30), str4), "\n", null, null, null, 62);
            }
        } catch (Throwable unused) {
            strConcat = AbstractC2909.m4918(cls.toString(), " (Kotlin reflection is not available)", "").concat("\nFailed to build condition table.");
        }
        return "No " + str + " found matching the condition for current class" + str2 + ".\n" + strConcat + "\nSuggestion: " + (!c1958.f6472 ? "Members in superclass are not reflected in the current class, you can try adding superclass() in your condition and try again. " : "Check if the conditions are correct and valid, and try again. ");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲈᲀᲁᲇ, reason: contains not printable characters */
    public static Class m3945(Object obj, C1958 c1958, String str) {
        Class clsM2226;
        if (obj instanceof Class) {
            clsM2226 = (Class) obj;
        } else if (obj instanceof InterfaceC1760) {
            clsM2226 = ((InterfaceC0692) ((InterfaceC1760) obj)).mo2209();
        } else if (obj instanceof String) {
            int i = c1958.f6473;
            Class cls = c1958.f6469;
            if (i == 1) {
                clsM2226 = AbstractC0705.m2223(cls.getClassLoader(), (String) obj);
            } else {
                clsM2226 = AbstractC0705.m2226((String) obj, cls.getClassLoader(), 2);
                if (clsM2226 == null) {
                    clsM2226 = Object.class;
                    Class clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(clsM2226));
                    if (clsM4232 != null) {
                        clsM2226 = clsM4232;
                    }
                }
            }
        } else {
            if (!(obj instanceof C3588)) {
                throw new IllegalStateException(("Unsupported type: " + obj + ", supported types are Class, KClass, String and VagueType.").toString());
            }
            clsM2226 = obj.getClass();
        }
        Class<C3588> clsM4233 = AbstractC2236.m4232(AbstractC2574.m4549(C3588.class));
        if (!AbstractC1469.m3322(clsM2226, clsM4233 != null ? clsM4233 : C3588.class) || str == null) {
            return clsM2226;
        }
        throw new IllegalStateException(("VagueType is not supported for \"" + str + "\".").toString());
    }
}
