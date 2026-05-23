package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2105 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2105 f6940;

    public static final String f6941;

    public static final String f6942;

    public static final String f6943;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6940 = new C2105("MultiWebViewHook");
        f6941 = "杂项";
        f6942 = "文章多开窗口";
        f6943 = "可同时阅读多篇公众号文章在多窗口中";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2104.f6939, dexKitBridge, new C2058(18));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2104.f6939));
        C2105 c2105 = f6940;
        C3689 c3689M4172 = C2309.createHook(c2105, listSingletonList);
        c2105.hookBefore(c3689M4172, new C2058(20));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6943;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6942;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6941;
    }
}
