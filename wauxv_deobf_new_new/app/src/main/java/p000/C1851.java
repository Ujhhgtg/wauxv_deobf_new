package p000;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᲈᲇᤝᲁᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1851 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2431 f6177;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public final List f6178;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final String f6179;

    public C1851(Class cls, Class cls2, Class cls3, List list, InterfaceC2431 interfaceC2431) {
        this.f6177 = interfaceC2431;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Must not be empty.");
        }
        this.f6178 = list;
        this.f6179 = "Failed LoadPath{" + cls.getSimpleName() + "->" + cls2.getSimpleName() + "->" + cls3.getSimpleName() + "}";
    }

    public final String toString() {
        return "LoadPath{decodePaths=" + Arrays.toString(this.f6178.toArray()) + '}';
    }

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public final InterfaceC2624 m3760(int i, int i2, C0383 c0383, InterfaceC0966 interfaceC0966, C2336 c2336) {
        InterfaceC2431 interfaceC2431 = this.f6177;
        List list = (List) interfaceC2431.mo1458();
        AbstractC2727.m4693(list, "Argument must not be null");
        try {
            List list2 = this.f6178;
            int size = list2.size();
            InterfaceC2624 interfaceC2624M2634 = null;
            for (int i3 = 0; i3 < size; i3++) {
                try {
                    interfaceC2624M2634 = ((C0977) list2.get(i3)).m2634(i, i2, c0383, interfaceC0966, c2336);
                } catch (C1474 e) {
                    list.add(e);
                }
                if (interfaceC2624M2634 != null) {
                    break;
                }
            }
            if (interfaceC2624M2634 == null) {
                throw new C1474(this.f6179, new ArrayList(list));
            }
            interfaceC2431.mo1457(list);
            return interfaceC2624M2634;
        } catch (Throwable th) {
            interfaceC2431.mo1457(list);
            throw th;
        }
    }
}
