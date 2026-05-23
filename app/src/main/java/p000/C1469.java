package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C1469 extends AbstractC2867 implements InterfaceC1599 {

    public static final C1469 f5239;

    public static final String f5240;

    public static final String f5241;

    static {
        String[] strArr = AbstractC1574.f5469;
        f5239 = new C1469("GlobalContactInfo");
        f5240 = "测试-配置修复";
        f5241 = "ContactInfo复制";
    }

    @Override // p000.InterfaceC1599
    public final void mo3237(C1563 c1563, String str) {
        if (mo3264() && AbstractC2207.m4087(str, "RepairerConfig_GlobalContactInfo_Int")) {
            c1563.setReturn(1);
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f5241;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f5240;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
