package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2321 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2321 f7452;

    public static final String f7453;

    public static final String f7454;

    public static final String f7455;

    public static final String f7456;

    public static final C2316 f7457;

    public static final boolean f7458;

    public static final ArrayList f7459;

    static {
        String[] strArr = AbstractC1574.f5469;
        f7452 = new C2321("PanelEmojiHook");
        C2873 c2873 = AbstractC2342.f7529;
        f7453 = AbstractC2342.m4330("Resource", "Panel");
        f7454 = "聊天";
        f7455 = "面板本地表情";
        f7456 = "为聊天面板的表情分组添加相关表情包";
        f7457 = new C2316(5);
        f7458 = true;
        f7459 = new ArrayList();
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2318.f7449, dexKitBridge, new C2316(6));
        AbstractC1574.findMethod(C2320.f7451, dexKitBridge, new C2316(7));
        AbstractC1574.findMethod(C2319.f7450, dexKitBridge, new C2193(25));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        C1002 c1002 = AbstractC1075.f3893;
        AbstractC0968.m2486(ExecutorC0990.f3609, new C0303(2, null, 4));
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2320.f7451));
        C2321 c2321 = f7452;
        C3689 c3689M4172 = C2309.createHook(c2321, listSingletonList);
        c2321.m3262(c3689M4172, new C2193(26));
        c3689M4172.applyHook();
        C3689 c3689M4173 = C2309.createHook(c2321, Collections.singletonList(AbstractC1574.dexToMethod(C2319.f7450)));
        c2321.hookBefore(c3689M4173, new C2193(27));
        c3689M4173.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7456;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7455;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7454;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f7457;
    }

    @Override // p000.AbstractC2867
    public final boolean mo1131() {
        return f7458;
    }
}
