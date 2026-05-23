package p000;

import android.database.Cursor;
import java.io.IOException;
import java.util.ArrayList;
import me.hd.wauxv.R;
import me.hd.wauxv.data.bean.info.FriendInfo;
import me.hd.wauxv.data.bean.info.GroupInfo;

/* JADX INFO: compiled from: obf */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2110 implements InterfaceC1425 {

    public final /* synthetic */ int f6952;

    public final /* synthetic */ String f6953;

    public final /* synthetic */ C1283 f6954;

    public /* synthetic */ C2110(String str, C1283 c1283, int i) {
        this.f6952 = i;
        this.f6953 = str;
        this.f6954 = c1283;
    }

    @Override // p000.InterfaceC1425
    public final Object invoke(Object obj) throws IOException {
        StringBuilder sb;
        StringBuilder sb2;
        switch (this.f6952) {
            case 0:
                C2110 c2110 = new C2110(this.f6953, this.f6954, 1);
                C0815 c0815 = new C0815();
                C0816 c0816 = new C0816(c0815);
                c2110.invoke(c0816);
                c0815.f3181 = c0816;
                c0815.m2362().mo3369(new C0466(c0815)).m3791();
                break;
            case 1:
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
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(groupInfoM2177.getName());
                                String remark = groupInfoM2177.getRemark();
                                String str = remark.length() > 0 ? remark : null;
                                if (str != null) {
                                    sb3.append('(' + str + ')');
                                }
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append('(');
                                sb4.append(groupInfoM2177.getGroupData().getMemberCount());
                                sb4.append(')');
                                sb3.append(sb4.toString());
                                C0801 c0801 = new C0801(roomId, sb3.toString(), groupInfoM2177.getRoomId(), false);
                                arrayList3.add(c0801);
                                arrayList2.add(c0801);
                            } else {
                                FriendInfo friendInfoM2176 = AbstractC0743.m2176(cursorM4041);
                                String wxid = friendInfoM2176.getWxid();
                                StringBuilder sb5 = new StringBuilder();
                                String nickname = friendInfoM2176.getNickname();
                                if ((AbstractC2652.m4653(C2523.m4530(new C2523("\r\n|\r|\n"), nickname)) > 3 ? nickname : null) != null) {
                                    sb5.append("已过滤此昵称...");
                                } else {
                                    String str2 = nickname.length() > 8 ? nickname : null;
                                    if (str2 != null) {
                                        String strSubstring = str2.substring(0, 8);
                                        "substring(...)";
                                        sb5.append(strSubstring);
                                        sb5.append("...");
                                        sb = sb5;
                                    } else {
                                        sb = null;
                                    }
                                    if (sb == null) {
                                        sb5.append(nickname);
                                    }
                                }
                                String remark2 = friendInfoM2176.getRemark();
                                String str3 = remark2.length() > 0 ? remark2 : null;
                                if (str3 != null) {
                                    sb5.append('(' + str3 + ')');
                                }
                                C0801 c0802 = new C0801(wxid, sb5.toString(), friendInfoM2176.getWxid(), false);
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
                C2111 c2111 = new C2111(0, this.f6953, this.f6954);
                c0817.f3202 = "转发";
                c0817.f3204 = c2111;
                break;
            case 2:
                C2110 c2112 = new C2110(this.f6953, this.f6954, 3);
                C0815 c0818 = new C0815();
                C0816 c0819 = new C0816(c0818);
                c2112.invoke(c0819);
                c0818.f3181 = c0819;
                c0818.m2362().mo3369(new C0466(c0818)).m3791();
                break;
            default:
                C0816 c08110 = (C0816) obj;
                String[] strArr2 = AbstractC1574.f5469;
                c08110.f3198 = "搜索好友/群聊";
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                Cursor cursorM4042 = AbstractC2203.m4041(new EnumC0822[]{EnumC0822.f3214, EnumC0822.f3215});
                if (cursorM4042 != null) {
                    while (cursorM4042.moveToNext()) {
                        try {
                            if (cursorM4042.getString(cursorM4042.getColumnIndex("username")).endsWith("@chatroom")) {
                                GroupInfo groupInfoM2178 = AbstractC0743.m2177(cursorM4042);
                                String roomId2 = groupInfoM2178.getRoomId();
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(groupInfoM2178.getName());
                                String remark3 = groupInfoM2178.getRemark();
                                String str5 = remark3.length() > 0 ? remark3 : null;
                                if (str5 != null) {
                                    sb6.append('(' + str5 + ')');
                                }
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append('(');
                                sb7.append(groupInfoM2178.getGroupData().getMemberCount());
                                sb7.append(')');
                                sb6.append(sb7.toString());
                                C0801 c0803 = new C0801(roomId2, sb6.toString(), groupInfoM2178.getRoomId(), false);
                                arrayList6.add(c0803);
                                arrayList5.add(c0803);
                            } else {
                                FriendInfo friendInfoM2177 = AbstractC0743.m2176(cursorM4042);
                                String wxid2 = friendInfoM2177.getWxid();
                                StringBuilder sb8 = new StringBuilder();
                                String nickname2 = friendInfoM2177.getNickname();
                                if ((AbstractC2652.m4653(C2523.m4530(new C2523("\r\n|\r|\n"), nickname2)) > 3 ? nickname2 : null) != null) {
                                    sb8.append("已过滤此昵称...");
                                } else {
                                    String str6 = nickname2.length() > 8 ? nickname2 : null;
                                    if (str6 != null) {
                                        String strSubstring2 = str6.substring(0, 8);
                                        "substring(...)";
                                        sb8.append(strSubstring2);
                                        sb8.append("...");
                                        sb2 = sb8;
                                    } else {
                                        sb2 = null;
                                    }
                                    if (sb2 == null) {
                                        sb8.append(nickname2);
                                    }
                                }
                                String remark4 = friendInfoM2177.getRemark();
                                String str7 = remark4.length() > 0 ? remark4 : null;
                                if (str7 != null) {
                                    sb8.append('(' + str7 + ')');
                                }
                                C0801 c0804 = new C0801(wxid2, sb8.toString(), friendInfoM2177.getWxid(), false);
                                arrayList6.add(c0804);
                                arrayList4.add(c0804);
                            }
                            break;
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                AbstractC1458.m3154(cursorM4042, th3);
                                throw th4;
                            }
                        }
                    }
                    cursorM4042.close();
                }
                c08110.m2370(arrayList6);
                c08110.m2367("好友", arrayList4);
                c08110.m2367("群聊", arrayList5);
                c08110.f3199 = R.drawable.ic_contact_send_24dp;
                String str8 = "转发";
                C2111 c2113 = new C2111(1, this.f6953, this.f6954);
                c08110.f3202 = "转发";
                c08110.f3204 = c2113;
                break;
        }
        return Unit.INSTANCE;
    }
}
