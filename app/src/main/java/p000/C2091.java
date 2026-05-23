package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2091 extends AbstractC2867 implements InterfaceC1576 {

    public static final C2091 f6899;

    public static final String f6900;

    public static final String f6901;

    public static final String f6902;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6899 = new C2091("MsgRepeatHook");
        f6900 = "菜单";
        f6901 = "消息复读";
        f6902 = "支持直接复读部分的简单消息到上下文";
    }

    @Override // p000.InterfaceC1576
    public final List mo2764(MsgInfoBean msgInfoBean) {
        String[] strArr = AbstractC1574.f5469;
        if (mo3264()) {
            if (msgInfoBean.isText()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(15)));
            }
            if (msgInfoBean.isImage()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(16)));
            }
            if (msgInfoBean.isVoice()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(17)));
            }
            if (msgInfoBean.isVideo()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(18)));
            }
            if (msgInfoBean.isEmoji()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(19)));
            }
            if (msgInfoBean.isQuote()) {
                return Collections.singletonList(new C0638(R.id.MenuItem_Chat_MsgRepeat, "复读", R.drawable.ic_menu_repeat_24dp, new C1933(20)));
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6902;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6901;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6900;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
