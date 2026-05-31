package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᲈᲁᲇᤝ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1755 implements InterfaceC1767 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1755 f5889 = new C1755();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2717 f5890;

    static {
        C2450 c2450 = C2450.f7812;
        InterfaceC2715[] interfaceC2715Arr = new InterfaceC2715[0];
        if (AbstractC2901.m4869("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c2450.equals(C2911.f9280)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0703 c0703 = new C0703("kotlinx.serialization.json.JsonPrimitive");
        f5890 = new C2717("kotlinx.serialization.json.JsonPrimitive", c2450, c0703.f2685.size(), AbstractC0280.m1535(interfaceC2715Arr), c0703);
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2715 mo1509() {
        return f5890;
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo1068(InterfaceC0978 interfaceC0978) {
        C2888 c2888M3468 = AbstractC1586.m3468(interfaceC0978);
        AbstractC1736 abstractC1736M4845 = c2888M3468.m4845();
        if (abstractC1736M4845 instanceof AbstractC1754) {
            return (AbstractC1754) abstractC1736M4845;
        }
        throw new C1734(AbstractC2234.m4167(-1, "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC2574.m4549(abstractC1736M4845.getClass()), null, null, c2888M3468.m4846().f5842.f5867 ? AbstractC2234.m4177(-1, abstractC1736M4845.toString()).toString() : null));
    }

    @Override // p000.InterfaceC1767
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1648(InterfaceC1207 interfaceC1207, Object obj) {
        AbstractC1754 abstractC1754 = (AbstractC1754) obj;
        AbstractC1586.m3467(interfaceC1207);
        if (abstractC1754 instanceof C1747) {
            interfaceC1207.mo2920(C1748.f5881, C1747.INSTANCE);
        } else {
            interfaceC1207.mo2920(C1745.f5879, (C1744) abstractC1754);
        }
    }
}
