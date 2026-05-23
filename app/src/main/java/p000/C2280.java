package p000;

import java.util.Collections;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2280 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2280 f7375 = new C2280();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2279.f7374, dexKitBridge, new C2193(16));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f7375, Collections.singletonList(AbstractC1574.dexToMethod(C2279.f7374)));
        c3689M4172.m5351(new C2193(18));
        c3689M4172.applyHook();
    }
}
