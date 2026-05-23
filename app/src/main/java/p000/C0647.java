package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0647 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0647 f2496 = new C0647();

    public static final LinkedHashSet f2497 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0646.f2495, dexKitBridge, new C0605(27));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f2496, Collections.singletonList(AbstractC1574.dexToMethod(C0646.f2495)));
        c3689M4172.m5350(new C0605(29));
        c3689M4172.applyHook();
    }
}
