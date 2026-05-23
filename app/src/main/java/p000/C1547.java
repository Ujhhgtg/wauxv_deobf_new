package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1547 extends AbstractC2867 implements InterfaceC1582 {

    public static final C1547 f5404;

    public static final String f5405;

    public static final String f5406;

    public static final String f5407;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5404 = new C1547("HideOnLineBannerHook");
        f5405 = "净化";
        f5406 = "隐藏在线顶栏";
        f5407 = "将主页顶部状态栏其他设备已登录隐藏";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1546.f5403, dexKitBridge, new C1538(9));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1546.f5403));
        C1547 c1547 = f5404;
        C3689 c3689M4172 = C2309.createHook(c1547, listSingletonList);
        c1547.hookBefore(c3689M4172, new C1538(10));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f5407;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5406;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5405;
    }
}
