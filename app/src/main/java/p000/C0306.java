package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0306 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0306 f1528;

    public static final String f1529;

    public static final String f1530;

    public static final String f1531;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1528 = new C0306("AutoEnableForceNotifyHook");
        f1529 = "聊天";
        f1530 = "自动启用提醒";
        f1531 = "始终启用好友聊天设置页中的消息提醒";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0305.f1527, dexKitBridge, new C0199(23));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0305.f1527));
        C0306 c0306 = f1528;
        C3689 c3689M4172 = C2309.createHook(c0306, listSingletonList);
        c0306.m3262(c3689M4172, new C0199(24));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1531;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1530;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1529;
    }
}
