package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2459 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2459 f7804;

    public static final String f7805;

    public static final String f7806;

    public static final String f7807;

    public static final C2444 f7808;

    static {
        AbstractC1574.m3300(-523947355404980L);
        AbstractC1574.m3300(-523977420176052L);
        String[] strArr = AbstractC1574.f5469;
        f7804 = new C2459("QuoteRemindMsgHook");
        f7805 = "聊天";
        f7806 = "引用消息提醒";
        f7807 = "主页列表添加有人回我消息的红字提醒";
        f7808 = new C2444(10);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2456.f7801, dexKitBridge, new C2444(11));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2456.f7801));
        C2459 c2459 = f7804;
        C3689 c3689M4172 = C2309.createHook(c2459, listSingletonList);
        c2459.hookBefore(c3689M4172, new C2444(14));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7807;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7806;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7805;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f7808;
    }
}
