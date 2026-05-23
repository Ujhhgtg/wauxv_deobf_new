package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0206 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0206 f1290;

    public static final String f1291;

    public static final String f1292;

    public static final String f1293;

    public static final boolean f1294;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1290 = new C0206("AppBrandAntiGlobalAdHook");
        f1291 = "小程序";
        f1292 = "禁止全局广告";
        f1293 = "可能导致部分需要广告的功能无法运行";
        f1294 = true;
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(AppBrandAntiGlobalAdHook$ConstructorOperateWxData.f1289, dexKitBridge, new C0199(4));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToCtor(AppBrandAntiGlobalAdHook$ConstructorOperateWxData.f1289));
        C3689 c3689M4172 = C2309.createHook(f1290, listSingletonList);
        f1290.hookBefore(c3689M4172, new C0199(5));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1293;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1292;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1291;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f1294;
    }
}
