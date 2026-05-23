package p000;

import java.util.Collections;
import java.util.LinkedHashSet;
import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0840 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0840 f3240 = new C0840();

    public static final LinkedHashSet f3241 = new LinkedHashSet();

    public static final String[] f3242 = {EnumC3675.f11514.f11518, EnumC3675.f11515.f11518, EnumC3675.f11516.f11518};

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0839.f3239, dexKitBridge, new C0807(14));
    }

    @Override // p000.AbstractC1823, p000.AbstractC1557
    public final String[] mo1238() {
        return f3242;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C3689 c3689M4172 = C2309.createHook(f3240, Collections.singletonList(AbstractC1574.dexToMethod(C0839.f3239)));
        c3689M4172.m5351(new C0807(16));
        c3689M4172.applyHook();
    }
}
