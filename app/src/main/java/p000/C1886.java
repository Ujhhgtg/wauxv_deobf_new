package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1886 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1886 f6232 = new C1886();

    public static final LinkedHashSet f6233 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1885.f6231, dexKitBridge, new C1837(29));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f6232, Collections.singletonList(AbstractC1574.dexToMethod(C1885.f6231)));
        c3689M4172.m5350(new C1884(0));
        c3689M4172.applyHook();
    }
}
