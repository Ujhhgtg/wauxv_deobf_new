package p000;

import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2449 implements InterfaceC1425 {

    public final /* synthetic */ int f7785;

    public final /* synthetic */ ConversationBean f7786;

    public /* synthetic */ C2449(ConversationBean conversationBean, int i) {
        this.f7785 = i;
        this.f7786 = conversationBean;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IOException {
        switch (this.f7785) {
            case 0:
                C0816 c0816 = (C0816) obj;
                String[] strArr = AbstractC1574.f5469;
                c0816.f3198 = "搜索群聊";
                String str = "群聊";
                ArrayList<GroupInfo> arrayListM4032 = AbstractC2203.m4032();
                ArrayList arrayList = new ArrayList(AbstractC0746.m2214(arrayListM4032, 10));
                for (GroupInfo groupInfo : arrayListM4032) {
                    String roomId = groupInfo.getRoomId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(groupInfo.getName());
                    String remark = groupInfo.getRemark();
                    if (remark.length() <= 0) {
                        remark = null;
                    }
                    if (remark != null) {
                        sb.append("(" + remark + ')');
                    }
                    sb.append("(" + groupInfo.getGroupData().getMemberCount() + ')');
                    arrayList.add(new C0801(roomId, sb.toString(), groupInfo.getRoomId(), false));
                }
                c0816.m2367("群聊", arrayList);
                c0816.f3199 = R.drawable.ic_contact_confirm_24dp;
                String str2 = "邀请";
                C2450 c2450 = new C2450(0, this.f7786);
                c0816.f3202 = "邀请";
                c0816.f3204 = c2450;
                break;
            default:
                C2449 c2449 = new C2449(this.f7786, 0);
                C0815 c0815 = new C0815();
                C0816 c0817 = new C0816(c0815);
                c2449.invoke(c0817);
                c0815.f3181 = c0817;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                break;
        }
        return Unit.INSTANCE;
    }
}
