package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2691 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2691 f8682;

    public static final String f8683;

    public static final String f8684;

    public static final String f8685;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8682 = new C2691("ShareSignatureHook");
        f8683 = "杂项";
        f8684 = "分享签名校验";
        f8685 = "绕过第三方应用分享到微信的签名校验";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2690.f8681, dexKitBridge, new C2659(7));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2690.f8681));
        C2691 c2691 = f8682;
        C3689 c3689M4172 = C2309.createHook(c2691, listSingletonList);
        c2691.hookBefore(c3689M4172, new C2659(9));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8685;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8684;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8683;
    }
}
