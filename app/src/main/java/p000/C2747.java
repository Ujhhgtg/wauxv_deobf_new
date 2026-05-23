package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2747 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2747 f8827 = new C2747();

    public static final LinkedHashSet f8828 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2745.f8825, dexKitBridge, new C2734(9));
        AbstractC1574.findMethod(C2746.f8826, dexKitBridge, new C2734(10));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2745.f8825));
        C2747 c2747 = f8827;
        C3689 c3689M4172 = C2309.createHook(c2747, listSingletonList);
        c3689M4172.m5351(new C2734(12));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c2747, Collections.singletonList(AbstractC1574.dexToMethod(C2746.f8826)));
        c3689M4173.m5351(new C2734(14));
        c3689M4173.applyHook();
    }
}
