package p000;

import bsh.AbstractC0017;
import java.lang.reflect.Array;
import java.lang.reflect.Executable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤝᲁᲈᲀᛸᲇᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1243 extends AbstractC1687 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public final Class f4501;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public final Class[] f4502;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ, reason: contains not printable characters */
    public final int f4503;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean f4504;

    public AbstractC1243(Executable executable) {
        super(executable);
        Class<?>[] parameterTypes = executable.getParameterTypes();
        this.f4502 = parameterTypes;
        int parameterCount = executable.getParameterCount();
        this.f4503 = parameterCount;
        boolean zIsVarArgs = executable.isVarArgs();
        this.f4504 = zIsVarArgs;
        int i = parameterCount > 1 ? parameterCount - 1 : 0;
        this.f5675 = i;
        this.f4501 = zIsVarArgs ? parameterTypes[i] : Void.TYPE;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C0427 mo2460(Object obj, Object[] objArr) throws InvocationTargetException {
        super.mo2460(obj, objArr);
        boolean z = this.f4504;
        ArrayList arrayList = this.f5674;
        boolean z2 = false;
        z2 = false;
        if (z) {
            int i = this.f5675;
            int length = objArr.length;
            Class cls = this.f4501;
            if (i < length) {
                Object obj2 = objArr[i];
                int length2 = objArr.length;
                int i2 = this.f4503;
                if (i2 == length2 && obj2 != null && obj2.getClass().isArray() && AbstractC0017.m557(cls).isAssignableFrom(obj2.getClass().getComponentType())) {
                    arrayList.add(obj2);
                } else if (i2 == objArr.length && obj2 != null && obj2.getClass().isArray() && Object[].class.isAssignableFrom(obj2.getClass())) {
                    Object[] objArr2 = (Object[]) obj2;
                    Object objNewInstance = Array.newInstance((Class<?>) AbstractC0017.m557(cls), objArr2.length);
                    for (int i3 = 0; i3 < objArr2.length; i3++) {
                        Array.set(objNewInstance, i3, AbstractC1687.m3564(AbstractC0017.m557(cls), objArr2[i3]));
                    }
                    arrayList.add(objNewInstance);
                } else {
                    int length3 = objArr.length - this.f5675;
                    Object objNewInstance2 = Array.newInstance((Class<?>) AbstractC0017.m557(cls), length3);
                    for (int i4 = 0; i4 < length3; i4++) {
                        Array.set(objNewInstance2, i4, AbstractC1687.m3564(AbstractC0017.m557(cls), objArr[this.f5675 + i4]));
                    }
                    arrayList.add(objNewInstance2);
                }
            } else {
                arrayList.add(Array.newInstance((Class<?>) AbstractC0017.m557(cls), 0));
            }
            z2 = true;
        } else {
            int i5 = this.f5675;
            if (i5 < objArr.length) {
                arrayList.add(AbstractC1687.m3564(this.f4502[i5], objArr[i5]));
            }
        }
        return new C0427(arrayList, z2);
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final int mo3008() {
        return this.f4503;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final Class[] mo3009() {
        return this.f4502;
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final Class mo3010() {
        return AbstractC0017.m557(this.f4501);
    }

    @Override // p000.AbstractC1687
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ, reason: contains not printable characters */
    public final boolean mo3011() {
        return this.f4504;
    }
}
