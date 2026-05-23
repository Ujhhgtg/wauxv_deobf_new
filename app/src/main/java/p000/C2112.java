package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2112 extends AbstractC2867 implements InterfaceC1585 {

    public static final C2112 f6958;

    public static final String f6959;

    public static final String f6960;

    public static final String f6961;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6958 = new C2112("MyFavFilterMenuForwardHook");
        f6959 = "收藏";
        f6960 = "我的收藏语音过滤转发";
        f6961 = "在我的收藏页面长按语音呼出转发菜单";
    }

    public final List m3927() {
        return !mo3264() ? C1189.f4329 : Collections.singletonList(new C1291("转发[WA]", new C2058(22)));
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6961;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6960;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6959;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
