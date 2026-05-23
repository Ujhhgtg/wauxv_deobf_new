package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2733 extends AbstractC2867 implements InterfaceC1600 {

    public static final C2733 f8803;

    public static final String f8804;

    public static final String f8805;

    public static final String f8806;

    static {
        String[] strArr = AbstractC1574.f5469;
        f8803 = new C2733("SnsForwardHook");
        f8804 = "朋友圈";
        f8805 = "朋友圈消息转发";
        f8806 = "支持在朋友圈转发并编辑部分消息发表";
    }

    @Override // p000.InterfaceC1600
    public final List mo3340() {
        return !mo3264() ? C1189.f4329 : Collections.singletonList(new C2744(R.id.MenuItem_Sns_Forward, "转发[WA]", new C2729(1)));
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f8806;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f8805;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f8804;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
