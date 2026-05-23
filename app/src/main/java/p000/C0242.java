package p000;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0242 extends AbstractC1823 implements InterfaceC1582 {

    public static final C0242 f1400 = new C0242();

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        if (AbstractC3471.m5079(WeChatVersions.f11536) || AbstractC3471.m5080(WeChatVersionsPlay.f11499)) {
            AbstractC1574.findMethod(AppInfo$MethodSetAppId.f1399, dexKitBridge, new C0199(12));
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
