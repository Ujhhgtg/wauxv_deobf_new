package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0188 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0188 f1249;

    public static final String f1250;

    public static final String f1251;

    public static final String f1252;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1249 = new C0188("AntiRevoke1Hook");
        f1250 = "聊天";
        f1251 = "阻止消息撤回1";
        f1252 = "消息无撤回提示，流畅款，三款选一款";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0187.f1248, dexKitBridge, new C0105(10));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0187.f1248));
        C0188 c0188 = f1249;
        C3689 c3689M4172 = C2309.createHook(c0188, listSingletonList);
        c0188.hookBefore(c3689M4172, new C0105(12));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1252;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1251;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1250;
    }
}
