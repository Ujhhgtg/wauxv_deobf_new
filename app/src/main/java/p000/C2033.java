package p000;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2033 implements InterfaceC1425 {

    public final /* synthetic */ int f6797;

    public final /* synthetic */ ArrayList f6798;

    public final /* synthetic */ ArrayList f6799;

    public /* synthetic */ C2033(ArrayList arrayList, ArrayList arrayList2, int i) {
        this.f6797 = i;
        this.f6798 = arrayList;
        this.f6799 = arrayList2;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        switch (this.f6797) {
            case 0:
                C2033 c2033 = new C2033(this.f6798, this.f6799, 1);
                C0815 c0815 = new C0815();
                C0816 c0816 = new C0816(c0815);
                c2033.invoke(c0816);
                c0815.f3181 = c0816;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                break;
            default:
                C0816 c0817 = (C0816) obj;
                String[] strArr = AbstractC1574.f5469;
                c0817.f3198 = "搜索好友/群聊";
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Cursor cursorM4041 = AbstractC2203.m4041(new EnumC0822[]{EnumC0822.f3214, EnumC0822.f3215});
                if (cursorM4041 != null) {
                    while (cursorM4041.moveToNext()) {
                        try {
                            if (cursorM4041.getString(cursorM4041.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM2177 = AbstractC0743.m2177(cursorM4041);
                                String roomId = groupInfoM2177.getRoomId();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(groupInfoM2177.getName());
                                String remark = groupInfoM2177.getRemark();
                                String str = remark.length() > 0 ? remark : null;
                                if (str != null) {
                                    sb2.append('(' + str + ')');
                                }
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append('(');
                                sb3.append(groupInfoM2177.getGroupData().getMemberCount());
                                sb3.append(')');
                                sb2.append(sb3.toString());
                                C0801 c0801 = new C0801(roomId, sb2.toString(), groupInfoM2177.getRoomId(), false);
                                arrayList3.add(c0801);
                                arrayList2.add(c0801);
                            } else {
                                FriendInfo friendInfoM2176 = AbstractC0743.m2176(cursorM4041);
                                String wxid = friendInfoM2176.getWxid();
                                StringBuilder sb4 = new StringBuilder();
                                String nickname = friendInfoM2176.getNickname();
                                if ((AbstractC2652.m4653(C2523.m4530(new C2523("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                                    sb4.append("已过滤此昵称...");
                                } else {
                                    String str2 = nickname.length() > 8 ? nickname : null;
                                    if (str2 != null) {
                                        String strSubstring = str2.substring(0, 8);
                                        "substring(...)";
                                        sb4.append(strSubstring);
                                        sb4.append("...");
                                        sb = sb4;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb4.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM2176.getRemark();
                                String str3 = remark2.length() > 0 ? remark2 : null;
                                if (str3 != null) {
                                    sb4.append('(' + str3 + ')');
                                }
                                C0801 c0802 = new C0801(wxid, sb4.toString(), friendInfoM2176.getWxid(), false);
                                arrayList3.add(c0802);
                                arrayList.add(c0802);
                            }
                            break;
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1458.m3154(cursorM4041, th);
                                throw th2;
                            }
                        }
                    }
                    cursorM4041.close();
                }
                c0817.m2370(arrayList3);
                c0817.m2367("好友", arrayList);
                c0817.m2367("群聊", arrayList2);
                c0817.f3199 = R.drawable.ic_contact_send_24dp;
                String str4 = "转发";
                C2111 c2111 = new C2111(2, this.f6798, this.f6799);
                c0817.f3202 = "转发";
                c0817.f3204 = c2111;
                break;
        }
        return Unit.INSTANCE;
    }
}
