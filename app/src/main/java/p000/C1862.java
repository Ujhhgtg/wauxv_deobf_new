package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1862 implements InterfaceC1743 {

    public static final C1862 f6185 = new C1862();

    public static final C2399 f6186 = new C2399("kotlin.Long", C2397.f7666);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f6186;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return Long.valueOf(interfaceC0974.mo2519());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2807(((Number) obj).longValue());
    }
}
