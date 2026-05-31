package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᤝᲈᲇᛸᲁᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1729 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1729 f5849 = new C1729();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1728 f5850 = C1728.f5846;

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5850;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        AbstractC1586.m3468(interfaceC0978);
        return new C1727((List) new C0268(C1740.f5874).m1073(interfaceC0978, null));
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1727 c1727 = (C1727) obj;
        AbstractC1586.m3467(interfaceC1207);
        C1740 c1740 = C1740.f5874;
        C0264 c0264 = new C0264(c1740.mo1509(), 1);
        int size = c1727.size();
        InterfaceC0765 interfaceC0765Mo2931 = interfaceC1207.mo2931(c0264, size);
        Iterator<AbstractC1736> it = c1727.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC0765Mo2931.mo2346(c0264, i, c1740, it.next());
        }
        interfaceC0765Mo2931.mo2343(c0264);
    }
}
