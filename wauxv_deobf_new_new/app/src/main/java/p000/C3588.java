package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲁᲈᤞᛸᲇᤝᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3588 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C3588 f11197 = new C3588();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static String m5125(Object obj) {
        if (obj instanceof C3588) {
            return "VagueType";
        }
        Class<C3588> cls = C3588.class;
        if (obj instanceof Class) {
            Class<C3588> clsM4232 = AbstractC2236.m4232(AbstractC2574.m4549(cls));
            return !obj.equals(clsM4232 != null ? clsM4232 : C3588.class) ? ((Class) obj).toString() : "VagueType";
        }
        if (obj instanceof InterfaceC1760) {
            return !obj.equals(AbstractC2574.m4549(cls)) ? obj.toString() : "VagueType";
        }
        if (!(obj instanceof Collection)) {
            return obj.toString();
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(AbstractC0741.m2313(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            arrayList.add(next != null ? m5125(next) : null);
        }
        return arrayList.toString();
    }
}
