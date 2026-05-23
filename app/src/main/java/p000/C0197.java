package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0197 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0197 f1266;

    public static final String f1267;

    public static final String f1268;

    public static final String f1269;

    public static final C0105 f1270;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1266 = new C0197("AntiRevoke3Hook");
        f1267 = "聊天";
        f1268 = "阻止消息撤回3";
        f1269 = "消息有撤回提示，微叉款，三款选一款";
        f1270 = new C0105(25);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0195.f1264, dexKitBridge, new C0105(26));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0195.f1264));
        C0197 c0197 = f1266;
        C3689 c3689M4172 = C2309.createHook(c0197, listSingletonList);
        c0197.m3262(c3689M4172, new C0105(28));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1269;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1268;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1267;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1270;
    }
}
