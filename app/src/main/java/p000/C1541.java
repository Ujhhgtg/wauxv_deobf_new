package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1541 extends AbstractC2867 implements InterfaceC1582 {

    public static final C1541 f5387;

    public static final String f5388;

    public static final String f5389;

    public static final String f5390;

    public static final boolean f5391;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5387 = new C1541("HideDividerLineHook");
        f5388 = "净化";
        f5389 = "隐藏分割线";
        f5390 = "隐藏主界面聊天消息列表的灰色分割线";
        f5391 = true;
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1539.f5385, dexKitBridge, new C1338(26));
        if (AbstractC3471.m5079(WeChatVersions.f11543) || AbstractC3471.m5080(WeChatVersionsPlay.f11509)) {
            AbstractC1574.findMethod(C1540.f5386, dexKitBridge, new C1338(28));
        }
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1539.f5385));
        C1541 c1541 = f5387;
        C3689 c3689M4172 = C2309.createHook(c1541, listSingletonList);
        c1541.m3262(c3689M4172, new C1538(1));
        c3689M4172.applyHook();
        if (AbstractC3471.m5079(WeChatVersions.f11543) || AbstractC3471.m5080(WeChatVersionsPlay.f11509)) {
            C3689 c3689M4173 = C2309.createHook(c1541, Collections.singletonList(AbstractC1574.dexToMethod(C1540.f5386)));
            c1541.m3262(c3689M4173, new C1538(4));
            c3689M4173.applyHook();
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f5390;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5389;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5388;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f5391;
    }
}
