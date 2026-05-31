package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲈᤝᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1752 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1752 f5887 = new C1752();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1751 f5888 = C1751.f5884;

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5888;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        AbstractC1586.m3468(interfaceC0978);
        C2899 c2899 = C2899.f9270;
        C1740 c1740 = C1740.f5874;
        return new C1750((Map) new C1822().m1073(interfaceC0978, null));
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        C1750 c1750 = (C1750) obj;
        AbstractC1586.m3467(interfaceC1207);
        C2899 c2899 = C2899.f9270;
        C1740 c1740 = C1740.f5874;
        C2899 c28910 = C2899.f9270;
        C1740 c1741 = C1740.f5874;
        C1821 c1821 = new C1821(C2899.f9271, C1740.f5875);
        InterfaceC0765 interfaceC0765Mo2931 = interfaceC1207.mo2931(c1821, c1750.size());
        int i = 0;
        for (Map.Entry<String, AbstractC1736> entry : c1750.entrySet()) {
            String key = entry.getKey();
            AbstractC1736 value = entry.getValue();
            int i2 = i + 1;
            interfaceC0765Mo2931.mo2346(c1821, i, C2899.f9270, key);
            i += 2;
            interfaceC0765Mo2931.mo2346(c1821, i2, C1740.f5874, value);
        }
        interfaceC0765Mo2931.mo2343(c1821);
    }
}
