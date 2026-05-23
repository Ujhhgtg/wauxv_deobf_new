package p000;

import bsh.AbstractC0010;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲇᛸᤞᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1241 extends AbstractC1672 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Class f4502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final Class[] f4503;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final int f4504;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ, reason: contains not printable characters */
    public final boolean f4505;

    public AbstractC1241(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f4503 = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f4504 = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f4505 = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f5648 = i;
        this.f4502 = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // p000.AbstractC1672
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C0452 mo2345(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo2345(obj, objArr);
        boolean z = this.f4505;
        ArrayList arrayList = this.f5647;
        boolean z2 = false;
        if (z) {
            int i = this.f5648;
            if (i < objArr.length) {
                int i2 = this.f4504;
                int length = objArr.length;
                Class cls = this.f4502;
                if (i2 == length && objArr[i].getClass().isArray() && AbstractC0010.m412(cls).isAssignableFrom(objArr[this.f5648].getClass().getComponentType())) {
                    arrayList.add(objArr[this.f5648]);
                    z2 = true;
                } else {
                    Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, this.f5648, objArr.length);
                    for (Object obj2 : objArrCopyOfRange) {
                        arrayList.add(AbstractC1672.m3397(AbstractC0010.m412(cls), obj2));
                    }
                }
            }
        } else {
            int i3 = this.f5648;
            if (i3 < objArr.length) {
                arrayList.add(AbstractC1672.m3397(this.f4503[i3], objArr[i3]));
            }
        }
        return new C0452(arrayList, z2);
    }

    @Override // p000.AbstractC1672
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo2889() {
        return this.f4504;
    }

    @Override // p000.AbstractC1672
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Class[] mo2890() {
        return this.f4503;
    }

    @Override // p000.AbstractC1672
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Class mo2891() {
        return AbstractC0010.m412(this.f4502);
    }

    @Override // p000.AbstractC1672
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean mo2892() {
        return this.f4505;
    }
}
