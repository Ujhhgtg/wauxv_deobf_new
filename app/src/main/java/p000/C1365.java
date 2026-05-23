package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1365 implements InterfaceC1743 {

    public static final C1365 f4873 = new C1365();

    public static final C2399 f4874 = new C2399("kotlin.Float", C2397.f7664);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f4874;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Float.valueOf(interfaceC0974.mo2523());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2804(((Number) obj).floatValue());
    }
}
