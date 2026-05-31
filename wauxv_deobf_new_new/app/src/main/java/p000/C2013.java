package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᤝᲁᲀᲈᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2013 extends AbstractC1664 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method f6671;

    public C2013(Method method) {
        this.f6671 = method;
    }

    @Override // p000.AbstractC1969
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Member mo2465() {
        return this.f6671;
    }

    @Override // p000.AbstractC1664
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final AbstractC1664 mo3125(Object obj) {
        m3542(obj);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C2013 m4024() {
        return new C2013(this.f6671);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m4025(Object... objArr) {
        Method method = this.f6671;
        Method method2 = method != null ? method : null;
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        return method.invoke(this.f5627, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object m4026(Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Method method = this.f6671;
        Method method2 = method != null ? method : null;
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        Object objInvoke = method.invoke(this.f5627, Arrays.copyOf(objArr, objArr.length));
        if (objInvoke == null) {
            return null;
        }
        return objInvoke;
    }
}
