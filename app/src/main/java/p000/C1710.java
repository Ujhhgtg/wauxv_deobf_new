package p000;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1710 implements InterfaceC1743 {

    public static final C1710 f5806 = new C1710();

    public static final C1709 f5807 = C1709.f5803;

    @Override // p000.InterfaceC1743
    public final InterfaceC2654 mo1363() {
        return f5807;
    }

    @Override // p000.InterfaceC1743
    public final Object mo924(InterfaceC0974 interfaceC0974) {
        AbstractC3471.m5065(interfaceC0974);
        return new C1708((List) new C0258(C1717.f5811).m929(interfaceC0974, null));
    }

    @Override // p000.InterfaceC1743
    public final void mo1542(InterfaceC1206 interfaceC1206, Object obj) {
        C1708 c1708 = (C1708) obj;
        AbstractC3471.m5063(interfaceC1206);
        C1717 c1717 = C1717.f5811;
        C0254 c0254 = new C0254(c1717.mo1363(), 1);
        int size = c1708.size();
        InterfaceC0767 interfaceC0767Mo2809 = interfaceC1206.mo2809(c0254, size);
        Iterator<AbstractC1715> it = c1708.iterator();
        for (int i = 0; i < size; i++) {
            interfaceC0767Mo2809.mo2245(c0254, i, c1717, it.next());
        }
        interfaceC0767Mo2809.mo2242(c0254);
    }
}
