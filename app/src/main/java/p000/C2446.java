package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2446 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2446 f7775;

    public static final String f7776;

    public static final String f7777;

    public static final String f7778;

    static {
        String[] strArr = AbstractC1574.f5469;
        f7775 = new C2446("QuickClearQuoteHook");
        f7776 = "聊天";
        f7777 = "快捷清空引用";
        f7778 = "输入框无内容时监听键盘删除清空引用";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2445.f7774, dexKitBridge, new C2316(28));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2445.f7774));
        C2446 c2446 = f7775;
        C3689 c3689M4172 = C2309.createHook(c2446, listSingletonList);
        c2446.hookBefore(c3689M4172, new C2316(29));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7778;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7777;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7776;
    }
}
