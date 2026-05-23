package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3529 {

    public static final C3529 f11042 = new C3529();

    public static String m5113(Object obj) {
        if (obj instanceof C3529) {
            return "VagueType";
        }
        Class<C3529> cls = C3529.class;
        if (obj instanceof Class) {
            Class<C3529> clsM2183 = AbstractC0743.m2183(AbstractC2519.classToKClass(C3529.class));
            return !obj.equals(clsM2183 != null ? clsM2183 : C3529.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof InterfaceC1736) {
            return !obj.equals(AbstractC2519.classToKClass(C3529.class)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0746.m2214(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m5113(next) : null);
        }
        return arrayList.toString();
    }
}
