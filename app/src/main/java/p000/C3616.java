package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3616 extends AbstractC2867 implements InterfaceC1576 {

    public static final C3616 f11309;

    public static final String f11310;

    public static final String f11311;

    public static final String f11312;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11309 = new C3616("VoiceForwardHook");
        f11310 = "菜单";
        f11311 = "语音转发";
        f11312 = "支持语音消息自由转发到私聊或者群聊";
    }

    @Override // p000.InterfaceC1576
    public final List mo2764(MsgInfoBean msgInfoBean) {
        return (mo3264() && msgInfoBean.isVoice()) ? Collections.singletonList(new C0638(R.id.MenuItem_Chat_VoiceForward, "转发", R.drawable.ic_menu_forward_24dp, new C1933(28))) : C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f11312;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11311;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11310;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
