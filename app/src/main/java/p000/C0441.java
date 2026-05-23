package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0441 implements InterfaceC1743 {

    public static final C0441 f2008 = new C0441();

    public static final C2399 f2009 = new C2399("kotlin.Boolean", C2397.f7660);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f2009;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Boolean.valueOf(interfaceC0974.mo2513());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2802(((Boolean) obj).booleanValue());
    }
}
