package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0208 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0208 f1296;

    public static final String f1297;

    public static final String f1298;

    public static final String f1299;

    public static final String[] f1300;

    public static final boolean f1301;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1296 = new C0208("AppBrandAntiSplashAdHook");
        f1297 = "小程序";
        f1298 = "禁止开屏广告";
        f1299 = "阻止小程序启动时加载的五秒全屏广告";
        f1300 = new String[]{EnumC3675.f11515.f11518, EnumC3675.f11516.f11518};
        f1301 = true;
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(AppBrandAntiSplashAdHook$MethodAdDataCallback.f1295, dexKitBridge, new C0199(8));
    }

    @Override // p000.AbstractC2867, p000.AbstractC1557
    public final String[] mo1238() {
        return f1300;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(AppBrandAntiSplashAdHook$MethodAdDataCallback.f1295));
        C3689 c3689M4172 = C2309.createHook(f1296, listSingletonList);
        f1296.hookBefore(c3689M4172, new C0199(9));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1299;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1298;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1297;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f1301;
    }
}
