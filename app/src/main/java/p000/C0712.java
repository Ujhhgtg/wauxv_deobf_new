package p000;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᲈᲀᲁᲇᤞᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0712 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final HashMap f2712 = new HashMap();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final HashMap f2713;

    public C0712(HashMap map) {
        this.f2713 = map;
        for (Map.Entry entry : map.entrySet()) {
            EnumC1769 enumC1769 = (EnumC1769) entry.getValue();
            List arrayList = (List) this.f2712.get(enumC1769);
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.f2712.put(enumC1769, arrayList);
            }
            arrayList.add((C0713) entry.getKey());
        }
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static void m2140(List list, InterfaceC1777 interfaceC1777, EnumC1769 enumC1769, InterfaceC1776 interfaceC1776) {
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                C0713 c0713 = (C0713) list.get(size);
                Method method = c0713.f2715;
                try {
                    int i = c0713.f2714;
                    if (i == 0) {
                        method.invoke(interfaceC1776, null);
                    } else if (i == 1) {
                        method.invoke(interfaceC1776, interfaceC1777);
                    } else if (i == 2) {
                        method.invoke(interfaceC1776, interfaceC1777, enumC1769);
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
