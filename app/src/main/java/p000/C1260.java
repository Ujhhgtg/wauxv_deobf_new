package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1260 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1260 f4591 = new C1260();

    public static final LinkedHashSet f4592 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1259.f4590, dexKitBridge, new C1148(26));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f4591, Collections.singletonList(AbstractC1574.dexToMethod(C1259.f4590)));
        c3689M4172.m5350(new C1148(27));
        c3689M4172.applyHook();
    }
}
