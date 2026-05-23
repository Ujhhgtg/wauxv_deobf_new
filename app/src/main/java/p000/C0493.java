package p000;

import bsh.AbstractC0010;
import bsh.C0007;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Stack;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲁᲇᲀᤞᤝᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0493 extends AbstractC0496 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final C0007 f2123;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final C2000[] f2124;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Class[] f2125;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final String[] f2126;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final InterfaceC2225 f2127;

    public C0493(C0344 c0344, C0007 c0007, C2000[] c2000Arr, Class[] clsArr, String[] strArr, InterfaceC2225 interfaceC2225) {
        C0007 c0007M342;
        super(c0344);
        if (c0007 != null) {
            c0007M342 = c0007.m342();
            Stack stack = new Stack();
            while (true) {
                c0007 = c0007.f494;
                if (c0007 == null) {
                    break;
                } else {
                    stack.add(c0007);
                }
            }
            while (!stack.isEmpty()) {
                C0007 c0008 = (C0007) stack.pop();
                if (!c0008.f508 && !c0008.f510) {
                    c0007M342.f495.putAll(c0008.f495);
                }
            }
            c0007M342.f495.replaceAll(new C1310(2));
        } else {
            c0007M342 = null;
        }
        this.f2123 = c0007M342;
        this.f2124 = c2000Arr;
        this.f2125 = clsArr;
        this.f2126 = strArr;
        this.f2127 = interfaceC2225;
        if (c2000Arr.length != clsArr.length || clsArr.length != strArr.length) {
            throw new IllegalArgumentException("The length of 'paramsModifiers', 'paramsTypes' and 'paramsNames' can't be different!");
        }
    }

    @Override // p000.AbstractC0496
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Object mo1739(Object[] objArr) throws C3523 {
        int length = objArr.length;
        Class[] clsArr = this.f2125;
        if (length != clsArr.length) {
            throw new C3523("Wrong number of arguments!");
        }
        C0007 c0007 = new C0007(this.f2123, null, "LambdaExpression");
        int i = 0;
        while (true) {
            String[] strArr = this.f2126;
            if (i >= strArr.length) {
                break;
            }
            Class cls = clsArr[i];
            if (cls != null) {
                c0007.m367(strArr[i], cls, objArr[i], this.f2124[i]);
            } else {
                c0007.mo314(strArr[i], objArr[i], true);
            }
            i++;
        }
        C0550 c0550 = new C0550(c0007);
        RunnableC1668 runnableC1668 = new RunnableC1668(c0007, null);
        InterfaceC2225 interfaceC2225 = this.f2127;
        if (!(interfaceC2225 instanceof C0333)) {
            return interfaceC2225.mo306(c0550, runnableC1668);
        }
        Object objM1448 = ((C0333) interfaceC2225).m1448(c0550, runnableC1668, Boolean.FALSE);
        if (objM1448 instanceof C2588) {
            C2588 c2588 = (C2588) objM1448;
            if (c2588.f8194 == 49) {
                return c2588.f8196;
            }
        }
        return null;
    }

    @Override // p000.AbstractC0496
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final boolean mo1740(int i, Method method) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        Class[] clsArr = this.f2125;
        if (clsArr.length != genericParameterTypes.length) {
            return false;
        }
        return AbstractC0010.m434(clsArr, genericParameterTypes, i);
    }
}
