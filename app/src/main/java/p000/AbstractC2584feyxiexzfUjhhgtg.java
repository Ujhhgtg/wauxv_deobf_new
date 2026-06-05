package p000;

import bsh.AbstractC0034Ujhhgtgfeyxiexzf;
import bsh.Node;
import bsh.Primitive;
import com.alibaba.fastjson2.internal.asm.ASMUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛲᛱfeyxiexzfᛱᛱUjhhgtgᛱᛴ要点脸ᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2584feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static final C2581feyxiexzfUjhhgtg f8356Ujhhgtgfeyxiexzf = new C2581feyxiexzfUjhhgtg();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public static final WeakHashMap f8357Ujhhgtgfeyxiexzf = new WeakHashMap();

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛴᛲᛳ, reason: contains not printable characters */
    public static volatile int f8358Ujhhgtgfeyxiexzf = 1;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ, reason: contains not printable characters */
    public final Node f8359Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ, reason: contains not printable characters */
    public final Class f8360Ujhhgtgfeyxiexzf;

    static {
        new HashMap();
    }

    public AbstractC2584feyxiexzfUjhhgtg(Node node) {
        this.f8359Ujhhgtgfeyxiexzf = node;
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC2584feyxiexzfUjhhgtg.class.getName());
        sb.append("Type");
        int i = f8358Ujhhgtgfeyxiexzf;
        f8358Ujhhgtgfeyxiexzf = i + 1;
        sb.append(i);
        String string = sb.toString();
        C2843feyxiexzfUjhhgtg c2843feyxiexzfUjhhgtg = new C2843feyxiexzfUjhhgtg();
        c2843feyxiexzfUjhhgtg.m4174Ujhhgtgfeyxiexzf(1537, string.replace(".", "/"), null, ASMUtils.TYPE_OBJECT, null);
        C2581feyxiexzfUjhhgtg c2581feyxiexzfUjhhgtg = f8356Ujhhgtgfeyxiexzf;
        byte[] bArrM4173Ujhhgtgfeyxiexzf = c2843feyxiexzfUjhhgtg.m4173Ujhhgtgfeyxiexzf();
        c2581feyxiexzfUjhhgtg.getClass();
        ConcurrentHashMap concurrentHashMap = AbstractC2592feyxiexzfUjhhgtg.f8390Ujhhgtgfeyxiexzf;
        Class clsM3850Ujhhgtgfeyxiexzf = AbstractC2592feyxiexzfUjhhgtg.m3850Ujhhgtgfeyxiexzf(string, bArrM4173Ujhhgtgfeyxiexzf, AbstractC2592feyxiexzfUjhhgtg.class.getClassLoader());
        this.f8360Ujhhgtgfeyxiexzf = clsM3850Ujhhgtgfeyxiexzf;
        f8357Ujhhgtgfeyxiexzf.put(this, clsM3850Ujhhgtgfeyxiexzf);
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public static boolean m3832Ujhhgtgfeyxiexzf(Class cls, Class cls2, int i) {
        for (Method method : cls2.getMethods()) {
            if (Modifier.isAbstract(method.getModifiers()) && !method.isBridge() && !method.isSynthetic()) {
                Map map = AbstractC0034Ujhhgtgfeyxiexzf.f588Ujhhgtgfeyxiexzf;
                try {
                    Object.class.getMethod(method.getName(), method.getParameterTypes());
                } catch (NoSuchMethodException unused) {
                    for (Map.Entry entry : f8357Ujhhgtgfeyxiexzf.entrySet()) {
                        if (entry.getValue() == cls) {
                            return ((AbstractC2584feyxiexzfUjhhgtg) entry.getKey()).mo307Ujhhgtgfeyxiexzf(i, method);
                        }
                    }
                    return false;
                }
            }
        }
        throw new IllegalArgumentException("This class isn't a valid Functional Interface: ".concat(cls2.getName()));
    }

    public final <T> T invoke(Object[] objArr, Class<?>[] clsArr, Class<T> cls) throws Throwable {
        Node node = this.f8359Ujhhgtgfeyxiexzf;
        try {
            Object objUnwrap = cls.isPrimitive() ? Primitive.unwrap(mo306Ujhhgtgfeyxiexzf(objArr)) : mo306Ujhhgtgfeyxiexzf(objArr);
            if (cls == Void.TYPE) {
                return null;
            }
            try {
                return (T) Primitive.unwrap(AbstractC0034Ujhhgtgfeyxiexzf.m558Ujhhgtgfeyxiexzf(1, cls, objUnwrap));
            } catch (Throwable unused) {
                String str = "Can't assign " + AbstractC0034Ujhhgtgfeyxiexzf.m578feyxiexzfUjhhgtg(AbstractC0034Ujhhgtgfeyxiexzf.m562Ujhhgtgfeyxiexzf(objUnwrap, false)) + " to " + AbstractC0034Ujhhgtgfeyxiexzf.m578feyxiexzfUjhhgtg(cls);
                C0951feyxiexzfUjhhgtg c0951feyxiexzfUjhhgtg = new C0951feyxiexzfUjhhgtg();
                c0951feyxiexzfUjhhgtg.f3811Ujhhgtgfeyxiexzf = new C3353Ujhhgtgfeyxiexzf(str, node, null);
                throw c0951feyxiexzfUjhhgtg;
            }
        } catch (C1863Ujhhgtgfeyxiexzf e) {
            C3353Ujhhgtgfeyxiexzf c3353UjhhgtgfeyxiexzfMo2569Ujhhgtgfeyxiexzf = e.mo2569Ujhhgtgfeyxiexzf(node, null);
            C0951feyxiexzfUjhhgtg c0951feyxiexzfUjhhgtg2 = new C0951feyxiexzfUjhhgtg();
            c0951feyxiexzfUjhhgtg2.f3811Ujhhgtgfeyxiexzf = c3353UjhhgtgfeyxiexzfMo2569Ujhhgtgfeyxiexzf;
            throw c0951feyxiexzfUjhhgtg2;
        } catch (C1985Ujhhgtgfeyxiexzf e2) {
            for (Class<?> cls2 : clsArr) {
                if (cls2.isInstance(e2.m3339Ujhhgtgfeyxiexzf())) {
                    throw e2.m3339Ujhhgtgfeyxiexzf();
                }
            }
            String str2 = "Can't invoke lambda: Unexpected Exception: " + e2.m3339Ujhhgtgfeyxiexzf().getMessage();
            e2.m3339Ujhhgtgfeyxiexzf();
            throw new C0951feyxiexzfUjhhgtg(str2, node);
        } catch (C3353Ujhhgtgfeyxiexzf e3) {
            throw new C0951feyxiexzfUjhhgtg("Can't invoke lambda: " + e3.getMessage(), node);
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public abstract Object mo306Ujhhgtgfeyxiexzf(Object[] objArr);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛴᛳ */
    public abstract boolean mo307Ujhhgtgfeyxiexzf(int i, Method method);
}
