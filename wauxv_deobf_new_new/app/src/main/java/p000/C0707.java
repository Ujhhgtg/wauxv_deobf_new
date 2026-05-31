package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᤝᲇᲁᤞ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0707 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f2706 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap f2707;

    public C0707(HashMap map) {
        this.f2707 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1792 enumC1792 = (EnumC1792) entry.getValue();
            List arrayList = (List) this.f2706.get(enumC1792);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2706.put(enumC1792, arrayList);
            }
            arrayList.add((C0708) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m2232(List list, InterfaceC1800 interfaceC1800, EnumC1792 enumC1792, InterfaceC1799 interfaceC1799) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0708 c0708 = (C0708) list.get(size);
                Method method = c0708.f2709;
                try {
                    int i = c0708.f2708;
                    if (i == 0) {
                        method.invoke(interfaceC1799, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC1799, interfaceC1800);
                    } else if (i == 2) {
                        method.invoke(interfaceC1799, interfaceC1800, enumC1792);
                    }
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e2) {
                    throw new RuntimeException("Failed to call observer method", e2.getCause());
                }
            }
        }
    }
}
