package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0755 extends AbstractC2867 implements InterfaceC1582 {

    public static final C0755 f2846;

    public static final String f2847;

    public static final String f2848;

    public static final String f2849;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2846 = new C0755("CommandProcessorHook");
        f2847 = "测试-杂项";
        f2848 = "强开更多命令处理";
        f2849 = "输入框点击发送时处理隐藏的其他命令";
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C0754.f2845, dexKitBridge, new C0679(7));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C0754.f2845));
        C0755 c0755 = f2846;
        C3689 c3689M4172 = C2309.createHook(c0755, listSingletonList);
        c0755.hookBefore(c3689M4172, new C0679(10));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f2849;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f2848;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f2847;
    }
}
