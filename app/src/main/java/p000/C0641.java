package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0641 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0641 f2488 = new C0641();

    public static final LinkedHashSet f2489 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0639.f2486, dexKitBridge, new C0605(10));
        AbstractC1574.findMethod(C0640.f2487, dexKitBridge, new C0605(11));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0639.f2486));
        C0641 c0641 = f2488;
        C3689 c3689M4172 = C2309.createHook(c0641, listSingletonList);
        c3689M4172.m5351(new C0605(12));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c0641, Collections.singletonList(AbstractC1574.dexToMethod(C0640.f2487)));
        c3689M4173.m5351(new C0605(13));
        c3689M4173.applyHook();
    }
}
