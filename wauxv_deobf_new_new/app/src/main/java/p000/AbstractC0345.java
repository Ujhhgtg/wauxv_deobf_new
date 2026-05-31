package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲁᤝᲇᲈᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0345 implements InterfaceC0841, InterfaceC0884, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final InterfaceC0841 f1722;

    public AbstractC0345(InterfaceC0841 interfaceC0841) {
        this.f1722 = interfaceC0841;
    }

    public String toString() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0971 interfaceC0971 = (InterfaceC0971) getClass().getAnnotation(InterfaceC0971.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        name = null;
        if (interfaceC0971 != null && interfaceC0971.v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? interfaceC0971.l()[iIntValue] : -1;
            C0253 c0253 = AbstractC1470.f5232;
            C0253 c0254 = AbstractC1470.f5233;
            if (c0254 == null) {
                try {
                    C0253 c0255 = new C0253(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 18);
                    AbstractC1470.f5233 = c0255;
                    c0254 = c0255;
                } catch (Exception unused2) {
                    AbstractC1470.f5233 = c0253;
                    c0254 = c0253;
                }
            }
            if (c0254 != c0253 && (method = (Method) c0254.f1478) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0254.f1479) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c0254.f1480;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strC = interfaceC0971.c();
            } else {
                strC = str + '/' + interfaceC0971.c();
            }
            name = new StackTraceElement(strC, interfaceC0971.m(), interfaceC0971.f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    @Override // p000.InterfaceC0884
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0884 mo1596() {
        InterfaceC0841 interfaceC0841 = this.f1722;
        if (interfaceC0841 instanceof InterfaceC0884) {
            return (InterfaceC0884) interfaceC0841;
        }
        return null;
    }

    @Override // p000.InterfaceC0841
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo1077(Object obj) {
        InterfaceC0841 interfaceC0841 = this;
        while (true) {
            AbstractC0345 abstractC0345 = (AbstractC0345) interfaceC0841;
            InterfaceC0841 interfaceC0842 = abstractC0345.f1722;
            try {
                obj = abstractC0345.mo1344(obj);
                if (obj == EnumC0883.f3332) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C2641(th);
            }
            abstractC0345.mo1597();
            if (!(interfaceC0842 instanceof AbstractC0345)) {
                interfaceC0842.mo1077(obj);
                return;
            }
            interfaceC0841 = interfaceC0842;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public InterfaceC0841 mo1343(InterfaceC0841 interfaceC0841, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public abstract Object mo1344(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1597() {
    }
}
