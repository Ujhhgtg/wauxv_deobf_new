package p000;

import android.view.View;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1542 extends AbstractC2867 {

    public static final C1542 f5392;

    public static final String f5393;

    public static final String f5394;

    public static final String f5395;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5392 = new C1542("HideMeAccountInfoHook");
        f5393 = "净化";
        f5394 = "隐藏微信号";
        f5395 = "隐藏我界面微信号，与资料卡居中冲突";
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(View.class)}, 1, AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.pluginsdk.ui.preference.AccountInfoPreference")).m3492());
        C1542 c1542 = f5392;
        C3689 c3689M4174 = c1542.m4174(c1982, 1);
        c1542.m3262(c3689M4174, new C1538(7));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f5395;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5394;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5393;
    }
}
