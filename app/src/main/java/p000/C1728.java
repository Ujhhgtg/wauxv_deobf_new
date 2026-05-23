package p000;

import java.util.Map;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᤝᲁᲈᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1728 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1728 f5824 = new C1728();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C1727 f5825 = C1727.f5821;

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f5825;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        AbstractC3471.m5065(interfaceC0974);
        C2839 c2839 = C2839.f9108;
        C1717 c1717 = C1717.f5811;
        return new C1726((Map) new C1799().m929(interfaceC0974, null));
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1726 c1726 = (C1726) obj;
        AbstractC3471.m5063(interfaceC1206);
        C2839 c2839 = C2839.f9108;
        C1717 c1717 = C1717.f5811;
        C2839 c28310 = C2839.f9108;
        C1717 c1718 = C1717.f5811;
        C1798 c1798 = new C1798(C2839.f9109, C1717.f5812);
        InterfaceC0767 interfaceC0767Mo2809 = interfaceC1206.mo2809(c1798, c1726.size());
        int i = 0;
        for (Map.Entry<String, AbstractC1715> entry : c1726.entrySet()) {
            String key = entry.getKey();
            AbstractC1715 value = entry.getValue();
            int i2 = i + 1;
            interfaceC0767Mo2809.mo2245(c1798, i, C2839.f9108, key);
            i += 2;
            interfaceC0767Mo2809.mo2245(c1798, i2, C1717.f5811, value);
        }
        interfaceC0767Mo2809.mo2242(c1798);
    }
}
