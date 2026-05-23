package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1294 extends AbstractC1823 implements InterfaceC1582 {

    public static final C1294 f4709 = new C1294();

    public static final LinkedHashSet f4710 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1292.f4707, dexKitBridge, new C1285(7));
        AbstractC1574.findMethod(C1293.f4708, dexKitBridge, new C1285(8));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1292.f4707));
        C1294 c1294 = f4709;
        C3689 c3689M4172 = C2309.createHook(c1294, listSingletonList);
        c3689M4172.m5351(new C1285(10));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c1294, Collections.singletonList(AbstractC1574.dexToMethod(C1293.f4708)));
        c3689M4173.m5351(new C1285(11));
        c3689M4173.applyHook();
    }
}
