package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3481 implements InterfaceC1743 {

    public static final C3481 f10977 = new C3481();

    public static final C1637 f10978 = AbstractC2203.m4023("kotlin.UInt", C1665.f5622);

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f10978;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        return new C3477(interfaceC0974.mo2517(f10978).mo2516());
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        interfaceC1206.mo2803(f10978).mo2806(((C3477) obj).f10972);
    }
}
