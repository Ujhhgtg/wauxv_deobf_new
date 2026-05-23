package p000;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1537 extends AbstractC2867 implements InterfaceC1582 {

    public static final C1537 f5378;

    public static final Set f5379;

    public static final String f5380;

    public static final String f5381;

    public static final String f5382;

    public static final C1338 f5383;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5378 = new C1537("HideChatItemMenuHook");
        f5379 = AbstractC0270.m1390(new String[]{"提醒", "搜一搜"});
        f5380 = "净化";
        f5381 = "隐藏聊天菜单";
        f5382 = "自定义隐藏聊天长按消息中的菜单项目";
        f5383 = new C1338(22);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C1535.f5376, dexKitBridge, new C1338(23));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C1535.f5376));
        C1537 c1537 = f5378;
        C3689 c3689M4172 = C2309.createHook(c1537, listSingletonList);
        c1537.hookBefore(c3689M4172, new C1338(25));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f5382;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5381;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5380;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f5383;
    }
}
