package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0538 implements InterfaceC1743 {

    public static final C0538 f2242 = new C0538();

    public static final C2399 f2243 = new C2399("kotlin.Byte", C2397.f7661);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f2243;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Byte.valueOf(interfaceC0974.mo2521());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2801(((Number) obj).byteValue());
    }
}
