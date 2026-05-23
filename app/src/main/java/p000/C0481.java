package p000;

import bsh.AbstractC0009;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᤝᲀᤞᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0481 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final ConcurrentHashMap f2090 = new ConcurrentHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final ConcurrentHashMap f2091 = new ConcurrentHashMap();

    public C0481(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC0009.f516;
            if ((C0561.m1955() || !AbstractC0009.f520.matcher(superclass.getName()).matches()) && ((AbstractC0009.f519.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C0561.m1955())) {
                C0481 c0481 = cls == superclass ? null : (C0481) C0482.f2092.m3641(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C0561.m1955()) {
                        C1297 c1297 = new C1297(field);
                        ConcurrentHashMap concurrentHashMap = this.f2091;
                        String str = c1297.f5644;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c1297);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C0561.m1955()) {
                        if (cls == superclass) {
                            m1714(new C1980(method));
                        } else {
                            m1714(c0481.m1717(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m1714(new C0797(constructor));
                    } else {
                        m1714(c0481.m1717(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m1720(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final void m1714(AbstractC1672 abstractC1672) {
        if (abstractC1672 == null) {
            return;
        }
        boolean zMo3401 = abstractC1672.mo3401();
        String str = abstractC1672.f5644;
        if (!zMo3401 && !abstractC1672.mo3402()) {
            m1715(str, abstractC1672);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m1715(str, abstractC1672)) {
            m1715(strReplaceFirst, abstractC1672);
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean m1715(String str, AbstractC1672 abstractC1672) {
        ConcurrentHashMap concurrentHashMap = this.f2090;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC1672)) == null;
        }
        if (m1719(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m1719(str)));
        }
        return m1719(str).add(abstractC1672);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final AbstractC1672 m1716(String str) {
        if (!this.f2090.containsKey(str)) {
            return null;
        }
        for (AbstractC1672 abstractC1672 : m1719(str)) {
            if (abstractC1672.mo3401()) {
                return abstractC1672;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final AbstractC1672 m1717(String str, Class... clsArr) {
        if (!this.f2090.containsKey(str)) {
            return null;
        }
        List listM1719 = m1719(str);
        if (listM1719.isEmpty()) {
            return null;
        }
        if (listM1719.size() == 1) {
            return (AbstractC1672) listM1719.get(0);
        }
        Object[] objArr = AbstractC0009.f516;
        RunnableC1668.m3389("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM379 = AbstractC0009.m379(clsArr, listM1719);
        if (iM379 == -1) {
            return null;
        }
        return (AbstractC1672) listM1719.get(iM379);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final AbstractC1672 m1718(String str) {
        if (!this.f2090.containsKey(str)) {
            return null;
        }
        for (AbstractC1672 abstractC1672 : m1719(str)) {
            if (abstractC1672.mo3402()) {
                return abstractC1672;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final List m1719(String str) {
        return (List) this.f2090.get(str);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final void m1720(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC0009.f516;
            if (C0561.m1955() || !AbstractC0009.f520.matcher(cls.getName()).matches()) {
                C0481 c0481 = (C0481) C0482.f2092.m3641(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C1297 c1297 = new C1297(field);
                    ConcurrentHashMap concurrentHashMap = this.f2091;
                    String str = c1297.f5644;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c1297);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C0561.m1955()) {
                        m1714(c0481.m1717(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m1720(cls.getInterfaces());
        }
    }
}
