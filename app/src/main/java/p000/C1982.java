package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲇᛸᲁᲀᲈᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1982 extends AbstractC1650 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final Method f6566;

    public C1982(Method method) {
        this.f6566 = method;
    }

    @Override // p000.AbstractC1938
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Member mo2350() {
        return this.f6566;
    }

    @Override // p000.AbstractC1650
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ */
    public final AbstractC1650 mo3022(Object obj) {
        m3378(obj);
        return this;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final C1982 m3830() {
        return new C1982(this.f6566);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final Object m3831(Object... objArr) {
        Method method = this.f6566;
        Method method2 = method != null ? method : null;
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        return method.invoke(this.f5592, Arrays.copyOf(objArr, objArr.length));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Object invoke(Object... objArr) throws IllegalAccessException, InvocationTargetException {
        Method method = this.f6566;
        Method method2 = method != null ? method : null;
        if (method2 != null && !method2.isAccessible()) {
            method2.setAccessible(true);
        }
        Object objInvoke = method.invoke(this.f5592, Arrays.copyOf(objArr, objArr.length));
        if (objInvoke == null) {
            return null;
        }
        return objInvoke;
    }
}
