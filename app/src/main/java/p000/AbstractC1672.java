package p000;

import bsh.AbstractC0009;
import bsh.AbstractC0010;
import bsh.Primitive;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodType;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲁᲇᲈᲀᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1672 implements Member {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f5641;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final boolean f5642;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f5643;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final String f5644;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final int f5645;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final Class f5646;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public MethodHandle f5640 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public final ArrayList f5647 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ, reason: contains not printable characters */
    public int f5648 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1672(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f5645 = member.getModifiers();
        this.f5646 = member.getDeclaringClass();
        this.f5644 = member.getName();
        this.f5643 = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC0009.f516;
        this.f5641 = Modifier.isStatic(member2.getModifiers());
        this.f5642 = member2.isSynthetic();
        if (!C0561.m1955() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m3397(Class cls, Object obj) {
        Class<?> clsM419 = AbstractC0010.m419(obj, false);
        if (clsM419 == null || !cls.isAssignableFrom(clsM419)) {
            obj = AbstractC0010.m414(0, cls, obj);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC1672 abstractC1672 = (AbstractC1672) obj;
                if (this.f5644.equals(abstractC1672.f5644) && this.f5646 == abstractC1672.f5646 && mo2889() == abstractC1672.mo2889() && mo2346() == abstractC1672.mo2346() && this.f5645 == abstractC1672.f5645) {
                    for (int i = 0; i < mo2889(); i++) {
                        if (mo2890()[i] == abstractC1672.mo2890()[i]) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.reflect.Member
    public final Class getDeclaringClass() {
        return this.f5646;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f5645;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f5644;
    }

    public final int hashCode() {
        return (((((getClass().hashCode() ^ this.f5644.hashCode()) ^ this.f5646.hashCode()) ^ mo2889()) ^ mo2346().hashCode()) ^ this.f5645) ^ ((Integer) Stream.of((Object[]) mo2890()).map(new C0268(13)).reduce(75, new C1671())).intValue();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f5642;
    }

    public final String toString() {
        return this.f5643;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C0452 mo2345(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f5648 > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f5644 + Arrays.asList(mo2890()));
        }
        ArrayList arrayList = this.f5647;
        arrayList.clear();
        for (int i = 0; i < this.f5648; i++) {
            arrayList.add(m3397(mo2890()[i], objArr[i]));
        }
        return new C0452((Object) arrayList, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MethodHandle m3398() {
        if (this.f5640 == null) {
            this.f5640 = mo2349(null);
        }
        return this.f5640;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String[] m3399() {
        return (String[]) MethodType.methodType((Class<?>) mo2346(), (Class<?>[]) mo2890()).parameterList().stream().map(new C0268(14)).toArray(new C0484(3));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public abstract int mo2889();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract Class[] mo2890();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract Class mo2346();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Class mo2891() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public synchronized Object mo3012(Object obj, Object... objArr) {
        if (objArr == null) {
            objArr = AbstractC0009.f516;
            try {
            } catch (Throwable th) {
                throw new InvocationTargetException(th);
            }
        }
        throw th;
        return Primitive.wrap(m3400(obj, objArr), (Class<?>) mo2346());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final synchronized Object m3400(Object obj, Object[] objArr) {
        try {
            AbstractC0009.m402("Invoking method (entry): ", this, objArr);
            C0452 c0452Mo2345 = mo2345(obj, objArr);
            List<?> list = (List) c0452Mo2345.f2022;
            if (((Boolean) RunnableC1668.f5629.get()).booleanValue()) {
                AbstractC0009.m402("Invoking method (after): ", this, list.toArray());
            }
            if (mo2889() > 0) {
                MethodHandle methodHandleM3398 = m3398();
                if (c0452Mo2345.f2021) {
                    methodHandleM3398 = methodHandleM3398.asFixedArity();
                }
                return methodHandleM3398.invokeWithArguments(list);
            }
            if (!mo2348() && !(this instanceof C0797)) {
                return (Object) m3398().invoke(list.get(0));
            }
            return (Object) m3398().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean mo3401() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public boolean mo2347() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean mo3402() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public boolean mo2348() {
        return this.f5641;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public boolean mo2892() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public abstract MethodHandle mo2349(MethodHandle methodHandle);
}
