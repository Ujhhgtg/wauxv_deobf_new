package p000;

import bsh.AbstractC0010;
import bsh.Primitive;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᲈᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0496 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0495 f2133 = new C0495();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final WeakHashMap f2134 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static volatile int f2135 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public static final HashMap f2136 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final AbstractC2707 f2137;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Class f2138;

    public AbstractC0496(AbstractC2707 abstractC2707) {
        this.f2137 = abstractC2707;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0496.class.getName());
        sb.append("Type");
        int i = f2135;
        f2135 = i + 1;
        sb.append(i);
        String string = sb.toString();
        C0711 c0711 = new C0711();
        c0711.m2137(1537, string.replace(".", "/"), null, "java/lang/Object", null);
        C0495 c0495 = f2133;
        byte[] bArrM2136 = c0711.m2136();
        
        Class clsM1744 = AbstractC0499.m1744(string, bArrM2136);
        this.f2138 = clsM1744;
        f2134.put(this, clsM1744);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m1741(Class cls, Class cls2, int i) {
        Method methodM1742 = m1742(cls2);
        for (Map.Entry entry : f2134.entrySet()) {
            if (entry.getValue() == cls) {
                return ((AbstractC0496) entry.getKey()).mo1740(i, methodM1742);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static Method m1742(Class cls) {
        for (Method method : cls.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC0010.f522;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    return method;
                }
            }
        }
        throw new IllegalArgumentException("This class isn't a valid Functional Interface: ".concat(cls.getName()));
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        AbstractC2707 abstractC2707 = this.f2137;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo1739(objArr)) : mo1739(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            try {
                return (T) Primitive.unwrap(AbstractC0010.m414(1, cls, objUnwrap));
            } catch (Throwable unused) {
                String str = "Can't assign " + AbstractC0010.m435(AbstractC0010.m419(objUnwrap, false)) + " to " + AbstractC0010.m435(cls);
                C2611 c2611 = new C2611();
                c2611.f8490 = new C1229(str, abstractC2707, null);
                throw c2611;
            }
        } catch (C2895 e) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e.m4900())) {
                    throw e.m4900();
                }
            }
            String str2 = "Can't invoke lambda: Unexpected Exception: " + e.m4900().getMessage();
            e.m4900();
            throw new C2611(str2, abstractC2707);
        } catch (C1229 e2) {
            throw new C2611("Can't invoke lambda: " + e2.getMessage(), abstractC2707);
        } catch (C3523 e3) {
            C1229 c1229Mo4643 = e3.mo4643(abstractC2707, null);
            C2611 c2612 = new C2611();
            c2612.f8490 = c1229Mo4643;
            throw c2612;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract Object mo1739(Object[] objArr);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract boolean mo1740(int i, Method method);
}
