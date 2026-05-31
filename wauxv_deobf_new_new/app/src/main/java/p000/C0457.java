package p000;

import bsh.AbstractC0016;
import bsh.RunnableC0008;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᤞᲈᤝᲇᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0457 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap f2063 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap f2064 = new ConcurrentHashMap();

    public C0457(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC0016.f568;
            if ((C0538.m2050() || !AbstractC0016.f572.matcher(superclass.getName()).matches()) && ((AbstractC0016.f571.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C0538.m2050())) {
                C0457 c0457 = cls == superclass ? null : (C0457) C0458.f2065.m3819(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C0538.m2050()) {
                        C1298 c1298 = new C1298(field);
                        ConcurrentHashMap concurrentHashMap = this.f2064;
                        String str = c1298.f5671;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c1298);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C0538.m2050()) {
                        if (cls == superclass) {
                            m1822(new C2011(method));
                        } else {
                            m1822(c0457.m1825(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m1822(new C0796(constructor));
                    } else {
                        m1822(c0457.m1825(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m1828(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1822(AbstractC1687 abstractC1687) {
        if (abstractC1687 == null) {
            return;
        }
        boolean zMo3568 = abstractC1687.mo3568();
        String str = abstractC1687.f5671;
        if (!zMo3568 && !abstractC1687.mo3569()) {
            m1823(str, abstractC1687);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m1823(str, abstractC1687)) {
            m1823(strReplaceFirst, abstractC1687);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m1823(String str, AbstractC1687 abstractC1687) {
        ConcurrentHashMap concurrentHashMap = this.f2063;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC1687)) == null;
        }
        if (m1827(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m1827(str)));
        }
        return m1827(str).add(abstractC1687);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC1687 m1824(String str) {
        if (!this.f2063.containsKey(str)) {
            return null;
        }
        for (AbstractC1687 abstractC1687 : m1827(str)) {
            if (abstractC1687.mo3568()) {
                return abstractC1687;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC1687 m1825(String str, Class... clsArr) {
        if (!this.f2063.containsKey(str)) {
            return null;
        }
        List listM1827 = m1827(str);
        if (listM1827.isEmpty()) {
            return null;
        }
        if (listM1827.size() == 1) {
            return (AbstractC1687) listM1827.get(0);
        }
        Object[] objArr = AbstractC0016.f568;
        RunnableC0008.m333("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM524 = AbstractC0016.m524(clsArr, listM1827);
        if (iM524 == -1) {
            return null;
        }
        return (AbstractC1687) listM1827.get(iM524);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC1687 m1826(String str) {
        if (!this.f2063.containsKey(str)) {
            return null;
        }
        for (AbstractC1687 abstractC1687 : m1827(str)) {
            if (abstractC1687.mo3569()) {
                return abstractC1687;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List m1827(String str) {
        return (List) this.f2063.get(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1828(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC0016.f568;
            if (C0538.m2050() || !AbstractC0016.f572.matcher(cls.getName()).matches()) {
                C0457 c0457 = (C0457) C0458.f2065.m3819(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C1298 c1298 = new C1298(field);
                    ConcurrentHashMap concurrentHashMap = this.f2064;
                    String str = c1298.f5671;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c1298);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C0538.m2050()) {
                        m1822(c0457.m1825(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m1828(cls.getInterfaces());
        }
    }
}
