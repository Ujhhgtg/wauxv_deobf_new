package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2113 extends AbstractC2867 implements InterfaceC1584 {

    public static final C2113 f6962;

    public static final String f6963;

    public static final String f6964;

    public static final String f6965;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6962 = new C2113("MyFavMenuForwardHook");
        f6963 = "收藏";
        f6964 = "我的收藏语音转发";
        f6965 = "在我的收藏页面长按语音呼出转发菜单";
    }

    public final List m3928() {
        return !mo3264() ? C1189.f4329 : Collections.singletonList(new C1287("转发[WA]", new C2058(23)));
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6965;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6964;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6963;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
