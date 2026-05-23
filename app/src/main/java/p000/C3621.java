package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3621 extends AbstractC2867 implements InterfaceC1582 {

    public static final C3621 f11319;

    public static final String f11320;

    public static final String f11321;

    public static final String f11322;

    public static final C3618 f11323;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11319 = new C3621("VoiceLengthHook");
        f11320 = "辅助";
        f11321 = "语音时长";
        f11322 = "可自定义修改发送的语音消息显示时长";
        f11323 = new C3618(0);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C3619.f11317, dexKitBridge, new C3618(1));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C3619.f11317));
        C3621 c3621 = f11319;
        C3689 c3689M4172 = C2309.createHook(c3621, listSingletonList);
        c3621.hookBefore(c3689M4172, new C3618(2));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f11322;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11321;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11320;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f11323;
    }
}
