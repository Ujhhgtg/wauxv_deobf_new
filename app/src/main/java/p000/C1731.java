package p000;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᤞᲀᛸᤝᲈᲁᲇ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1731 implements InterfaceC1743 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ, reason: contains not printable characters */
    public static final C1731 f5826 = new C1731();

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ, reason: contains not printable characters */
    public static final C2656 f5827;

    static {
        C2397 c2397 = C2397.f7668;
        InterfaceC2654[] interfaceC2654Arr = new InterfaceC2654[0];
        if (AbstractC2841.m4836("kotlinx.serialization.json.JsonPrimitive")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c2397.equals(C2851.f9111)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0708 c0708 = new C0708("kotlinx.serialization.json.JsonPrimitive");
        f5827 = new C2656("kotlinx.serialization.json.JsonPrimitive", c2397, c0708.f2691.size(), AbstractC0270.m1389(interfaceC2654Arr), c0708);
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲇᲈ */
    public final InterfaceC2654 mo1363() {
        return f5827;
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲁᲈᲇ */
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        C2828 c2828M5065 = AbstractC3471.m5065(interfaceC0974);
        AbstractC1715 abstractC1715M4812 = c2828M5065.m4812();
        if (abstractC1715M4812 instanceof AbstractC1730) {
            return (AbstractC1730) abstractC1715M4812;
        }
        String str = "Unexpected JSON element, expected JsonPrimitive, had " + AbstractC2519.classToKClass(abstractC1715M4812.getClass());
        
        throw new C1713(AbstractC3681.m5327(-1, str, null, null, AbstractC3681.m5333(-1, abstractC1715M4812.toString()).toString()));
    }

    @Override // p000.InterfaceC1743
    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ */
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        AbstractC1730 abstractC1730 = (AbstractC1730) obj;
        AbstractC3471.m5063(interfaceC1206);
        if (abstractC1730 instanceof C1723) {
            interfaceC1206.mo2798(C1724.f5818, C1723.INSTANCE);
        } else {
            interfaceC1206.mo2798(C1721.f5816, (C1720) abstractC1730);
        }
    }
}
