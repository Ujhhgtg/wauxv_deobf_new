package p000;

import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᲀᤞᤝᲈᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2500 implements InterfaceC1433 {

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲁᲈ, reason: contains not printable characters */
    public final /* synthetic */ int f7928;

    /* JADX INFO: renamed from: ᛱᛲᛳᛴᛵᛶᛷᛸᤝᤞᲀᲇᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ ConversationBean f7929;

    public /* synthetic */ C2500(ConversationBean conversationBean, int i) {
        this.f7928 = i;
        this.f7929 = conversationBean;
    }

    @Override // p000.InterfaceC1433
    public final Object invoke(Object obj) throws IOException {
        int i = this.f7928;
        C3554 c3554 = C3554.UNIT;
        String str = null;
        ConversationBean conversationBean = this.f7929;
        int i2 = 0;
        switch (i) {
            case 0:
                C0815 c0815 = (C0815) obj;
                String[] strArr = AbstractC1471.f5234;
                c0815.f3205 = "搜索群聊";
                String str2 = "群聊";
                ArrayList<GroupInfo> arrayListM4251 = AbstractC2240.m4251();
                ArrayList arrayList = new ArrayList(AbstractC0741.m2313(arrayListM4251, 10));
                for (GroupInfo groupInfo : arrayListM4251) {
                    String roomId = groupInfo.getRoomId();
                    StringBuilder sb = new StringBuilder();
                    sb.append(groupInfo.getName());
                    String remark = groupInfo.getRemark();
                    if (remark.length() <= 0) {
                        remark = str;
                    }
                    if (remark != null) {
                        sb.append("(" + remark + ')');
                    }
                    sb.append("(" + groupInfo.getGroupData().getMemberCount() + ')');
                    arrayList.add(new C0800(roomId, sb.toString(), groupInfo.getRoomId(), false));
                    str = null;
                }
                c0815.m2483(str2, arrayList);
                c0815.f3206 = R.drawable.ic_contact_confirm_24dp;
                String str3 = "邀请";
                C2501 c2501 = new C2501(conversationBean, i2);
                c0815.f3209 = str3;
                c0815.f3211 = c2501;
                break;
            default:
                C2500 c2500 = new C2500(conversationBean, i2);
                C1006 c1006 = AbstractC1080.f3904;
                AbstractC1471.m3404(ExecutorC0994.f3625, new C0161(c2500, (InterfaceC0841) null));
                break;
        }
        return c3554;
    }
}
