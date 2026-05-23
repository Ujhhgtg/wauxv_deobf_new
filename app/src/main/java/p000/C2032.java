package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.MsgInfoBean;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final class C2032 extends AbstractC2867 implements InterfaceC1591 {

    public static final C2032 f6793;

    public static final String f6794;

    public static final String f6795;

    public static final String f6796;

    static {
        String[] strArr = AbstractC1574.f5469;
        f6793 = new C2032("MoreMsgRevokeHook");
        f6794 = "菜单";
        f6795 = "多选消息撤回";
        f6796 = "支持多选聊天消息后进行批量撤回操作";
    }

    @Override // p000.InterfaceC1591
    public final List mo3339(ArrayList arrayList) {
        if (mo3264() && !arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((MsgInfoBean) it.next()).isSend()) {
                    return Collections.singletonList(new C2027(R.id.MenuItem_MoreBtnBar_Revoke, "批量撤回", new C1933(10)));
                }
            }
        }
        return C1189.f4329;
    }

    @Override // p000.AbstractC2867
    public final String mo1127() {
        return f6796;
    }

    @Override // p000.AbstractC2867
    public final String mo1128() {
        return f6795;
    }

    @Override // p000.AbstractC2867
    public final String mo1129() {
        return f6794;
    }

    @Override // p000.AbstractC1557
    public final void mo1126() {
    }
}
