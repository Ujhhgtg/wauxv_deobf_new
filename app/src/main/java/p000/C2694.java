package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2694 implements InterfaceC1743 {

    public static final C2694 f8689 = new C2694();

    public static final C2399 f8690 = new C2399("kotlin.Short", C2397.f7667);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f8690;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Short.valueOf(interfaceC0974.mo2522());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2800(((Number) obj).shortValue());
    }
}
