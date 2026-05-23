package p000;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲀᲇᤞᲈᲁᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0370 implements InterfaceC0842, InterfaceC0885, Serializable {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final InterfaceC0842 f1751;

    public AbstractC0370(InterfaceC0842 interfaceC0842) {
        this.f1751 = interfaceC0842;
    }

    public String toString() {
        int iIntValue;
        String strC;
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        StringBuilder sb = new StringBuilder("Continuation at ");
        InterfaceC0967 interfaceC0967 = (InterfaceC0967) getClass().getAnnotation(InterfaceC0967.class);
        Object name = null;
        str = null;
        str = null;
        str = null;
        str = null;
        str = null;
        String str = null;
        name = null;
        if (interfaceC0967 != null && interfaceC0967.v() >= 1) {
            try {
                Field declaredField = getClass().getDeclaredField("label");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(this);
                Integer num = obj instanceof Integer ? (Integer) obj : null;
                iIntValue = (num != null ? num.intValue() : 0) - 1;
            } catch (Exception unused) {
                iIntValue = -1;
            }
            int i = iIntValue >= 0 ? interfaceC0967.l()[iIntValue] : -1;
            C0243 c0243 = AbstractC1574.f5470;
            C0243 c0244 = AbstractC1574.f5471;
            if (c0244 == null) {
                try {
                    C0243 c0245 = new C0243(Class.class.getDeclaredMethod("getModule", null), getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null), 20);
                    AbstractC1574.f5471 = c0245;
                    c0244 = c0245;
                } catch (Exception unused2) {
                    AbstractC1574.f5471 = c0243;
                    c0244 = c0243;
                }
            }
            if (c0244 != c0243 && (method = (Method) c0244.f1404) != null && (objInvoke = method.invoke(getClass(), null)) != null && (method2 = (Method) c0244.f1405) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
                Method method3 = (Method) c0244.f1406;
                Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
                if (objInvoke3 instanceof String) {
                    str = (String) objInvoke3;
                }
            }
            if (str == null) {
                strC = interfaceC0967.c();
            } else {
                strC = str + '/' + interfaceC0967.c();
            }
            name = new StackTraceElement(strC, interfaceC0967.m(), interfaceC0967.f(), i);
        }
        if (name == null) {
            name = getClass().getName();
        }
        sb.append(name);
        return sb.toString();
    }

    @Override // p000.InterfaceC0885
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC0885 mo1491() {
        InterfaceC0842 interfaceC0842 = this.f1751;
        if (interfaceC0842 instanceof InterfaceC0885) {
            return (InterfaceC0885) interfaceC0842;
        }
        return null;
    }

    @Override // p000.InterfaceC0842
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final void mo933(Object obj) {
        InterfaceC0842 interfaceC0842 = this;
        while (true) {
            AbstractC0370 abstractC0370 = (AbstractC0370) interfaceC0842;
            InterfaceC0842 interfaceC0843 = abstractC0370.f1751;
            try {
                obj = abstractC0370.mo1198(obj);
                if (obj == EnumC0884.f3325) {
                    return;
                }
            } catch (Throwable th) {
                obj = new C2585(th);
            }
            abstractC0370.mo1492();
            if (!(interfaceC0843 instanceof AbstractC0370)) {
                interfaceC0843.mo933(obj);
                return;
            }
            interfaceC0842 = interfaceC0843;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public InterfaceC0842 mo1197(InterfaceC0842 interfaceC0842, Object obj) {
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public abstract Object mo1198(Object obj);

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public void mo1492() {
    }
}
