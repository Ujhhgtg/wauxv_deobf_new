package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1724 implements InterfaceC1743 {

    public static final C1724 f5818 = new C1724();

    public static final C2656 f5819;

    static {
        C2658 c2658 = C2658.f8572;
        InterfaceC2654[] interfaceC2654Arr = new InterfaceC2654[0];
        if (AbstractC2841.m4836("kotlinx.serialization.json.JsonNull")) {
            throw new IllegalArgumentException("Blank serial names are prohibited");
        }
        if (c2658.equals(C2851.f9111)) {
            throw new IllegalArgumentException("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
        }
        C0708 c0708 = new C0708("kotlinx.serialization.json.JsonNull");
        f5819 = new C2656("kotlinx.serialization.json.JsonNull", c2658, c0708.f2691.size(), AbstractC0270.m1389(interfaceC2654Arr), c0708);
    }

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f5819;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        AbstractC3471.m5065(interfaceC0974);
        if (interfaceC0974.mo2520()) {
            throw new C1713(AbstractC3681.m5327(-1, "Expected 'null' literal", null, null, null));
        }
        return C1723.INSTANCE;
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        AbstractC3471.m5063(interfaceC1206);
        interfaceC1206.mo2797();
    }
}
