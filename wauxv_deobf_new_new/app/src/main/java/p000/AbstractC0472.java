package p000;

import bsh.AbstractC0017;
import bsh.Node;
import bsh.Primitive;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲀᤞᲈᤝᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0472 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static final C0471 f2103 = new C0471();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public static final WeakHashMap f2104 = new WeakHashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public static volatile int f2105 = 1;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Node f2106;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Class f2107;

    static {
        new HashMap();
    }

    public AbstractC0472(Node node) {
        this.f2106 = node;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC0472.class.getName());
        sb.append("Type");
        int i = f2105;
        f2105 = i + 1;
        sb.append(i);
        String string = sb.toString();
        C0706 c0706 = new C0706();
        c0706.m2230(1537, string.replace(".", "/"), null, ASMUtils.TYPE_OBJECT, null);
        C0471 c0471 = f2103;
        byte[] bArrM2229 = c0706.m2229();
        c0471.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC0475.f2114;
        Class clsM1847 = AbstractC0475.m1847(string, bArrM2229, AbstractC0475.class.getClassLoader());
        this.f2107 = clsM1847;
        f2104.put(this, clsM1847);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public static boolean m1845(Class cls, Class cls2, int i) {
        for (Method method : cls2.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC0017.f574;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    for (Map.Entry entry : f2104.entrySet()) {
                        if (entry.getValue() == cls) {
                            return ((AbstractC0472) entry.getKey()).mo321(i, method);
                        }
                    }
                    return false;
                }
            }
        }
        throw new IllegalArgumentException("This class isn't a valid Functional Interface: ".concat(cls2.getName()));
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        Node node = this.f2106;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo320(objArr)) : mo320(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            try {
                return (T) Primitive.unwrap(AbstractC0017.m559(1, cls, objUnwrap));
            } catch (Throwable unused) {
                String str = "Can't assign " + AbstractC0017.m579(AbstractC0017.m563(objUnwrap, false)) + " to " + AbstractC0017.m579(cls);
                C2672 c2672 = new C2672();
                c2672.f8655 = new C1231(str, node, null);
                throw c2672;
            }
        } catch (C2954 e) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e.m4962())) {
                    throw e.m4962();
                }
            }
            String str2 = "Can't invoke lambda: Unexpected Exception: " + e.m4962().getMessage();
            e.m4962();
            throw new C2672(str2, node);
        } catch (C1231 e2) {
            throw new C2672("Can't invoke lambda: " + e2.getMessage(), node);
        } catch (C3581 e3) {
            C1231 c1231Mo4677 = e3.mo4677(node, null);
            C2672 c2673 = new C2672();
            c2673.f8655 = c1231Mo4677;
            throw c2673;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public abstract Object mo320(Object[] objArr);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public abstract boolean mo321(int i, Method method);
}
