package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能ᛱfeyxiexzfᛱᛲ要点脸ᛴᛱUjhhgtgᛱᛳ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2483feyxiexzfUjhhgtg implements InterfaceC3704Ujhhgtgfeyxiexzf, InterfaceC3747feyxiexzfUjhhgtg, Serializable {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final InterfaceC3704Ujhhgtgfeyxiexzf f8115Ujhhgtgfeyxiexzf;

    public AbstractC2483feyxiexzfUjhhgtg(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf) {
        this.f8115Ujhhgtgfeyxiexzf = interfaceC3704Ujhhgtgfeyxiexzf;
    }

    public String toString() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC3086Ujhhgtgfeyxiexzf interfaceC3086Ujhhgtgfeyxiexzf = (InterfaceC3086Ujhhgtgfeyxiexzf) getClass().getAnnotation(InterfaceC3086Ujhhgtgfeyxiexzf.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        name = null;
        if (interfaceC3086Ujhhgtgfeyxiexzf != null && interfaceC3086Ujhhgtgfeyxiexzf.v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? interfaceC3086Ujhhgtgfeyxiexzf.l()[iIntValue] : -1;
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf = AbstractC3593Ujhhgtgfeyxiexzf.f11182Ujhhgtgfeyxiexzf;
            C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf2 = AbstractC3593Ujhhgtgfeyxiexzf.f11183Ujhhgtgfeyxiexzf;
            if (c2366Ujhhgtgfeyxiexzf2 == null) {
                try {
                    C2366Ujhhgtgfeyxiexzf c2366Ujhhgtgfeyxiexzf3 = new C2366Ujhhgtgfeyxiexzf(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 18);
                    AbstractC3593Ujhhgtgfeyxiexzf.f11183Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf3;
                    c2366Ujhhgtgfeyxiexzf2 = c2366Ujhhgtgfeyxiexzf3;
                } catch (Exception unused2) {
                    AbstractC3593Ujhhgtgfeyxiexzf.f11183Ujhhgtgfeyxiexzf = c2366Ujhhgtgfeyxiexzf;
                    c2366Ujhhgtgfeyxiexzf2 = c2366Ujhhgtgfeyxiexzf;
                }
            }
            if (c2366Ujhhgtgfeyxiexzf2 != c2366Ujhhgtgfeyxiexzf && (method = (Method) c2366Ujhhgtgfeyxiexzf2.f7714Ujhhgtgfeyxiexzf) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c2366Ujhhgtgfeyxiexzf2.f7715Ujhhgtgfeyxiexzf) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c2366Ujhhgtgfeyxiexzf2.f7716Ujhhgtgfeyxiexzf;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strC = interfaceC3086Ujhhgtgfeyxiexzf.c();
            } else {
                strC = str + '/' + interfaceC3086Ujhhgtgfeyxiexzf.c();
            }
            name = new StackTraceElement(strC, interfaceC3086Ujhhgtgfeyxiexzf.m(), interfaceC3086Ujhhgtgfeyxiexzf.f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    @Override // p000.InterfaceC3747feyxiexzfUjhhgtg
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛲᛳᛴ */
    public final InterfaceC3747feyxiexzfUjhhgtg mo2553Ujhhgtgfeyxiexzf() {
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this.f8115Ujhhgtgfeyxiexzf;
        if (interfaceC3704Ujhhgtgfeyxiexzf instanceof InterfaceC3747feyxiexzfUjhhgtg) {
            return (InterfaceC3747feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
        }
        return null;
    }

    @Override // p000.InterfaceC3704Ujhhgtgfeyxiexzf
    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ */
    public final void mo2588Ujhhgtgfeyxiexzf(Object obj) {
        InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf = this;
        while (true) {
            AbstractC2483feyxiexzfUjhhgtg abstractC2483feyxiexzfUjhhgtg = (AbstractC2483feyxiexzfUjhhgtg) interfaceC3704Ujhhgtgfeyxiexzf;
            InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf2 = abstractC2483feyxiexzfUjhhgtg.f8115Ujhhgtgfeyxiexzf;
            try {
                obj = abstractC2483feyxiexzfUjhhgtg.mo1208Ujhhgtgfeyxiexzf(obj);
                if (obj == EnumC3746Ujhhgtgfeyxiexzf.f11822Ujhhgtgfeyxiexzf) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C0919feyxiexzfUjhhgtg(th);
            }
            abstractC2483feyxiexzfUjhhgtg.mo3762Ujhhgtgfeyxiexzf();
            if (!(interfaceC3704Ujhhgtgfeyxiexzf2 instanceof AbstractC2483feyxiexzfUjhhgtg)) {
                interfaceC3704Ujhhgtgfeyxiexzf2.mo2588Ujhhgtgfeyxiexzf(obj);
                return;
            }
            interfaceC3704Ujhhgtgfeyxiexzf = interfaceC3704Ujhhgtgfeyxiexzf2;
        }
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛳᛴ */
    public InterfaceC3704Ujhhgtgfeyxiexzf mo1767Ujhhgtgfeyxiexzf(InterfaceC3704Ujhhgtgfeyxiexzf interfaceC3704Ujhhgtgfeyxiexzf, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛱfeyxiexzfᛱᛴᛳ */
    public abstract Object mo1208Ujhhgtgfeyxiexzf(Object obj);

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛲᛳᛱfeyxiexzfᛱᛴ, reason: contains not printable characters */
    public void mo3762Ujhhgtgfeyxiexzf() {
    }
}
