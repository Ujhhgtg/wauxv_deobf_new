package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲁᤝᲇᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1740 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1740 f5874 = new C1740();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2717 f5875 = AbstractC2235.m4194("kotlinx.serialization.json.JsonElement", C2427.f7775, new InterfaceC2715[0], new C1633(9));

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5875;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        return AbstractC1586.m3468(interfaceC0978).m4845();
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        AbstractC1736 abstractC1736 = (AbstractC1736) obj;
        AbstractC1586.m3467(interfaceC1207);
        if (abstractC1736 instanceof AbstractC1754) {
            interfaceC1207.mo2920(C1755.f5889, abstractC1736);
        } else if (abstractC1736 instanceof C1750) {
            interfaceC1207.mo2920(C1752.f5887, abstractC1736);
        } else {
            if (!(abstractC1736 instanceof C1727)) {
                throw new C0758();
            }
            interfaceC1207.mo2920(C1729.f5849, abstractC1736);
        }
    }
}
