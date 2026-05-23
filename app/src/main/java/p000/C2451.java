package p000;

import java.util.Collections;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2451 extends AbstractC2867 implements InterfaceC1581 {

    public static final C2451 f7789;

    public static final String f7790;

    public static final String f7791;

    public static final String f7792;

    static {
        String[] strArr = AbstractC1574.f5469;
        f7789 = new C2451("QuickPullGroupHook");
        f7790 = "菜单";
        f7791 = "快捷拉群";
        f7792 = "为聊天列表菜单添加快捷邀请好友加群";
    }

    @Override // p000.InterfaceC1581
    public final List mo3337(ConversationBean conversationBean) {
        if (mo3264()) {
            String username = conversationBean.getUsername();
            String[] strArr = AbstractC1574.f5469;
            if (!AbstractC2841.m4828(username, "@", false) && !conversationBean.getUsername().startsWith("gh_")) {
                return Collections.singletonList(new C0849(R.id.MenuItem_Conversation_QuickPullGroup, "快捷拉群", new C2444(3)));
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f7792;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f7791;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f7790;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
