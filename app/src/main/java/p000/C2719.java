package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2719 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2719 f8775;

    public static final String f8776;

    public static final String f8777;

    public static final String f8778;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8775 = new C2719("SkipWebSpamUrlHook");
        f8776 = "聊天";
        f8777 = "跳过网页风险";
        f8778 = "无视网页存在的安全风险强制继续访问";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2718.f8774, dexKitBridge, new C2659(16));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2718.f8774));
        C2719 c2719 = f8775;
        C3689 c3689M4172 = C2309.createHook(c2719, listSingletonList);
        c2719.hookBefore(c3689M4172, new C2659(17));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8778;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8777;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8776;
    }
}
