package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0186 extends AbstractC2867 implements InterfaceC1594 {

    public static final C0186 f1243;

    public static final String f1244;

    public static final String f1245;

    public static final String f1246;

    public static final C0105 f1247;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1243 = new C0186("AntiNotificationHook");
        f1244 = "实验";
        f1245 = "静默通知";
        f1246 = "屏蔽群聊里叼毛艾特所有人的全体通知";
        f1247 = new C0105(7);
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1246;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1245;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1244;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1247;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
