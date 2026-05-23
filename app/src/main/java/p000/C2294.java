package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2294 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2294 f7389 = new C2294();

    public static final LinkedHashSet f7390 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2293.f7388, dexKitBridge, new C2193(20));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f7389, Collections.singletonList(AbstractC1574.dexToMethod(C2293.f7388)));
        c3689M4172.m5350(new C2193(21));
        c3689M4172.applyHook();
    }
}
