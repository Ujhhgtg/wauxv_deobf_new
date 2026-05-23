package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0670 extends AbstractC2867 implements InterfaceC1603 {

    public static final C0670 f2551;

    public static final String f2552;

    public static final String f2553;

    static {
        String[] strArr = AbstractC1574.f5469;
        f2551 = new C0670("ChatroomMuteDetail");
        f2552 = "测试-配置同步";
        f2553 = "消息免打扰-以下消息仍通知";
    }

    @Override // p000.InterfaceC1603
    public final void mo2064(C1563 c1563, String str) {
        if (mo3264() && AbstractC2207.m4087(str, "USERINFO_CHATROOM_MUTE_DETAIL_CLIENT_GRAY_BOOLEAN_SYNC")) {
            c1563.setReturn(Boolean.TRUE);
        }
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f2553;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f2552;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
