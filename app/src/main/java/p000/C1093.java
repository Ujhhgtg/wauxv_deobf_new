package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1093 implements InterfaceC1743 {

    public static final C1093 f4103 = new C1093();

    public static final C2399 f4104 = new C2399("kotlin.Double", C2397.f7663);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f4104;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Double.valueOf(interfaceC0974.mo2524());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2799(((Number) obj).doubleValue());
    }
}
