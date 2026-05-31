package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᤞᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0702 implements InterfaceC1760, InterfaceC0692 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final Class f2683;

    static {
        List listM2311 = AbstractC0740.m2311(InterfaceC1422.class, InterfaceC1433.class, InterfaceC1437.class, InterfaceC1438.class, C2198.class, InterfaceC1439.class, InterfaceC1440.class, InterfaceC1441.class, InterfaceC1442.class, InterfaceC1443.class, InterfaceC1423.class, InterfaceC1424.class, InterfaceC1425.class, InterfaceC1426.class, InterfaceC1427.class, InterfaceC1428.class, InterfaceC1429.class, InterfaceC1430.class, InterfaceC1431.class, InterfaceC1432.class, InterfaceC1434.class, InterfaceC1435.class, InterfaceC1436.class);
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(listM2311, 10));
        int i = 0;
        for (Object obj : listM2311) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0740.m2312();
                throw null;
            }
            arrayList.add(new C2348((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        AbstractC1924.m3875(arrayList);
    }

    public C0702(Class cls) {
        this.f2683 = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0702) && AbstractC2236.m4231(this).equals(AbstractC2236.m4231((InterfaceC1760) obj));
    }

    public final int hashCode() {
        return AbstractC2236.m4231(this).hashCode();
    }

    public final String toString() {
        return this.f2683.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000.InterfaceC0692
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final Class mo2209() {
        return this.f2683;
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final String m2221() {
        String strM4266;
        Class cls = this.f2683;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM4267 = AbstractC2240.m4266(cls.getName());
                return strM4267 == null ? cls.getSimpleName() : strM4267;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM4266 = AbstractC2240.m4266(componentType.getName())) != null) {
                strConcat = strM4266.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC2901.m4877(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM4866 = AbstractC2901.m4866('$', 0, 6, simpleName);
            return iM4866 == -1 ? simpleName : simpleName.substring(iM4866 + 1, simpleName.length());
        }
        return AbstractC2901.m4877(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
