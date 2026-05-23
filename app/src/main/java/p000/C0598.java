package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0598 implements InterfaceC1743 {

    public static final C0598 f2411 = new C0598();

    public static final C2399 f2412 = new C2399("kotlin.Char", C2397.f7662);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f2412;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Character.valueOf(interfaceC0974.mo2514());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2805(((Character) obj).charValue());
    }
}
