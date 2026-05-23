package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0707 implements InterfaceC1736, InterfaceC0696 {

    public final Class f2689;

    static {
        List listM2212 = AbstractC0745.listOf(InterfaceC1414.class, InterfaceC1425.class, InterfaceC1429.class, InterfaceC1430.class, C2165.class, InterfaceC1431.class, InterfaceC1432.class, InterfaceC1433.class, InterfaceC1434.class, InterfaceC1435.class, InterfaceC1415.class, InterfaceC1416.class, InterfaceC1417.class, InterfaceC1418.class, InterfaceC1419.class, InterfaceC1420.class, InterfaceC1421.class, InterfaceC1422.class, InterfaceC1423.class, InterfaceC1424.class, InterfaceC1426.class, InterfaceC1427.class, InterfaceC1428.class);
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(listM2212, 10));
        int i = 0;
        for (Object obj : listM2212) {
            int i2 = i + 1;
            if (i < 0) {
                AbstractC0745.m2213();
                throw null;
            }
            arrayList.add(new C2315((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        AbstractC1898.m3696(arrayList);
    }

    public C0707(Class cls) {
        this.f2689 = cls;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C0707) && AbstractC0743.m2182(this).equals(AbstractC0743.m2182((InterfaceC1736) obj));
    }

    public final int hashCode() {
        return AbstractC0743.m2182(this).hashCode();
    }

    public final String toString() {
        return this.f2689.toString() + " (Kotlin reflection is not available)";
    }

    @Override // p000.InterfaceC0696
    public final Class mo2114() {
        return this.f2689;
    }

    public final String m2128() {
        String strM2488;
        Class cls = this.f2689;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strM2489 = AbstractC0968.m2488(cls.getName());
                return strM2489 == null ? cls.getSimpleName() : strM2489;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strM2488 = AbstractC0968.m2488(componentType.getName())) != null) {
                strConcat = strM2488.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return AbstractC2841.m4844(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            int iM4833 = AbstractC2841.m4833('$', 0, 6, simpleName);
            return iM4833 == -1 ? simpleName : simpleName.substring(iM4833 + 1, simpleName.length());
        }
        return AbstractC2841.m4844(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }
}
