package p000;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0935 extends AbstractC2867 {

    public static final C0935 f3428;

    public static final String f3429;

    public static final String f3430;

    public static final String f3431;

    public static final C0853 f3432;

    static {
        String[] strArr = AbstractC1574.f5469;
        f3428 = new C0935("CustomContactCountHook");
        f3429 = "美化";
        f3430 = "自定义数量";
        f3431 = "自定义好友和群聊列表底部的显示数量";
        f3432 = new C0853(19);
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
        int i = 0;
        String[] strArr = AbstractC1574.f5469;
        MethodResolver c1973M3492 = AbstractC0968.startMethodResolution(AbstractC2201.m3988("com.tencent.mm.ui.contact.ContactCountView")).m3492();
        c1973M3492.name = "onMeasure";
        C1982 c1982 = (C1982) AbstractC0744.firstInList(c1973M3492.resolve());
        C0935 c0935 = f3428;
        C3689 c3689M4174 = c0935.m4174(c1982, 1);
        c0935.hookBefore(c3689M4174, new C0853(20));
        c3689M4174.applyHook();
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f3431;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f3430;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f3429;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f3432;
    }
}
