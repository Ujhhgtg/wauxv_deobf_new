package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1717 implements InterfaceC1743 {

    public static final C1717 f5811 = new C1717();

    public static final C2656 f5812 = AbstractC1459.m3174("kotlinx.serialization.json.JsonElement", C2374.f7631, new InterfaceC2654[0], new C1608(23));

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f5812;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return AbstractC3471.m5065(interfaceC0974).m4812();
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        AbstractC1715 abstractC1715 = (AbstractC1715) obj;
        AbstractC3471.m5063(interfaceC1206);
        if (abstractC1715 instanceof AbstractC1730) {
            interfaceC1206.mo2798(C1731.f5826, abstractC1715);
        } else if (abstractC1715 instanceof C1726) {
            interfaceC1206.mo2798(C1728.f5824, abstractC1715);
        } else {
            if (!(abstractC1715 instanceof C1708)) {
                throw new C0761();
            }
            interfaceC1206.mo2798(C1710.f5806, abstractC1715);
        }
    }
}
