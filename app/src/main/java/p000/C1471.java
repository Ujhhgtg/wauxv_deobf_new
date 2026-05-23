package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1471 extends AbstractC2867 implements InterfaceC1599 {

    public static final C1471 f5242;

    public static final String f5243;

    public static final String f5244;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5242 = new C1471("GlobalToastActivityName");
        f5243 = "测试-配置修复";
        f5244 = "查看Activity的类名";
    }

    @Override // p000.InterfaceC1599
    public final void mo3237(C1563 c1563, String str) {
        if (mo3264() && AbstractC2207.m4087(str, "RepairerConfig_GlobalToastActivityName_Int")) {
            c1563.setReturn(1);
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5244;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5243;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
