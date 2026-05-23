package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᛸᤝᲇᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1824 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2378 f6102;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f6103;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f6104;

    public C1824(Class cls, Class cls2, Class cls3, List list, InterfaceC2378 interfaceC2378) {
        this.f6102 = interfaceC2378;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f6103 = list;
        this.f6104 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6103.toArray()) + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2568 m3582(int i, int i2, C0408 c0408, InterfaceC0962 interfaceC0962, C2303 c2303) {
        InterfaceC2378 interfaceC2378 = this.f6102;
        List list = (List) interfaceC2378.mo1312();
        AbstractC1460.m3210(list, "Argument must not be null");
        try {
            List list2 = this.f6103;
            int size = list2.size();
            InterfaceC2568 interfaceC2568M2510 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2568M2510 = ((C0973) list2.get(i3)).m2510(i, i2, c0408, interfaceC0962, c2303);
                } catch (C1463 e) {
                    list.add(e);
                }
                if (interfaceC2568M2510 != null) {
                    break;
                }
            }
            if (interfaceC2568M2510 == null) {
                throw new C1463(this.f6104, new ArrayList(list));
            }
            interfaceC2378.mo1311(list);
            return interfaceC2568M2510;
        } catch (Throwable th) {
            interfaceC2378.mo1311(list);
            throw th;
        }
    }
}
