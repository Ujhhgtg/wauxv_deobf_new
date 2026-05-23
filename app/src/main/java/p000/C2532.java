package p000;

import android.content.ComponentName;
import android.content.Intent;
import java.util.Collections;
import java.util.List;

import org.luckypray.dexkit.DexKitBridge;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2532 extends AbstractC2867 implements InterfaceC1582, InterfaceC1602 {

    public static final C2532 f8073;

    public static final String f8074;

    public static final String f8075;

    public static final String f8076;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8073 = new C2532("RemoveMultiSelectLimitHook");
        f8074 = "限制";
        f8075 = "移除多选限制";
        f8076 = "移除选择好友群聊最多只能九个的限制";
    }

    @Override // p000.InterfaceC1602
    public final void mo1407(C1563 c1563, Intent intent) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            ComponentName component = intent.getComponent();
            String className = component != null ? component.getClassName() : null;
            if (className != null) {
                int iHashCode = className.hashCode();
                if (iHashCode != -1442966170) {
                    if (iHashCode != -604671604 || !className.equals("com.tencent.mm.ui.mvvm.MvvmSelectContactUI")) {
                        return;
                    }
                } else if (!className.equals("com.tencent.mm.ui.mvvm.MvvmContactListUI")) {
                    return;
                }
                intent.putExtra("max_limit_num", 2147483647);
            }
        }
    }

    @Override // p000.InterfaceC1582
    public final void mo1232(DexKitBridge dexKitBridge) {
        AbstractC1574.findMethod(C2531.f8072, dexKitBridge, new C2444(19));
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        List listSingletonList = Collections.singletonList(AbstractC1574.dexToMethod(C2531.f8072));
        C2532 c2532 = f8073;
        C3689 c3689M4172 = C2309.createHook(c2532, listSingletonList);
        c2532.hookBefore(c3689M4172, new C2444(20));
        c3689M4172.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8076;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8075;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8074;
    }
}
