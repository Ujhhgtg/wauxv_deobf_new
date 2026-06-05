package p000;

import bsh.AbstractC0033Ujhhgtgfeyxiexzf;
import bsh.RunnableC0026Ujhhgtgfeyxiexzf;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱUjhhgtgᛱᛴᛱfeyxiexzfᛱ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2570Ujhhgtgfeyxiexzf {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final ConcurrentHashMap f8321Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final ConcurrentHashMap f8322Ujhhgtgfeyxiexzf = new ConcurrentHashMap();

    public C2570Ujhhgtgfeyxiexzf(Class cls) {
        Class superclass = cls;
        while (superclass != null) {
            Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if ((C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf() || !AbstractC0033Ujhhgtgfeyxiexzf.f586Ujhhgtgfeyxiexzf.matcher(superclass.getName()).matches()) && ((AbstractC0033Ujhhgtgfeyxiexzf.f585Ujhhgtgfeyxiexzf.matcher(superclass.getName()).matches() && !Modifier.isPrivate(superclass.getModifiers())) || Modifier.isPublic(superclass.getModifiers()) || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf())) {
                C2570Ujhhgtgfeyxiexzf c2570Ujhhgtgfeyxiexzf = cls == superclass ? null : (C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(superclass);
                for (Field field : superclass.getDeclaredFields()) {
                    if (Modifier.isPublic(field.getModifiers()) || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf()) {
                        C3440feyxiexzfUjhhgtg c3440feyxiexzfUjhhgtg = new C3440feyxiexzfUjhhgtg(field);
                        ConcurrentHashMap concurrentHashMap = this.f8322Ujhhgtgfeyxiexzf;
                        String str = c3440feyxiexzfUjhhgtg.f2846Ujhhgtgfeyxiexzf;
                        if (!concurrentHashMap.containsKey(str)) {
                            concurrentHashMap.put(str, c3440feyxiexzfUjhhgtg);
                        }
                    }
                }
                for (Method method : superclass.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf()) {
                        if (cls == superclass) {
                            m3823Ujhhgtgfeyxiexzf(new C0391Ujhhgtgfeyxiexzf(method));
                        } else {
                            m3823Ujhhgtgfeyxiexzf(c2570Ujhhgtgfeyxiexzf.m3826Ujhhgtgfeyxiexzf(method.getName(), method.getParameterTypes()));
                        }
                    }
                }
                for (Constructor<?> constructor : superclass.getDeclaredConstructors()) {
                    if (cls == superclass) {
                        m3823Ujhhgtgfeyxiexzf(new C3659Ujhhgtgfeyxiexzf(constructor));
                    } else {
                        m3823Ujhhgtgfeyxiexzf(c2570Ujhhgtgfeyxiexzf.m3826Ujhhgtgfeyxiexzf(constructor.getName(), constructor.getParameterTypes()));
                    }
                }
            }
            m3829Ujhhgtgfeyxiexzf(superclass.getInterfaces());
            superclass = superclass.getSuperclass();
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final void m3823Ujhhgtgfeyxiexzf(AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf) {
        if (abstractC0695Ujhhgtgfeyxiexzf == null) {
            return;
        }
        boolean zMo1642Ujhhgtgfeyxiexzf = abstractC0695Ujhhgtgfeyxiexzf.mo1642Ujhhgtgfeyxiexzf();
        String str = abstractC0695Ujhhgtgfeyxiexzf.f2846Ujhhgtgfeyxiexzf;
        if (!zMo1642Ujhhgtgfeyxiexzf && !abstractC0695Ujhhgtgfeyxiexzf.mo1643Ujhhgtgfeyxiexzf()) {
            m3824Ujhhgtgfeyxiexzf(str, abstractC0695Ujhhgtgfeyxiexzf);
            return;
        }
        String strReplaceFirst = str.replaceFirst("[gs]et|is", "");
        if (strReplaceFirst.length() == 1 || Character.isLowerCase(str.charAt(1))) {
            char[] charArray = strReplaceFirst.toCharArray();
            charArray[0] = Character.toLowerCase(charArray[0]);
            strReplaceFirst = new String(charArray);
        }
        if (m3824Ujhhgtgfeyxiexzf(str, abstractC0695Ujhhgtgfeyxiexzf)) {
            m3824Ujhhgtgfeyxiexzf(strReplaceFirst, abstractC0695Ujhhgtgfeyxiexzf);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final boolean m3824Ujhhgtgfeyxiexzf(String str, AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf) {
        ConcurrentHashMap concurrentHashMap = this.f8321Ujhhgtgfeyxiexzf;
        if (!concurrentHashMap.containsKey(str)) {
            return concurrentHashMap.put(str, Collections.singletonList(abstractC0695Ujhhgtgfeyxiexzf)) == null;
        }
        if (m3828Ujhhgtgfeyxiexzf(str).size() == 1) {
            concurrentHashMap.put(str, new ArrayList(m3828Ujhhgtgfeyxiexzf(str)));
        }
        return m3828Ujhhgtgfeyxiexzf(str).add(abstractC0695Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final AbstractC0695Ujhhgtgfeyxiexzf m3825Ujhhgtgfeyxiexzf(String str) {
        if (!this.f8321Ujhhgtgfeyxiexzf.containsKey(str)) {
            return null;
        }
        for (AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf : m3828Ujhhgtgfeyxiexzf(str)) {
            if (abstractC0695Ujhhgtgfeyxiexzf.mo1642Ujhhgtgfeyxiexzf()) {
                return abstractC0695Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final AbstractC0695Ujhhgtgfeyxiexzf m3826Ujhhgtgfeyxiexzf(String str, Class... clsArr) {
        if (!this.f8321Ujhhgtgfeyxiexzf.containsKey(str)) {
            return null;
        }
        List listM3828Ujhhgtgfeyxiexzf = m3828Ujhhgtgfeyxiexzf(str);
        if (listM3828Ujhhgtgfeyxiexzf.isEmpty()) {
            return null;
        }
        if (listM3828Ujhhgtgfeyxiexzf.size() == 1) {
            return (AbstractC0695Ujhhgtgfeyxiexzf) listM3828Ujhhgtgfeyxiexzf.get(0);
        }
        Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
        RunnableC0026Ujhhgtgfeyxiexzf.m330Ujhhgtgfeyxiexzf("find most specific Invocable for: " + Arrays.toString(clsArr));
        int iM523Ujhhgtgfeyxiexzf = AbstractC0033Ujhhgtgfeyxiexzf.m523Ujhhgtgfeyxiexzf(clsArr, listM3828Ujhhgtgfeyxiexzf);
        if (iM523Ujhhgtgfeyxiexzf == -1) {
            return null;
        }
        return (AbstractC0695Ujhhgtgfeyxiexzf) listM3828Ujhhgtgfeyxiexzf.get(iM523Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public final AbstractC0695Ujhhgtgfeyxiexzf m3827Ujhhgtgfeyxiexzf(String str) {
        if (!this.f8321Ujhhgtgfeyxiexzf.containsKey(str)) {
            return null;
        }
        for (AbstractC0695Ujhhgtgfeyxiexzf abstractC0695Ujhhgtgfeyxiexzf : m3828Ujhhgtgfeyxiexzf(str)) {
            if (abstractC0695Ujhhgtgfeyxiexzf.mo1643Ujhhgtgfeyxiexzf()) {
                return abstractC0695Ujhhgtgfeyxiexzf;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛳᛲ, reason: contains not printable characters */
    public final List m3828Ujhhgtgfeyxiexzf(String str) {
        return (List) this.f8321Ujhhgtgfeyxiexzf.get(str);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ, reason: contains not printable characters */
    public final void m3829Ujhhgtgfeyxiexzf(Class[] clsArr) {
        for (Class cls : clsArr) {
            Object[] objArr = AbstractC0033Ujhhgtgfeyxiexzf.f582Ujhhgtgfeyxiexzf;
            if (C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf() || !AbstractC0033Ujhhgtgfeyxiexzf.f586Ujhhgtgfeyxiexzf.matcher(cls.getName()).matches()) {
                C2570Ujhhgtgfeyxiexzf c2570Ujhhgtgfeyxiexzf = (C2570Ujhhgtgfeyxiexzf) C2809Ujhhgtgfeyxiexzf.f8930Ujhhgtgfeyxiexzf.m1463Ujhhgtgfeyxiexzf(cls);
                for (Field field : cls.getDeclaredFields()) {
                    C3440feyxiexzfUjhhgtg c3440feyxiexzfUjhhgtg = new C3440feyxiexzfUjhhgtg(field);
                    ConcurrentHashMap concurrentHashMap = this.f8322Ujhhgtgfeyxiexzf;
                    String str = c3440feyxiexzfUjhhgtg.f2846Ujhhgtgfeyxiexzf;
                    if (!concurrentHashMap.containsKey(str)) {
                        concurrentHashMap.put(str, c3440feyxiexzfUjhhgtg);
                    }
                }
                for (Method method : cls.getDeclaredMethods()) {
                    if (Modifier.isPublic(method.getModifiers()) || C2776Ujhhgtgfeyxiexzf.m4063Ujhhgtgfeyxiexzf()) {
                        m3823Ujhhgtgfeyxiexzf(c2570Ujhhgtgfeyxiexzf.m3826Ujhhgtgfeyxiexzf(method.getName(), method.getParameterTypes()));
                    }
                }
            }
            m3829Ujhhgtgfeyxiexzf(cls.getInterfaces());
        }
    }
}
