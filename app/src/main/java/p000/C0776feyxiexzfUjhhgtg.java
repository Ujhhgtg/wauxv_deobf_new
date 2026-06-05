package p000;

import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.ConversationBean;
import me.hd.wauxv.data.bean.info.GroupInfo;
import me.hd.wauxv.hook.factory.MagicFactory;

/* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱᛱfeyxiexzfᛱᛱUjhhgtgᛱᛲ能不能ᛴᛳ要点脸, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0776feyxiexzfUjhhgtg implements InterfaceC3549feyxiexzfUjhhgtg {

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛲᛴ, reason: contains not printable characters */
    public final /* synthetic */ int f3071Ujhhgtgfeyxiexzf;

    /* JADX INFO: renamed from: 上海高中ᛱ谢子非ᛱ能不能要点脸ᛱUjhhgtgᛱᛱfeyxiexzfᛱᛳᛴᛲ, reason: contains not printable characters */
    public final /* synthetic */ ConversationBean f3072Ujhhgtgfeyxiexzf;

    public /* synthetic */ C0776feyxiexzfUjhhgtg(ConversationBean conversationBean, int i) {
        this.f3071Ujhhgtgfeyxiexzf = i;
        this.f3072Ujhhgtgfeyxiexzf = conversationBean;
    }

    @Override // p000.InterfaceC3549feyxiexzfUjhhgtg
    public final Object invoke(Object obj) throws IOException {
        int i = this.f3071Ujhhgtgfeyxiexzf;
        C1943Ujhhgtgfeyxiexzf c1943Ujhhgtgfeyxiexzf = C1943Ujhhgtgfeyxiexzf.f6418Ujhhgtgfeyxiexzf;
        String str = null;
        ConversationBean conversationBean = this.f3072Ujhhgtgfeyxiexzf;
        int i2 = 0;
        switch (i) {
            case 0:
                C3678feyxiexzfUjhhgtg c3678feyxiexzfUjhhgtg = (C3678feyxiexzfUjhhgtg) obj;
                String[] strArr = AbstractC3590Ujhhgtgfeyxiexzf.f11170Ujhhgtgfeyxiexzf;
                c3678feyxiexzfUjhhgtg.f11695Ujhhgtgfeyxiexzf = "搜索群聊";
                String str2 = "群聊";
                ArrayList<GroupInfo> arrayListM5176Ujhhgtgfeyxiexzf = AbstractC3594Ujhhgtgfeyxiexzf.m5176Ujhhgtgfeyxiexzf();
                ArrayList arrayList = new ArrayList(AbstractC2851feyxiexzfUjhhgtg.m4190Ujhhgtgfeyxiexzf(arrayListM5176Ujhhgtgfeyxiexzf, 10));
                for (GroupInfo groupInfo : arrayListM5176Ujhhgtgfeyxiexzf) {
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
                    arrayList.add(new C3663feyxiexzfUjhhgtg(roomId, sb.toString(), groupInfo.getRoomId(), false));
                    str = null;
                }
                c3678feyxiexzfUjhhgtg.m5368Ujhhgtgfeyxiexzf(str2, arrayList);
                c3678feyxiexzfUjhhgtg.f11696Ujhhgtgfeyxiexzf = R.drawable.ic_contact_confirm_24dp;
                String str3 = "邀请";
                C0784feyxiexzfUjhhgtg c0784feyxiexzfUjhhgtg = new C0784feyxiexzfUjhhgtg(i2, conversationBean);
                c3678feyxiexzfUjhhgtg.f11699Ujhhgtgfeyxiexzf = str3;
                c3678feyxiexzfUjhhgtg.f11701Ujhhgtgfeyxiexzf = c0784feyxiexzfUjhhgtg;
                break;
            default:
                C0776feyxiexzfUjhhgtg c0776feyxiexzfUjhhgtg = new C0776feyxiexzfUjhhgtg(conversationBean, i2);
                C3126Ujhhgtgfeyxiexzf c3126Ujhhgtgfeyxiexzf = AbstractC3195feyxiexzfUjhhgtg.f9877Ujhhgtgfeyxiexzf;
                C3052Ujhhgtgfeyxiexzf.m4528Ujhhgtgfeyxiexzf(ExecutorC3114Ujhhgtgfeyxiexzf.f9679Ujhhgtgfeyxiexzf, new C3024feyxiexzfUjhhgtg(c0776feyxiexzfUjhhgtg, (InterfaceC3704Ujhhgtgfeyxiexzf) null));
                break;
        }
        return c1943Ujhhgtgfeyxiexzf;
    }
}
