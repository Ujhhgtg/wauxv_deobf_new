package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3491 implements InterfaceC1743 {

    public static final C3491 f10991 = new C3491();

    public static final C1637 f10992 = AbstractC2203.m4023("kotlin.UShort", C2694.f8689);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f10992;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return new C3487(interfaceC0974.mo2517(f10992).mo2522());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2803(f10992).mo2800(((C3487) obj).f10986);
    }
}
