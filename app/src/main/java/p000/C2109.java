package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2109 extends AbstractC2867 implements InterfaceC1599 {

    public static final C2109 f6949;

    public static final String f6950;

    public static final String f6951;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6949 = new C2109("MvvmListDebug");
        f6950 = "测试-配置修复";
        f6951 = "选择联系人MvvmList显示Id";
    }

    @Override // p000.InterfaceC1599
    public final void mo3237(C1563 c1563, String str) {
        if (mo3264() && AbstractC2207.m4087(str, "RepairerConfig_MvvmListDebug_Int")) {
            c1563.setReturn(1);
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6951;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6950;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
