package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2057 extends AbstractC2867 implements InterfaceC1576 {

    public static final C2057 f6849;

    public static final String f6850;

    public static final String f6851;

    public static final String f6852;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6849 = new C2057("MsgForwardSnsHook");
        f6850 = "菜单";
        f6851 = "消息转圈";
        f6852 = "支持将部分消息转发到朋友圈编辑发表";
    }

    @Override // p000.InterfaceC1576
    public final List mo2764(MsgInfoBean msgInfoBean) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            if (msgInfoBean.isText()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_ForwardSns, "转圈", R.drawable.ic_menu_forward_24dp, new C1933(12)));
            }
            if (msgInfoBean.isImage()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_ForwardSns, "转圈", R.drawable.ic_menu_forward_24dp, new C1933(13)));
            }
            if (msgInfoBean.isVideo()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_ForwardSns, "转圈", R.drawable.ic_menu_forward_24dp, new C1933(14)));
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6852;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6851;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6850;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
