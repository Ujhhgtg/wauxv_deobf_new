package p000;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.Set;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1501 implements InterfaceC1425 {

    public final /* synthetic */ int f5304;

    public final /* synthetic */ Object f5305;

    public final /* synthetic */ Object f5306;

    public final /* synthetic */ Object f5307;

    public /* synthetic */ C1501(Object obj, Object obj2, Object obj3, int i) {
        this.f5304 = i;
        this.f5305 = obj;
        this.f5306 = obj2;
        this.f5307 = obj3;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) {
        C1503 c1503;
        switch (this.f5304) {
            case 0:
                C1503 c1504 = (C1503) this.f5305;
                C1484 c1484 = (C1484) this.f5306;
                C0106 c0106 = (C0106) this.f5307;
                C0816 c0816 = (C0816) obj;
                String[] strArr = AbstractC1574.f5469;
                c0816.f3198 = "搜索好友/群聊/公众号";
                Set setM1390 = AbstractC0270.m1390(c1484.f5263);
                
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Cursor cursorM4041 = AbstractC2203.m4041(new EnumC0822[]{EnumC0822.f3214, EnumC0822.f3215, EnumC0822.f3216});
                if (cursorM4041 != null) {
                    while (cursorM4041.moveToNext()) {
                        try {
                            String string = cursorM4041.getString(cursorM4041.getColumnIndex("username"));
                            boolean z = (cursorM4041.getInt(cursorM4041.getColumnIndex("verifyFlag")) & 8) != 0;
                            if (string.endsWith("@chatroom")) {
                                GroupInfo groupInfoM2177 = AbstractC0743.m2177(cursorM4041);
                                String roomId = groupInfoM2177.getRoomId();
                                StringBuilder sb = new StringBuilder();
                                String name = groupInfoM2177.getName();
                                if (AbstractC2841.m4836(name)) {
                                    name = groupInfoM2177.getRoomId();
                                }
                                sb.append(name);
                                if (!AbstractC2841.m4836(groupInfoM2177.getRemark())) {
                                    sb.append('(' + groupInfoM2177.getRemark() + ')');
                                }
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append('(');
                                sb2.append(groupInfoM2177.getGroupData().getMemberCount());
                                sb2.append(')');
                                sb.append(sb2.toString());
                                C0801 c0801 = new C0801(roomId, sb.toString(), groupInfoM2177.getRoomId(), setM1390.contains(groupInfoM2177.getRoomId()));
                                arrayList.add(c0801);
                                arrayList3.add(c0801);
                            } else {
                                if (z) {
                                    FriendInfo friendInfoM2176 = AbstractC0743.m2176(cursorM4041);
                                    String wxid = friendInfoM2176.getWxid();
                                    StringBuilder sb3 = new StringBuilder();
                                    String nickname = friendInfoM2176.getNickname();
                                    if (AbstractC2841.m4836(nickname)) {
                                        nickname = friendInfoM2176.getWxid();
                                    }
                                    if (nickname.length() > 24) {
                                        nickname = AbstractC2841.m4847(24, nickname) + "...";
                                    }
                                    sb3.append(nickname);
                                    if (!AbstractC2841.m4836(friendInfoM2176.getRemark())) {
                                        sb3.append('(' + friendInfoM2176.getRemark() + ')');
                                    }
                                    C0801 c0802 = new C0801(wxid, sb3.toString(), friendInfoM2176.getWxid(), setM1390.contains(friendInfoM2176.getWxid()));
                                    arrayList.add(c0802);
                                    arrayList4.add(c0802);
                                } else {
                                    c1504 = c1504;
                                    FriendInfo friendInfoM2177 = AbstractC0743.m2176(cursorM4041);
                                    String wxid2 = friendInfoM2177.getWxid();
                                    StringBuilder sb4 = new StringBuilder();
                                    String nickname2 = friendInfoM2177.getNickname();
                                    if (AbstractC2841.m4836(nickname2)) {
                                        nickname2 = friendInfoM2177.getWxid();
                                    }
                                    if (nickname2.length() > 24) {
                                        nickname2 = AbstractC2841.m4847(24, nickname2) + "...";
                                    }
                                    sb4.append(nickname2);
                                    if (!AbstractC2841.m4836(friendInfoM2177.getRemark())) {
                                        sb4.append('(' + friendInfoM2177.getRemark() + ')');
                                    }
                                    C0801 c0803 = new C0801(wxid2, sb4.toString(), friendInfoM2177.getWxid(), setM1390.contains(friendInfoM2177.getWxid()));
                                    arrayList.add(c0803);
                                    arrayList2.add(c0803);
                                }
                                c1504 = c1504;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                AbstractC1458.m3154(cursorM4041, th);
                                throw th2;
                            }
                        }
                    }
                    c1503 = c1504;
                    cursorM4041.close();
                } else {
                    c1503 = c1504;
                }
                c0816.m2370(arrayList);
                c0816.m2367("好友", arrayList2);
                c0816.m2367("群聊", arrayList3);
                c0816.m2367("公众号", arrayList4);
                String str = "保存";
                C1502 c1502 = new C1502(c1503, c1484, c0106);
                c0816.f3202 = "保存";
                c0816.f3204 = c1502;
                break;
            case 1:
                Activity activity = (Activity) this.f5305;
                String str2 = (String) this.f5306;
                String str3 = (String) this.f5307;
                Intent intent = new Intent();
                String[] strArr2 = AbstractC1574.f5469;
                intent.setClassName(activity, "com.tencent.mm.chatroom.ui.SelectedMemberChattingRecordUI");
                intent.putExtra("title", "历史发言记录");
                intent.putExtra("RoomInfo_Id", str2);
                intent.putExtra("room_member", str3);
                activity.startActivity(intent);
                break;
            default:
                Activity activity2 = (Activity) this.f5305;
                ArrayList<String> arrayList5 = (ArrayList) this.f5306;
                String str4 = (String) this.f5307;
                Intent intent2 = new Intent();
                String[] strArr3 = AbstractC1574.f5469;
                intent2.setClassName(activity2, "com.tencent.mm.plugin.sns.ui.SnsUploadUI");
                intent2.putStringArrayListExtra("sns_kemdia_path_list", arrayList5);
                intent2.putExtra("Kdescription", str4);
                activity2.startActivity(intent2);
                break;
        }
        return Unit.INSTANCE;
    }
}
