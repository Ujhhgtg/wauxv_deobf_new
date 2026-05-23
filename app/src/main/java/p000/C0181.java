package p000;

import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C0181 extends AbstractC2867 {

    public static final C0181 f1231;

    public static final String f1232;

    public static final String f1233;

    public static final String f1234;

    public static final C0105 f1235;

    static {
        String[] strArr = AbstractC1574.f5469;
        f1231 = new C0181("AntiBanHook");
        f1232 = "测试-仅限开发者使用";
        f1233 = "禁止封号";
        f1234 = "实际没有什么用，给自己图个心理安慰";
        f1235 = new C0105(2);
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f1234;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f1233;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f1232;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f1235;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
