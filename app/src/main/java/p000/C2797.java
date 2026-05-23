package p000;

import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2797 extends AbstractC2867 implements InterfaceC1582 {

    public static final C2797 f8923;

    public static final String f8924;

    public static final String f8925;

    public static final String f8926;

    public static final C2764 f8927;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8923 = new C2797("SportStepHook");
        f8924 = "高危";
        f8925 = "运动步数";
        f8926 = "启用后需要多次打开微信运动使其变化";
        f8927 = new C2764(26);
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2795.f8921, dexKitBridge, new C2764(27));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2795.f8921));
        C2797 c2797 = f8923;
        C3689 c3689M4172 = C2309.createHook(c2797, listSingletonList);
        c2797.m3262(c3689M4172, new C2764(29));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8926;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8925;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8924;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f8927;
    }
}
