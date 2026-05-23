package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C3626 extends AbstractC2867 implements InterfaceC1576 {

    public static final C3626 f11328;

    public static final String f11329;

    public static final String f11330;

    public static final String f11331;

    public static final String f11332;

    public static final C3618 f11333;

    static {
        String[] strArr = AbstractC1574.f5469;
        f11328 = new C3626("VoiceSaveHook");
        C2873 c2873 = AbstractC2342.f7529;
        f11329 = AbstractC2342.m4330("Download", "Voice");
        f11330 = "菜单";
        f11331 = "语音保存";
        f11332 = "支持将语音消息自由保存到本地存储中";
        f11333 = new C3618(11);
    }

    @Override // p000.InterfaceC1576
    public final List mo2764(MsgInfoBean msgInfoBean) {
        return (mo3264() && msgInfoBean.isVoice()) ? Collections.singletonList(new C0638(R.id.MenuItem_Chat_VoiceSave, "保存", R.drawable.ic_menu_save_24dp, new C1933(29))) : C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f11332;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f11331;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f11330;
    }

    @Override // p000.AbstractC2867
    public final InterfaceC1425 mo1130() {
        return f11333;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
