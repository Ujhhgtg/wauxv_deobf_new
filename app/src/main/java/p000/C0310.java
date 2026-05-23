package p000;

import android.os.Bundle;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0310 extends AbstractC2867 {

    public static final C0310 f1535;

    public static final String f1536;

    public static final String f1537;

    public static final String f1538;

    public static final C0199 f1539;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1535 = new C0310("AutoLoginWinHook");
        f1536 = "杂项";
        f1537 = "自动点击登录";
        f1538 = "微信请求登录时自动勾选项及点击按钮";
        f1539 = new C0199(27);
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        C1744 c1744M2483 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.webwx.ui.ExtDeviceWXLoginUI"));
        MethodResolver c1973M3492 = c1744M2483.m3492();
        c1973M3492.name = "onCreate";
        C1982 c1982 = (C1982) AbstractC2784.setParamsAndResolveFirstMethod(new Object[]{AbstractC2519.classToKClass(Bundle.class)}, 1, c1973M3492);
        C0310 c0310 = f1535;
        C3689 c3689M4174 = c0310.m4174(c1982, 1);
        c0310.hookBefore(c3689M4174, new C0199(28));
        c3689M4174.applyHook();
        MethodResolver c1973M3493 = c1744M2483.m3492();
        c1973M3493.name = "initView";
        C3689 c3689M4175 = c0310.m4174((C1982) AbstractC1194.m2778(c1973M3493), 1);
        c0310.m3262(c3689M4175, new C0199(29));
        c3689M4175.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1538;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1537;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1536;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1539;
    }
}
