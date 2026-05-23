package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3617 extends AbstractC2867 implements InterfaceC1599 {

    public static final C3617 f11313;

    public static final String f11314;

    public static final String f11315;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11313 = new C3617("VoiceInput");
        f11314 = "测试-配置修复";
        f11315 = "禁用聊天输入栏语音图标";
    }

    @Override // p000.InterfaceC1599
    public final void mo3237(C1563 c1563, String str) {
        if (mo3264() && AbstractC2207.m4087(str, "RepairerConfig_VoiceInput_Int")) {
            c1563.setReturn(0);
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11315;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11314;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
