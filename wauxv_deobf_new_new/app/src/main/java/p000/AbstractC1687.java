package p000;

import bsh.AbstractC0016;
import bsh.AbstractC0017;
import bsh.C0009;
import bsh.Primitive;
import bsh.RunnableC0008;
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

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲇᛸᲀᲈᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1687 implements Member {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final boolean f5668;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ, reason: contains not printable characters */
    public final boolean f5669;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ, reason: contains not printable characters */
    public final String f5670;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ, reason: contains not printable characters */
    public final String f5671;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ, reason: contains not printable characters */
    public final int f5672;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ, reason: contains not printable characters */
    public final Class f5673;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public MethodHandle f5667 = null;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final ArrayList f5674 = new ArrayList();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public int f5675 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC1687(AccessibleObject accessibleObject) {
        Member member = (Member) accessibleObject;
        this.f5672 = member.getModifiers();
        this.f5673 = member.getDeclaringClass();
        this.f5671 = member.getName();
        this.f5670 = accessibleObject.toString();
        Member member2 = (Member) accessibleObject;
        Object[] objArr = AbstractC0016.f568;
        this.f5668 = Modifier.isStatic(member2.getModifiers());
        this.f5669 = member2.isSynthetic();
        if (!C0538.m2050() || member2.getDeclaringClass() == Class.class) {
            return;
        }
        try {
            accessibleObject.setAccessible(true);
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static Object m3564(Class cls, Object obj) {
        Class<?> clsM563 = AbstractC0017.m563(obj, false);
        if (clsM563 == null || !cls.isAssignableFrom(clsM563)) {
            obj = AbstractC0017.m559(0, cls, obj);
        }
        return Primitive.unwrap(obj);
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (this == obj) {
                return true;
            }
            if (getClass() == obj.getClass()) {
                AbstractC1687 abstractC1687 = (AbstractC1687) obj;
                if (this.f5671.equals(abstractC1687.f5671) && this.f5673 == abstractC1687.f5673 && mo3008() == abstractC1687.mo3008() && mo2461() == abstractC1687.mo2461() && this.f5672 == abstractC1687.f5672) {
                    for (int i = 0; i < mo3008(); i++) {
                        if (mo3009()[i] == abstractC1687.mo3009()[i]) {
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
        return this.f5673;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        return this.f5672;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        return this.f5671;
    }

    public final int hashCode() {
        return (((((getClass().hashCode() ^ this.f5671.hashCode()) ^ this.f5673.hashCode()) ^ mo3008()) ^ mo2461().hashCode()) ^ this.f5672) ^ ((Integer) Stream.of((Object[]) mo3009()).map(new C0278(13)).reduce(75, new C1686())).intValue();
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        return this.f5669;
    }

    public final String toString() {
        return this.f5670;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public C0427 mo2460(Object obj, Object[] objArr) throws InvocationTargetException {
        if (this.f5675 > objArr.length) {
            throw new InvocationTargetException(null, "Insufficient parameters passed for method: " + this.f5671 + Arrays.asList(mo3009()));
        }
        ArrayList arrayList = this.f5674;
        arrayList.clear();
        for (int i = 0; i < this.f5675; i++) {
            arrayList.add(m3564(mo3009()[i], objArr[i]));
        }
        return new C0427((Object) arrayList, false);
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final MethodHandle m3565() {
        if (this.f5667 == null) {
            this.f5667 = mo2464(null);
        }
        return this.f5667;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final String[] m3566() {
        return (String[]) MethodType.methodType((Class<?>) mo2461(), (Class<?>[]) mo3009()).parameterList().stream().map(new C0009()).toArray(new C0461(3));
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲁᲇ */
    public abstract int mo3008();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲈᲇᲁ */
    public abstract Class[] mo3009();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲇᲈ */
    public abstract Class mo2461();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲀᲈᲇ */
    public Class mo3010() {
        return Void.TYPE;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲀᲈ */
    public synchronized Object mo3115(Object obj, Object... objArr) {
        if (objArr == null) {
            objArr = AbstractC0016.f568;
            try {
            } catch (Throwable th) {
                throw new InvocationTargetException(th);
            }
        }
        throw th;
        return Primitive.wrap(m3567(obj, objArr), (Class<?>) mo2461());
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲇᲈᲀ, reason: contains not printable characters */
    public final synchronized Object m3567(Object obj, Object[] objArr) {
        try {
            AbstractC0016.m547("Invoking method (entry): ", this, objArr);
            C0427 c0427Mo2460 = mo2460(obj, objArr);
            List<?> list = (List) c0427Mo2460.f1994;
            if (((Boolean) RunnableC0008.f500.get()).booleanValue()) {
                AbstractC0016.m547("Invoking method (after): ", this, list.toArray());
            }
            if (mo3008() > 0) {
                MethodHandle methodHandleM3565 = m3565();
                if (c0427Mo2460.f1993) {
                    methodHandleM3565 = methodHandleM3565.asFixedArity();
                }
                return methodHandleM3565.invokeWithArguments(list);
            }
            if (!mo2463() && !(this instanceof C0796)) {
                return (Object) m3565().invoke(list.get(0));
            }
            return (Object) m3565().invoke();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲀᲇ, reason: contains not printable characters */
    public boolean mo3568() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲁᲈᲇᲀ */
    public boolean mo2462() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲁᲈ, reason: contains not printable characters */
    public boolean mo3569() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲀᲈᲁ */
    public boolean mo2463() {
        return this.f5668;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲀᲈ */
    public boolean mo3011() {
        return false;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲇᲁᲈᲀ */
    public abstract MethodHandle mo2464(MethodHandle methodHandle);
}
