package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3476 implements InterfaceC1743 {

    public static final C3476 f10970 = new C3476();

    public static final C1637 f10971 = AbstractC2203.m4023("kotlin.UByte", C0538.f2242);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f10971;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return new C3472(interfaceC0974.mo2517(f10971).mo2521());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2803(f10971).mo2801(((C3472) obj).f10965);
    }
}
