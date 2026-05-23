package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2195 extends AbstractC1823 implements InterfaceC1582 {

    public static final C2195 f7156 = new C2195();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        if (AbstractC3471.m5079(WeChatVersions.f11545) || AbstractC3471.m5080(WeChatVersionsPlay.f11511)) {
            return;
        }
        AbstractC1574.findMethod(C2194.f7155, dexKitBridge, new C2174(29));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
