package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0852 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0852 f3266 = new C0852();

    public static final LinkedHashSet f3267 = new LinkedHashSet();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0850.f3264, dexKitBridge, new C0807(22));
        AbstractC1574.findMethod(C0851.f3265, dexKitBridge, new C0807(23));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0850.f3264));
        C0852 c0852 = f3266;
        C3689 c3689M4172 = C2309.createHook(c0852, listSingletonList);
        c3689M4172.m5351(new C0807(26));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c0852, Collections.singletonList(AbstractC1574.dexToMethod(C0851.f3265)));
        c3689M4173.m5351(new C0807(25));
        c3689M4173.applyHook();
    }
}
