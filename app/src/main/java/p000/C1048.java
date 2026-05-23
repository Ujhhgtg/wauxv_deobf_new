package p000;

import android.view.WindowManager;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1048 extends AbstractC2867 {

    public static final C1048 f3817;

    public static final String f3818;

    public static final String f3819;

    public static final String f3820;

    static {
        String[] strArr = AbstractC1574.f5469;
        f3817 = new C1048("DisableBrightnessHook");
        f3818 = "杂项";
        f3819 = "禁止屏幕高亮";
        f3820 = "屏蔽深夜点击收付款后的屏幕强制亮度";
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.android.internal.policy.PhoneWindow")).m3492();
        c1973M3492.name = "setAttributes";
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(WindowManager.LayoutParams.class)}, 1, c1973M3492);
        C1048 c1048 = f3817;
        C3689 c3689M4174 = c1048.m4174(c1982, 1);
        c1048.hookBefore(c3689M4174, new C1047(0));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f3820;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f3819;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f3818;
    }
}
