package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0932 extends AbstractC2867 {

    public static final C0932 f3421;

    public static final String f3422;

    public static final String f3423;

    public static final String f3424;

    public static final C0853 f3425;

    static {
        String[] strArr = AbstractC1574.f5469;
        f3421 = new C0932("CustomBalanceHook");
        f3422 = "美化";
        f3423 = "自定义余额";
        f3424 = "可动态替换真实余额为指定的金额数值";
        f3425 = new C0853(16);
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView")).m3492();
        c1973M3492.f4482 = new C0853(17);
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
        C0932 c0932 = f3421;
        C3689 c3689M4174 = c0932.m4174(c1982, 1);
        c0932.hookBefore(c3689M4174, new C0853(18));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f3424;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f3423;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f3422;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f3425;
    }
}
